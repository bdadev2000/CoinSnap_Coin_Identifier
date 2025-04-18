package x1;

import com.google.android.gms.ads.AdError;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27327b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27328c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27329d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27330e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27331f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27332g;

    public b(int i10, String name, String type, String str, boolean z10, int i11) {
        int i12;
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        boolean contains$default5;
        boolean contains$default6;
        boolean contains$default7;
        boolean contains$default8;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = name;
        this.f27327b = type;
        this.f27328c = z10;
        this.f27329d = i10;
        this.f27330e = str;
        this.f27331f = i11;
        if (type != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = type.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            contains$default = StringsKt__StringsKt.contains$default(upperCase, "INT", false, 2, (Object) null);
            if (contains$default) {
                i12 = 3;
            } else {
                contains$default2 = StringsKt__StringsKt.contains$default(upperCase, "CHAR", false, 2, (Object) null);
                if (!contains$default2) {
                    contains$default3 = StringsKt__StringsKt.contains$default(upperCase, "CLOB", false, 2, (Object) null);
                    if (!contains$default3) {
                        contains$default4 = StringsKt__StringsKt.contains$default(upperCase, "TEXT", false, 2, (Object) null);
                        if (!contains$default4) {
                            contains$default5 = StringsKt__StringsKt.contains$default(upperCase, "BLOB", false, 2, (Object) null);
                            if (!contains$default5) {
                                contains$default6 = StringsKt__StringsKt.contains$default(upperCase, "REAL", false, 2, (Object) null);
                                if (!contains$default6) {
                                    contains$default7 = StringsKt__StringsKt.contains$default(upperCase, "FLOA", false, 2, (Object) null);
                                    if (!contains$default7) {
                                        contains$default8 = StringsKt__StringsKt.contains$default(upperCase, "DOUB", false, 2, (Object) null);
                                        if (!contains$default8) {
                                            i12 = 1;
                                        }
                                    }
                                }
                                i12 = 4;
                            }
                        }
                    }
                }
                i12 = 2;
            }
            this.f27332g = i12;
        }
        i12 = 5;
        this.f27332g = i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof x1.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            x1.b r9 = (x1.b) r9
            int r1 = r9.f27329d
            int r3 = r8.f27329d
            if (r3 == r1) goto L13
            return r2
        L13:
            java.lang.String r1 = r9.a
            java.lang.String r3 = r8.a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            boolean r1 = r8.f27328c
            boolean r3 = r9.f27328c
            if (r1 == r3) goto L25
            return r2
        L25:
            int r1 = r9.f27331f
            java.lang.String r3 = r9.f27330e
            r4 = 2
            java.lang.String r5 = r8.f27330e
            int r6 = r8.f27331f
            if (r6 != r0) goto L3b
            if (r1 != r4) goto L3b
            if (r5 == 0) goto L3b
            boolean r7 = x1.a.a(r5, r3)
            if (r7 != 0) goto L3b
            return r2
        L3b:
            if (r6 != r4) goto L48
            if (r1 != r0) goto L48
            if (r3 == 0) goto L48
            boolean r4 = x1.a.a(r3, r5)
            if (r4 != 0) goto L48
            return r2
        L48:
            if (r6 == 0) goto L5d
            if (r6 != r1) goto L5d
            if (r5 == 0) goto L55
            boolean r1 = x1.a.a(r5, r3)
            if (r1 != 0) goto L59
            goto L57
        L55:
            if (r3 == 0) goto L59
        L57:
            r1 = r0
            goto L5a
        L59:
            r1 = r2
        L5a:
            if (r1 == 0) goto L5d
            return r2
        L5d:
            int r1 = r8.f27332g
            int r9 = r9.f27332g
            if (r1 != r9) goto L64
            goto L65
        L64:
            r0 = r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        int hashCode = ((this.a.hashCode() * 31) + this.f27332g) * 31;
        if (this.f27328c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((hashCode + i10) * 31) + this.f27329d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.a);
        sb2.append("', type='");
        sb2.append(this.f27327b);
        sb2.append("', affinity='");
        sb2.append(this.f27332g);
        sb2.append("', notNull=");
        sb2.append(this.f27328c);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.f27329d);
        sb2.append(", defaultValue='");
        String str = this.f27330e;
        if (str == null) {
            str = AdError.UNDEFINED_DOMAIN;
        }
        return vd.e.h(sb2, str, "'}");
    }
}
