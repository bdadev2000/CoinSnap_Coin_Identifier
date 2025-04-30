package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class dc {
    public static boolean a(List list, Object obj) {
        if (obj == Preconditions.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return sb.a(list.iterator(), list2.iterator());
        }
        for (int i9 = 0; i9 < size; i9++) {
            if (!Objects.equal(list.get(i9), list2.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public static int b(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return c(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int c(List list, Object obj) {
        int size = list.size();
        int i9 = 0;
        if (obj == null) {
            while (i9 < size) {
                if (list.get(i9) == null) {
                    return i9;
                }
                i9++;
            }
            return -1;
        }
        while (i9 < size) {
            if (obj.equals(list.get(i9))) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int e(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList a() {
        return new ArrayList();
    }

    public static ArrayList a(Iterator it) {
        ArrayList a6 = a();
        sb.a(a6, it);
        return a6;
    }
}
