package com.bytedance.sdk.openadsdk.utils;

import a4.j;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.activity.TTBaseActivity;
import com.bytedance.sdk.openadsdk.core.act.AdActAction;
import ic.t;
import java.util.HashMap;
import o.l;
import o.m;
import o.s;

/* loaded from: classes.dex */
public class qO {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.pDU.YFl.Sg Sg(String str, int i10, com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        com.bytedance.sdk.openadsdk.pDU.YFl.Sg sg2 = new com.bytedance.sdk.openadsdk.pDU.YFl.Sg();
        sg2.YFl(str);
        sg2.YFl(wwa);
        sg2.Sg(Sco.YFl(wwa));
        sg2.YFl(i10);
        sg2.YFl(false);
        sg2.Sg(wwa.ko());
        return sg2;
    }

    public static boolean YFl(Context context, final String str, final com.bytedance.sdk.openadsdk.core.model.Wwa wwa, final String str2) {
        if (context instanceof Activity) {
            if (!YFl((Activity) context)) {
                context = null;
            }
        } else {
            Activity Sg = com.bytedance.sdk.openadsdk.core.EH.YFl().wN().Sg();
            if (Sg != null && YFl(Sg)) {
                context = Sg;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.lG.YFl();
        }
        if (context == null) {
            return false;
        }
        final String YFl = Sco.YFl(wwa);
        if (!com.bytedance.sdk.component.utils.EH.YFl(str)) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(Sg(str2, 5, wwa));
            return false;
        }
        final String Sg2 = com.bytedance.sdk.openadsdk.core.model.Wwa.Sg(context, wwa);
        if (!TextUtils.isEmpty(Sg2)) {
            try {
                final l lVar = new l();
                lVar.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", false);
                lVar.b(2);
                if (context instanceof Activity) {
                    int navigationBarColor = ((Activity) context).getWindow().getNavigationBarColor();
                    t tVar = new t(1);
                    tVar.a = Integer.valueOf(navigationBarColor | ViewCompat.MEASURED_STATE_MASK);
                    lVar.f22936e = tVar.e().w();
                }
                final Context context2 = context;
                new AdActAction(context, wwa, str2, str).YFl(new AdActAction.BindCustomTabsServiceCallback() { // from class: com.bytedance.sdk.openadsdk.utils.qO.1
                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindFail(int i10, String str3) {
                        com.bytedance.sdk.openadsdk.pDU.YFl.Sg Sg3 = qO.Sg(str2, i10, wwa);
                        Sg3.tN(str3);
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(Sg3);
                        qO.Sg(context2, str, wwa, str2, YFl);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.act.AdActAction.BindCustomTabsServiceCallback
                    public void onBindSuccess(s sVar) {
                        if (sVar != null) {
                            try {
                                l lVar2 = l.this;
                                lVar2.getClass();
                                String packageName = sVar.f22952d.getPackageName();
                                Intent intent = lVar2.a;
                                intent.setPackage(packageName);
                                IBinder asBinder = sVar.f22951c.asBinder();
                                Bundle bundle = new Bundle();
                                bundle.putBinder("android.support.customtabs.extra.SESSION", asBinder);
                                PendingIntent pendingIntent = sVar.f22953e;
                                if (pendingIntent != null) {
                                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                                }
                                intent.putExtras(bundle);
                            } catch (Throwable th2) {
                                String message = th2.getMessage();
                                com.bytedance.sdk.component.utils.YoT.YFl("OpenUtils", message);
                                com.bytedance.sdk.openadsdk.pDU.YFl.Sg Sg3 = qO.Sg(str2, 13, wwa);
                                Sg3.tN(message);
                                com.bytedance.sdk.openadsdk.AlY.tN.YFl(Sg3);
                                qO.Sg(context2, str, wwa, str2, YFl);
                                return;
                            }
                        }
                        m a = l.this.a();
                        if (!(context2 instanceof Activity)) {
                            a.a.addFlags(268435456);
                        }
                        com.bytedance.sdk.openadsdk.core.act.tN.YFl(context2, Sg2, a, Uri.parse(str));
                        Context context3 = context2;
                        if (context3 instanceof TTBaseActivity) {
                            ((TTBaseActivity) context3).Sg(true);
                        }
                        com.bytedance.sdk.openadsdk.pDU.YFl.Sg Sg4 = qO.Sg(str2, 100, wwa);
                        Sg4.YFl(true);
                        Sg4.Sg(8);
                        com.bytedance.sdk.openadsdk.AlY.tN.YFl(Sg4);
                    }
                });
                return true;
            } catch (Throwable th2) {
                String message = th2.getMessage();
                com.bytedance.sdk.component.utils.YoT.YFl("OpenUtils", message);
                com.bytedance.sdk.openadsdk.pDU.YFl.Sg Sg3 = Sg(str2, 12, wwa);
                Sg3.tN(message);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(Sg3);
                return Sg(context, str, wwa, str2, YFl);
            }
        }
        return Sg(context, str, wwa, str2, YFl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Sg(Context context, String str, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.pDU.YFl.Sg Sg = Sg(str2, 100, wwa);
                Sg.YFl(true);
                Sg.Sg(2);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(Sg);
                return true;
            } catch (Throwable th2) {
                String message = th2.getMessage();
                com.bytedance.sdk.openadsdk.pDU.YFl.Sg Sg2 = Sg(str2, 7, wwa);
                Sg2.tN(message);
                Sg2.Sg(2);
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(Sg2);
                return false;
            }
        } catch (Throwable th3) {
            String message2 = th3.getMessage();
            com.bytedance.sdk.openadsdk.pDU.YFl.Sg Sg3 = Sg(str2, 6, wwa);
            Sg3.tN(message2);
            Sg3.Sg(2);
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(Sg3);
            return false;
        }
    }

    public static boolean Sg(Context context, String str, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str2) {
        if (context instanceof Activity) {
            if (!YFl((Activity) context)) {
                context = null;
            }
        } else {
            Activity Sg = com.bytedance.sdk.openadsdk.core.EH.YFl().wN().Sg();
            if (Sg != null && YFl(Sg)) {
                context = Sg;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.lG.YFl();
        }
        Context context2 = context;
        if (context2 == null || !YFl(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        HashMap q10 = j.q("deeplink_url", str);
        q10.put("jsb_deeplink", 1);
        if (com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.tN.YFl()) {
            return com.bytedance.sdk.openadsdk.Wwa.YFl.YFl.tN.YFl(context2, str, wwa, Sco.Sg(wwa), q10, true);
        }
        if (Sco.qsH(context2)) {
            if (Sco.YFl(context2, intent)) {
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str2, "open_url_app", q10);
                try {
                    if (!(context2 instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context2.startActivity(intent);
                    com.bytedance.sdk.openadsdk.AlY.YoT.YFl().YFl(q10).YFl(wwa, str2);
                    return true;
                } catch (Throwable unused) {
                }
            }
            return false;
        }
        try {
            if (!(context2 instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str2, "open_url_app", q10);
            context2.startActivity(intent);
            com.bytedance.sdk.openadsdk.AlY.YoT.YFl().YFl(q10).YFl(wwa, str2);
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static boolean YFl(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean YFl(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
