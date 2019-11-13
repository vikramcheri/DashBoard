package com.jocata.dashboard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jocata.dashboard.vo.PieChartDataVO;
import com.jocata.dashboard.vo.SampleVO;
import com.jocata.dashboard.vo.StackedBarChartDataVO;

@RestController
public class D3ChartController {
	
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
}
