package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;

/* loaded from: classes.dex */
public class DynamicRoot extends DynamicBaseWidgetImp {
    public lMd zp;

    public DynamicRoot(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        return super.YW();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public GradientDrawable getDrawable() {
        lMd lmd = new lMd();
        this.zp = lmd;
        return lmd;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public lMd zp(Bitmap bitmap) {
        zp zpVar = new zp(bitmap, this.zp);
        this.zp = zpVar;
        return zpVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public GradientDrawable zp(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        lMd lmd = new lMd(orientation, iArr);
        this.zp = lmd;
        return lmd;
    }
}
