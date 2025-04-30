package com.bytedance.sdk.component.COT.KS.zp.lMd;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.COT.vwr;

/* loaded from: classes.dex */
public class jU implements vwr {
    private final com.bytedance.sdk.component.COT.KS.zp.lMd lMd;
    private final vwr zp;

    public jU(vwr vwrVar) {
        this(vwrVar, null);
    }

    public jU(vwr vwrVar, com.bytedance.sdk.component.COT.KS.zp.lMd lmd) {
        this.zp = vwrVar;
        this.lMd = lmd;
    }

    @Override // com.bytedance.sdk.component.COT.zp
    public boolean lMd(String str) {
        return this.zp.lMd(str);
    }

    @Override // com.bytedance.sdk.component.COT.zp
    public boolean zp(String str, Bitmap bitmap) {
        return this.zp.zp(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.COT.zp
    public Bitmap zp(String str) {
        return this.zp.zp(str);
    }
}
