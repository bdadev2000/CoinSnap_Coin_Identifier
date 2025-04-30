package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.L;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import com.bytedance.sdk.openadsdk.core.act.AdActAction;
import java.util.HashMap;
import u.C2738g;
import u.C2739h;
import u.C2744m;

/* loaded from: classes.dex */
public class vwr {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.dT.zp.zp lMd(String str, int i9, com.bytedance.sdk.openadsdk.core.model.woN won) {
        com.bytedance.sdk.openadsdk.dT.zp.zp zpVar = new com.bytedance.sdk.openadsdk.dT.zp.zp();
        zpVar.zp(str);
        zpVar.zp(won);
        zpVar.lMd(YhE.zp(won));
        zpVar.zp(i9);
        zpVar.zp(false);
        zpVar.lMd(won.oKZ());
        return zpVar;
    }

    public static boolean zp(Context context, final String str, final com.bytedance.sdk.openadsdk.core.model.woN won, final String str2) {
        if (context instanceof Activity) {
            if (!zp((Activity) context)) {
                context = null;
            }
        } else {
            Activity lMd = com.bytedance.sdk.openadsdk.core.rV.zp().COT().lMd();
            if (lMd != null && zp(lMd)) {
                context = lMd;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.KVG.zp();
        }
        if (context == null) {
            return false;
        }
        final String zp = YhE.zp(won);
        if (!com.bytedance.sdk.component.utils.KVG.zp(str)) {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(lMd(str2, 5, won));
            return false;
        }
        final String lMd2 = com.bytedance.sdk.openadsdk.core.model.woN.lMd(context, won);
        if (!TextUtils.isEmpty(lMd2)) {
            try {
                final C2738g c2738g = new C2738g();
                c2738g.f23042a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", false);
                c2738g.b(2);
                if (context instanceof Activity) {
                    Integer valueOf = Integer.valueOf(((Activity) context).getWindow().getNavigationBarColor() | ViewCompat.MEASURED_STATE_MASK);
                    Bundle bundle = new Bundle();
                    bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                    c2738g.f23045e = bundle;
                }
                final Context context2 = context;
                new AdActAction(context, won, str2, str).zp(new AdActAction.BindCustomTabsServiceCallback() { // from class: com.bytedance.sdk.openadsdk.utils.vwr.1
                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindFail(int i9, String str3) {
                        com.bytedance.sdk.openadsdk.dT.zp.zp lMd3 = vwr.lMd(str2, i9, won);
                        lMd3.KS(str3);
                        com.bytedance.sdk.openadsdk.lMd.KS.zp(lMd3);
                        vwr.lMd(context2, str, won, str2, zp);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindSuccess(C2744m c2744m) {
                        if (c2744m != null) {
                            try {
                                C2738g c2738g2 = C2738g.this;
                                c2738g2.getClass();
                                String packageName = c2744m.f23055d.getPackageName();
                                Intent intent = c2738g2.f23042a;
                                intent.setPackage(packageName);
                                IBinder asBinder = c2744m.f23054c.asBinder();
                                Bundle bundle2 = new Bundle();
                                bundle2.putBinder("android.support.customtabs.extra.SESSION", asBinder);
                                PendingIntent pendingIntent = c2744m.f23056e;
                                if (pendingIntent != null) {
                                    bundle2.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                                }
                                intent.putExtras(bundle2);
                            } catch (Throwable th) {
                                String message = th.getMessage();
                                com.bytedance.sdk.component.utils.tG.zp("OpenUtils", message);
                                com.bytedance.sdk.openadsdk.dT.zp.zp lMd3 = vwr.lMd(str2, 13, won);
                                lMd3.KS(message);
                                com.bytedance.sdk.openadsdk.lMd.KS.zp(lMd3);
                                vwr.lMd(context2, str, won, str2, zp);
                                return;
                            }
                        }
                        C2739h a6 = C2738g.this.a();
                        if (!(context2 instanceof Activity)) {
                            a6.f23048a.addFlags(268435456);
                        }
                        com.bytedance.sdk.openadsdk.core.act.KS.zp(context2, lMd2, a6, Uri.parse(str));
                        Context context3 = context2;
                        if (context3 instanceof TTBaseActivity) {
                            ((TTBaseActivity) context3).zp(true);
                        }
                        com.bytedance.sdk.openadsdk.dT.zp.zp lMd4 = vwr.lMd(str2, 100, won);
                        lMd4.zp(true);
                        lMd4.lMd(8);
                        com.bytedance.sdk.openadsdk.lMd.KS.zp(lMd4);
                    }
                });
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.component.utils.tG.zp("OpenUtils", message);
                com.bytedance.sdk.openadsdk.dT.zp.zp lMd3 = lMd(str2, 12, won);
                lMd3.KS(message);
                com.bytedance.sdk.openadsdk.lMd.KS.zp(lMd3);
                return lMd(context, str, won, str2, zp);
            }
        }
        return lMd(context, str, won, str2, zp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lMd(Context context, String str, com.bytedance.sdk.openadsdk.core.model.woN won, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.dT.zp.zp lMd = lMd(str2, 100, won);
                lMd.zp(true);
                lMd.lMd(2);
                com.bytedance.sdk.openadsdk.lMd.KS.zp(lMd);
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.openadsdk.dT.zp.zp lMd2 = lMd(str2, 7, won);
                lMd2.KS(message);
                lMd2.lMd(2);
                com.bytedance.sdk.openadsdk.lMd.KS.zp(lMd2);
                return false;
            }
        } catch (Throwable th2) {
            String message2 = th2.getMessage();
            com.bytedance.sdk.openadsdk.dT.zp.zp lMd3 = lMd(str2, 6, won);
            lMd3.KS(message2);
            lMd3.lMd(2);
            com.bytedance.sdk.openadsdk.lMd.KS.zp(lMd3);
            return false;
        }
    }

    public static boolean lMd(Context context, String str, com.bytedance.sdk.openadsdk.core.model.woN won, String str2) {
        if (context instanceof Activity) {
            if (!zp((Activity) context)) {
                context = null;
            }
        } else {
            Activity lMd = com.bytedance.sdk.openadsdk.core.rV.zp().COT().lMd();
            if (lMd != null && zp(lMd)) {
                context = lMd;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.KVG.zp();
        }
        if (context == null || !zp(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        HashMap m = L.m("deeplink_url", str);
        m.put("jsb_deeplink", 1);
        if (YhE.ku(context)) {
            if (YhE.zp(context, intent)) {
                com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str2, "open_url_app", m);
                try {
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.lMd.Bj.zp().zp(m).zp(won, str2);
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        }
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.bytedance.sdk.openadsdk.lMd.KS.zp(won, str2, "open_url_app", m);
            context.startActivity(intent);
            com.bytedance.sdk.openadsdk.lMd.Bj.zp().zp(m).zp(won, str2);
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static boolean zp(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean zp(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
