package com.bytedance.sdk.openadsdk.core.qsH;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class rkt extends YFl {
    private qO GA;
    private FrameLayout YFl;
    private FrameLayout pDU;

    public rkt(@NonNull Context context) {
        super(context);
        this.Sg = context;
    }

    private void Sg() {
        this.DSW = GS.tN(this.Sg, this.GA.getExpectExpressWidth());
        this.qsH = GS.tN(this.Sg, this.GA.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.DSW, this.qsH);
        }
        layoutParams.width = this.DSW;
        layoutParams.height = this.qsH;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.tN.Cfr();
        tN();
    }

    private void tN() {
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(this.Sg);
        this.YFl = tNVar;
        addView(tNVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar2 = new com.bytedance.sdk.openadsdk.core.wN.tN(this.Sg);
        this.pDU = tNVar2;
        this.YFl.addView(tNVar2, new FrameLayout.LayoutParams(-1, -1));
        this.pDU.removeAllViews();
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, qO qOVar, ViewGroup viewGroup) {
        if (wwa == null) {
            return;
        }
        setBackgroundColor(-1);
        this.tN = wwa;
        this.GA = qOVar;
        if (wwa.Uv() == 7) {
            this.f10726vc = "rewarded_video";
        } else {
            this.f10726vc = "fullscreen_interstitial_ad";
        }
        Sg();
        this.GA.addView(this, new ViewGroup.LayoutParams(-2, -2));
        int i10 = com.bytedance.sdk.openadsdk.utils.GA.rnG;
        View findViewById = viewGroup.findViewById(i10);
        if (findViewById != null) {
            Object tag = findViewById.getTag(i10);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(str, findViewById);
            }
        }
    }

    public View getBackupContainerBackgroundView() {
        return this.YFl;
    }

    public FrameLayout getVideoContainer() {
        return this.pDU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qsH.YFl
    public void YFl(View view, int i10, com.bytedance.sdk.openadsdk.core.model.pDU pdu) {
        qO qOVar = this.GA;
        if (qOVar != null) {
            qOVar.YFl(view, i10, pdu);
        }
    }
}
