package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzbu {
    public final String zzc;

    @Nullable
    public final zzbn zzd;

    @Nullable
    @Deprecated
    public final zzbn zze;
    public final zzbk zzf;
    public final zzca zzg;
    public final zzba zzh;

    @Deprecated
    public final zzbc zzi;
    public final zzbq zzj;
    public static final zzbu zza = new zzaw().zzc();
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzat
    };

    public /* synthetic */ zzbu(String str, zzbc zzbcVar, zzbn zzbnVar, zzbk zzbkVar, zzca zzcaVar, zzbq zzbqVar, zzbt zzbtVar) {
        this.zzc = str;
        this.zzd = zzbnVar;
        this.zze = zzbnVar;
        this.zzf = zzbkVar;
        this.zzg = zzcaVar;
        this.zzh = zzbcVar;
        this.zzi = zzbcVar;
        this.zzj = zzbqVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbu)) {
            return false;
        }
        zzbu zzbuVar = (zzbu) obj;
        if (zzgd.zzG(this.zzc, zzbuVar.zzc) && this.zzh.equals(zzbuVar.zzh) && zzgd.zzG(this.zzd, zzbuVar.zzd) && zzgd.zzG(this.zzf, zzbuVar.zzf) && zzgd.zzG(this.zzg, zzbuVar.zzg) && zzgd.zzG(this.zzj, zzbuVar.zzj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.zzc.hashCode() * 31;
        zzbn zzbnVar = this.zzd;
        if (zzbnVar != null) {
            i9 = zzbnVar.hashCode();
        } else {
            i9 = 0;
        }
        return (this.zzg.hashCode() + ((this.zzh.hashCode() + ((this.zzf.hashCode() + ((hashCode + i9) * 31)) * 31)) * 31)) * 31;
    }
}
