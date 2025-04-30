package com.bytedance.sdk.openadsdk.multipro.aidl.lMd;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.zp;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class lMd extends IDislikeClosedListener.Stub {
    private final String lMd;
    private final zp.InterfaceC0106zp zp;

    public lMd(String str, zp.InterfaceC0106zp interfaceC0106zp) {
        this.lMd = str;
        this.zp = interfaceC0106zp;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws RemoteException {
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.lMd.1
            @Override // java.lang.Runnable
            public void run() {
                if (lMd.this.zp != null) {
                    lMd.this.zp.zp();
                    TTDislikeListView.zp(6, lMd.this.lMd);
                }
            }
        });
    }
}
