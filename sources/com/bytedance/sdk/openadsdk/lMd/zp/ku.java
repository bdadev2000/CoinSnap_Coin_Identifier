package com.bytedance.sdk.openadsdk.lMd.zp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public class ku implements com.bytedance.sdk.component.HWF.zp.zp.COT {
    public static final ku zp = new ku();
    private volatile SQLiteDatabase lMd;

    @Override // com.bytedance.sdk.component.HWF.zp.zp.COT
    public String COT() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.COT
    public String HWF() {
        return null;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.COT
    public String KS() {
        return null;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.COT
    public String jU() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.COT
    public String lMd() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.COT
    public SQLiteDatabase zp(Context context) {
        if (this.lMd == null) {
            synchronized (this) {
                try {
                    if (this.lMd == null) {
                        this.lMd = com.bytedance.sdk.openadsdk.core.COT.zp(context).zp().zp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.COT
    public String zp() {
        return "loghighpriority";
    }
}
