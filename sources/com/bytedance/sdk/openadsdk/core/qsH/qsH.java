package com.bytedance.sdk.openadsdk.core.qsH;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.core.model.nc;
import com.bytedance.sdk.openadsdk.utils.GS;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qsH extends com.bytedance.sdk.openadsdk.core.Sg.YFl {
    public qsH(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.Wwa wwa, @NonNull String str, int i10) {
        super(context, wwa, str, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.Sg.Sg
    public com.bytedance.sdk.openadsdk.core.model.nc YFl(float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, long j3, long j10, View view, View view2, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject, JSONObject jSONObject2) {
        float f16;
        float f17;
        float f18;
        float f19;
        int i12;
        int i13;
        int i14;
        long j11;
        long j12;
        char c10;
        int i15;
        int i16;
        int[] YFl = GS.YFl(view);
        int i17 = 0;
        if (YFl == null || YFl.length != 2) {
            f16 = f10;
            f17 = f11;
            f18 = f12;
            f19 = f13;
            i12 = 0;
            i13 = 0;
        } else {
            i12 = YFl[0];
            i13 = YFl[1];
            if (this.aIu == 0) {
                f19 = (GS.tN(this.AlY, f13) + i13) - 0.5f;
                f18 = (GS.tN(this.AlY, f12) + i12) - 0.5f;
                f16 = (GS.tN(this.AlY, f10) + i12) - 0.5f;
                f17 = (GS.tN(this.AlY, f11) + i13) - 0.5f;
            } else {
                f16 = f10;
                f17 = f11;
                f18 = f12;
                f19 = f13;
            }
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        com.bytedance.sdk.openadsdk.core.model.pDU pdu = this.wN;
        if (pdu != null) {
            j11 = pdu.wN;
            j12 = pdu.f10710vc;
            if (this.aIu == 0) {
                iArr[0] = GS.tN(this.AlY, pdu.DSW) + i12;
                iArr[1] = GS.tN(this.AlY, this.wN.qsH) + i13;
                i15 = GS.tN(this.AlY, this.wN.NjR);
                i16 = GS.tN(this.AlY, this.wN.f10709nc);
                c10 = 0;
                i14 = 1;
            } else {
                c10 = 0;
                iArr[0] = pdu.DSW;
                i14 = 1;
                iArr[1] = pdu.qsH;
                i15 = pdu.NjR;
                i16 = pdu.f10709nc;
            }
            iArr2[c10] = i15;
            iArr2[i14] = i16;
            if (i15 == 0 && i16 == 0 && view2 != null) {
                iArr = GS.YFl(view2);
                iArr2 = GS.tN(view2);
            }
            i17 = 0;
        } else {
            i14 = 1;
            j11 = j3;
            j12 = j10;
        }
        this.aIu = i17;
        return new nc.YFl().vc(f16).wN(f17).AlY(f18).tN(f19).Sg(j11).YFl(j12).Sg(YFl).YFl(iArr).tN(GS.tN(view)).AlY(iArr2).AlY(this.Ga).wN(this.dXO).vc(this.Cfr).Sg(com.bytedance.sdk.openadsdk.core.NjR.Sg().YFl() ? i14 : 2).YFl(sparseArray).YFl(str).YFl(f14).tN(i10).Sg(f15).YFl(i11).YFl(jSONObject).Sg(jSONObject2).YFl();
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.model.pDU pdu) {
        this.wN = pdu;
    }
}
