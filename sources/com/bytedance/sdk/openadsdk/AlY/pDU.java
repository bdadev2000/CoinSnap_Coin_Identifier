package com.bytedance.sdk.openadsdk.AlY;

/* loaded from: classes.dex */
public class pDU {
    public static String Sg() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }

    public static String YFl() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }
}
