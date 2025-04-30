package com.bytedance.sdk.component.zp;

import android.webkit.WebView;
import com.bytedance.component.sdk.annotation.UiThread;
import com.bytedance.sdk.component.zp.jU;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class woN {
    static ot zp;
    private final List<rV> COT;
    private volatile boolean HWF;
    private final WebView KS;
    private final dT jU;
    private final zp lMd;

    public woN(dT dTVar) {
        ArrayList arrayList = new ArrayList();
        this.COT = arrayList;
        this.HWF = false;
        this.jU = dTVar;
        if (dTVar.ku && zp != null) {
            throw null;
        }
        if (dTVar.zp != null) {
            zp zpVar = dTVar.lMd;
            if (zpVar == null) {
                this.lMd = new RCv();
            } else {
                this.lMd = zpVar;
            }
        } else {
            this.lMd = dTVar.lMd;
        }
        this.lMd.zp(dTVar, (FP) null);
        this.KS = dTVar.zp;
        arrayList.add(dTVar.dT);
        ox.zp(dTVar.QR);
    }

    private void lMd() {
        if (this.HWF) {
            YW.zp(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public static dT zp(WebView webView) {
        return new dT(webView);
    }

    public woN zp(String str, COT<?, ?> cot) {
        return zp(str, (String) null, cot);
    }

    @UiThread
    public woN zp(String str, String str2, COT<?, ?> cot) {
        lMd();
        this.lMd.QR.zp(str, cot);
        return this;
    }

    public woN zp(String str, jU.lMd lmd) {
        return zp(str, (String) null, lmd);
    }

    @UiThread
    public woN zp(String str, String str2, jU.lMd lmd) {
        lMd();
        this.lMd.QR.zp(str, lmd);
        return this;
    }

    public void zp() {
        if (this.HWF) {
            return;
        }
        this.lMd.lMd();
        this.HWF = true;
        Iterator<rV> it = this.COT.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
