package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvw extends zzhbo implements zzhdf {
    private static final zzgvw zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzgwc zze;
    private zzhac zzf = zzhac.zzb;

    static {
        zzgvw zzgvwVar = new zzgvw();
        zza = zzgvwVar;
        zzhbo.zzca(zzgvw.class, zzgvwVar);
    }

    private zzgvw() {
    }

    public static zzgvv zzc() {
        return (zzgvv) zza.zzaZ();
    }

    public static zzgvw zze() {
        return zza;
    }

    public static zzgvw zzf(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgvw) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public static zzhdm zzi() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzj(zzgvw zzgvwVar, zzgwc zzgwcVar) {
        zzgwcVar.getClass();
        zzgvwVar.zze = zzgwcVar;
        zzgvwVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgvu zzgvuVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvw();
            case NEW_BUILDER:
                return new zzgvv(zzgvuVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgvw.class) {
                        try {
                            zzhdmVar = zzb;
                            if (zzhdmVar == null) {
                                zzhdmVar = new zzhbj(zza);
                                zzb = zzhdmVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhdmVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzgwc zzg() {
        zzgwc zzgwcVar = this.zze;
        if (zzgwcVar == null) {
            return zzgwc.zzf();
        }
        return zzgwcVar;
    }

    public final zzhac zzh() {
        return this.zzf;
    }
}
