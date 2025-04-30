package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzewl implements zzexw {
    private final Context zza;
    private final zzgge zzb;
    private final zzfho zzc;
    private final VersionInfoParcel zzd;

    public zzewl(Context context, zzgge zzggeVar, zzfho zzfhoVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzggeVar;
        this.zzc = zzfhoVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzewl.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzcS)).booleanValue() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzfvg.zzj(r0).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzdg)).longValue(), com.google.android.gms.ads.internal.zzu.zzo().zzi().zzS());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzcT)).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d4, code lost:
    
        r0 = com.google.android.gms.internal.ads.zzfvh.zzi(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ec, code lost:
    
        if (r8.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzdc)).intValue()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ee, code lost:
    
        r2 = r0.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzdh)).longValue(), com.google.android.gms.ads.internal.zzu.zzo().zzi().zzS());
        r3 = r0.zzo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0112, code lost:
    
        r6 = r0.zzp();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzcV)).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzcU)).booleanValue() != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzewm zzc() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewl.zzc():com.google.android.gms.internal.ads.zzewm");
    }
}
