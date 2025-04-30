package com.bytedance.sdk.openadsdk.core.lMd;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public abstract class QR extends KS {
    private KS KS;
    private final com.bytedance.sdk.openadsdk.core.QR.zp lMd;
    private final String zp;

    public QR(String str, com.bytedance.sdk.openadsdk.core.QR.zp zpVar) {
        this(str, zpVar, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lMd.KS, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public void zp(KS ks) {
        this.KS = ks;
    }

    public QR(String str, com.bytedance.sdk.openadsdk.core.QR.zp zpVar, KS ks) {
        this.zp = str;
        this.lMd = zpVar;
        this.KS = ks;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lMd.KS
    public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
        com.bytedance.sdk.openadsdk.core.QR.zp zpVar = this.lMd;
        if (zpVar != null) {
            zpVar.COT(this.zp);
        }
        if (view != null) {
            if (view.getId() == vDp.KS) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == vDp.QR) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.zp);
            }
        }
        KS ks = this.KS;
        if (ks != null) {
            ks.ox = this.ox;
            ks.RCv = this.RCv;
            ks.Lij = this.Lij;
            int i9 = this.Lij;
            ks.Gzh = i9;
            ks.irS = i9;
            ks.zp(view, f9, f10, f11, f12, sparseArray, z8);
        }
    }
}
