package vc;

import java.util.Calendar;

/* loaded from: classes3.dex */
public final class p0 extends com.google.gson.c0 {
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0045, code lost:
    
        if (r1.equals("month") == false) goto L10;
     */
    @Override // com.google.gson.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(zc.a r13) {
        /*
            r12 = this;
            int r0 = r13.b0()
            r1 = 9
            if (r0 != r1) goto Le
            r13.X()
            r13 = 0
            goto L8c
        Le:
            r13.g()
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L18:
            int r1 = r13.b0()
            r8 = 4
            if (r1 == r8) goto L83
            java.lang.String r1 = r13.V()
            int r9 = r13.T()
            r1.getClass()
            int r10 = r1.hashCode()
            r11 = -1
            switch(r10) {
                case -1181204563: goto L69;
                case -1074026988: goto L5e;
                case -906279820: goto L53;
                case 3704893: goto L48;
                case 104080000: goto L3f;
                case 985252545: goto L34;
                default: goto L32;
            }
        L32:
            r8 = r11
            goto L73
        L34:
            java.lang.String r8 = "hourOfDay"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3d
            goto L32
        L3d:
            r8 = 5
            goto L73
        L3f:
            java.lang.String r10 = "month"
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L73
            goto L32
        L48:
            java.lang.String r8 = "year"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L51
            goto L32
        L51:
            r8 = 3
            goto L73
        L53:
            java.lang.String r8 = "second"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L5c
            goto L32
        L5c:
            r8 = 2
            goto L73
        L5e:
            java.lang.String r8 = "minute"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L67
            goto L32
        L67:
            r8 = 1
            goto L73
        L69:
            java.lang.String r8 = "dayOfMonth"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L72
            goto L32
        L72:
            r8 = r0
        L73:
            switch(r8) {
                case 0: goto L81;
                case 1: goto L7f;
                case 2: goto L7d;
                case 3: goto L7b;
                case 4: goto L79;
                case 5: goto L77;
                default: goto L76;
            }
        L76:
            goto L18
        L77:
            r5 = r9
            goto L18
        L79:
            r3 = r9
            goto L18
        L7b:
            r2 = r9
            goto L18
        L7d:
            r7 = r9
            goto L18
        L7f:
            r6 = r9
            goto L18
        L81:
            r4 = r9
            goto L18
        L83:
            r13.q()
            java.util.GregorianCalendar r13 = new java.util.GregorianCalendar
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L8c:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.p0.b(zc.a):java.lang.Object");
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        if (((Calendar) obj) == null) {
            bVar.t();
            return;
        }
        bVar.j();
        bVar.r("year");
        bVar.U(r4.get(1));
        bVar.r("month");
        bVar.U(r4.get(2));
        bVar.r("dayOfMonth");
        bVar.U(r4.get(5));
        bVar.r("hourOfDay");
        bVar.U(r4.get(11));
        bVar.r("minute");
        bVar.U(r4.get(12));
        bVar.r("second");
        bVar.U(r4.get(13));
        bVar.q();
    }
}
