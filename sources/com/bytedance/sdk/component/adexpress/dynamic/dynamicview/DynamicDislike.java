package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.adexpress.widget.DislikeView;

/* loaded from: classes.dex */
public class DynamicDislike extends DynamicBaseWidgetImp {
    public DynamicDislike(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        DislikeView dislikeView = new DislikeView(context);
        this.dQp = dislikeView;
        dislikeView.setTag(3);
        addView(this.dQp, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.dQp);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        super.YW();
        int zp = (int) QR.zp(this.Bj, this.vDp.woN());
        View view = this.dQp;
        if (view instanceof DislikeView) {
            ((DislikeView) view).setRadius((int) QR.zp(this.Bj, this.vDp.dQp()));
            ((DislikeView) this.dQp).setStrokeWidth(zp);
            ((DislikeView) this.dQp).setStrokeColor(this.vDp.KVG());
            ((DislikeView) this.dQp).setBgColor(this.vDp.irS());
            ((DislikeView) this.dQp).setDislikeColor(this.vDp.QR());
            ((DislikeView) this.dQp).setDislikeWidth((int) QR.zp(this.Bj, 1.0f));
            return true;
        }
        return true;
    }
}
