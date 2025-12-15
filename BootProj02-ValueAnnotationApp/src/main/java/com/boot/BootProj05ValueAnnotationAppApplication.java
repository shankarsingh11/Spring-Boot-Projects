package com.boot;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.comp.BillGenerator;
import com.boot.comp.ItemsInfo;

@SpringBootApplication
public class BootProj05ValueAnnotationAppApplication {

	public static void main(String[] args) throws IOException {
		
		ConfigurableApplicationContext context = SpringApplication.run(BootProj05ValueAnnotationAppApplication.class, args);
		
		System.out.println(context);
		
		ItemsInfo iteminfo = context.getBean(ItemsInfo.class);
		System.out.println(iteminfo);
		
		System.out.println();
		
		System.in.read();
		
		BillGenerator billGen = context.getBean(BillGenerator.class);
		System.out.println(billGen);
		
		
		
		
		
		
		
		
		
		
	}

}
