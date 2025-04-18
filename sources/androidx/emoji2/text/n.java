package androidx.emoji2.text;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.c2;
import androidx.fragment.app.u1;
import bh.o3;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.collect.m0;
import com.google.common.collect.r0;
import com.google.common.collect.z1;
import h.o0;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n9.h0;
import ni.s0;
import s7.f0;
import s7.h2;
import s7.i0;
import s7.o1;
import s7.v2;
import s7.w1;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1515d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1516f;

    public /* synthetic */ n(int i10, Object obj, Object obj2, Object obj3) {
        this.f1513b = i10;
        this.f1514c = obj;
        this.f1515d = obj2;
        this.f1516f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i10 = 0;
        switch (this.f1513b) {
            case 0:
                p pVar = (p) this.f1514c;
                com.facebook.appevents.i iVar = (com.facebook.appevents.i) this.f1515d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1516f;
                pVar.getClass();
                try {
                    m e2 = com.facebook.appevents.o.e(pVar.f1520c);
                    if (e2 != null) {
                        v vVar = (v) e2.a;
                        synchronized (vVar.f1542f) {
                            vVar.f1544h = threadPoolExecutor;
                        }
                        e2.a.d(new o(iVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    iVar.c(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                List awaitingContainerChanges = (List) this.f1514c;
                c2 operation = (c2) this.f1515d;
                androidx.fragment.app.l this$0 = (androidx.fragment.app.l) this.f1516f;
                Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
                Intrinsics.checkNotNullParameter(operation, "$operation");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (awaitingContainerChanges.contains(operation)) {
                    awaitingContainerChanges.remove(operation);
                    this$0.getClass();
                    androidx.fragment.app.l.m(operation);
                    return;
                }
                return;
            case 2:
                u1 impl = (u1) this.f1514c;
                View view = (View) this.f1515d;
                Rect lastInEpicenterRect = (Rect) this.f1516f;
                Intrinsics.checkNotNullParameter(impl, "$impl");
                Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                impl.getClass();
                u1.g(view, lastInEpicenterRect);
                return;
            case 3:
                androidx.fragment.app.l this$02 = (androidx.fragment.app.l) this.f1514c;
                View view2 = (View) this.f1515d;
                androidx.fragment.app.g animationInfo = (androidx.fragment.app.g) this.f1516f;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                this$02.a.endViewTransition(view2);
                animationInfo.a();
                return;
            case 4:
            case 14:
            default:
                ni.g gVar = (ni.g) this.f1514c;
                ((ni.f) this.f1515d).onFailure((ni.n) gVar.f22798c, (Throwable) this.f1516f);
                return;
            case 5:
                c3.j jVar = (c3.j) this.f1514c;
                h.m mVar = (h.m) this.f1515d;
                jb.g gVar2 = (jb.g) this.f1516f;
                jVar.getClass();
                if (((androidx.lifecycle.x) mVar.getLifecycle()).f1835d.a(androidx.lifecycle.o.RESUMED)) {
                    if (jVar.f2573i && gVar2 != null) {
                        gVar2.w();
                        new Handler().postDelayed(new o0(8, jVar, mVar), 1500L);
                    }
                    InterstitialAd interstitialAd = jVar.f2575k;
                    if (interstitialAd != null) {
                        interstitialAd.show(mVar);
                        jVar.f2571g = false;
                        return;
                    } else {
                        if (gVar2 != null) {
                            i3.a aVar = jVar.f2568d;
                            if (aVar != null) {
                                aVar.dismiss();
                            }
                            gVar2.w();
                            jVar.f2571g = false;
                            return;
                        }
                        return;
                    }
                }
                i3.a aVar2 = jVar.f2568d;
                if (aVar2 != null && aVar2.isShowing() && !mVar.isDestroyed()) {
                    jVar.f2568d.dismiss();
                }
                jVar.f2571g = false;
                gVar2.r(new AdError(0, "Show fail in background after show loading ad", "LuanDT"));
                return;
            case 6:
                com.applovin.impl.sdk.network.b.e((com.applovin.impl.sdk.network.b) this.f1514c, (com.applovin.impl.sdk.network.d) this.f1515d, (AppLovinPostbackListener) this.f1516f);
                return;
            case 7:
                com.facebook.login.b this$03 = (com.facebook.login.b) this.f1514c;
                com.facebook.login.r request = (com.facebook.login.r) this.f1515d;
                Bundle values = (Bundle) this.f1516f;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(request, "$request");
                Intrinsics.checkNotNullParameter(values, "$values");
                try {
                    this$03.l(values, request);
                    this$03.r(request, values, null);
                    return;
                } catch (com.facebook.q e10) {
                    this$03.r(request, null, e10);
                    return;
                }
            case 8:
                com.facebook.login.c0 this$04 = (com.facebook.login.c0) this.f1514c;
                com.facebook.login.r request2 = (com.facebook.login.r) this.f1515d;
                Bundle extras = (Bundle) this.f1516f;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(request2, "$request");
                Intrinsics.checkNotNullParameter(extras, "$extras");
                try {
                    this$04.l(extras, request2);
                    this$04.s(extras, request2);
                    return;
                } catch (com.facebook.z e11) {
                    com.facebook.u uVar = e11.f11440c;
                    this$04.r(request2, uVar.f11407f, uVar.c(), String.valueOf(uVar.f11405c));
                    return;
                } catch (com.facebook.q e12) {
                    this$04.r(request2, null, e12.getMessage(), null);
                    return;
                }
            case 9:
                o1 o1Var = (o1) this.f1514c;
                m0 m0Var = (m0) this.f1515d;
                v8.z zVar = (v8.z) this.f1516f;
                o1Var.getClass();
                z1 y4 = m0Var.y();
                t7.p pVar2 = (t7.p) o1Var.f24637c;
                h2 h2Var = pVar2.f25321i;
                h2Var.getClass();
                androidx.appcompat.widget.v vVar2 = pVar2.f25318f;
                vVar2.getClass();
                vVar2.f1057b = r0.i(y4);
                if (!y4.isEmpty()) {
                    vVar2.f1060e = (v8.z) y4.get(0);
                    zVar.getClass();
                    vVar2.f1061f = zVar;
                }
                if (((v8.z) vVar2.f1059d) == null) {
                    vVar2.f1059d = androidx.appcompat.widget.v.e(h2Var, (r0) vVar2.f1057b, (v8.z) vVar2.f1060e, (v2) vVar2.a);
                }
                vVar2.l(((i0) h2Var).x());
                return;
            case 10:
                r4.c cVar = (r4.c) this.f1514c;
                Pair pair = (Pair) this.f1515d;
                Exception exc = (Exception) this.f1516f;
                ((t7.p) ((w1) cVar.f24000d).f24828h).f(((Integer) pair.first).intValue(), (v8.z) pair.second, exc);
                return;
            case 11:
                r4.c cVar2 = (r4.c) this.f1514c;
                final s7.r0 r0Var = (s7.r0) this.f1515d;
                final w7.k kVar = (w7.k) this.f1516f;
                f0 f0Var = (f0) cVar2.f24000d;
                int i11 = h0.a;
                f0Var.getClass();
                i0 i0Var = ((f0) cVar2.f24000d).f24350b;
                i0Var.getClass();
                t7.p pVar3 = (t7.p) i0Var.f24417r;
                final t7.b P = pVar3.P();
                pVar3.Q(P, 1009, new n9.l(P, r0Var, kVar, i10) { // from class: t7.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f25299b;

                    {
                        this.f25299b = i10;
                    }

                    @Override // n9.l
                    public final void invoke(Object obj) {
                        switch (this.f25299b) {
                            case 0:
                                ((c) obj).getClass();
                                return;
                            default:
                                ((c) obj).getClass();
                                return;
                        }
                    }
                });
                return;
            case 12:
                x7.q qVar = (x7.q) this.f1514c;
                ((x7.r) this.f1515d).f(qVar.a, qVar.f27496b, (Exception) this.f1516f);
                return;
            case 13:
                f0.c cVar3 = (f0.c) this.f1514c;
                ((v8.d0) this.f1515d).z(cVar3.f17515b, (v8.z) cVar3.f17516c, (v8.u) this.f1516f);
                return;
            case 15:
                o9.h hVar = (o9.h) this.f1514c;
                final s7.r0 r0Var2 = (s7.r0) this.f1515d;
                final w7.k kVar2 = (w7.k) this.f1516f;
                o9.y yVar = (o9.y) hVar.f23203b;
                int i12 = h0.a;
                yVar.getClass();
                i0 i0Var2 = ((f0) yVar).f24350b;
                i0Var2.getClass();
                t7.p pVar4 = (t7.p) i0Var2.f24417r;
                final t7.b P2 = pVar4.P();
                final int i13 = 1;
                pVar4.Q(P2, 1017, new n9.l(P2, r0Var2, kVar2, i13) { // from class: t7.e

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f25299b;

                    {
                        this.f25299b = i13;
                    }

                    @Override // n9.l
                    public final void invoke(Object obj) {
                        switch (this.f25299b) {
                            case 0:
                                ((c) obj).getClass();
                                return;
                            default:
                                ((c) obj).getClass();
                                return;
                        }
                    }
                });
                return;
            case 16:
                ic.h hVar2 = (ic.h) this.f1514c;
                Intent intent = (Intent) this.f1515d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1516f;
                int i14 = ic.h.f19548h;
                hVar2.getClass();
                try {
                    hVar2.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 17:
                BiConsumer biConsumer = (BiConsumer) this.f1514c;
                String str = (String) this.f1515d;
                mc.f fVar = (mc.f) this.f1516f;
                Pattern pattern = mc.j.f22190e;
                biConsumer.accept(str, fVar);
                return;
            case 18:
                com.vungle.ads.internal.downloader.l.a((com.vungle.ads.internal.downloader.l) this.f1514c, (com.vungle.ads.internal.downloader.n) this.f1515d, (com.vungle.ads.internal.downloader.i) this.f1516f);
                return;
            case 19:
                com.vungle.ads.internal.load.e.b((com.vungle.ads.internal.downloader.d) this.f1514c, (com.vungle.ads.internal.load.j) this.f1515d, (com.vungle.ads.internal.downloader.n) this.f1516f);
                return;
            case 20:
                com.vungle.ads.internal.load.k.a((com.vungle.ads.internal.load.l) this.f1514c, (o3) this.f1515d, (com.vungle.ads.internal.network.j) this.f1516f);
                return;
            case 21:
                com.vungle.ads.internal.load.k.b((com.vungle.ads.internal.load.l) this.f1514c, (Throwable) this.f1515d, (o3) this.f1516f);
                return;
            case 22:
                com.vungle.ads.internal.load.n.a((com.vungle.ads.internal.downloader.d) this.f1514c, (com.vungle.ads.internal.downloader.n) this.f1515d, (File) this.f1516f);
                return;
            case 23:
                com.vungle.ads.internal.load.n.b((File) this.f1514c, (File) this.f1515d, (File) this.f1516f);
                return;
            case 24:
                com.vungle.ads.internal.network.l.a((com.vungle.ads.internal.network.l) this.f1514c, (String) this.f1515d, (String) this.f1516f);
                return;
            case 25:
                com.vungle.ads.internal.util.r.a((String) this.f1514c, (com.vungle.ads.internal.util.r) this.f1515d, (Function1) this.f1516f);
                return;
            case 26:
                ni.g gVar3 = (ni.g) this.f1514c;
                ni.f fVar2 = (ni.f) this.f1515d;
                s0 s0Var = (s0) this.f1516f;
                ni.n nVar = (ni.n) gVar3.f22798c;
                if (nVar.f22824c.isCanceled()) {
                    fVar2.onFailure(nVar, new IOException("Canceled"));
                    return;
                } else {
                    fVar2.onResponse(nVar, s0Var);
                    return;
                }
        }
    }
}
