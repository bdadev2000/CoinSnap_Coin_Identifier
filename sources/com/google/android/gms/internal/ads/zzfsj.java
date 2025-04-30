package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfsj extends zzhbo implements zzhdf {
    private static final zzfsj zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfsd zzg;

    static {
        zzfsj zzfsjVar = new zzfsj();
        zza = zzfsjVar;
        zzhbo.zzca(zzfsj.class, zzfsjVar);
    }

    private zzfsj() {
    }

    public static zzfsf zza() {
        return (zzfsf) zza.zzaZ();
    }

    public static /* synthetic */ zzfsj zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzfsj zzfsjVar, zzfsi zzfsiVar) {
        zzfsjVar.zzd = zzfsiVar.zza();
        zzfsjVar.zzc |= 1;
    }

    public static /* synthetic */ void zze(zzfsj zzfsjVar, String str) {
        str.getClass();
        zzfsjVar.zzc |= 2;
        zzfsjVar.zze = str;
    }

    public static /* synthetic */ void zzf(zzfsj zzfsjVar, zzfsd zzfsdVar) {
        zzfsdVar.getClass();
        zzfsjVar.zzg = zzfsdVar;
        zzfsjVar.zzc |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzfse zzfseVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfsh.zza, "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfsj();
            case NEW_BUILDER:
                return new zzfsf(zzfseVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzfsj.class) {
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
