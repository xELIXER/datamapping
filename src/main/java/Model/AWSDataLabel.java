package Model;

import lombok.Data;

import java.util.HashMap;

@Data
public class AWSDataLabel {
    private HashMap<String, String> dataLabel;

    public AWSDataLabel() {
        this.dataLabel = new HashMap<>();
        this.dataLabel.put("char", "AWS Char");
        this.dataLabel.put("varchar", "AWS varchar");
        this.dataLabel.put("int", "AWS Int");
        this.dataLabel.put("date", "AWS Date");
        this.dataLabel.put("bin", "AWS Bin");
    }

}

