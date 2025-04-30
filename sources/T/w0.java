package T;

import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class w0 extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f2942c;

    public w0() {
        this.f2942c = G.a.g();
    }

    @Override // T.y0
    @NonNull
    public G0 b() {
        WindowInsets build;
        a();
        build = this.f2942c.build();
        G0 h6 = G0.h(null, build);
        h6.f2863a.o(this.b);
        return h6;
    }

    @Override // T.y0
    public void d(@NonNull L.e eVar) {
        this.f2942c.setMandatorySystemGestureInsets(eVar.d());
    }

    @Override // T.y0
    public void e(@NonNull L.e eVar) {
        this.f2942c.setStableInsets(eVar.d());
    }

    @Override // T.y0
    public void f(@NonNull L.e eVar) {
        this.f2942c.setSystemGestureInsets(eVar.d());
    }

    @Override // T.y0
    public void g(@NonNull L.e eVar) {
        this.f2942c.setSystemWindowInsets(eVar.d());
    }

    @Override // T.y0
    public void h(@NonNull L.e eVar) {
        this.f2942c.setTappableElementInsets(eVar.d());
    }

    public w0(@NonNull G0 g02) {
        super(g02);
        WindowInsets.Builder g9;
        WindowInsets g10 = g02.g();
        if (g10 != null) {
            g9 = G.a.h(g10);
        } else {
            g9 = G.a.g();
        }
        this.f2942c = g9;
    }
}
