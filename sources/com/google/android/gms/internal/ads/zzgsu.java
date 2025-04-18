package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgsu extends zzgyx implements zzhaj {
    private static final zzgsu zza;
    private static volatile zzhaq zzb;
    private int zzc;

    static {
        zzgsu zzgsuVar = new zzgsu();
        zza = zzgsuVar;
        zzgyx.zzcb(zzgsu.class, zzgsuVar);
    }

    private zzgsu() {
    }

    public static zzgss zzb() {
        return (zzgss) zza.zzaZ();
    }

    public static zzgsu zzd() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzgst zzgstVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgsu();
            case NEW_BUILDER:
                return new zzgss(zzgstVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgsu.class) {
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
