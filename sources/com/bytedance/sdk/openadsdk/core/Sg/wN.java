package com.bytedance.sdk.openadsdk.core.Sg;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.Wwa;

/* loaded from: classes.dex */
public abstract class wN extends YFl {
    public wN(@NonNull Context context, @NonNull Wwa wwa, @NonNull String str, int i10) {
        super(context, wwa, str, i10);
    }

    public abstract void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, int i10, int i11, int i12, boolean z10);

    @Override // com.bytedance.sdk.openadsdk.core.Sg.YFl, com.bytedance.sdk.openadsdk.core.Sg.Sg, com.bytedance.sdk.openadsdk.core.Sg.tN
    public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
        if (YFl(view, z10)) {
            YFl(view, f10, f11, f12, f13, sparseArray, this.Cfr, this.Ga, this.dXO, z10);
        }
        super.YFl(view, f10, f11, f12, f13, sparseArray, z10);
    }
}
