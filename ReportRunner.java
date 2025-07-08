class ReportRunner{

public static void main(String[] re){

Report report = (totalSales)->{
 if (totalSales == 0) {
        return "No sales were recorded during this period.";
    }
    return "Total Sales: " + totalSales;
};

String summary = report.generateSummary(0);
System.out.println(summary);
}
}