package g1;

import b1.y1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class z extends e implements y1 {
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(z.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f30641c;
    private volatile int cleanedAndPointers;

    public z(long j2, z zVar, int i2) {
        super(zVar);
        this.f30641c = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // g1.e
    public final boolean c() {
        return d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return d.addAndGet(this, Opcodes.V_PREVIEW) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, h0.l lVar);

    public final void h() {
        if (d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
