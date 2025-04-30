package G7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f1332a = new Object[0];

    public static final Object[] a(Collection collection) {
        j.e(collection, "collection");
        int size = collection.size();
        Object[] objArr = f1332a;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    objArr2[i9] = it.next();
                    if (i10 >= objArr2.length) {
                        if (it.hasNext()) {
                            int i11 = ((i10 * 3) + 1) >>> 1;
                            if (i11 <= i10) {
                                i11 = 2147483645;
                                if (i10 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i11);
                            j.d(objArr2, "copyOf(...)");
                        } else {
                            return objArr2;
                        }
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr2, i10);
                        j.d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i9 = i10;
                }
            } else {
                return objArr;
            }
        } else {
            return objArr;
        }
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        j.e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i9 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i10 = i9 + 1;
            objArr2[i9] = it.next();
            if (i10 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i11 = ((i10 * 3) + 1) >>> 1;
                if (i11 <= i10) {
                    i11 = 2147483645;
                    if (i10 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i11);
                j.d(objArr2, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i10] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i10);
                j.d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i9 = i10;
        }
    }
}
