package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class n0 extends p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f1444c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(Object obj, long j3, int i10) {
        l0 l0Var;
        List arrayList;
        List list = (List) b2.o(obj, j3);
        if (list.isEmpty()) {
            if (list instanceof m0) {
                arrayList = new l0(i10);
            } else if ((list instanceof g1) && (list instanceof g0)) {
                arrayList = ((g0) list).mutableCopyWithCapacity(i10);
            } else {
                arrayList = new ArrayList(i10);
            }
            b2.v(obj, j3, arrayList);
            return arrayList;
        }
        if (f1444c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i10);
            arrayList2.addAll(list);
            b2.v(obj, j3, arrayList2);
            l0Var = arrayList2;
        } else if (list instanceof w1) {
            l0 l0Var2 = new l0(list.size() + i10);
            l0Var2.addAll((w1) list);
            b2.v(obj, j3, l0Var2);
            l0Var = l0Var2;
        } else {
            if ((list instanceof g1) && (list instanceof g0)) {
                g0 g0Var = (g0) list;
                if (!((c) g0Var).f1353b) {
                    g0 mutableCopyWithCapacity = g0Var.mutableCopyWithCapacity(list.size() + i10);
                    b2.v(obj, j3, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
                return list;
            }
            return list;
        }
        return l0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public final void a(Object obj, long j3) {
        Object unmodifiableList;
        List list = (List) b2.o(obj, j3);
        if (list instanceof m0) {
            unmodifiableList = ((m0) list).getUnmodifiableView();
        } else {
            if (f1444c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof g1) && (list instanceof g0)) {
                c cVar = (c) ((g0) list);
                if (cVar.f1353b) {
                    cVar.f1353b = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        b2.v(obj, j3, unmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public final void b(Object obj, Object obj2, long j3) {
        List list = (List) b2.o(obj2, j3);
        List d10 = d(obj, j3, list.size());
        int size = d10.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d10.addAll(list);
        }
        if (size > 0) {
            list = d10;
        }
        b2.v(obj, j3, list);
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public final List c(Object obj, long j3) {
        return d(obj, j3, 10);
    }
}
