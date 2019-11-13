package com.jocata.dashboard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jocata.dashboard.vo.SampleVO2;

@RestController
public class D3GroupedBarChartController {
	
	@GetMapping(value = "/generateD3GroupedBarChart")
	public  List<SampleVO2> generateD3GroupedBarChart() {
		
		List<SampleVO2> barGraphList = new ArrayList<>();
		
		SampleVO2 vo1 = new SampleVO2();
		vo1.setGroup("Mars");
		vo1.setCount(20.2f);
		vo1.setMonths("Apr");
		barGraphList.add(vo1);
		
		SampleVO2 vo2 = new SampleVO2();
		vo2.setGroup("Jupiter");
		vo2.setCount(32.2f);
		vo2.setMonths("Apr");
		barGraphList.add(vo2);
		
		SampleVO2 vo3 = new SampleVO2();
		vo3.setGroup("Earth");
		vo3.setCount(42.2f);
		vo3.setMonths("Apr");
		barGraphList.add(vo3);
		
		SampleVO2 vo11 = new SampleVO2();
		vo11.setGroup("Mars");
		vo11.setCount(10.2f);
		vo11.setMonths("May");
		barGraphList.add(vo11);
		
		SampleVO2 vo12 = new SampleVO2();
		vo12.setGroup("Jupiter");
		vo12.setCount(45.2f);
		vo12.setMonths("May");
		barGraphList.add(vo12);
		
		SampleVO2 vo13 = new SampleVO2();
		vo13.setGroup("Earth");
		vo13.setCount(22.2f);
		vo13.setMonths("May");
		barGraphList.add(vo13);

		return barGraphList;
		
		
	}

}
