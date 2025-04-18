package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class zzgy extends zzgh {
    public final int zzb;

    public zzgy(zzgm zzgmVar, int i2, int i3) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = 1;
    }

    public static zzgy zza(IOException iOException, zzgm zzgmVar, int i2) {
        String message = iOException.getMessage();
        int i3 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : (message == null || !zzfxi.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i3 == 2007 ? new zzgx(iOException, zzgmVar) : new zzgy(iOException, zzgmVar, i3, i2);
    }

    private static int zzb(int i2, int i3) {
        return i2 == 2000 ? i3 != 1 ? AdError.SERVER_ERROR_CODE : AdError.INTERNAL_ERROR_CODE : i2;
    }

    public zzgy(IOException iOException, zzgm zzgmVar, int i2, int i3) {
        super(iOException, zzb(i2, i3));
        this.zzb = i3;
    }

    public zzgy(String str, zzgm zzgmVar, int i2, int i3) {
        super(str, zzb(i2, i3));
        this.zzb = i3;
    }

    public zzgy(String str, @Nullable IOException iOException, zzgm zzgmVar, int i2, int i3) {
        super(str, iOException, zzb(i2, i3));
        this.zzb = i3;
    }
}
