package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzfmm extends zzhbe implements zzhcq {
    private static final zzfmm zza;
    private static volatile zzhcx zzb;
    private zzhbq zzc = zzhbe.zzbK();

    static {
        zzfmm zzfmmVar = new zzfmm();
        zza = zzfmmVar;
        zzhbe.zzcb(zzfmm.class, zzfmmVar);
    }

    private zzfmm() {
    }

    public static zzfmj zzc() {
        return (zzfmj) zza.zzaZ();
    }

    public static /* synthetic */ zzfmm zzd() {
        return zza;
    }

    public static /* synthetic */ void zze(zzfmm zzfmmVar) {
        zzfmmVar.zzc = zzhbe.zzbK();
    }

    public static /* synthetic */ void zzf(zzfmm zzfmmVar, zzfml zzfmlVar) {
        zzfmlVar.getClass();
        zzhbq zzhbqVar = zzfmmVar.zzc;
        if (!zzhbqVar.zzc()) {
            zzfmmVar.zzc = zzhbe.zzbL(zzhbqVar);
        }
        zzfmmVar.zzc.add(zzfmlVar);
    }

    public final int zza() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzfmi zzfmiVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfml.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzfmm();
            case NEW_BUILDER:
                return new zzfmj(zzfmiVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzfmm.class) {
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
