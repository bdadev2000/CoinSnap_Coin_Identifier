package f2;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements j0.d, OnPaidEventListener, p7.b, o7.h, Continuation, OnSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17600d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17601f;

    public /* synthetic */ i(int i10, Object obj, Object obj2, Object obj3) {
        this.f17598b = i10;
        this.f17599c = obj;
        this.f17600d = obj2;
        this.f17601f = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0355 A[SYNTHETIC] */
    @Override // o7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object apply(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.i.apply(java.lang.Object):java.lang.Object");
    }

    @Override // j0.d
    public final void d() {
        Runnable runnable = (Runnable) this.f17599c;
        t tVar = (t) this.f17601f;
        Runnable runnable2 = (Runnable) this.f17600d;
        if (runnable == null) {
            tVar.cancel();
            runnable2.run();
        } else {
            runnable.run();
        }
    }

    @Override // p7.b
    public final Object execute() {
        m7.a aVar = (m7.a) this.f17599c;
        i7.i iVar = (i7.i) this.f17600d;
        i7.h hVar = (i7.h) this.f17601f;
        o7.j jVar = (o7.j) aVar.f21632d;
        jVar.getClass();
        int i10 = 3;
        Object[] objArr = {iVar.f19179c, hVar.a, iVar.a};
        String C = com.bumptech.glide.c.C("SQLiteEventStore");
        if (Log.isLoggable(C, 3)) {
            Log.d(C, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        long longValue = ((Long) jVar.j(new i(i10, jVar, hVar, iVar))).longValue();
        if (longValue >= 1) {
            new o7.b(longValue, iVar, hVar);
        }
        ((n7.c) aVar.a).a(iVar, 1, false);
        return null;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        c3.c cVar = (c3.c) this.f17599c;
        Context context = (Context) this.f17600d;
        InterstitialAd interstitialAd = (InterstitialAd) this.f17601f;
        cVar.getClass();
        d6.g.v(context, adValue, interstitialAd.getAdUnitId(), interstitialAd.getResponseInfo().getMediationAdapterClassName());
        c3.j jVar = cVar.f2539c;
        if (jVar.f2576l != null) {
            d6.g.w(adValue, interstitialAd.getAdUnitId(), jVar.f2576l);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        s2.h hVar = (s2.h) this.f17599c;
        Task task = (Task) this.f17600d;
        gb.c cVar = (gb.c) this.f17601f;
        hVar.getClass();
        try {
            mc.f fVar = (mc.f) task.getResult();
            if (fVar != null) {
                ((Executor) hVar.f24171d).execute(new nc.a(cVar, ((qa.a) hVar.f24170c).i(fVar), 1));
            }
        } catch (lc.d e2) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e2);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i10 = this.f17598b;
        boolean z10 = true;
        Object obj = this.f17601f;
        Object obj2 = this.f17600d;
        Object obj3 = this.f17599c;
        switch (i10) {
            case 7:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) obj;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (atomicBoolean.getAndSet(true)) {
                    cancellationTokenSource.cancel();
                }
                return Tasks.forResult(null);
            case 8:
                lc.b bVar = (lc.b) obj3;
                Task task2 = (Task) obj2;
                Task task3 = (Task) obj;
                bVar.getClass();
                if (task2.isSuccessful() && task2.getResult() != null) {
                    mc.f fVar = (mc.f) task2.getResult();
                    if (task3.isSuccessful()) {
                        mc.f fVar2 = (mc.f) task3.getResult();
                        if (fVar2 != null && fVar.f22168c.equals(fVar2.f22168c)) {
                            z10 = false;
                        }
                        if (!z10) {
                            return Tasks.forResult(Boolean.FALSE);
                        }
                    }
                    return bVar.f21330e.d(fVar).continueWith(bVar.f21328c, new lc.a(bVar));
                }
                return Tasks.forResult(Boolean.FALSE);
            default:
                mc.n nVar = (mc.n) obj3;
                Task task4 = (Task) obj2;
                Task task5 = (Task) obj;
                int[] iArr = mc.n.f22201p;
                nVar.getClass();
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new lc.c("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                if (!task5.isSuccessful()) {
                    return Tasks.forException(new lc.c("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                }
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) nVar.c().openConnection();
                    nVar.i(httpURLConnection, (String) task5.getResult(), ((dc.a) task4.getResult()).a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e2) {
                    return Tasks.forException(new lc.c("Failed to open HTTP stream connection", e2));
                }
        }
    }

    public /* synthetic */ i(t tVar, h.o0 o0Var) {
        this.f17598b = 0;
        this.f17599c = null;
        this.f17601f = tVar;
        this.f17600d = o0Var;
    }
}
