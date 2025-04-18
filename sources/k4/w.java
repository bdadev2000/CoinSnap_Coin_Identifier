package k4;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f20267d;
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f20268b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20269c;

    static {
        char[] cArr = w4.m.a;
        f20267d = new ArrayDeque(0);
    }

    public static w a(Object obj) {
        w wVar;
        ArrayDeque arrayDeque = f20267d;
        synchronized (arrayDeque) {
            wVar = (w) arrayDeque.poll();
        }
        if (wVar == null) {
            wVar = new w();
        }
        wVar.f20269c = obj;
        wVar.f20268b = 0;
        wVar.a = 0;
        return wVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f20268b != wVar.f20268b || this.a != wVar.a || !this.f20269c.equals(wVar.f20269c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20269c.hashCode() + (((this.a * 31) + this.f20268b) * 31);
    }
}
