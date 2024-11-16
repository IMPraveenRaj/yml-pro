package com.springheaven.yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public void readYmlData() throws IOException {
		Yaml yaml= new Yaml();
		
		InputStream resourceAsStream = this.getClass().getClassLoader().
				getResourceAsStream("sample.yml");
		Map<String,Object> map= yaml.load(resourceAsStream);
		Object object = yaml.load(resourceAsStream);
		Map<String,Object> map2= yaml.load(resourceAsStream);
		/* var map= yaml.load(resourceAsStream); */
		System.out.println(map);;
		
	}
	
	
	
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        new App().readYmlData();
    }
}
