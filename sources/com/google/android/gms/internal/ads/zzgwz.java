package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgwz extends zzhbo implements zzhdf {
    private static final zzgwz zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhca zzd = zzhbo.zzbK();

    static {
        zzgwz zzgwzVar = new zzgwz();
        zza = zzgwzVar;
        zzhbo.zzca(zzgwz.class, zzgwzVar);
    }

    private zzgwz() {
    }

    public static zzgww zza() {
        return (zzgww) zza.zzaZ();
    }

    public static /* synthetic */ zzgwz zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzgwz zzgwzVar, int i9) {
        zzgwzVar.zzc = i9;
    }

    public static /* synthetic */ void zze(zzgwz zzgwzVar, zzgwy zzgwyVar) {
        zzgwyVar.getClass();
        zzhca zzhcaVar = zzgwzVar.zzd;
        if (!zzhcaVar.zzc()) {
            zzgwzVar.zzd = zzhbo.zzbL(zzhcaVar);
        }
        zzgwzVar.zzd.add(zzgwyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgwv zzgwvVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgwy.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwz();
            case NEW_BUILDER:
                return new zzgww(zzgwvVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgwz.class) {
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
