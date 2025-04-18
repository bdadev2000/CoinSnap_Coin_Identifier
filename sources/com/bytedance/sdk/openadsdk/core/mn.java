package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AlY.Sg;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.multipro.Sg.YFl;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mn {
    private static boolean YFl = false;

    public static boolean Sg(Context context, String str, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, int i10, String str2, boolean z10) {
        try {
            Intent YFl2 = YFl(context, str, wwa, i10, (PAGNativeAd) null, (PangleAd) null, str2, z10, true);
            if (!(context instanceof Activity)) {
                YFl2.addFlags(268435456);
            }
            context.startActivity(YFl2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void YFl(boolean z10) {
        YFl = z10;
    }

    private static com.bytedance.sdk.openadsdk.pDU.YFl.Sg YFl(int i10, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        com.bytedance.sdk.openadsdk.pDU.YFl.Sg sg2 = new com.bytedance.sdk.openadsdk.pDU.YFl.Sg();
        sg2.YFl(Sg.YFl.YFl);
        sg2.YFl(wwa);
        sg2.Sg(Sco.YFl(wwa));
        sg2.YFl(i10);
        sg2.YFl(false);
        sg2.Sg(wwa.ko());
        return sg2;
    }

    public static boolean YFl(Context context, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, int i10, @Nullable PAGNativeAd pAGNativeAd, @Nullable PangleAd pangleAd, String str, @Nullable com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc vcVar, boolean z10, int i11) {
        String YFl2;
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(YFl(-1, wwa));
        if (context != null && wwa != null && i10 != -1) {
            com.bytedance.sdk.openadsdk.core.model.eT Bn = wwa.Bn();
            HashMap hashMap = new HashMap();
            if (wwa.Ja() == 0) {
                hashMap.put("dpl_probability_jump", Boolean.valueOf(i11 >= 11));
            }
            if (i11 != 0 && wwa.yn()) {
                hashMap.put("dsp_click_type", Integer.valueOf(i11));
            }
            if (Bn != null && !TextUtils.isEmpty(Bn.YFl())) {
                if (YFl(context, wwa, i10, str, z10, hashMap)) {
                    com.bytedance.sdk.openadsdk.AlY.tN.YFl(YFl(2, wwa));
                    return true;
                }
                if (Bn.tN() != 2 || wwa.ZLB() == 5 || wwa.ZLB() == 15) {
                    if (Bn.tN() == 1 && !TextUtils.isEmpty(Bn.Sg())) {
                        YFl2 = Bn.Sg();
                    } else {
                        YFl2 = YFl(wwa);
                    }
                } else if (vcVar != null) {
                    if (!vcVar.YFl()) {
                        if (vcVar.wN()) {
                            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, "open_fallback_url", hashMap);
                            com.bytedance.sdk.openadsdk.AlY.tN.YFl(YFl(3, wwa));
                            return true;
                        }
                        YFl2 = YFl(Bn, wwa);
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(YFl(3, wwa));
                    } else {
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, "open_fallback_url", hashMap);
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(YFl(3, wwa));
                        return true;
                    }
                } else {
                    YFl2 = YFl(Bn, wwa);
                }
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, "open_fallback_url", hashMap);
            } else {
                YFl2 = YFl(wwa);
            }
            String str2 = YFl2;
            if (wwa.Ja() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String substring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(YFl(4, wwa));
                return com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.AlY.YFl(context, str2, substring, str, wwa);
            }
            return YFl(context, wwa, i10, pAGNativeAd, pangleAd, str, z10, str2);
        }
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(YFl(1, wwa));
        return false;
    }

    private static String YFl(com.bytedance.sdk.openadsdk.core.model.eT eTVar, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (!TextUtils.isEmpty(eTVar.Sg())) {
            return eTVar.Sg();
        }
        return YFl(wwa);
    }

    private static String YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (wwa.yn() && wwa.Af() != null) {
            return wwa.Af().NjR();
        }
        return wwa.Cqy();
    }

    public static boolean YFl(Context context, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, int i10, String str, boolean z10, Map<String, Object> map) {
        if (wwa == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.eT Bn = wwa.Bn();
        if (Bn != null && !TextUtils.isEmpty(Bn.YFl())) {
            if (map == null) {
                map = new HashMap<>();
            }
            Map<String, Object> map2 = map;
            String YFl2 = Bn.YFl();
            if (com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.tN.YFl()) {
                return com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.tN.YFl(context, YFl2, wwa, i10, map2, z10);
            }
            Uri parse = Uri.parse(YFl2);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (Sco.qsH(context)) {
                Sco.Sg Sg = Sco.Sg(context, intent);
                if (Sg.Sg > 0) {
                    if (lG.AlY().qsH()) {
                        Sco.YFl(wwa, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map2.put("can_query_install", 1);
                    map2.put("matched_count", Integer.valueOf(Sg.Sg));
                    map2.put("url", YFl2);
                    ComponentName componentName = Sg.YFl;
                    if (componentName != null) {
                        intent.setComponent(componentName);
                    }
                    com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, "open_url_app", map2);
                    try {
                        context.startActivity(intent);
                        com.bytedance.sdk.openadsdk.AlY.YoT.YFl().YFl(map2).YFl(wwa, str);
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl("dp_start_act_success", wwa, str, map2);
                        return true;
                    } catch (Exception e2) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("exception", e2.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        AlY.YFl(wwa, str, -4, jSONObject);
                        if (!lG.AlY().qsH()) {
                            YFl(context, wwa.Cqy(), wwa, i10, str, z10);
                            com.bytedance.sdk.component.utils.YoT.YFl("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", e2);
                        }
                        return false;
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("intent", intent.toString());
                    jSONObject2.put("can_query_install", 1);
                } catch (Exception unused2) {
                }
                AlY.YFl(wwa, str, -3, jSONObject2);
            } else {
                try {
                    if (lG.AlY().qsH()) {
                        Sco.YFl(wwa, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map2.put("can_query_install", 0);
                    com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, "open_url_app", map2);
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.AlY.YoT.YFl().YFl(map2).YFl(wwa, str);
                    return true;
                } catch (Throwable unused3) {
                }
            }
            return false;
        }
        AlY.YFl(wwa, str, Bn == null ? -1 : -2, Bn != null ? Bn.AlY() : null);
        return false;
    }

    public static boolean YFl(Context context, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, int i10, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str, boolean z10, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.Ne.Sg(wwa)) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(YFl(5, wwa));
            return false;
        }
        int ko = wwa.ko();
        if (ko != 2 && ko != 8) {
            com.bytedance.sdk.component.utils.Sg.YFl(context, YFl(context, str2, wwa, i10, pAGNativeAd, pangleAd, str, z10), null);
            YFl = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.qO.YFl(context, str2, wwa, Sg.YFl.YFl);
    }

    public static boolean YFl(Context context, String str, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, int i10, String str2, boolean z10) {
        try {
            context.startActivity(YFl(context, str, wwa, i10, (PAGNativeAd) null, (PangleAd) null, str2, z10));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Intent YFl(Context context, String str, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, int i10, @Nullable PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z10) {
        return YFl(context, str, wwa, i10, pAGNativeAd, pangleAd, str2, z10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent YFl(Context context, String str, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, int i10, @Nullable PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z10, boolean z11) {
        Intent intent;
        if (!z11 && com.bytedance.sdk.openadsdk.core.model.Ne.Sg(wwa) && (pAGNativeAd != 0 || pangleAd != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", YFl(wwa, z10));
            String YoT = com.bytedance.sdk.openadsdk.core.model.Ne.YoT(wwa);
            if (!TextUtils.isEmpty(YoT)) {
                if (YoT.contains("?")) {
                    str = YoT.concat("&orientation=portrait");
                } else {
                    str = YoT.concat("?orientation=portrait");
                }
            }
        } else {
            intent = (z11 || wwa.ko() != 3 || !(wwa.rkt() == 2 || (wwa.rkt() == 1 && YFl)) || wwa.lX()) ? new Intent(context, (Class<?>) TTLandingPageActivity.class) : new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        }
        intent.putExtra("url", str);
        intent.putExtra("gecko_id", wwa.DjU());
        intent.putExtra("web_title", wwa.Hjb());
        intent.putExtra("sdk_version", BuildConfig.VERSION_CODE);
        intent.putExtra("adid", wwa.zz());
        intent.putExtra("log_extra", wwa.uGS());
        com.bytedance.sdk.openadsdk.multipro.Sg.YFl yFl = null;
        intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, wwa.dGX() == null ? null : wwa.dGX().YFl());
        intent.putExtra("event_tag", str2);
        intent.putExtra("source", i10);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, wwa.ni().toString());
        } else {
            bZ.YFl().vc();
            bZ.YFl().YFl(wwa);
        }
        if (wwa.ZLB() == 5 || wwa.ZLB() == 15 || wwa.ZLB() == 50) {
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof YFl.InterfaceC0135YFl) {
                    yFl = ((YFl.InterfaceC0135YFl) pAGNativeAd).vc();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.YFl.Sg.YFl.Sg) {
                    yFl = ((com.bytedance.sdk.openadsdk.YFl.Sg.YFl.Sg) pAGNativeAd).Sg();
                }
                if (yFl != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, yFl.YFl().toString());
                }
            }
            if ((pangleAd instanceof com.bytedance.sdk.openadsdk.core.tN.vc) && (yFl = ((com.bytedance.sdk.openadsdk.core.tN.vc) pangleAd).tN()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, yFl.YFl().toString());
            }
            if (yFl != null) {
                intent.putExtra("video_is_auto_play", yFl.AlY);
                if (com.bytedance.sdk.component.utils.YoT.AlY()) {
                    yFl.YFl().toString();
                }
            }
        }
        return intent;
    }

    private static boolean YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, boolean z10) {
        if (z10 && wwa != null && wwa.ko() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.Ne.Sg(wwa);
        }
        return false;
    }
}
