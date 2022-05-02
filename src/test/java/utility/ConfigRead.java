package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigRead {
	
	public Properties properties;
	
	public ConfigRead() {
		File src=new File("./config.properties");
	
	try {
			FileInputStream fis=new FileInputStream(src);
			properties=new Properties();
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String getURL() {
		String url=properties.getProperty("url");
		return url;
	}
	public String driverPath() {
		String path=properties.getProperty("driverpath");
		return path;
	}
	
	public String author() {
		String author=properties.getProperty("author");
		return author;
	}
	
	public String logName() {
		String logname=properties.getProperty("logname");
		return logname;
	}
	
	public String reportName() {
		String reportname=properties.getProperty("reportname");
		return reportname;
	}
	
	public String getReportConfigPath(){
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath!= null)
			return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}
