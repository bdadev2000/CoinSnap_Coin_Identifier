package com.google.android.gms.internal.ads;

import a4.j;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdlk {
    private final com.google.android.gms.ads.internal.util.zzbn zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdlk(com.google.android.gms.ads.internal.util.zzbn zzbnVar, Clock clock, Executor executor) {
        this.zza = zzbnVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        boolean z10 = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (decodeByteArray != null) {
            long j3 = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            }
            StringBuilder n10 = j.n("Decoded image w: ", width, " h:", height, " bytes: ");
            n10.append(allocationByteCount);
            n10.append(" time: ");
            n10.append(j3);
            n10.append(" on ui thread: ");
            n10.append(z10);
            com.google.android.gms.ads.internal.util.zze.zza(n10.toString());
        }
        return decodeByteArray;
    }

    public final /* synthetic */ Bitmap zza(double d10, boolean z10, zzapl zzaplVar) {
        byte[] bArr = zzaplVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfZ)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzga)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final ua.b zzb(String str, final double d10, final boolean z10) {
        return zzgei.zzm(this.zza.zza(str), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdlj
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return zzdlk.this.zza(d10, z10, (zzapl) obj);
            }
        }, this.zzc);
    }
}
