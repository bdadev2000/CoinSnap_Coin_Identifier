package com.mbridge.msdk.foundation.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ah extends l {

    /* renamed from: a, reason: collision with root package name */
    public static char[] f16003a = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};
    public static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public static LinearLayout f16004c;

    /* loaded from: classes3.dex */
    public static class a {
        public static boolean a(Context context, String str, NativeListener.NativeTrackingListener nativeTrackingListener) {
            try {
                List<ResolveInfo> a6 = a(context);
                if (a6 != null && a6.size() > 0) {
                    if (!a(str)) {
                        if (c(str)) {
                            str = "market://" + str.substring(str.indexOf("details?id="));
                        } else {
                            str = null;
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        return false;
                    }
                    Intent b = b(context);
                    b.setData(Uri.parse(str));
                    b.addFlags(268435456);
                    Iterator<ResolveInfo> it = a6.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                            b.setPackage("com.android.vending");
                            break;
                        }
                    }
                    context.startActivity(b);
                    ah.a(nativeTrackingListener);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                ad.b("SDKUtil", Log.getStackTraceString(th));
                return false;
            }
        }

        private static Intent b(Context context) {
            return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.package.name"));
        }

        private static boolean c(String str) {
            Uri parse;
            try {
                if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || TextUtils.isEmpty(parse.getHost())) {
                    return false;
                }
                if (!parse.getHost().equals("play.google.com")) {
                    if (!parse.getHost().equals("market.android.com")) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                ad.b("SDKUtil", Log.getStackTraceString(th));
            }
            return false;
        }

        public static boolean b(String str) {
            return a(str) || c(str);
        }

        private static List<ResolveInfo> a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(b(context), 0);
            } catch (Exception e4) {
                e4.printStackTrace();
                return null;
            }
        }

        public static boolean a(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th) {
                ad.b("SDKUtil", Log.getStackTraceString(th));
                return false;
            }
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File b8 = com.mbridge.msdk.foundation.same.b.e.b(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_IMG);
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            if (str.lastIndexOf("/") == -1) {
                str2 = str.hashCode() + "";
            } else {
                str2 = (str.substring(str.lastIndexOf("/") + 1).hashCode() + str.hashCode()) + "";
            }
        }
        return new File(b8, str2).getAbsolutePath();
    }

    public static void b(Campaign campaign, ViewGroup viewGroup) {
        a(campaign, viewGroup, 0, 0);
    }

    public static void a(Context context, String str, NativeListener.NativeTrackingListener nativeTrackingListener) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z8 = queryIntentActivities.size() > 0;
            if (!str.startsWith("market://")) {
                if (str.startsWith("https://play.google.com/")) {
                    a(context, "market://details?id=" + str.replace("https://play.google.com/store/apps/details?id=", ""), nativeTrackingListener);
                    return;
                }
                return;
            }
            if (!z8) {
                a(context, "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", ""), (BaseTrackingListener) nativeTrackingListener);
                return;
            }
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                    intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
                    break;
                }
            }
            try {
                context.startActivity(intent);
                a(nativeTrackingListener);
            } catch (Exception unused) {
                a(context, "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", ""), (BaseTrackingListener) nativeTrackingListener);
            }
        } catch (Exception e4) {
            ad.b("SDKUtil", e4.getMessage());
        }
    }

    public static void a(Campaign campaign, ViewGroup viewGroup) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    ad.d("SDKUtil", "hide linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    LinearLayout linearLayout = f16004c;
                    if (linearLayout == null) {
                        return;
                    }
                    viewGroup.removeView(linearLayout);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static void a(Context context, String str, BaseTrackingListener baseTrackingListener) {
        a(context, str, baseTrackingListener, (CampaignEx) null, new ArrayList());
    }

    public static void a(Context context, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        Intent intent;
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        if (list != null) {
            list.add("web_view");
        }
        if (b) {
            a(context, str, nativeTrackingListener, campaignEx, list);
            return;
        }
        try {
            int i9 = MBCommonActivity.f14600d;
            intent = new Intent(context, (Class<?>) MBCommonActivity.class);
        } catch (Exception unused) {
            dVar.a("result", 2);
            a(context, str, nativeTrackingListener, campaignEx, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (a.a(str)) {
            str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
        }
        intent.putExtra("url", str);
        ad.c("url", "webview url = " + str);
        intent.setFlags(268435456);
        intent.putExtra("mvcommon", campaignEx);
        context.startActivity(intent);
        dVar.a("result", 1);
        dVar.a("type", 9);
        if (list != null) {
            dVar.a("click_path", list.toString());
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", campaignEx, dVar);
    }

    public static void a(Context context, String str, BaseTrackingListener baseTrackingListener, CampaignEx campaignEx, List<String> list) {
        if (str == null || context == null) {
            return;
        }
        if (list != null) {
            list.add("browser");
        }
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        try {
            if (a.a(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setComponent(null);
            intent.setSelector(null);
            intent.addFlags(268435456);
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
            a(baseTrackingListener);
            dVar.a("result", 1);
        } catch (Exception e4) {
            e4.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268468224);
                context.startActivity(intent2);
                a(baseTrackingListener);
                dVar.a("result", 1);
            } catch (Exception e9) {
                e9.printStackTrace();
                dVar.a("result", 2);
            }
        }
        try {
            dVar.a("type", 5);
            if (list != null) {
                dVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", campaignEx, dVar);
        } catch (Exception unused) {
        }
    }

    public static void a(BaseTrackingListener baseTrackingListener) {
        if (baseTrackingListener instanceof NativeListener.TrackingExListener) {
            ((NativeListener.TrackingExListener) baseTrackingListener).onLeaveApp();
        }
    }

    public static void a(Context context, String str, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BaseTrackingListener baseTrackingListener, List<String> list) {
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        dVar.a("type", 9);
        try {
            BrowserView browserView = new BrowserView(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx);
            browserView.setLayoutParams(new LinearLayout.LayoutParams(z.i(context), z.g(context)));
            browserView.setListener(new com.mbridge.msdk.foundation.webview.a(context, campaignEx, aVar, browserView, baseTrackingListener));
            browserView.loadUrl(str);
            dVar.a("result", "1");
        } catch (Exception e4) {
            ad.b("SDKUtil", e4.getMessage());
            dVar.a("result", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        }
        if (list != null) {
            dVar.a("click_path", list.toString());
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", campaignEx, dVar);
    }

    public static void a(Campaign campaign, ViewGroup viewGroup, int i9, int i10) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    ad.d("SDKUtil", "show linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    if (f16004c == null) {
                        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (c9 instanceof Activity) {
                            f16004c = (LinearLayout) LayoutInflater.from(c9.getApplicationContext()).inflate(v.a(c9.getApplicationContext(), "mbridge_cm_loading_layout", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
                        } else {
                            f16004c = (LinearLayout) LayoutInflater.from(c9).inflate(v.a(c9, "mbridge_cm_loading_layout", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
                        }
                    }
                    int min = Math.min(viewGroup.getWidth(), viewGroup.getHeight());
                    int min2 = Math.min(Math.max(min / 4, 70), min);
                    if (viewGroup instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(min2, min2);
                        layoutParams.gravity = 17;
                        ar.a(f16004c);
                        viewGroup.addView(f16004c, layoutParams);
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(min2, min2);
                    if (i10 == 0 && i9 == 0) {
                        layoutParams2.addRule(13);
                    } else {
                        layoutParams2.leftMargin = i10;
                        layoutParams2.topMargin = i9;
                    }
                    ar.a(f16004c);
                    viewGroup.addView(f16004c, layoutParams2);
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }
}
