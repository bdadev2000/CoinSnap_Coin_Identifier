package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzpc {
    final /* synthetic */ zzpd zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzvo zze;
    private boolean zzf;
    private boolean zzg;

    public zzpc(zzpd zzpdVar, String str, @Nullable int i9, zzvo zzvoVar) {
        this.zza = zzpdVar;
        this.zzb = str;
        this.zzc = i9;
        this.zzd = zzvoVar == null ? -1L : zzvoVar.zzd;
        if (zzvoVar == null || !zzvoVar.zzb()) {
            return;
        }
        this.zze = zzvoVar;
    }

    public final void zzg(int i9, @Nullable zzvo zzvoVar) {
        if (this.zzd == -1 && i9 == this.zzc && zzvoVar != null) {
            zzpd zzpdVar = this.zza;
            long j7 = zzvoVar.zzd;
            if (j7 >= zzpd.zza(zzpdVar)) {
                this.zzd = j7;
            }
        }
    }

    public final boolean zzj(int i9, @Nullable zzvo zzvoVar) {
        if (zzvoVar == null) {
            return i9 == this.zzc;
        }
        zzvo zzvoVar2 = this.zze;
        return zzvoVar2 == null ? !zzvoVar.zzb() && zzvoVar.zzd == this.zzd : zzvoVar.zzd == zzvoVar2.zzd && zzvoVar.zzb == zzvoVar2.zzb && zzvoVar.zzc == zzvoVar2.zzc;
    }

    public final boolean zzk(zzmy zzmyVar) {
        zzvo zzvoVar = zzmyVar.zzd;
        if (zzvoVar == null) {
            if (this.zzc != zzmyVar.zzc) {
                return true;
            }
            return false;
        }
        long j7 = this.zzd;
        if (j7 == -1) {
            return false;
        }
        if (zzvoVar.zzd > j7) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzdc zzdcVar = zzmyVar.zzb;
        int zza = zzdcVar.zza(zzvoVar.zza);
        int zza2 = zzdcVar.zza(this.zze.zza);
        zzvo zzvoVar2 = zzmyVar.zzd;
        if (zzvoVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (zzvoVar2.zzb()) {
            zzvo zzvoVar3 = zzmyVar.zzd;
            int i9 = zzvoVar3.zzb;
            int i10 = zzvoVar3.zzc;
            zzvo zzvoVar4 = this.zze;
            int i11 = zzvoVar4.zzb;
            if (i9 > i11) {
                return true;
            }
            if (i9 == i11 && i10 > zzvoVar4.zzc) {
                return true;
            }
            return false;
        }
        int i12 = zzmyVar.zzd.zze;
        if (i12 == -1 || i12 > this.zze.zzb) {
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
    public final boolean zzl(com.google.android.gms.internal.ads.zzdc r7, com.google.android.gms.internal.ads.zzdc r8) {
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
            com.google.android.gms.internal.ads.zzpd r1 = r6.zza
            com.google.android.gms.internal.ads.zzdb r1 = com.google.android.gms.internal.ads.zzpd.zzc(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzpd r0 = r6.zza
            com.google.android.gms.internal.ads.zzdb r0 = com.google.android.gms.internal.ads.zzpd.zzc(r0)
            int r0 = r0.zzp
        L26:
            com.google.android.gms.internal.ads.zzpd r1 = r6.zza
            com.google.android.gms.internal.ads.zzdb r1 = com.google.android.gms.internal.ads.zzpd.zzc(r1)
            int r1 = r1.zzq
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zzpd r7 = r6.zza
            com.google.android.gms.internal.ads.zzcz r7 = com.google.android.gms.internal.ads.zzpd.zzb(r7)
            com.google.android.gms.internal.ads.zzcz r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zzvo r7 = r6.zze
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpc.zzl(com.google.android.gms.internal.ads.zzdc, com.google.android.gms.internal.ads.zzdc):boolean");
    }
}
