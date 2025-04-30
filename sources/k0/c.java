package k0;

import java.nio.ByteBuffer;
import q4.C2645d;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f21396a;
    public ByteBuffer b;

    /* renamed from: c, reason: collision with root package name */
    public int f21397c;

    /* renamed from: d, reason: collision with root package name */
    public int f21398d;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, q4.d] */
    public c() {
        if (C2645d.b == null) {
            C2645d.b = new Object();
        }
    }

    public final int a(int i9) {
        if (i9 < this.f21398d) {
            return this.b.getShort(this.f21397c + i9);
        }
        return 0;
    }
}
