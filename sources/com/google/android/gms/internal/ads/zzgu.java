package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class zzgu extends zzge {
    public final int zzb;

    public zzgu(zzgi zzgiVar, int i10, int i11) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzgu zza(IOException iOException, zzgi zzgiVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && zzfwa.zza(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new zzgt(iOException, zzgiVar);
        }
        return new zzgu(iOException, zzgiVar, i11, i10);
    }

    private static int zzb(int i10, int i11) {
        return i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10;
    }

    public zzgu(IOException iOException, zzgi zzgiVar, int i10, int i11) {
        super(iOException, zzb(i10, i11));
        this.zzb = i11;
    }

    public zzgu(String str, zzgi zzgiVar, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = i11;
    }

    public zzgu(String str, @Nullable IOException iOException, zzgi zzgiVar, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = i11;
    }
}
