package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgrw extends zzgyx implements zzhaj {
    private static final zzgrw zza;
    private static volatile zzhaq zzb;
    private int zzc;

    static {
        zzgrw zzgrwVar = new zzgrw();
        zza = zzgrwVar;
        zzgyx.zzcb(zzgrw.class, zzgrwVar);
    }

    private zzgrw() {
    }

    public static zzgru zzb() {
        return (zzgru) zza.zzaZ();
    }

    public static zzgrw zzd() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzgrv zzgrvVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgrw();
            case NEW_BUILDER:
                return new zzgru(zzgrvVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgrw.class) {
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
}
