package com.bytedance.sdk.openadsdk.multipro.aidl.zp;

import Q7.n0;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import java.util.Map;

/* loaded from: classes.dex */
public class QR extends zp {
    private static volatile QR lMd;
    private static final Map<String, RemoteCallbackList<IRewardAdInteractionListener>> zp = n0.q();

    public static QR zp() {
        if (lMd == null) {
            synchronized (QR.class) {
                try {
                    if (lMd == null) {
                        lMd = new QR();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(String str, String str2, boolean z8, int i9, String str3, int i10, String str4) throws RemoteException {
        zp(str, str2, z8, i9, str3, i10, str4);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iRewardAdInteractionListener);
        zp.put(str, remoteCallbackList);
    }

    private synchronized void zp(String str, String str2, boolean z8, int i9, String str3, int i10, String str4) {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IRewardAdInteractionListener>> map = zp;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList2 = remoteCallbackList;
                if (remoteCallbackList2 != null) {
                    int beginBroadcast = remoteCallbackList2.beginBroadcast();
                    for (int i11 = 0; i11 < beginBroadcast; i11++) {
                        try {
                            IRewardAdInteractionListener broadcastItem = remoteCallbackList2.getBroadcastItem(i11);
                            if (broadcastItem != null) {
                                if ("onAdShow".equals(str2)) {
                                    broadcastItem.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    broadcastItem.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    broadcastItem.onAdVideoBarClick();
                                } else if ("onRewardVerify".equals(str2)) {
                                    broadcastItem.onRewardVerify(z8, i9, str3, i10, str4);
                                } else if ("recycleRes".equals(str2)) {
                                    broadcastItem.onDestroy();
                                }
                            }
                        } catch (Throwable th) {
                            tG.zp("MultiProcess", "reward1 '" + str2 + "'  throws Exception :", th);
                        }
                    }
                    remoteCallbackList2.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList2.kill();
                    }
                }
            }
        } catch (Throwable th2) {
            tG.zp("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th2);
        }
    }
}
