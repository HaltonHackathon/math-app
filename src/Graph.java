import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph extends ApplicationFrame
{
	private double startPoint = 10;
	private double hor = 20;
	private double ver = 0;
	private double rate = 0.25;

	public Graph( String applicationTitle , String chartTitle )
	{
		super(applicationTitle);
		startPoint = 10;
		hor = 20;
		ver = 0;
		rate = 0.25;
		JFreeChart lineChart = ChartFactory.createLineChart(
				chartTitle,
				"Years","Number of Bunnies",
				createDataset(),
				PlotOrientation.VERTICAL,
				true,true,false);

		ChartPanel chartPanel = new ChartPanel( lineChart );
		chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
		setContentPane( chartPanel );
	}
	
	public Graph( String applicationTitle , String chartTitle, double start, double horizontal, double vertical, double growth )
	{
		super(applicationTitle);
		startPoint = start;
		hor = horizontal;
		ver = vertical;
		rate = growth;
		JFreeChart lineChart = ChartFactory.createLineChart(
				chartTitle,
				"Years","Number of Bunnies",
				createDataset(),
				PlotOrientation.VERTICAL,
				true,true,false);

		ChartPanel chartPanel = new ChartPanel( lineChart );
		chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
		setContentPane( chartPanel );
	}

	private DefaultCategoryDataset createDataset( )
	{
		DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
		for(int i = (int) (0+hor); i < 20+hor; i++)
			dataset.addValue( startPoint*Math.pow(1+rate,i-hor)+ver, "bunnies", Integer.toString(i));
		return dataset;
	}
	public static void main( String[ ] args ) 
	{
		Graph chart = new Graph(
				"Bunnies Vs Years" ,
				"Numer of Bunnies vs Years",
				60,
				0,
				0,
				0.46);

		chart.pack( );
		RefineryUtilities.centerFrameOnScreen( chart );
		chart.setVisible( true );
		
		Graph chart2 = new Graph(
				"Bunnies Vs Years" ,
				"Numer of Bunnies vs Years"
				);

		chart2.pack( );
		RefineryUtilities.centerFrameOnScreen( chart );
		chart2.setVisible( true );
	}
}