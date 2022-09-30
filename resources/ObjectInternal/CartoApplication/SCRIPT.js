// CartoApplication front side hook
(function(ui) {
	if (!ui) return;
	var app = ui.getAjax();
	// Hook called by each object instance
	Simplicite.UI.hooks.CartoApplication = function(o, cbk) {
		try {
			console.log("CartoApplication hooks loading...");
			var p = o.locals.ui;
			if (p && o.isMainInstance()) {
				p.form.onload = function(ctn, obj) {
					
					
					var c = obj.getFieldValue("cartoAppCiatConf");
					var i = obj.getFieldValue("cartoAppCiatIntegrity");
					var a = obj.getFieldValue("cartoAppCiatAvailability");
					var t = obj.getFieldValue("cartoAppTraceability");
					
					var options = {
                        type: 'radar',
                        data: {
                            labels: ["Confidentiality", "Integrity", "Availability", "Traceability"],
                            datasets: [{
                                data: [c,i,a,t],
                                label: 'CIAT',
                                backgroundColor: 'rgba(0, 0, 255, 0.5)'
                            }]
                        },
                        options: {
                            scale: {
                                ticks: {
                                    beginAtZero: true,
                                    max: 4,
                                    stepSize: 1
                                }
                            }
                        }
                    }
					$ui.loadCharts(function() {
                    	$("[data-content=ciatChart]").after('<div id="chart-container"></div>');
						$ui.charts.chart($("#chart-container"), options);
                      // $ui.charts.chart($("#radar-chart"), options);
                    });
				};
			}
			//...
		} catch (e) {
			app.error("Error in Simplicite.UI.hooks.CartoApplication: " + e.message);
		} finally {
			console.log("CartoApplication hooks loaded.");
			cbk && cbk(); // final callback
		}
	};
})(window.$ui);
