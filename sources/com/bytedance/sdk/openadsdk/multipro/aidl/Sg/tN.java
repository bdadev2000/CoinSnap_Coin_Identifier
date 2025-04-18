package com.bytedance.sdk.openadsdk.multipro.aidl.Sg;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class tN extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.YFl.tN.Sg YFl;

    public tN(com.bytedance.sdk.openadsdk.YFl.tN.Sg sg2) {
        this.YFl = sg2;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.tN.3
            @Override // java.lang.Runnable
            public void run() {
                if (tN.this.YFl != null) {
                    tN.this.YFl.Sg();
                }
                tN.this.YFl();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.tN.1
            @Override // java.lang.Runnable
            public void run() {
                if (tN.this.YFl != null) {
                    tN.this.YFl.YFl();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.tN.2
            @Override // java.lang.Runnable
            public void run() {
                if (tN.this.YFl != null) {
                    tN.this.YFl.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl() {
        this.YFl = null;
    }
}
