package g8;

import t7.AbstractC2712a;
import t7.C2721j;
import u7.C2814e;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f20496a = new Object();
    public static final C2814e b = new C2814e();

    /* renamed from: c, reason: collision with root package name */
    public static int f20497c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20498d;

    /* JADX WARN: Type inference failed for: r0v0, types: [g8.c, java.lang.Object] */
    static {
        Object b8;
        int i9;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            G7.j.d(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            b8 = O7.n.v(property);
        } catch (Throwable th) {
            b8 = AbstractC2712a.b(th);
        }
        if (b8 instanceof C2721j) {
            b8 = null;
        }
        Integer num = (Integer) b8;
        if (num != null) {
            i9 = num.intValue();
        } else {
            i9 = 1048576;
        }
        f20498d = i9;
    }
}
