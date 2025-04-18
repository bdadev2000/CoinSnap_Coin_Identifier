package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.MonitorCrash;
import com.applovin.impl.mediation.ads.e;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.openadsdk.AlY.tN;
import com.bytedance.sdk.openadsdk.core.YoT;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.settings.vc;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ApmHelper {
    private static boolean AlY = false;
    private static YFl DSW = null;
    private static volatile boolean YFl = false;
    private static String tN;

    /* renamed from: vc, reason: collision with root package name */
    private static Sg f10513vc;
    private static final AtomicBoolean Sg = new AtomicBoolean(false);
    private static boolean wN = false;

    /* loaded from: classes.dex */
    public interface Sg {
        void YFl(String str, String str2, Throwable th2);
    }

    /* loaded from: classes.dex */
    public static class YFl {
        public final String Sg;
        public final String YFl;
        public final Throwable tN;

        public YFl(String str, String str2, Throwable th2) {
            this.YFl = str;
            this.Sg = str2;
            this.tN = th2;
        }
    }

    private static Map<String, String> NjR() {
        HashMap hashMap = new HashMap();
        Wwa YFl2 = com.bytedance.sdk.openadsdk.utils.Sg.YFl();
        if (YFl2 != null) {
            hashMap.put("adType", String.valueOf(YFl2.JGG()));
            hashMap.put("aid", String.valueOf(YFl2.oa()));
            hashMap.put(BidResponsedEx.KEY_CID, YFl2.zz());
            hashMap.put("reqId", YFl2.ivp());
            hashMap.put("rit", YFl2.UZM("-1"));
            int UZM = YFl2.UZM();
            if (YFl2.Ne() != 2) {
                UZM = -1;
            }
            hashMap.put("render_type", String.valueOf(UZM));
        }
        return hashMap;
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (!Sg.compareAndSet(false, true) || YFl) {
            return;
        }
        mn.YFl(new qsH("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!ApmHelper.YFl) {
                    vc AlY2 = lG.AlY();
                    boolean unused = ApmHelper.AlY = AlY2.ko();
                    if (ApmHelper.AlY && !TextUtils.isEmpty(AlY2.zB())) {
                        String unused2 = ApmHelper.tN = initConfig.getAppId();
                        String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                        String YFl2 = YoT.YFl(context);
                        String zB = AlY2.zB();
                        try {
                            final MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 6304L, BuildConfig.VERSION_NAME, strArr);
                            initSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                @Override // com.apm.insight.AttachUserData
                                @Nullable
                                public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                    Map<? extends String, ? extends String> tN2 = ApmHelper.tN();
                                    if (tN2.containsKey("render_type")) {
                                        initSDK.addTags("render_type", tN2.get("render_type"));
                                    } else {
                                        initSDK.addTags("render_type", "-2");
                                    }
                                    return tN2;
                                }
                            });
                            if (AlY2.in()) {
                                initSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "libtt_ugen_yoga.so"});
                            }
                            initSDK.config().setDeviceId(YFl2);
                            initSDK.setReportUrl(zB);
                            initSDK.addTags("host_appid", ApmHelper.tN);
                            initSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                            Sg unused3 = ApmHelper.f10513vc = new Sg() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                @Override // com.bytedance.sdk.openadsdk.ApmHelper.Sg
                                public void YFl(String str, String str2, Throwable th2) {
                                    initSDK.reportCustomErr(str, str2, th2);
                                }
                            };
                            boolean unused4 = ApmHelper.YFl = true;
                            ApmHelper.tN(YFl2, zB);
                            initSDK.registerCrashCallback(new ICrashCallback() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                @Override // com.apm.insight.ICrashCallback
                                public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
                                    if (!ApmHelper.wN) {
                                        ApmHelper.AlY(crashType.getName());
                                    }
                                    boolean unused5 = ApmHelper.wN = true;
                                }
                            }, CrashType.ALL);
                            YFl yFl = ApmHelper.DSW;
                            YFl unused5 = ApmHelper.DSW = null;
                            if (yFl != null) {
                                ApmHelper.f10513vc.YFl(yFl.YFl, yFl.Sg, yFl.tN);
                            }
                        } catch (Throwable unused6) {
                            boolean unused7 = ApmHelper.YFl = false;
                        }
                    }
                }
                ApmHelper.Sg.set(false);
            }
        });
    }

    public static boolean isIsInit() {
        return YFl;
    }

    public static void reportCustomError(String str, String str2, Throwable th2) {
        Sg sg2 = f10513vc;
        if (sg2 != null) {
            sg2.YFl(str, str2, th2);
        } else {
            DSW = new YFl(str, str2, th2);
        }
    }

    public static void reportPvFromBackGround() {
        if (AlY) {
            Sg(YoT.YFl(lG.YFl()), lG.AlY().zB());
        }
    }

    public static /* synthetic */ Map tN() {
        return NjR();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void AlY(final String str) {
        final Wwa YFl2 = com.bytedance.sdk.openadsdk.utils.Sg.YFl();
        if (YFl2 != null) {
            String YFl3 = Sco.YFl(YFl2);
            if (TextUtils.isEmpty(YFl3)) {
                return;
            }
            tN.YFl(System.currentTimeMillis(), YFl2, YFl3, "sdk_crash_info", new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.2
                @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
                public JSONObject YFl() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", str);
                        jSONObject2.put("material", com.bytedance.sdk.component.utils.YFl.YFl(YFl2.ni()).toString());
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (JSONException unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tN(String str, String str2) {
        Sg(str, str2);
    }

    private static void Sg(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String f10 = e.f("https://", str2, "/monitor/collect/c/session?version_code=6304&device_platform=android&aid=10000001");
        lG.tN().YFl(tN(str), f10);
    }

    private static JSONObject tN(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", tN);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("ApmHelper", e2.getMessage());
        }
        return jSONObject;
    }
}
