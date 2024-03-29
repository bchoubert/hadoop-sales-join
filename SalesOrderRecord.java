import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Writable;

// Stocke les ventes
public class SalesOrderRecord implements Writable {

	public IntWritable orderQty = new IntWritable();
	public DoubleWritable lineTotal = new DoubleWritable();              

	public SalesOrderRecord(){}              

	public SalesOrderRecord(int orderQty, double lineTotal) {
		this.orderQty.set(orderQty);
		this.lineTotal.set(lineTotal);
	}

	public void write(DataOutput out) throws IOException {
		this.orderQty.write(out);
		this.lineTotal.write(out);
	}

	public void readFields(DataInput in) throws IOException {
		this.orderQty.readFields(in);
		this.lineTotal.readFields(in);
	}

}
