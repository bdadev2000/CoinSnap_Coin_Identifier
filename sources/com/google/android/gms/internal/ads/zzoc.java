package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzoc {
    final /* synthetic */ zzod zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzur zze;
    private boolean zzf;
    private boolean zzg;

    public zzoc(zzod zzodVar, String str, @Nullable int i10, zzur zzurVar) {
        this.zza = zzodVar;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = zzurVar == null ? -1L : zzurVar.zzd;
        if (zzurVar == null || !zzurVar.zzb()) {
            return;
        }
        this.zze = zzurVar;
    }

    public final void zzg(int i10, @Nullable zzur zzurVar) {
        if (this.zzd == -1 && i10 == this.zzc && zzurVar != null) {
            zzod zzodVar = this.zza;
            long j3 = zzurVar.zzd;
            if (j3 >= zzod.zza(zzodVar)) {
                this.zzd = j3;
            }
        }
    }

    public final boolean zzj(int i10, @Nullable zzur zzurVar) {
        if (zzurVar == null) {
            return i10 == this.zzc;
        }
        zzur zzurVar2 = this.zze;
        return zzurVar2 == null ? !zzurVar.zzb() && zzurVar.zzd == this.zzd : zzurVar.zzd == zzurVar2.zzd && zzurVar.zzb == zzurVar2.zzb && zzurVar.zzc == zzurVar2.zzc;
    }

    public final boolean zzk(zzlx zzlxVar) {
        zzur zzurVar = zzlxVar.zzd;
        if (zzurVar == null) {
            if (this.zzc != zzlxVar.zzc) {
                return true;
            }
            return false;
        }
        long j3 = this.zzd;
        if (j3 == -1) {
            return false;
        }
        if (zzurVar.zzd > j3) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbv zzbvVar = zzlxVar.zzb;
        int zza = zzbvVar.zza(zzurVar.zza);
        int zza2 = zzbvVar.zza(this.zze.zza);
        zzur zzurVar2 = zzlxVar.zzd;
        if (zzurVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (zzurVar2.zzb()) {
            zzur zzurVar3 = zzlxVar.zzd;
            int i10 = zzurVar3.zzb;
            int i11 = zzurVar3.zzc;
            zzur zzurVar4 = this.zze;
            int i12 = zzurVar4.zzb;
            if (i10 > i12) {
                return true;
            }
            if (i10 == i12 && i11 > zzurVar4.zzc) {
                return true;
            }
            return false;
        }
        int i13 = zzlxVar.zzd.zze;
        if (i13 == -1 || i13 > this.zze.zzb) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.zzc()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzbv r7, com.google.android.gms.internal.ads.zzbv r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = r3
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zzod r1 = r6.zza
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzod.zzc(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzod r0 = r6.zza
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzod.zzc(r0)
            int r0 = r0.zzn
        L26:
            com.google.android.gms.internal.ads.zzod r1 = r6.zza
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzod.zzc(r1)
            int r1 = r1.zzo
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zzod r7 = r6.zza
            com.google.android.gms.internal.ads.zzbt r7 = com.google.android.gms.internal.ads.zzod.zzb(r7)
            com.google.android.gms.internal.ads.zzbt r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzc
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zzur r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoc.zzl(com.google.android.gms.internal.ads.zzbv, com.google.android.gms.internal.ads.zzbv):boolean");
    }
}
