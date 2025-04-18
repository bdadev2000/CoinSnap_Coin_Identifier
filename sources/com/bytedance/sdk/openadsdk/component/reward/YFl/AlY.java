package com.bytedance.sdk.openadsdk.component.reward.YFl;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY {
    private boolean AlY;
    private final com.bytedance.sdk.openadsdk.core.model.Wwa Sg;
    com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc YFl;
    private final String tN;
    private final com.bytedance.sdk.openadsdk.component.reward.YFl.YFl wN;

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, int i10, int i11, int i12);

        void YFl(String str, JSONObject jSONObject);
    }

    public AlY(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        this.wN = yFl;
        this.Sg = yFl.Sg;
        this.tN = yFl.wN;
    }

    private void AlY() {
        if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN() && this.Sg.ko() == 4) {
            this.YFl = com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW.YFl(this.wN.BPI, this.Sg, this.tN);
        }
        if (this.YFl == null) {
            this.YFl = com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.DSW.YFl(this.wN.UI, this.Sg, this.tN);
        }
    }

    public void Sg() {
        com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc vcVar = this.YFl;
        if (vcVar != null) {
            vcVar.AlY();
        }
    }

    public void YFl() {
        if (this.AlY) {
            return;
        }
        this.AlY = true;
        AlY();
    }

    public com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc tN() {
        return this.YFl;
    }

    public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, int i10, int i11, int i12, YFl yFl) {
        if (this.YFl != null) {
            int id2 = view.getId();
            if (id2 == com.bytedance.sdk.openadsdk.utils.GA.wN) {
                yFl.YFl("click_play_star_level", null);
                return;
            }
            if (id2 == com.bytedance.sdk.openadsdk.utils.GA.AlY) {
                yFl.YFl("click_play_star_nums", null);
                return;
            } else if (id2 == com.bytedance.sdk.openadsdk.utils.GA.tN) {
                yFl.YFl("click_play_source", null);
                return;
            } else {
                if (id2 == com.bytedance.sdk.openadsdk.utils.GA.Sg) {
                    yFl.YFl("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        yFl.YFl(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }
}
