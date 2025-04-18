package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgup extends zzhbe implements zzhcq {
    private static final zzgup zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private zzguv zze;
    private zzgzs zzf = zzgzs.zzb;

    static {
        zzgup zzgupVar = new zzgup();
        zza = zzgupVar;
        zzhbe.zzcb(zzgup.class, zzgupVar);
    }

    private zzgup() {
    }

    public static zzguo zzc() {
        return (zzguo) zza.zzaZ();
    }

    public static zzgup zze(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgup) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public static zzhcx zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzi(zzgup zzgupVar, zzguv zzguvVar) {
        zzguvVar.getClass();
        zzgupVar.zze = zzguvVar;
        zzgupVar.zzc |= 1;
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
                return zzhbe.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgup();
            case NEW_BUILDER:
                return new zzguo(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgup.class) {
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

    public final zzguv zzf() {
        zzguv zzguvVar = this.zze;
        return zzguvVar == null ? zzguv.zze() : zzguvVar;
    }

    public final zzgzs zzg() {
        return this.zzf;
    }
}
