package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class DSPAdChoice extends PAGImageView {
    public DSPAdChoice(Context context) {
        super(context);
        zp();
    }

    private void zp() {
        setVisibility(8);
        setId(vDp.zf);
    }

    public void zp(int i9, woN won) {
        if (won.Fm() || (won.zR() && won.QR())) {
            WNy.zp((View) this, 0);
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp((int) WNy.zp(getContext(), i9, true), this, won);
        }
    }
}
