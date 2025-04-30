package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhij extends zzhbo implements zzhdf {
    private static final zzhij zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzhac zzf;
    private zzhac zzg;

    static {
        zzhij zzhijVar = new zzhij();
        zza = zzhijVar;
        zzhbo.zzca(zzhij.class, zzhijVar);
    }

    private zzhij() {
        zzhac zzhacVar = zzhac.zzb;
        this.zzf = zzhacVar;
        this.zzg = zzhacVar;
    }

    public static zzhif zzc() {
        return (zzhif) zza.zzaZ();
    }

    public static /* synthetic */ zzhij zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhij zzhijVar, zzhii zzhiiVar) {
        zzhijVar.zzd = zzhiiVar.zza();
        zzhijVar.zzc |= 1;
    }

    public static /* synthetic */ void zzg(zzhij zzhijVar, String str) {
        zzhijVar.zzc |= 2;
        zzhijVar.zze = "image/png";
    }

    public static /* synthetic */ void zzh(zzhij zzhijVar, zzhac zzhacVar) {
        zzhacVar.getClass();
        zzhijVar.zzc |= 4;
        zzhijVar.zzf = zzhacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzhfr zzhfrVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhih.zza, "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhij();
            case NEW_BUILDER:
                return new zzhif(zzhfrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhij.class) {
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
}
