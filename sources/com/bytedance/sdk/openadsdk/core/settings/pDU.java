package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.Ne;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.dXO;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.YI;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import m5.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class pDU extends com.bytedance.sdk.component.qsH.qsH {
    private final GA Sg;
    private final YFl YFl;
    private final Set<wN> tN;

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(boolean z10);
    }

    public pDU(YFl yFl, GA ga2, wN... wNVarArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.tN = hashSet;
        this.YFl = yFl;
        this.Sg = ga2;
        hashSet.addAll(Arrays.asList(wNVarArr));
    }

    private JSONObject Sg(JSONObject jSONObject) {
        return com.bytedance.sdk.component.utils.YFl.YFl(jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int YFl2 = Ne.YFl(lG.YFl(), 0L);
        if (YFl2 == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.YFl.YFl(false);
            return;
        }
        final com.bytedance.sdk.openadsdk.pDU.YFl.wN wNVar = new com.bytedance.sdk.openadsdk.pDU.YFl.wN(1);
        JSONObject YFl3 = YFl(YFl2);
        com.bytedance.sdk.component.DSW.Sg.AlY Sg = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().Sg();
        try {
            String YFl4 = com.bytedance.sdk.openadsdk.qsH.AlY.YFl(Sg, Sco.AlY("/api/ad/union/sdk/settings/"));
            Sg.Sg(YFl4);
            Sg.Sg(Command.HTTP_HEADER_USER_AGENT, Sco.tN());
            wNVar.YFl(YFl4);
        } catch (Exception unused) {
        }
        String jSONObject = Sg(YFl3).toString();
        if (lG.AlY().Bh() && dXO.YFl().DSW() == 1) {
            Sco.YFl("Pangle_Debug_Mode", jSONObject, lG.YFl());
        }
        Sg.YFl(jSONObject, lG.AlY().lG());
        wNVar.YFl(Sg.AlY()).YFl();
        Sg.YFl(6);
        Sg.YFl("setting");
        com.bytedance.sdk.openadsdk.rkt.tN.YFl(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.core.settings.pDU.1
            @Override // com.bytedance.sdk.openadsdk.rkt.AlY
            public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                yFl.Sg("settings_fetch");
                return yFl;
            }
        });
        Sg.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.settings.pDU.2
            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                JSONObject jSONObject2;
                int optInt;
                int YFl5 = sg2.YFl();
                String AlY = sg2.AlY();
                if (lG.AlY().Bh() && dXO.YFl().DSW() == 1) {
                    Sco.YFl("Pangle_Debug_Mode", AlY, lG.YFl());
                }
                if (sg2.vc() && !TextUtils.isEmpty(AlY)) {
                    wNVar.tN(AlY).YFl(YFl5).YFl(true).tN();
                    String str = null;
                    try {
                        jSONObject2 = new JSONObject(AlY);
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null && (optInt = jSONObject2.optInt("cypher", -1)) != -1) {
                        if (optInt == 3) {
                            str = com.bytedance.sdk.component.utils.YFl.tN(jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    jSONObject2 = new JSONObject(str);
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                        try {
                            pDU.this.YFl(str, sg2.tN());
                        } catch (Throwable unused4) {
                        }
                        try {
                            pDU.this.YFl(jSONObject2);
                            lG.AlY().YFl(System.currentTimeMillis());
                            com.bytedance.sdk.openadsdk.rkt.tN.Sg(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.core.settings.pDU.2.1
                                @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                                public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                                    com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                                    yFl.Sg("settings_fetch");
                                    return yFl;
                                }
                            });
                        } catch (Throwable unused5) {
                        }
                        pDU.this.YFl.YFl(true);
                        com.bytedance.sdk.openadsdk.core.nc.YFl.YFl();
                        return;
                    }
                } else {
                    com.bytedance.sdk.openadsdk.rkt.tN.tN(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.core.settings.pDU.2.2
                        @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                        public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                            com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                            yFl.Sg("settings_fetch");
                            return yFl;
                        }
                    });
                }
                wNVar.tN(AlY).YFl(YFl5).AlY(sg2.Sg()).YFl(sg2.vc()).tN();
                pDU.this.YFl.YFl(false);
            }

            @Override // com.bytedance.sdk.component.DSW.YFl.YFl
            public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                wNVar.AlY(iOException != null ? iOException.getMessage() : null).YFl(false).tN();
                pDU.this.YFl.YFl(false);
                com.bytedance.sdk.openadsdk.core.nc.YFl.YFl();
                com.bytedance.sdk.openadsdk.rkt.tN.tN(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.core.settings.pDU.2.3
                    @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                    public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                        com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                        yFl.Sg("settings_fetch");
                        return yFl;
                    }
                });
            }
        });
        DeviceUtils.eT();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(String str, Map<String, String> map) {
        int i10 = 1;
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
                String a = a.a(str + parseInt + parseLong);
                if (a != null) {
                    if (a.equalsIgnoreCase(str2)) {
                        i10 = parseInt;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        YoT.YFl(i10);
    }

    public static JSONObject YFl(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            vc AlY = lG.AlY();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", Sco.EH());
            if (AlY.dXO("gaid")) {
                jSONObject.put("gaid", com.bytedance.sdk.openadsdk.Wwa.YFl.Sg.YFl.YFl().Sg());
            }
            jSONObject.put("gdpr", com.bytedance.sdk.openadsdk.core.NjR.Sg().NjR());
            jSONObject.put("coppa", com.bytedance.sdk.openadsdk.core.NjR.Sg().qsH());
            jSONObject.put("ccpa", com.bytedance.sdk.openadsdk.core.NjR.Sg().aIu());
            if (AlY.dXO("mcc")) {
                jSONObject.put("mcc", YI.Sg());
            }
            Context YFl2 = lG.YFl();
            jSONObject.put("conn_type", Sco.DSW(i10));
            int i11 = 1;
            jSONObject.put("os", 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.YoT.YFl());
            jSONObject.put("time_zone", Sco.Wwa());
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, Sco.wN());
            if (!Sco.YFl()) {
                i11 = 2;
            }
            jSONObject.put("position", i11);
            jSONObject.put("app_version", Sco.DSW());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.YoT.tN(YFl2));
            String AlY2 = com.bytedance.sdk.openadsdk.core.NjR.Sg().AlY();
            if (AlY2 != null) {
                jSONObject.put(MBridgeConstans.APP_ID, AlY2);
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis);
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.wN.YFl(AlY2 != null ? AlY2.concat(String.valueOf(currentTimeMillis)).concat(BuildConfig.VERSION_NAME) : ""));
            jSONObject.put("tcstring", rkt.tN(YFl2));
            jSONObject.put("tcf_gdpr", rkt.Sg(YFl2));
            jSONObject.put("lmt", DeviceUtils.tN());
            jSONObject.put("locale_language", DeviceUtils.AlY());
            jSONObject.put("channel", "main");
            JSONObject wN = AlY.wN();
            if (wN != null) {
                jSONObject.put("digest", wN);
            }
            jSONObject.put("data_time", AlY.vc());
            jSONObject.put("app_set_id_scope", AlY.Sg());
            jSONObject.put("app_set_id", AlY.tN());
            jSONObject.put("installed_source", AlY.AlY());
            if (AlY.dXO("gaid")) {
                jSONObject.put("did", com.bytedance.sdk.openadsdk.core.YoT.YFl(lG.YFl()));
            }
            String wN2 = com.bytedance.sdk.openadsdk.core.NjR.Sg().wN();
            if (!TextUtils.isEmpty(wN2)) {
                jSONObject.put("mediation", wN2);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public boolean YFl(@NonNull JSONObject jSONObject) {
        this.Sg.YFl(jSONObject);
        for (wN wNVar : this.tN) {
            if (wNVar != null) {
                wNVar.YFl(jSONObject);
            }
        }
        return this.Sg.tN;
    }

    public static boolean YFl() {
        return BinderPoolService.YFl;
    }
}
