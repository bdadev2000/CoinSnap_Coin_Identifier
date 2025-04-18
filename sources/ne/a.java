package ne;

import eb.j;
import fe.c;
import ge.f;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final c f22747e = new c(a.class.getSimpleName());
    public f a;

    /* renamed from: b, reason: collision with root package name */
    public int f22748b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f22749c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f22750d = 0;

    public static void e(int i10) {
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            throw new IllegalStateException(j.i("This value is not sanitized: ", i10));
        }
    }

    public final int a(int i10, int i11) {
        if (i10 == i11) {
            return 0;
        }
        if (i11 == 1) {
            return ((360 - a(i11, i10)) + 360) % 360;
        }
        if (i10 == 1) {
            if (i11 != 0) {
                int i12 = i11 - 1;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            return (this.f22750d + 360) % 360;
                        }
                        throw new RuntimeException("Unknown reference: ".concat(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.z(i11)));
                    }
                    return ((360 - this.f22749c) + 360) % 360;
                }
                return ((360 - this.f22748b) + 360) % 360;
            }
            throw null;
        }
        return ((a(1, i11) - a(1, i10)) + 360) % 360;
    }

    public final boolean b(int i10, int i11) {
        return c(i10, i11, 1) % 180 != 0;
    }

    public final int c(int i10, int i11, int i12) {
        int a = a(i10, i11);
        if (i12 == 2 && this.a == f.FRONT) {
            return ((360 - a) + 360) % 360;
        }
        return a;
    }

    public final void d() {
        f22747e.a(1, "Angles changed:", "sensorOffset:", Integer.valueOf(this.f22748b), "displayOffset:", Integer.valueOf(this.f22749c), "deviceOrientation:", Integer.valueOf(this.f22750d));
    }
}
