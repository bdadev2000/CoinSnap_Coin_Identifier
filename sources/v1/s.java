package v1;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class s {
    public final r a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f25934b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f25935c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f25936d;

    public s(r observer, int[] tableIds, String[] tableNames) {
        boolean z10;
        Set emptySet;
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.a = observer;
        this.f25934b = tableIds;
        this.f25935c = tableNames;
        if (tableNames.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            emptySet = SetsKt.setOf(tableNames[0]);
        } else {
            emptySet = SetsKt.emptySet();
        }
        this.f25936d = emptySet;
        if (tableIds.length == tableNames.length) {
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final void a(Set invalidatedTablesIds) {
        Set emptySet;
        Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.f25934b;
        int length = iArr.length;
        if (length != 0) {
            int i10 = 0;
            if (length != 1) {
                Set createSetBuilder = SetsKt.createSetBuilder();
                int length2 = iArr.length;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = i11 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i10]))) {
                        createSetBuilder.add(this.f25935c[i11]);
                    }
                    i10++;
                    i11 = i12;
                }
                emptySet = SetsKt.build(createSetBuilder);
            } else if (invalidatedTablesIds.contains(Integer.valueOf(iArr[0]))) {
                emptySet = this.f25936d;
            } else {
                emptySet = SetsKt.emptySet();
            }
        } else {
            emptySet = SetsKt.emptySet();
        }
        if (!emptySet.isEmpty()) {
            this.a.b(emptySet);
        }
    }

    public final void b(String[] tables) {
        Set emptySet;
        boolean equals;
        boolean equals2;
        Intrinsics.checkNotNullParameter(tables, "tables");
        String[] strArr = this.f25935c;
        int length = strArr.length;
        if (length != 0) {
            boolean z10 = false;
            if (length != 1) {
                Set createSetBuilder = SetsKt.createSetBuilder();
                for (String str : tables) {
                    for (String str2 : strArr) {
                        equals2 = StringsKt__StringsJVMKt.equals(str2, str, true);
                        if (equals2) {
                            createSetBuilder.add(str2);
                        }
                    }
                }
                emptySet = SetsKt.build(createSetBuilder);
            } else {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        break;
                    }
                    equals = StringsKt__StringsJVMKt.equals(tables[i10], strArr[0], true);
                    if (equals) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                if (z10) {
                    emptySet = this.f25936d;
                } else {
                    emptySet = SetsKt.emptySet();
                }
            }
        } else {
            emptySet = SetsKt.emptySet();
        }
        if (!emptySet.isEmpty()) {
            this.a.b(emptySet);
        }
    }
}
