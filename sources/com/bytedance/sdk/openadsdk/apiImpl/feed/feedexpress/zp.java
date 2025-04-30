package com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;

/* loaded from: classes.dex */
public class zp extends lMd {
    public zp(@NonNull Context context, woN won, AdSlot adSlot) {
        super(context, won, adSlot);
    }

    public com.bytedance.sdk.openadsdk.multipro.lMd.zp lMd() {
        NativeExpressView nativeExpressView = this.dT;
        if (nativeExpressView != null) {
            return ((NativeExpressVideoView) nativeExpressView).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.lMd
    public void zp() {
        NativeExpressVideoView nativeExpressVideoView = new NativeExpressVideoView(((lMd) this).ku, this.lMd, ((lMd) this).YW, this.Bj);
        this.dT = nativeExpressVideoView;
        this.zp.zp(nativeExpressVideoView.getVideoController());
        KS();
    }
}
