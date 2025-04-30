package j2;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final f f21019a = new f(0);
    public static final f b = new f(1);

    public static void a(String str, boolean z8) {
        if (z8) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(Object obj) {
        c(obj, "Argument must not be null");
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }
}
