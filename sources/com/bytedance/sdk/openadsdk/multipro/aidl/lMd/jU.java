package com.bytedance.sdk.openadsdk.multipro.aidl.lMd;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.QUv;

/* loaded from: classes.dex */
public class jU extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.jU.zp zp;

    public jU(com.bytedance.sdk.openadsdk.apiImpl.jU.zp zpVar) {
        this.zp = zpVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.jU.3
            @Override // java.lang.Runnable
            public void run() {
                if (jU.this.zp != null) {
                    jU.this.zp.lMd();
                }
                jU.this.zp();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.jU.1
            @Override // java.lang.Runnable
            public void run() {
                if (jU.this.zp != null) {
                    jU.this.zp.zp();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.jU.2
            @Override // java.lang.Runnable
            public void run() {
                if (jU.this.zp != null) {
                    jU.this.zp.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z8, final int i9, final String str, final int i10, final String str2) throws RemoteException {
        if (this.zp == null) {
            return;
        }
        QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.lMd.jU.4
            @Override // java.lang.Runnable
            public void run() {
                if (jU.this.zp != null) {
                    jU.this.zp.zp(z8, i9, str, i10, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp() {
        this.zp = null;
    }
}
