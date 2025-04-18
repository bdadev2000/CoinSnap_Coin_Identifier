package com.bytedance.sdk.openadsdk.VOe.YFl;

import android.view.View;
import com.bytedance.sdk.openadsdk.VOe.YFl.wN;
import com.bytedance.sdk.openadsdk.core.model.Wwa;

/* loaded from: classes.dex */
public class qsH extends Sg {
    private int AlY;

    public qsH(Integer num, View view, Wwa wwa, wN.YFl yFl) {
        super(num, view, wwa, 2000, yFl);
        this.AlY = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.VOe.YFl.Sg
    public void AlY() {
        super.AlY();
    }

    @Override // com.bytedance.sdk.openadsdk.VOe.YFl.Sg
    public void Sg(int i10) {
        if (NjR()) {
            return;
        }
        if (i10 == 6 || i10 == 5) {
            this.AlY = 0;
            qsH();
        }
        if (i10 == 3 || i10 == 2) {
            this.AlY = 2;
            qsH();
        }
        if (this.AlY != 1 && i10 == 0) {
            this.AlY = 1;
            YFl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.VOe.YFl.Sg
    public void YFl() {
        if (this.AlY != 1) {
            return;
        }
        super.YFl();
    }

    @Override // com.bytedance.sdk.openadsdk.VOe.YFl.Sg
    public boolean YoT() {
        boolean z10;
        int i10 = this.AlY;
        if (i10 != 2 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.tN.set(false);
        }
        if (!z10 || super.YoT()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.VOe.YFl.Sg
    public boolean tN() {
        return vc.YFl(this.YFl.get(), this.Sg.JGG()) && this.AlY == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.VOe.YFl.Sg
    public int vc() {
        return 200;
    }
}
