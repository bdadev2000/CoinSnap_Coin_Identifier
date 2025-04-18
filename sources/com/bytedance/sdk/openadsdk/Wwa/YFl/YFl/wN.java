package com.bytedance.sdk.openadsdk.Wwa.YFl.YFl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.mn;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.eT;
import com.bytedance.sdk.openadsdk.core.model.wXo;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN implements vc {
    public static Boolean YFl;

    /* renamed from: vc, reason: collision with root package name */
    private static Boolean f10521vc;
    protected String AlY;
    private final WeakReference<Context> DSW;
    protected com.bytedance.sdk.openadsdk.core.model.tN Sg;
    protected Wwa tN;
    protected int wN;

    public wN(Context context, Wwa wwa, String str) {
        this.DSW = new WeakReference<>(context);
        this.tN = wwa;
        this.Sg = wwa.in();
        this.AlY = str;
        "====tag===".concat(String.valueOf(str));
        if (lG.YFl() == null) {
            lG.Sg(context);
        }
    }

    private static boolean DSW() {
        if (f10521vc == null) {
            f10521vc = Boolean.valueOf(Sco.qsH(lG.YFl()));
        }
        return f10521vc.booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc
    public void AlY() {
        if (Sg() == null) {
            return;
        }
        if (tN()) {
            this.tN.tN(true);
            return;
        }
        if (YFl()) {
            this.tN.tN(true);
            return;
        }
        if (vc()) {
            return;
        }
        if (wN()) {
            this.tN.tN(true);
        } else if (this.tN.in() == null && this.tN.Cqy() != null) {
            mn.YFl(Sg(), this.tN.Cqy(), this.tN, Sco.YFl(this.AlY), this.AlY, true);
            this.tN.tN(true);
        }
    }

    public Context Sg() {
        WeakReference<Context> weakReference = this.DSW;
        return (weakReference == null || weakReference.get() == null) ? lG.YFl() : this.DSW.get();
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc
    public void YFl(boolean z10) {
    }

    public boolean tN() {
        com.bytedance.sdk.openadsdk.core.AlY.YFl(this.tN, this.AlY, 1, null);
        eT Bn = this.tN.Bn();
        if (Bn == null) {
            com.bytedance.sdk.openadsdk.core.AlY.YFl(this.tN, this.AlY, -1, null);
            return false;
        }
        HashMap hashMap = new HashMap();
        YFl(hashMap);
        String YFl2 = Bn.YFl();
        Context Sg = Sg();
        Wwa wwa = this.tN;
        if (tN.YFl(Sg, YFl2, wwa, Sco.Sg(wwa), hashMap, true)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(this.tN, this.AlY, "open_fallback_url", hashMap);
        return false;
    }

    public boolean vc() {
        wXo AXS;
        IPMiBroadcastReceiver YFl2;
        try {
            Wwa wwa = this.tN;
            if (wwa == null || (AXS = wwa.AXS()) == null || TextUtils.isEmpty(AXS.Sg())) {
                return false;
            }
            if (AXS.YFl() && this.tN.in() != null && !TextUtils.isEmpty(this.tN.in().tN()) && (YFl2 = IPMiBroadcastReceiver.YFl(Sg())) != null) {
                YFl2.YFl(this.tN.in().tN(), this.tN);
            }
            Context Sg = Sg();
            String Sg2 = AXS.Sg();
            Wwa wwa2 = this.tN;
            final boolean YFl3 = tN.YFl(Sg, Sg2, wwa2, Sco.Sg(wwa2), null, true);
            com.bytedance.sdk.openadsdk.utils.mn.Sg(new qsH("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.wN.1
                @Override // java.lang.Runnable
                public void run() {
                    if (YFl3) {
                        NjR.YFl("oem_store", "1");
                    } else {
                        NjR.YFl("oem_store", "-2");
                    }
                }
            });
            return YFl3;
        } catch (Throwable th2) {
            YoT.YFl("GPDownLoader", th2.getMessage());
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc
    public boolean wN() {
        return this.Sg != null && YFl(Sg(), this.Sg.YFl(), this.Sg.tN());
    }

    public static boolean YFl(Context context, String str, String str2, String str3, Wwa wwa) {
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

    public static boolean YFl(Wwa wwa, String str, Context context, String str2, Map<String, Object> map) {
        Intent YFl2;
        if (wwa != null && wwa.dU() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (YFl2 = Sco.YFl(context, str)) == null) {
                return false;
            }
            YFl2.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                YFl2.addFlags(268435456);
            }
            context.startActivity(YFl2);
            if (map == null) {
                map = new HashMap<>();
            }
            if (wwa != null && wwa.Ja() == 0) {
                map.put("auto_click", Boolean.valueOf(!wwa.AlY()));
            }
            map.put("can_query_install", Integer.valueOf(DSW() ? 1 : 0));
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc
    public void YFl(int i10) {
        this.wN = i10;
    }

    public boolean YFl(Context context, String str, String str2) {
        return YFl(context, str, str2, this.AlY, this.tN);
    }

    private void YFl(Map<String, Object> map) {
        Wwa wwa = this.tN;
        if (wwa != null && wwa.Ja() == 0) {
            Wwa wwa2 = this.tN;
            map.put("auto_click", Boolean.valueOf((wwa2 == null || wwa2.AlY()) ? false : true));
        }
        Wwa wwa3 = this.tN;
        if (wwa3 != null && wwa3.Ja() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.wN >= 11));
        }
        map.put("can_query_install", Integer.valueOf(DSW() ? 1 : 0));
    }

    @Override // com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.vc
    public boolean YFl() {
        if (this.Sg == null) {
            return false;
        }
        Wwa wwa = this.tN;
        if (wwa != null && wwa.dU() == 0) {
            return false;
        }
        String tN = this.Sg.tN();
        if (TextUtils.isEmpty(tN)) {
            return false;
        }
        Context Sg = Sg();
        if (DSW() && !Sco.Sg(Sg, tN)) {
            return false;
        }
        return YFl(this.tN, tN, Sg, this.AlY, new HashMap());
    }
}
