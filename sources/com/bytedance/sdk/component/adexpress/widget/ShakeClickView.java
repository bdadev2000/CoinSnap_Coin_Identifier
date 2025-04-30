package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.tG;

/* loaded from: classes.dex */
public class ShakeClickView extends ShakeAnimationView {
    private TextView zp;

    public ShakeClickView(Context context, View view, int i9, int i10, int i11) {
        super(context, view, i9, i10, i11);
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView
    public void setShakeText(String str) {
        if (this.zp == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            try {
                this.zp.setText(cz.lMd(this.zp.getContext(), "tt_splash_default_click_shake"));
                return;
            } catch (Exception e4) {
                tG.zp("shakeClickView", e4.getMessage());
                return;
            }
        }
        this.zp.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView
    public void zp(Context context, View view) {
        addView(view);
        this.zp = (TextView) findViewById(2097610747);
    }
}
