package com.plantcare.ai.identifier.plantid.app;

import a4.d;
import android.app.Application;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.webkit.WebView;
import androidx.lifecycle.g0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n;
import c6.k;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.LogLevel;
import com.ads.control.admob.AppOpenManager;
import com.facebook.x;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.IapDomain;
import com.plantcare.ai.identifier.plantid.ui.component.language.LanguageActivity;
import com.plantcare.ai.identifier.plantid.ui.component.onboarding.OnBoardingActivity;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity;
import d3.f;
import d3.g;
import dg.e;
import g3.c;
import h3.a;
import h3.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p000if.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/plantcare/ai/identifier/plantid/app/GlobalApp;", "Lf3/a;", "", "onAppBackgrounded", "onAppForegrounded", "<init>", "()V", "qc/s0", "Plant_ID_AI_Plant_Identifier_v1.1.5_v115_04.05.2025_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GlobalApp extends j {

    /* renamed from: f */
    public static GlobalApp f16592f;

    /* renamed from: g */
    public static boolean f16593g;

    /* renamed from: h */
    public static boolean f16594h = true;

    /* renamed from: i */
    public static boolean f16595i;

    /* renamed from: j */
    public static boolean f16596j;

    public static e b() {
        String language = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
        ArrayList arrayList = new ArrayList();
        arrayList.add("cs");
        arrayList.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR);
        arrayList.add("en");
        arrayList.add("es");
        arrayList.add("fil");
        arrayList.add("fr");
        arrayList.add("hi");
        arrayList.add("hr");
        arrayList.add("in");
        arrayList.add("it");
        arrayList.add("ko");
        arrayList.add("ja");
        arrayList.add("ms");
        arrayList.add("nl");
        arrayList.add("pl");
        arrayList.add("pt");
        arrayList.add("ru");
        arrayList.add("sr");
        arrayList.add("sv");
        arrayList.add("tr");
        arrayList.add("vi");
        arrayList.add("zh");
        if (!arrayList.contains(language)) {
            language = "";
        }
        ArrayList arrayList2 = new ArrayList();
        String str = language;
        arrayList2.add(new e("Hindi", "hi", false, Integer.valueOf(R.drawable.ic_hindi)));
        arrayList2.add(new e("Spanish", "es", false, Integer.valueOf(R.drawable.ic_spanish)));
        arrayList2.add(new e("Croatian", "hr", false, Integer.valueOf(R.drawable.ic_croatia)));
        arrayList2.add(new e("Czech", "cs", false, Integer.valueOf(R.drawable.ic_czech_republic)));
        arrayList2.add(new e("Dutch", "nl", false, Integer.valueOf(R.drawable.ic_dutch)));
        arrayList2.add(new e("English", "en", false, Integer.valueOf(R.drawable.ic_english)));
        arrayList2.add(new e("Filipino", "fil", false, Integer.valueOf(R.drawable.ic_filipino)));
        arrayList2.add(new e("French", "fr", false, Integer.valueOf(R.drawable.ic_france)));
        arrayList2.add(new e("German", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, false, Integer.valueOf(R.drawable.ic_german)));
        arrayList2.add(new e("Indonesian", "in", false, Integer.valueOf(R.drawable.ic_indonesian)));
        arrayList2.add(new e("Italian", "it", false, Integer.valueOf(R.drawable.ic_italian)));
        arrayList2.add(new e("Japanese", "ja", false, Integer.valueOf(R.drawable.ic_japanese)));
        arrayList2.add(new e("Korean", "ko", false, Integer.valueOf(R.drawable.ic_korean)));
        arrayList2.add(new e("Malay", "ms", false, Integer.valueOf(R.drawable.ic_malay)));
        arrayList2.add(new e("Polish", "pl", false, Integer.valueOf(R.drawable.ic_polish)));
        arrayList2.add(new e("Portuguese", "pt", false, Integer.valueOf(R.drawable.ic_portugal)));
        arrayList2.add(new e("Russian", "ru", false, Integer.valueOf(R.drawable.ic_russian)));
        arrayList2.add(new e("Serbian", "sr", false, Integer.valueOf(R.drawable.ic_serbian)));
        arrayList2.add(new e("Swedish", "sv", false, Integer.valueOf(R.drawable.ic_swedish)));
        arrayList2.add(new e("Turkish", "tr", false, Integer.valueOf(R.drawable.ic_turkish)));
        arrayList2.add(new e("Vietnamese", "vi", false, Integer.valueOf(R.drawable.ic_vietnamese)));
        arrayList2.add(new e("China", "zh", false, Integer.valueOf(R.drawable.ic_china)));
        arrayList2.add(new e("Belgium", "nl", false, Integer.valueOf(R.drawable.belgium)));
        Iterator it = arrayList2.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                return null;
            }
            e eVar = (e) it.next();
            if (eVar != null) {
                str2 = eVar.f17039c;
            }
            String str3 = str;
            if (Intrinsics.areEqual(str3, str2)) {
                return eVar;
            }
            str = str3;
        }
    }

    @g0(n.ON_STOP)
    public final void onAppBackgrounded() {
        f16594h = false;
    }

    @g0(n.ON_START)
    public final void onAppForegrounded() {
        f16594h = true;
    }

    @Override // p000if.j, f3.a, android.app.Application
    public final void onCreate() {
        Boolean valueOf;
        String processName;
        String str;
        super.onCreate();
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        f16592f = this;
        this.f17667b = new b(this, 0);
        a aVar = new a(getResources().getString(R.string.adjust_token));
        b bVar = this.f17667b;
        bVar.f18727b = aVar;
        bVar.f18732g = getResources().getString(R.string.facebook_client_token);
        b bVar2 = this.f17667b;
        String string = getResources().getString(R.string.event_token);
        bVar2.getClass();
        b.f18726j = string;
        bVar2.f18733h = string;
        b bVar3 = this.f17667b;
        bVar3.f18734i = 35;
        bVar3.f18729d = CollectionsKt.listOf((Object[]) new String[]{"24CF6F28E641E91BF9C45786F8F722ED", "24CF6F28E641E91BF9C45786F8F722ED"});
        if (c.a().f18018m) {
            b bVar4 = this.f17667b;
            bVar4.f18728c = "";
            bVar4.f18731f = true;
        } else {
            b bVar5 = this.f17667b;
            bVar5.f18728c = "ca-app-pub-6691965685689933/7126981906";
            bVar5.f18731f = true;
        }
        g r6 = g.r();
        b bVar6 = this.f17667b;
        if (bVar6 != null) {
            r6.f16812c = bVar6;
            l3.a.a = Boolean.valueOf(bVar6.a);
            a aVar2 = bVar6.f18727b;
            if (aVar2 == null) {
                valueOf = Boolean.FALSE;
            } else {
                valueOf = Boolean.valueOf(aVar2.f18722c);
            }
            if (valueOf.booleanValue()) {
                k.f2645e = true;
                Boolean valueOf2 = Boolean.valueOf(bVar6.a);
                String str2 = (String) bVar6.f18727b.f18723d;
                if (valueOf2.booleanValue()) {
                    str = AdjustConfig.ENVIRONMENT_SANDBOX;
                } else {
                    str = AdjustConfig.ENVIRONMENT_PRODUCTION;
                }
                AdjustConfig adjustConfig = new AdjustConfig(((b) r6.f16812c).f18730e, str2, str);
                adjustConfig.setLogLevel(LogLevel.VERBOSE);
                adjustConfig.setPreinstallTrackingEnabled(true);
                adjustConfig.setOnAttributionChangedListener(new v5.b());
                adjustConfig.setOnEventTrackingSucceededListener(new fb.c(r6, 13));
                adjustConfig.setOnEventTrackingFailedListener(new kc.c(r6, 13));
                adjustConfig.setOnSessionTrackingSucceededListener(new f.a(r6, 12));
                adjustConfig.setOnSessionTrackingFailedListener(new v5.b());
                adjustConfig.setSendInBackground(true);
                Adjust.onCreate(adjustConfig);
                ((b) r6.f16812c).f18730e.registerActivityLifecycleCallbacks(new f());
            }
            c3.j b3 = c3.j.b();
            List<String> list = bVar6.f18729d;
            String str3 = bVar6.f18733h;
            b3.getClass();
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                if (!getPackageName().equals(processName)) {
                    WebView.setDataDirectorySuffix(processName);
                }
            }
            MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: c3.a
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public final void onInitializationComplete(InitializationStatus initializationStatus) {
                    Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
                    for (String str4 : adapterStatusMap.keySet()) {
                        AdapterStatus adapterStatus = adapterStatusMap.get(str4);
                        if (adapterStatus != null) {
                            Log.d("ITGStudio", String.format("Adapter name: %s, Description: %s, Latency: %d", str4, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
                        }
                    }
                }
            });
            MobileAds.setRequestConfiguration(new RequestConfiguration.Builder().setTestDeviceIds(list).build());
            b3.f2576l = str3;
            b3.f2574j = this;
            if (Boolean.valueOf(bVar6.f18731f).booleanValue()) {
                AppOpenManager f10 = AppOpenManager.f();
                Application application = bVar6.f18730e;
                String str4 = bVar6.f18728c;
                f10.f2916m = false;
                f10.f2911h = application;
                application.registerActivityLifecycleCallbacks(f10);
                l0.f1793k.f1799h.a(f10);
                f10.f2909f = str4;
            }
            x.f11426f = bVar6.f18732g;
            x.k(this);
            c3.j.b().f2570f = true;
            c3.j.b().f2573i = true;
            AppOpenManager.f().c(SplashActivity.class);
            AppOpenManager.f().c(LanguageActivity.class);
            AppOpenManager.f().c(OnBoardingActivity.class);
            c a = c.a();
            ArrayList arrayList = new ArrayList();
            List<IapDomain> n10 = va.b.n();
            List<IapDomain> m10 = va.b.m();
            for (IapDomain iapDomain : n10) {
                if (!iapDomain.isTypeSubYear()) {
                    arrayList.add(iapDomain.getIdSub());
                }
            }
            for (IapDomain iapDomain2 : m10) {
                if (!iapDomain2.isTypeSubYear()) {
                    arrayList.add(iapDomain2.getIdSub());
                }
            }
            arrayList.add(va.b.l().getIdSub());
            ArrayList arrayList2 = new ArrayList();
            List<IapDomain> n11 = va.b.n();
            for (IapDomain iapDomain3 : va.b.m()) {
                if (iapDomain3.isTypeSubYear()) {
                    arrayList2.add(iapDomain3.getIdSub());
                }
            }
            for (IapDomain iapDomain4 : n11) {
                if (iapDomain4.isTypeSubYear()) {
                    arrayList2.add(iapDomain4.getIdSub());
                }
            }
            a.getClass();
            if (l3.a.a.booleanValue()) {
                arrayList.add("android.test.purchased");
            }
            a.a = c.b("subs", arrayList2);
            a.f18007b = c.b("inapp", arrayList);
            a4.c cVar = new a4.c(this);
            cVar.f86c = a.f18021p;
            cVar.b();
            d a10 = cVar.a();
            a.f18010e = a10;
            a10.J(a.f18022q);
            return;
        }
        r6.getClass();
        throw new RuntimeException("Cant not set GamAdConfig null");
    }
}
