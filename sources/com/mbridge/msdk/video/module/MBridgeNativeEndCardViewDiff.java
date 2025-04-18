package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes4.dex */
public abstract class MBridgeNativeEndCardViewDiff extends MBridgeBaseView {
    public TextView ctaView;

    public MBridgeNativeEndCardViewDiff(Context context) {
        super(context);
    }

    public boolean checkChinaShakeState() {
        return false;
    }

    public boolean checkProgressBarIntercepted() {
        return false;
    }

    public boolean ctaViewCanGet(View view, boolean z10) {
        try {
            View findViewById = view.findViewById(filterFindViewId(z10, "mbridge_tv_cta"));
            if (findViewById instanceof TextView) {
                this.ctaView = (TextView) findViewById;
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        if (this.ctaView == null) {
            return false;
        }
        return true;
    }

    public MBridgeNativeEndCardViewDiff(Context context, AttributeSet attributeSet, boolean z10, int i10, boolean z11, int i11, int i12) {
        super(context, attributeSet, z10, i10, z11, i11, i12);
    }

    public MBridgeNativeEndCardViewDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
