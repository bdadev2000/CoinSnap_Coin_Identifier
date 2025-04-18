package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class up {

    /* loaded from: classes.dex */
    public class a extends p {
        final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f8432b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f8433c;

        public a(String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
            this.a = str;
            this.f8432b = aVar;
            this.f8433c = kVar;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof AppLovinWebViewActivity) {
                ((AppLovinWebViewActivity) activity).loadUrl(this.a, null);
                bc.c(this.f8432b.e(), this.f8432b.i(), this.f8432b.k());
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                bc.a(this.f8432b.e(), this.f8432b.i(), this.f8432b.k());
                this.f8433c.e().b(this);
            }
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            kVar.Z().e(com.applovin.impl.sdk.network.d.b().d(StringUtils.appendQueryParameter(queryParameter, "clcode", bVar.getClCode())).a(false).b(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
            return;
        }
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().b("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    public static boolean b(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static void b(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        String emptyIfNull = StringUtils.emptyIfNull(uri.getQueryParameter("error"));
        String emptyIfNull2 = StringUtils.emptyIfNull(uri.getQueryParameter("exception"));
        String emptyIfNull3 = StringUtils.emptyIfNull(uri.getQueryParameter("details"));
        HashMap<String, String> hashMap = CollectionUtils.hashMap("source", emptyIfNull);
        CollectionUtils.putStringIfValid("top_main_method", emptyIfNull2, hashMap);
        CollectionUtils.putStringIfValid("details", emptyIfNull3, hashMap);
        if (bVar != null) {
            CollectionUtils.putStringIfValid("ad_size", bVar.getSize().toString(), hashMap);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(bVar.getAdIdNumber()), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", bVar.getDspName(), hashMap);
        }
        kVar.B().a(o.b.TEMPLATE_ERROR, (Map) hashMap);
    }

    public static Bundle a(Uri uri) {
        Bundle bundle = new Bundle();
        for (String str : uri.getQueryParameterNames()) {
            bundle.putString(str, uri.getQueryParameter(str));
        }
        return bundle;
    }

    public static void a(Uri uri, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        com.applovin.impl.adview.b g10 = aVar.g();
        String queryParameter = uri.getQueryParameter("n");
        if (TextUtils.isEmpty(queryParameter)) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("UriUtils", "Could not find url to load from query in original uri");
                return;
            }
            return;
        }
        String queryParameter2 = uri.getQueryParameter("load_type");
        if ("external".equalsIgnoreCase(queryParameter2)) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.v("Loading new page externally: ", queryParameter, kVar.L(), "UriUtils");
            }
            a(queryParameter, aVar, kVar);
            return;
        }
        if ("internal".equalsIgnoreCase(queryParameter2)) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.v("Loading new page in WebView: ", queryParameter, kVar.L(), "UriUtils");
            }
            g10.loadUrl(queryParameter);
            String queryParameter3 = uri.getQueryParameter("bg_color");
            if (StringUtils.isValidString(queryParameter3)) {
                g10.setBackgroundColor(Color.parseColor(queryParameter3));
                return;
            }
            return;
        }
        if ("in_app".equalsIgnoreCase(queryParameter2)) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.v("Loading new page in slide-up webview: ", queryParameter, kVar.L(), "UriUtils");
            }
            kVar.e().a(new a(queryParameter, aVar, kVar));
            Intent intent = new Intent(com.applovin.impl.sdk.k.k(), (Class<?>) AppLovinWebViewActivity.class);
            intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, kVar.d0());
            intent.setFlags(268435456);
            com.applovin.impl.sdk.k.k().startActivity(intent);
            return;
        }
        if ("in_app_v2".equalsIgnoreCase(queryParameter2)) {
            if (aVar.j() != null) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    a4.j.v("Loading new page in Custom Tabs: ", queryParameter, kVar.L(), "UriUtils");
                }
                kVar.w().a(queryParameter, aVar, kVar.p0());
                return;
            }
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.v("Custom Tabs not supported, loading new page externally: ", queryParameter, kVar.L(), "UriUtils");
            }
            a(queryParameter, aVar, kVar);
            return;
        }
        kVar.L();
        if (com.applovin.impl.sdk.t.a()) {
            kVar.L().b("UriUtils", "Could not find load type in original uri");
        }
    }

    public static boolean a(Uri uri, Context context, com.applovin.impl.sdk.k kVar) {
        boolean z10 = false;
        if (uri == null) {
            return false;
        }
        try {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().d("UriUtils", "Opening URI: " + uri);
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            if ("market".equals(intent.getScheme()) || "play.google.com".equals(uri.getHost())) {
                intent.setPackage("com.android.vending");
            }
            kVar.f0().pauseForClick();
            context.startActivity(intent);
            z10 = true;
        } catch (Throwable th2) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("UriUtils", "Unable to open \"" + uri + "\".", th2);
            }
            kVar.B().a("UriUtils", "openUri", th2, CollectionUtils.hashMap("url", uri.getHost() + uri.getPath()));
        }
        if (!z10) {
            kVar.f0().resumeForClick();
        }
        return z10;
    }

    private static void a(String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        a(Uri.parse(str), aVar.g().getContext(), kVar);
        bc.b(aVar.e(), aVar.i(), aVar.k());
    }
}
