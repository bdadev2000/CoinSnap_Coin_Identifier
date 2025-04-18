package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgux extends zzgyx implements zzhaj {
    private static final zzgux zza;
    private static volatile zzhaq zzb;
    private String zzc = "";

    static {
        zzgux zzguxVar = new zzgux();
        zza = zzguxVar;
        zzgyx.zzcb(zzgux.class, zzguxVar);
    }

    private zzgux() {
    }

    public static zzguv zza() {
        return (zzguv) zza.zzaZ();
    }

    public static zzgux zzc() {
        return zza;
    }

    public static zzgux zzd(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        return (zzgux) zzgyx.zzbr(zza, zzgxpVar, zzgyhVar);
    }

    public static /* synthetic */ void zzg(zzgux zzguxVar, String str) {
        str.getClass();
        zzguxVar.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgux();
            case NEW_BUILDER:
                return new zzguv(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgux.class) {
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

    public final String zzf() {
        return this.zzc;
    }
}
