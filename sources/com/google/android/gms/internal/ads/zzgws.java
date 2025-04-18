package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgws extends zzhbe implements zzhcq {
    private static final zzgws zza;
    private static volatile zzhcx zzb;
    private int zzc;
    private zzhbq zzd = zzhbe.zzbK();

    static {
        zzgws zzgwsVar = new zzgws();
        zza = zzgwsVar;
        zzhbe.zzcb(zzgws.class, zzgwsVar);
    }

    private zzgws() {
    }

    public static zzgwp zza() {
        return (zzgwp) zza.zzaZ();
    }

    public static /* synthetic */ zzgws zzc() {
        return zza;
    }

    public static /* synthetic */ void zzd(zzgws zzgwsVar, int i2) {
        zzgwsVar.zzc = i2;
    }

    public static /* synthetic */ void zze(zzgws zzgwsVar, zzgwr zzgwrVar) {
        zzgwrVar.getClass();
        zzhbq zzhbqVar = zzgwsVar.zzd;
        if (!zzhbqVar.zzc()) {
            zzgwsVar.zzd = zzhbe.zzbL(zzhbqVar);
        }
        zzgwsVar.zzd.add(zzgwrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzgwo zzgwoVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgwr.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgws();
            case NEW_BUILDER:
                return new zzgwp(zzgwoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzgws.class) {
                        try {
                            zzhcxVar = zzb;
                            if (zzhcxVar == null) {
                                zzhcxVar = new zzhaz(zza);
                                zzb = zzhcxVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhcxVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
