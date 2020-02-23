package Model;

import lombok.Data;

import java.util.HashMap;

@Data
public class GCPDataLabel {
    private HashMap<String, String> dataLabel;

    public GCPDataLabel() {
        this.dataLabel = new HashMap<>();
        this.dataLabel.put("char", "GCP Char");
        this.dataLabel.put("varchar", "GCP varchar");
        this.dataLabel.put("int", "GCP Int");
        this.dataLabel.put("date", "GCP Date");
        this.dataLabel.put("bin", "GCP Bin");
    }
}
