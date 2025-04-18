package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class u4 extends w4 {
    private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private u4() {
        super();
    }

    public static <E> List<E> getList(Object obj, long j3) {
        return (List) d9.getObject(obj, j3);
    }

    @Override // com.google.protobuf.w4
    public void makeImmutableListAt(Object obj, long j3) {
        Object unmodifiableList;
        List list = (List) d9.getObject(obj, j3);
        if (list instanceof s4) {
            unmodifiableList = ((s4) list).getUnmodifiableView();
        } else {
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof n6) && (list instanceof e4)) {
                e4 e4Var = (e4) list;
                if (e4Var.isModifiable()) {
                    ((e) e4Var).makeImmutable();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        d9.putObject(obj, j3, unmodifiableList);
    }

    @Override // com.google.protobuf.w4
    public <E> void mergeListsAt(Object obj, Object obj2, long j3) {
        List list = getList(obj2, j3);
        List mutableListAt = mutableListAt(obj, j3, list.size());
        int size = mutableListAt.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            mutableListAt.addAll(list);
        }
        if (size > 0) {
            list = mutableListAt;
        }
        d9.putObject(obj, j3, list);
    }

    @Override // com.google.protobuf.w4
    public <L> List<L> mutableListAt(Object obj, long j3) {
        return mutableListAt(obj, j3, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> mutableListAt(Object obj, long j3, int i10) {
        r4 r4Var;
        List<L> arrayList;
        List<L> list = getList(obj, j3);
        if (list.isEmpty()) {
            if (list instanceof s4) {
                arrayList = new r4(i10);
            } else if ((list instanceof n6) && (list instanceof e4)) {
                arrayList = ((e4) list).mutableCopyWithCapacity(i10);
            } else {
                arrayList = new ArrayList<>(i10);
            }
            d9.putObject(obj, j3, arrayList);
            return arrayList;
        }
        if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i10);
            arrayList2.addAll(list);
            d9.putObject(obj, j3, arrayList2);
            r4Var = arrayList2;
        } else if (list instanceof x8) {
            r4 r4Var2 = new r4(list.size() + i10);
            r4Var2.addAll((x8) list);
            d9.putObject(obj, j3, r4Var2);
            r4Var = r4Var2;
        } else {
            if (!(list instanceof n6) || !(list instanceof e4)) {
                return list;
            }
            e4 e4Var = (e4) list;
            if (e4Var.isModifiable()) {
                return list;
            }
            e4 mutableCopyWithCapacity = e4Var.mutableCopyWithCapacity(list.size() + i10);
            d9.putObject(obj, j3, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
        return r4Var;
    }
}
