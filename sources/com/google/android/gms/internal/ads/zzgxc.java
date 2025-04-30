package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgxc extends zzhbo implements zzhdf {
    private static final zzgxc zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzgxf zze;

    static {
        zzgxc zzgxcVar = new zzgxc();
        zza = zzgxcVar;
        zzhbo.zzca(zzgxc.class, zzgxcVar);
    }

    private zzgxc() {
    }

    public static zzgxb zzc() {
        return (zzgxb) zza.zzaZ();
    }

    public static zzgxc zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgxc) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public static zzhdm zzg() {
        return zza.zzbM();
    }

    public static /* synthetic */ void zzh(zzgxc zzgxcVar, zzgxf zzgxfVar) {
        zzgxfVar.getClass();
        zzgxcVar.zze = zzgxfVar;
        zzgxcVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
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
                return zzhbo.zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgxc();
            case NEW_BUILDER:
                return new zzgxb(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzgxc.class) {
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

    public final zzgxf zzf() {
        zzgxf zzgxfVar = this.zze;
        if (zzgxfVar == null) {
            return zzgxf.zzd();
        }
        return zzgxfVar;
    }
}
