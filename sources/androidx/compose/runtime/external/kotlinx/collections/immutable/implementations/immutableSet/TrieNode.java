package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.q;
import java.util.Arrays;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TrieNode<E> {
    public static final TrieNode d = new TrieNode(0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f14235a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f14236b;

    /* renamed from: c, reason: collision with root package name */
    public final MutabilityOwnership f14237c;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public TrieNode(int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.f14235a = i2;
        this.f14236b = objArr;
        this.f14237c = mutabilityOwnership;
    }

    public static TrieNode h(int i2, Object obj, int i3, Object obj2, int i4, MutabilityOwnership mutabilityOwnership) {
        if (i4 > 30) {
            return new TrieNode(0, new Object[]{obj, obj2}, mutabilityOwnership);
        }
        int c2 = TrieNodeKt.c(i2, i4);
        int c3 = TrieNodeKt.c(i3, i4);
        if (c2 != c3) {
            return new TrieNode((1 << c2) | (1 << c3), c2 < c3 ? new Object[]{obj, obj2} : new Object[]{obj2, obj}, mutabilityOwnership);
        }
        return new TrieNode(1 << c2, new Object[]{h(i2, obj, i3, obj2, i4 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    public final TrieNode a(int i2, int i3, Object obj) {
        int c2 = 1 << TrieNodeKt.c(i2, i3);
        if (f(c2)) {
            return new TrieNode(this.f14235a | c2, TrieNodeKt.a(obj, this.f14236b, g(c2)), null);
        }
        int g2 = g(c2);
        Object obj2 = this.f14236b[g2];
        if (obj2 instanceof TrieNode) {
            TrieNode p2 = p(g2);
            TrieNode trieNode = i3 == 30 ? q.N(p2.f14236b, obj) ? p2 : new TrieNode(0, TrieNodeKt.a(obj, p2.f14236b, 0), null) : p2.a(i2, i3 + 5, obj);
            return p2 == trieNode ? this : r(g2, trieNode);
        }
        if (a.g(obj, obj2)) {
            return this;
        }
        Object[] objArr = this.f14236b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        a.r(copyOf, "copyOf(this, size)");
        copyOf[g2] = i(g2, i2, obj, i3, null);
        return new TrieNode(this.f14235a, copyOf, null);
    }

    public final int b() {
        if (this.f14235a == 0) {
            return this.f14236b.length;
        }
        int i2 = 0;
        for (Object obj : this.f14236b) {
            i2 += obj instanceof TrieNode ? ((TrieNode) obj).b() : 1;
        }
        return i2;
    }

    public final boolean c(int i2, int i3, Object obj) {
        int c2 = 1 << TrieNodeKt.c(i2, i3);
        if (f(c2)) {
            return false;
        }
        int g2 = g(c2);
        Object obj2 = this.f14236b[g2];
        if (!(obj2 instanceof TrieNode)) {
            return a.g(obj, obj2);
        }
        TrieNode p2 = p(g2);
        return i3 == 30 ? q.N(p2.f14236b, obj) : p2.c(i2, i3 + 5, obj);
    }

    public final boolean d(int i2, TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (i2 > 30) {
            for (Object obj : trieNode.f14236b) {
                if (!q.N(this.f14236b, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i3 = this.f14235a;
        int i4 = trieNode.f14235a;
        int i5 = i3 & i4;
        if (i5 != i4) {
            return false;
        }
        while (i5 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i5);
            int g2 = g(lowestOneBit);
            int g3 = trieNode.g(lowestOneBit);
            Object obj2 = this.f14236b[g2];
            Object obj3 = trieNode.f14236b[g3];
            boolean z2 = obj2 instanceof TrieNode;
            boolean z3 = obj3 instanceof TrieNode;
            if (z2 && z3) {
                a.q(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                a.q(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).d(i2 + 5, (TrieNode) obj3)) {
                    return false;
                }
            } else if (z2) {
                a.q(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).c(obj3 != null ? obj3.hashCode() : 0, i2 + 5, obj3)) {
                    return false;
                }
            } else if (z3 || !a.g(obj2, obj3)) {
                return false;
            }
            i5 ^= lowestOneBit;
        }
        return true;
    }

    public final boolean e(TrieNode trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.f14235a != trieNode.f14235a) {
            return false;
        }
        int length = this.f14236b.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f14236b[i2] != trieNode.f14236b[i2]) {
                return false;
            }
        }
        return true;
    }

    public final boolean f(int i2) {
        return (i2 & this.f14235a) == 0;
    }

    public final int g(int i2) {
        return Integer.bitCount((i2 - 1) & this.f14235a);
    }

    public final TrieNode i(int i2, int i3, Object obj, int i4, MutabilityOwnership mutabilityOwnership) {
        Object obj2 = this.f14236b[i2];
        return h(obj2 != null ? obj2.hashCode() : 0, obj2, i3, obj, i4 + 5, mutabilityOwnership);
    }

    public final TrieNode j(int i2, Object obj, int i3, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode j2;
        int c2 = 1 << TrieNodeKt.c(i2, i3);
        boolean f2 = f(c2);
        MutabilityOwnership mutabilityOwnership = this.f14237c;
        if (f2) {
            persistentHashSetBuilder.d(persistentHashSetBuilder.b() + 1);
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.f14226b;
            int g2 = g(c2);
            if (mutabilityOwnership != mutabilityOwnership2) {
                return new TrieNode(this.f14235a | c2, TrieNodeKt.a(obj, this.f14236b, g2), mutabilityOwnership2);
            }
            this.f14236b = TrieNodeKt.a(obj, this.f14236b, g2);
            this.f14235a |= c2;
            return this;
        }
        int g3 = g(c2);
        Object obj2 = this.f14236b[g3];
        if (obj2 instanceof TrieNode) {
            TrieNode p2 = p(g3);
            if (i3 == 30) {
                if (!q.N(p2.f14236b, obj)) {
                    persistentHashSetBuilder.d(persistentHashSetBuilder.b() + 1);
                    if (p2.f14237c == persistentHashSetBuilder.f14226b) {
                        p2.f14236b = TrieNodeKt.a(obj, p2.f14236b, 0);
                    } else {
                        j2 = new TrieNode(0, TrieNodeKt.a(obj, p2.f14236b, 0), persistentHashSetBuilder.f14226b);
                    }
                }
                j2 = p2;
            } else {
                j2 = p2.j(i2, obj, i3 + 5, persistentHashSetBuilder);
            }
            return p2 == j2 ? this : o(g3, j2, persistentHashSetBuilder.f14226b);
        }
        if (a.g(obj, obj2)) {
            return this;
        }
        persistentHashSetBuilder.d(persistentHashSetBuilder.b() + 1);
        MutabilityOwnership mutabilityOwnership3 = persistentHashSetBuilder.f14226b;
        if (mutabilityOwnership == mutabilityOwnership3) {
            this.f14236b[g3] = i(g3, i2, obj, i3, mutabilityOwnership3);
            return this;
        }
        Object[] objArr = this.f14236b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        a.r(copyOf, "copyOf(this, size)");
        copyOf[g3] = i(g3, i2, obj, i3, mutabilityOwnership3);
        return new TrieNode(this.f14235a, copyOf, mutabilityOwnership3);
    }

    public final TrieNode k(TrieNode trieNode, int i2, DeltaCounter deltaCounter, PersistentHashSetBuilder persistentHashSetBuilder) {
        Object h2;
        if (this == trieNode) {
            deltaCounter.f14278a = b() + deltaCounter.f14278a;
            return this;
        }
        MutabilityOwnership mutabilityOwnership = this.f14237c;
        if (i2 > 30) {
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.f14226b;
            if (this == trieNode) {
                deltaCounter.a(this.f14236b.length);
            } else {
                Object[] objArr = this.f14236b;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.f14236b.length);
                a.r(copyOf, "copyOf(this, newSize)");
                Object[] objArr2 = trieNode.f14236b;
                int length = this.f14236b.length;
                int i3 = 0;
                for (int i4 = 0; i4 < objArr2.length; i4++) {
                    if (!q.N(this.f14236b, objArr2[i4])) {
                        copyOf[length + i3] = objArr2[i4];
                        i3++;
                    }
                }
                int length2 = i3 + this.f14236b.length;
                deltaCounter.a(copyOf.length - length2);
                if (length2 != this.f14236b.length) {
                    if (length2 == trieNode.f14236b.length) {
                        return trieNode;
                    }
                    if (length2 != copyOf.length) {
                        copyOf = Arrays.copyOf(copyOf, length2);
                        a.r(copyOf, "copyOf(this, newSize)");
                    }
                    if (!a.g(mutabilityOwnership, mutabilityOwnership2)) {
                        return new TrieNode(0, copyOf, mutabilityOwnership2);
                    }
                    this.f14236b = copyOf;
                }
            }
            return this;
        }
        int i5 = this.f14235a;
        int i6 = trieNode.f14235a | i5;
        TrieNode trieNode2 = (i6 == i5 && a.g(mutabilityOwnership, persistentHashSetBuilder.f14226b)) ? this : new TrieNode(i6, new Object[Integer.bitCount(i6)], persistentHashSetBuilder.f14226b);
        int i7 = 0;
        while (i6 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i6);
            int g2 = g(lowestOneBit);
            int g3 = trieNode.g(lowestOneBit);
            Object[] objArr3 = trieNode2.f14236b;
            if (f(lowestOneBit)) {
                h2 = trieNode.f14236b[g3];
            } else if (trieNode.f(lowestOneBit)) {
                h2 = this.f14236b[g2];
            } else {
                Object obj = this.f14236b[g2];
                Object obj2 = trieNode.f14236b[g3];
                boolean z2 = obj instanceof TrieNode;
                boolean z3 = obj2 instanceof TrieNode;
                if (z2 && z3) {
                    a.q(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    a.q(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    h2 = ((TrieNode) obj).k((TrieNode) obj2, i2 + 5, deltaCounter, persistentHashSetBuilder);
                } else if (z2) {
                    a.q(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    TrieNode trieNode3 = (TrieNode) obj;
                    int i8 = persistentHashSetBuilder.f14228f;
                    h2 = trieNode3.j(obj2 != null ? obj2.hashCode() : 0, obj2, i2 + 5, persistentHashSetBuilder);
                    if (persistentHashSetBuilder.f14228f == i8) {
                        deltaCounter.f14278a++;
                    }
                } else if (z3) {
                    a.q(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    TrieNode trieNode4 = (TrieNode) obj2;
                    int i9 = persistentHashSetBuilder.f14228f;
                    h2 = trieNode4.j(obj != null ? obj.hashCode() : 0, obj, i2 + 5, persistentHashSetBuilder);
                    if (persistentHashSetBuilder.f14228f == i9) {
                        deltaCounter.f14278a++;
                    }
                } else if (a.g(obj, obj2)) {
                    deltaCounter.f14278a++;
                    h2 = obj;
                } else {
                    h2 = h(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, i2 + 5, persistentHashSetBuilder.f14226b);
                }
            }
            objArr3[i7] = h2;
            i7++;
            i6 ^= lowestOneBit;
        }
        return e(trieNode2) ? this : trieNode.e(trieNode2) ? trieNode : trieNode2;
    }

    public final TrieNode l(int i2, Object obj, int i3, PersistentHashSetBuilder persistentHashSetBuilder) {
        TrieNode l2;
        int c2 = 1 << TrieNodeKt.c(i2, i3);
        if (f(c2)) {
            return this;
        }
        int g2 = g(c2);
        Object obj2 = this.f14236b[g2];
        boolean z2 = obj2 instanceof TrieNode;
        MutabilityOwnership mutabilityOwnership = this.f14237c;
        if (!z2) {
            if (!a.g(obj, obj2)) {
                return this;
            }
            persistentHashSetBuilder.d(persistentHashSetBuilder.b() - 1);
            MutabilityOwnership mutabilityOwnership2 = persistentHashSetBuilder.f14226b;
            if (mutabilityOwnership != mutabilityOwnership2) {
                return new TrieNode(this.f14235a ^ c2, TrieNodeKt.b(g2, this.f14236b), mutabilityOwnership2);
            }
            this.f14236b = TrieNodeKt.b(g2, this.f14236b);
            this.f14235a ^= c2;
            return this;
        }
        TrieNode p2 = p(g2);
        if (i3 == 30) {
            int d02 = q.d0(p2.f14236b, obj);
            if (d02 != -1) {
                persistentHashSetBuilder.d(persistentHashSetBuilder.b() - 1);
                MutabilityOwnership mutabilityOwnership3 = persistentHashSetBuilder.f14226b;
                if (p2.f14237c == mutabilityOwnership3) {
                    p2.f14236b = TrieNodeKt.b(d02, p2.f14236b);
                } else {
                    l2 = new TrieNode(0, TrieNodeKt.b(d02, p2.f14236b), mutabilityOwnership3);
                }
            }
            l2 = p2;
        } else {
            l2 = p2.l(i2, obj, i3 + 5, persistentHashSetBuilder);
        }
        MutabilityOwnership mutabilityOwnership4 = persistentHashSetBuilder.f14226b;
        return (mutabilityOwnership == mutabilityOwnership4 || p2 != l2) ? o(g2, l2, mutabilityOwnership4) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0105, code lost:
    
        if ((r14 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r17, int r18, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r19, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder r20) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.m(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode r18, int r19, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r20, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder r21) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.n(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final TrieNode o(int i2, TrieNode trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r02 = trieNode.f14236b;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof TrieNode)) {
                if (this.f14236b.length == 1) {
                    trieNode.f14235a = this.f14235a;
                    return trieNode;
                }
                trieNode = r03;
            }
        }
        if (this.f14237c == mutabilityOwnership) {
            this.f14236b[i2] = trieNode;
            return this;
        }
        Object[] objArr = this.f14236b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        a.r(copyOf, "copyOf(this, size)");
        copyOf[i2] = trieNode;
        return new TrieNode(this.f14235a, copyOf, mutabilityOwnership);
    }

    public final TrieNode p(int i2) {
        Object obj = this.f14236b[i2];
        a.q(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    public final TrieNode q(int i2, int i3, Object obj) {
        TrieNode q2;
        int c2 = 1 << TrieNodeKt.c(i2, i3);
        if (f(c2)) {
            return this;
        }
        int g2 = g(c2);
        Object obj2 = this.f14236b[g2];
        if (!(obj2 instanceof TrieNode)) {
            if (a.g(obj, obj2)) {
                return new TrieNode(this.f14235a ^ c2, TrieNodeKt.b(g2, this.f14236b), null);
            }
            return this;
        }
        TrieNode p2 = p(g2);
        if (i3 == 30) {
            int d02 = q.d0(p2.f14236b, obj);
            q2 = d02 != -1 ? new TrieNode(0, TrieNodeKt.b(d02, p2.f14236b), null) : p2;
        } else {
            q2 = p2.q(i2, i3 + 5, obj);
        }
        return p2 == q2 ? this : r(g2, q2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final TrieNode r(int i2, TrieNode trieNode) {
        ?? r02 = trieNode.f14236b;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof TrieNode)) {
                if (this.f14236b.length == 1) {
                    trieNode.f14235a = this.f14235a;
                    return trieNode;
                }
                trieNode = r03;
            }
        }
        Object[] objArr = this.f14236b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        a.r(copyOf, "copyOf(this, size)");
        copyOf[i2] = trieNode;
        return new TrieNode(this.f14235a, copyOf, null);
    }
}
