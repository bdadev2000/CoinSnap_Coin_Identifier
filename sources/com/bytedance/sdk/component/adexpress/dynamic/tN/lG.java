package com.bytedance.sdk.component.adexpress.dynamic.tN;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.vc.Ne;

/* loaded from: classes.dex */
public class lG<E extends Ne> implements DSW<E> {
    protected com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW AlY;
    protected Context Sg;
    protected Ne YFl;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN tN;
    protected int wN;

    public lG(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw, int i10) {
        this.wN = i10;
        this.Sg = context;
        this.tN = wNVar;
        this.AlY = dsw;
        AlY();
    }

    public void AlY() {
        this.YFl = new Ne(this.Sg, this.AlY.BPI());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.Sg, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.Sg, 100 - this.wN);
        this.YFl.setLayoutParams(layoutParams);
        try {
            this.YFl.setGuideText(this.AlY.Cqy());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void Sg() {
        this.YFl.Sg();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    public void YFl() {
        this.YFl.YFl();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN.DSW
    /* renamed from: wN, reason: merged with bridge method [inline-methods] */
    public E tN() {
        return (E) this.YFl;
    }

    public lG(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN wNVar, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        this(context, wNVar, dsw, 0);
    }
}
