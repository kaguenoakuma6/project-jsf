/**
 * 
 */
package com.kuro.projectjsf.controllers;

import javax.faces.bean.ManagedBean;

/**
 * @author kuro
 * Clase que se mapeara al xhtml login
 */

@ManagedBean
public class LoginController 
{
	private String usuario;
	private String password;
	
	public void ingresar()
	{
		System.out.println("Usuario: " + usuario);
	}
	
	/**
	 * @return the usuario
	 */
	public String getUsuario()
	{
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	
	

}
