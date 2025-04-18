package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzheu extends zzhbe implements zzhcq {
    private static final zzheu zza;
    private static volatile zzhcx zzb;
    private zzhbq zzc = zzhbe.zzbK();

    static {
        zzheu zzheuVar = new zzheu();
        zza = zzheuVar;
        zzhbe.zzcb(zzheu.class, zzheuVar);
    }

    private zzheu() {
    }

    public static zzhet zzc() {
        return (zzhet) zza.zzaZ();
    }

    public static /* synthetic */ void zze(zzheu zzheuVar, zzhes zzhesVar) {
        zzhesVar.getClass();
        zzhbq zzhbqVar = zzheuVar.zzc;
        if (!zzhbqVar.zzc()) {
            zzheuVar.zzc = zzhbe.zzbL(zzhbqVar);
        }
        zzheuVar.zzc.add(zzhesVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzheq zzheqVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbe.zzbS(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhes.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzheu();
            case NEW_BUILDER:
                return new zzhet(zzheqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzheu.class) {
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
