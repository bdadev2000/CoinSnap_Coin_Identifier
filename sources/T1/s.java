package T1;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f2990d;

    /* renamed from: a, reason: collision with root package name */
    public int f2991a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2992c;

    static {
        char[] cArr = j2.n.f21025a;
        f2990d = new ArrayDeque(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s a(Object obj) {
        s sVar;
        s sVar2;
        ArrayDeque arrayDeque = f2990d;
        synchronized (arrayDeque) {
            sVar = (s) arrayDeque.poll();
            sVar2 = sVar;
        }
        if (sVar == null) {
            sVar2 = new Object();
        }
        sVar2.f2992c = obj;
        sVar2.b = 0;
        sVar2.f2991a = 0;
        return sVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.b != sVar.b || this.f2991a != sVar.f2991a || !this.f2992c.equals(sVar.f2992c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2992c.hashCode() + (((this.f2991a * 31) + this.b) * 31);
    }
}
