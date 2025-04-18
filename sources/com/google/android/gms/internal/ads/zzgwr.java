package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgwr extends zzhbe implements zzhcq {
    private static final zzgwr zza;
    private static volatile zzhcx zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgwr zzgwrVar = new zzgwr();
        zza = zzgwrVar;
        zzhbe.zzcb(zzgwr.class, zzgwrVar);
    }

    private zzgwr() {
    }

    public static zzgwq zza() {
        return (zzgwq) zza.zzaZ();
    }

    public static /* synthetic */ zzgwr zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzgwr zzgwrVar, String str) {
        str.getClass();
        zzgwrVar.zzc = str;
    }

    public static /* synthetic */ void zze(zzgwr zzgwrVar, zzgxf zzgxfVar) {
        zzgwrVar.zzf = zzgxfVar.zza();
    }

    public static /* synthetic */ void zzf(zzgwr zzgwrVar, int i2) {
        zzgwrVar.zze = i2;
    }

    public static /* synthetic */ void zzg(zzgwr zzgwrVar, int i2) {
        zzgwrVar.zzd = zzgwc.zza(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzgwo zzgwoVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwr();
            case NEW_BUILDER:
                return new zzgwq(zzgwoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgwr.class) {
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
}
