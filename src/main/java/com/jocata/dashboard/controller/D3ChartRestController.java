package com.jocata.dashboard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jocata.dashboard.vo.DrillDownBarChartDataVO;
import com.jocata.dashboard.vo.PieChartDataVO;
import com.jocata.dashboard.vo.SampleVO;
import com.jocata.dashboard.vo.StackedBarChartDataVO;

@RestController
public class D3ChartRestController {
	
	@GetMapping(value = "/generateD3BarChart")
	public  List generateD3BarChart() {
		
		List<SampleVO> barGraphList = new ArrayList<>();
		SampleVO vo1 = new SampleVO();
		vo1.setColor("#000000");
		vo1.setLanguage("Rust");
		vo1.setValue(78.9f);
		barGraphList.add(vo1);
		
		SampleVO vo2 = new SampleVO();
		vo2.setColor("#00a2ee");
		vo2.setLanguage("Kotlin");
		vo2.setValue(75.1f);
		barGraphList.add(vo2);
		
		SampleVO vo3 = new SampleVO();
		vo3.setColor("#fbcb39");
		vo3.setLanguage("Python");
		vo3.setValue(68.0f);
		barGraphList.add(vo3);
		
		SampleVO vo4 = new SampleVO();
		vo4.setColor("#007bc8");
		vo4.setLanguage("TypeScript");
		vo4.setValue(67f);
		barGraphList.add(vo4);
		
		SampleVO vo5 = new SampleVO();
		vo5.setColor("#65cedb");
		vo5.setLanguage("Go");
		vo5.setValue(89f);
		barGraphList.add(vo5);
		

		return barGraphList;
		
		
	}

	
	@GetMapping(value = "/generateD3PieChart")
	public List<PieChartDataVO> generateD3PieChart() {
		List<PieChartDataVO> pieChartList = new ArrayList<>();
		PieChartDataVO pieChartDataVO1=new PieChartDataVO();
		pieChartDataVO1.setLabel("one");
		pieChartDataVO1.setValue(20);
		pieChartList.add(pieChartDataVO1);
		
		PieChartDataVO pieChartDataVO2=new PieChartDataVO();
		pieChartDataVO2.setLabel("two");
		pieChartDataVO2.setValue(50);
		pieChartList.add(pieChartDataVO2);
		
		PieChartDataVO pieChartDataVO3=new PieChartDataVO();
		pieChartDataVO3.setLabel("three");
		pieChartDataVO3.setValue(30);
		pieChartList.add(pieChartDataVO3);
		
		return pieChartList;
		
	}
	
	
	  @GetMapping(value = "/generateD3StackedBarChart") 
	public List<StackedBarChartDataVO> generateD3StackedBarChart() {
		List<StackedBarChartDataVO> stackedBarChartList = new ArrayList<>();
		
		StackedBarChartDataVO stackedBarChartDataVO1 = new StackedBarChartDataVO();
		stackedBarChartDataVO1.setYear("2006");
		stackedBarChartDataVO1.setRedDelicious("10");
		stackedBarChartDataVO1.setMcintosh("15");
		stackedBarChartDataVO1.setOranges("9");
		stackedBarChartDataVO1.setPears("6");
		stackedBarChartList.add(stackedBarChartDataVO1);
		
		StackedBarChartDataVO stackedBarChartDataVO2 = new StackedBarChartDataVO();
		stackedBarChartDataVO2.setYear("2007");
		stackedBarChartDataVO2.setRedDelicious("5");
		stackedBarChartDataVO2.setMcintosh("20");
		stackedBarChartDataVO2.setOranges("7");
		stackedBarChartDataVO2.setPears("3");
		stackedBarChartList.add(stackedBarChartDataVO2);
		
		StackedBarChartDataVO stackedBarChartDataVO3 = new StackedBarChartDataVO();
		stackedBarChartDataVO3.setYear("2008");
		stackedBarChartDataVO3.setRedDelicious("1");
		stackedBarChartDataVO3.setMcintosh("15");
		stackedBarChartDataVO3.setOranges("5");
		stackedBarChartDataVO3.setPears("6");
		stackedBarChartList.add(stackedBarChartDataVO3);
		
		StackedBarChartDataVO stackedBarChartDataVO4 = new StackedBarChartDataVO();
		stackedBarChartDataVO4.setYear("2009");
		stackedBarChartDataVO4.setRedDelicious("12");
		stackedBarChartDataVO4.setMcintosh("18");
		stackedBarChartDataVO4.setOranges("9");
		stackedBarChartDataVO4.setPears("4");
		stackedBarChartList.add(stackedBarChartDataVO4);
		
		return stackedBarChartList;
			
	}
	  
