package com.facebook;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.widget.EditText;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import s7.a2;
import s7.j2;
import s7.l2;
import s7.v2;
import s7.x2;

/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11363c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11364d;

    public /* synthetic */ r0(int i10, Object obj, Object obj2) {
        this.f11362b = i10;
        this.f11363c = obj;
        this.f11364d = obj2;
    }

    private final void a() {
        db.o oVar = (db.o) this.f11363c;
        cc.c cVar = (cc.c) this.f11364d;
        synchronized (oVar) {
            if (oVar.f16963b == null) {
                oVar.a.add(cVar);
            } else {
                oVar.f16963b.add(cVar.get());
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        boolean z10;
        boolean z11;
        y7.x rVar;
        int i10;
        cc.a aVar;
        int i11 = this.f11362b;
        long j10 = C.TIME_UNSET;
        int i12 = 25;
        boolean z12 = true;
        int i13 = 1;
        z12 = true;
        boolean z13 = false;
        z13 = false;
        switch (i11) {
            case 1:
                com.facebook.appevents.b accessTokenAppIdPair = (com.facebook.appevents.b) this.f11363c;
                com.facebook.appevents.e appEvent = (com.facebook.appevents.e) this.f11364d;
                kc.c cVar = com.facebook.appevents.h.a;
                if (!m6.a.b(com.facebook.appevents.h.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "$accessTokenAppId");
                        Intrinsics.checkNotNullParameter(appEvent, "$appEvent");
                        kc.c cVar2 = com.facebook.appevents.h.a;
                        synchronized (cVar2) {
                            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                            Intrinsics.checkNotNullParameter(appEvent, "appEvent");
                            com.facebook.appevents.u s5 = cVar2.s(accessTokenAppIdPair);
                            if (s5 != null) {
                                s5.a(appEvent);
                            }
                        }
                        if (com.facebook.appevents.k.f10950b.r() != com.facebook.appevents.j.EXPLICIT_ONLY && com.facebook.appevents.h.a.r() > 100) {
                            com.facebook.appevents.h.d(com.facebook.appevents.p.EVENT_THRESHOLD);
                            return;
                        } else {
                            if (com.facebook.appevents.h.f10944c == null) {
                                com.facebook.appevents.h.f10944c = com.facebook.appevents.h.f10943b.schedule(com.facebook.appevents.h.f10945d, 15L, TimeUnit.SECONDS);
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        m6.a.a(com.facebook.appevents.h.class, th2);
                        return;
                    }
                }
                return;
            case 2:
                com.facebook.appevents.b accessTokenAppId = (com.facebook.appevents.b) this.f11363c;
                com.facebook.appevents.u appEvents = (com.facebook.appevents.u) this.f11364d;
                kc.c cVar3 = com.facebook.appevents.h.a;
                if (!m6.a.b(com.facebook.appevents.h.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
                        Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
                        com.facebook.appevents.i.e(accessTokenAppId, appEvents);
                        return;
                    } catch (Throwable th3) {
                        m6.a.a(com.facebook.appevents.h.class, th3);
                        return;
                    }
                }
                return;
            case 3:
                Context context = (Context) this.f11363c;
                com.facebook.appevents.l logger = (com.facebook.appevents.l) this.f11364d;
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(logger, "$logger");
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    int i16 = i14 + 1;
                    String str = strArr[i14];
                    String str2 = strArr2[i14];
                    try {
                        Class.forName(str);
                        bundle.putInt(str2, 1);
                        i15 |= 1 << i14;
                    } catch (ClassNotFoundException unused) {
                    }
                    if (i16 > 10) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        if (sharedPreferences.getInt("kitsBitmask", 0) != i15) {
                            sharedPreferences.edit().putInt("kitsBitmask", i15).apply();
                            logger.f("fb_sdk_initialize", bundle);
                            return;
                        }
                        return;
                    }
                    i14 = i16;
                }
            case 4:
                View view = (View) this.f11363c;
                v5.d this$0 = (v5.d) this.f11364d;
                b bVar = v5.d.f26036g;
                if (!m6.a.b(v5.d.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(view, "$view");
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (view instanceof EditText) {
                            this$0.b(view);
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        m6.a.a(v5.d.class, th4);
                        return;
                    }
                }
                return;
            case 5:
                Integer num = (Integer) this.f11363c;
                List processedEvents = (List) this.f11364d;
                Intrinsics.checkNotNullParameter(processedEvents, "$processedEvents");
                if (!CollectionsKt.contains(w5.l.a, num)) {
                    Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
                    if (CollectionsKt.contains(w5.l.f26781b, num)) {
                        if (w5.l.f26784e >= 5) {
                            w5.l.b().clear();
                            w5.l.f26784e = 0;
                            return;
                        } else {
                            w5.l.b().addAll(0, processedEvents);
                            w5.l.f26784e++;
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                String eventName = (String) this.f11363c;
                Bundle parameters = (Bundle) this.f11364d;
                if (!m6.a.b(x5.c.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(eventName, "$eventName");
                        Intrinsics.checkNotNullParameter(parameters, "$parameters");
                        Context a = x.a();
                        c cVar4 = com.facebook.appevents.k.f10950b;
                        c.z(a).a(parameters, eventName);
                        return;
                    } catch (Throwable th5) {
                        m6.a.a(x5.c.class, th5);
                        return;
                    }
                }
                return;
            case 7:
                x5.k this$02 = (x5.k) this.f11363c;
                TimerTask indexingTask = (TimerTask) this.f11364d;
                String str3 = x5.k.f27404e;
                if (!m6.a.b(x5.k.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(this$02, "this$0");
                        Intrinsics.checkNotNullParameter(indexingTask, "$indexingTask");
                        try {
                            Timer timer = this$02.f27406c;
                            if (timer != null) {
                                timer.cancel();
                            }
                            this$02.f27407d = null;
                            Timer timer2 = new Timer();
                            timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                            this$02.f27406c = timer2;
                            return;
                        } catch (Exception e2) {
                            Log.e(x5.k.f27404e, "Error scheduling indexing job", e2);
                            return;
                        }
                    } catch (Throwable th6) {
                        m6.a.a(x5.k.class, th6);
                        return;
                    }
                }
                return;
            case 8:
                String key = (String) this.f11363c;
                x5.k this$03 = (x5.k) this.f11364d;
                String str4 = x5.k.f27404e;
                if (!m6.a.b(x5.k.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(key, "$tree");
                        Intrinsics.checkNotNullParameter(this$03, "this$0");
                        Intrinsics.checkNotNullParameter(key, "key");
                        Charset charset = Charsets.UTF_8;
                        if (key != null) {
                            byte[] bytes = key.getBytes(charset);
                            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                            String t5 = com.facebook.internal.m0.t(SameMD5.TAG, bytes);
                            Date date = a.f10880n;
                            a n10 = z1.d.n();
                            if (t5 == null || !Intrinsics.areEqual(t5, this$03.f27407d)) {
                                this$03.b(b.w(key, n10, x.b()), t5);
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    } catch (Throwable th7) {
                        m6.a.a(x5.k.class, th7);
                        return;
                    }
                }
                return;
            case 9:
                a6.f this$04 = (a6.f) this.f11363c;
                Runnable queryPurchaseHistoryRunnable = (Runnable) this.f11364d;
                c cVar5 = a6.f.f255s;
                if (!m6.a.b(a6.f.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(this$04, "this$0");
                        Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
                        this$04.d(new ArrayList(this$04.f276r), queryPurchaseHistoryRunnable);
                        return;
                    } catch (Throwable th8) {
                        m6.a.a(a6.f.class, th8);
                        return;
                    }
                }
                return;
            case 10:
                String applicationId = (String) this.f11363c;
                com.facebook.appevents.e event = (com.facebook.appevents.e) this.f11364d;
                e6.b bVar2 = e6.b.a;
                if (!m6.a.b(e6.b.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
                        Intrinsics.checkNotNullParameter(event, "$event");
                        e6.g gVar = e6.g.f17130b;
                        List appEvents2 = CollectionsKt.listOf(event);
                        if (!m6.a.b(e6.g.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                                Intrinsics.checkNotNullParameter(appEvents2, "appEvents");
                                e6.g.f17130b.d(e6.d.CUSTOM_APP_EVENTS, applicationId, appEvents2);
                                return;
                            } catch (Throwable th9) {
                                m6.a.a(e6.g.class, th9);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th10) {
                        m6.a.a(e6.b.class, th10);
                        return;
                    }
                }
                return;
            case 11:
                com.facebook.appevents.n nVar = (com.facebook.appevents.n) this.f11363c;
                com.facebook.internal.z zVar = com.facebook.internal.z.a;
                nVar.getClass();
                com.facebook.internal.v vVar = com.facebook.internal.v.a;
                com.facebook.internal.v.a(new n0.h(i12), com.facebook.internal.t.AAM);
                com.facebook.internal.v.a(new n0.h(26), com.facebook.internal.t.RestrictiveDataFiltering);
                com.facebook.internal.v.a(new n0.h(27), com.facebook.internal.t.PrivacyProtection);
                com.facebook.internal.v.a(new n0.h(28), com.facebook.internal.t.EventDeactivation);
                com.facebook.internal.v.a(new n0.h(29), com.facebook.internal.t.IapLogging);
                com.facebook.internal.v.a(new com.facebook.appevents.m(z13 ? 1 : 0), com.facebook.internal.t.ProtectedMode);
                com.facebook.internal.v.a(new com.facebook.appevents.m(z12 ? 1 : 0), com.facebook.internal.t.MACARuleMatching);
                com.facebook.internal.v.a(new com.facebook.appevents.m(2), com.facebook.internal.t.CloudBridge);
                return;
            case 12:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f11363c;
                JobParameters jobParameters = (JobParameters) this.f11364d;
                int i17 = JobInfoSchedulerService.f11487b;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 13:
                s7.i0 i0Var = (s7.i0) this.f11363c;
                s7.l0 l0Var = (s7.l0) this.f11364d;
                int i18 = i0Var.F - l0Var.f24511c;
                i0Var.F = i18;
                if (l0Var.f24512d) {
                    i0Var.G = l0Var.f24513e;
                    i0Var.H = true;
                }
                if (l0Var.f24514f) {
                    i0Var.I = l0Var.f24515g;
                }
                if (i18 == 0) {
                    x2 x2Var = l0Var.f24510b.a;
                    if (!i0Var.f24403f0.a.p() && x2Var.p()) {
                        i0Var.f24405g0 = -1;
                        i0Var.f24407h0 = 0L;
                    }
                    if (!x2Var.p()) {
                        List asList = Arrays.asList(((l2) x2Var).f24565j);
                        if (asList.size() == i0Var.f24414o.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        v8.u0.m(z11);
                        for (int i19 = 0; i19 < asList.size(); i19++) {
                            ((s7.h0) i0Var.f24414o.get(i19)).f24385b = (x2) asList.get(i19);
                        }
                    }
                    if (i0Var.H) {
                        if (l0Var.f24510b.f24265b.equals(i0Var.f24403f0.f24265b) && l0Var.f24510b.f24267d == i0Var.f24403f0.f24281r) {
                            z12 = false;
                        }
                        if (z12) {
                            if (!x2Var.p() && !l0Var.f24510b.f24265b.a()) {
                                a2 a2Var = l0Var.f24510b;
                                v8.z zVar2 = a2Var.f24265b;
                                long j11 = a2Var.f24267d;
                                Object obj = zVar2.a;
                                v2 v2Var = i0Var.f24413n;
                                x2Var.g(obj, v2Var);
                                j10 = j11 + v2Var.f24789g;
                            } else {
                                j10 = l0Var.f24510b.f24267d;
                            }
                        }
                        j3 = j10;
                        z10 = z12;
                    } else {
                        j3 = -9223372036854775807L;
                        z10 = false;
                    }
                    i0Var.H = false;
                    i0Var.Q(l0Var.f24510b, 1, i0Var.I, z10, i0Var.G, j3, -1, false);
                    return;
                }
                return;
            case 14:
                s7.o0 o0Var = (s7.o0) this.f11363c;
                j2 j2Var = (j2) this.f11364d;
                o0Var.getClass();
                try {
                    synchronized (j2Var) {
                    }
                    try {
                        j2Var.a.handleMessage(j2Var.f24460d, j2Var.f24461e);
                        return;
                    } finally {
                        j2Var.b(true);
                    }
                } catch (s7.r e10) {
                    n9.o.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 15:
                r4.c cVar6 = (r4.c) this.f11363c;
                final String str5 = (String) this.f11364d;
                s7.f0 f0Var = (s7.f0) cVar6.f24000d;
                int i20 = n9.h0.a;
                t7.p pVar = (t7.p) f0Var.f24350b.f24417r;
                final t7.b P = pVar.P();
                final int i21 = z12 ? 1 : 0;
                pVar.Q(P, 1012, new n9.l(P, str5, i21) { // from class: t7.l

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f25310b;

                    {
                        this.f25310b = i21;
                    }

                    @Override // n9.l
                    public final void invoke(Object obj2) {
                        switch (this.f25310b) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                ((c) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
            case 16:
                AudioTrack audioTrack = (AudioTrack) this.f11363c;
                a4.g0 g0Var = (a4.g0) this.f11364d;
                Object obj2 = u7.r0.f25606g0;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    g0Var.c();
                    synchronized (u7.r0.f25606g0) {
                        int i22 = u7.r0.f25608i0 - 1;
                        u7.r0.f25608i0 = i22;
                        if (i22 == 0) {
                            u7.r0.f25607h0.shutdown();
                            u7.r0.f25607h0 = null;
                        }
                    }
                    return;
                } catch (Throwable th11) {
                    g0Var.c();
                    synchronized (u7.r0.f25606g0) {
                        int i23 = u7.r0.f25608i0 - 1;
                        u7.r0.f25608i0 = i23;
                        if (i23 == 0) {
                            u7.r0.f25607h0.shutdown();
                            u7.r0.f25607h0 = null;
                        }
                        throw th11;
                    }
                }
            case 17:
                x7.h hVar = (x7.h) this.f11363c;
                s7.r0 r0Var = (s7.r0) this.f11364d;
                x7.i iVar = hVar.f27455f;
                if (iVar.f27471p != 0 && !hVar.f27454d) {
                    Looper looper = iVar.f27475t;
                    looper.getClass();
                    hVar.f27453c = iVar.f(looper, hVar.f27452b, r0Var, false);
                    iVar.f27469n.add(hVar);
                    return;
                }
                return;
            case 18:
                v8.p0 p0Var = (v8.p0) this.f11363c;
                y7.x xVar = (y7.x) this.f11364d;
                if (p0Var.f26240t == null) {
                    rVar = xVar;
                } else {
                    rVar = new y7.r(C.TIME_UNSET);
                }
                p0Var.A = rVar;
                p0Var.B = xVar.getDurationUs();
                if (!p0Var.H && xVar.getDurationUs() == C.TIME_UNSET) {
                    z13 = true;
                }
                p0Var.C = z13;
                if (z13) {
                    i13 = 7;
                }
                p0Var.D = i13;
                p0Var.f26229i.s(p0Var.B, xVar.isSeekable(), p0Var.C);
                if (!p0Var.f26243x) {
                    p0Var.i();
                    return;
                }
                return;
            case 19:
            case 27:
            default:
                Callable callable = (Callable) this.f11363c;
                y7.q qVar = (y7.q) this.f11364d;
                try {
                    Object call = callable.call();
                    eb.g gVar2 = (eb.g) qVar.f27991b;
                    int i24 = eb.g.f17275k;
                    gVar2.h(call);
                    return;
                } catch (Exception e11) {
                    eb.g gVar3 = (eb.g) qVar.f27991b;
                    int i25 = eb.g.f17275k;
                    gVar3.i(e11);
                    return;
                }
            case 20:
                n9.w wVar = (n9.w) this.f11363c;
                m9.r rVar2 = (m9.r) this.f11364d;
                synchronized (wVar.f22595d) {
                    i10 = wVar.a;
                }
                rVar2.a(i10);
                return;
            case 21:
                o9.h hVar2 = (o9.h) this.f11363c;
                final String str6 = (String) this.f11364d;
                o9.y yVar = (o9.y) hVar2.f23203b;
                int i26 = n9.h0.a;
                t7.p pVar2 = (t7.p) ((s7.f0) yVar).f24350b.f24417r;
                final t7.b P2 = pVar2.P();
                final int i27 = z13 ? 1 : 0;
                pVar2.Q(P2, 1019, new n9.l(P2, str6, i27) { // from class: t7.l

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f25310b;

                    {
                        this.f25310b = i27;
                    }

                    @Override // n9.l
                    public final void invoke(Object obj22) {
                        switch (this.f25310b) {
                            case 0:
                                ((c) obj22).getClass();
                                return;
                            default:
                                ((c) obj22).getClass();
                                return;
                        }
                    }
                });
                return;
            case 22:
                o9.h hVar3 = (o9.h) this.f11363c;
                o9.z zVar3 = (o9.z) this.f11364d;
                o9.y yVar2 = (o9.y) hVar3.f23203b;
                int i28 = n9.h0.a;
                s7.i0 i0Var2 = ((s7.f0) yVar2).f24350b;
                i0Var2.f24399d0 = zVar3;
                i0Var2.f24411l.k(25, new androidx.core.app.h(zVar3, 21));
                return;
            case 23:
                o9.h hVar4 = (o9.h) this.f11363c;
                Exception exc = (Exception) this.f11364d;
                o9.y yVar3 = (o9.y) hVar4.f23203b;
                int i29 = n9.h0.a;
                t7.p pVar3 = (t7.p) ((s7.f0) yVar3).f24350b.f24417r;
                t7.b P3 = pVar3.P();
                pVar3.Q(P3, 1030, new t7.g(P3, exc, z13 ? 1 : 0));
                return;
            case 24:
                p9.k kVar = (p9.k) this.f11363c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f11364d;
                SurfaceTexture surfaceTexture2 = kVar.f23550i;
                Surface surface = kVar.f23551j;
                Surface surface2 = new Surface(surfaceTexture);
                kVar.f23550i = surfaceTexture;
                kVar.f23551j = surface2;
                Iterator it = kVar.f23544b.iterator();
                while (it.hasNext()) {
                    ((s7.f0) it.next()).f24350b.N(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 25:
                db.q qVar2 = (db.q) this.f11363c;
                cc.c cVar7 = (cc.c) this.f11364d;
                if (qVar2.f16966b == db.q.f16965d) {
                    synchronized (qVar2) {
                        aVar = qVar2.a;
                        qVar2.a = null;
                        qVar2.f16966b = cVar7;
                    }
                    aVar.h(cVar7);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 26:
                a();
                return;
            case 28:
                eb.a aVar2 = (eb.a) this.f11363c;
                Runnable runnable = (Runnable) this.f11364d;
                Process.setThreadPriority(aVar2.f17258c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f17259d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
        }
    }
}
