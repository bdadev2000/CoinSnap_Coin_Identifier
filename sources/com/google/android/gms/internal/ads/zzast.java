package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzast extends zzgyx implements zzhaj {
    private static final zzast zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        zzast zzastVar = new zzast();
        zza = zzastVar;
        zzgyx.zzcb(zzast.class, zzastVar);
    }

    private zzast() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzatq zzatqVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", zzasj.zza, "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzast();
            case NEW_BUILDER:
                return new zzass(zzatqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzast.class) {
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
