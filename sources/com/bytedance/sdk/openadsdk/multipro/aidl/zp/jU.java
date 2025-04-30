package com.bytedance.sdk.openadsdk.multipro.aidl.zp;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class jU extends zp {
    private static volatile jU lMd;
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> zp = new ConcurrentHashMap<>();

    public static jU zp() {
        if (lMd == null) {
            synchronized (jU.class) {
                try {
                    if (lMd == null) {
                        lMd = new jU();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        zp(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        zp.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (!TextUtils.isEmpty(str)) {
            zp.remove(str);
        }
    }

    private synchronized void zp(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = zp;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i9 = 0; i9 < beginBroadcast; i9++) {
                    try {
                        IDislikeClosedListener broadcastItem = remoteCallbackList.getBroadcastItem(i9);
                        if (broadcastItem != null && "onItemClickClosed".equals(str2)) {
                            broadcastItem.onItemClickClosed();
                        }
                    } catch (Throwable th) {
                        tG.zp("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th2) {
            tG.zp("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
        }
    }
}
