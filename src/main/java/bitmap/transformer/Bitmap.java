package bitmap.transformer;

import javax.xml.xpath.XPath;

public class Bitmap {
    //instance variable
    // input-file-path output-file-path transform-name
    String inputFilePath;
    String outputFilePath;
    String transformName;

    public Bitmap(String inputFilePath, String outputFilePath, String transformName){
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
        this.transformName = transformName;
    }

    public void setInputFilePath(String newInputFilePath){
        this.inputFilePath = newInputFilePath;
    }

    public void setOutputFilePath(String newOutputFilePath){
        this.outputFilePath = newOutputFilePath;
    }

    public void setTransformName(String newTransformName){
        this.transformName = newTransformName;
    }


}
