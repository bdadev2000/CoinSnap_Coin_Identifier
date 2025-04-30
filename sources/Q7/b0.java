package Q7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class b0 implements P {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2552c = AtomicIntegerFieldUpdater.newUpdater(b0.class, "_isCompleting$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2553d = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_rootCause$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2554f = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final f0 b;

    public b0(f0 f0Var, Throwable th) {
        this.b = f0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable b = b();
        if (b == null) {
            f2553d.set(this, th);
            return;
        }
        if (th == b) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2554f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (obj instanceof Throwable) {
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
            return;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(th);
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
    }

    public final Throwable b() {
        return (Throwable) f2553d.get(this);
    }

    @Override // Q7.P
    public final f0 c() {
        return this.b;
    }

    public final boolean d() {
        if (b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f2552c.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2554f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable b = b();
        if (b != null) {
            arrayList.add(0, b);
        }
        if (th != null && !th.equals(b)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0255x.f2594g);
        return arrayList;
    }

    @Override // Q7.P
    public final boolean isActive() {
        if (b() == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + b() + ", exceptions=" + f2554f.get(this) + ", list=" + this.b + ']';
    }
}
