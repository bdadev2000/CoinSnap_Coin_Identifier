package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzeuu implements zzevz {
    private final Context zza;
    private final zzges zzb;
    private final zzffo zzc;
    private final VersionInfoParcel zzd;

    public zzeuu(Context context, zzges zzgesVar, zzffo zzffoVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgesVar;
        this.zzc = zzffoVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeut
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuu.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzdd)).booleanValue() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzftl.zzj(r0).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzdo)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzde)).booleanValue() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzftm.zzi(r0);
        r0 = com.google.android.gms.internal.ads.zzfti.zza(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ed, code lost:
    
        if (r9.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzdk)).intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ef, code lost:
    
        r2 = r4.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzdp)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
        r3 = r0.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0113, code lost:
    
        r6 = r0.zze();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzdg)).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzdf)).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeuv zzc() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuu.zzc():com.google.android.gms.internal.ads.zzeuv");
    }
}
