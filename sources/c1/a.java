package c1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import n0.l1;

/* loaded from: classes.dex */
public final class a extends g {
    public final Map a;

    /* renamed from: b, reason: collision with root package name */
    public final v3.c f2520b;

    public /* synthetic */ a(boolean z10) {
        this(new LinkedHashMap(), z10);
    }

    @Override // c1.g
    public final Map a() {
        int collectionSizeOrDefault;
        Pair pair;
        Set<Map.Entry> entrySet = this.a.entrySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
        LinkedHashMap map = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(collectionSizeOrDefault), 16));
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                pair = new Pair(key, copyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            map.put(pair.getFirst(), pair.getSecond());
        }
        Intrinsics.checkNotNullParameter(map, "map");
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    @Override // c1.g
    public final Object b(e key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.a.get(key);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            return copyOf;
        }
        return obj;
    }

    public final void c() {
        if (!((AtomicBoolean) this.f2520b.f26021c).get()) {
        } else {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void d(e key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        c();
        Map map = this.a;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(key, "key");
            c();
            map.remove(key);
        } else {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                Intrinsics.checkNotNullParameter(set, "set");
                Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.toSet(set));
                Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(set.toSet())");
                map.put(key, unmodifiableSet);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                map.put(key, copyOf);
                return;
            }
            map.put(key, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:16:0x002d->B:31:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof c1.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            c1.a r7 = (c1.a) r7
            java.util.Map r0 = r7.a
            java.util.Map r2 = r6.a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            int r4 = r2.size()
            if (r0 == r4) goto L1b
            return r1
        L1b:
            java.util.Map r7 = r7.a
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L25
        L23:
            r1 = r3
            goto L63
        L25:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r4 = r2.get(r4)
            if (r4 == 0) goto L60
            java.lang.Object r0 = r0.getValue()
            boolean r5 = r0 instanceof byte[]
            if (r5 == 0) goto L5b
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L60
            byte[] r0 = (byte[]) r0
            byte[] r4 = (byte[]) r4
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L60
            r0 = r3
            goto L61
        L5b:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            goto L61
        L60:
            r0 = r1
        L61:
            if (r0 != 0) goto L2d
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        Iterator it = this.a.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i10 += hashCode;
        }
        return i10;
    }

    public final String toString() {
        String joinToString$default;
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.a.entrySet(), ",\n", "{\n", "\n}", 0, null, l1.f22310f, 24, null);
        return joinToString$default;
    }

    public a(Map preferencesMap, boolean z10) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.a = preferencesMap;
        this.f2520b = new v3.c(z10);
    }
}
