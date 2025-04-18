package ad;

/* loaded from: classes4.dex */
public abstract class d extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f462b;

    /* renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f463c;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f462b = z10;
        f463c = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
