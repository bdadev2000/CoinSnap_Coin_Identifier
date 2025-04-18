package com.bytedance.sdk.openadsdk.multipro.aidl.YFl;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* loaded from: classes.dex */
public class tN extends YFl {
    private static volatile tN Sg;
    private static final HashMap<String, RemoteCallbackList<ICommonPermissionListener>> YFl = new HashMap<>();

    public static tN YFl() {
        if (Sg == null) {
            synchronized (tN.class) {
                if (Sg == null) {
                    Sg = new tN();
                }
            }
        }
        return Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        RemoteCallbackList<ICommonPermissionListener> remove = YFl.remove(str);
        if (remove == null) {
            return;
        }
        int beginBroadcast = remove.beginBroadcast();
        for (int i10 = 0; i10 < beginBroadcast; i10++) {
            ICommonPermissionListener broadcastItem = remove.getBroadcastItem(i10);
            if (broadcastItem != null) {
                if (str2 == null) {
                    broadcastItem.onGranted();
                } else {
                    broadcastItem.onDenied(str2);
                }
            }
        }
        remove.finishBroadcast();
        remove.kill();
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener == null) {
            return;
        }
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        YFl.put(str, remoteCallbackList);
    }
}
