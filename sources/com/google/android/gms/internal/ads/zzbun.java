package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes2.dex */
public final class zzbun extends NativeAd.Image {
    private final zzbhv zza;

    @Nullable
    private final Drawable zzb;

    @Nullable
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|34|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", r1);
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0034, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", r4);
        r1 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0026, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbun(com.google.android.gms.internal.ads.zzbhv r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            r3.<init>()
            r3.zza = r4
            r1 = 0
            com.google.android.gms.dynamic.IObjectWrapper r4 = r4.zzf()     // Catch: android.os.RemoteException -> L15
            if (r4 == 0) goto L17
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)     // Catch: android.os.RemoteException -> L15
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: android.os.RemoteException -> L15
            goto L1d
        L15:
            r4 = move-exception
            goto L19
        L17:
            r4 = r1
            goto L1d
        L19:
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            goto L17
        L1d:
            r3.zzb = r4
            com.google.android.gms.internal.ads.zzbhv r4 = r3.zza     // Catch: android.os.RemoteException -> L26
            android.net.Uri r1 = r4.zze()     // Catch: android.os.RemoteException -> L26
            goto L2a
        L26:
            r4 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
        L2a:
            r3.zzc = r1
            com.google.android.gms.internal.ads.zzbhv r4 = r3.zza     // Catch: android.os.RemoteException -> L33
            double r1 = r4.zzb()     // Catch: android.os.RemoteException -> L33
            goto L39
        L33:
            r4 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L39:
            r3.zzd = r1
            r4 = -1
            com.google.android.gms.internal.ads.zzbhv r1 = r3.zza     // Catch: android.os.RemoteException -> L43
            int r1 = r1.zzd()     // Catch: android.os.RemoteException -> L43
            goto L48
        L43:
            r1 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r1)
            r1 = r4
        L48:
            r3.zze = r1
            com.google.android.gms.internal.ads.zzbhv r1 = r3.zza     // Catch: android.os.RemoteException -> L51
            int r4 = r1.zzc()     // Catch: android.os.RemoteException -> L51
            goto L55
        L51:
            r1 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r1)
        L55:
            r3.zzf = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbun.<init>(com.google.android.gms.internal.ads.zzbhv):void");
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @Nullable
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    @Nullable
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.zze;
    }
}
