package u0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f31370a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final a f31371b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u0.f, u0.e] */
    /* JADX WARN: Type inference failed for: r0v3, types: [u0.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        Integer num = n0.a.f31050a;
        f31371b = (num == null || num.intValue() >= 34) ? new f() : new c();
    }

    public abstract int a(int i2);

    public abstract int b();

    public abstract int c(int i2);

    public int d(int i2, int i3) {
        int b2;
        int i4;
        int i5;
        if (i3 <= i2) {
            Integer valueOf = Integer.valueOf(i2);
            Integer valueOf2 = Integer.valueOf(i3);
            p0.a.s(valueOf, "from");
            p0.a.s(valueOf2, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
        }
        int i6 = i3 - i2;
        if (i6 > 0 || i6 == Integer.MIN_VALUE) {
            if (((-i6) & i6) == i6) {
                i5 = a(31 - Integer.numberOfLeadingZeros(i6));
                return i2 + i5;
            }
            do {
                b2 = b() >>> 1;
                i4 = b2 % i6;
            } while ((i6 - 1) + (b2 - i4) < 0);
            i5 = i4;
            return i2 + i5;
        }
        while (true) {
            int b3 = b();
            if (i2 <= b3 && b3 < i3) {
                return b3;
            }
        }
    }
}
