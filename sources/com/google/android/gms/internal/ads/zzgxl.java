package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgxl extends zzhbo implements zzhdf {
    private static final zzgxl zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private String zzd = "";
    private zzgwm zze;

    static {
        zzgxl zzgxlVar = new zzgxl();
        zza = zzgxlVar;
        zzhbo.zzca(zzgxl.class, zzgxlVar);
    }

    private zzgxl() {
    }

    public static zzgxk zzc() {
        return (zzgxk) zza.zzaZ();
    }

    public static zzgxl zze() {
        return zza;
    }

    public static zzgxl zzf(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgxl) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public static /* synthetic */ void zzh(zzgxl zzgxlVar, String str) {
        str.getClass();
        zzgxlVar.zzd = str;
    }

    public static /* synthetic */ void zzi(zzgxl zzgxlVar, zzgwm zzgwmVar) {
        zzgwmVar.getClass();
        zzgxlVar.zze = zzgwmVar;
        zzgxlVar.zzc |= 1;
    }

    public final zzgwm zza() {
        zzgwm zzgwmVar = this.zze;
        if (zzgwmVar == null) {
            return zzgwm.zze();
        }
        return zzgwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgxj zzgxjVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgxl();
            case NEW_BUILDER:
                return new zzgxk(zzgxjVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgxl.class) {
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

    public final String zzg() {
        return this.zzd;
    }
}
