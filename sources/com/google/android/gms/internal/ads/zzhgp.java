package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhgp extends zzhbo implements zzhdf {
    private static final zzhgp zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhgp zzhgpVar = new zzhgp();
        zza = zzhgpVar;
        zzhbo.zzca(zzhgp.class, zzhgpVar);
    }

    private zzhgp() {
    }

    public static zzhgo zzc() {
        return (zzhgo) zza.zzaZ();
    }

    public static /* synthetic */ zzhgp zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhgp zzhgpVar, String str) {
        zzhgpVar.zzc |= 1;
        zzhgpVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzhfr zzhfrVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhgp();
            case NEW_BUILDER:
                return new zzhgo(zzhfrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhgp.class) {
                        try {
                            zzhdmVar = zzb;
                            if (zzhdmVar == null) {
                                zzhdmVar = new zzhbj(zza);
                                zzb = zzhdmVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzhdmVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
