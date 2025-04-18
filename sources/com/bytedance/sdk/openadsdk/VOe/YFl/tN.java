package com.bytedance.sdk.openadsdk.VOe.YFl;

import android.view.View;
import com.bytedance.sdk.openadsdk.VOe.YFl.wN;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class tN extends Sg {
    private int AlY;

    public tN(Integer num, View view, Wwa wwa, wN.YFl yFl) {
        super(num, view, wwa, 1000, yFl);
        this.AlY = -1;
        Sg(view);
    }

    @Override // com.bytedance.sdk.openadsdk.VOe.YFl.Sg
    public void AlY() {
        super.AlY();
    }

    @Override // com.bytedance.sdk.openadsdk.VOe.YFl.Sg
    public void Sg(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.VOe.YFl.Sg
    public boolean tN() {
        WeakReference<View> weakReference = this.YFl;
        boolean z10 = false;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.YFl.get();
        if (this.AlY == -1) {
            Sg(view);
        }
        if (this.AlY == 1) {
            z10 = true;
        }
        return vc.YFl(view, z10, this.Sg.JGG());
    }

    @Override // com.bytedance.sdk.openadsdk.VOe.YFl.Sg
    public int vc() {
        return 100;
    }

    private void Sg(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.AlY = width * height >= 242500 ? 1 : 0;
        }
    }
}
