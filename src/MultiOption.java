import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by supriyag on 27/02/16.
 */
public class MultiOption {
    private Set<Object> objects;
    private String separator;

    public MultiOption(String separator) {
        this.separator = separator;
        this.objects = new LinkedHashSet<>();
    }


    public void add(int value) {
        objects.add(value);
    }

    @Override
    public String toString() {
        String summary="";
        String newSeparator = "";
        for (Object object : objects) {
            summary += newSeparator + object.toString();
            newSeparator = separator;
        }
        return summary;
    }
}
