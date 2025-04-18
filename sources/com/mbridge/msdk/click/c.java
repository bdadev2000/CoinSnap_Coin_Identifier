package com.mbridge.msdk.click;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.c.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.t;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c {
    static Handler a = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.click.c.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String str;
            String str2;
            String str3;
            super.handleMessage(message);
            try {
                if (message.what == 1000) {
                    int i10 = message.arg1;
                    int i11 = message.arg2;
                    Bundle data = message.getData();
                    if (data != null) {
                        String string = data.getString("rid");
                        String string2 = data.getString("rid_n");
                        str3 = data.getString(BidResponsedEx.KEY_CID);
                        str = string;
                        str2 = string2;
                    } else {
                        str = "";
                        str2 = str;
                        str3 = str2;
                    }
                    new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.m().c()).a(i10, i11, str, str2, str3);
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    };

    public static boolean a(CampaignEx campaignEx) {
        return true;
    }

    public static boolean b(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8192);
                if (packageInfo != null) {
                    return str.equals(packageInfo.packageName);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void c(Context context, String str) {
        if (str != null && context != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                if (resolveActivity != null) {
                    ActivityInfo activityInfo = resolveActivity.activityInfo;
                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                }
                context.startActivity(intent);
            } catch (Exception e2) {
                e2.printStackTrace();
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static boolean d(Context context, String str) {
        Intent intent;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            if (parse.getScheme().equals("intent")) {
                intent = Intent.parseUri(str, 1);
            } else if (parse.getScheme().equals("android-app")) {
                intent = Intent.parseUri(str, 2);
            } else {
                intent = new Intent("android.intent.action.VIEW", parse);
                intent.setData(parse);
            }
            if (intent == null) {
                return false;
            }
            intent.setComponent(null);
            intent.setSelector(null);
            if (a(context, intent)) {
                return true;
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th2) {
            ad.b("CommonClickUtil", th2.getMessage(), th2);
            return false;
        }
    }

    public static void e(Context context, String str) {
        if (context != null && str != null) {
            try {
                int i10 = MBCommonActivity.f12337d;
                Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
                intent.putExtra("url", str);
                if (!(context instanceof ContextThemeWrapper)) {
                    intent.setFlags(268435456);
                }
                context.startActivity(intent);
            } catch (ClassNotFoundException e2) {
                ad.b("CommonClickUtil", e2.getMessage());
            } catch (Throwable th2) {
                ad.b("CommonClickUtil", th2.getMessage());
            }
        }
    }

    public static String a(String str, String str2, String str3) {
        Map<String, b.a> p10;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String host = Uri.parse(str).getHost();
            com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b3 == null || (p10 = b3.p()) == null || TextUtils.isEmpty(host)) {
                return str;
            }
            Iterator<Map.Entry<String, b.a>> it = p10.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (!TextUtils.isEmpty(key) && host.contains(key)) {
                    b.a aVar = p10.get(key);
                    return aVar != null ? a(a(a(a(str, aVar.a(), String.valueOf(z.g(com.mbridge.msdk.foundation.controller.c.m().c()))), aVar.b(), String.valueOf(z.i(com.mbridge.msdk.foundation.controller.c.m().c()))), aVar.c(), str2), aVar.d(), str3) : str;
                }
            }
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    private static String a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String str3 : list) {
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replaceAll(str3, str2);
                }
            }
        }
        return str;
    }

    public static void a(Context context, String str) {
        Intent launchIntentForPackage;
        List<ResolveInfo> queryIntentActivities;
        ResolveInfo next;
        try {
            if (TextUtils.isEmpty(str) || !b(context, str) || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0)) == null || queryIntentActivities.size() <= 0 || (next = queryIntentActivities.iterator().next()) == null) {
                return;
            }
            ActivityInfo activityInfo = next.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            if (com.mbridge.msdk.e.b.a()) {
                Toast.makeText(context, "The app connot start up", 0).show();
            }
            e2.printStackTrace();
        }
    }

    private static boolean a(Context context, Intent intent) {
        try {
        } catch (Throwable th2) {
            ad.b("CommonClickUtil", th2.getMessage(), th2);
        }
        if (context instanceof Activity) {
            context.startActivity(intent);
            return true;
        }
        if (com.mbridge.msdk.foundation.controller.c.m().e() != null) {
            Context e2 = com.mbridge.msdk.foundation.controller.c.m().e();
            if (!(e2 instanceof Activity)) {
                return false;
            }
            e2.startActivity(intent);
            return true;
        }
        return false;
    }

    public static void a(final Context context, int i10, final String str) {
        if (i10 == 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.click.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Method method = t.class.getMethod("mia", Context.class, String.class);
                        Context context2 = context;
                        if (context2 != null) {
                            method.invoke(null, context2, str);
                        } else {
                            ad.b("CommonClickUtil", "Context is null");
                        }
                    } catch (Throwable th2) {
                        ad.b("CommonClickUtil", th2.getMessage());
                    }
                }
            });
        } catch (Throwable th2) {
            ad.b("CommonClickUtil", th2.getMessage());
        }
    }
}
