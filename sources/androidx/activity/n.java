package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class n implements m, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: c, reason: collision with root package name */
    public Runnable f577c;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f579f;

    /* renamed from: b, reason: collision with root package name */
    public final long f576b = SystemClock.uptimeMillis() + 10000;

    /* renamed from: d, reason: collision with root package name */
    public boolean f578d = false;

    public n(ComponentActivity componentActivity) {
        this.f579f = componentActivity;
    }

    public final void a() {
        ComponentActivity componentActivity = this.f579f;
        componentActivity.getWindow().getDecorView().removeCallbacks(this);
        componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // androidx.activity.m
    public final void d(View view) {
        if (!this.f578d) {
            this.f578d = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f577c = runnable;
        View decorView = this.f579f.getWindow().getDecorView();
        if (this.f578d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new d(this, 1));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f577c;
        if (runnable != null) {
            runnable.run();
            this.f577c = null;
            p pVar = this.f579f.mFullyDrawnReporter;
            synchronized (pVar.f584c) {
                z10 = pVar.f585d;
            }
            if (z10) {
                this.f578d = false;
                this.f579f.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.f576b) {
            this.f578d = false;
            this.f579f.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f579f.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
