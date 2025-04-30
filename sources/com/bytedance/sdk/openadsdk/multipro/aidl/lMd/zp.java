package com.bytedance.sdk.openadsdk.multipro.aidl.lMd;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class zp extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.KS.lMd zp;

    public zp(com.bytedance.sdk.openadsdk.apiImpl.KS.lMd lmd) {
        this.zp = lmd;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.zp.2
            @Override // java.lang.Runnable
            public void run() {
                if (zp.this.zp != null) {
                    zp.this.zp.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.zp.1
            @Override // java.lang.Runnable
            public void run() {
                if (zp.this.zp != null) {
                    zp.this.zp.zp();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.zp.3
            @Override // java.lang.Runnable
            public void run() {
                if (zp.this.zp != null) {
                    zp.this.zp.lMd();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.zp.4
            @Override // java.lang.Runnable
            public void run() {
                if (zp.this.zp != null) {
                    zp.this.zp.KS();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        zp();
    }

    private void zp() {
        this.zp = null;
    }
}
