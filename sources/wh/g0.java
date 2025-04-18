package wh;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f27059d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f27060e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27061b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f27062c;

    public g0(String str, String str2, String[] strArr) {
        this.a = str;
        this.f27061b = str2;
        this.f27062c = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset a(java.nio.charset.Charset r7) {
        /*
            r6 = this;
            java.lang.String r0 = "charset"
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String[] r1 = r6.f27062c
            int r2 = r1.length
            int r2 = r2 + (-1)
            r3 = 2
            r4 = 0
            int r2 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r4, r2, r3)
            if (r2 < 0) goto L28
        L14:
            int r3 = r4 + 2
            r5 = r1[r4]
            boolean r5 = kotlin.text.StringsKt.i(r5, r0)
            if (r5 == 0) goto L23
            int r4 = r4 + 1
            r0 = r1[r4]
            goto L29
        L23:
            if (r4 != r2) goto L26
            goto L28
        L26:
            r4 = r3
            goto L14
        L28:
            r0 = 0
        L29:
            if (r0 != 0) goto L2c
            return r7
        L2c:
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L30
        L30:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.g0.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g0) && Intrinsics.areEqual(((g0) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
