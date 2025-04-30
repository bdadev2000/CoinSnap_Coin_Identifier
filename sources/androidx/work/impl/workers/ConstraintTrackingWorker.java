package androidx.work.impl.workers;

import V0.k;
import Z0.b;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import f1.C2262k;
import f4.c;
import g1.InterfaceC2286a;
import java.util.List;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {

    /* renamed from: h, reason: collision with root package name */
    public static final String f5239h = o.g("ConstraintTrkngWrkr");
    public final WorkerParameters b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5240c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f5241d;

    /* renamed from: f, reason: collision with root package name */
    public final C2262k f5242f;

    /* renamed from: g, reason: collision with root package name */
    public ListenableWorker f5243g;

    /* JADX WARN: Type inference failed for: r1v3, types: [f1.k, java.lang.Object] */
    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = workerParameters;
        this.f5240c = new Object();
        this.f5241d = false;
        this.f5242f = new Object();
    }

    @Override // Z0.b
    public final void a(List list) {
        o.e().b(f5239h, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f5240c) {
            this.f5241d = true;
        }
    }

    @Override // Z0.b
    public final void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceC2286a getTaskExecutor() {
        return k.v(getApplicationContext()).f3419d;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f5243g;
        if (listenableWorker != null && listenableWorker.isRunInForeground()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f5243g;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f5243g.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final c startWork() {
        getBackgroundExecutor().execute(new B3.k(this, 16));
        return this.f5242f;
    }
}
