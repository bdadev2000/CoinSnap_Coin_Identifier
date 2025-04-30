package com.tools.arruler.app;

import D0.k;
import J1.C0209b;
import J1.w;
import J1.x;
import J1.z;
import R3.e;
import W6.b;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.webkit.WebView;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.facebook.r;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.play_billing.zzb;
import com.tools.arruler.photomeasure.camera.ruler.R;
import j6.f;
import java.util.ArrayList;
import java.util.List;
import m1.g;
import n1.C2475f;
import p1.C2537a;
import p1.C2538b;
import q1.C2639a;
import s6.h;
import t7.AbstractC2712a;
import t7.C2724m;
import u1.AbstractC2748a;
import u7.AbstractC2817h;

/* loaded from: classes3.dex */
public final class ArRulerApplication extends h {

    /* renamed from: g, reason: collision with root package name */
    public static ArRulerApplication f19628g;

    /* renamed from: h, reason: collision with root package name */
    public static final C2724m f19629h = AbstractC2712a.d(new f(3));

    /* renamed from: f, reason: collision with root package name */
    public boolean f19630f = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [q1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, q4.d] */
    /* JADX WARN: Type inference failed for: r4v23, types: [com.adjust.sdk.OnEventTrackingSucceededListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, com.adjust.sdk.OnEventTrackingFailedListener] */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    @Override // s6.h, android.app.Application
    public final void onCreate() {
        Boolean valueOf;
        String processName;
        String str;
        super.onCreate();
        ?? obj = new Object();
        obj.f22746a = false;
        obj.f22747c = new ArrayList();
        obj.f22749e = "client_token";
        obj.f22751g = 0;
        obj.f22746a = false;
        obj.f22748d = this;
        this.b = obj;
        String string = getResources().getString(R.string.adjust_token);
        k kVar = new k();
        int i9 = 1;
        kVar.f624c = true;
        kVar.b = string;
        this.b.f22747c.addAll(AbstractC2817h.B("89D79186493977B450C24783CE9F099D", "716AB81EC0FF6C8A459A0BD1E0743FC2", "5FB5763BBE592EFFF2DC6E8096F42051"));
        C2639a c2639a = this.b;
        c2639a.b = kVar;
        c2639a.f22749e = getResources().getString(R.string.facebook_client_token);
        this.b.f22750f = getResources().getString(R.string.adjust_token_tiktok);
        this.b.f22751g = 30;
        C2475f p2 = C2475f.p();
        C2639a c2639a2 = this.b;
        if (c2639a2 != null) {
            p2.f21833c = c2639a2;
            AbstractC2748a.f23066a = Boolean.valueOf(c2639a2.f22746a);
            k kVar2 = c2639a2.b;
            if (kVar2 == null) {
                valueOf = Boolean.FALSE;
            } else {
                valueOf = Boolean.valueOf(kVar2.f624c);
            }
            if (valueOf.booleanValue()) {
                r8.k.b = true;
                boolean z8 = c2639a2.f22746a;
                String str2 = c2639a2.b.b;
                if (z8) {
                    str = AdjustConfig.ENVIRONMENT_SANDBOX;
                } else {
                    str = AdjustConfig.ENVIRONMENT_PRODUCTION;
                }
                AdjustConfig adjustConfig = new AdjustConfig(((C2639a) p2.f21833c).f22748d, str2, str);
                adjustConfig.setLogLevel(LogLevel.VERBOSE);
                adjustConfig.setPreinstallTrackingEnabled(true);
                adjustConfig.setOnAttributionChangedListener(new e(28));
                adjustConfig.setOnEventTrackingSucceededListener(new Object());
                adjustConfig.setOnEventTrackingFailedListener(new Object());
                adjustConfig.setOnSessionTrackingSucceededListener(new L4.f(29));
                adjustConfig.setOnSessionTrackingFailedListener(new e(29));
                adjustConfig.setSendInBackground(true);
                Adjust.onCreate(adjustConfig);
                ((C2639a) p2.f21833c).f22748d.registerActivityLifecycleCallbacks(new Object());
            }
            g b = g.b();
            ArrayList arrayList = c2639a2.f22747c;
            String str3 = c2639a2.f22750f;
            b.getClass();
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                if (!getPackageName().equals(processName)) {
                    WebView.setDataDirectorySuffix(processName);
                }
            }
            MobileAds.initialize(this, new b(1));
            MobileAds.setRequestConfiguration(new RequestConfiguration.Builder().setTestDeviceIds(arrayList).build());
            b.l = str3;
            b.f21737j = this;
            r.f13805f = c2639a2.f22749e;
            r.j(this);
            g.b().f21733f = true;
            g.b().f21736i = true;
            ArrayList y4 = AbstractC2817h.y("sub_year_arruler1_19.99", "sub_month_arruler1_3.99");
            ArrayList y6 = AbstractC2817h.y("");
            C2538b a6 = C2538b.a();
            a6.getClass();
            if (AbstractC2748a.f23066a.booleanValue()) {
                y6.add("android.test.purchased");
            }
            a6.f22174a = C2538b.c("subs", y4);
            a6.b = C2538b.c("inapp", y6);
            C2537a c2537a = a6.f22186p;
            ?? obj2 = new Object();
            if (c2537a != null) {
                C0209b c0209b = new C0209b(obj2, this, c2537a);
                a6.f22177e = c0209b;
                C2537a c2537a2 = a6.f22187q;
                if (c0209b.a()) {
                    zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
                    c0209b.j(x.b(6));
                    c2537a2.a(z.f1561i);
                } else if (c0209b.f1492a == 1) {
                    zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
                    J1.g gVar = z.f1556d;
                    c0209b.i(x.a(37, 6, gVar));
                    c2537a2.a(gVar);
                } else if (c0209b.f1492a == 3) {
                    zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    J1.g gVar2 = z.f1562j;
                    c0209b.i(x.a(38, 6, gVar2));
                    c2537a2.a(gVar2);
                } else {
                    c0209b.f1492a = 1;
                    zzb.zzj("BillingClient", "Starting in-app billing setup.");
                    c0209b.f1498h = new w(c0209b, c2537a2);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = c0209b.f1495e.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str4 = serviceInfo.packageName;
                            String str5 = serviceInfo.name;
                            if ("com.android.vending".equals(str4) && str5 != null) {
                                ComponentName componentName = new ComponentName(str4, str5);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", c0209b.b);
                                if (c0209b.f1495e.bindService(intent2, c0209b.f1498h, 1)) {
                                    zzb.zzj("BillingClient", "Service was bonded successfully.");
                                } else {
                                    zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                                    i9 = 39;
                                }
                            } else {
                                zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                                i9 = 40;
                            }
                        }
                    } else {
                        i9 = 41;
                    }
                    c0209b.f1492a = 0;
                    zzb.zzj("BillingClient", "Billing service unavailable on device.");
                    J1.g gVar3 = z.f1555c;
                    c0209b.i(x.a(i9, 6, gVar3));
                    c2537a2.a(gVar3);
                }
                f19628g = this;
                if (a7.b.f4076f == null) {
                    a7.b.f4076f = new a7.b((Context) this, 0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        p2.getClass();
        throw new RuntimeException("Cant not set GamAdConfig null");
    }
}
