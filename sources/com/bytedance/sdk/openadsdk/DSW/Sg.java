package com.bytedance.sdk.openadsdk.DSW;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AlY.tN;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.pDU.tN;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    private static final String[] YFl = {"gecko-pangle-sg.byteoversea.com"};

    /* loaded from: classes.dex */
    public static class YFl {
        private static final Sg YFl = new Sg();
    }

    private static String AlY() {
        String[] ib2 = lG.AlY().ib();
        if (ib2 == null) {
            ib2 = YFl;
        }
        String str = ib2[new SecureRandom().nextInt(ib2.length)];
        if (TextUtils.isEmpty(str)) {
            SecureRandom secureRandom = new SecureRandom();
            String[] strArr = YFl;
            return strArr[secureRandom.nextInt(strArr.length)];
        }
        return str;
    }

    public static void tN() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.DSW.Sg.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return mn.AlY();
                }
            });
        } catch (Throwable th2) {
            YoT.YFl("GeckoHub", "setThreadPoolExecutor error", th2);
        }
    }

    public ILoader Sg() {
        try {
            return GeckoHubImp.inst(lG.YFl()).getGeckoResLoader();
        } catch (Throwable th2) {
            YoT.YFl("GeckoHub", "getGeckoResLoader error", th2);
            return null;
        }
    }

    private Sg() {
        try {
            GeckoHubImp.inst(lG.YFl());
        } catch (Throwable th2) {
            YoT.YFl("GeckoHub", "GeckoHubImp init error", th2);
        }
    }

    public static Sg YFl() {
        return YFl.YFl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(Map<String, Wwa> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put(NotificationCompat.CATEGORY_MESSAGE, str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            Iterator<Wwa> it = map.values().iterator();
            while (it.hasNext()) {
                tN.YFl(it.next(), jSONObject);
            }
        } catch (Throwable th2) {
            YoT.YFl("GeckoHub", "upLoadStateEvent error", th2);
        }
    }

    public void YFl(final Map<String, Wwa> map) {
        try {
            String YFl2 = com.bytedance.sdk.openadsdk.core.YoT.YFl(lG.YFl());
            if (TextUtils.isEmpty(YFl2)) {
                return;
            }
            Iterator<Wwa> it = map.values().iterator();
            while (it.hasNext()) {
                tN.Sg(it.next());
            }
            GeckoHubImp.setRandomHost(AlY());
            GeckoHubImp.inst(lG.YFl()).preload(YFl2, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.DSW.Sg.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        Wwa wwa = (Wwa) map.get(jSONObject.optString("channel"));
                        if (wwa != null) {
                            tN.YFl.YFl(str, jSONObject, wwa);
                            return;
                        }
                        return;
                    }
                    if ("download_gecko_end".equals(str)) {
                        Sg.Sg(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.DSW.YFl());
        } catch (Throwable th2) {
            Sg(map, null, th2.toString());
            YoT.YFl("GeckoHub", "releaseGeckoResLoader error", th2);
        }
    }

    public void YFl(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(lG.YFl()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th2) {
                YoT.YFl("GeckoHub", "releaseGeckoResLoader error", th2);
            }
        }
    }

    public WebResourceResponseModel YFl(ILoader iLoader, String str, String str2) {
        if (iLoader == null) {
            return null;
        }
        try {
            return GeckoHubImp.inst(lG.YFl()).findResAndMsg(iLoader, str, str2);
        } catch (Throwable th2) {
            YoT.YFl("GeckoHub", "findRes error", th2);
            return null;
        }
    }

    public int YFl(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(lG.YFl()).getResCount(iLoader, str);
        } catch (Throwable th2) {
            YoT.YFl("GeckoHub", "getResCount error", th2);
            return 0;
        }
    }
}
