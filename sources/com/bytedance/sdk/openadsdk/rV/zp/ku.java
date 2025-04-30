package com.bytedance.sdk.openadsdk.rV.zp;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.woN;

/* loaded from: classes.dex */
public class ku extends lMd {
    private int jU;

    public ku(Integer num, View view, woN won, int i9) {
        super(num, view, won, 2000, i9);
        this.jU = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.rV.zp.lMd
    public int HWF() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.rV.zp.lMd
    public boolean KS() {
        if (HWF.zp(this.zp.get(), this.lMd.WJ()) && this.jU == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.rV.zp.lMd
    public void jU() {
        super.jU();
    }

    @Override // com.bytedance.sdk.openadsdk.rV.zp.lMd
    public void lMd(int i9) {
        if (YW()) {
            return;
        }
        if (i9 == 6 || i9 == 5) {
            this.jU = 0;
            ku();
        }
        if (i9 == 3 || i9 == 2) {
            this.jU = 2;
            ku();
        }
        if (this.jU != 1 && i9 == 0) {
            this.jU = 1;
            zp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.rV.zp.lMd
    public boolean vDp() {
        boolean z8;
        int i9 = this.jU;
        if (i9 != 2 && i9 != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8) {
            this.KS.set(false);
        }
        if (!z8 || super.vDp()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.rV.zp.lMd
    public void zp() {
        if (this.jU != 1) {
            return;
        }
        super.zp();
    }
}
