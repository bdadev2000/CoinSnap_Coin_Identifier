package x;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2913a {

    /* renamed from: a, reason: collision with root package name */
    public i f24051a;
    public i b;

    /* renamed from: c, reason: collision with root package name */
    public k f24052c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24054e;

    public /* synthetic */ C2913a(Object obj, int i9) {
        this.f24053d = i9;
        this.f24054e = obj;
    }

    public static boolean j(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean k(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public final void a() {
        switch (this.f24053d) {
            case 0:
                ((b) this.f24054e).clear();
                return;
            default:
                ((c) this.f24054e).clear();
                return;
        }
    }

    public final Object b(int i9, int i10) {
        switch (this.f24053d) {
            case 0:
                return ((b) this.f24054e).f24085c[(i9 << 1) + i10];
            default:
                return ((c) this.f24054e).f24061c[i9];
        }
    }

    public final Map c() {
        switch (this.f24053d) {
            case 0:
                return (b) this.f24054e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final int d() {
        switch (this.f24053d) {
            case 0:
                return ((b) this.f24054e).f24086d;
            default:
                return ((c) this.f24054e).f24062d;
        }
    }

    public final int e(Object obj) {
        switch (this.f24053d) {
            case 0:
                return ((b) this.f24054e).e(obj);
            default:
                return ((c) this.f24054e).indexOf(obj);
        }
    }

    public final int f(Object obj) {
        switch (this.f24053d) {
            case 0:
                return ((b) this.f24054e).g(obj);
            default:
                return ((c) this.f24054e).indexOf(obj);
        }
    }

    public final void g(Object obj, Object obj2) {
        switch (this.f24053d) {
            case 0:
                ((b) this.f24054e).put(obj, obj2);
                return;
            default:
                ((c) this.f24054e).add(obj);
                return;
        }
    }

    public final void h(int i9) {
        switch (this.f24053d) {
            case 0:
                ((b) this.f24054e).k(i9);
                return;
            default:
                ((c) this.f24054e).f(i9);
                return;
        }
    }

    public final Object i(int i9, Object obj) {
        switch (this.f24053d) {
            case 0:
                return ((b) this.f24054e).l(i9, obj);
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final Object[] l(int i9, Object[] objArr) {
        int d2 = d();
        if (objArr.length < d2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d2);
        }
        for (int i10 = 0; i10 < d2; i10++) {
            objArr[i10] = b(i10, i9);
        }
        if (objArr.length > d2) {
            objArr[d2] = null;
        }
        return objArr;
    }
}
