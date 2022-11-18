var CartoPublication = (function() {
	function render(params, appData) {
		$('#cartopublication').html(Mustache.render($('#carto-template').html(), appData));
		var config = {
            type: 'radar',
            data: {
                labels: ["Confidentiality", "Integrity", "Availability", "Traceability"],
                datasets: [{
                    data: [appData.c,appData.i,appData.a,appData.t],
                    label: 'CIAT',
                    backgroundColor: 'rgba(0, 0, 255, 0.5)'
                }]
            },
            options : {
                scale: {
                    ticks: {
                        beginAtZero: true,
                        max: 4,
                        stepSize: 1
                    }
                },
                animation:{
                	//call done function when graph is loaded
                	onComplete:done
                }
            }
        }
		var chartBase64;
		$ui.loadCharts(function() {
        	$("#chart").after('<div id="chart-container"></div>');
			var chartItem = $ui.charts.chart($("#chart-container"), config);
        });
        
        
    	function done(e){
    		//get image of chart
			chartBase64 = e.chart.toBase64Image();
			$("#publish").click(function(){
	        	var grant = $ui.getAjax().getGrant();
	        	var obj = grant.getTmpObject("CartoApplication");
	        	obj.setParameter(function(){
	        		$ui.displayPrint(null, "Report", obj, appData.row_id, null);
	        	}, "CHART", chartBase64);
	        });
		}
	}
	


	return { render: render };
})();
