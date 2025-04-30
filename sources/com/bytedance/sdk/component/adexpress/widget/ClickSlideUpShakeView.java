package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.adexpress.KS.zp;

/* loaded from: classes.dex */
public class ClickSlideUpShakeView extends SlideUpView {
    private ShakeClickView zp;

    public ClickSlideUpShakeView(Context context, int i9, int i10, int i11) {
        super(context);
        zp(context, i9, i10, i11);
    }

    private void zp(Context context, int i9, int i10, int i11) {
        ShakeClickView shakeClickView = new ShakeClickView(context, zp.KS(context), i9, i10, i11);
        this.zp = shakeClickView;
        addView(shakeClickView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.zp.setLayoutParams(layoutParams);
    }

    public ShakeClickView getShakeView() {
        return this.zp;
    }

    public void setShakeText(String str) {
        if (this.zp == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.zp.setShakeText("");
        } else {
            this.zp.setShakeText(str);
        }
    }
}
