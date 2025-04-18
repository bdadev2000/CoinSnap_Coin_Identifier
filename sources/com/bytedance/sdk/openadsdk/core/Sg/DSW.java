package com.bytedance.sdk.openadsdk.core.Sg;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.Sg.tN;
import com.bytedance.sdk.openadsdk.utils.GA;

/* loaded from: classes.dex */
public abstract class DSW extends tN {
    private final com.bytedance.sdk.openadsdk.core.YoT.YFl Sg;
    private final String YFl;
    private tN tN;

    public DSW(String str, com.bytedance.sdk.openadsdk.core.YoT.YFl yFl) {
        this(str, yFl, null);
    }

    public void YFl(tN tNVar) {
        this.tN = tNVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Sg.tN, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }

    public DSW(String str, com.bytedance.sdk.openadsdk.core.YoT.YFl yFl, tN tNVar) {
        this.YFl = str;
        this.Sg = yFl;
        this.tN = tNVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.Sg.tN
    public void YFl(View view, float f10, float f11, float f12, float f13, SparseArray<tN.YFl> sparseArray, boolean z10) {
        com.bytedance.sdk.openadsdk.core.YoT.YFl yFl = this.Sg;
        if (yFl != null) {
            yFl.wN(this.YFl);
        }
        if (view != null) {
            if (view.getId() == GA.tN) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == GA.DSW) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.YFl);
            }
        }
        tN tNVar = this.tN;
        if (tNVar != null) {
            tNVar.UZM = this.UZM;
            tNVar.YI = this.YI;
            tNVar.Ga = this.Ga;
            int i10 = this.Ga;
            tNVar.dXO = i10;
            tNVar.Cfr = i10;
            tNVar.YFl(view, f10, f11, f12, f13, sparseArray, z10);
        }
    }
}
