package s7;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class p {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.j f24649b = new g0.j(1);

    /* renamed from: c, reason: collision with root package name */
    public boolean f24650c;

    public p(Context context) {
        this.a = context;
    }

    public final g[] a(Handler handler, f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o9.j(this.a, this.f24649b, this.f24650c, handler, f0Var));
        u7.j0 j0Var = new u7.j0(this.a);
        j0Var.f25564d = false;
        j0Var.f25565e = false;
        j0Var.f25566f = 0;
        if (j0Var.f25563c == null) {
            j0Var.f25563c = new h.c(new u7.p[0]);
        }
        u7.r0 r0Var = new u7.r0(j0Var);
        arrayList.add(new u7.u0(this.a, this.f24649b, this.f24650c, handler, f0Var2, r0Var));
        arrayList.add(new a9.o(f0Var3, handler.getLooper()));
        arrayList.add(new l8.e(f0Var4, handler.getLooper()));
        arrayList.add(new p9.b());
        return (g[]) arrayList.toArray(new g[0]);
    }
}
