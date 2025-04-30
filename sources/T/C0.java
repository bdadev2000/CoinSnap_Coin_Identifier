package T;

import android.graphics.Insets;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class C0 extends B0 {

    /* renamed from: n, reason: collision with root package name */
    public L.e f2851n;

    /* renamed from: o, reason: collision with root package name */
    public L.e f2852o;

    /* renamed from: p, reason: collision with root package name */
    public L.e f2853p;

    public C0(@NonNull G0 g02, @NonNull WindowInsets windowInsets) {
        super(g02, windowInsets);
        this.f2851n = null;
        this.f2852o = null;
        this.f2853p = null;
    }

    @Override // T.E0
    @NonNull
    public L.e g() {
        Insets mandatorySystemGestureInsets;
        if (this.f2852o == null) {
            mandatorySystemGestureInsets = this.f2948c.getMandatorySystemGestureInsets();
            this.f2852o = L.e.c(mandatorySystemGestureInsets);
        }
        return this.f2852o;
    }

    @Override // T.E0
    @NonNull
    public L.e i() {
        Insets systemGestureInsets;
        if (this.f2851n == null) {
            systemGestureInsets = this.f2948c.getSystemGestureInsets();
            this.f2851n = L.e.c(systemGestureInsets);
        }
        return this.f2851n;
    }

    @Override // T.E0
    @NonNull
    public L.e k() {
        Insets tappableElementInsets;
        if (this.f2853p == null) {
            tappableElementInsets = this.f2948c.getTappableElementInsets();
            this.f2853p = L.e.c(tappableElementInsets);
        }
        return this.f2853p;
    }

    @Override // T.z0, T.E0
    @NonNull
    public G0 l(int i9, int i10, int i11, int i12) {
        WindowInsets inset;
        inset = this.f2948c.inset(i9, i10, i11, i12);
        return G0.h(null, inset);
    }

    @Override // T.A0, T.E0
    public void q(@Nullable L.e eVar) {
    }
}
