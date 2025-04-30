package T;

import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class A0 extends z0 {
    public L.e m;

    public A0(@NonNull G0 g02, @NonNull WindowInsets windowInsets) {
        super(g02, windowInsets);
        this.m = null;
    }

    @Override // T.E0
    @NonNull
    public G0 b() {
        return G0.h(null, this.f2948c.consumeStableInsets());
    }

    @Override // T.E0
    @NonNull
    public G0 c() {
        return G0.h(null, this.f2948c.consumeSystemWindowInsets());
    }

    @Override // T.E0
    @NonNull
    public final L.e h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.f2948c;
            this.m = L.e.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // T.E0
    public boolean m() {
        return this.f2948c.isConsumed();
    }

    @Override // T.E0
    public void q(@Nullable L.e eVar) {
        this.m = eVar;
    }
}
