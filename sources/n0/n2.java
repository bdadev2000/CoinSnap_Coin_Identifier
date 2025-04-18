package n0;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class n2 extends m2 {

    /* renamed from: q, reason: collision with root package name */
    public static final r2 f22331q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f22331q = r2.h(null, windowInsets);
    }

    public n2(@NonNull r2 r2Var, @NonNull WindowInsets windowInsets) {
        super(r2Var, windowInsets);
    }

    @Override // n0.j2, n0.o2
    public final void d(@NonNull View view) {
    }

    @Override // n0.j2, n0.o2
    @NonNull
    public g0.f f(int i10) {
        Insets insets;
        insets = this.f22297c.getInsets(q2.a(i10));
        return g0.f.c(insets);
    }
}
