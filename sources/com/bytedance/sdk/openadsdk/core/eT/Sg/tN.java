package com.bytedance.sdk.openadsdk.core.eT.Sg;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* loaded from: classes.dex */
public class tN extends com.bytedance.adsdk.ugeno.Sg.Sg<FrameLayout> {
    public tN(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        super.Sg();
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public FrameLayout AlY() {
        FrameLayout frameLayout = new FrameLayout(this.Sg);
        frameLayout.addView(new PAGLogoView(this.Sg));
        return frameLayout;
    }
}
