package A4;

import C0.i;
import C2.h;
import G2.g;
import G7.j;
import U4.C0316l;
import U4.q;
import Y4.w;
import a5.C0398b;
import android.adservices.topics.GetTopicsRequest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.applovin.impl.n9;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C0755g;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.mediation.adapters.AppLovinAdapterAdViewListener;
import com.applovin.mediation.adapters.NimbusMediationAdapter;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.facebook.C;
import com.facebook.C0785a;
import com.facebook.C1825c;
import com.facebook.C1827e;
import com.facebook.E;
import com.facebook.EnumC1828f;
import com.facebook.F;
import com.facebook.appevents.o;
import com.facebook.internal.AbstractC1839h;
import com.facebook.internal.C1834c;
import com.facebook.v;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.v1.TraceMetric;
import i5.EnumC2355j;
import i5.J;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.r;
import k3.s;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f50d;

    public /* synthetic */ d(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f49c = obj;
        this.f50d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        boolean z8;
        String str;
        Iterator it;
        Long l;
        Date date;
        Date date2;
        boolean z9;
        boolean z10 = false;
        switch (this.b) {
            case 0:
                f fVar = (f) this.f49c;
                fVar.getClass();
                try {
                    r rVar = fVar.f60h;
                    h3.d dVar = h3.d.f20587d;
                    if (rVar instanceof r) {
                        s.a().f21453d.a(rVar.f21446a.b(dVar), 1);
                    } else {
                        String s5 = android.support.v4.media.session.a.s("ForcedSender");
                        if (Log.isLoggable(s5, 5)) {
                            Log.w(s5, "Expected instance of `TransportImpl`, got `" + rVar + "`.");
                        }
                    }
                } catch (Exception unused) {
                }
                ((CountDownLatch) this.f50d).countDown();
                return;
            case 1:
                ((ProfileInstallerInitializer) this.f49c).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = i.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new C0.f((Context) this.f50d, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 2:
                h hVar = (h) this.f49c;
                Runnable runnable = (Runnable) this.f50d;
                if (!O2.a.b(h.class)) {
                    try {
                        j.e(hVar, "this$0");
                        j.e(runnable, "$queryPurchaseHistoryRunnable");
                        hVar.d(new ArrayList(hVar.f518r), runnable);
                        return;
                    } catch (Throwable th) {
                        O2.a.a(h.class, th);
                        return;
                    }
                }
                return;
            case 3:
                String str2 = (String) this.f49c;
                com.facebook.appevents.e eVar = (com.facebook.appevents.e) this.f50d;
                if (!O2.a.b(G2.b.class)) {
                    try {
                        j.e(str2, "$applicationId");
                        j.e(eVar, "$event");
                        List w2 = android.support.v4.media.session.a.w(eVar);
                        if (!O2.a.b(g.class)) {
                            try {
                                g.f1273a.b(G2.d.CUSTOM_APP_EVENTS, str2, w2);
                                return;
                            } catch (Throwable th2) {
                                O2.a.a(g.class, th2);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        O2.a.a(G2.b.class, th3);
                        return;
                    }
                }
                return;
            case 4:
                ((K.b) this.f49c).h((Typeface) this.f50d);
                return;
            case 5:
                ((C0316l) this.f49c).getClass();
                C0316l.a((Intent) this.f50d);
                return;
            case 6:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f50d;
                q qVar = (q) this.f49c;
                qVar.getClass();
                try {
                    taskCompletionSource.setResult(qVar.a());
                    return;
                } catch (Exception e4) {
                    taskCompletionSource.setException(e4);
                    return;
                }
            case 7:
                w wVar = (w) this.f49c;
                Context context = (Context) this.f50d;
                if (wVar.f3815a == null && context != null) {
                    wVar.f3815a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                    return;
                }
                return;
            case 8:
                h5.i iVar = AppStartTrace.f14341y;
                AppStartTrace appStartTrace = (AppStartTrace) this.f49c;
                appStartTrace.getClass();
                appStartTrace.f14343c.c((TraceMetric) ((J) this.f50d).build(), EnumC2355j.FOREGROUND_BACKGROUND);
                return;
            case 9:
                ((com.applovin.impl.adview.a) this.f49c).a((AppLovinAd) this.f50d);
                return;
            case 10:
                ((com.applovin.impl.adview.a) this.f49c).b((MotionEvent) this.f50d);
                return;
            case 11:
                ((com.applovin.impl.adview.a) this.f49c).b((WebView) this.f50d);
                return;
            case 12:
                ((AppLovinAdServiceImpl) this.f49c).a((n9) this.f50d);
                return;
            case 13:
                ((C0755g) this.f49c).a((View) this.f50d);
                return;
            case 14:
                ((com.applovin.impl.sdk.j) this.f49c).a((Activity) this.f50d);
                return;
            case 15:
                ((com.applovin.impl.sdk.j) this.f49c).a((String) this.f50d);
                return;
            case 16:
                ((k) this.f49c).a((AppLovinSdkInitializationConfiguration) this.f50d);
                return;
            case 17:
                ((l) this.f49c).b((AppLovinBidTokenCollectionListener) this.f50d);
                return;
            case 18:
                m.a((m) this.f49c, (AppLovinBidTokenCollectionListener) this.f50d);
                return;
            case 19:
                com.applovin.impl.sdk.nativeAd.b.e((com.applovin.impl.sdk.nativeAd.b) this.f49c, (AppLovinNativeAdImpl) this.f50d);
                return;
            case 20:
                ((com.applovin.impl.sdk.q) this.f49c).a((Long) this.f50d);
                return;
            case 21:
                ((com.applovin.impl.sdk.w) this.f49c).a((GetTopicsRequest) this.f50d);
                return;
            case 22:
                ((com.applovin.impl.sdk.w) this.f49c).a((String) this.f50d);
                return;
            case 23:
                ((com.applovin.impl.sdk.w) this.f49c).a((List) this.f50d);
                return;
            case 24:
                AppLovinAdapterAdViewListener.a((AppLovinAdapterAdViewListener) this.f49c, (AppLovinAd) this.f50d);
                return;
            case 25:
                NimbusMediationAdapter.NimbusAdapterAdViewListener.a((NimbusMediationAdapter.NimbusAdapterAdViewListener) this.f49c, (AppLovinAd) this.f50d);
                return;
            case 26:
                Context context2 = (Context) this.f49c;
                j.e(context2, "$applicationContext");
                String str3 = (String) this.f50d;
                j.e(str3, "$applicationId");
                com.facebook.r rVar2 = com.facebook.r.f13801a;
                if (!O2.a.b(rVar2)) {
                    try {
                        C1834c b = AbstractC1839h.b(context2);
                        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                        String j7 = j.j("ping", str3);
                        long j9 = sharedPreferences.getLong(j7, 0L);
                        try {
                            HashMap hashMap = E2.g.f992a;
                            JSONObject a6 = E2.g.a(E2.f.b, b, e1.f.j(context2), com.facebook.r.f(context2), context2);
                            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str3}, 1));
                            com.facebook.r.f13815r.getClass();
                            String str4 = C.f13380j;
                            C x9 = R3.e.x(null, format, a6, null);
                            if (j9 == 0 && x9.c().f13407c == null) {
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                edit.putLong(j7, System.currentTimeMillis());
                                edit.apply();
                                return;
                            }
                            return;
                        } catch (JSONException e9) {
                            throw new RuntimeException("An error occurred while publishing install.", e9);
                        }
                    } catch (Exception unused2) {
                        return;
                    } catch (Throwable th4) {
                        O2.a.a(rVar2, th4);
                        return;
                    }
                }
                return;
            case 27:
                ArrayList arrayList = (ArrayList) this.f49c;
                j.e(arrayList, "$callbacks");
                E e10 = (E) this.f50d;
                j.e(e10, "$requests");
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    v vVar = (v) pair.first;
                    Object obj = pair.second;
                    j.d(obj, "pair.second");
                    vVar.a((F) obj);
                }
                for (Iterator it3 = e10.f13404f.iterator(); it3.hasNext(); it3 = it) {
                    C1825c c1825c = (C1825c) it3.next();
                    C0785a c0785a = c1825c.b;
                    U4.r rVar3 = c1825c.f13525a;
                    j.e(rVar3, "$refreshResult");
                    AtomicBoolean atomicBoolean = c1825c.f13526c;
                    j.e(atomicBoolean, "$permissionsCallSucceeded");
                    Set set = c1825c.f13527d;
                    j.e(set, "$permissions");
                    Set set2 = c1825c.f13528e;
                    j.e(set2, "$declinedPermissions");
                    Set set3 = c1825c.f13529f;
                    j.e(set3, "$expiredPermissions");
                    C1827e c1827e = c1825c.f13530g;
                    j.e(c1827e, "this$0");
                    AtomicBoolean atomicBoolean2 = c1827e.f13535d;
                    String str5 = (String) rVar3.f3324a;
                    int i9 = rVar3.b;
                    Long l2 = (Long) rVar3.f3327e;
                    String str6 = (String) rVar3.f3326d;
                    try {
                        R3.e eVar2 = C1827e.f13531f;
                        if (eVar2.s().f13534c != null) {
                            try {
                                C0785a c0785a2 = eVar2.s().f13534c;
                                if (c0785a2 == null) {
                                    str = null;
                                } else {
                                    str = c0785a2.f13449k;
                                }
                                if (str != c0785a.f13449k) {
                                    z9 = z10;
                                    it = it3;
                                } else {
                                    if (!atomicBoolean.get() && str5 == null && i9 == 0) {
                                        atomicBoolean2.set(z10);
                                        z9 = z10;
                                        it = it3;
                                    } else {
                                        Date date3 = c0785a.b;
                                        if (rVar3.b != 0) {
                                            it = it3;
                                            date = new Date(rVar3.b * 1000);
                                            l = l2;
                                        } else {
                                            it = it3;
                                            if (rVar3.f3325c != 0) {
                                                long time = new Date().getTime();
                                                int i10 = rVar3.f3325c;
                                                l = l2;
                                                date3 = new Date((i10 * 1000) + time);
                                            } else {
                                                l = l2;
                                            }
                                            date = date3;
                                        }
                                        if (str5 == null) {
                                            str5 = c0785a.f13445g;
                                        }
                                        String str7 = str5;
                                        String str8 = c0785a.f13448j;
                                        String str9 = c0785a.f13449k;
                                        if (!atomicBoolean.get()) {
                                            set = c0785a.f13442c;
                                        }
                                        Set set4 = set;
                                        if (!atomicBoolean.get()) {
                                            set2 = c0785a.f13443d;
                                        }
                                        Set set5 = set2;
                                        if (!atomicBoolean.get()) {
                                            set3 = c0785a.f13444f;
                                        }
                                        Set set6 = set3;
                                        EnumC1828f enumC1828f = c0785a.f13446h;
                                        Date date4 = new Date();
                                        if (l != null) {
                                            date2 = new Date(l.longValue() * 1000);
                                        } else {
                                            date2 = c0785a.l;
                                        }
                                        Date date5 = date2;
                                        if (str6 == null) {
                                            str6 = c0785a.m;
                                        }
                                        eVar2.s().c(new C0785a(str7, str8, str9, set4, set5, set6, enumC1828f, date, date4, date5, str6), true);
                                        atomicBoolean2.set(false);
                                        z9 = false;
                                    }
                                    z10 = z9;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z8 = false;
                                atomicBoolean2.set(z8);
                                throw th;
                            }
                        } else {
                            it = it3;
                            z9 = z10;
                        }
                        atomicBoolean2.set(z9);
                        z10 = z9;
                    } catch (Throwable th6) {
                        th = th6;
                        z8 = z10;
                    }
                }
                return;
            case 28:
                com.facebook.appevents.b bVar = (com.facebook.appevents.b) this.f49c;
                com.facebook.appevents.e eVar3 = (com.facebook.appevents.e) this.f50d;
                if (!O2.a.b(com.facebook.appevents.h.class)) {
                    try {
                        j.e(bVar, "$accessTokenAppId");
                        j.e(eVar3, "$appEvent");
                        D0.i iVar2 = com.facebook.appevents.h.f13483a;
                        synchronized (iVar2) {
                            com.facebook.appevents.s c9 = iVar2.c(bVar);
                            if (c9 != null) {
                                c9.a(eVar3);
                            }
                        }
                        String str10 = com.facebook.appevents.l.f13492c;
                        if (C0398b.u() != com.facebook.appevents.j.f13488c && com.facebook.appevents.h.f13483a.b() > 100) {
                            com.facebook.appevents.h.d(o.f13507d);
                            return;
                        } else {
                            if (com.facebook.appevents.h.f13484c == null) {
                                com.facebook.appevents.h.f13484c = com.facebook.appevents.h.b.schedule(com.facebook.appevents.h.f13485d, 15L, TimeUnit.SECONDS);
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th7) {
                        O2.a.a(com.facebook.appevents.h.class, th7);
                        return;
                    }
                }
                return;
            default:
                com.facebook.appevents.b bVar2 = (com.facebook.appevents.b) this.f49c;
                com.facebook.appevents.s sVar = (com.facebook.appevents.s) this.f50d;
                if (!O2.a.b(com.facebook.appevents.h.class)) {
                    try {
                        j.e(bVar2, "$accessTokenAppId");
                        j.e(sVar, "$appEvents");
                        com.facebook.appevents.i.o(bVar2, sVar);
                        return;
                    } catch (Throwable th8) {
                        O2.a.a(com.facebook.appevents.h.class, th8);
                        return;
                    }
                }
                return;
        }
    }
}
