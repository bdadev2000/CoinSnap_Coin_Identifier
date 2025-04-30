package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfsd extends zzhbo implements zzhdf {
    private static final zzhbx zza = new zzfry();
    private static final zzfsd zzb;
    private static volatile zzhdm zzc;
    private int zzd;
    private zzhbw zze = zzhbo.zzbG();
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzfsd zzfsdVar = new zzfsd();
        zzb = zzfsdVar;
        zzhbo.zzca(zzfsd.class, zzfsdVar);
    }

    private zzfsd() {
    }

    public static zzfsc zza() {
        return (zzfsc) zzb.zzaZ();
    }

    public static /* synthetic */ void zzd(zzfsd zzfsdVar, zzfsb zzfsbVar) {
        zzfsbVar.getClass();
        zzhbw zzhbwVar = zzfsdVar.zze;
        if (!zzhbwVar.zzc()) {
            zzfsdVar.zze = zzhbo.zzbH(zzhbwVar);
        }
        zzfsdVar.zze.zzi(zzfsbVar.zza());
    }

    public static /* synthetic */ void zze(zzfsd zzfsdVar, String str) {
        str.getClass();
        zzfsdVar.zzd |= 1;
        zzfsdVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzd", "zze", zzfsa.zza, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfsd();
            case NEW_BUILDER:
                return new zzfsc(null);
            case GET_DEFAULT_INSTANCE:
                return zzb;
            case GET_PARSER:
                zzhdm zzhdmVar = zzc;
                if (zzhdmVar == null) {
                    synchronized (zzfsd.class) {
                        try {
                            zzhdmVar = zzc;
                            if (zzhdmVar == null) {
                                zzhdmVar = new zzhbj(zzb);
                                zzc = zzhdmVar;
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
