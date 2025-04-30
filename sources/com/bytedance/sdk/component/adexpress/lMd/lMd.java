package com.bytedance.sdk.component.adexpress.lMd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.lMd.dT;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* loaded from: classes.dex */
public class lMd implements dT {
    private tG COT;
    private int HWF;
    private ThemeStatusBroadcastReceiver KS;
    private ku jU;
    private com.bytedance.sdk.component.adexpress.dynamic.zp.zp lMd;
    private Context zp;

    public lMd(Context context, tG tGVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z8, com.bytedance.sdk.component.adexpress.dynamic.jU.ku kuVar, ku kuVar2, com.bytedance.sdk.component.adexpress.dynamic.COT.zp zpVar, com.bytedance.sdk.component.adexpress.dynamic.zp.zp zpVar2) {
        this.zp = context;
        this.COT = tGVar;
        this.KS = themeStatusBroadcastReceiver;
        this.jU = kuVar2;
        if (zpVar2 != null) {
            this.lMd = zpVar2;
        } else {
            this.lMd = new com.bytedance.sdk.component.adexpress.dynamic.zp.zp(context, themeStatusBroadcastReceiver, z8, kuVar, tGVar, zpVar);
        }
        this.lMd.zp(this.jU);
        if (kuVar instanceof com.bytedance.sdk.component.adexpress.dynamic.jU.QR) {
            this.HWF = 3;
        } else {
            this.HWF = 2;
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.jU lMd() {
        com.bytedance.sdk.component.adexpress.dynamic.zp.zp zpVar = this.lMd;
        if (zpVar != null) {
            return zpVar.jU();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT
    public boolean zp(final dT.zp zpVar) {
        this.COT.COT().zp(this.HWF);
        this.lMd.zp(new QR() { // from class: com.bytedance.sdk.component.adexpress.lMd.lMd.1
            @Override // com.bytedance.sdk.component.adexpress.lMd.QR
            public void zp(View view, rV rVVar) {
                if (zpVar.KS()) {
                    return;
                }
                lMd.this.COT.COT().COT(lMd.this.HWF);
                lMd.this.COT.COT().HWF(lMd.this.HWF);
                lMd.this.COT.COT().dT();
                dQp lMd = zpVar.lMd();
                if (lMd == null) {
                    return;
                }
                lMd.zp(lMd.this.lMd, rVVar);
                zpVar.zp(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.lMd.QR
            public void zp(int i9, String str) {
                lMd.this.COT.COT().zp(lMd.this.HWF, i9, str, zpVar.lMd(lMd.this));
                if (zpVar.lMd(lMd.this)) {
                    zpVar.zp(lMd.this);
                    return;
                }
                dQp lMd = zpVar.lMd();
                if (lMd == null) {
                    return;
                }
                lMd.a_(i9);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.lMd.dT
    public void zp() {
        com.bytedance.sdk.component.adexpress.dynamic.zp.zp zpVar = this.lMd;
        if (zpVar != null) {
            zpVar.lMd();
        }
    }
}
