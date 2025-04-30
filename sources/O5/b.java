package O5;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class b {
    public static k b(c cVar, d dVar) {
        if (N5.a.f2098a.f1512a) {
            return new k(cVar, dVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a(View view, g gVar);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();

    public abstract void f();
}
