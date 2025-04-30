package com.bytedance.sdk.component.HWF.zp.zp.zp.zp;

import android.content.Context;
import com.bytedance.sdk.component.HWF.zp.ku;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class jU extends zp {
    public jU(Context context, com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
        super(context, zpVar);
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.zp.zp.zp
    public byte KS() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.zp.zp.zp
    public byte jU() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.zp.zp.zp, com.bytedance.sdk.component.HWF.zp.zp.zp.zp.KS
    public String lMd() {
        com.bytedance.sdk.component.HWF.zp.zp.COT jU = ku.QR().jU();
        if (jU != null) {
            return jU.zp();
        }
        return null;
    }

    public static String KS(String str) {
        return AbstractC2914a.e("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
