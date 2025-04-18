package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.vc.qO;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class EH implements DSW<com.bytedance.sdk.component.adexpress.vc.qO> {
    private com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW AlY;
    private int DSW;
    private JSONObject NjR;
    private Context Sg;
    private com.bytedance.sdk.component.adexpress.vc.qO YFl;
    private int qsH;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10389vc;
    private String wN;

    public EH(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw, String str, int i10, int i11, int i12, JSONObject jSONObject) {
        this.Sg = context;
        this.tN = wNVar;
        this.AlY = dsw;
        this.wN = str;
        this.f10389vc = i10;
        this.DSW = i11;
        this.qsH = i12;
        this.NjR = jSONObject;
        wN();
    }

    private void wN() {
        final com.bytedance.sdk.component.adexpress.dynamic.vc.YFl dynamicClickListener = this.tN.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.wN)) {
            Context context = this.Sg;
            com.bytedance.sdk.component.adexpress.vc.qO qOVar = new com.bytedance.sdk.component.adexpress.vc.qO(context, com.bytedance.sdk.component.adexpress.tN.YFl.qsH(context), this.f10389vc, this.DSW, this.qsH, this.NjR);
            this.YFl = qOVar;
            if (qOVar.getShakeLayout() != null) {
                this.YFl.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.Sg;
            this.YFl = new com.bytedance.sdk.component.adexpress.vc.qO(context2, com.bytedance.sdk.component.adexpress.tN.YFl.DSW(context2), this.f10389vc, this.DSW, this.qsH, this.NjR);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.YFl.setGravity(17);
        layoutParams.gravity = 17;
        this.YFl.setLayoutParams(layoutParams);
        this.YFl.setTranslationY(com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.Sg, this.AlY.Vmj()));
        this.YFl.setShakeText(this.AlY.Cqy());
        this.YFl.setClipChildren(false);
        this.YFl.setOnShakeViewListener(new qO.YFl() { // from class: com.bytedance.sdk.component.adexpress.dynamic.tN.EH.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    /* renamed from: AlY, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.vc.qO tN() {
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
