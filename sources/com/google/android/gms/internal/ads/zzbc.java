package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbc {
    public final String zza;

    @Nullable
    public final zzax zzb;
    public final zzav zzc;
    public final zzbh zzd;
    public final zzap zze;
    public final zzaz zzf;

    static {
        new zzam().zzc();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzbc(String str, zzar zzarVar, zzax zzaxVar, zzav zzavVar, zzbh zzbhVar, zzaz zzazVar, zzbb zzbbVar) {
        this.zza = str;
        this.zzb = zzaxVar;
        this.zzc = zzavVar;
        this.zzd = zzbhVar;
        this.zze = zzarVar;
        this.zzf = zzazVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbcVar = (zzbc) obj;
        return Objects.equals(this.zza, zzbcVar.zza) && this.zze.equals(zzbcVar.zze) && Objects.equals(this.zzb, zzbcVar.zzb) && Objects.equals(this.zzc, zzbcVar.zzc) && Objects.equals(this.zzd, zzbcVar.zzd) && Objects.equals(this.zzf, zzbcVar.zzf);
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        zzax zzaxVar = this.zzb;
        return (this.zzd.hashCode() + ((this.zze.hashCode() + ((this.zzc.hashCode() + ((hashCode + (zzaxVar != null ? zzaxVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
