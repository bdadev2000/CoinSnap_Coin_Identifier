package com.bytedance.sdk.openadsdk.lMd;

/* loaded from: classes.dex */
public class tG {
    public static String lMd() {
        return "ALTER TABLE logstats ADD COLUMN encrypt INTEGER default 0";
    }

    public static String zp() {
        return "CREATE TABLE IF NOT EXISTS logstats (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , encrypt INTEGER default 0 , retry INTEGER default 0)";
    }
}
