package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgvo extends zzhbo implements zzhdf {
    private static final zzgvo zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhac zzd = zzhac.zzb;

    static {
        zzgvo zzgvoVar = new zzgvo();
        zza = zzgvoVar;
        zzhbo.zzca(zzgvo.class, zzgvoVar);
    }

    private zzgvo() {
    }

    public static zzgvn zzc() {
        return (zzgvn) zza.zzaZ();
    }

    public static /* synthetic */ zzgvo zzd() {
        return zza;
    }

    public static zzgvo zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgvo) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public static zzhdm zzg() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzh(zzgvo zzgvoVar, zzhac zzhacVar) {
        zzgvoVar.zzd = zzhacVar;
    }

    public final int zza() {
        return this.zzc;
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
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvo();
            case NEW_BUILDER:
                return new zzgvn(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgvo.class) {
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

    public final zzhac zzf() {
        return this.zzd;
    }
}
