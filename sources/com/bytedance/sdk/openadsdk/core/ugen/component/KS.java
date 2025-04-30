package com.bytedance.sdk.openadsdk.core.ugen.component;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* loaded from: classes.dex */
public class KS extends com.bytedance.adsdk.ugeno.component.lMd<FrameLayout> {
    public KS(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public FrameLayout KS() {
        FrameLayout frameLayout = new FrameLayout(this.lMd);
        frameLayout.addView(new PAGLogoView(this.lMd));
        return frameLayout;
    }
}
