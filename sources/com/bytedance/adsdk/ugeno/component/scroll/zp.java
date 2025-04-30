package com.bytedance.adsdk.ugeno.component.scroll;

import android.content.Context;
import android.widget.ScrollView;
import com.bytedance.adsdk.ugeno.component.frame.zp;
import com.bytedance.adsdk.ugeno.component.zp;

/* loaded from: classes.dex */
public class zp extends com.bytedance.adsdk.ugeno.component.zp<ScrollView> {
    public zp(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.zp
    public zp.C0066zp ku() {
        return new zp.C0065zp();
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: vwr, reason: merged with bridge method [inline-methods] */
    public ScrollView KS() {
        UGScrollView uGScrollView = new UGScrollView(this.lMd);
        uGScrollView.zp(this);
        return uGScrollView;
    }
}
