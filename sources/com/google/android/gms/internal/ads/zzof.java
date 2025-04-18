package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzof {
    final /* synthetic */ zzog zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzuy zze;
    private boolean zzf;
    private boolean zzg;

    public zzof(zzog zzogVar, String str, @Nullable int i2, zzuy zzuyVar) {
        this.zza = zzogVar;
        this.zzb = str;
        this.zzc = i2;
        this.zzd = zzuyVar == null ? -1L : zzuyVar.zzd;
        if (zzuyVar == null || !zzuyVar.zzb()) {
            return;
        }
        this.zze = zzuyVar;
    }

    public final void zzg(int i2, @Nullable zzuy zzuyVar) {
        if (this.zzd == -1 && i2 == this.zzc && zzuyVar != null) {
            zzog zzogVar = this.zza;
            long j2 = zzuyVar.zzd;
            if (j2 >= zzog.zza(zzogVar)) {
                this.zzd = j2;
            }
        }
    }

    public final boolean zzj(int i2, @Nullable zzuy zzuyVar) {
        if (zzuyVar == null) {
            return i2 == this.zzc;
        }
        zzuy zzuyVar2 = this.zze;
        return zzuyVar2 == null ? !zzuyVar.zzb() && zzuyVar.zzd == this.zzd : zzuyVar.zzd == zzuyVar2.zzd && zzuyVar.zzb == zzuyVar2.zzb && zzuyVar.zzc == zzuyVar2.zzc;
    }

    public final boolean zzk(zzmb zzmbVar) {
        zzuy zzuyVar = zzmbVar.zzd;
        if (zzuyVar == null) {
            return this.zzc != zzmbVar.zzc;
        }
        long j2 = this.zzd;
        if (j2 == -1) {
            return false;
        }
        if (zzuyVar.zzd > j2) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzcc zzccVar = zzmbVar.zzb;
        int zza = zzccVar.zza(zzuyVar.zza);
        int zza2 = zzccVar.zza(this.zze.zza);
        zzuy zzuyVar2 = zzmbVar.zzd;
        if (zzuyVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (!zzuyVar2.zzb()) {
            int i2 = zzmbVar.zzd.zze;
            return i2 == -1 || i2 > this.zze.zzb;
        }
        zzuy zzuyVar3 = zzmbVar.zzd;
        int i3 = zzuyVar3.zzb;
        int i4 = zzuyVar3.zzc;
        zzuy zzuyVar4 = this.zze;
        int i5 = zzuyVar4.zzb;
        if (i3 <= i5) {
            return i3 == i5 && i4 > zzuyVar4.zzc;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.zzc()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzcc r7, com.google.android.gms.internal.ads.zzcc r8) {
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
            com.google.android.gms.internal.ads.zzog r1 = r6.zza
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zzog.zzc(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzog r0 = r6.zza
            com.google.android.gms.internal.ads.zzcb r0 = com.google.android.gms.internal.ads.zzog.zzc(r0)
            int r0 = r0.zzn
        L26:
            com.google.android.gms.internal.ads.zzog r1 = r6.zza
            com.google.android.gms.internal.ads.zzcb r1 = com.google.android.gms.internal.ads.zzog.zzc(r1)
            int r1 = r1.zzo
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zzog r7 = r6.zza
            com.google.android.gms.internal.ads.zzca r7 = com.google.android.gms.internal.ads.zzog.zzb(r7)
            com.google.android.gms.internal.ads.zzca r7 = r8.zzd(r1, r7, r2)
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
            com.google.android.gms.internal.ads.zzuy r7 = r6.zze
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzof.zzl(com.google.android.gms.internal.ads.zzcc, com.google.android.gms.internal.ads.zzcc):boolean");
    }
}
