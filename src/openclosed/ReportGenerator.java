package openclosed;

import java.util.List;

public class ReportGenerator {

	public void generateReport(ReportGenerators reportType, List<String> data) {
		if (data.size() > 0) reportType.generateReport(data);	//El proceso solo ocurrirá si se envía información a generar.
	}

interface ReportGenerators {	//Interface encargada de abstraer la lógica de generación de reportes.
	public void generateReport(List<String> data);
}

class ReportGeneratorPdf implements ReportGenerators{
	@Override
	public void generateReport(List<String> data) {	//Lógica específica para pdf
        // Lógica para generar un reporte en PDF
        System.out.println("Generating PDF report...");
	}
}

class ReportGeneratorCsv implements ReportGenerators{
	@Override
	public void generateReport(List<String> data) {//Lógica específica para csv
        // Lógica para generar un reporte en CSV
        System.out.println("Generating CSV report...");
	}
}

class ReportGeneratorHtml implements ReportGenerators{
	@Override
	public void generateReport(List<String> data) { //Lógica específica para html
        // Lógica para generar un reporte en HTML
        System.out.println("Generating HTML report...");
	}
}
}