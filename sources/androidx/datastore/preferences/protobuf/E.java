package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class E extends G {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f4512c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(Object obj, long j7, int i9) {
        C c9;
        List arrayList;
        List list = (List) r0.f4600d.i(obj, j7);
        if (list.isEmpty()) {
            if (list instanceof D) {
                arrayList = new C(i9);
            } else if ((list instanceof W) && (list instanceof InterfaceC0448x)) {
                arrayList = ((InterfaceC0448x) list).mutableCopyWithCapacity(i9);
            } else {
                arrayList = new ArrayList(i9);
            }
            r0.r(obj, j7, arrayList);
            return arrayList;
        }
        if (f4512c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i9);
            arrayList2.addAll(list);
            r0.r(obj, j7, arrayList2);
            c9 = arrayList2;
        } else if (list instanceof m0) {
            C c10 = new C(list.size() + i9);
            c10.addAll((m0) list);
            r0.r(obj, j7, c10);
            c9 = c10;
        } else {
            if ((list instanceof W) && (list instanceof InterfaceC0448x)) {
                InterfaceC0448x interfaceC0448x = (InterfaceC0448x) list;
                if (!((AbstractC0427b) interfaceC0448x).b) {
                    InterfaceC0448x mutableCopyWithCapacity = interfaceC0448x.mutableCopyWithCapacity(list.size() + i9);
                    r0.r(obj, j7, mutableCopyWithCapacity);
                    return mutableCopyWithCapacity;
                }
                return list;
            }
            return list;
        }
        return c9;
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final void a(Object obj, long j7) {
        Object unmodifiableList;
        List list = (List) r0.f4600d.i(obj, j7);
        if (list instanceof D) {
            unmodifiableList = ((D) list).getUnmodifiableView();
        } else {
            if (f4512c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof W) && (list instanceof InterfaceC0448x)) {
                AbstractC0427b abstractC0427b = (AbstractC0427b) ((InterfaceC0448x) list);
                if (abstractC0427b.b) {
                    abstractC0427b.b = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        r0.r(obj, j7, unmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final void b(Object obj, Object obj2, long j7) {
        List list = (List) r0.f4600d.i(obj2, j7);
        List d2 = d(obj, j7, list.size());
        int size = d2.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d2.addAll(list);
        }
        if (size > 0) {
            list = d2;
        }
        r0.r(obj, j7, list);
    }

    @Override // androidx.datastore.preferences.protobuf.G
    public final List c(Object obj, long j7) {
        return d(obj, j7, 10);
    }
}
