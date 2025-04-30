package com.bytedance.sdk.openadsdk.multipro.aidl.lMd;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class KS extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.lMd.lMd zp;

    public KS(com.bytedance.sdk.openadsdk.apiImpl.lMd.lMd lmd) {
        this.zp = lmd;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.KS.3
            @Override // java.lang.Runnable
            public void run() {
                if (KS.this.zp != null) {
                    KS.this.zp.lMd();
                }
                KS.this.zp();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.KS.1
            @Override // java.lang.Runnable
            public void run() {
                if (KS.this.zp != null) {
                    KS.this.zp.zp();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.KS.2
            @Override // java.lang.Runnable
            public void run() {
                if (KS.this.zp != null) {
                    KS.this.zp.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp() {
        this.zp = null;
    }
}
