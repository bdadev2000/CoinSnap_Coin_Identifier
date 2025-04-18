package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgtr extends zzhbe implements zzhcq {
    private static final zzgtr zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private int zzd;
    private zzgzs zze = zzgzs.zzb;
    private zzgtx zzf;

    static {
        zzgtr zzgtrVar = new zzgtr();
        zza = zzgtrVar;
        zzhbe.zzcb(zzgtr.class, zzgtrVar);
    }

    private zzgtr() {
    }

    public static zzgtq zzc() {
        return (zzgtq) zza.zzaZ();
    }

    public static zzgtr zze(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgtr) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public static zzhcx zzh() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzj(zzgtr zzgtrVar, zzgtx zzgtxVar) {
        zzgtxVar.getClass();
        zzgtrVar.zzf = zzgtxVar;
        zzgtrVar.zzc |= 1;
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
                return zzhbe.zzbS(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtr();
            case NEW_BUILDER:
                return new zzgtq(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgtr.class) {
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

    public final zzgtx zzf() {
        zzgtx zzgtxVar = this.zzf;
        return zzgtxVar == null ? zzgtx.zze() : zzgtxVar;
    }

    public final zzgzs zzg() {
        return this.zze;
    }
}
