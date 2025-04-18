package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.q;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ScopeMap<Key, Scope> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableScatterMap f14161a = ScatterMapKt.d();

    public final void a(Object obj, Object obj2) {
        MutableScatterMap mutableScatterMap = this.f14161a;
        int g2 = mutableScatterMap.g(obj);
        boolean z2 = g2 < 0;
        Object obj3 = z2 ? null : mutableScatterMap.f1559c[g2];
        if (obj3 != null) {
            if (obj3 instanceof MutableScatterSet) {
                ((MutableScatterSet) obj3).d(obj2);
            } else if (obj3 != obj2) {
                MutableScatterSet mutableScatterSet = new MutableScatterSet();
                mutableScatterSet.d(obj3);
                mutableScatterSet.d(obj2);
                obj2 = mutableScatterSet;
            }
            obj2 = obj3;
        }
        if (!z2) {
            mutableScatterMap.f1559c[g2] = obj2;
            return;
        }
        int i2 = ~g2;
        mutableScatterMap.f1558b[i2] = obj;
        mutableScatterMap.f1559c[i2] = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7, types: [androidx.collection.ScatterSet$SetWrapper] */
    public final HashMap b() {
        LinkedHashSet linkedHashSet;
        HashMap hashMap = new HashMap();
        MutableScatterMap mutableScatterMap = this.f14161a;
        Object[] objArr = mutableScatterMap.f1558b;
        Object[] objArr2 = mutableScatterMap.f1559c;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            a.q(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4");
                            if (obj2 instanceof MutableScatterSet) {
                                a.q(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4>");
                                linkedHashSet = new ScatterSet.SetWrapper();
                            } else {
                                a.q(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4");
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet(q.g(1));
                                e0.q.j0(linkedHashSet2, new Object[]{obj2});
                                linkedHashSet = linkedHashSet2;
                            }
                            hashMap.put(obj, linkedHashSet);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return hashMap;
    }

    public final boolean c(Object obj, Object obj2) {
        MutableScatterMap mutableScatterMap = this.f14161a;
        Object c2 = mutableScatterMap.c(obj);
        if (c2 == null) {
            return false;
        }
        if (!(c2 instanceof MutableScatterSet)) {
            if (!a.g(c2, obj2)) {
                return false;
            }
            mutableScatterMap.i(obj);
            return true;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) c2;
        boolean k2 = mutableScatterSet.k(obj2);
        if (k2 && mutableScatterSet.b()) {
            mutableScatterMap.i(obj);
        }
        return k2;
    }

    public final void d(Object obj) {
        MutableScatterMap mutableScatterMap = this.f14161a;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj2 = mutableScatterMap.f1558b[i5];
                        Object obj3 = mutableScatterMap.f1559c[i5];
                        if (obj3 instanceof MutableScatterSet) {
                            a.q(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
                            mutableScatterSet.k(obj);
                            if (!mutableScatterSet.b()) {
                            }
                            mutableScatterMap.j(i5);
                        } else {
                            if (obj3 != obj) {
                            }
                            mutableScatterMap.j(i5);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }
}
