package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzhes extends zzgyx implements zzhaj {
    private static final zzhes zza;
    private static volatile zzhaq zzb;
    private zzheo zzC;
    private zzhcz zzE;
    private zzhcr zzG;
    private zzhds zzI;
    private int zzJ;
    private long zzM;
    private zzher zzN;
    private zzhdx zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private zzhcv zzi;
    private zzhed zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private zzhek zzx;
    private boolean zzy;
    private byte zzQ = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private zzgzj zzj = zzgyx.zzbK();
    private zzgzj zzk = zzgyx.zzbK();
    private String zzl = "";
    private zzgzj zzo = zzgyx.zzbK();
    private String zzp = "";
    private zzgxp zzw = zzgxp.zzb;
    private String zzz = "";
    private zzgzj zzA = zzgyx.zzbK();
    private zzgzj zzB = zzgyx.zzbK();
    private zzgzj zzD = zzgyx.zzbK();
    private String zzF = "";
    private zzgzj zzH = zzgyx.zzbK();
    private zzgzj zzK = zzgyx.zzbK();
    private zzgzj zzL = zzgyx.zzbK();
    private String zzP = "";

    static {
        zzhes zzhesVar = new zzhes();
        zza = zzhesVar;
        zzgyx.zzcb(zzhes.class, zzhesVar);
    }

    private zzhes() {
    }

    public static zzhct zzc() {
        return (zzhct) zza.zzaZ();
    }

    public static /* synthetic */ void zzi(zzhes zzhesVar, Iterable iterable) {
        zzgzj zzgzjVar = zzhesVar.zzA;
        if (!zzgzjVar.zzc()) {
            zzhesVar.zzA = zzgyx.zzbL(zzgzjVar);
        }
        zzgwy.zzaQ(iterable, zzhesVar.zzA);
    }

    public static /* synthetic */ void zzj(zzhes zzhesVar, Iterable iterable) {
        zzgzj zzgzjVar = zzhesVar.zzB;
        if (!zzgzjVar.zzc()) {
            zzhesVar.zzB = zzgyx.zzbL(zzgzjVar);
        }
        zzgwy.zzaQ(iterable, zzhesVar.zzB);
    }

    public static /* synthetic */ void zzk(zzhes zzhesVar, zzhei zzheiVar) {
        zzheiVar.getClass();
        zzgzj zzgzjVar = zzhesVar.zzj;
        if (!zzgzjVar.zzc()) {
            zzhesVar.zzj = zzgyx.zzbL(zzgzjVar);
        }
        zzhesVar.zzj.add(zzheiVar);
    }

    public static /* synthetic */ void zzl(zzhes zzhesVar) {
        zzhesVar.zzc &= -65;
        zzhesVar.zzl = zza.zzl;
    }

    public static /* synthetic */ void zzm(zzhes zzhesVar, String str) {
        zzhesVar.zzc |= 64;
        zzhesVar.zzl = str;
    }

    public static /* synthetic */ void zzn(zzhes zzhesVar, zzhek zzhekVar) {
        zzhekVar.getClass();
        zzhesVar.zzx = zzhekVar;
        zzhesVar.zzc |= 8192;
    }

    public static /* synthetic */ void zzo(zzhes zzhesVar, zzhcv zzhcvVar) {
        zzhcvVar.getClass();
        zzhesVar.zzi = zzhcvVar;
        zzhesVar.zzc |= 32;
    }

    public static /* synthetic */ void zzp(zzhes zzhesVar, String str) {
        str.getClass();
        zzhesVar.zzc |= 8;
        zzhesVar.zzg = str;
    }

    public static /* synthetic */ void zzq(zzhes zzhesVar, zzhed zzhedVar) {
        zzhedVar.getClass();
        zzhesVar.zzm = zzhedVar;
        zzhesVar.zzc |= 128;
    }

    public static /* synthetic */ void zzr(zzhes zzhesVar, String str) {
        str.getClass();
        zzhesVar.zzc |= 4;
        zzhesVar.zzf = str;
    }

    public static /* synthetic */ void zzs(zzhes zzhesVar, int i10) {
        zzhesVar.zzd = i10 - 1;
        zzhesVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        byte b3 = 1;
        switch (zzgywVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b3 = 0;
                }
                this.zzQ = b3;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyx.zzbS(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhei.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhee.zza, "zze", zzhcs.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhew.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhfc.class, "zzE", "zzF", "zzG", "zzH", zzhdd.class, "zzI", "zzJ", zzhem.zza, "zzK", zzhdv.class, "zzL", zzhea.class, "zzM", "zzN", "zzO", "zzP"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhes();
            case NEW_BUILDER:
                return new zzhct(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzhes.class) {
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
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }
}
