package com.bytedance.sdk.openadsdk.AlY;

/* loaded from: classes.dex */
public class GA {
    public static String Sg() {
        return "ALTER TABLE logstatsbatch ADD COLUMN encrypt INTEGER default 0";
    }

    public static String YFl() {
        return "CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
