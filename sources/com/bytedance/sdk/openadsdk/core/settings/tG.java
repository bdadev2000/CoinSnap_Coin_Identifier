package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.yRU;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.bytedance.sdk.openadsdk.utils.ox;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tG extends com.bytedance.sdk.component.ku.ku {
    private final jU KS;
    private final vDp lMd;
    private final zp zp;

    /* loaded from: classes.dex */
    public interface zp {
        void zp(boolean z8);
    }

    public tG(zp zpVar, vDp vdp, jU jUVar) {
        super("SetF");
        this.zp = zpVar;
        this.lMd = vdp;
        this.KS = jUVar;
    }

    private JSONObject lMd(JSONObject jSONObject) {
        return com.bytedance.sdk.component.utils.zp.zp(jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int zp2 = yRU.zp(KVG.zp(), 0L);
        if (zp2 == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.zp.zp(false);
            return;
        }
        final com.bytedance.sdk.openadsdk.dT.zp.jU jUVar = new com.bytedance.sdk.openadsdk.dT.zp.jU(1);
        JSONObject zp3 = zp(zp2);
        com.bytedance.sdk.component.QR.lMd.jU lMd = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().lMd();
        try {
            String zp4 = com.bytedance.sdk.openadsdk.COT.jU.zp(lMd, YhE.jU("/api/ad/union/sdk/settings/"));
            lMd.lMd(zp4);
            lMd.lMd(Command.HTTP_HEADER_USER_AGENT, YhE.KS());
            jUVar.zp(zp4);
        } catch (Exception unused) {
        }
        String jSONObject = lMd(zp3).toString();
        if (KVG.jU().rCC() && com.bytedance.sdk.openadsdk.core.yRU.zp().QR() == 1) {
            YhE.zp("Pangle_Debug_Mode", jSONObject, KVG.zp());
        }
        lMd.zp(jSONObject, KVG.jU().vwr());
        jUVar.zp(lMd.KS()).zp();
        lMd.zp(6);
        lMd.zp("setting");
        lMd.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.core.settings.tG.1
            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
                JSONObject jSONObject2;
                int optInt;
                int zp5 = lmd.zp();
                String jU = lmd.jU();
                if (KVG.jU().rCC() && com.bytedance.sdk.openadsdk.core.yRU.zp().QR() == 1) {
                    YhE.zp("Pangle_Debug_Mode", jU, KVG.zp());
                }
                if (lmd.HWF() && !TextUtils.isEmpty(jU)) {
                    jUVar.KS(jU).zp(zp5).zp(true).KS();
                    String str = null;
                    try {
                        jSONObject2 = new JSONObject(jU);
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null && (optInt = jSONObject2.optInt("cypher", -1)) != -1) {
                        if (optInt == 3) {
                            str = com.bytedance.sdk.component.utils.zp.KS(jSONObject2.optString("message"));
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    jSONObject2 = new JSONObject(str);
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                        try {
                            tG.this.zp(str, lmd.KS());
                        } catch (Throwable unused4) {
                        }
                        try {
                            tG.this.zp(jSONObject2);
                            KVG.jU().zp(System.currentTimeMillis());
                        } catch (Throwable unused5) {
                        }
                        tG.this.zp.zp(true);
                        com.bytedance.sdk.openadsdk.core.HWF.zp.zp();
                        return;
                    }
                }
                jUVar.KS(jU).zp(zp5).jU(lmd.lMd()).zp(lmd.HWF()).KS();
                tG.this.zp.zp(false);
            }

            @Override // com.bytedance.sdk.component.QR.zp.zp
            public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                jUVar.jU(iOException != null ? iOException.getMessage() : null).zp(false).KS();
                tG.this.zp.zp(false);
                com.bytedance.sdk.openadsdk.core.HWF.zp.zp();
            }
        });
        DeviceUtils.Bj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(String str, Map<String, String> map) {
        int i9 = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        hashMap.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                int parseInt = Integer.parseInt((String) hashMap.get("active-control"));
                long parseLong = Long.parseLong((String) hashMap.get(CampaignEx.JSON_KEY_ST_TS));
                String str2 = (String) hashMap.get("pst");
                String zp2 = com.bykv.vk.openvk.component.video.api.HWF.lMd.zp(str + parseInt + parseLong);
                if (zp2 != null) {
                    if (zp2.equalsIgnoreCase(str2)) {
                        i9 = parseInt;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        Bj.zp(i9);
    }

    @NonNull
    private JSONObject zp(int i9) {
        JSONObject jSONObject = new JSONObject();
        try {
            COT jU = KVG.jU();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", YhE.dQp());
            if (jU.irS("gaid")) {
                jSONObject.put("gaid", com.com.bytedance.overseas.sdk.lMd.zp.zp().lMd());
            }
            jSONObject.put("gdpr", com.bytedance.sdk.openadsdk.core.ku.lMd().ku());
            jSONObject.put("coppa", com.bytedance.sdk.openadsdk.core.ku.lMd().QR());
            jSONObject.put("ccpa", com.bytedance.sdk.openadsdk.core.ku.lMd().cz());
            if (jU.irS("mcc")) {
                jSONObject.put("mcc", ox.lMd());
            }
            Context zp2 = KVG.zp();
            jSONObject.put("conn_type", YhE.QR(i9));
            int i10 = 1;
            jSONObject.put("os", 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.Bj.zp());
            jSONObject.put("time_zone", YhE.vwr());
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, YhE.COT());
            if (!YhE.zp()) {
                i10 = 2;
            }
            jSONObject.put("position", i10);
            jSONObject.put("app_version", YhE.QR());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.Bj.KS(zp2));
            String jU2 = com.bytedance.sdk.openadsdk.core.ku.lMd().jU();
            if (jU2 != null) {
                jSONObject.put(MBridgeConstans.APP_ID, jU2);
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis);
            String str = "";
            if (jU2 != null) {
                str = jU2.concat(String.valueOf(currentTimeMillis)).concat(BuildConfig.VERSION_NAME);
            }
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.COT.zp(str));
            jSONObject.put("tcstring", dQp.KS(zp2));
            jSONObject.put("tcf_gdpr", dQp.lMd(zp2));
            jSONObject.put("lmt", DeviceUtils.KS());
            jSONObject.put("locale_language", DeviceUtils.jU());
            jSONObject.put("channel", "main");
            JSONObject COT = jU.COT();
            if (COT != null) {
                jSONObject.put("digest", COT);
            }
            jSONObject.put("data_time", jU.HWF());
            jSONObject.put("app_set_id_scope", KS.lMd());
            jSONObject.put("app_set_id", KS.KS());
            jSONObject.put("installed_source", KS.jU());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public boolean zp(@NonNull JSONObject jSONObject) {
        this.lMd.zp(jSONObject);
        this.KS.zp(jSONObject);
        return this.lMd.KS;
    }

    public static boolean zp() {
        return BinderPoolService.zp;
    }
}
