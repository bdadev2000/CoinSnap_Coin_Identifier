package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.component.sdk.annotation.ColorInt;

/* loaded from: classes.dex */
public class Wwa extends vc {
    public Sg YFl;

    public Wwa(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        return super.NjR();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public Sg YFl(Bitmap bitmap) {
        YFl yFl = new YFl(bitmap, this.YFl);
        this.YFl = yFl;
        return yFl;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public GradientDrawable getDrawable() {
        Sg sg2 = new Sg();
        this.YFl = sg2;
        return sg2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public GradientDrawable YFl(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        Sg sg2 = new Sg(orientation, iArr);
        this.YFl = sg2;
        return sg2;
    }
}
