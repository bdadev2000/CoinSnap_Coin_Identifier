package com.bytedance.sdk.openadsdk.core.ugen.component.video;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.frame.UGFrameLayout;

/* loaded from: classes.dex */
public class zp extends com.bytedance.adsdk.ugeno.component.zp.zp {
    public zp(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.zp.zp, com.bytedance.adsdk.ugeno.component.zp, com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
    }

    public UGFrameLayout pvr() {
        return ((UGVideoPlaceholderView) this.COT).getVideoView();
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: vwr, reason: merged with bridge method [inline-methods] */
    public UGVideoPlaceholderView KS() {
        UGVideoPlaceholderView uGVideoPlaceholderView = new UGVideoPlaceholderView(this.lMd);
        uGVideoPlaceholderView.zp(this);
        return uGVideoPlaceholderView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.zp.zp, com.bytedance.adsdk.ugeno.component.lMd
    public void zp(String str, String str2) {
        super.zp(str, str2);
    }
}
