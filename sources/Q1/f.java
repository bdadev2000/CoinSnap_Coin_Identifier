package Q1;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final E1.d f2474a = new E1.d(11);
    public final e b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2475c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2476d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f2477e;

    /* renamed from: f, reason: collision with root package name */
    public int f2478f;

    public f(int i9) {
        this.f2477e = i9;
    }

    public final void a(int i9, Class cls) {
        NavigableMap f9 = f(cls);
        Integer num = (Integer) f9.get(Integer.valueOf(i9));
        if (num != null) {
            if (num.intValue() == 1) {
                f9.remove(Integer.valueOf(i9));
                return;
            } else {
                f9.put(Integer.valueOf(i9), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i9 + ", this: " + this);
    }

    public final void b(int i9) {
        while (this.f2478f > i9) {
            Object A8 = this.f2474a.A();
            j2.g.b(A8);
            b d2 = d(A8.getClass());
            this.f2478f -= d2.b() * d2.a(A8);
            a(d2.a(A8), A8.getClass());
            if (Log.isLoggable(d2.c(), 2)) {
                Log.v(d2.c(), "evicted: " + d2.a(A8));
            }
        }
    }

    public final synchronized Object c(int i9, Class cls) {
        d dVar;
        int i10;
        try {
            Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i9));
            if (num == null || ((i10 = this.f2478f) != 0 && this.f2477e / i10 < 2 && num.intValue() > i9 * 8)) {
                e eVar = this.b;
                i iVar = (i) ((ArrayDeque) eVar.f273c).poll();
                if (iVar == null) {
                    iVar = eVar.n();
                }
                dVar = (d) iVar;
                dVar.b = i9;
                dVar.f2472c = cls;
            }
            e eVar2 = this.b;
            int intValue = num.intValue();
            i iVar2 = (i) ((ArrayDeque) eVar2.f273c).poll();
            if (iVar2 == null) {
                iVar2 = eVar2.n();
            }
            dVar = (d) iVar2;
            dVar.b = intValue;
            dVar.f2472c = cls;
        } catch (Throwable th) {
            throw th;
        }
        return e(dVar, cls);
    }

    public final b d(Class cls) {
        HashMap hashMap = this.f2476d;
        b bVar = (b) hashMap.get(cls);
        if (bVar == null) {
            if (cls.equals(int[].class)) {
                bVar = new b(1);
            } else if (cls.equals(byte[].class)) {
                bVar = new b(0);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, bVar);
        }
        return bVar;
    }

    public final Object e(d dVar, Class cls) {
        b d2 = d(cls);
        Object h6 = this.f2474a.h(dVar);
        if (h6 != null) {
            this.f2478f -= d2.b() * d2.a(h6);
            a(d2.a(h6), cls);
        }
        if (h6 == null) {
            if (Log.isLoggable(d2.c(), 2)) {
                Log.v(d2.c(), "Allocated " + dVar.b + " bytes");
            }
            return d2.d(dVar.b);
        }
        return h6;
    }

    public final NavigableMap f(Class cls) {
        HashMap hashMap = this.f2475c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        b d2 = d(cls);
        int a6 = d2.a(obj);
        int b = d2.b() * a6;
        if (b <= this.f2477e / 2) {
            e eVar = this.b;
            i iVar = (i) ((ArrayDeque) eVar.f273c).poll();
            if (iVar == null) {
                iVar = eVar.n();
            }
            d dVar = (d) iVar;
            dVar.b = a6;
            dVar.f2472c = cls;
            this.f2474a.w(dVar, obj);
            NavigableMap f9 = f(cls);
            Integer num = (Integer) f9.get(Integer.valueOf(dVar.b));
            Integer valueOf = Integer.valueOf(dVar.b);
            int i9 = 1;
            if (num != null) {
                i9 = 1 + num.intValue();
            }
            f9.put(valueOf, Integer.valueOf(i9));
            this.f2478f += b;
            b(this.f2477e);
        }
    }
}
