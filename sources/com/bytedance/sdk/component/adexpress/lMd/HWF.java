package com.bytedance.sdk.component.adexpress.lMd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.lMd.dT;

/* loaded from: classes.dex */
public class HWF implements dT {
    private tG KS;
    private zp lMd;
    private Context zp;

    public HWF(Context context, tG tGVar, zp zpVar) {
        this.zp = context;
        this.lMd = zpVar;
        this.KS = tGVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT
    public void zp() {
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT
    public boolean zp(final dT.zp zpVar) {
        this.KS.COT().HWF();
        this.lMd.zp(new QR() { // from class: com.bytedance.sdk.component.adexpress.lMd.HWF.1
            @Override // com.bytedance.sdk.component.adexpress.lMd.QR
            public void zp(View view, rV rVVar) {
                if (zpVar.KS()) {
                    return;
                }
                dQp lMd = zpVar.lMd();
                if (lMd != null) {
                    lMd.zp(HWF.this.lMd, rVVar);
                }
                zpVar.zp(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.lMd.QR
            public void zp(int i9, String str) {
                dQp lMd = zpVar.lMd();
                if (lMd != null) {
                    lMd.a_(i9);
                }
            }
        });
        return true;
    }

    public void zp(KS ks) {
        this.lMd.zp(ks);
    }
}
