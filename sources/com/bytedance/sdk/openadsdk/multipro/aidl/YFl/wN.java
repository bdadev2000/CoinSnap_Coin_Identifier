package com.bytedance.sdk.openadsdk.multipro.aidl.YFl;

import a4.j;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Map;

/* loaded from: classes.dex */
public class wN extends YFl {
    private static volatile wN Sg;
    private static final Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> YFl = j.r();

    public static wN YFl() {
        if (Sg == null) {
            synchronized (wN.class) {
                if (Sg == null) {
                    Sg = new wN();
                }
            }
        }
        return Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        YFl(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        YFl.put(str, remoteCallbackList);
    }

    private synchronized void YFl(String str, String str2) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> map = YFl;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                if (remoteCallbackList != null) {
                    int beginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i10 = 0; i10 < beginBroadcast; i10++) {
                        try {
                            IFullScreenVideoAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i10);
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
                        } catch (Throwable th2) {
                            YoT.YFl("MultiProcess", "fullScreen2 method " + str2 + " throws Exception :", th2);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th3) {
            YoT.YFl("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th3);
        }
    }
}
