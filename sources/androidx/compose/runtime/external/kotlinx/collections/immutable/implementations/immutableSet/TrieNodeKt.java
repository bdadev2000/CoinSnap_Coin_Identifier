package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import e0.q;

/* loaded from: classes4.dex */
public final class TrieNodeKt {
    public static final Object[] a(Object obj, Object[] objArr, int i2) {
        Object[] objArr2 = new Object[objArr.length + 1];
        q.T(objArr, objArr2, 0, i2, 6);
        q.P(i2 + 1, i2, objArr, objArr.length, objArr2);
        objArr2[i2] = obj;
        return objArr2;
    }

    public static final Object[] b(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        q.T(objArr, objArr2, 0, i2, 6);
        q.P(i2, i2 + 1, objArr, objArr.length, objArr2);
        return objArr2;
    }

    public static final int c(int i2, int i3) {
        return (i2 >> i3) & 31;
    }
}
