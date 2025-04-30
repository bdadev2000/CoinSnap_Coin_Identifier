package T;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class D0 extends C0 {

    /* renamed from: q, reason: collision with root package name */
    public static final G0 f2856q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f2856q = G0.h(null, windowInsets);
    }

    public D0(@NonNull G0 g02, @NonNull WindowInsets windowInsets) {
        super(g02, windowInsets);
    }

    @Override // T.z0, T.E0
    @NonNull
    public L.e f(int i9) {
        Insets insets;
        insets = this.f2948c.getInsets(F0.a(i9));
        return L.e.c(insets);
    }

    @Override // T.z0, T.E0
    public final void d(@NonNull View view) {
    }
}
