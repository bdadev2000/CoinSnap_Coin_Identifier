package com.bytedance.sdk.openadsdk.multipro.aidl.zp;

import Q7.n0;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Map;

/* loaded from: classes.dex */
public class COT extends zp {
    private static volatile COT lMd;
    private static final Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> zp = n0.q();

    public static COT zp() {
        if (lMd == null) {
            synchronized (COT.class) {
                try {
                    if (lMd == null) {
                        lMd = new COT();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        zp(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        zp.put(str, remoteCallbackList);
    }

    private synchronized void zp(String str, String str2) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> map = zp;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i9 = 0; i9 < beginBroadcast; i9++) {
                        try {
                            IFullScreenVideoAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i9);
                            if (broadcastItem != null) {
                                if ("onAdShow".equals(str2)) {
                                    broadcastItem.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    broadcastItem.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    broadcastItem.onAdVideoBarClick();
                                } else if ("recycleRes".equals(str2)) {
                                    broadcastItem.onDestroy();
                                }
                            }
                        } catch (Throwable th) {
                            tG.zp("MultiProcess", "fullScreen2 method " + str2 + " throws Exception :", th);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            tG.zp("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th2);
        }
    }
}
