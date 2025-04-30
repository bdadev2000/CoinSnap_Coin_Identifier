package com.bytedance.sdk.openadsdk.multipro.aidl.zp;

import Q7.n0;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import java.util.Map;

/* loaded from: classes.dex */
public class lMd extends zp {
    private static volatile lMd lMd;
    private static final Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> zp = n0.q();

    public static lMd zp() {
        if (lMd == null) {
            synchronized (lMd.class) {
                try {
                    if (lMd == null) {
                        lMd = new lMd();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        zp(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        zp.put(str, remoteCallbackList);
    }

    private synchronized void zp(String str, String str2) {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> map = zp;
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
                            IAppOpenAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i9);
                            if (broadcastItem != null) {
                                if ("onAdShow".equals(str2)) {
                                    broadcastItem.onAdShow();
                                } else if ("onAdClicked".equals(str2)) {
                                    broadcastItem.onAdClicked();
                                } else if ("onAdSkip".equals(str2)) {
                                    broadcastItem.onAdSkip();
                                } else if ("onAdTimeOver".equals(str2)) {
                                    broadcastItem.onAdTimeOver();
                                } else if ("recycleRes".equals(str2)) {
                                    broadcastItem.onDestroy();
                                }
                            }
                        } catch (Throwable th) {
                            tG.zp("MultiProcess", "appOpenAd2 method " + str2 + " throws Exception :", th);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            tG.zp("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th2);
        }
    }
}
