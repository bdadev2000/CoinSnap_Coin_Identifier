package n0;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class k2 extends j2 {

    /* renamed from: m, reason: collision with root package name */
    public g0.f f22307m;

    public k2(@NonNull r2 r2Var, @NonNull WindowInsets windowInsets) {
        super(r2Var, windowInsets);
        this.f22307m = null;
    }

    @Override // n0.o2
    @NonNull
    public r2 b() {
        return r2.h(null, this.f22297c.consumeStableInsets());
    }

    @Override // n0.o2
    @NonNull
    public r2 c() {
        return r2.h(null, this.f22297c.consumeSystemWindowInsets());
    }

    @Override // n0.o2
    @NonNull
    public final g0.f h() {
        if (this.f22307m == null) {
            WindowInsets windowInsets = this.f22297c;
            this.f22307m = g0.f.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f22307m;
    }

    @Override // n0.o2
    public boolean m() {
        return this.f22297c.isConsumed();
    }

    @Override // n0.o2
    public void q(@Nullable g0.f fVar) {
        this.f22307m = fVar;
    }
}
