package com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl;

import android.content.Context;
import com.applovin.impl.mediation.ads.e;
import com.bytedance.sdk.component.vc.YFl.qsH;

/* loaded from: classes.dex */
public class vc extends DSW {
    public vc(Context context, com.bytedance.sdk.component.vc.YFl.AlY.Sg.YFl yFl) {
        super(context, yFl);
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.DSW, com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.tN
    public String Sg() {
        return qsH.DSW().AlY().wN();
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.DSW
    public byte YFl() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.YFl.YFl.YFl.DSW
    public byte tN() {
        return (byte) 3;
    }

    public static String YFl(String str) {
        return e.f("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }
}
