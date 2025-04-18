package com.bytedance.sdk.openadsdk.multipro.aidl.YFl;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.ICommonDialogListener;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;

/* loaded from: classes.dex */
public abstract class YFl extends IListenerManager.Stub {
    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastDialogListener(String str, int i10) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
    }

    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
    }

    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
    }

    public void executeRewardVideoCallback(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) throws RemoteException {
    }

    public void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerDialogListener(String str, ICommonDialogListener iCommonDialogListener) throws RemoteException {
    }

    public void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
    }

    @Override // com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
    }

    public void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
    }

    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
    }
}
