package com.bytedance.sdk.openadsdk.multipro.aidl.Sg;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.mn;

/* loaded from: classes.dex */
public class AlY extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.YFl.wN.YFl YFl;

    public AlY(com.bytedance.sdk.openadsdk.YFl.wN.YFl yFl) {
        this.YFl = yFl;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.AlY.3
            @Override // java.lang.Runnable
            public void run() {
                if (AlY.this.YFl != null) {
                    AlY.this.YFl.Sg();
                }
                AlY.this.YFl();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.AlY.1
            @Override // java.lang.Runnable
            public void run() {
                if (AlY.this.YFl != null) {
                    AlY.this.YFl.YFl();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.AlY.2
            @Override // java.lang.Runnable
            public void run() {
                if (AlY.this.YFl != null) {
                    AlY.this.YFl.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z10, final int i10, final String str, final int i11, final String str2) throws RemoteException {
        if (this.YFl == null) {
            return;
        }
        mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.Sg.AlY.4
            @Override // java.lang.Runnable
            public void run() {
                if (AlY.this.YFl != null) {
                    AlY.this.YFl.YFl(z10, i10, str, i11, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl() {
        this.YFl = null;
    }
}
