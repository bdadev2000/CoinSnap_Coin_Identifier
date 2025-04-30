package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes3.dex */
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

    public boolean ctaViewCanGet(View view, boolean z8) {
        try {
            View findViewById = view.findViewById(filterFindViewId(z8, "mbridge_tv_cta"));
            if (findViewById instanceof TextView) {
                this.ctaView = (TextView) findViewById;
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
        if (this.ctaView == null) {
            return false;
        }
        return true;
    }

    public MBridgeNativeEndCardViewDiff(Context context, AttributeSet attributeSet, boolean z8, int i9, boolean z9, int i10, int i11) {
        super(context, attributeSet, z8, i9, z9, i10, i11);
    }

    public MBridgeNativeEndCardViewDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
