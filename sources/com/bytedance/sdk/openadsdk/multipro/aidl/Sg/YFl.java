package com.bytedance.sdk.openadsdk.multipro.aidl.Sg;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class YFl extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.YFl.AlY.Sg YFl;

    public YFl(com.bytedance.sdk.openadsdk.YFl.AlY.Sg sg2) {
        this.YFl = sg2;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.YFl.2
            @Override // java.lang.Runnable
            public void run() {
                if (YFl.this.YFl != null) {
                    YFl.this.YFl.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.YFl.1
            @Override // java.lang.Runnable
            public void run() {
                if (YFl.this.YFl != null) {
                    YFl.this.YFl.YFl();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.YFl.3
            @Override // java.lang.Runnable
            public void run() {
                if (YFl.this.YFl != null) {
                    YFl.this.YFl.Sg();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.YFl.4
            @Override // java.lang.Runnable
            public void run() {
                if (YFl.this.YFl != null) {
                    YFl.this.YFl.tN();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        YFl();
    }

    private void YFl() {
        this.YFl = null;
    }
}
