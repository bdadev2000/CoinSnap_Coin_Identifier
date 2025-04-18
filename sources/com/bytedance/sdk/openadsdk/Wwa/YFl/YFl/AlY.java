package com.bytedance.sdk.openadsdk.Wwa.YFl.YFl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.openadsdk.AlY.YoT;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.mn;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.wXo;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AlY implements vc {
    private final WeakReference<Context> DSW;
    protected Wwa Sg;
    protected com.bytedance.sdk.openadsdk.core.model.tN YFl;
    protected String tN;

    /* renamed from: vc, reason: collision with root package name */
    protected int f10520vc;
    protected boolean AlY = false;
    protected final AtomicBoolean wN = new AtomicBoolean(false);
    private boolean qsH = false;

    public AlY(Context context, Wwa wwa, String str) {
        this.DSW = new WeakReference<>(context);
        this.Sg = wwa;
        this.YFl = wwa.in();
        this.tN = str;
        "====tag===".concat(String.valueOf(str));
        if (lG.YFl() == null) {
            lG.Sg(context);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc
    public void AlY() {
        if (tN() == null) {
            return;
        }
        if (Sg()) {
            this.wN.set(true);
            this.Sg.tN(true);
            return;
        }
        if (YFl()) {
            this.Sg.tN(true);
            return;
        }
        if (vc()) {
            return;
        }
        if (wN()) {
            this.Sg.tN(true);
        } else if (this.Sg.in() == null && this.Sg.Cqy() != null) {
            mn.YFl(tN(), this.Sg.Cqy(), this.Sg, Sco.YFl(this.tN), this.tN, true);
            this.Sg.tN(true);
        }
    }

    public boolean Sg() {
        com.bytedance.sdk.openadsdk.core.AlY.YFl(this.Sg, this.tN, 1, null);
        if (this.Sg.Bn() != null) {
            String YFl = this.Sg.Bn().YFl();
            if (!TextUtils.isEmpty(YFl)) {
                Uri parse = Uri.parse(YFl);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                Sco.Sg Sg = Sco.Sg(tN(), intent);
                if (Sg.Sg > 0) {
                    if (!(tN() instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    try {
                        HashMap hashMap = new HashMap();
                        YFl(hashMap);
                        hashMap.put("matched_count", Integer.valueOf(Sg.Sg));
                        hashMap.put("url", YFl);
                        ComponentName componentName = Sg.YFl;
                        if (componentName != null) {
                            intent.setComponent(componentName);
                        }
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.Sg, this.tN, "open_url_app", hashMap);
                        tN().startActivity(intent);
                        YoT.YFl().YFl(hashMap).YFl(this.Sg, this.tN);
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl("dp_start_act_success", this.Sg, this.tN, hashMap);
                        return true;
                    } catch (Throwable th2) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("exception", th2.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        com.bytedance.sdk.openadsdk.core.AlY.YFl(this.Sg, this.tN, -4, jSONObject);
                    }
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("intent", intent.toString());
                        jSONObject2.put("can_query_install", 1);
                    } catch (Exception unused2) {
                    }
                    com.bytedance.sdk.openadsdk.core.AlY.YFl(this.Sg, this.tN, -3, jSONObject2);
                }
            } else {
                Wwa wwa = this.Sg;
                com.bytedance.sdk.openadsdk.core.AlY.YFl(wwa, this.tN, -2, wwa.Bn().AlY());
            }
            if (!this.AlY || this.wN.get()) {
                this.AlY = true;
                Map<String, Object> hashMap2 = new HashMap<>();
                YFl(hashMap2);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.Sg, this.tN, "open_fallback_url", hashMap2);
                return false;
            }
            return false;
        }
        com.bytedance.sdk.openadsdk.core.AlY.YFl(this.Sg, this.tN, -1, null);
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc
    public void YFl(boolean z10) {
        this.qsH = z10;
    }

    public Context tN() {
        WeakReference<Context> weakReference = this.DSW;
        return (weakReference == null || weakReference.get() == null) ? lG.YFl() : this.DSW.get();
    }

    public boolean vc() {
        wXo AXS;
        IPMiBroadcastReceiver YFl;
        try {
            Wwa wwa = this.Sg;
            if (wwa == null || (AXS = wwa.AXS()) == null || TextUtils.isEmpty(AXS.Sg())) {
                return false;
            }
            if (AXS.YFl() && this.Sg.in() != null && !TextUtils.isEmpty(this.Sg.in().tN()) && (YFl = IPMiBroadcastReceiver.YFl(tN())) != null) {
                YFl.YFl(this.Sg.in().tN(), this.Sg);
            }
            final boolean YFl2 = Sg.YFl(tN(), AXS.Sg(), this.Sg);
            com.bytedance.sdk.openadsdk.utils.mn.Sg(new qsH("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.AlY.1
                @Override // java.lang.Runnable
                public void run() {
                    if (YFl2) {
                        NjR.YFl("oem_store", "1");
                    } else {
                        NjR.YFl("oem_store", "-2");
                    }
                }
            });
            return YFl2;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("GPDownLoader", th2.getMessage());
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc
    public boolean wN() {
        this.wN.set(true);
        if (this.YFl != null && YFl(tN(), this.YFl.YFl(), this.YFl.tN())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc
    public void YFl(int i10) {
        this.f10520vc = i10;
    }

    public boolean YFl(Context context, String str, String str2) {
        return YFl(context, str, str2, this.tN, this.Sg);
    }

    public static boolean YFl(Context context, String str, String str2, String str3, Wwa wwa) {
        if (tN.YFl()) {
            return wN.YFl(context, str, str2, str3, wwa);
        }
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, str3, "store_open", (JSONObject) null);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri parse = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(parse);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, C.DEFAULT_BUFFER_SEGMENT_SIZE).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(parse);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        com.bytedance.sdk.openadsdk.AlY.tN.Sg(wwa, str3, "store_open", (JSONObject) null);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th2);
            }
        }
        return false;
    }

    private void YFl(Map<String, Object> map) {
        Wwa wwa = this.Sg;
        if (wwa != null && wwa.Ja() == 0) {
            Wwa wwa2 = this.Sg;
            map.put("auto_click", Boolean.valueOf((wwa2 == null || wwa2.AlY()) ? false : true));
        }
        Wwa wwa3 = this.Sg;
        if (wwa3 != null && wwa3.Ja() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.f10520vc >= 11));
        }
        map.put("can_query_install", 1);
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc
    public boolean YFl() {
        Intent YFl;
        if (this.YFl == null) {
            return false;
        }
        Wwa wwa = this.Sg;
        if (wwa != null && wwa.dU() == 0) {
            return false;
        }
        String tN = this.YFl.tN();
        if (TextUtils.isEmpty(tN) || !Sco.Sg(tN(), tN) || (YFl = Sco.YFl(tN(), tN)) == null) {
            return false;
        }
        YFl.putExtra("START_ONLY_FOR_ANDROID", true);
        try {
            tN().startActivity(YFl);
            HashMap hashMap = new HashMap();
            YFl(hashMap);
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.Sg, this.tN, "click_open", hashMap);
            return true;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("GPDownLoader", th2.getMessage());
            return false;
        }
    }
}
