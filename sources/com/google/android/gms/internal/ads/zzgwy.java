package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgwy extends zzhbo implements zzhdf {
    private static final zzgwy zza;
    private static volatile zzhdm zzb;
    private String zzc = "";
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgwy zzgwyVar = new zzgwy();
        zza = zzgwyVar;
        zzhbo.zzca(zzgwy.class, zzgwyVar);
    }

    private zzgwy() {
    }

    public static zzgwx zza() {
        return (zzgwx) zza.zzaZ();
    }

    public static /* synthetic */ zzgwy zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzgwy zzgwyVar, String str) {
        str.getClass();
        zzgwyVar.zzc = str;
    }

    public static /* synthetic */ void zze(zzgwy zzgwyVar, zzgxn zzgxnVar) {
        zzgwyVar.zzf = zzgxnVar.zza();
    }

    public static /* synthetic */ void zzf(zzgwy zzgwyVar, zzgwj zzgwjVar) {
        zzgwyVar.zzd = zzgwjVar.zza();
    }

    public static /* synthetic */ void zzg(zzgwy zzgwyVar, int i9) {
        zzgwyVar.zze = i9;
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
                return zzhbo.zzbR(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwy();
            case NEW_BUILDER:
                return new zzgwx(zzgwvVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgwy.class) {
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
