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
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.Bj;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.settings.COT;
import com.bytedance.sdk.openadsdk.lMd.KS;
import com.bytedance.sdk.openadsdk.lMd.QR;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class ApmHelper {
    private static lMd COT = null;
    private static zp HWF = null;
    private static boolean KS = false;
    private static boolean jU = false;
    private static String lMd = null;
    private static boolean zp = false;

    /* loaded from: classes.dex */
    public interface lMd {
        void zp(String str, String str2, Throwable th);
    }

    /* loaded from: classes.dex */
    public static class zp {
        public final Throwable KS;
        public final String lMd;
        public final String zp;

        public zp(String str, String str2, Throwable th) {
            this.zp = str;
            this.lMd = str2;
            this.KS = th;
        }
    }

    public static /* synthetic */ String COT() {
        return dT();
    }

    public static /* synthetic */ Map KS() {
        return YW();
    }

    private static Map<String, String> YW() {
        HashMap hashMap = new HashMap();
        woN zp2 = com.bytedance.sdk.openadsdk.utils.lMd.zp();
        if (zp2 != null) {
            hashMap.put("adType", String.valueOf(zp2.WJ()));
            hashMap.put("aid", String.valueOf(zp2.LU()));
            hashMap.put(BidResponsedEx.KEY_CID, zp2.fgJ());
            hashMap.put("reqId", zp2.Gor());
            hashMap.put("rit", zp2.RCv("-1"));
            int yRU = zp2.yRU();
            if (zp2.cz() != 2) {
                yRU = -1;
            }
            hashMap.put("render_type", String.valueOf(yRU));
        }
        return hashMap;
    }

    private static String dT() {
        COT jU2 = KVG.jU();
        if (jU2 != null) {
            if (jU2.tG()) {
                return "support_mem_dynamic_1";
            }
            return "support_mem_dynamic_0";
        }
        return "release";
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        QUv.zp(new ku("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (!ApmHelper.zp) {
                    COT jU2 = KVG.jU();
                    boolean unused = ApmHelper.KS = jU2.DY();
                    if (ApmHelper.KS && !TextUtils.isEmpty(jU2.ffE())) {
                        String unused2 = ApmHelper.lMd = initConfig.getAppId();
                        String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                        String zp2 = Bj.zp(context);
                        String ffE = jU2.ffE();
                        try {
                            final MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 6003L, BuildConfig.VERSION_NAME, strArr);
                            initSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                @Override // com.apm.insight.AttachUserData
                                @Nullable
                                public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                    Map<? extends String, ? extends String> KS2 = ApmHelper.KS();
                                    if (KS2.containsKey("render_type")) {
                                        initSDK.addTags("render_type", KS2.get("render_type"));
                                    } else {
                                        initSDK.addTags("render_type", "-2");
                                    }
                                    return KS2;
                                }
                            });
                            if (jU2.REM()) {
                                initSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so"});
                            }
                            initSDK.config().setDeviceId(zp2);
                            initSDK.setReportUrl(ffE);
                            initSDK.addTags("host_appid", ApmHelper.lMd);
                            initSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                            initSDK.config().setChannel(ApmHelper.COT());
                            lMd unused3 = ApmHelper.COT = new lMd() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                @Override // com.bytedance.sdk.openadsdk.ApmHelper.lMd
                                public void zp(String str, String str2, Throwable th) {
                                    initSDK.reportCustomErr(str, str2, th);
                                }
                            };
                            boolean unused4 = ApmHelper.zp = true;
                            ApmHelper.KS(zp2, ffE);
                            initSDK.registerCrashCallback(new ICrashCallback() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                @Override // com.apm.insight.ICrashCallback
                                public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
                                    if (!ApmHelper.jU) {
                                        ApmHelper.jU(crashType.getName());
                                    }
                                    boolean unused5 = ApmHelper.jU = true;
                                }
                            }, CrashType.ALL);
                            zp zpVar = ApmHelper.HWF;
                            zp unused5 = ApmHelper.HWF = null;
                            if (zpVar != null) {
                                ApmHelper.COT.zp(zpVar.zp, zpVar.lMd, zpVar.KS);
                            }
                        } catch (Throwable unused6) {
                            boolean unused7 = ApmHelper.zp = false;
                        }
                    }
                }
            }
        });
    }

    public static boolean isIsInit() {
        return zp;
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        lMd lmd = COT;
        if (lmd != null) {
            lmd.zp(str, str2, th);
        } else {
            HWF = new zp(str, str2, th);
        }
    }

    public static void reportPvFromBackGround() {
        if (KS) {
            lMd(Bj.zp(KVG.zp()), KVG.jU().ffE());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jU(final String str) {
        final woN zp2 = com.bytedance.sdk.openadsdk.utils.lMd.zp();
        if (zp2 != null) {
            String zp3 = YhE.zp(zp2);
            if (TextUtils.isEmpty(zp3)) {
                return;
            }
            KS.zp(System.currentTimeMillis(), zp2, zp3, "sdk_crash_info", new JSONObject(), (QR) null, new com.bytedance.sdk.openadsdk.lMd.lMd.zp() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.2
                @Override // com.bytedance.sdk.openadsdk.lMd.lMd.zp
                public void zp(JSONObject jSONObject) throws JSONException {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", str);
                    jSONObject2.put("material", com.bytedance.sdk.component.utils.zp.zp(zp2.Eg()).toString());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void KS(String str, String str2) {
        lMd(str, str2);
    }

    private static JSONObject KS(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", lMd);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("channel", dT());
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", 6003);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e4) {
            tG.zp("ApmHelper", e4.getMessage());
        }
        return jSONObject;
    }

    private static void lMd(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String e4 = AbstractC2914a.e("https://", str2, "/monitor/collect/c/session?version_code=6003&device_platform=android&aid=10000001");
        KVG.KS().zp(KS(str), e4);
    }
}
