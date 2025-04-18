package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import p0.a;

/* loaded from: classes.dex */
public final class AnnotatedStringKt {

    /* renamed from: a, reason: collision with root package name */
    public static final AnnotatedString f16893a = new AnnotatedString("", null, 6);

    public static final ArrayList a(int i2, int i3, List list) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("start (" + i2 + ") should be less than or equal to end (" + i3 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            AnnotatedString.Range range = (AnnotatedString.Range) obj;
            if (c(i2, i3, range.f16891b, range.f16892c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range2 = (AnnotatedString.Range) arrayList.get(i5);
            arrayList2.add(new AnnotatedString.Range(range2.f16890a, range2.d, Math.max(i2, range2.f16891b) - i2, Math.min(i3, range2.f16892c) - i2));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final List b(AnnotatedString annotatedString, int i2, int i3) {
        List list;
        if (i2 == i3 || (list = annotatedString.f16881b) == null) {
            return null;
        }
        if (i2 == 0 && i3 >= annotatedString.f16880a.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            AnnotatedString.Range range = (AnnotatedString.Range) obj;
            if (c(i2, i3, range.f16891b, range.f16892c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range2 = (AnnotatedString.Range) arrayList.get(i5);
            arrayList2.add(new AnnotatedString.Range(a.A(range2.f16891b, i2, i3) - i2, a.A(range2.f16892c, i2, i3) - i2, range2.f16890a));
        }
        return arrayList2;
    }

    public static final boolean c(int i2, int i3, int i4, int i5) {
        if (Math.max(i2, i4) < Math.min(i3, i5)) {
            return true;
        }
        if (i2 <= i4 && i5 <= i3) {
            if (i3 != i5) {
                return true;
            }
            if ((i4 == i5) == (i2 == i3)) {
                return true;
            }
        }
        if (i4 <= i2 && i3 <= i5) {
            if (i5 != i3) {
                return true;
            }
            if ((i2 == i3) == (i4 == i5)) {
                return true;
            }
        }
        return false;
    }
}
