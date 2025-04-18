package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import com.applovin.impl.cv;
import com.applovin.impl.ql;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.camera.PlantIdentifierActivity;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements j0.d, OnPaidEventListener, n.a, c6.h, p7.b, n9.l, n9.m, k9.l, cc.a, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1610c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1611d;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f1609b = i10;
        this.f1610c = obj;
        this.f1611d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Task f() {
        Throwable th2;
        Integer num;
        IOException e2;
        HttpURLConnection httpURLConnection;
        Integer num2;
        boolean z10;
        boolean z11;
        boolean d10;
        mc.n nVar = (mc.n) this.f1610c;
        Task task = (Task) this.f1611d;
        int[] iArr = mc.n.f22201p;
        nVar.getClass();
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
            } catch (IOException e10) {
                e2 = e10;
                httpURLConnection = null;
                num2 = null;
            } catch (Throwable th3) {
                th2 = th3;
                num = null;
            }
            if (task.isSuccessful()) {
                synchronized (nVar) {
                    nVar.f22203b = true;
                }
                httpURLConnection = (HttpURLConnection) task.getResult();
                try {
                    num2 = Integer.valueOf(httpURLConnection.getResponseCode());
                } catch (IOException e11) {
                    e2 = e11;
                    num2 = null;
                } catch (Throwable th4) {
                    httpURLConnection2 = httpURLConnection;
                    th2 = th4;
                    num = null;
                    mc.n.b(httpURLConnection2);
                    synchronized (nVar) {
                        nVar.f22203b = false;
                    }
                    if (num != null && !mc.n.d(num.intValue())) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        nVar.k(new Date(nVar.f22215n.currentTimeMillis()));
                    }
                    if (!z10 && num.intValue() != 200) {
                        String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                        if (num.intValue() == 403) {
                            format = mc.n.f(httpURLConnection2.getErrorStream());
                        }
                        new lc.f(num.intValue(), format, 0);
                        nVar.g();
                        throw th2;
                    }
                    nVar.h();
                    throw th2;
                }
                try {
                    if (num2.intValue() == 200) {
                        synchronized (nVar) {
                            nVar.f22204c = 8;
                        }
                        nVar.f22216o.d(0, mc.l.f22197f);
                        nVar.j(httpURLConnection).c();
                    }
                    mc.n.b(httpURLConnection);
                    synchronized (nVar) {
                        nVar.f22203b = false;
                    }
                    d10 = mc.n.d(num2.intValue());
                    if (d10) {
                        nVar.k(new Date(nVar.f22215n.currentTimeMillis()));
                    }
                } catch (IOException e12) {
                    e2 = e12;
                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e2);
                    mc.n.b(httpURLConnection);
                    synchronized (nVar) {
                        nVar.f22203b = false;
                    }
                    if (num2 != null && !mc.n.d(num2.intValue())) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        nVar.k(new Date(nVar.f22215n.currentTimeMillis()));
                    }
                    if (!z11 && num2.intValue() != 200) {
                        String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                        if (num2.intValue() == 403) {
                            format2 = mc.n.f(httpURLConnection.getErrorStream());
                        }
                        new lc.f(num2.intValue(), format2, 0);
                        nVar.g();
                        return Tasks.forResult(null);
                    }
                    nVar.h();
                    return Tasks.forResult(null);
                }
                if (!d10 && num2.intValue() != 200) {
                    String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                    if (num2.intValue() == 403) {
                        format3 = mc.n.f(httpURLConnection.getErrorStream());
                    }
                    new lc.f(num2.intValue(), format3, 0);
                    nVar.g();
                    return Tasks.forResult(null);
                }
                nVar.h();
                return Tasks.forResult(null);
            }
            throw new IOException(task.getException());
        } catch (Throwable th5) {
            httpURLConnection2 = task;
            th2 = th5;
        }
    }

    @Override // c6.h
    public final void a(File file) {
        d6.e slave = (d6.e) this.f1610c;
        d6.b bVar = (d6.b) this.f1611d;
        Intrinsics.checkNotNullParameter(slave, "$slave");
        Intrinsics.checkNotNullParameter(file, "file");
        slave.f16880g = bVar;
        slave.f16879f = file;
        Runnable runnable = slave.f16881h;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // n.a, o7.h
    public final Object apply(Object obj) {
        String a;
        a = AppLovinAdImpl.a((String) this.f1610c, (String) this.f1611d, (ql) obj);
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    @Override // k9.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.collect.z1 b(int r19, v8.i1 r20, int[] r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.b(int, v8.i1, int[]):com.google.common.collect.z1");
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x055e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // n9.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r24, n9.g r25) {
        /*
            Method dump skipped, instructions count: 1702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.c(java.lang.Object, n9.g):void");
    }

    @Override // j0.d
    public final void d() {
        Animator animator = (Animator) this.f1610c;
        c2 operation = (c2) this.f1611d;
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has been canceled.");
        }
    }

    public final void e() {
        boolean z10;
        com.facebook.internal.x xVar = (com.facebook.internal.x) this.f1610c;
        String appId = (String) this.f1611d;
        x5.d dVar = x5.d.a;
        if (!m6.a.b(x5.d.class)) {
            try {
                Intrinsics.checkNotNullParameter(appId, "$appId");
                boolean z11 = false;
                if (xVar != null && xVar.f11127h) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                com.facebook.x xVar2 = com.facebook.x.a;
                com.facebook.u0 u0Var = com.facebook.u0.a;
                if (!m6.a.b(com.facebook.u0.class)) {
                    try {
                        com.facebook.u0.a.d();
                        z11 = com.facebook.u0.f11418g.a();
                    } catch (Throwable th2) {
                        m6.a.a(com.facebook.u0.class, th2);
                    }
                }
                if (z10 && z11) {
                    x5.d dVar2 = x5.d.a;
                    if (!m6.a.b(dVar2)) {
                        try {
                            if (!x5.d.f27381h) {
                                x5.d.f27381h = true;
                                com.facebook.x.c().execute(new androidx.activity.d(appId, 19));
                            }
                        } catch (Throwable th3) {
                            m6.a.a(dVar2, th3);
                        }
                    }
                }
            } catch (Throwable th4) {
                m6.a.a(x5.d.class, th4);
            }
        }
    }

    @Override // p7.b
    public final Object execute() {
        int i10 = this.f1609b;
        Object obj = this.f1611d;
        Object obj2 = this.f1610c;
        switch (i10) {
            case 9:
                Iterable iterable = (Iterable) obj;
                o7.j jVar = (o7.j) ((n7.i) obj2).f22487c;
                jVar.getClass();
                if (iterable.iterator().hasNext()) {
                    jVar.d().compileStatement("DELETE FROM events WHERE _id in " + o7.j.r(iterable)).execute();
                }
                return null;
            default:
                n7.i iVar = (n7.i) obj2;
                iVar.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    long intValue = ((Integer) entry.getValue()).intValue();
                    l7.c cVar = l7.c.INVALID_PAYLOD;
                    String str = (String) entry.getKey();
                    o7.j jVar2 = (o7.j) iVar.f22493i;
                    jVar2.getClass();
                    jVar2.j(new cv(str, intValue, cVar));
                }
                return null;
        }
    }

    @Override // cc.a
    public final void h(cc.c cVar) {
        cc.a aVar = (cc.a) this.f1610c;
        cc.a aVar2 = (cc.a) this.f1611d;
        aVar.h(cVar);
        aVar2.h(cVar);
    }

    @Override // n9.l
    public final void invoke(Object obj) {
        switch (this.f1609b) {
            case 11:
                ((t7.c) obj).getClass();
                return;
            case 12:
                ((t7.c) obj).getClass();
                return;
            case 13:
                ((t7.c) obj).getClass();
                return;
            case 14:
            default:
                o9.z zVar = (o9.z) this.f1611d;
                t7.u uVar = (t7.u) ((t7.c) obj);
                f0.c cVar = uVar.f25349o;
                if (cVar != null) {
                    s7.r0 r0Var = (s7.r0) cVar.f17516c;
                    if (r0Var.f24729t == -1) {
                        s7.q0 q0Var = new s7.q0(r0Var);
                        q0Var.f24672p = zVar.f23280b;
                        q0Var.f24673q = zVar.f23281c;
                        uVar.f25349o = new f0.c(new s7.r0(q0Var), cVar.f17515b, (String) cVar.f17517d);
                    }
                }
                int i10 = zVar.f23280b;
                return;
            case 15:
                ((t7.c) obj).getClass();
                return;
            case 16:
                ((t7.c) obj).getClass();
                return;
            case 17:
                ((t7.c) obj).getClass();
                return;
            case 18:
                ((t7.c) obj).getClass();
                return;
            case 19:
                ((t7.c) obj).getClass();
                return;
        }
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        int i10 = this.f1609b;
        Object obj = this.f1611d;
        Object obj2 = this.f1610c;
        switch (i10) {
            case 2:
                c3.e eVar = (c3.e) obj2;
                AdView adView = (AdView) obj;
                eVar.getClass();
                Log.d("ITGStudio", "OnPaidEvent banner:" + adValue.getValueMicros());
                c3.j jVar = eVar.f2549i;
                d6.g.v(jVar.f2574j, adValue, adView.getAdUnitId(), adView.getResponseInfo().getMediationAdapterClassName());
                if (jVar.f2576l != null) {
                    d6.g.w(adValue, adView.getAdUnitId(), jVar.f2576l);
                    return;
                }
                return;
            case 3:
                c3.e eVar2 = (c3.e) obj2;
                AdView adView2 = (AdView) obj;
                eVar2.getClass();
                Log.d("ITGStudio", "OnPaidEvent banner:" + adValue.getValueMicros());
                c3.j jVar2 = eVar2.f2549i;
                d6.g.v(jVar2.f2574j, adValue, adView2.getAdUnitId(), adView2.getResponseInfo().getMediationAdapterClassName());
                if (jVar2.f2576l != null) {
                    d6.g.w(adValue, adView2.getAdUnitId(), jVar2.f2576l);
                    return;
                }
                return;
            default:
                PlantIdentifierActivity this$0 = (PlantIdentifierActivity) obj2;
                RewardedAd ad2 = (RewardedAd) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(ad2, "$ad");
                Intrinsics.checkNotNullParameter(adValue, "adValue");
                d6.g.v(this$0, adValue, ad2.getAdUnitId(), ad2.getResponseInfo().getMediationAdapterClassName());
                d6.g.w(adValue, ad2.getAdUnitId(), h3.b.f18726j);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f1609b) {
            case 24:
                ic.r rVar = (ic.r) this.f1610c;
                String str = (String) this.f1611d;
                synchronized (rVar) {
                    rVar.f19571b.remove(str);
                }
                return task;
            case 25:
                mc.i iVar = (mc.i) this.f1610c;
                Map map = (Map) this.f1611d;
                int[] iArr = mc.i.f22181k;
                return iVar.b(0L, task, map);
            case 26:
                mc.i iVar2 = (mc.i) this.f1610c;
                Date date = (Date) this.f1611d;
                int[] iArr2 = mc.i.f22181k;
                iVar2.getClass();
                if (task.isSuccessful()) {
                    mc.l lVar = iVar2.f22188h;
                    synchronized (lVar.f22198b) {
                        lVar.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                    }
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        if (exception instanceof lc.e) {
                            mc.l lVar2 = iVar2.f22188h;
                            synchronized (lVar2.f22198b) {
                                lVar2.a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        } else {
                            mc.l lVar3 = iVar2.f22188h;
                            synchronized (lVar3.f22198b) {
                                lVar3.a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        }
                    }
                }
                return task;
            default:
                return f();
        }
    }
}
