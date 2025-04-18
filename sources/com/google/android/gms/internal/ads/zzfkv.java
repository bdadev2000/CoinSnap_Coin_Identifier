package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfkv extends zzgyx implements zzhaj {
    private static final zzfkv zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzfks zzd;

    static {
        zzfkv zzfkvVar = new zzfkv();
        zza = zzfkvVar;
        zzgyx.zzcb(zzfkv.class, zzfkvVar);
    }

    private zzfkv() {
    }

    public static zzfku zza() {
        return (zzfku) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzfkv zzb() {
        return zza;
    }

    public static /* synthetic */ void zzc(zzfkv zzfkvVar, zzfks zzfksVar) {
        zzfksVar.getClass();
        zzfkvVar.zzd = zzfksVar;
        zzfkvVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzfkw zzfkwVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfkv();
            case NEW_BUILDER:
                return new zzfku(zzfkwVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzfkv.class) {
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
