package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgow implements zzgpb {
    private final String zza;
    private final zzgwu zzb;
    private final zzgxp zzc;
    private final zzgty zzd;
    private final zzgve zze;
    private final Integer zzf;

    private zzgow(String str, zzgwu zzgwuVar, zzgxp zzgxpVar, zzgty zzgtyVar, zzgve zzgveVar, Integer num) {
        this.zza = str;
        this.zzb = zzgwuVar;
        this.zzc = zzgxpVar;
        this.zzd = zzgtyVar;
        this.zze = zzgveVar;
        this.zzf = num;
    }

    public static zzgow zza(String str, zzgxp zzgxpVar, zzgty zzgtyVar, zzgve zzgveVar, Integer num) throws GeneralSecurityException {
        if (zzgveVar == zzgve.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgow(str, zzgpj.zza(str), zzgxpVar, zzgtyVar, zzgveVar, num);
    }

    public final zzgty zzb() {
        return this.zzd;
    }

    public final zzgve zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgpb
    public final zzgwu zzd() {
        return this.zzb;
    }

    public final zzgxp zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
