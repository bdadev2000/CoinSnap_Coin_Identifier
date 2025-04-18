package com.bytedance.sdk.openadsdk.multipro.aidl.YFl;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class AlY extends YFl {
    private static volatile AlY Sg;
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> YFl = new ConcurrentHashMap<>();

    public static AlY YFl() {
        if (Sg == null) {
            synchronized (AlY.class) {
                if (Sg == null) {
                    Sg = new AlY();
                }
            }
        }
        return Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        YFl(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        YFl.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (!TextUtils.isEmpty(str)) {
            YFl.remove(str);
        }
    }

    private synchronized void YFl(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = YFl;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i10 = 0; i10 < beginBroadcast; i10++) {
                    try {
                        IDislikeClosedListener broadcastItem = remoteCallbackList.getBroadcastItem(i10);
                        if (broadcastItem != null && "onItemClickClosed".equals(str2)) {
                            broadcastItem.onItemClickClosed();
                        }
                    } catch (Throwable th2) {
                        YoT.YFl("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th3) {
            YoT.YFl("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th3);
        }
    }
}
