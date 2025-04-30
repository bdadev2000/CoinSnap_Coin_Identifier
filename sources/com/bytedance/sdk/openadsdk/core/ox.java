package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class ox implements ot {
    private static final Map<Integer, String> COT = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.ox.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, "gaid");
            put(4, "apk-sign");
            put(5, "app_set_id_scope");
            put(6, "app_set_id");
            put(7, "installed_source");
            put(8, "app_running_time");
            put(9, "vendor");
            put(10, "model");
            put(11, "user_agent_device");
            put(12, "user_agent_webview");
            put(13, "sys_compiling_time");
            put(14, "sec_did");
            put(15, "url");
            put(16, "X-Argus");
            put(17, "X-Ladon");
            put(18, "X-Khronos");
            put(19, "X-Gorgon");
            put(20, "pangle_m");
            put(21, "screen_height");
            put(22, "screen_width");
            put(23, "rom_version");
            put(24, "carrier_name");
            put(25, "os_version");
            put(26, "conn_type");
            put(27, "boot");
        }
    };
    boolean zp = false;
    boolean lMd = false;
    String KS = "com.union_test.internationad";
    String jU = "8025677";
    private int HWF = 0;

    @Override // com.bytedance.sdk.openadsdk.core.ot
    /* renamed from: COT, reason: merged with bridge method [inline-methods] */
    public ox lMd(String str) {
        ku.lMd().lMd(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public int HWF() {
        return ku.lMd().cz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public ot KS(int i9) {
        ku.lMd().KS(i9);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public int QR() {
        return this.HWF;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    /* renamed from: jU, reason: merged with bridge method [inline-methods] */
    public ox zp(String str) {
        ku.lMd().zp(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public String COT() {
        return KS((String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public ot HWF(int i9) {
        ku.lMd().zp(i9);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public int KS() {
        return ku.lMd().ku();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public String jU() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public ot lMd(int i9) {
        ku.lMd().lMd(i9);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public ot zp(int i9) {
        ku.lMd().COT(i9);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public ot COT(int i9) {
        this.HWF = i9;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public String KS(String str) {
        int i9;
        YhE.dT("getBiddingToken");
        com.bytedance.sdk.openadsdk.core.COT.KS.zp();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_init", tG.COT() ? 1 : 0);
            String dT = KVG.jU().dT();
            String FP = KVG.jU().FP();
            if (dT != null && FP != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("version", dT);
                jSONObject3.put("param", FP);
                jSONObject2.put("abtest", jSONObject3);
            }
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put(CampaignEx.JSON_KEY_PACKAGE_NAME, YhE.COT());
            jSONObject2.put("user_data", vwr.zp(TextUtils.isEmpty(str) ? null : new AdSlot.Builder().setCodeId(str).build()));
            jSONObject2.put(CampaignEx.JSON_KEY_ST_TS, System.currentTimeMillis() / 1000);
            if (jSONObject2.toString().getBytes().length <= 2680) {
                com.bytedance.sdk.openadsdk.core.settings.COT jU = KVG.jU();
                if (jU.irS("gaid")) {
                    jSONObject2.put("gaid", com.com.bytedance.overseas.sdk.lMd.zp.zp().lMd());
                }
                Context zp = KVG.zp();
                jSONObject2.put("apk-sign", com.bytedance.sdk.openadsdk.common.zp.QR());
                jSONObject2.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.KS.lMd());
                jSONObject2.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.KS.KS());
                jSONObject2.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.KS.jU());
                jSONObject2.put("app_running_time", (System.currentTimeMillis() - tG.zp()) / 1000);
                jSONObject2.put("vendor", Build.MANUFACTURER);
                jSONObject2.put("model", Build.MODEL);
                jSONObject2.put("user_agent_device", YhE.lMd());
                jSONObject2.put("user_agent_webview", YhE.KS());
                jSONObject2.put("sys_compiling_time", Bj.lMd(zp));
                jSONObject2.put("screen_height", WNy.jU(zp));
                jSONObject2.put("screen_width", WNy.KS(zp));
                jSONObject2.put("rom_version", com.bytedance.sdk.openadsdk.utils.yRU.zp());
                jSONObject2.put("carrier_name", com.bytedance.sdk.openadsdk.utils.ox.zp());
                jSONObject2.put("os_version", Build.VERSION.RELEASE);
                jSONObject2.put("conn_type", YhE.vDp(zp));
                if (jU.irS("boot")) {
                    jSONObject2.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                }
                com.bytedance.sdk.openadsdk.core.COT.KS.zp(jSONObject2);
                i9 = COT.size();
            } else {
                i9 = 2;
            }
            while (i9 > 0 && jSONObject2.toString().getBytes().length > 2680) {
                jSONObject2.remove(COT.get(Integer.valueOf(i9)));
                i9--;
            }
            jSONObject = com.bytedance.sdk.component.utils.zp.zp(jSONObject2);
            while (i9 > 0 && jSONObject.toString().getBytes().length > 4096) {
                jSONObject2.remove(COT.get(Integer.valueOf(i9)));
                jSONObject = com.bytedance.sdk.component.utils.zp.zp(jSONObject2);
                i9--;
            }
            if (com.bytedance.sdk.component.utils.tG.jU()) {
                Objects.toString(jSONObject);
                int length = jSONObject.toString().getBytes().length;
            }
        } catch (Throwable unused) {
        }
        Objects.toString(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public ot jU(int i9) {
        ku.lMd().HWF(i9);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public int lMd() {
        return ku.lMd().QR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public ot zp() {
        com.bytedance.sdk.component.utils.tG.zp("PangleSDK-6003");
        com.bykv.vk.openvk.component.video.api.HWF.KS.zp("PangleSDK-6003");
        com.bytedance.sdk.component.utils.tG.lMd();
        com.bytedance.sdk.component.QR.zp.zp();
        com.bykv.vk.openvk.component.video.api.HWF.KS.zp();
        com.bytedance.sdk.openadsdk.utils.pvr.zp();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ot
    public boolean zp(String str, int i9, String str2, String str3, String str4) {
        if (!this.KS.equals(KVG.zp().getPackageName()) || !this.jU.equals(ku.lMd().jU()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Method zp = com.bytedance.sdk.component.utils.ox.zp("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
            if (zp == null) {
                return true;
            }
            zp.invoke(null, str, Integer.valueOf(i9), str2, str3, str4);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }
}
