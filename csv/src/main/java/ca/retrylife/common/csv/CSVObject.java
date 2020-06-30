package ca.retrylife.common.csv;

/**
 * An interface for all objects that can be exported in CSV format
 */
public interface CSVObject {

    /**
     * Get CSV file header for this object
     * 
     * @return Header
     */
    public String getHeader();

    /**
     * Get the object's data as a CSV row
     * 
     * @return CSV row
     */
    public StringBuilder getRow();
}