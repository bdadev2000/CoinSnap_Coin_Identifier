package com.bytedance.sdk.openadsdk.lMd;

/* loaded from: classes.dex */
public class ku extends jU {
    public static String KS() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public static String jU() {
        return "ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0";
    }
}
