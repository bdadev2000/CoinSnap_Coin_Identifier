package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface AdNetworkDiscovery {

    /* renamed from: a, reason: collision with root package name */
    public static final float f29413a = 0.15f;

    /* loaded from: classes.dex */
    public enum WebViewResourceMatchingMethod {
        DEFAULT,
        DIRECT_CREATIVE_INFO,
        WEBVIEW_LOOKUP
    }

    long a(CreativeInfo creativeInfo);

    Pair<String, List<String>> a(Set<String> set);

    CreativeInfo a(Object obj);

    String a(Bundle bundle);

    String a(String str, String str2, WeakReference<WebView> weakReference);

    WeakReference<View> a(com.safedk.android.analytics.brandsafety.d dVar);

    WeakReference<WebView> a(List<WeakReference<WebView>> list, String str);

    List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar);

    List<CreativeInfo> a(WeakReference<View> weakReference, String str, boolean z2);

    void a(View view, int i2, int i3);

    void a(WebView webView);

    void a(WebView webView, Object obj);

    void a(com.safedk.android.analytics.brandsafety.d dVar, List<WeakReference<View>> list);

    void a(FileInputStream fileInputStream, FileDescriptor fileDescriptor);

    void a(FileInputStream fileInputStream, String str);

    void a(Object obj, Object obj2);

    void a(Object obj, String str);

    void a(String str, String str2, String str3, String str4);

    boolean a();

    boolean a(View view);

    boolean a(String str);

    boolean a(String str, Bundle bundle);

    boolean a(String str, String str2);

    WebViewResourceMatchingMethod b();

    String b(Object obj);

    void b(CreativeInfo creativeInfo);

    void b(Object obj, Object obj2);

    boolean b(View view);

    boolean b(String str);

    boolean b(String str, String str2);

    int c(String str);

    String c(View view);

    String c(String str, String str2);

    Set<String> c();

    a d();

    void d(View view);

    void d(String str, String str2);

    boolean d(String str);

    String e(String str, String str2);

    void e();

    void e(View view);

    boolean e(String str);

    RedirectDetails.RedirectType f(String str);

    String f();

    boolean f(View view);

    boolean f(String str, String str2);

    BrandSafetyUtils.AdType g(View view);

    String g(String str);

    List<String> g();

    View h(View view);

    String h();

    void h(String str);

    boolean i(String str);

    void j(String str);

    boolean k(String str);
}
