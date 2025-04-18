package com.bytedance.sdk.openadsdk.rkt.tN;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class YFl {
    private final SharedPreferences YFl;

    public YFl(Context context) {
        this.YFl = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long YFl() {
        return this.YFl.getLong("last_upload_time", 0L);
    }

    public void YFl(long j3) {
        SharedPreferences.Editor edit = this.YFl.edit();
        edit.putLong("last_upload_time", j3);
        edit.apply();
    }
}
