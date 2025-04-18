package com.bytedance.sdk.openadsdk.multipro.aidl.YFl;

import a4.j;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import java.util.Map;

/* loaded from: classes.dex */
public class Sg extends YFl {
    private static volatile Sg Sg;
    private static final Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> YFl = j.r();

    public static Sg YFl() {
        if (Sg == null) {
            synchronized (Sg.class) {
                if (Sg == null) {
                    Sg = new Sg();
                }
            }
        }
        return Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        YFl(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        YFl.put(str, remoteCallbackList);
    }

    private synchronized void YFl(String str, String str2) {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> map = YFl;
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
                            IAppOpenAdInteractionListener broadcastItem = remoteCallbackList.getBroadcastItem(i10);
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
                        } catch (Throwable th2) {
                            YoT.YFl("MultiProcess", "appOpenAd2 method " + str2 + " throws Exception :", th2);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList.kill();
                    }
                }
            }
        } catch (Throwable th3) {
            YoT.YFl("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th3);
        }
    }
}
