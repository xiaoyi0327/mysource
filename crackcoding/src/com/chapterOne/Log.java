package com.chapterOne;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
public void info(String str){
	DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
	Date date = new Date();
	System.out.println("["+date.toString()+"]-INFO:"+str);
}

public void warn(String str){
	Date date = new Date();
	System.out.println(date.toString()+"WARN:"+str);
}

public void error(String str){
	Date date = new Date();
	System.out.println(date.toString()+"ERROR:"+str);
}
}
