package b1;

/* loaded from: classes3.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f22296a = new ThreadLocal();

    public static y0 a() {
        ThreadLocal threadLocal = f22296a;
        y0 y0Var = (y0) threadLocal.get();
        if (y0Var != null) {
            return y0Var;
        }
        h hVar = new h(Thread.currentThread());
        threadLocal.set(hVar);
        return hVar;
    }
}
