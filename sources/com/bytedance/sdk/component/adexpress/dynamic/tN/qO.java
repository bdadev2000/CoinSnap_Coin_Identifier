package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.vc.YI;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qO implements DSW<YI> {
    private com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW AlY;
    private Context Sg;
    private YI YFl;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.AlY.nc f10401vc;
    private String wN;

    public qO(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw, String str, com.bytedance.sdk.component.adexpress.dynamic.AlY.nc ncVar) {
        this.Sg = context;
        this.tN = wNVar;
        this.AlY = dsw;
        this.wN = str;
        this.f10401vc = ncVar;
        wN();
    }

    private void wN() {
        int iY = this.AlY.iY();
        final com.bytedance.sdk.component.adexpress.dynamic.vc.YFl dynamicClickListener = this.tN.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.wN)) {
            Context context = this.Sg;
            YI yi = new YI(context, com.bytedance.sdk.component.adexpress.tN.YFl.NjR(context), this.f10401vc);
            this.YFl = yi;
            if (yi.getWriggleLayout() != null) {
                this.YFl.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.YFl.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.AlY.in())) {
                    this.YFl.getTopTextView().setText(com.bytedance.sdk.component.utils.qO.Sg(this.Sg, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.YFl.getTopTextView().setText(this.AlY.in());
                }
            }
        } else {
            Context context2 = this.Sg;
            this.YFl = new YI(context2, com.bytedance.sdk.component.adexpress.tN.YFl.NjR(context2), this.f10401vc);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.YFl.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.Sg, iY)));
        this.YFl.setLayoutParams(layoutParams);
        this.YFl.setShakeText(this.AlY.Cqy());
        this.YFl.setClipChildren(false);
        final View wriggleProgressIv = this.YFl.getWriggleProgressIv();
        this.YFl.setOnShakeViewListener(new YI.YFl() { // from class: com.bytedance.sdk.component.adexpress.dynamic.tN.qO.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    /* renamed from: AlY, reason: merged with bridge method [inline-methods] */
    public YI tN() {
        return this.YFl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void Sg() {
        this.YFl.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void YFl() {
        this.YFl.YFl();
    }
}
