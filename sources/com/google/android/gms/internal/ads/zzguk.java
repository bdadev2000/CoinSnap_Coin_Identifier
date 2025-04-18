package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzguk extends zzgyx implements zzhaj {
    private static final zzguk zza;
    private static volatile zzhaq zzb;
    private int zzc;
    private zzgua zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzguk zzgukVar = new zzguk();
        zza = zzgukVar;
        zzgyx.zzcb(zzguk.class, zzgukVar);
    }

    private zzguk() {
    }

    public static zzguj zzc() {
        return (zzguj) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzguk zzgukVar, zzgua zzguaVar) {
        zzguaVar.getClass();
        zzgukVar.zzd = zzguaVar;
        zzgukVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgua zzb() {
        zzgua zzguaVar = this.zzd;
        return zzguaVar == null ? zzgua.zzd() : zzguaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzgul zzgulVar = null;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguk();
            case NEW_BUILDER:
                return new zzguj(zzgulVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzguk.class) {
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

    public final zzgve zzf() {
        zzgve zzb2 = zzgve.zzb(this.zzg);
        return zzb2 == null ? zzgve.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int i10 = this.zze;
        int i11 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
