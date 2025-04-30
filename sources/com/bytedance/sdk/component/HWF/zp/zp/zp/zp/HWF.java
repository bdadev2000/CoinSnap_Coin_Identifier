package com.bytedance.sdk.component.HWF.zp.zp.zp.zp;

import android.content.Context;
import com.bytedance.sdk.component.HWF.zp.ku;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class HWF extends QR {
    public HWF(Context context, com.bytedance.sdk.component.HWF.zp.jU.lMd.zp zpVar) {
        super(context, zpVar);
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.zp.zp.QR
    public byte KS() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.zp.zp.QR, com.bytedance.sdk.component.HWF.zp.zp.zp.zp.KS
    public String lMd() {
        return ku.QR().jU().COT();
    }

    @Override // com.bytedance.sdk.component.HWF.zp.zp.zp.zp.QR
    public byte zp() {
        return (byte) 1;
    }

    public static String zp(String str) {
        return AbstractC2914a.e("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
