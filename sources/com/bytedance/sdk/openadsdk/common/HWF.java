package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.KVG;
import com.bytedance.sdk.openadsdk.core.model.rV;

/* loaded from: classes.dex */
public abstract class HWF {
    protected View COT;
    protected Context HWF;
    protected String KS;
    protected KVG QR;
    protected String[] jU;
    protected final rV lMd;

    public HWF(Context context, String str, String[] strArr, rV rVVar, KVG kvg) {
        this.KS = str;
        this.jU = strArr;
        this.HWF = context;
        this.lMd = rVVar;
        this.QR = kvg;
        zp();
    }

    public View COT() {
        return this.COT;
    }

    public abstract void KS();

    public void jU() {
        KS();
        this.COT = null;
        this.HWF = null;
    }

    public abstract void lMd();

    public abstract void zp();

    public abstract void zp(int i9);
}
