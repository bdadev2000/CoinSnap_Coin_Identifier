package n0;

import android.graphics.Insets;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class m2 extends l2 {

    /* renamed from: n, reason: collision with root package name */
    public g0.f f22322n;

    /* renamed from: o, reason: collision with root package name */
    public g0.f f22323o;

    /* renamed from: p, reason: collision with root package name */
    public g0.f f22324p;

    public m2(@NonNull r2 r2Var, @NonNull WindowInsets windowInsets) {
        super(r2Var, windowInsets);
        this.f22322n = null;
        this.f22323o = null;
        this.f22324p = null;
    }

    @Override // n0.o2
    @NonNull
    public g0.f g() {
        Insets mandatorySystemGestureInsets;
        if (this.f22323o == null) {
            mandatorySystemGestureInsets = this.f22297c.getMandatorySystemGestureInsets();
            this.f22323o = g0.f.c(mandatorySystemGestureInsets);
        }
        return this.f22323o;
    }

    @Override // n0.o2
    @NonNull
    public g0.f i() {
        Insets systemGestureInsets;
        if (this.f22322n == null) {
            systemGestureInsets = this.f22297c.getSystemGestureInsets();
            this.f22322n = g0.f.c(systemGestureInsets);
        }
        return this.f22322n;
    }

    @Override // n0.o2
    @NonNull
    public g0.f k() {
        Insets tappableElementInsets;
        if (this.f22324p == null) {
            tappableElementInsets = this.f22297c.getTappableElementInsets();
            this.f22324p = g0.f.c(tappableElementInsets);
        }
        return this.f22324p;
    }

    @Override // n0.j2, n0.o2
    @NonNull
    public r2 l(int i10, int i11, int i12, int i13) {
        WindowInsets inset;
        inset = this.f22297c.inset(i10, i11, i12, i13);
        return r2.h(null, inset);
    }

    @Override // n0.k2, n0.o2
    public void q(@Nullable g0.f fVar) {
    }
}
