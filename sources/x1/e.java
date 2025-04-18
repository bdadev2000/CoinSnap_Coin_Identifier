package x1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class e {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27341b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27342c;

    /* renamed from: d, reason: collision with root package name */
    public final List f27343d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public e(String name, List columns, List orders, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.a = name;
        this.f27341b = z10;
        this.f27342c = columns;
        this.f27343d = orders;
        List list = orders;
        if (list.isEmpty()) {
            int size = columns.size();
            list = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                list.add("ASC");
            }
        }
        this.f27343d = (List) list;
    }

    public final boolean equals(Object obj) {
        boolean startsWith$default;
        boolean startsWith$default2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f27341b != eVar.f27341b || !Intrinsics.areEqual(this.f27342c, eVar.f27342c) || !Intrinsics.areEqual(this.f27343d, eVar.f27343d)) {
            return false;
        }
        String str = this.a;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "index_", false, 2, null);
        String str2 = eVar.a;
        if (startsWith$default) {
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str2, "index_", false, 2, null);
            return startsWith$default2;
        }
        return Intrinsics.areEqual(str, str2);
    }

    public final int hashCode() {
        boolean startsWith$default;
        int hashCode;
        String str = this.a;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "index_", false, 2, null);
        if (startsWith$default) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.f27343d.hashCode() + vd.e.d(this.f27342c, ((hashCode * 31) + (this.f27341b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.f27341b + ", columns=" + this.f27342c + ", orders=" + this.f27343d + "'}";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(java.lang.String r6, java.util.List r7) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "columns"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L15:
            if (r3 >= r0) goto L1f
            java.lang.String r4 = "ASC"
            r1.add(r4)
            int r3 = r3 + 1
            goto L15
        L1f:
            r5.<init>(r6, r7, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.e.<init>(java.lang.String, java.util.List):void");
    }
}
