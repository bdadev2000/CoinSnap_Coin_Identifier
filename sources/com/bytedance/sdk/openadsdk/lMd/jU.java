package com.bytedance.sdk.openadsdk.lMd;

/* loaded from: classes.dex */
public class jU {
    public static String lMd() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }

    public static String zp() {
        return "CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)";
    }
}
