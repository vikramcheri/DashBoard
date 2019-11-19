package com.jocata.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class D3ChartController {

	
	@GetMapping(value = "/loadD3BarChart")
	public String loadD3BarChart() {
		return "d3_barchart";	
	}
	
	@GetMapping(value = "/loadD3GroupedBarChart")
	public String loadD3GroupedBarChart() {
		return "d3_groupedBar_chart";	
	}
	
	@GetMapping(value = "/loadD3PieChart")
	public String loadD3PieChart() {
		return "d3_piechart";	
	}
	
	@GetMapping(value = "/loadD3StackedBarChart")
	public String loadD3StackedBarChart() {
		return "d3_stacked_barchart";	
	}
	
	@GetMapping(value = "/loadD3DrillDownBarChart")
	public String loadD3DrillDownBarChart() {
		return "d3_drilldown_barchart";	
	}

}
