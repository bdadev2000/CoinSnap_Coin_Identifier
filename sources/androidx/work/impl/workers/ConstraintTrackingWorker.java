package androidx.work.impl.workers;

import android.content.Context;
import androidx.activity.i;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.p;
import java.util.ArrayList;
import java.util.List;
import m2.k;
import q2.b;
import w2.j;
import x2.a;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {

    /* renamed from: h, reason: collision with root package name */
    public static final String f2219h = p.g("ConstraintTrkngWrkr");

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f2220b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2221c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f2222d;

    /* renamed from: f, reason: collision with root package name */
    public final j f2223f;

    /* renamed from: g, reason: collision with root package name */
    public ListenableWorker f2224g;

    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2220b = workerParameters;
        this.f2221c = new Object();
        this.f2222d = false;
        this.f2223f = new j();
    }

    @Override // q2.b
    public final void b(ArrayList arrayList) {
        p.e().b(f2219h, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f2221c) {
            this.f2222d = true;
        }
    }

    @Override // q2.b
    public final void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final a getTaskExecutor() {
        return k.v(getApplicationContext()).f21461l;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f2224g;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f2224g;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f2224g.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final ua.b startWork() {
        getBackgroundExecutor().execute(new i(this, 10));
        return this.f2223f;
    }
}
