package com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl;

import android.content.Context;
import com.applovin.impl.mediation.ads.e;
import com.bytedance.sdk.component.vc.YFl.qsH;

/* loaded from: classes.dex */
public class AlY extends YFl {
    public AlY(Context context, com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl) {
        super(context, yFl);
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.YFl
    public byte AlY() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.YFl, com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.tN
    public String Sg() {
        com.bytedance.sdk.component.vc.YFl.YFl.wN AlY = qsH.DSW().AlY();
        if (AlY != null) {
            return AlY.YFl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.YFl
    public byte tN() {
        return (byte) 1;
    }

    public static String tN(String str) {
        return e.f("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
