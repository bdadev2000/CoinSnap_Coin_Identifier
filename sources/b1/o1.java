package b1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class o1 implements d1 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f22357b = AtomicIntegerFieldUpdater.newUpdater(o1.class, "_isCompleting");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f22358c = AtomicReferenceFieldUpdater.newUpdater(o1.class, Object.class, "_rootCause");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(o1.class, Object.class, "_exceptionsHolder");

    @Nullable
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;

    @Nullable
    private volatile Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final v1 f22359a;

    public o1(v1 v1Var, Throwable th) {
        this.f22359a = v1Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable b2 = b();
        if (b2 == null) {
            f22358c.set(this, th);
            return;
        }
        if (th == b2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable b() {
        return (Throwable) f22358c.get(this);
    }

    @Override // b1.d1
    public final v1 c() {
        return this.f22359a;
    }

    public final boolean d() {
        return b() != null;
    }

    public final boolean e() {
        return f22357b.get(this) != 0;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable b2 = b();
        if (b2 != null) {
            arrayList.add(0, b2);
        }
        if (th != null && !p0.a.g(th, b2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, f0.f22311h);
        return arrayList;
    }

    @Override // b1.d1
    public final boolean isActive() {
        return b() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + b() + ", exceptions=" + d.get(this) + ", list=" + this.f22359a + ']';
    }
}
