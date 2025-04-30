package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgwm extends zzhbo implements zzhdf {
    private static final zzgwm zza;
    private static volatile zzhdm zzb;
    private String zzc = "";
    private zzhac zzd = zzhac.zzb;
    private int zze;

    static {
        zzgwm zzgwmVar = new zzgwm();
        zza = zzgwmVar;
        zzhbo.zzca(zzgwm.class, zzgwmVar);
    }

    private zzgwm() {
    }

    public static zzgwl zza() {
        return (zzgwl) zza.zzaZ();
    }

    public static zzgwl zzc(zzgwm zzgwmVar) {
        return (zzgwl) zza.zzba(zzgwmVar);
    }

    public static zzgwm zze() {
        return zza;
    }

    public static zzgwm zzf(byte[] bArr, zzhay zzhayVar) throws zzhcd {
        return (zzgwm) zzhbo.zzbx(zza, bArr, zzhayVar);
    }

    public static /* synthetic */ void zzj(zzgwm zzgwmVar, String str) {
        str.getClass();
        zzgwmVar.zzc = str;
    }

    public static /* synthetic */ void zzk(zzgwm zzgwmVar, zzhac zzhacVar) {
        zzhacVar.getClass();
        zzgwmVar.zzd = zzhacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgwk zzgwkVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwm();
            case NEW_BUILDER:
                return new zzgwl(zzgwkVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgwm.class) {
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

    public final zzgxn zzg() {
        zzgxn zzb2 = zzgxn.zzb(this.zze);
        if (zzb2 == null) {
            return zzgxn.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final zzhac zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}
