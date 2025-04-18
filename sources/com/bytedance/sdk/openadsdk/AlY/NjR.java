package com.bytedance.sdk.openadsdk.AlY;

/* loaded from: classes.dex */
public class NjR extends AlY {
    public static String AlY() {
        return "ALTER TABLE loghighpriority ADD COLUMN encrypt INTEGER default 0";
    }

    public static String tN() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
