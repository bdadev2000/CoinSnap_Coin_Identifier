package com.bytedance.sdk.openadsdk.multipro.aidl.zp;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* loaded from: classes.dex */
public class KS extends zp {
    private static volatile KS lMd;
    private static final HashMap<String, RemoteCallbackList<ICommonPermissionListener>> zp = new HashMap<>();

    public static KS zp() {
        if (lMd == null) {
            synchronized (KS.class) {
                try {
                    if (lMd == null) {
                        lMd = new KS();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        RemoteCallbackList<ICommonPermissionListener> remove = zp.remove(str);
        if (remove == null) {
            return;
        }
        int beginBroadcast = remove.beginBroadcast();
        for (int i9 = 0; i9 < beginBroadcast; i9++) {
            ICommonPermissionListener broadcastItem = remove.getBroadcastItem(i9);
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

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener == null) {
            return;
        }
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        zp.put(str, remoteCallbackList);
    }
}
