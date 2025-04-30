package com.bytedance.sdk.openadsdk.core.KS.zp;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.lMd.Bj;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.tG;
import com.bytedance.sdk.openadsdk.utils.WNy;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class zp extends KS implements com.bytedance.sdk.component.adexpress.dynamic.COT.zp {
    private Bj KS;
    protected WeakReference<View> lMd;
    protected WeakReference<View> zp;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.COT.zp
    public void lMd(View view) {
        this.lMd = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.COT.zp
    public void zp(Bj bj) {
        this.KS = bj;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.COT.zp
    public void zp(View view) {
        this.zp = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lMd.KS
    public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
        zp(view, ((Integer) view.getTag()).intValue(), f9, f10, f11, f12, sparseArray);
    }

    private void zp(View view, int i9, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray) {
        if (this.KS != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.lMd;
            if (weakReference != null) {
                int[] zp = WNy.zp(weakReference.get());
                if (zp != null) {
                    iArr = zp;
                }
                int[] KS = WNy.KS(this.lMd.get());
                if (KS != null) {
                    iArr2 = KS;
                }
            }
            String str = "";
            try {
                int i10 = com.bytedance.sdk.component.adexpress.dynamic.zp.FP;
                if (view.getTag(i10) != null) {
                    str = String.valueOf(view.getTag(i10));
                }
            } catch (Exception unused) {
            }
            this.KS.zp(view, i9, new tG.zp().jU(f9).KS(f10).lMd(f11).zp(f12).lMd(this.ox).zp(this.RCv).KS(iArr[0]).jU(iArr[1]).COT(iArr2[0]).HWF(iArr2[1]).zp(sparseArray).zp(this.cW).zp(str).zp());
        }
    }
}