	  @GetMapping(value = "/generateD3DrillDownBarChart") 
		public List<DrillDownBarChartDataVO> generateD3DrillDownBarChart() {  
		  List<DrillDownBarChartDataVO> drillDownChartList=new ArrayList<>();
		  
		  DrillDownBarChartDataVO drillDownBarChartDataVO1=new DrillDownBarChartDataVO();
		  drillDownBarChartDataVO1.setCountry("USA");
		  drillDownBarChartDataVO1.setModel("Model1");
		  drillDownBarChartDataVO1.setTotal(487);
		  drillDownChartList.add(drillDownBarChartDataVO1);
		  
		  DrillDownBarChartDataVO drillDownBarChartDataVO2=new DrillDownBarChartDataVO();
		  drillDownBarChartDataVO2.setCountry("USA");
		  drillDownBarChartDataVO2.setModel("Model2");
		  drillDownBarChartDataVO2.setTotal(185);
		  drillDownChartList.add(drillDownBarChartDataVO2);
		  
		  DrillDownBarChartDataVO drillDownBarChartDataVO3=new DrillDownBarChartDataVO();
		  drillDownBarChartDataVO3.setCountry("USA");
		  drillDownBarChartDataVO3.setModel("Model3");
		  drillDownBarChartDataVO3.setTotal(140);
		  drillDownChartList.add(drillDownBarChartDataVO3);
		  
		  DrillDownBarChartDataVO drillDownBarChartDataVO4=new DrillDownBarChartDataVO();
		  drillDownBarChartDataVO4.setCountry("USA");
		  drillDownBarChartDataVO4.setModel("Model4");
		  drillDownBarChartDataVO4.setTotal(108);
		  drillDownChartList.add(drillDownBarChartDataVO4);
		  
		  DrillDownBarChartDataVO drillDownBarChartDataVO5=new DrillDownBarChartDataVO();
		  drillDownBarChartDataVO5.setCountry("INDIA");
		  drillDownBarChartDataVO5.setModel("Model1");
		  drillDownBarChartDataVO5.setTotal(411);
		  drillDownChartList.add(drillDownBarChartDataVO5);
		  
		  DrillDownBarChartDataVO drillDownBarChartDataVO6=new DrillDownBarChartDataVO();
		  drillDownBarChartDataVO6.setCountry("INDIA");
		  drillDownBarChartDataVO6.setModel("Model2");
		  drillDownBarChartDataVO6.setTotal(41);
		  drillDownChartList.add(drillDownBarChartDataVO6);
		  
		  DrillDownBarChartDataVO drillDownBarChartDataVO7=new DrillDownBarChartDataVO();
		  drillDownBarChartDataVO7.setCountry("INDIA");
		  drillDownBarChartDataVO7.setModel("Model3");
		  drillDownBarChartDataVO7.setTotal(33);
		  drillDownChartList.add(drillDownBarChartDataVO7);
		  
		  DrillDownBarChartDataVO drillDownBarChartDataVO8=new DrillDownBarChartDataVO();
		  drillDownBarChartDataVO8.setCountry("CANADA");
		  drillDownBarChartDataVO8.setModel("Model1");
		  drillDownBarChartDataVO8.setTotal(300);
		  drillDownChartList.add(drillDownBarChartDataVO8);
		  
		  DrillDownBarChartDataVO drillDownBarChartDataVO9=new DrillDownBarChartDataVO();
		  drillDownBarChartDataVO9.setCountry("CANADA");
		  drillDownBarChartDataVO9.setModel("Model2");
		  drillDownBarChartDataVO9.setTotal(232);
		  drillDownChartList.add(drillDownBarChartDataVO9);
		  
		  DrillDownBarChartDataVO drillDownBarChartDataVO10=new DrillDownBarChartDataVO();
		  drillDownBarChartDataVO10.setCountry("CANADA");
		  drillDownBarChartDataVO10.setModel("Model3");
		  drillDownBarChartDataVO10.setTotal(1113);
		  drillDownChartList.add(drillDownBarChartDataVO10);
		  
		  return drillDownChartList;	  
		  
	  }
}
