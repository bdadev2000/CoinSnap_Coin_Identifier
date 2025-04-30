package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.lMd.lMd;
import com.bytedance.sdk.openadsdk.multipro.lMd.zp;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Gzh {
    private static boolean zp = false;

    public static boolean lMd(Context context, String str, com.bytedance.sdk.openadsdk.core.model.woN won, int i9, String str2, boolean z8) {
        try {
            Intent zp2 = zp(context, str, won, i9, (PAGNativeAd) null, (PangleAd) null, str2, z8, true);
            if (!(context instanceof Activity)) {
                zp2.addFlags(268435456);
            }
            context.startActivity(zp2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void zp(boolean z8) {
        zp = z8;
    }

    private static com.bytedance.sdk.openadsdk.dT.zp.zp zp(int i9, com.bytedance.sdk.openadsdk.core.model.woN won) {
        com.bytedance.sdk.openadsdk.dT.zp.zp zpVar = new com.bytedance.sdk.openadsdk.dT.zp.zp();
        zpVar.zp(lMd.zp.zp);
        zpVar.zp(won);
        zpVar.lMd(YhE.zp(won));
        zpVar.zp(i9);
        zpVar.zp(false);
        zpVar.lMd(won.oKZ());
        return zpVar;
    }

    public static boolean zp(Context context, com.bytedance.sdk.openadsdk.core.model.woN won, int i9, @Nullable PAGNativeAd pAGNativeAd, @Nullable PangleAd pangleAd, String str, @Nullable com.com.bytedance.overseas.sdk.zp.KS ks, boolean z8, int i10) {
        String zp2;
        com.bytedance.sdk.openadsdk.lMd.KS.zp(zp(-1, won));
        if (context != null && won != null && i9 != -1) {
            com.bytedance.sdk.openadsdk.core.model.dT fs = won.fs();
            HashMap hashMap = new HashMap();
            if (won.que() == 0) {
                hashMap.put("dpl_probability_jump", Boolean.valueOf(i10 >= 11));
            }
            if (i10 != 0 && won.Fm()) {
                hashMap.put("dsp_click_type", Integer.valueOf(i10));
            }
            if (fs != null && !TextUtils.isEmpty(fs.zp())) {
                if (zp(context, won, i9, str, z8, hashMap)) {
                    com.bytedance.sdk.openadsdk.lMd.KS.zp(zp(2, won));
                    return true;
                }
                if (fs.KS() != 2 || won.mW() == 5 || won.mW() == 15) {
                    if (fs.KS() == 1 && !TextUtils.isEmpty(fs.lMd())) {
                        zp2 = fs.lMd();
                    } else {
                        zp2 = zp(won);
                    }
                } else {
                    if (ks != null) {
                        if (!ks.zp()) {
                            if (ks.COT()) {
                                com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str, "open_fallback_url", hashMap);
                                com.bytedance.sdk.openadsdk.lMd.KS.zp(zp(3, won));
                                return true;
                            }
                            com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str, "open_fallback_url", hashMap);
                            com.bytedance.sdk.openadsdk.lMd.KS.zp(zp(3, won));
                            return false;
                        }
                        com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str, "open_fallback_url", hashMap);
                        com.bytedance.sdk.openadsdk.lMd.KS.zp(zp(3, won));
                        return true;
                    }
                    zp2 = null;
                }
                com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str, "open_fallback_url", hashMap);
            } else {
                zp2 = zp(won);
            }
            String str2 = zp2;
            if (won.que() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String substring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.lMd.KS.zp(zp(4, won));
                return com.com.bytedance.overseas.sdk.zp.lMd.zp(context, str2, substring, str, won);
            }
            return zp(context, won, i9, pAGNativeAd, pangleAd, str, z8, str2);
        }
        com.bytedance.sdk.openadsdk.lMd.KS.zp(zp(1, won));
        return false;
    }

    private static String zp(com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (won.Fm() && won.xg() != null) {
            return won.xg().YW();
        }
        return won.aax();
    }

    public static boolean zp(Context context, com.bytedance.sdk.openadsdk.core.model.woN won, int i9, String str, boolean z8, Map<String, Object> map) {
        if (won == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.dT fs = won.fs();
        if (fs != null && !TextUtils.isEmpty(fs.zp())) {
            Map<String, Object> hashMap = map == null ? new HashMap<>() : map;
            String zp2 = fs.zp();
            Uri parse = Uri.parse(zp2);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (YhE.ku(context)) {
                YhE.lMd lMd = YhE.lMd(context, intent);
                if (lMd.lMd > 0) {
                    if (KVG.jU().ku()) {
                        YhE.zp(won, str);
                    }
                    ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    hashMap.put("can_query_install", 1);
                    if (resolveActivity != null) {
                        hashMap.put("resolved_activity", resolveActivity.getPackageName() + "/" + resolveActivity.getClassName());
                    }
                    hashMap.put("matched_count", Integer.valueOf(lMd.lMd));
                    hashMap.put("url", zp2);
                    if (lMd.zp != null) {
                        hashMap.put("target_component", lMd.zp.getPackageName() + "/" + lMd.zp.getClassName());
                        intent.setComponent(lMd.zp);
                    }
                    com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str, "open_url_app", hashMap);
                    try {
                        context.startActivity(intent);
                        com.bytedance.sdk.openadsdk.lMd.Bj.zp().zp(hashMap).zp(won, str);
                        com.bytedance.sdk.openadsdk.lMd.KS.zp("dp_start_act_success", won, str, hashMap);
                        return true;
                    } catch (Exception e4) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("exception", e4.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        jU.zp(won, str, -4, jSONObject);
                        if (!KVG.jU().ku()) {
                            zp(context, won.aax(), won, i9, str, z8);
                            com.bytedance.sdk.component.utils.tG.zp("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", e4);
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
                jU.zp(won, str, -3, jSONObject2);
            } else {
                try {
                    if (KVG.jU().ku()) {
                        YhE.zp(won, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    hashMap.put("can_query_install", 0);
                    com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str, "open_url_app", hashMap);
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.lMd.Bj.zp().zp(hashMap).zp(won, str);
                    return true;
                } catch (Throwable unused3) {
                }
            }
            return false;
        }
        jU.zp(won, str, fs == null ? -1 : -2, fs != null ? fs.jU() : null);
        return false;
    }

    public static boolean zp(Context context, com.bytedance.sdk.openadsdk.core.model.woN won, int i9, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str, boolean z8, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.cz.lMd(won)) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(zp(5, won));
            return false;
        }
        int oKZ = won.oKZ();
        if (oKZ != 2 && oKZ != 8) {
            com.bytedance.sdk.component.utils.lMd.zp(context, zp(context, str2, won, i9, pAGNativeAd, pangleAd, str, z8), null);
            zp = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.vwr.zp(context, str2, won, lMd.zp.zp);
    }

    public static boolean zp(Context context, String str, com.bytedance.sdk.openadsdk.core.model.woN won, int i9, String str2, boolean z8) {
        try {
            context.startActivity(zp(context, str, won, i9, (PAGNativeAd) null, (PangleAd) null, str2, z8));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Intent zp(Context context, String str, com.bytedance.sdk.openadsdk.core.model.woN won, int i9, @Nullable PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z8) {
        return zp(context, str, won, i9, pAGNativeAd, pangleAd, str2, z8, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent zp(Context context, String str, com.bytedance.sdk.openadsdk.core.model.woN won, int i9, @Nullable PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z8, boolean z9) {
        Intent intent;
        if (!z9 && com.bytedance.sdk.openadsdk.core.model.cz.lMd(won) && (pAGNativeAd != 0 || pangleAd != null)) {
            intent = new Intent(context, (Class<?>) TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", zp(won, z8));
            String COT = com.bytedance.sdk.openadsdk.core.model.cz.COT(won);
            if (!TextUtils.isEmpty(COT)) {
                if (COT.contains("?")) {
                    str = COT.concat("&orientation=portrait");
                } else {
                    str = COT.concat("?orientation=portrait");
                }
            }
        } else {
            intent = (z9 || won.oKZ() != 3 || !(won.rV() == 2 || (won.rV() == 1 && zp)) || won.vFs()) ? new Intent(context, (Class<?>) TTLandingPageActivity.class) : new Intent(context, (Class<?>) TTVideoLandingPageLink2Activity.class);
        }
        intent.putExtra("url", str);
        intent.putExtra("gecko_id", won.fVt());
        intent.putExtra("web_title", won.rCC());
        intent.putExtra("sdk_version", 6003);
        intent.putExtra("adid", won.fgJ());
        intent.putExtra("log_extra", won.GP());
        com.bytedance.sdk.openadsdk.multipro.lMd.zp zpVar = null;
        intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, won.BO() == null ? null : won.BO().zp());
        intent.putExtra("event_tag", str2);
        intent.putExtra("source", i9);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, won.Eg().toString());
        } else {
            cz.zp().HWF();
            cz.zp().zp(won);
        }
        if (won.mW() == 5 || won.mW() == 15 || won.mW() == 50) {
            if (pAGNativeAd != 0) {
                if (pAGNativeAd instanceof zp.InterfaceC0125zp) {
                    zpVar = ((zp.InterfaceC0125zp) pAGNativeAd).HWF();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.zp) {
                    zpVar = ((com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.zp) pAGNativeAd).lMd();
                }
                if (zpVar != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, zpVar.zp().toString());
                }
            }
            if ((pangleAd instanceof com.bytedance.sdk.openadsdk.core.bannerexpress.KS) && (zpVar = ((com.bytedance.sdk.openadsdk.core.bannerexpress.KS) pangleAd).KS()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, zpVar.zp().toString());
            }
            if (zpVar != null) {
                intent.putExtra("video_is_auto_play", zpVar.jU);
                if (com.bytedance.sdk.component.utils.tG.jU()) {
                    zpVar.zp().toString();
                }
            }
        }
        return intent;
    }

    private static boolean zp(com.bytedance.sdk.openadsdk.core.model.woN won, boolean z8) {
        if (z8 && won != null && won.oKZ() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.cz.lMd(won);
        }
        return false;
    }
}
