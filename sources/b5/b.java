package b5;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;

/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ AppStartTrace b;

    public b(AppStartTrace appStartTrace) {
        this.b = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.b.f14359v++;
    }
}
