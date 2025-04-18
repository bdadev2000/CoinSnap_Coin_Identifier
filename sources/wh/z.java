package wh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes5.dex */
public final class z implements Iterable, KMappedMarker {

    /* renamed from: b, reason: collision with root package name */
    public final String[] f27243b;

    public z(String[] strArr) {
        this.f27243b = strArr;
    }

    public final String a(String name) {
        boolean equals;
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f27243b;
        int length = strArr.length - 2;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
        if (progressionLastElement <= length) {
            while (true) {
                int i10 = length - 2;
                equals = StringsKt__StringsJVMKt.equals(name, strArr[length], true);
                if (equals) {
                    return strArr[length + 1];
                }
                if (length == progressionLastElement) {
                    break;
                }
                length = i10;
            }
        }
        return null;
    }

    public final String b(int i10) {
        return this.f27243b[i10 * 2];
    }

    public final a4.s c() {
        a4.s sVar = new a4.s();
        CollectionsKt__MutableCollectionsKt.addAll(sVar.a, this.f27243b);
        return sVar;
    }

    public final String d(int i10) {
        return this.f27243b[(i10 * 2) + 1];
    }

    public final List e(String name) {
        boolean equals;
        Intrinsics.checkNotNullParameter(name, "name");
        int length = this.f27243b.length / 2;
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            equals = StringsKt__StringsJVMKt.equals(name, b(i10), true);
            if (equals) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(d(i10));
            }
            i10 = i11;
        }
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            return unmodifiableList;
        }
        return CollectionsKt.emptyList();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            if (Arrays.equals(this.f27243b, ((z) obj).f27243b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27243b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int length = this.f27243b.length / 2;
        Pair[] pairArr = new Pair[length];
        for (int i10 = 0; i10 < length; i10++) {
            pairArr[i10] = TuplesKt.to(b(i10), d(i10));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int length = this.f27243b.length / 2;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            String b3 = b(i10);
            String d10 = d(i10);
            sb2.append(b3);
            sb2.append(": ");
            if (xh.b.p(b3)) {
                d10 = "██";
            }
            sb2.append(d10);
            sb2.append("\n");
            i10 = i11;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
