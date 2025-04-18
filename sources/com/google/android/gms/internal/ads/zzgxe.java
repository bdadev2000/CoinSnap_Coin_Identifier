package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgxe extends zzhbe implements zzhcq {
    private static final zzgxe zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private String zzd = "";
    private zzgwf zze;

    static {
        zzgxe zzgxeVar = new zzgxe();
        zza = zzgxeVar;
        zzhbe.zzcb(zzgxe.class, zzgxeVar);
    }

    private zzgxe() {
    }

    public static zzgxd zzc() {
        return (zzgxd) zza.zzaZ();
    }

    public static /* synthetic */ zzgxe zzd() {
        return zza;
    }

    public static zzgxe zze() {
        return zza;
    }

    public static zzgxe zzf(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        return (zzgxe) zzhbe.zzbr(zza, zzgzsVar, zzhaoVar);
    }

    public static /* synthetic */ void zzh(zzgxe zzgxeVar, String str) {
        str.getClass();
        zzgxeVar.zzd = str;
    }

    public static /* synthetic */ void zzi(zzgxe zzgxeVar, zzgwf zzgwfVar) {
        zzgwfVar.getClass();
        zzgxeVar.zze = zzgwfVar;
        zzgxeVar.zzc |= 1;
    }

    public final zzgwf zza() {
        zzgwf zzgwfVar = this.zze;
        return zzgwfVar == null ? zzgwf.zze() : zzgwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgxe();
            case NEW_BUILDER:
                return new zzgxd(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgxe.class) {
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

    public final String zzg() {
        return this.zzd;
    }
}
