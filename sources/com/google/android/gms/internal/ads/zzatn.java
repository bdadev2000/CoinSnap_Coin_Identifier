package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzatn extends zzgyx implements zzhaj {
    private static final zzatn zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzatn zzatnVar = new zzatn();
        zza = zzatnVar;
        zzgyx.zzcb(zzatn.class, zzatnVar);
    }

    private zzatn() {
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
                return zzgyx.zzbS(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzatn();
            case NEW_BUILDER:
                return new zzatm(zzatqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzatn.class) {
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
