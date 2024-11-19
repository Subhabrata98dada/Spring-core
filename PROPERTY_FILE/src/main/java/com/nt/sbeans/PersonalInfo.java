package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pinfo")
public class PersonalInfo {
	@Value("${per.id}")
	private int id;
	@Value("${per.name}")
	private String name;
	@Value("${per.address}")
	private String address;
	
	@Value("subhabratap733@gmail.com")//hardcoded value
	private String mail;
	@Value("${os.name}")
	private String osNmae;
	@Value("${os.version}")
	private String osver;
	@Value("${Path}")
	private String path;
	@Override
	public String toString() {
		return "PersonalInfo [id=" + id + "\n, name=" + name + "\n, address=" + address + "\n, mail=" + mail + "\n, osNmae="
				+ osNmae + "\n, osver=" + osver + "\n, path=" + path + "]";
	}
	

}
