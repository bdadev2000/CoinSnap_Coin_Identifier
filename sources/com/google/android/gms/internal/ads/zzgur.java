package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgur extends zzgyx implements zzhaj {
    private static final zzgur zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgzj zzd = zzgyx.zzbK();

    static {
        zzgur zzgurVar = new zzgur();
        zza = zzgurVar;
        zzgyx.zzcb(zzgur.class, zzgurVar);
    }

    private zzgur() {
    }

    public static zzgun zza() {
        return (zzgun) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzgur zzb() {
        return zza;
    }

    public static /* synthetic */ void zzc(zzgur zzgurVar, zzgup zzgupVar) {
        zzgupVar.getClass();
        zzgzj zzgzjVar = zzgurVar.zzd;
        if (!zzgzjVar.zzc()) {
            zzgurVar.zzd = zzgyx.zzbL(zzgzjVar);
        }
        zzgurVar.zzd.add(zzgupVar);
    }

    public static /* synthetic */ void zzd(zzgur zzgurVar, int i10) {
        zzgurVar.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzguq zzguqVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgup.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgur();
            case NEW_BUILDER:
                return new zzgun(zzguqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzgur.class) {
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
