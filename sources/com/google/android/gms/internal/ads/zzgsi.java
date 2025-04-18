package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgsi extends zzgyx implements zzhaj {
    private static final zzgsi zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgsl zzd;
    private int zze;

    static {
        zzgsi zzgsiVar = new zzgsi();
        zza = zzgsiVar;
        zzgyx.zzcb(zzgsi.class, zzgsiVar);
    }

    private zzgsi() {
    }

    public static zzgsg zzb() {
        return (zzgsg) zza.zzaZ();
    }

    public static zzgsi zzd() {
        return zza;
    }

    public static /* synthetic */ void zzh(zzgsi zzgsiVar, zzgsl zzgslVar) {
        zzgslVar.getClass();
        zzgsiVar.zzd = zzgslVar;
        zzgsiVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzgsh zzgshVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgsi();
            case NEW_BUILDER:
                return new zzgsg(zzgshVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgsi.class) {
                        zzhaqVar = zzb;
                        if (zzhaqVar == null) {
                            zzhaqVar = new zzgys(zza);
                            zzb = zzhaqVar;
                        }
                    }
                }
                return zzhaqVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzgsl zzf() {
        zzgsl zzgslVar = this.zzd;
        return zzgslVar == null ? zzgsl.zzd() : zzgslVar;
    }
}
