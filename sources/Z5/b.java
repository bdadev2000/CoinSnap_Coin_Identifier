package Z5;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class b {
    public static h a(O5.c cVar, O5.d dVar) {
        if (Y5.a.f3816a.f1512a) {
            return new h(cVar, dVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void b();

    public abstract void c(View view);

    public abstract void d();
}
