package com.bytedance.sdk.openadsdk.AlY;

/* loaded from: classes.dex */
public class rkt extends AlY {
    public static String tN() {
        return "CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0, channel INTEGER default 0)";
    }
}
