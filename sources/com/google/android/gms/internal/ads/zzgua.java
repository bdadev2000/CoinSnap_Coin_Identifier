package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgua extends zzhbe implements zzhcq {
    private static final zzgua zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private zzgug zze;
    private zzgvr zzf;

    static {
        zzgua zzguaVar = new zzgua();
        zza = zzguaVar;
        zzhbe.zzcb(zzgua.class, zzguaVar);
    }

    private zzgua() {
    }

    public static zzgtz zzc() {
        return (zzgtz) zza.zzaZ();
    }

    public static zzgua zze(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgua) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public static zzhcx zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzi(zzgua zzguaVar, zzgug zzgugVar) {
        zzgugVar.getClass();
        zzguaVar.zze = zzgugVar;
        zzguaVar.zzc |= 1;
    }

    public static /* synthetic */ void zzj(zzgua zzguaVar, zzgvr zzgvrVar) {
        zzgvrVar.getClass();
        zzguaVar.zzf = zzgvrVar;
        zzguaVar.zzc |= 2;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgua();
            case NEW_BUILDER:
                return new zzgtz(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgua.class) {
                        try {
                            zzhcxVar = zzb;
                            if (zzhcxVar == null) {
                                zzhcxVar = new zzhaz(zza);
                                zzb = zzhcxVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhcxVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzgug zzf() {
        zzgug zzgugVar = this.zze;
        return zzgugVar == null ? zzgug.zze() : zzgugVar;
    }

    public final zzgvr zzg() {
        zzgvr zzgvrVar = this.zzf;
        return zzgvrVar == null ? zzgvr.zze() : zzgvrVar;
    }
}
