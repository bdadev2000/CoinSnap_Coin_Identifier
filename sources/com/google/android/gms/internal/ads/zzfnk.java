package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfnk extends zzhbo implements zzhdf {
    private static final zzfnk zza;
    private static volatile zzhdm zzb;
    private zzhca zzc = zzhbo.zzbK();

    static {
        zzfnk zzfnkVar = new zzfnk();
        zza = zzfnkVar;
        zzhbo.zzca(zzfnk.class, zzfnkVar);
    }

    private zzfnk() {
    }

    public static zzfnh zzc() {
        return (zzfnh) zza.zzaZ();
    }

    public static /* synthetic */ zzfnk zzd() {
        return zza;
    }

    public static /* synthetic */ void zze(zzfnk zzfnkVar) {
        zzfnkVar.zzc = zzhbo.zzbK();
    }

    public static /* synthetic */ void zzf(zzfnk zzfnkVar, zzfnj zzfnjVar) {
        zzfnjVar.getClass();
        zzhca zzhcaVar = zzfnkVar.zzc;
        if (!zzhcaVar.zzc()) {
            zzfnkVar.zzc = zzhbo.zzbL(zzhcaVar);
        }
        zzfnkVar.zzc.add(zzfnjVar);
    }

    public final int zza() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzfng zzfngVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfnj.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzfnk();
            case NEW_BUILDER:
                return new zzfnh(zzfngVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzfnk.class) {
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
