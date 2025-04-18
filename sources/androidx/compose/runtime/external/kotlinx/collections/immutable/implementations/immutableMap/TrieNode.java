package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.q;
import java.util.Arrays;
import p0.a;
import w0.e;

@StabilityInferred
/* loaded from: classes.dex */
public final class TrieNode<K, V> {
    public static final TrieNode e = new TrieNode(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f14215a;

    /* renamed from: b, reason: collision with root package name */
    public int f14216b;

    /* renamed from: c, reason: collision with root package name */
    public final MutabilityOwnership f14217c;
    public Object[] d;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class ModificationResult<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public TrieNode f14218a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14219b;

        public ModificationResult(TrieNode trieNode, int i2) {
            this.f14218a = trieNode;
            this.f14219b = i2;
        }
    }

    public TrieNode(int i2, int i3, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.f14215a = i2;
        this.f14216b = i3;
        this.f14217c = mutabilityOwnership;
        this.d = objArr;
    }

    public static TrieNode j(int i2, Object obj, Object obj2, int i3, Object obj3, Object obj4, int i4, MutabilityOwnership mutabilityOwnership) {
        if (i4 > 30) {
            return new TrieNode(0, 0, new Object[]{obj, obj2, obj3, obj4}, mutabilityOwnership);
        }
        int d = TrieNodeKt.d(i2, i4);
        int d2 = TrieNodeKt.d(i3, i4);
        if (d != d2) {
            return new TrieNode((1 << d) | (1 << d2), 0, d < d2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, mutabilityOwnership);
        }
        return new TrieNode(0, 1 << d, new Object[]{j(i2, obj, obj2, i3, obj3, obj4, i4 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    public final Object[] a(int i2, int i3, int i4, Object obj, Object obj2, int i5, MutabilityOwnership mutabilityOwnership) {
        Object obj3 = this.d[i2];
        TrieNode j2 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i2), i4, obj, obj2, i5 + 5, mutabilityOwnership);
        int t2 = t(i3);
        int i6 = t2 + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        q.T(objArr, objArr2, 0, i2, 6);
        q.P(i2, i2 + 2, objArr, i6, objArr2);
        objArr2[t2 - 1] = j2;
        q.P(t2, i6, objArr, objArr.length, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f14216b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f14215a);
        int length = this.d.length;
        for (int i2 = bitCount * 2; i2 < length; i2++) {
            bitCount += s(i2).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        e y02 = a.y0(a.F0(0, this.d.length), 2);
        int i2 = y02.f31406a;
        int i3 = y02.f31407b;
        int i4 = y02.f31408c;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (!a.g(obj, this.d[i2])) {
                if (i2 != i3) {
                    i2 += i4;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i2, int i3, Object obj) {
        int d = 1 << TrieNodeKt.d(i2, i3);
        if (h(d)) {
            return a.g(obj, this.d[f(d)]);
        }
        if (!i(d)) {
            return false;
        }
        TrieNode s2 = s(t(d));
        return i3 == 30 ? s2.c(obj) : s2.d(i2, i3 + 5, obj);
    }

    public final boolean e(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f14216b != trieNode.f14216b || this.f14215a != trieNode.f14215a) {
            return false;
        }
        int length = this.d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.d[i2] != trieNode.d[i2]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i2) {
        return Integer.bitCount((i2 - 1) & this.f14215a) * 2;
    }

    public final Object g(int i2, int i3, Object obj) {
        int d = 1 << TrieNodeKt.d(i2, i3);
        if (h(d)) {
            int f2 = f(d);
            if (a.g(obj, this.d[f2])) {
                return x(f2);
            }
            return null;
        }
        if (!i(d)) {
            return null;
        }
        TrieNode s2 = s(t(d));
        if (i3 != 30) {
            return s2.g(i2, i3 + 5, obj);
        }
        e y02 = a.y0(a.F0(0, s2.d.length), 2);
        int i4 = y02.f31406a;
        int i5 = y02.f31407b;
        int i6 = y02.f31408c;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return null;
        }
        while (!a.g(obj, s2.d[i4])) {
            if (i4 == i5) {
                return null;
            }
            i4 += i6;
        }
        return s2.x(i4);
    }

    public final boolean h(int i2) {
        return (i2 & this.f14215a) != 0;
    }

    public final boolean i(int i2) {
        return (i2 & this.f14216b) != 0;
    }

    public final TrieNode k(int i2, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.g(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.d = x(i2);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f14217c != persistentHashMapBuilder.f14201b) {
            return new TrieNode(0, 0, TrieNodeKt.b(i2, objArr), persistentHashMapBuilder.f14201b);
        }
        this.d = TrieNodeKt.b(i2, objArr);
        return this;
    }

    public final TrieNode l(int i2, Object obj, Object obj2, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode l2;
        int d = 1 << TrieNodeKt.d(i2, i3);
        boolean h2 = h(d);
        MutabilityOwnership mutabilityOwnership = this.f14217c;
        if (h2) {
            int f2 = f(d);
            if (!a.g(obj, this.d[f2])) {
                persistentHashMapBuilder.g(persistentHashMapBuilder.size() + 1);
                MutabilityOwnership mutabilityOwnership2 = persistentHashMapBuilder.f14201b;
                if (mutabilityOwnership != mutabilityOwnership2) {
                    return new TrieNode(this.f14215a ^ d, this.f14216b | d, a(f2, d, i2, obj, obj2, i3, mutabilityOwnership2), mutabilityOwnership2);
                }
                this.d = a(f2, d, i2, obj, obj2, i3, mutabilityOwnership2);
                this.f14215a ^= d;
                this.f14216b |= d;
                return this;
            }
            persistentHashMapBuilder.d = x(f2);
            if (x(f2) == obj2) {
                return this;
            }
            if (mutabilityOwnership == persistentHashMapBuilder.f14201b) {
                this.d[f2 + 1] = obj2;
                return this;
            }
            persistentHashMapBuilder.f14203f++;
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            a.r(copyOf, "copyOf(this, size)");
            copyOf[f2 + 1] = obj2;
            return new TrieNode(this.f14215a, this.f14216b, copyOf, persistentHashMapBuilder.f14201b);
        }
        if (!i(d)) {
            persistentHashMapBuilder.g(persistentHashMapBuilder.size() + 1);
            MutabilityOwnership mutabilityOwnership3 = persistentHashMapBuilder.f14201b;
            int f3 = f(d);
            if (mutabilityOwnership != mutabilityOwnership3) {
                return new TrieNode(this.f14215a | d, this.f14216b, TrieNodeKt.a(this.d, f3, obj, obj2), mutabilityOwnership3);
            }
            this.d = TrieNodeKt.a(this.d, f3, obj, obj2);
            this.f14215a |= d;
            return this;
        }
        int t2 = t(d);
        TrieNode s2 = s(t2);
        if (i3 == 30) {
            e y02 = a.y0(a.F0(0, s2.d.length), 2);
            int i4 = y02.f31406a;
            int i5 = y02.f31407b;
            int i6 = y02.f31408c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (!a.g(obj, s2.d[i4])) {
                    if (i4 != i5) {
                        i4 += i6;
                    }
                }
                persistentHashMapBuilder.d = s2.x(i4);
                if (s2.f14217c == persistentHashMapBuilder.f14201b) {
                    s2.d[i4 + 1] = obj2;
                    l2 = s2;
                } else {
                    persistentHashMapBuilder.f14203f++;
                    Object[] objArr2 = s2.d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    a.r(copyOf2, "copyOf(this, size)");
                    copyOf2[i4 + 1] = obj2;
                    l2 = new TrieNode(0, 0, copyOf2, persistentHashMapBuilder.f14201b);
                }
            }
            persistentHashMapBuilder.g(persistentHashMapBuilder.size() + 1);
            l2 = new TrieNode(0, 0, TrieNodeKt.a(s2.d, 0, obj, obj2), persistentHashMapBuilder.f14201b);
            break;
        }
        l2 = s2.l(i2, obj, obj2, i3 + 5, persistentHashMapBuilder);
        return s2 == l2 ? this : r(t2, l2, persistentHashMapBuilder.f14201b);
    }

    public final TrieNode m(TrieNode trieNode, int i2, DeltaCounter deltaCounter, PersistentHashMapBuilder persistentHashMapBuilder) {
        Object[] objArr;
        int i3;
        TrieNode j2;
        if (this == trieNode) {
            deltaCounter.a(b());
            return this;
        }
        int i4 = 0;
        if (i2 > 30) {
            MutabilityOwnership mutabilityOwnership = persistentHashMapBuilder.f14201b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + trieNode.d.length);
            a.r(copyOf, "copyOf(this, newSize)");
            int length = this.d.length;
            e y02 = a.y0(a.F0(0, trieNode.d.length), 2);
            int i5 = y02.f31406a;
            int i6 = y02.f31407b;
            int i7 = y02.f31408c;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (c(trieNode.d[i5])) {
                        deltaCounter.f14278a++;
                    } else {
                        Object[] objArr3 = trieNode.d;
                        copyOf[length] = objArr3[i5];
                        copyOf[length + 1] = objArr3[i5 + 1];
                        length += 2;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
            if (length == this.d.length) {
                return this;
            }
            if (length == trieNode.d.length) {
                return trieNode;
            }
            if (length == copyOf.length) {
                return new TrieNode(0, 0, copyOf, mutabilityOwnership);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            a.r(copyOf2, "copyOf(this, newSize)");
            return new TrieNode(0, 0, copyOf2, mutabilityOwnership);
        }
        int i8 = this.f14216b | trieNode.f14216b;
        int i9 = this.f14215a;
        int i10 = trieNode.f14215a;
        int i11 = (i9 ^ i10) & (~i8);
        int i12 = i9 & i10;
        int i13 = i11;
        while (i12 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i12);
            if (a.g(this.d[f(lowestOneBit)], trieNode.d[trieNode.f(lowestOneBit)])) {
                i13 |= lowestOneBit;
            } else {
                i8 |= lowestOneBit;
            }
            i12 ^= lowestOneBit;
        }
        if (!((i8 & i13) == 0)) {
            PreconditionsKt.b("Check failed.");
            throw null;
        }
        TrieNode trieNode2 = (a.g(this.f14217c, persistentHashMapBuilder.f14201b) && this.f14215a == i13 && this.f14216b == i8) ? this : new TrieNode(i13, i8, new Object[Integer.bitCount(i8) + (Integer.bitCount(i13) * 2)], null);
        int i14 = i8;
        int i15 = 0;
        while (i14 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i14);
            Object[] objArr4 = trieNode2.d;
            int length2 = (objArr4.length - 1) - i15;
            if (i(lowestOneBit2)) {
                j2 = s(t(lowestOneBit2));
                if (trieNode.i(lowestOneBit2)) {
                    j2 = j2.m(trieNode.s(trieNode.t(lowestOneBit2)), i2 + 5, deltaCounter, persistentHashMapBuilder);
                } else if (trieNode.h(lowestOneBit2)) {
                    int f2 = trieNode.f(lowestOneBit2);
                    Object obj = trieNode.d[f2];
                    Object x = trieNode.x(f2);
                    int size = persistentHashMapBuilder.size();
                    objArr = objArr4;
                    j2 = j2.l(obj != null ? obj.hashCode() : i4, obj, x, i2 + 5, persistentHashMapBuilder);
                    if (persistentHashMapBuilder.size() == size) {
                        deltaCounter.f14278a++;
                    }
                    i3 = lowestOneBit2;
                }
                objArr = objArr4;
                i3 = lowestOneBit2;
            } else {
                objArr = objArr4;
                i3 = lowestOneBit2;
                if (trieNode.i(i3)) {
                    j2 = trieNode.s(trieNode.t(i3));
                    if (h(i3)) {
                        int f3 = f(i3);
                        Object obj2 = this.d[f3];
                        int i16 = i2 + 5;
                        if (j2.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                            deltaCounter.f14278a++;
                        } else {
                            j2 = j2.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f3), i16, persistentHashMapBuilder);
                        }
                    }
                } else {
                    int f4 = f(i3);
                    Object obj3 = this.d[f4];
                    Object x2 = x(f4);
                    int f5 = trieNode.f(i3);
                    Object obj4 = trieNode.d[f5];
                    j2 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x2, obj4 != null ? obj4.hashCode() : 0, obj4, trieNode.x(f5), i2 + 5, persistentHashMapBuilder.f14201b);
                }
            }
            objArr[length2] = j2;
            i15++;
            i14 ^= i3;
            i4 = 0;
        }
        int i17 = 0;
        while (i13 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i13);
            int i18 = i17 * 2;
            if (trieNode.h(lowestOneBit3)) {
                int f6 = trieNode.f(lowestOneBit3);
                Object[] objArr5 = trieNode2.d;
                objArr5[i18] = trieNode.d[f6];
                objArr5[i18 + 1] = trieNode.x(f6);
                if (h(lowestOneBit3)) {
                    deltaCounter.f14278a++;
                }
            } else {
                int f7 = f(lowestOneBit3);
                Object[] objArr6 = trieNode2.d;
                objArr6[i18] = this.d[f7];
                objArr6[i18 + 1] = x(f7);
            }
            i17++;
            i13 ^= lowestOneBit3;
        }
        return e(trieNode2) ? this : trieNode.e(trieNode2) ? trieNode : trieNode2;
    }

    public final TrieNode n(int i2, Object obj, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode n2;
        int d = 1 << TrieNodeKt.d(i2, i3);
        if (h(d)) {
            int f2 = f(d);
            return a.g(obj, this.d[f2]) ? p(f2, d, persistentHashMapBuilder) : this;
        }
        if (!i(d)) {
            return this;
        }
        int t2 = t(d);
        TrieNode s2 = s(t2);
        if (i3 == 30) {
            e y02 = a.y0(a.F0(0, s2.d.length), 2);
            int i4 = y02.f31406a;
            int i5 = y02.f31407b;
            int i6 = y02.f31408c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (!a.g(obj, s2.d[i4])) {
                    if (i4 != i5) {
                        i4 += i6;
                    }
                }
                n2 = s2.k(i4, persistentHashMapBuilder);
            }
            n2 = s2;
            break;
        }
        n2 = s2.n(i2, obj, i3 + 5, persistentHashMapBuilder);
        return q(s2, n2, t2, d, persistentHashMapBuilder.f14201b);
    }

    public final TrieNode o(int i2, Object obj, Object obj2, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNode o2;
        int d = 1 << TrieNodeKt.d(i2, i3);
        if (h(d)) {
            int f2 = f(d);
            return (a.g(obj, this.d[f2]) && a.g(obj2, x(f2))) ? p(f2, d, persistentHashMapBuilder) : this;
        }
        if (!i(d)) {
            return this;
        }
        int t2 = t(d);
        TrieNode s2 = s(t2);
        if (i3 == 30) {
            e y02 = a.y0(a.F0(0, s2.d.length), 2);
            int i4 = y02.f31406a;
            int i5 = y02.f31407b;
            int i6 = y02.f31408c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!a.g(obj, s2.d[i4]) || !a.g(obj2, s2.x(i4))) {
                        if (i4 == i5) {
                            break;
                        }
                        i4 += i6;
                    } else {
                        o2 = s2.k(i4, persistentHashMapBuilder);
                        break;
                    }
                }
            }
            o2 = s2;
        } else {
            o2 = s2.o(i2, obj, obj2, i3 + 5, persistentHashMapBuilder);
        }
        return q(s2, o2, t2, d, persistentHashMapBuilder.f14201b);
    }

    public final TrieNode p(int i2, int i3, PersistentHashMapBuilder persistentHashMapBuilder) {
        persistentHashMapBuilder.g(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.d = x(i2);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f14217c != persistentHashMapBuilder.f14201b) {
            return new TrieNode(i3 ^ this.f14215a, this.f14216b, TrieNodeKt.b(i2, objArr), persistentHashMapBuilder.f14201b);
        }
        this.d = TrieNodeKt.b(i2, objArr);
        this.f14215a ^= i3;
        return this;
    }

    public final TrieNode q(TrieNode trieNode, TrieNode trieNode2, int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.f14217c;
        if (trieNode2 == null) {
            Object[] objArr = this.d;
            if (objArr.length == 1) {
                return null;
            }
            if (mutabilityOwnership2 != mutabilityOwnership) {
                return new TrieNode(this.f14215a, i3 ^ this.f14216b, TrieNodeKt.c(i2, objArr), mutabilityOwnership);
            }
            this.d = TrieNodeKt.c(i2, objArr);
            this.f14216b ^= i3;
        } else if (mutabilityOwnership2 == mutabilityOwnership || trieNode != trieNode2) {
            return r(i2, trieNode2, mutabilityOwnership);
        }
        return this;
    }

    public final TrieNode r(int i2, TrieNode trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && trieNode.d.length == 2 && trieNode.f14216b == 0) {
            trieNode.f14215a = this.f14216b;
            return trieNode;
        }
        if (this.f14217c == mutabilityOwnership) {
            objArr[i2] = trieNode;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        a.r(copyOf, "copyOf(this, size)");
        copyOf[i2] = trieNode;
        return new TrieNode(this.f14215a, this.f14216b, copyOf, mutabilityOwnership);
    }

    public final TrieNode s(int i2) {
        Object obj = this.d[i2];
        a.q(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int t(int i2) {
        return (this.d.length - 1) - Integer.bitCount((i2 - 1) & this.f14216b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult u(int r12, java.lang.Object r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.u(int, java.lang.Object, java.lang.Object, int):androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode$ModificationResult");
    }

    public final TrieNode v(int i2, int i3, Object obj) {
        TrieNode v2;
        int d = 1 << TrieNodeKt.d(i2, i3);
        if (h(d)) {
            int f2 = f(d);
            if (!a.g(obj, this.d[f2])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length == 2) {
                return null;
            }
            return new TrieNode(this.f14215a ^ d, this.f14216b, TrieNodeKt.b(f2, objArr), null);
        }
        if (!i(d)) {
            return this;
        }
        int t2 = t(d);
        TrieNode s2 = s(t2);
        if (i3 == 30) {
            e y02 = a.y0(a.F0(0, s2.d.length), 2);
            int i4 = y02.f31406a;
            int i5 = y02.f31407b;
            int i6 = y02.f31408c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (!a.g(obj, s2.d[i4])) {
                    if (i4 != i5) {
                        i4 += i6;
                    }
                }
                Object[] objArr2 = s2.d;
                v2 = objArr2.length == 2 ? null : new TrieNode(0, 0, TrieNodeKt.b(i4, objArr2), null);
            }
            v2 = s2;
            break;
        }
        v2 = s2.v(i2, i3 + 5, obj);
        if (v2 != null) {
            return s2 != v2 ? w(t2, d, v2) : this;
        }
        Object[] objArr3 = this.d;
        if (objArr3.length == 1) {
            return null;
        }
        return new TrieNode(this.f14215a, d ^ this.f14216b, TrieNodeKt.c(t2, objArr3), null);
    }

    public final TrieNode w(int i2, int i3, TrieNode trieNode) {
        Object[] objArr = trieNode.d;
        if (objArr.length != 2 || trieNode.f14216b != 0) {
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            a.r(copyOf, "copyOf(this, newSize)");
            copyOf[i2] = trieNode;
            return new TrieNode(this.f14215a, this.f14216b, copyOf, null);
        }
        if (this.d.length == 1) {
            trieNode.f14215a = this.f14216b;
            return trieNode;
        }
        int f2 = f(i3);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        a.r(copyOf2, "copyOf(this, newSize)");
        q.P(i2 + 2, i2 + 1, copyOf2, objArr3.length, copyOf2);
        q.P(f2 + 2, f2, copyOf2, i2, copyOf2);
        copyOf2[f2] = obj;
        copyOf2[f2 + 1] = obj2;
        return new TrieNode(this.f14215a ^ i3, i3 ^ this.f14216b, copyOf2, null);
    }

    public final Object x(int i2) {
        return this.d[i2 + 1];
    }
}
