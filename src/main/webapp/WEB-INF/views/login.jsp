<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
    </head>

    <body>
      <h1>Login</h1>
      <form name='f' action="login" method='POST'>
        <table>
          <tr>
            <td>User:</td>
            <td><input type='text' name='username' value=''></td>
          </tr>
          <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
          </tr>
          <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
          </tr>
        </table>
      </form>
    </body>

    </html>