package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.List;
import p0.a;

@Immutable
/* loaded from: classes3.dex */
public final class AnnotatedString implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final String f16880a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16881b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16882c;
    public final List d;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    static {
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16951a;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Comparator] */
    public AnnotatedString(String str, List list, List list2, List list3) {
        this.f16880a = str;
        this.f16881b = list;
        this.f16882c = list2;
        this.d = list3;
        if (list2 != null) {
            List T0 = u.T0(list2, new Object());
            int size = T0.size();
            int i2 = -1;
            int i3 = 0;
            while (i3 < size) {
                Range range = (Range) T0.get(i3);
                if (range.f16891b >= i2) {
                    int length = this.f16880a.length();
                    int i4 = range.f16892c;
                    if (i4 > length) {
                        throw new IllegalArgumentException(("ParagraphStyle range [" + range.f16891b + ", " + i4 + ") is out of boundary").toString());
                    }
                    i3++;
                    i2 = i4;
                } else {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
            }
        }
    }

    public final List a(int i2) {
        List list = this.d;
        if (list == null) {
            return w.f30218a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            Range range = (Range) obj;
            if ((range.f16890a instanceof LinkAnnotation) && AnnotatedStringKt.c(0, i2, range.f16891b, range.f16892c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List b() {
        List list = this.f16881b;
        return list == null ? w.f30218a : list;
    }

    @Override // java.lang.CharSequence
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AnnotatedString subSequence(int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("start (" + i2 + ") should be less or equal to end (" + i3 + ')').toString());
        }
        String str = this.f16880a;
        if (i2 == 0 && i3 == str.length()) {
            return this;
        }
        String substring = str.substring(i2, i3);
        a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new AnnotatedString(substring, AnnotatedStringKt.a(i2, i3, this.f16881b), AnnotatedStringKt.a(i2, i3, this.f16882c), AnnotatedStringKt.a(i2, i3, this.d));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f16880a.charAt(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return a.g(this.f16880a, annotatedString.f16880a) && a.g(this.f16881b, annotatedString.f16881b) && a.g(this.f16882c, annotatedString.f16882c) && a.g(this.d, annotatedString.d);
    }

    public final int hashCode() {
        int hashCode = this.f16880a.hashCode() * 31;
        List list = this.f16881b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f16882c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.d;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f16880a.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f16880a;
    }

    @Immutable
    /* loaded from: classes3.dex */
    public static final class Range<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f16890a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16891b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16892c;
        public final String d;

        public Range(Object obj, String str, int i2, int i3) {
            this.f16890a = obj;
            this.f16891b = i2;
            this.f16892c = i3;
            this.d = str;
            if (i2 > i3) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return a.g(this.f16890a, range.f16890a) && this.f16891b == range.f16891b && this.f16892c == range.f16892c && a.g(this.d, range.d);
        }

        public final int hashCode() {
            Object obj = this.f16890a;
            return this.d.hashCode() + d.c(this.f16892c, d.c(this.f16891b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.f16890a);
            sb.append(", start=");
            sb.append(this.f16891b);
            sb.append(", end=");
            sb.append(this.f16892c);
            sb.append(", tag=");
            return d.q(sb, this.d, ')');
        }

        public Range(int i2, int i3, Object obj) {
            this(obj, "", i2, i3);
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Builder implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        public final StringBuilder f16883a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f16884b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f16885c;
        public final ArrayList d;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f16886f;

        /* loaded from: classes3.dex */
        public static final class MutableRange<T> {

            /* renamed from: a, reason: collision with root package name */
            public final Object f16887a;

            /* renamed from: b, reason: collision with root package name */
            public final int f16888b;

            /* renamed from: c, reason: collision with root package name */
            public int f16889c;
            public final String d;

            public /* synthetic */ MutableRange(Object obj, int i2, int i3, int i4) {
                this(obj, (i4 & 8) != 0 ? "" : null, i2, (i4 & 4) != 0 ? Integer.MIN_VALUE : i3);
            }

            public final Range a(int i2) {
                int i3 = this.f16889c;
                if (i3 != Integer.MIN_VALUE) {
                    i2 = i3;
                }
                if (i2 == Integer.MIN_VALUE) {
                    throw new IllegalStateException("Item.end should be set first".toString());
                }
                int i4 = this.f16888b;
                return new Range(this.f16887a, this.d, i4, i2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return a.g(this.f16887a, mutableRange.f16887a) && this.f16888b == mutableRange.f16888b && this.f16889c == mutableRange.f16889c && a.g(this.d, mutableRange.d);
            }

            public final int hashCode() {
                Object obj = this.f16887a;
                return this.d.hashCode() + d.c(this.f16889c, d.c(this.f16888b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.f16887a);
                sb.append(", start=");
                sb.append(this.f16888b);
                sb.append(", end=");
                sb.append(this.f16889c);
                sb.append(", tag=");
                return d.q(sb, this.d, ')');
            }

            public MutableRange(Object obj, String str, int i2, int i3) {
                this.f16887a = obj;
                this.f16888b = i2;
                this.f16889c = i3;
                this.d = str;
            }
        }

        public Builder() {
            this.f16883a = new StringBuilder(16);
            this.f16884b = new ArrayList();
            this.f16885c = new ArrayList();
            this.d = new ArrayList();
            this.f16886f = new ArrayList();
        }

        public final void a(SpanStyle spanStyle, int i2, int i3) {
            this.f16884b.add(new MutableRange(spanStyle, i2, i3, 8));
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                b((AnnotatedString) charSequence);
            } else {
                this.f16883a.append(charSequence);
            }
            return this;
        }

        public final void b(AnnotatedString annotatedString) {
            StringBuilder sb = this.f16883a;
            int length = sb.length();
            sb.append(annotatedString.f16880a);
            List list = annotatedString.f16881b;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Range range = (Range) list.get(i2);
                    a((SpanStyle) range.f16890a, range.f16891b + length, range.f16892c + length);
                }
            }
            List list2 = annotatedString.f16882c;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Range range2 = (Range) list2.get(i3);
                    this.f16885c.add(new MutableRange((ParagraphStyle) range2.f16890a, range2.f16891b + length, range2.f16892c + length, 8));
                }
            }
            List list3 = annotatedString.d;
            if (list3 != null) {
                int size3 = list3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Range range3 = (Range) list3.get(i4);
                    this.d.add(new MutableRange(range3.f16890a, range3.d, range3.f16891b + length, range3.f16892c + length));
                }
            }
        }

        public final void c(String str) {
            this.f16883a.append(str);
        }

        public final void d(int i2) {
            ArrayList arrayList = this.f16886f;
            if (i2 >= arrayList.size()) {
                throw new IllegalStateException((i2 + " should be less than " + arrayList.size()).toString());
            }
            while (arrayList.size() - 1 >= i2) {
                if (!(!arrayList.isEmpty())) {
                    throw new IllegalStateException("Nothing to pop.".toString());
                }
                ((MutableRange) arrayList.remove(arrayList.size() - 1)).f16889c = this.f16883a.length();
            }
        }

        public final int e(SpanStyle spanStyle) {
            MutableRange mutableRange = new MutableRange(spanStyle, this.f16883a.length(), 0, 12);
            this.f16886f.add(mutableRange);
            this.f16884b.add(mutableRange);
            return r5.size() - 1;
        }

        public final AnnotatedString f() {
            StringBuilder sb = this.f16883a;
            String sb2 = sb.toString();
            ArrayList arrayList = this.f16884b;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(((MutableRange) arrayList.get(i2)).a(sb.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            ArrayList arrayList3 = this.f16885c;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList4.add(((MutableRange) arrayList3.get(i3)).a(sb.length()));
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = null;
            }
            ArrayList arrayList5 = this.d;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size3 = arrayList5.size();
            for (int i4 = 0; i4 < size3; i4++) {
                arrayList6.add(((MutableRange) arrayList5.get(i4)).a(sb.length()));
            }
            return new AnnotatedString(sb2, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i2, int i3) {
            ?? r8;
            ?? r1;
            List list;
            boolean z2 = charSequence instanceof AnnotatedString;
            StringBuilder sb = this.f16883a;
            if (z2) {
                AnnotatedString annotatedString = (AnnotatedString) charSequence;
                int length = sb.length();
                sb.append((CharSequence) annotatedString.f16880a, i2, i3);
                List b2 = AnnotatedStringKt.b(annotatedString, i2, i3);
                if (b2 != null) {
                    int size = b2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        Range range = (Range) b2.get(i4);
                        a((SpanStyle) range.f16890a, range.f16891b + length, range.f16892c + length);
                    }
                }
                String str = annotatedString.f16880a;
                if (i2 == i3 || (r8 = annotatedString.f16882c) == 0) {
                    r8 = 0;
                } else if (i2 != 0 || i3 < str.length()) {
                    ArrayList arrayList = new ArrayList(r8.size());
                    int size2 = r8.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        Object obj = r8.get(i5);
                        Range range2 = (Range) obj;
                        if (AnnotatedStringKt.c(i2, i3, range2.f16891b, range2.f16892c)) {
                            arrayList.add(obj);
                        }
                    }
                    r8 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        Range range3 = (Range) arrayList.get(i6);
                        r8.add(new Range(a.A(range3.f16891b, i2, i3) - i2, a.A(range3.f16892c, i2, i3) - i2, range3.f16890a));
                    }
                }
                if (r8 != 0) {
                    int size4 = r8.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        Range range4 = (Range) r8.get(i7);
                        this.f16885c.add(new MutableRange((ParagraphStyle) range4.f16890a, range4.f16891b + length, range4.f16892c + length, 8));
                    }
                }
                if (i2 == i3 || (r1 = annotatedString.d) == 0) {
                    list = null;
                } else {
                    if (i2 != 0 || i3 < str.length()) {
                        ArrayList arrayList2 = new ArrayList(r1.size());
                        int size5 = r1.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            Object obj2 = r1.get(i8);
                            Range range5 = (Range) obj2;
                            if (AnnotatedStringKt.c(i2, i3, range5.f16891b, range5.f16892c)) {
                                arrayList2.add(obj2);
                            }
                        }
                        r1 = new ArrayList(arrayList2.size());
                        int size6 = arrayList2.size();
                        for (int i9 = 0; i9 < size6; i9++) {
                            Range range6 = (Range) arrayList2.get(i9);
                            r1.add(new Range(range6.f16890a, range6.d, a.A(range6.f16891b, i2, i3) - i2, a.A(range6.f16892c, i2, i3) - i2));
                        }
                    }
                    list = r1;
                }
                if (list != null) {
                    int size7 = list.size();
                    for (int i10 = 0; i10 < size7; i10++) {
                        Range range7 = (Range) list.get(i10);
                        this.d.add(new MutableRange(range7.f16890a, range7.d, range7.f16891b + length, range7.f16892c + length));
                    }
                }
            } else {
                sb.append(charSequence, i2, i3);
            }
            return this;
        }

        public Builder(AnnotatedString annotatedString) {
            this();
            b(annotatedString);
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c2) {
            this.f16883a.append(c2);
            return this;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [e0.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnnotatedString(java.lang.String r3, java.util.ArrayList r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            e0.w r1 = e0.w.f30218a
            if (r0 == 0) goto L7
            r4 = r1
        L7:
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto Ld
            goto Le
        Ld:
            r1 = r0
        Le:
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L17
            r4 = r0
        L17:
            java.util.List r4 = (java.util.List) r4
            r1.isEmpty()
            r2.<init>(r3, r4, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.AnnotatedString.<init>(java.lang.String, java.util.ArrayList, int):void");
    }
}
