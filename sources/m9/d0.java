package m9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class d0 extends m {

    /* renamed from: d, reason: collision with root package name */
    public final int f21654d;

    public d0() {
        super(2008);
        this.f21654d = 1;
    }

    public static d0 a(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && c6.k.C(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new c0(iOException);
        }
        return new d0(iOException, i11, i10);
    }

    public d0(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.f21654d = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d0(java.io.IOException r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r3 != r0) goto L9
            r0 = 1
            if (r4 != r0) goto L9
            r3 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r2, r3)
            r1.f21654d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.d0.<init>(java.io.IOException, int, int):void");
    }

    public d0(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? 2001 : i10);
        this.f21654d = 1;
    }
}
