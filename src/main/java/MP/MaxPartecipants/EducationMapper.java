package MP.MaxPartecipants;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EducationMapper extends org.apache.hadoop.mapreduce.Mapper<LongWritable, Text, Text, IntWritable> {

    boolean check = true;
    String regex = "[0-9]+";
    Pattern p = Pattern.compile(regex);

    public void map (LongWritable longWritable, Text value, Context context) throws IOException, InterruptedException {

        String[] row = value.toString().split(";");

        if (check) {
            check = false;
            return;
        }

        if (row.length!=24) return;
        Matcher m = p.matcher(row[23]);
        if (!m.matches()) return;
        if (row[6].equals("? Unknown ?")) return;

        context.write(new Text(row[6]), new IntWritable(Integer.parseInt(row[23])));
    }
}
