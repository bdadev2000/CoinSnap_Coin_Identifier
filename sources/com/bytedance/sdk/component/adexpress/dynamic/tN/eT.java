package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.UZM;

/* loaded from: classes.dex */
public class eT implements DSW<ViewGroup> {
    private final FrameLayout Sg;
    private final com.bytedance.sdk.component.adexpress.vc.nc YFl;

    public eT(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw, String str, String str2) {
        int i10;
        com.bytedance.sdk.component.adexpress.vc.nc ncVar = new com.bytedance.sdk.component.adexpress.vc.nc(context);
        this.YFl = ncVar;
        ncVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Sg = frameLayout;
        frameLayout.addView(ncVar, new FrameLayout.LayoutParams(-2, -2));
        double lL = dsw.lL();
        lL = lL == 0.0d ? 1.0d : lL;
        double zz = dsw.zz();
        double d10 = zz != 0.0d ? zz : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if ("20".equals(str2)) {
            YFl(context, frameLayout, dsw);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 81;
            if (dsw.iY() > 0) {
                i10 = dsw.iY();
            } else if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                i10 = 0;
            } else {
                i10 = 120;
            }
            layoutParams2.bottomMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, i10);
            frameLayout.setLayoutParams(layoutParams2);
            frameLayout.setClipChildren(false);
            return;
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (wNVar.getDynamicWidth() * 0.32d * lL), (int) (wNVar.getDynamicWidth() * 0.32d * d10));
        layoutParams3.gravity = 17;
        frameLayout.setLayoutParams(layoutParams3);
    }

    private void YFl(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -UZM.YFl(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(com.bytedance.sdk.component.utils.qO.Sg(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, UZM.YFl(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(com.bytedance.sdk.component.utils.qO.Sg(context, "tt_splash_brush_mask_hint")));
        if (dsw != null && !TextUtils.isEmpty(dsw.Cqy())) {
            textView2.setText(dsw.Cqy());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void Sg() {
        this.YFl.vc();
        ViewParent parent = this.Sg.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.Sg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public ViewGroup tN() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void YFl() {
        this.YFl.qsH();
    }
}
