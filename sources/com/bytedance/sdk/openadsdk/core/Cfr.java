package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class Cfr implements YI {
    private static final Map<Integer, String> wN = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.Cfr.1
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
            put(28, "feature_data");
        }
    };
    boolean YFl = false;
    boolean Sg = false;
    String tN = "com.union_test.internationad";
    String AlY = "8025677";

    /* renamed from: vc, reason: collision with root package name */
    private int f10623vc = 0;

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public String AlY() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public int DSW() {
        return this.f10623vc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public YI tN(int i10) {
        NjR.Sg().tN(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public int vc() {
        return NjR.Sg().aIu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    /* renamed from: wN, reason: merged with bridge method [inline-methods] */
    public Cfr Sg(String str) {
        NjR.Sg().tN(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    /* renamed from: AlY, reason: merged with bridge method [inline-methods] */
    public Cfr YFl(String str) {
        NjR.Sg().YFl(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public YI Sg(int i10) {
        NjR.Sg().Sg(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public YI YFl(int i10) {
        NjR.Sg().wN(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public int tN() {
        return NjR.Sg().NjR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public YI vc(int i10) {
        NjR.Sg().YFl(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public String wN() {
        return tN((String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public YI AlY(int i10) {
        NjR.Sg().vc(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public int Sg() {
        return NjR.Sg().qsH();
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public YI YFl() {
        com.bytedance.sdk.component.utils.YoT.YFl("PangleSDK-6304");
        com.bytedance.sdk.component.utils.YoT.Sg();
        com.bytedance.sdk.component.DSW.YFl.YFl();
        com.bytedance.sdk.openadsdk.utils.aIu.YFl();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public String tN(String str) {
        int i10;
        Sco.nc("getBiddingToken");
        com.bytedance.sdk.openadsdk.core.NjR.tN.YFl();
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z10 = true;
            jSONObject.put("is_init", pDU.wN() ? 1 : 0);
            String nc2 = lG.AlY().nc();
            String aIu = lG.AlY().aIu();
            if (nc2 != null && aIu != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", nc2);
                jSONObject2.put("param", aIu);
                jSONObject.put("abtest", jSONObject2);
            }
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, Sco.wN());
            jSONObject.put("user_data", aIu.YFl(TextUtils.isEmpty(str) ? null : new AdSlot.Builder().setCodeId(str).build()));
            jSONObject.put(CampaignEx.JSON_KEY_ST_TS, System.currentTimeMillis() / 1000);
            if (jSONObject.toString().getBytes().length <= 2680) {
                com.bytedance.sdk.openadsdk.core.settings.vc AlY = lG.AlY();
                if (AlY.dXO("gaid")) {
                    jSONObject.put("gaid", com.bytedance.sdk.openadsdk.Wwa.YFl.Sg.YFl.YFl().Sg());
                }
                Context YFl = lG.YFl();
                jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.YFl.DSW());
                jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.AlY.Sg());
                jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.AlY.tN());
                jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.AlY.AlY());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - pDU.YFl()) / 1000);
                jSONObject.put("rewardedfull_link", com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().IXB() ? 1 : 0);
                jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.qsH.YoT.Sg());
                jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.qsH.YoT.tN());
                jSONObject.put("vendor", Build.MANUFACTURER);
                jSONObject.put("model", Build.MODEL);
                jSONObject.put("user_agent_device", Sco.Sg());
                jSONObject.put("user_agent_webview", Sco.tN());
                jSONObject.put("sys_compiling_time", YoT.Sg(YFl));
                jSONObject.put("screen_height", GS.AlY(YFl));
                jSONObject.put("screen_width", GS.tN(YFl));
                jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.bZ.YFl());
                jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.YI.YFl());
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("conn_type", Sco.YoT(YFl));
                if (AlY.dXO("boot")) {
                    jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                }
                Sco.YFl(jSONObject);
                com.bytedance.sdk.openadsdk.core.NjR.tN.YFl(jSONObject);
                i10 = wN.size();
            } else {
                i10 = 2;
            }
            while (i10 > 0 && jSONObject.toString().getBytes().length > 2680) {
                jSONObject.remove(wN.get(Integer.valueOf(i10)));
                i10--;
            }
            com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl(jSONObject);
            if (!com.bytedance.sdk.openadsdk.core.settings.rkt.HVP() || !com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().YFl(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN)) {
                z10 = false;
            }
            JSONObject YFl2 = YFl(jSONObject, z10);
            while (i10 > 0 && YFl2.toString().getBytes().length > 4096) {
                jSONObject.remove(wN.get(Integer.valueOf(i10)));
                YFl2 = YFl(jSONObject, z10);
                i10--;
            }
            if (com.bytedance.sdk.component.utils.YoT.AlY()) {
                Objects.toString(YFl2);
                int length = YFl2.toString().getBytes().length;
            }
            Objects.toString(YFl2);
            return YFl2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public YI wN(int i10) {
        this.f10623vc = i10;
        return this;
    }

    private JSONObject YFl(JSONObject jSONObject, boolean z10) {
        JSONObject YFl;
        if (z10) {
            YFl = PangleEncryptManager.encryptType4(jSONObject, new wXo(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            Ne.YFl(YFl);
        } else {
            YFl = com.bytedance.sdk.component.utils.YFl.YFl(jSONObject);
        }
        return YFl != null ? YFl : new JSONObject();
    }

    @Override // com.bytedance.sdk.openadsdk.core.YI
    public boolean YFl(String str, int i10, String str2, String str3, String str4) {
        if (!this.tN.equals(lG.YFl().getPackageName()) || !this.AlY.equals(NjR.Sg().AlY()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Method YFl = com.bytedance.sdk.component.utils.VOe.YFl("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
            if (YFl != null) {
                YFl.invoke(null, str, Integer.valueOf(i10), str2, str3, str4);
            }
        } catch (Throwable unused) {
        }
        return true;
    }
}
