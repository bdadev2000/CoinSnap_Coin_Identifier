package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzaw {
    public final String zza;

    @Nullable
    public final zzar zzb;
    public final zzaq zzc;
    public final zzba zzd;
    public final zzam zze;
    public final zzat zzf;

    static {
        new zzak().zzc();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzaw(String str, zzan zzanVar, zzar zzarVar, zzaq zzaqVar, zzba zzbaVar, zzat zzatVar, zzav zzavVar) {
        this.zza = str;
        this.zzb = zzarVar;
        this.zzc = zzaqVar;
        this.zzd = zzbaVar;
        this.zze = zzanVar;
        this.zzf = zzatVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        zzaw zzawVar = (zzaw) obj;
        if (Objects.equals(this.zza, zzawVar.zza) && this.zze.equals(zzawVar.zze) && Objects.equals(this.zzb, zzawVar.zzb) && Objects.equals(this.zzc, zzawVar.zzc) && Objects.equals(this.zzd, zzawVar.zzd) && Objects.equals(this.zzf, zzawVar.zzf)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zza.hashCode() * 31;
        zzar zzarVar = this.zzb;
        if (zzarVar != null) {
            i10 = zzarVar.hashCode();
        } else {
            i10 = 0;
        }
        return (this.zzd.hashCode() + ((this.zze.hashCode() + ((this.zzc.hashCode() + ((hashCode + i10) * 31)) * 31)) * 31)) * 31;
    }
}
