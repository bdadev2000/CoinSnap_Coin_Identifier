package h4;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class h {
    public final d3.g a = new d3.g(21, (com.applovin.impl.mediation.ads.e) null);

    /* renamed from: b, reason: collision with root package name */
    public final c f18744b = new c(1);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18745c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f18746d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f18747e;

    /* renamed from: f, reason: collision with root package name */
    public int f18748f;

    public h(int i10) {
        this.f18747e = i10;
    }

    public final void a(Class cls, int i10) {
        NavigableMap f10 = f(cls);
        Integer num = (Integer) f10.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                f10.remove(Integer.valueOf(i10));
                return;
            } else {
                f10.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void b(int i10) {
        int i11;
        while (this.f18748f > i10) {
            Object F = this.a.F();
            com.bumptech.glide.c.l(F);
            a d10 = d(F.getClass());
            int i12 = this.f18748f;
            e eVar = (e) d10;
            int a = eVar.a(F);
            switch (eVar.a) {
                case 0:
                    i11 = 1;
                    break;
                default:
                    i11 = 4;
                    break;
            }
            this.f18748f = i12 - (i11 * a);
            a(F.getClass(), eVar.a(F));
            if (Log.isLoggable(eVar.b(), 2)) {
                Log.v(eVar.b(), "evicted: " + eVar.a(F));
            }
        }
    }

    public final synchronized Object c(Class cls, int i10) {
        g gVar;
        boolean z10;
        Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i10));
        boolean z11 = false;
        if (num != null) {
            int i11 = this.f18748f;
            if (i11 != 0 && this.f18747e / i11 < 2) {
                z10 = false;
                if (!z10 || num.intValue() <= i10 * 8) {
                    z11 = true;
                }
            }
            z10 = true;
            if (!z10) {
            }
            z11 = true;
        }
        if (z11) {
            c cVar = this.f18744b;
            int intValue = num.intValue();
            gVar = (g) cVar.h();
            gVar.f18742b = intValue;
            gVar.f18743c = cls;
        } else {
            g gVar2 = (g) this.f18744b.h();
            gVar2.f18742b = i10;
            gVar2.f18743c = cls;
            gVar = gVar2;
        }
        return e(gVar, cls);
    }

    public final a d(Class cls) {
        HashMap hashMap = this.f18746d;
        a aVar = (a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new e(1);
            } else if (cls.equals(byte[].class)) {
                aVar = new e(0);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final Object e(g gVar, Class cls) {
        Object obj;
        int i10;
        a d10 = d(cls);
        Object o10 = this.a.o(gVar);
        if (o10 != null) {
            int i11 = this.f18748f;
            e eVar = (e) d10;
            int a = eVar.a(o10);
            switch (eVar.a) {
                case 0:
                    i10 = 1;
                    break;
                default:
                    i10 = 4;
                    break;
            }
            this.f18748f = i11 - (i10 * a);
            a(cls, eVar.a(o10));
        }
        if (o10 == null) {
            e eVar2 = (e) d10;
            if (Log.isLoggable(eVar2.b(), 2)) {
                Log.v(eVar2.b(), "Allocated " + gVar.f18742b + " bytes");
            }
            int i12 = gVar.f18742b;
            switch (eVar2.a) {
                case 0:
                    obj = new byte[i12];
                    break;
                default:
                    obj = new int[i12];
                    break;
            }
            return obj;
        }
        return o10;
    }

    public final NavigableMap f(Class cls) {
        HashMap hashMap = this.f18745c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final synchronized void g(Object obj) {
        int i10;
        boolean z10;
        Class<?> cls = obj.getClass();
        e eVar = (e) d(cls);
        int a = eVar.a(obj);
        int i11 = 1;
        switch (eVar.a) {
            case 0:
                i10 = 1;
                break;
            default:
                i10 = 4;
                break;
        }
        int i12 = i10 * a;
        if (i12 <= this.f18747e / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        g gVar = (g) this.f18744b.h();
        gVar.f18742b = a;
        gVar.f18743c = cls;
        this.a.D(gVar, obj);
        NavigableMap f10 = f(cls);
        Integer num = (Integer) f10.get(Integer.valueOf(gVar.f18742b));
        Integer valueOf = Integer.valueOf(gVar.f18742b);
        if (num != null) {
            i11 = 1 + num.intValue();
        }
        f10.put(valueOf, Integer.valueOf(i11));
        this.f18748f += i12;
        b(this.f18747e);
    }
}
