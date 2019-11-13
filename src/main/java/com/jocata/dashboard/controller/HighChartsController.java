package com.jocata.dashboard.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HighChartsController {

	@GetMapping(value = "/generateHighchart")
	public String generateHighChart(Model model) {

		
	//	String place = "London";
		List<String> place=new ArrayList<>();
		place.add("London");
		model.addAttribute("list1",place);
		List<Float> temperature = new ArrayList<Float>();
		temperature.add((float) 3.9);
		temperature.add((float) 4.2);
		temperature.add((float) 5.7);
		temperature.add((float) 8.5);
		temperature.add((float) 11.9);
		temperature.add((float) 15.2);
		temperature.add((float) 17.0);
		temperature.add((float) 16.6);
		temperature.add((float) 14.2);
		temperature.add((float) 10.3);
		temperature.add((float) 6.6);
		temperature.add((float) 4.8);

		System.out.println("place temperature");
		model.addAttribute("list", temperature);

		return "highcharts_line_labels";

	}
	
}
