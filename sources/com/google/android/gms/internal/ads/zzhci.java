package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhci extends zzgyx implements zzhaj {
    private static final zzhci zza;
    private static volatile zzhaq zzb;
    private zzgzj zzc = zzgyx.zzbK();

    static {
        zzhci zzhciVar = new zzhci();
        zza = zzhciVar;
        zzgyx.zzcb(zzhci.class, zzhciVar);
    }

    private zzhci() {
    }

    public static zzhch zzc() {
        return (zzhch) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhci zzhciVar, zzhcg zzhcgVar) {
        zzhcgVar.getClass();
        zzgzj zzgzjVar = zzhciVar.zzc;
        if (!zzgzjVar.zzc()) {
            zzhciVar.zzc = zzgyx.zzbL(zzgzjVar);
        }
        zzhciVar.zzc.add(zzhcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzhcj zzhcjVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhcg.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzhci();
            case NEW_BUILDER:
                return new zzhch(zzhcjVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhci.class) {
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
