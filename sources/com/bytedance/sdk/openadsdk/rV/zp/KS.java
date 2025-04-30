package com.bytedance.sdk.openadsdk.rV.zp;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.woN;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class KS extends lMd {
    private int jU;

    public KS(Integer num, View view, woN won, int i9) {
        super(num, view, won, 1000, i9);
        this.jU = -1;
        lMd(view);
    }

    @Override // com.bytedance.sdk.openadsdk.rV.zp.lMd
    public int HWF() {
        return 100;
    }

    @Override // com.bytedance.sdk.openadsdk.rV.zp.lMd
    public boolean KS() {
        WeakReference<View> weakReference = this.zp;
        boolean z8 = false;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.zp.get();
        if (this.jU == -1) {
            lMd(view);
        }
        if (this.jU == 1) {
            z8 = true;
        }
        return HWF.zp(view, z8, this.lMd.WJ());
    }

    @Override // com.bytedance.sdk.openadsdk.rV.zp.lMd
    public void jU() {
        super.jU();
    }

    @Override // com.bytedance.sdk.openadsdk.rV.zp.lMd
    public void lMd(int i9) {
    }

    private void lMd(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.jU = width * height >= 242500 ? 1 : 0;
        }
    }
}
