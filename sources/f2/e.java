package F2;

import U4.AbstractServiceC0312h;
import U4.p;
import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import android.util.Log;
import com.facebook.N;
import com.facebook.internal.t;
import com.facebook.r;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.vungle.ads.L;
import j5.C2398a;
import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import l5.j;
import m1.C2463c;
import o4.C2496b;
import o4.InterfaceC2498d;
import r3.C2666i;
import r3.InterfaceC2664g;
import s3.InterfaceC2697b;
import t.InterfaceC2702a;
import w4.v0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements E2.i, OnCompleteListener, Continuation, InterfaceC2702a, InterfaceC2498d, OnPaidEventListener, N4.a, InterfaceC2697b, InterfaceC2664g {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1131c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1132d;

    public /* synthetic */ e(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f1131c = obj;
        this.f1132d = obj2;
    }

    private final Object d(Task task) {
        l5.g gVar = (l5.g) this.f1131c;
        Date date = (Date) this.f1132d;
        gVar.getClass();
        if (task.isSuccessful()) {
            j jVar = gVar.f21606h;
            synchronized (jVar.b) {
                jVar.f21616a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                if (exception instanceof k5.e) {
                    j jVar2 = gVar.f21606h;
                    synchronized (jVar2.b) {
                        jVar2.f21616a.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    j jVar3 = gVar.f21606h;
                    synchronized (jVar3.b) {
                        jVar3.f21616a.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return task;
    }

    @Override // N4.a
    public void a(N4.b bVar) {
        ((N4.a) this.f1131c).a(bVar);
        ((N4.a) this.f1132d).a(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[Catch: all -> 0x0119, TryCatch #0 {all -> 0x0119, blocks: (B:25:0x008b, B:27:0x0091, B:29:0x00a1, B:31:0x00ad), top: B:24:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    @Override // t.InterfaceC2702a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object apply(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.e.apply(java.lang.Object):java.lang.Object");
    }

    public void b() {
        boolean z8;
        String str = (String) this.f1132d;
        if (!O2.a.b(z2.d.class)) {
            try {
                G7.j.e(str, "$appId");
                t tVar = (t) this.f1131c;
                boolean z9 = false;
                if (tVar != null && tVar.f13663g) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                r rVar = r.f13801a;
                N n2 = N.f13431a;
                if (!O2.a.b(N.class)) {
                    try {
                        N.f13431a.d();
                        z9 = N.f13436g.a();
                    } catch (Throwable th) {
                        O2.a.a(N.class, th);
                    }
                }
                if (z8 && z9) {
                    z2.d dVar = z2.d.f24508a;
                    if (!O2.a.b(dVar)) {
                        try {
                            if (!z2.d.f24514h) {
                                z2.d.f24514h = true;
                                r.c().execute(new L(str, 13));
                            }
                        } catch (Throwable th2) {
                            O2.a.a(dVar, th2);
                        }
                    }
                }
            } catch (Throwable th3) {
                O2.a.a(z2.d.class, th3);
            }
        }
    }

    @Override // E2.i
    public void c(File file) {
        f fVar = (f) this.f1131c;
        G7.j.e(fVar, "$slave");
        G7.j.e(file, "file");
        fVar.f1138g = (b) this.f1132d;
        fVar.f1137f = file;
        Runnable runnable = fVar.f1139h;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // s3.InterfaceC2697b
    public Object execute() {
        switch (this.b) {
            case 12:
                C2666i c2666i = (C2666i) ((q3.h) this.f1131c).f22768c;
                c2666i.getClass();
                Iterable iterable = (Iterable) this.f1132d;
                if (iterable.iterator().hasNext()) {
                    c2666i.a().compileStatement("DELETE FROM events WHERE _id in " + C2666i.k(iterable)).execute();
                    return null;
                }
                return null;
            default:
                q3.h hVar = (q3.h) this.f1131c;
                hVar.getClass();
                Iterator it = ((Map) this.f1132d).entrySet().iterator();
                while (it.hasNext()) {
                    ((C2666i) hVar.f22774i).i(((Integer) r2.getValue()).intValue(), n3.c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                return null;
        }
    }

    @Override // o4.InterfaceC2498d
    public Object f(p pVar) {
        switch (this.b) {
            case 5:
                return new C2398a((String) this.f1131c, ((com.applovin.impl.sdk.ad.g) this.f1132d).c((Context) pVar.b(Context.class)));
            default:
                String str = (String) this.f1131c;
                C2496b c2496b = (C2496b) this.f1132d;
                try {
                    Trace.beginSection(str);
                    return c2496b.f21948f.f(pVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((AbstractServiceC0312h) this.f1131c).a((Intent) this.f1132d);
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        switch (this.b) {
            case 9:
                C2463c c2463c = (C2463c) this.f1131c;
                c2463c.getClass();
                Log.d("MiaStudio", "OnPaidEvent banner:" + adValue.getValueMicros());
                m1.g gVar = c2463c.f21716i;
                Context context = gVar.f21737j;
                AdView adView = (AdView) this.f1132d;
                v0.v(context, adValue, adView.getAdUnitId(), adView.getResponseInfo().getMediationAdapterClassName());
                if (gVar.l != null) {
                    v0.w(adValue, adView.getAdUnitId(), gVar.l);
                    return;
                }
                return;
            default:
                C2463c c2463c2 = (C2463c) this.f1131c;
                c2463c2.getClass();
                Log.d("MiaStudio", "OnPaidEvent banner:" + adValue.getValueMicros());
                m1.g gVar2 = c2463c2.f21716i;
                Context context2 = gVar2.f21737j;
                AdView adView2 = (AdView) this.f1132d;
                v0.v(context2, adValue, adView2.getAdUnitId(), adView2.getResponseInfo().getMediationAdapterClassName());
                if (gVar2.l != null) {
                    v0.w(adValue, adView2.getAdUnitId(), gVar2.l);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.tasks.Continuation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object then(com.google.android.gms.tasks.Task r12) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.e.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
