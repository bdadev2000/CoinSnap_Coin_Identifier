package com.bytedance.sdk.openadsdk.jU;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.Bj;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.dT.KS;
import com.bytedance.sdk.openadsdk.lMd.KS;
import com.bytedance.sdk.openadsdk.utils.QUv;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    private static final String[] zp = {"gecko-pangle-sg.byteoversea.com"};

    /* loaded from: classes.dex */
    public static class zp {
        private static final lMd zp = new lMd();
    }

    public static void KS() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.jU.lMd.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return QUv.jU();
                }
            });
        } catch (Throwable th) {
            tG.zp("GeckoHub", "setThreadPoolExecutor error", th);
        }
    }

    private static String jU() {
        String[] mW = KVG.jU().mW();
        if (mW == null) {
            mW = zp;
        }
        String str = mW[new SecureRandom().nextInt(mW.length)];
        if (TextUtils.isEmpty(str)) {
            SecureRandom secureRandom = new SecureRandom();
            String[] strArr = zp;
            return strArr[secureRandom.nextInt(strArr.length)];
        }
        return str;
    }

    public ILoader lMd() {
        try {
            return GeckoHubImp.inst(KVG.zp()).getGeckoResLoader();
        } catch (Throwable th) {
            tG.zp("GeckoHub", "getGeckoResLoader error", th);
            return null;
        }
    }

    private lMd() {
        try {
            GeckoHubImp.inst(KVG.zp());
        } catch (Throwable th) {
            tG.zp("GeckoHub", "GeckoHubImp init error", th);
        }
    }

    public static lMd zp() {
        return zp.zp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd(Map<String, woN> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<woN> it = map.values().iterator();
            while (it.hasNext()) {
                KS.zp(it.next(), jSONObject);
            }
        } catch (Throwable th) {
            tG.zp("GeckoHub", "upLoadStateEvent error", th);
        }
    }

    public void zp(final Map<String, woN> map) {
        try {
            String zp2 = Bj.zp(KVG.zp());
            if (TextUtils.isEmpty(zp2)) {
                return;
            }
            Iterator<woN> it = map.values().iterator();
            while (it.hasNext()) {
                KS.lMd(it.next());
            }
            GeckoHubImp.setRandomHost(jU());
            GeckoHubImp.inst(KVG.zp()).preload(zp2, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.jU.lMd.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        woN won = (woN) map.get(jSONObject.optString("channel"));
                        if (won != null) {
                            KS.zp.zp(str, jSONObject, won);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        lMd.lMd(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.jU.zp());
        } catch (Throwable th) {
            lMd(map, null, th.toString());
            tG.zp("GeckoHub", "releaseGeckoResLoader error", th);
        }
    }

    public void zp(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(KVG.zp()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th) {
                tG.zp("GeckoHub", "releaseGeckoResLoader error", th);
            }
        }
    }

    public WebResourceResponseModel zp(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(KVG.zp()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th) {
            tG.zp("GeckoHub", "findRes error", th);
            return null;
        }
    }

    public int zp(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(KVG.zp()).getResCount(iLoader, str);
        } catch (Throwable th) {
            tG.zp("GeckoHub", "getResCount error", th);
            return 0;
        }
    }
}
