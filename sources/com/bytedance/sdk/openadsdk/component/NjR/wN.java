package com.bytedance.sdk.openadsdk.component.NjR;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.qsH.wN;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rkt;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class wN extends tN {
    YFl GA;

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(View view, int i10);
    }

    public wN(Context context, Wwa wwa) {
        super(context);
        YFl(context, wwa);
    }

    private void YFl(Context context, Wwa wwa) {
        com.bytedance.sdk.openadsdk.core.qsH.wN wNVar = new com.bytedance.sdk.openadsdk.core.qsH.wN(context);
        com.bytedance.sdk.openadsdk.core.qsH.AlY.YFl().tN(wNVar);
        wNVar.YFl(wwa, new wN.Sg() { // from class: com.bytedance.sdk.openadsdk.component.NjR.wN.1
            @Override // com.bytedance.sdk.openadsdk.core.qsH.wN.Sg
            public View Sg() {
                return wN.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.wN.Sg
            public void YFl(int i10, int i11) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.wN.Sg
            public void e_() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.wN.Sg
            public View YFl() {
                DSW dsw = wN.this.qsH;
                if (dsw != null) {
                    return dsw.getTopDislike();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.core.qsH.wN.Sg
            public void YFl(View view, int i10) {
                YFl yFl = wN.this.GA;
                if (yFl != null) {
                    yFl.YFl(view, i10);
                }
            }
        }, "open_ad");
        addView(wNVar, new ViewGroup.LayoutParams(-1, -1));
        wNVar.rkt();
        int tN = GS.tN(context, 9.0f);
        int tN2 = GS.tN(context, 10.0f);
        this.AlY = new PAGLogoView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, GS.tN(context, 14.0f));
        layoutParams.leftMargin = tN2;
        layoutParams.bottomMargin = tN2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.AlY, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.tN tNVar = new com.bytedance.sdk.openadsdk.core.widget.tN(context);
        this.YoT = tNVar;
        tNVar.setPadding(tN, 0, tN, 0);
        this.YoT.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(GS.tN(context, 32.0f), GS.tN(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, tN2, tN2);
        addView(this.YoT, layoutParams2);
        View view = this.qsH;
        if (view != null) {
            addView(view);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public com.bytedance.sdk.openadsdk.core.wN.AlY getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public com.bytedance.sdk.openadsdk.core.wN.qsH getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public rkt getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public View getUserInfo() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.GA = null;
    }

    public void setRenderListener(YFl yFl) {
        this.GA = yFl;
    }
}
