package n8;

import G7.j;
import i8.I;
import w8.i;

/* loaded from: classes3.dex */
public abstract class e {
    static {
        i iVar = i.f24015f;
        r6.b.c("\"\\");
        r6.b.c("\t ,=");
    }

    public static final boolean a(I i9) {
        if (j.a(i9.b.b, "HEAD")) {
            return false;
        }
        int i10 = i9.f20776f;
        if (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && j8.b.j(i9) == -1 && !"chunked".equalsIgnoreCase(I.b(i9, "Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b9, code lost:
    
        if (r9.b.matcher(r0).matches() == false) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(i8.C2365b r34, i8.u r35, i8.s r36) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.e.b(i8.b, i8.u, i8.s):void");
    }
}
