package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.KS;
import com.bytedance.sdk.openadsdk.core.widget.DSPAdChoice;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class PAGAppOpenHtmlLayout extends PAGAppOpenBaseLayout {
    zp rV;

    /* loaded from: classes.dex */
    public interface zp {
        void zp(View view, int i9);
    }

    public PAGAppOpenHtmlLayout(Context context, woN won) {
        super(context);
        zp(context, won);
    }

    private void zp(Context context, woN won) {
        DspHtmlWebView dspHtmlWebView = new DspHtmlWebView(context);
        KS.zp().KS(dspHtmlWebView);
        dspHtmlWebView.zp(won, new DspHtmlWebView.lMd() { // from class: com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.lMd
            public void c_() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.lMd
            public View lMd() {
                return PAGAppOpenHtmlLayout.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.lMd
            public void zp(int i9, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.lMd
            public View zp() {
                PAGAppOpenTopBarView pAGAppOpenTopBarView = PAGAppOpenHtmlLayout.this.YW;
                if (pAGAppOpenTopBarView != null) {
                    return pAGAppOpenTopBarView.getTopDislike();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.lMd
            public void zp(View view, int i9) {
                zp zpVar = PAGAppOpenHtmlLayout.this.rV;
                if (zpVar != null) {
                    zpVar.zp(view, i9);
                }
            }
        }, "open_ad");
        addView(dspHtmlWebView, new ViewGroup.LayoutParams(-1, -1));
        dspHtmlWebView.KVG();
        int lMd = WNy.lMd(context, 9.0f);
        int lMd2 = WNy.lMd(context, 10.0f);
        this.jU = new PAGLogoView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, WNy.lMd(context, 14.0f));
        layoutParams.leftMargin = lMd2;
        layoutParams.bottomMargin = lMd2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.jU, layoutParams);
        DSPAdChoice dSPAdChoice = new DSPAdChoice(context);
        this.tG = dSPAdChoice;
        dSPAdChoice.setPadding(lMd, 0, lMd, 0);
        this.tG.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(WNy.lMd(context, 32.0f), WNy.lMd(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, lMd2, lMd2);
        addView(this.tG, layoutParams2);
        View view = this.YW;
        if (view != null) {
            addView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.rV = null;
    }

    public void setRenderListener(zp zpVar) {
        this.rV = zpVar;
    }
}
