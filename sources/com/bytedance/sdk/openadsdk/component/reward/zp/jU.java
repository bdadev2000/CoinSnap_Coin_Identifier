package com.bytedance.sdk.openadsdk.component.reward.zp;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.woN;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class jU {
    private final com.bytedance.sdk.openadsdk.component.reward.zp.zp COT;
    private final String KS;
    private boolean jU;
    private final woN lMd;
    com.com.bytedance.overseas.sdk.zp.KS zp;

    /* loaded from: classes.dex */
    public interface zp {
        void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, int i9, int i10, int i11);

        void zp(String str, JSONObject jSONObject);
    }

    public jU(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        this.COT = zpVar;
        this.lMd = zpVar.zp;
        this.KS = zpVar.QR;
    }

    private void jU() {
        if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS() && this.lMd.oKZ() == 4) {
            this.zp = com.com.bytedance.overseas.sdk.zp.jU.zp(this.COT.fgJ, this.lMd, this.KS);
        }
        if (this.zp == null) {
            this.zp = com.com.bytedance.overseas.sdk.zp.jU.zp(this.COT.oB, this.lMd, this.KS);
        }
    }

    public com.com.bytedance.overseas.sdk.zp.KS KS() {
        return this.zp;
    }

    public void lMd() {
        com.com.bytedance.overseas.sdk.zp.KS ks = this.zp;
        if (ks != null) {
            ks.jU();
        }
    }

    public void zp() {
        if (this.jU) {
            return;
        }
        this.jU = true;
        jU();
    }

    public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, int i9, int i10, int i11, zp zpVar) {
        if (this.zp != null) {
            int id = view.getId();
            if (id == com.bytedance.sdk.openadsdk.utils.vDp.COT) {
                zpVar.zp("click_play_star_level", null);
                return;
            }
            if (id == com.bytedance.sdk.openadsdk.utils.vDp.jU) {
                zpVar.zp("click_play_star_nums", null);
                return;
            } else if (id == com.bytedance.sdk.openadsdk.utils.vDp.KS) {
                zpVar.zp("click_play_source", null);
                return;
            } else {
                if (id == com.bytedance.sdk.openadsdk.utils.vDp.lMd) {
                    zpVar.zp("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        zpVar.zp(view, f9, f10, f11, f12, sparseArray, i9, i10, i11);
    }
}
