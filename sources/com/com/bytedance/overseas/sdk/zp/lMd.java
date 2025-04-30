package com.com.bytedance.overseas.sdk.zp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.Gzh;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.Bj;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd implements KS {
    protected static Boolean COT;
    protected String KS;
    protected int QR;
    private final WeakReference<Context> ku;
    protected woN lMd;
    protected com.bytedance.sdk.openadsdk.core.model.KS zp;
    protected boolean jU = false;
    protected final AtomicBoolean HWF = new AtomicBoolean(false);
    private boolean YW = false;

    public lMd(Context context, woN won, String str) {
        this.ku = new WeakReference<>(context);
        this.lMd = won;
        this.zp = won.Vjb();
        this.KS = str;
        "====tag===".concat(String.valueOf(str));
        if (KVG.zp() == null) {
            KVG.zp(context);
        }
    }

    @Override // com.com.bytedance.overseas.sdk.zp.KS
    public boolean COT() {
        this.HWF.set(true);
        if (this.zp != null && zp(KS(), this.zp.zp(), this.zp.KS())) {
            return true;
        }
        return false;
    }

    public Context KS() {
        WeakReference<Context> weakReference = this.ku;
        if (weakReference != null && weakReference.get() != null) {
            return this.ku.get();
        }
        return KVG.zp();
    }

    @Override // com.com.bytedance.overseas.sdk.zp.KS
    public void jU() {
        if (KS() == null) {
            return;
        }
        if (lMd()) {
            this.HWF.set(true);
            this.lMd.KS(true);
            return;
        }
        if (zp()) {
            this.lMd.KS(true);
            return;
        }
        if (COT()) {
            this.lMd.KS(true);
        } else if (this.lMd.Vjb() == null && this.lMd.aax() != null) {
            Gzh.zp(KS(), this.lMd.aax(), this.lMd, YhE.zp(this.KS), this.KS, true);
            this.lMd.KS(true);
        }
    }

    public boolean lMd() {
        com.bytedance.sdk.openadsdk.core.jU.zp(this.lMd, this.KS, 1, null);
        if (this.lMd.fs() != null) {
            String zp = this.lMd.fs().zp();
            if (!TextUtils.isEmpty(zp)) {
                Uri parse = Uri.parse(zp);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                YhE.lMd lMd = YhE.lMd(KS(), intent);
                if (lMd.lMd > 0) {
                    if (!(KS() instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    try {
                        HashMap hashMap = new HashMap();
                        zp(hashMap);
                        ComponentName resolveActivity = intent.resolveActivity(KS().getPackageManager());
                        if (resolveActivity != null) {
                            hashMap.put("resolved_activity", resolveActivity.getPackageName() + "/" + resolveActivity.getClassName());
                        }
                        hashMap.put("matched_count", Integer.valueOf(lMd.lMd));
                        hashMap.put("url", zp);
                        if (lMd.zp != null) {
                            hashMap.put("target_component", lMd.zp.getPackageName() + "/" + lMd.zp.getClassName());
                            intent.setComponent(lMd.zp);
                        }
                        com.bytedance.sdk.openadsdk.lMd.KS.zp(this.lMd, this.KS, "open_url_app", hashMap);
                        KS().startActivity(intent);
                        Bj.zp().zp(hashMap).zp(this.lMd, this.KS);
                        com.bytedance.sdk.openadsdk.lMd.KS.zp("dp_start_act_success", this.lMd, this.KS, hashMap);
                        return true;
                    } catch (Throwable th) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("exception", th.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        com.bytedance.sdk.openadsdk.core.jU.zp(this.lMd, this.KS, -4, jSONObject);
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("intent", intent.toString());
                        jSONObject2.put("can_query_install", 1);
                    } catch (Exception unused2) {
                    }
                    com.bytedance.sdk.openadsdk.core.jU.zp(this.lMd, this.KS, -3, jSONObject2);
                }
            } else {
                woN won = this.lMd;
                com.bytedance.sdk.openadsdk.core.jU.zp(won, this.KS, -2, won.fs().jU());
            }
            if (!this.jU || this.HWF.get()) {
                this.jU = true;
                Map<String, Object> hashMap2 = new HashMap<>();
                zp(hashMap2);
                com.bytedance.sdk.openadsdk.lMd.KS.zp(this.lMd, this.KS, "open_fallback_url", hashMap2);
                return false;
            }
            return false;
        }
        com.bytedance.sdk.openadsdk.core.jU.zp(this.lMd, this.KS, -1, null);
        return false;
    }

    @Override // com.com.bytedance.overseas.sdk.zp.KS
    public void zp(boolean z8) {
        this.YW = z8;
    }

    @Override // com.com.bytedance.overseas.sdk.zp.KS
    public void zp(int i9) {
        this.QR = i9;
    }

    public boolean zp(Context context, String str, String str2) {
        return zp(context, str, str2, this.KS, this.lMd);
    }

    public static boolean zp(Context context, String str, String str2, String str3, woN won) {
        JSONObject jSONObject = new JSONObject();
        try {
            Boolean bool = COT;
            jSONObject.put("storeOpenType", (bool == null || !bool.booleanValue()) ? "webview" : MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        } catch (JSONException e4) {
            tG.zp("GPDownLoader", "gotoGooglePlayByPackageNameAndUrl json error", e4);
        }
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(won, str3, "store_open", jSONObject);
                jSONObject.toString();
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri parse = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(parse);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(parse);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        jSONObject.put("storeOpenType", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                        com.bytedance.sdk.openadsdk.lMd.KS.lMd(won, str3, "store_open", jSONObject);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th);
            }
        }
        return false;
    }

    public static void zp(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details"));
        try {
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                    COT = Boolean.TRUE;
                    return;
                }
            }
        } catch (Throwable unused) {
            COT = Boolean.FALSE;
        }
        COT = Boolean.FALSE;
    }

    private void zp(Map<String, Object> map) {
        woN won = this.lMd;
        if (won != null && won.que() == 0) {
            woN won2 = this.lMd;
            map.put("auto_click", Boolean.valueOf((won2 == null || won2.KS()) ? false : true));
        }
        woN won3 = this.lMd;
        if (won3 != null && won3.que() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.QR >= 11));
        }
        map.put("can_query_install", 1);
    }

    @Override // com.com.bytedance.overseas.sdk.zp.KS
    public boolean zp() {
        Intent zp;
        if (this.zp == null) {
            return false;
        }
        woN won = this.lMd;
        if (won != null && won.Rea() == 0) {
            return false;
        }
        String KS = this.zp.KS();
        if (TextUtils.isEmpty(KS) || !YhE.lMd(KS(), KS) || (zp = YhE.zp(KS(), KS)) == null) {
            return false;
        }
        zp.putExtra("START_ONLY_FOR_ANDROID", true);
        try {
            KS().startActivity(zp);
            HashMap hashMap = new HashMap();
            zp(hashMap);
            com.bytedance.sdk.openadsdk.lMd.KS.zp(this.lMd, this.KS, "click_open", hashMap);
            return true;
        } catch (Throwable th) {
            tG.zp("GPDownLoader", th.getMessage());
            return false;
        }
    }
}
