package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class tp {

    /* loaded from: classes2.dex */
    public class a extends p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27203a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f27204b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f27205c;

        public a(String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
            this.f27203a = str;
            this.f27204b = aVar;
            this.f27205c = jVar;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof AppLovinWebViewActivity) {
                ((AppLovinWebViewActivity) activity).loadUrl(this.f27203a, null);
                gc.c(this.f27204b.e(), this.f27204b.i(), this.f27204b.k());
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                gc.a(this.f27204b.e(), this.f27204b.i(), this.f27204b.k());
                this.f27205c.e().b(this);
            }
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
        String queryParameter = uri.getQueryParameter(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f29536f);
        if (URLUtil.isValidUrl(queryParameter)) {
            jVar.X().e(com.applovin.impl.sdk.network.d.b().d(StringUtils.appendQueryParameter(queryParameter, "clcode", bVar.getClCode())).a(false).b(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
            return;
        }
        jVar.J();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.J().b("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    public static boolean b(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f30048a);
        p02.startActivity(p12);
    }

    public static void b(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
        String emptyIfNull = StringUtils.emptyIfNull(uri.getQueryParameter("error"));
        String emptyIfNull2 = StringUtils.emptyIfNull(uri.getQueryParameter("exception"));
        String emptyIfNull3 = StringUtils.emptyIfNull(uri.getQueryParameter("details"));
        HashMap<String, String> hashMap = CollectionUtils.hashMap("source", emptyIfNull);
        CollectionUtils.putStringIfValid("top_main_method", emptyIfNull2, hashMap);
        CollectionUtils.putStringIfValid("details", emptyIfNull3, hashMap);
        if (bVar != null) {
            hashMap.putAll(ma.a(bVar));
        }
        jVar.E().a(la.S, (Map) hashMap);
    }

    public static Bundle a(Uri uri) {
        Bundle bundle = new Bundle();
        for (String str : uri.getQueryParameterNames()) {
            bundle.putString(str, uri.getQueryParameter(str));
        }
        return bundle;
    }

    private static boolean a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getPackageInfo("com.android.vending", 1);
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting("com.android.vending");
            return applicationEnabledSetting == 2 || applicationEnabledSetting == 3;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public static void a(Uri uri, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.adview.b g2 = aVar.g();
        String queryParameter = uri.getQueryParameter(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f29536f);
        if (TextUtils.isEmpty(queryParameter)) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().b("UriUtils", "Could not find url to load from query in original uri");
                return;
            }
            return;
        }
        String queryParameter2 = uri.getQueryParameter("load_type");
        if (RedirectEvent.f29828h.equalsIgnoreCase(queryParameter2)) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.adview.t.v("Loading new page externally: ", queryParameter, jVar.J(), "UriUtils");
            }
            a(queryParameter, aVar, jVar);
            return;
        }
        if (RedirectEvent.f29829i.equalsIgnoreCase(queryParameter2)) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.adview.t.v("Loading new page in WebView: ", queryParameter, jVar.J(), "UriUtils");
            }
            AppLovinNetworkBridge.webviewLoadUrl(g2, queryParameter);
            String queryParameter3 = uri.getQueryParameter("bg_color");
            if (StringUtils.isValidString(queryParameter3)) {
                g2.setBackgroundColor(Color.parseColor(queryParameter3));
                return;
            }
            return;
        }
        if ("in_app".equalsIgnoreCase(queryParameter2)) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.adview.t.v("Loading new page in slide-up webview: ", queryParameter, jVar.J(), "UriUtils");
            }
            jVar.e().a(new a(queryParameter, aVar, jVar));
            Intent intent = new Intent(com.applovin.impl.sdk.j.l(), (Class<?>) AppLovinWebViewActivity.class);
            intent.putExtra("sdk_key", jVar.b0());
            intent.setFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(com.applovin.impl.sdk.j.l(), intent);
            return;
        }
        if ("in_app_v2".equalsIgnoreCase(queryParameter2)) {
            aVar.a(aVar.i(), aVar.k(), (Uri) null, g2.getAndClearLastClickEvent(), (Bundle) null);
            if (aVar.j() != null) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.adview.t.v("Loading new page in Custom Tabs: ", queryParameter, jVar.J(), "UriUtils");
                }
                jVar.x().a(queryParameter, aVar, jVar.n0());
                return;
            }
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.adview.t.v("Custom Tabs not supported, loading new page externally: ", queryParameter, jVar.J(), "UriUtils");
            }
            a(queryParameter, aVar, jVar);
            return;
        }
        jVar.J();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.J().b("UriUtils", "Could not find load type in original uri");
        }
    }

    public static boolean a(Uri uri, Context context, com.applovin.impl.sdk.j jVar) {
        boolean z2 = false;
        if (uri == null) {
            return false;
        }
        try {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().d("UriUtils", "Opening URI: " + uri);
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            if ("market".equals(intent.getScheme()) || "play.google.com".equals(uri.getHost())) {
                if (((Boolean) jVar.a(sj.w6)).booleanValue() && a(context)) {
                    intent.setPackage(null);
                } else {
                    intent.setPackage("com.android.vending");
                }
            }
            jVar.f0().pauseForClick();
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            z2 = true;
        } catch (Throwable th) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().a("UriUtils", "Unable to open \"" + uri + "\".", th);
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("url", uri.toString());
            if ("play.google.com".equals(uri.getHost())) {
                CollectionUtils.putStringIfValid("details", (String) jVar.y().G().get("ps_version"), hashMap);
            }
            jVar.E().a("UriUtils", "openUri", th, hashMap);
        }
        if (!z2) {
            jVar.f0().resumeForClick();
        }
        return z2;
    }

    private static void a(String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.j jVar) {
        a(Uri.parse(str), aVar.g().getContext(), jVar);
        gc.b(aVar.e(), aVar.i(), aVar.k());
    }
}
