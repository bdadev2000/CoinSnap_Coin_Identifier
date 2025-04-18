package com.bytedance.sdk.openadsdk.multipro.aidl.YFl;

import a4.j;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import java.util.Map;

/* loaded from: classes.dex */
public class DSW extends YFl {
    private static volatile DSW Sg;
    private static final Map<String, RemoteCallbackList<IRewardAdInteractionListener>> YFl = j.r();

    public static DSW YFl() {
        if (Sg == null) {
            synchronized (DSW.class) {
                if (Sg == null) {
                    Sg = new DSW();
                }
            }
        }
        return Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) throws RemoteException {
        YFl(str, str2, z10, i10, str3, i11, str4);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iRewardAdInteractionListener);
        YFl.put(str, remoteCallbackList);
    }

    private synchronized void YFl(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList;
        try {
            Map<String, RemoteCallbackList<IRewardAdInteractionListener>> map = YFl;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackList = map.remove(str);
                } else {
                    remoteCallbackList = map.get(str);
                }
                RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList2 = remoteCallbackList;
                if (remoteCallbackList2 != null) {
                    int beginBroadcast = remoteCallbackList2.beginBroadcast();
                    for (int i12 = 0; i12 < beginBroadcast; i12++) {
                        try {
                            IRewardAdInteractionListener broadcastItem = remoteCallbackList2.getBroadcastItem(i12);
                            if (broadcastItem != null) {
                                if ("onAdShow".equals(str2)) {
                                    broadcastItem.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    broadcastItem.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    broadcastItem.onAdVideoBarClick();
                                } else if ("onRewardVerify".equals(str2)) {
                                    broadcastItem.onRewardVerify(z10, i10, str3, i11, str4);
                                } else if ("recycleRes".equals(str2)) {
                                    broadcastItem.onDestroy();
                                }
                            }
                        } catch (Throwable th2) {
                            YoT.YFl("MultiProcess", "reward1 '" + str2 + "'  throws Exception :", th2);
                        }
                    }
                    remoteCallbackList2.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackList2.kill();
                    }
                }
            }
        } catch (Throwable th3) {
            YoT.YFl("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th3);
        }
    }
}
