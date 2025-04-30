package com.google.android.gms.internal.ads;

import Q7.n0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdof {
    private final com.google.android.gms.ads.internal.util.zzbq zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdof(com.google.android.gms.ads.internal.util.zzbq zzbqVar, Clock clock, Executor executor) {
        this.zza = zzbqVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        boolean z8 = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (decodeByteArray != null) {
            long j7 = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z8 = true;
            }
            StringBuilder o3 = n0.o(width, height, "Decoded image w: ", " h:", " bytes: ");
            o3.append(allocationByteCount);
            o3.append(" time: ");
            o3.append(j7);
            o3.append(" on ui thread: ");
            o3.append(z8);
            com.google.android.gms.ads.internal.util.zze.zza(o3.toString());
        }
        return decodeByteArray;
    }

    public final /* synthetic */ Bitmap zza(double d2, boolean z8, zzara zzaraVar) {
        byte[] bArr = zzaraVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d2 * 160.0d);
        if (!z8) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgp)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i9 = options.outWidth * options.outHeight;
            if (i9 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i9 - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgq)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final f4.c zzb(String str, final double d2, final boolean z8) {
        return zzgft.zzm(this.zza.zza(str), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdoe
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return zzdof.this.zza(d2, z8, (zzara) obj);
            }
        }, this.zzc);
    }
}
