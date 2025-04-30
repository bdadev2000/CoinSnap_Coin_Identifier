package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.t3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2002t3 extends AbstractC2016v3 {
    private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C2002t3() {
        super();
    }

    public static <E> List<E> getList(Object obj, long j7) {
        return (List) C5.getObject(obj, j7);
    }

    @Override // com.google.protobuf.AbstractC2016v3
    public void makeImmutableListAt(Object obj, long j7) {
        Object unmodifiableList;
        List list = (List) C5.getObject(obj, j7);
        if (list instanceof InterfaceC1988r3) {
            unmodifiableList = ((InterfaceC1988r3) list).getUnmodifiableView();
        } else {
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1955m4) && (list instanceof InterfaceC1891d3)) {
                InterfaceC1891d3 interfaceC1891d3 = (InterfaceC1891d3) list;
                if (interfaceC1891d3.isModifiable()) {
                    ((AbstractC1894e) interfaceC1891d3).makeImmutable();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C5.putObject(obj, j7, unmodifiableList);
    }

    @Override // com.google.protobuf.AbstractC2016v3
    public <E> void mergeListsAt(Object obj, Object obj2, long j7) {
        List list = getList(obj2, j7);
        List mutableListAt = mutableListAt(obj, j7, list.size());
        int size = mutableListAt.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            mutableListAt.addAll(list);
        }
        if (size > 0) {
            list = mutableListAt;
        }
        C5.putObject(obj, j7, list);
    }

    @Override // com.google.protobuf.AbstractC2016v3
    public <L> List<L> mutableListAt(Object obj, long j7) {
        return mutableListAt(obj, j7, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> mutableListAt(Object obj, long j7, int i9) {
        C1982q3 c1982q3;
        List<L> arrayList;
        List<L> list = getList(obj, j7);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC1988r3) {
                arrayList = new C1982q3(i9);
            } else if ((list instanceof InterfaceC1955m4) && (list instanceof InterfaceC1891d3)) {
                arrayList = ((InterfaceC1891d3) list).mutableCopyWithCapacity(i9);
            } else {
                arrayList = new ArrayList<>(i9);
            }
            C5.putObject(obj, j7, arrayList);
            return arrayList;
        }
        if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i9);
            arrayList2.addAll(list);
            C5.putObject(obj, j7, arrayList2);
            c1982q3 = arrayList2;
        } else if (list instanceof C2025w5) {
            C1982q3 c1982q32 = new C1982q3(list.size() + i9);
            c1982q32.addAll((C2025w5) list);
            C5.putObject(obj, j7, c1982q32);
            c1982q3 = c1982q32;
        } else {
            if (!(list instanceof InterfaceC1955m4) || !(list instanceof InterfaceC1891d3)) {
                return list;
            }
            InterfaceC1891d3 interfaceC1891d3 = (InterfaceC1891d3) list;
            if (interfaceC1891d3.isModifiable()) {
                return list;
            }
            InterfaceC1891d3 mutableCopyWithCapacity = interfaceC1891d3.mutableCopyWithCapacity(list.size() + i9);
            C5.putObject(obj, j7, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
        return c1982q3;
    }
}
