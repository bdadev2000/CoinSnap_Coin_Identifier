package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import e0.q;

/* loaded from: classes2.dex */
public final class TrieNodeKt {
    public static final Object[] a(Object[] objArr, int i2, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        q.T(objArr, objArr2, 0, i2, 6);
        q.P(i2 + 2, i2, objArr, objArr.length, objArr2);
        objArr2[i2] = obj;
        objArr2[i2 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] b(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        q.T(objArr, objArr2, 0, i2, 6);
        q.P(i2, i2 + 2, objArr, objArr.length, objArr2);
        return objArr2;
    }

    public static final Object[] c(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        q.T(objArr, objArr2, 0, i2, 6);
        q.P(i2, i2 + 1, objArr, objArr.length, objArr2);
        return objArr2;
    }

    public static final int d(int i2, int i3) {
        return (i2 >> i3) & 31;
    }
}
