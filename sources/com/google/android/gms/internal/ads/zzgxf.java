package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgxf extends zzhbo implements zzhdf {
    private static final zzgxf zza;
    private static volatile zzhdm zzb;
    private String zzc = "";

    static {
        zzgxf zzgxfVar = new zzgxf();
        zza = zzgxfVar;
        zzhbo.zzca(zzgxf.class, zzgxfVar);
    }

    private zzgxf() {
    }

    public static zzgxe zza() {
        return (zzgxe) zza.zzaZ();
    }

    public static zzgxf zzd() {
        return zza;
    }

    public static zzgxf zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgxf) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public static /* synthetic */ void zzg(zzgxf zzgxfVar, String str) {
        str.getClass();
        zzgxfVar.zzc = str;
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
                return zzhbo.zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgxf();
            case NEW_BUILDER:
                return new zzgxe(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgxf.class) {
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

    public final String zzf() {
        return this.zzc;
    }
}
