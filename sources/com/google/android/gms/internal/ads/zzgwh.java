package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgwh extends zzhbo implements zzhdf {
    private static final zzgwh zza;
    private static volatile zzhdm zzb;
    private String zzc = "";
    private zzhac zzd = zzhac.zzb;
    private int zze;

    static {
        zzgwh zzgwhVar = new zzgwh();
        zza = zzgwhVar;
        zzhbo.zzca(zzgwh.class, zzgwhVar);
    }

    private zzgwh() {
    }

    public static zzgwe zza() {
        return (zzgwe) zza.zzaZ();
    }

    public static zzgwh zze() {
        return zza;
    }

    public static /* synthetic */ void zzh(zzgwh zzgwhVar, String str) {
        str.getClass();
        zzgwhVar.zzc = str;
    }

    public static /* synthetic */ void zzi(zzgwh zzgwhVar, zzhac zzhacVar) {
        zzhacVar.getClass();
        zzgwhVar.zzd = zzhacVar;
    }

    public final zzgwg zzc() {
        zzgwg zzb2 = zzgwg.zzb(this.zze);
        if (zzb2 == null) {
            return zzgwg.UNRECOGNIZED;
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgwd zzgwdVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwh();
            case NEW_BUILDER:
                return new zzgwe(zzgwdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgwh.class) {
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

    public final String zzg() {
        return this.zzc;
    }
}
