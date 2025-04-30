package com.bytedance.sdk.openadsdk.core.lMd;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.woN;

/* loaded from: classes.dex */
public abstract class COT extends zp {
    public COT(@NonNull Context context, @NonNull woN won, @NonNull String str, int i9) {
        super(context, won, str, i9);
    }

    public abstract void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, int i9, int i10, int i11, boolean z8);

    @Override // com.bytedance.sdk.openadsdk.core.lMd.zp, com.bytedance.sdk.openadsdk.core.lMd.lMd, com.bytedance.sdk.openadsdk.core.lMd.KS
    public void zp(View view, float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, boolean z8) {
        if (zp(view, z8)) {
            zp(view, f9, f10, f11, f12, sparseArray, this.irS, this.Lij, this.Gzh, z8);
        }
        super.zp(view, f9, f10, f11, f12, sparseArray, z8);
    }
}
