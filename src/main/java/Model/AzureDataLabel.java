package Model;

import lombok.Data;

import java.util.HashMap;

@Data
public class AzureDataLabel {
    private HashMap<String, String> dataLabel;

    public AzureDataLabel() {
        this.dataLabel = new HashMap<>();
        this.dataLabel.put("char", "Azure Char");
        this.dataLabel.put("varchar", "Azure varchar");
        this.dataLabel.put("int", "Azure Int");
        this.dataLabel.put("date", "Azure Date");
        this.dataLabel.put("bin", "Azure Bin");
    }
}
