package n0;

import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class g2 extends i2 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f22277c;

    public g2() {
        f2.i();
        this.f22277c = f2.c();
    }

    @Override // n0.i2
    @NonNull
    public r2 b() {
        WindowInsets build;
        a();
        build = this.f22277c.build();
        r2 h10 = r2.h(null, build);
        h10.a.o(this.f22291b);
        return h10;
    }

    @Override // n0.i2
    public void d(@NonNull g0.f fVar) {
        this.f22277c.setMandatorySystemGestureInsets(fVar.d());
    }

    @Override // n0.i2
    public void e(@NonNull g0.f fVar) {
        this.f22277c.setStableInsets(fVar.d());
    }

    @Override // n0.i2
    public void f(@NonNull g0.f fVar) {
        this.f22277c.setSystemGestureInsets(fVar.d());
    }

    @Override // n0.i2
    public void g(@NonNull g0.f fVar) {
        this.f22277c.setSystemWindowInsets(fVar.d());
    }

    @Override // n0.i2
    public void h(@NonNull g0.f fVar) {
        this.f22277c.setTappableElementInsets(fVar.d());
    }

    public g2(@NonNull r2 r2Var) {
        super(r2Var);
        WindowInsets.Builder c10;
        WindowInsets g10 = r2Var.g();
        if (g10 != null) {
            f2.i();
            c10 = f2.d(g10);
        } else {
            f2.i();
            c10 = f2.c();
        }
        this.f22277c = c10;
    }
}
