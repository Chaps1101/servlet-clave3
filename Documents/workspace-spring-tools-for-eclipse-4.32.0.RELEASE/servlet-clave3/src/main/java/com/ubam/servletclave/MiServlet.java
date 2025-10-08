package com.ubam.servletclave;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MiServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.setCharacterEncoding("UTF-8");

    String nombre = req.getParameter("nombre");
    String apellido = req.getParameter("apellido");
    String anio = req.getParameter("anio");
    String mes = req.getParameter("mes");
    String dia = req.getParameter("dia");

    if (nombre == null || apellido == null || anio == null || mes == null || dia == null) {
      resp.setContentType("text/html;charset=UTF-8");
      resp.getWriter().write("""
    		    <html><head><meta charset='UTF-8'><title>Generar clave</title></head>
    		    <body style="font-family:sans-serif; background:#f0f4ff; text-align:center;">
    		      <img src="/logo_ubam.png" alt="UBAM" style="margin-top:20px; width:120px;"><br>
    		      <h2 style="color:#003366;">Universidad UBAM</h2>
    		      <h3>Formulario</h3>
    		      <form method="get" action="/generar" style="background:white; display:inline-block; padding:20px; border-radius:10px; box-shadow:0 0 10px #ccc;">
    		        <label>Nombre: <input name="nombre" required></label><br><br>
    		        <label>Apellido: <input name="apellido" required></label><br><br>
    		        <label>Año: <input name="anio" type="number" required></label><br><br>
    		        <label>Mes: <input name="mes" type="number" required></label><br><br>
    		        <label>Día: <input name="dia" type="number" required></label><br><br>
    		        <button type="submit" style="background:#003366; color:white; border:none; padding:8px 15px; border-radius:5px;">Generar</button>
    		      </form>
    		    </body></html>
    		  """);
      return;
    }

    String dosNombre = nombre.substring(0, Math.min(2, nombre.length()));
    String unaApellido = apellido.substring(0, 1);
    String yy = anio.substring(anio.length() - 2);
    String mm = String.format("%02d", Integer.parseInt(mes));
    String dd = String.format("%02d", Integer.parseInt(dia));

    String clave = dosNombre + unaApellido + yy + mm + dd;
    resp.setContentType("text/plain;charset=UTF-8");
    resp.getWriter().println(clave);
  }
}
