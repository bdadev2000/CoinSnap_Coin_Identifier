package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class hQ extends vc implements com.bytedance.sdk.component.adexpress.dynamic.tN {
    private boolean YFl;

    public hQ(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        this.DSW = this.qsH;
        ImageView imageView = new ImageView(context);
        this.EH = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.EH, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            if (!dynamicRootView.getRenderRequest().UZM()) {
                this.EH.setVisibility(8);
                setVisibility(8);
            }
            this.YFl = dynamicRootView.getRenderRequest().GA();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        Drawable tN;
        super.NjR();
        View view = this.EH;
        if (view != null) {
            ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
            Drawable YFl = com.bytedance.sdk.component.adexpress.AlY.tN.YFl(getContext(), this.YoT);
            if (YFl != null) {
                ((ImageView) this.EH).setBackground(YFl);
            }
            if (this.YFl) {
                tN = com.bytedance.sdk.component.utils.qO.tN(getContext(), "tt_close_btn");
            } else {
                tN = com.bytedance.sdk.component.utils.qO.tN(getContext(), "tt_skip_btn");
            }
            if (tN != null) {
                tN.setAutoMirrored(true);
                ((ImageView) this.EH).setImageDrawable(tN);
            }
            int YFl2 = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.Sg());
            this.EH.setPadding(YFl2, YFl2, YFl2, YFl2);
        }
        setVisibility(8);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.tN
    public void YFl(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        setVisibility(i11);
    }
}
