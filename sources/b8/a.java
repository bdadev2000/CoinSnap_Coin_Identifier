package b8;

import androidx.activity.result.i;
import kotlin.UByte;
import n9.f0;
import r4.c;
import y7.e;

/* loaded from: classes3.dex */
public final class a extends e {
    public a(f0 f0Var, long j3, long j10) {
        super(new ni.a(), new c(f0Var, 0), j3, j3 + 1, 0L, j10, 188L, 1000);
    }

    public static int d(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }

    public a(f0 f0Var, long j3, long j10, int i10, int i11) {
        super(new ni.a(), new i(i10, f0Var, i11), j3, j3 + 1, 0L, j10, 188L, 940);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(y7.s r15, int r16, long r17, long r19) {
        /*
            r14 = this;
            r0 = r15
            java.util.Objects.requireNonNull(r15)
            androidx.core.app.h r1 = new androidx.core.app.h
            r2 = 23
            r1.<init>(r15, r2)
            f0.c r2 = new f0.c
            r3 = r16
            r2.<init>(r15, r3)
            long r3 = r15.b()
            long r5 = r0.f28002j
            int r7 = r0.f27995c
            int r8 = r0.f27996d
            if (r8 <= 0) goto L27
            long r8 = (long) r8
            long r10 = (long) r7
            long r8 = r8 + r10
            r10 = 2
            long r8 = r8 / r10
            r10 = 1
            goto L40
        L27:
            int r8 = r0.f27994b
            int r9 = r0.a
            if (r9 != r8) goto L31
            if (r9 <= 0) goto L31
            long r8 = (long) r9
            goto L33
        L31:
            r8 = 4096(0x1000, double:2.0237E-320)
        L33:
            int r10 = r0.f27999g
            long r10 = (long) r10
            long r8 = r8 * r10
            int r0 = r0.f28000h
            long r10 = (long) r0
            long r8 = r8 * r10
            r10 = 8
            long r8 = r8 / r10
            r10 = 64
        L40:
            long r11 = r8 + r10
            r0 = 6
            int r13 = java.lang.Math.max(r0, r7)
            r0 = r14
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a.<init>(y7.s, int, long, long):void");
    }
}
