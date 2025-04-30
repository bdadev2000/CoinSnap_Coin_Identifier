package f;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.vungle.ads.L;

/* loaded from: classes.dex */
public final class j implements i, ViewTreeObserver.OnDrawListener, Runnable {
    public final long b = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f20217c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20218d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f20219f;

    public j(l lVar) {
        this.f20219f = lVar;
    }

    public final void a(View view) {
        if (!this.f20218d) {
            this.f20218d = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        G7.j.e(runnable, "runnable");
        this.f20217c = runnable;
        View decorView = this.f20219f.getWindow().getDecorView();
        G7.j.d(decorView, "window.decorView");
        if (this.f20218d) {
            if (G7.j.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new L(this, 4));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z8;
        Runnable runnable = this.f20217c;
        if (runnable != null) {
            runnable.run();
            this.f20217c = null;
            n fullyDrawnReporter = this.f20219f.getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.b) {
                z8 = fullyDrawnReporter.f20224c;
            }
            if (z8) {
                this.f20218d = false;
                this.f20219f.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.b) {
            this.f20218d = false;
            this.f20219f.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20219f.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
