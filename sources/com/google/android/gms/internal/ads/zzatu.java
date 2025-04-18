package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzatu extends zzhbe implements zzhcq {
    private static final zzatu zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzhbq zzd = zzhbe.zzbK();
    private zzgzs zze = zzgzs.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzatu zzatuVar = new zzatu();
        zza = zzatuVar;
        zzhbe.zzcb(zzatu.class, zzatuVar);
    }

    private zzatu() {
    }

    public static zzatt zza() {
        return (zzatt) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzatu zzatuVar, zzgzs zzgzsVar) {
        zzhbq zzhbqVar = zzatuVar.zzd;
        if (!zzhbqVar.zzc()) {
            zzatuVar.zzd = zzhbe.zzbL(zzhbqVar);
        }
        zzatuVar.zzd.add(zzgzsVar);
    }

    public static /* synthetic */ void zze(zzatu zzatuVar, zzgzs zzgzsVar) {
        zzatuVar.zzc |= 1;
        zzatuVar.zze = zzgzsVar;
    }

    public static /* synthetic */ void zzf(zzatu zzatuVar, int i2) {
        zzatuVar.zzg = 4;
        zzatuVar.zzc = 4 | zzatuVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzato.zza, "zzg", zzatm.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzatu();
            case NEW_BUILDER:
                return new zzatt(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzatu.class) {
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
