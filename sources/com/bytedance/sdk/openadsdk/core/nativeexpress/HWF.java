package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.YW;
import com.bytedance.sdk.openadsdk.utils.WNy;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HWF extends com.bytedance.sdk.openadsdk.core.lMd.zp {
    public HWF(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.woN won, @NonNull String str, int i9) {
        super(context, won, str, i9);
    }

    @Override // com.bytedance.sdk.openadsdk.core.lMd.lMd
    public com.bytedance.sdk.openadsdk.core.model.YW zp(float f9, float f10, float f11, float f12, SparseArray<KS.zp> sparseArray, long j7, long j9, View view, View view2, String str, float f13, int i9, float f14, int i10, JSONObject jSONObject) {
        float f15;
        float f16;
        float f17;
        float f18;
        int i11;
        int i12;
        int i13;
        long j10;
        long j11;
        char c9;
        int i14;
        int i15;
        int[] zp = WNy.zp(view);
        int i16 = 0;
        if (zp == null || zp.length != 2) {
            f15 = f9;
            f16 = f10;
            f17 = f11;
            f18 = f12;
            i11 = 0;
            i12 = 0;
        } else {
            i11 = zp[0];
            i12 = zp[1];
            if (this.pvr == 0) {
                f18 = (WNy.lMd(this.KS, f12) + i12) - 0.5f;
                f17 = (WNy.lMd(this.KS, f11) + i11) - 0.5f;
                f15 = (WNy.lMd(this.KS, f9) + i11) - 0.5f;
                f16 = (WNy.lMd(this.KS, f10) + i12) - 0.5f;
            } else {
                f15 = f9;
                f16 = f10;
                f17 = f11;
                f18 = f12;
            }
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        com.bytedance.sdk.openadsdk.core.model.tG tGVar = this.jU;
        if (tGVar != null) {
            j10 = tGVar.COT;
            j11 = tGVar.HWF;
            if (this.pvr == 0) {
                iArr[0] = WNy.lMd(this.KS, tGVar.QR) + i11;
                iArr[1] = WNy.lMd(this.KS, this.jU.ku) + i12;
                i14 = WNy.lMd(this.KS, this.jU.YW);
                i15 = WNy.lMd(this.KS, this.jU.dT);
                c9 = 0;
                i13 = 1;
            } else {
                c9 = 0;
                iArr[0] = tGVar.QR;
                i13 = 1;
                iArr[1] = tGVar.ku;
                i14 = tGVar.YW;
                i15 = tGVar.dT;
            }
            iArr2[c9] = i14;
            iArr2[i13] = i15;
            if (i14 == 0 && i15 == 0 && view2 != null) {
                iArr = WNy.zp(view2);
                iArr2 = WNy.KS(view2);
            }
            i16 = 0;
        } else {
            i13 = 1;
            j10 = j7;
            j11 = j9;
        }
        this.pvr = i16;
        return new YW.zp().HWF(f15).COT(f16).jU(f17).KS(f18).lMd(j10).zp(j11).lMd(zp).zp(iArr).KS(WNy.KS(view)).jU(iArr2).jU(this.Lij).COT(this.Gzh).HWF(this.irS).lMd(com.bytedance.sdk.openadsdk.core.ku.lMd().zp() ? i13 : 2).zp(sparseArray).zp(str).zp(f13).KS(i9).lMd(f14).zp(i10).zp(jSONObject).zp();
    }

    public void zp(com.bytedance.sdk.openadsdk.core.model.tG tGVar) {
        this.jU = tGVar;
    }
}
