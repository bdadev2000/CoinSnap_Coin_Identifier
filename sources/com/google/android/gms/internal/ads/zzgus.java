package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgus extends zzhbe implements zzhcq {
    private static final zzgus zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzguv zzd;
    private int zze;

    static {
        zzgus zzgusVar = new zzgus();
        zza = zzgusVar;
        zzhbe.zzcb(zzgus.class, zzgusVar);
    }

    private zzgus() {
    }

    public static zzgur zzc() {
        return (zzgur) zza.zzaZ();
    }

    public static zzgus zze(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgus) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public static /* synthetic */ void zzg(zzgus zzgusVar, zzguv zzguvVar) {
        zzguvVar.getClass();
        zzgusVar.zzd = zzguvVar;
        zzgusVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgus();
            case NEW_BUILDER:
                return new zzgur(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgus.class) {
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
        zzguv zzguvVar = this.zzd;
        return zzguvVar == null ? zzguv.zze() : zzguvVar;
    }
}
