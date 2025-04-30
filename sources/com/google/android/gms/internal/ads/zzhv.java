package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public class zzhv extends zzhc {
    public final zzhh zzb;
    public final int zzc;

    public zzhv(zzhh zzhhVar, int i9, int i10) {
        super(zzb(2008, 1));
        this.zzb = zzhhVar;
        this.zzc = 1;
    }

    public static zzhv zza(IOException iOException, zzhh zzhhVar, int i9) {
        int i10;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i10 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i10 = GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION;
        } else if (message != null && zzfxm.zza(message).matches("cleartext.*not permitted.*")) {
            i10 = 2007;
        } else {
            i10 = 2001;
        }
        if (i10 == 2007) {
            return new zzhu(iOException, zzhhVar);
        }
        return new zzhv(iOException, zzhhVar, i10, i9);
    }

    private static int zzb(int i9, int i10) {
        return i9 == 2000 ? i10 != 1 ? 2000 : 2001 : i9;
    }

    public zzhv(IOException iOException, zzhh zzhhVar, int i9, int i10) {
        super(iOException, zzb(i9, i10));
        this.zzb = zzhhVar;
        this.zzc = i10;
    }

    public zzhv(String str, zzhh zzhhVar, int i9, int i10) {
        super(str, zzb(i9, i10));
        this.zzb = zzhhVar;
        this.zzc = i10;
    }

    public zzhv(String str, @Nullable IOException iOException, zzhh zzhhVar, int i9, int i10) {
        super(str, iOException, zzb(i9, i10));
        this.zzb = zzhhVar;
        this.zzc = i10;
    }
}
