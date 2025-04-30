package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgql implements zzgqq {
    private final String zza;
    private final zzgze zzb;
    private final zzhac zzc;
    private final zzgwg zzd;
    private final zzgxn zze;
    private final Integer zzf;

    private zzgql(String str, zzgze zzgzeVar, zzhac zzhacVar, zzgwg zzgwgVar, zzgxn zzgxnVar, Integer num) {
        this.zza = str;
        this.zzb = zzgzeVar;
        this.zzc = zzhacVar;
        this.zzd = zzgwgVar;
        this.zze = zzgxnVar;
        this.zzf = num;
    }

    public static zzgql zza(String str, zzhac zzhacVar, zzgwg zzgwgVar, zzgxn zzgxnVar, Integer num) throws GeneralSecurityException {
        if (zzgxnVar == zzgxn.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgql(str, zzgra.zza(str), zzhacVar, zzgwgVar, zzgxnVar, num);
    }

    public final zzgwg zzb() {
        return this.zzd;
    }

    public final zzgxn zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgqq
    public final zzgze zzd() {
        return this.zzb;
    }

    public final zzhac zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
