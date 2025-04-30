package A5;

/* loaded from: classes3.dex */
public abstract class c extends Exception {
    public static final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f75c;

    static {
        boolean z8;
        if (System.getProperty("surefire.test.class.path") != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        b = z8;
        f75c = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
