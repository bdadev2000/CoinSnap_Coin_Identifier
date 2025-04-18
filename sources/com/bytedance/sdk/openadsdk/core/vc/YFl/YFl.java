package com.bytedance.sdk.openadsdk.core.vc.YFl;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.Sg.eT;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.pDU;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class YFl extends tN implements com.bytedance.sdk.component.adexpress.dynamic.vc.YFl {
    protected WeakReference<View> Sg;
    protected WeakReference<View> YFl;
    private eT tN;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vc.YFl
    public void Sg(View view) {
        this.Sg = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vc.YFl
    public void YFl(eT eTVar) {
        this.tN = eTVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vc.YFl
    public void YFl(View view) {
        this.YFl = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Sg.tN
    public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
        YFl(view, ((Integer) view.getTag()).intValue(), f10, f11, f12, f13, sparseArray);
    }

    private void YFl(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray) {
        if (this.tN != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.Sg;
            if (weakReference != null) {
                int[] YFl = GS.YFl(weakReference.get());
                if (YFl != null) {
                    iArr = YFl;
                }
                int[] tN = GS.tN(this.Sg.get());
                if (tN != null) {
                    iArr2 = tN;
                }
            }
            String str = "";
            try {
                int i11 = com.bytedance.sdk.component.adexpress.dynamic.YFl.wXo;
                if (view.getTag(i11) != null) {
                    str = String.valueOf(view.getTag(i11));
                }
            } catch (Exception unused) {
            }
            this.tN.YFl(view, i10, new pDU.YFl().AlY(f10).tN(f11).Sg(f12).YFl(f13).Sg(this.UZM).YFl(this.YI).tN(iArr[0]).AlY(iArr[1]).wN(iArr2[0]).vc(iArr2[1]).YFl(sparseArray).YFl(this.pq).YFl(str).YFl());
        }
    }
}
