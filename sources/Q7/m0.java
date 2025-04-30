package Q7;

/* loaded from: classes3.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2570a = new ThreadLocal();

    public static L a() {
        ThreadLocal threadLocal = f2570a;
        L l = (L) threadLocal.get();
        if (l == null) {
            C0236d c0236d = new C0236d(Thread.currentThread());
            threadLocal.set(c0236d);
            return c0236d;
        }
        return l;
    }
}
