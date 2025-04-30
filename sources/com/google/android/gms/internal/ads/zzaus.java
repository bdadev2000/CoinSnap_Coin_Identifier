package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;
import com.google.ar.core.ImageMetadata;

/* loaded from: classes2.dex */
public final class zzaus extends zzhbo implements zzhdf {
    private static final zzaus zza;
    private static volatile zzhdm zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzI;
    private long zzJ;
    private long zzK;
    private long zzM;
    private zzauu zzP;
    private zzaun zzaF;
    private long zzaL;
    private zzauc zzaO;
    private zzaue zzaP;
    private int zzaS;
    private long zzaT;
    private boolean zzaW;
    private long zzaY;
    private zzavh zzaZ;
    private zzaup zzah;
    private zzaur zzaj;
    private int zzau;
    private int zzav;
    private int zzaw;
    private zzavj zzax;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzu;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzf = "";
    private String zzg = "";
    private String zzv = "";
    private String zzF = "";
    private String zzG = "D";
    private String zzH = "";
    private String zzL = "";
    private long zzN = -1;
    private long zzO = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private long zzV = -1;
    private String zzW = "D";
    private String zzX = "D";
    private long zzY = -1;
    private int zzZ = 1000;
    private int zzaa = 1000;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private long zzaf = -1;
    private int zzag = 1000;
    private zzhca zzai = zzhbo.zzbK();
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private long zzar = -1;
    private String zzas = "D";
    private long zzat = -1;
    private long zzay = -1;
    private int zzaz = 1000;
    private int zzaA = 1000;
    private String zzaB = "D";
    private zzhca zzaC = zzhbo.zzbK();
    private int zzaD = 1000;
    private zzhca zzaE = zzhbo.zzbK();
    private String zzaG = "";
    private long zzaH = -1;
    private long zzaI = -1;
    private long zzaJ = -1;
    private long zzaK = -1;
    private long zzaM = -1;
    private String zzaN = "";
    private long zzaQ = -1;
    private long zzaR = -1;
    private String zzaU = "";
    private int zzaV = 2;
    private String zzaX = "";
    private long zzba = -1;
    private String zzbb = "";

    static {
        zzaus zzausVar = new zzaus();
        zza = zzausVar;
        zzhbo.zzca(zzaus.class, zzausVar);
    }

    private zzaus() {
    }

    public static /* synthetic */ void zzA(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 67108864;
        zzausVar.zzJ = j7;
    }

    public static /* synthetic */ void zzB(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 134217728;
        zzausVar.zzK = j7;
    }

    public static /* synthetic */ void zzC(zzaus zzausVar, String str) {
        str.getClass();
        zzausVar.zzc |= 268435456;
        zzausVar.zzL = str;
    }

    public static /* synthetic */ void zzD(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 536870912;
        zzausVar.zzM = j7;
    }

    public static /* synthetic */ void zzE(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 1073741824;
        zzausVar.zzN = j7;
    }

    public static /* synthetic */ void zzF(zzaus zzausVar, long j7) {
        zzausVar.zzc |= Integer.MIN_VALUE;
        zzausVar.zzO = j7;
    }

    public static /* synthetic */ void zzG(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 2;
        zzausVar.zzQ = j7;
    }

    public static /* synthetic */ void zzH(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 4;
        zzausVar.zzR = j7;
    }

    public static /* synthetic */ void zzI(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 8;
        zzausVar.zzS = j7;
    }

    public static /* synthetic */ void zzJ(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 16;
        zzausVar.zzT = j7;
    }

    public static /* synthetic */ void zzK(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 32;
        zzausVar.zzU = j7;
    }

    public static /* synthetic */ void zzL(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 64;
        zzausVar.zzV = j7;
    }

    public static /* synthetic */ void zzM(zzaus zzausVar, String str) {
        str.getClass();
        zzausVar.zzd |= 128;
        zzausVar.zzW = str;
    }

    public static /* synthetic */ void zzN(zzaus zzausVar, String str) {
        str.getClass();
        zzausVar.zzd |= NotificationCompat.FLAG_LOCAL_ONLY;
        zzausVar.zzX = str;
    }

    public static /* synthetic */ void zzO(zzaus zzausVar, zzavc zzavcVar) {
        zzausVar.zzZ = zzavcVar.zza();
        zzausVar.zzd |= 1024;
    }

    public static /* synthetic */ void zzP(zzaus zzausVar, zzavc zzavcVar) {
        zzausVar.zzaa = zzavcVar.zza();
        zzausVar.zzd |= 2048;
    }

    public static /* synthetic */ void zzQ(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 4096;
        zzausVar.zzab = j7;
    }

    public static /* synthetic */ void zzR(zzaus zzausVar, long j7) {
        zzausVar.zzd |= FragmentTransaction.TRANSIT_EXIT_MASK;
        zzausVar.zzac = j7;
    }

    public static /* synthetic */ void zzS(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 16384;
        zzausVar.zzad = j7;
    }

    public static /* synthetic */ void zzT(zzaus zzausVar, zzavc zzavcVar) {
        zzausVar.zzag = zzavcVar.zza();
        zzausVar.zzd |= 131072;
    }

    public static /* synthetic */ void zzU(zzaus zzausVar, zzaup zzaupVar) {
        zzaupVar.getClass();
        zzausVar.zzah = zzaupVar;
        zzausVar.zzd |= 262144;
    }

    public static /* synthetic */ void zzV(zzaus zzausVar, zzaup zzaupVar) {
        zzaupVar.getClass();
        zzhca zzhcaVar = zzausVar.zzai;
        if (!zzhcaVar.zzc()) {
            zzausVar.zzai = zzhbo.zzbL(zzhcaVar);
        }
        zzausVar.zzai.add(zzaupVar);
    }

    public static /* synthetic */ void zzX(zzaus zzausVar, zzaur zzaurVar) {
        zzaurVar.getClass();
        zzausVar.zzaj = zzaurVar;
        zzausVar.zzd |= ImageMetadata.LENS_APERTURE;
    }

    public static /* synthetic */ void zzY(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 2097152;
        zzausVar.zzal = j7;
    }

    public static /* synthetic */ void zzZ(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 4194304;
        zzausVar.zzam = j7;
    }

    public static zzatp zza() {
        return (zzatp) zza.zzaZ();
    }

    public static /* synthetic */ void zzaa(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 8388608;
        zzausVar.zzan = j7;
    }

    public static /* synthetic */ void zzab(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 67108864;
        zzausVar.zzaq = j7;
    }

    public static /* synthetic */ void zzac(zzaus zzausVar, long j7) {
        zzausVar.zzd |= 134217728;
        zzausVar.zzar = j7;
    }

    public static /* synthetic */ void zzad(zzaus zzausVar, String str) {
        str.getClass();
        zzausVar.zzd |= 268435456;
        zzausVar.zzas = str;
    }

    public static /* synthetic */ void zzae(zzaus zzausVar, zzavc zzavcVar) {
        zzausVar.zzaz = zzavcVar.zza();
        zzausVar.zze |= 8;
    }

    public static /* synthetic */ void zzaf(zzaus zzausVar, zzavc zzavcVar) {
        zzausVar.zzaA = zzavcVar.zza();
        zzausVar.zze |= 16;
    }

    public static /* synthetic */ void zzag(zzaus zzausVar, long j7) {
        zzausVar.zze |= 512;
        zzausVar.zzaH = j7;
    }

    public static /* synthetic */ void zzah(zzaus zzausVar, long j7) {
        zzausVar.zze |= 1024;
        zzausVar.zzaI = j7;
    }

    public static /* synthetic */ void zzai(zzaus zzausVar, long j7) {
        zzausVar.zze |= 2048;
        zzausVar.zzaJ = j7;
    }

    public static /* synthetic */ void zzaj(zzaus zzausVar, long j7) {
        zzausVar.zze |= 4096;
        zzausVar.zzaK = j7;
    }

    public static /* synthetic */ void zzak(zzaus zzausVar, String str) {
        str.getClass();
        zzausVar.zze |= 32768;
        zzausVar.zzaN = str;
    }

    public static /* synthetic */ void zzal(zzaus zzausVar, zzauh zzauhVar) {
        zzausVar.zzaS = zzauhVar.zza();
        zzausVar.zze |= 1048576;
    }

    public static /* synthetic */ void zzam(zzaus zzausVar, String str) {
        str.getClass();
        zzausVar.zze |= 4194304;
        zzausVar.zzaU = str;
    }

    public static /* synthetic */ void zzan(zzaus zzausVar, zzatx zzatxVar) {
        zzausVar.zzaV = zzatxVar.zza();
        zzausVar.zze |= 8388608;
    }

    public static /* synthetic */ void zzao(zzaus zzausVar, boolean z8) {
        zzausVar.zze |= 16777216;
        zzausVar.zzaW = z8;
    }

    public static /* synthetic */ void zzap(zzaus zzausVar, long j7) {
        zzausVar.zze |= 67108864;
        zzausVar.zzaY = j7;
    }

    public static zzaus zze() {
        return zza;
    }

    public static zzaus zzf(byte[] bArr, zzhay zzhayVar) throws zzhcd {
        return (zzaus) zzhbo.zzbx(zza, bArr, zzhayVar);
    }

    public static /* synthetic */ void zzj(zzaus zzausVar, String str) {
        str.getClass();
        zzausVar.zzc |= 1;
        zzausVar.zzf = str;
    }

    public static /* synthetic */ void zzk(zzaus zzausVar, String str) {
        str.getClass();
        zzausVar.zzc |= 2;
        zzausVar.zzg = str;
    }

    public static /* synthetic */ void zzl(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 4;
        zzausVar.zzh = j7;
    }

    public static /* synthetic */ void zzm(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 16;
        zzausVar.zzj = j7;
    }

    public static /* synthetic */ void zzn(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 32;
        zzausVar.zzk = j7;
    }

    public static /* synthetic */ void zzo(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 1024;
        zzausVar.zzp = j7;
    }

    public static /* synthetic */ void zzp(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 2048;
        zzausVar.zzu = j7;
    }

    public static /* synthetic */ void zzq(zzaus zzausVar, long j7) {
        zzausVar.zzc |= FragmentTransaction.TRANSIT_EXIT_MASK;
        zzausVar.zzw = j7;
    }

    public static /* synthetic */ void zzr(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 16384;
        zzausVar.zzx = j7;
    }

    public static /* synthetic */ void zzs(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 32768;
        zzausVar.zzy = j7;
    }

    public static /* synthetic */ void zzt(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 65536;
        zzausVar.zzz = j7;
    }

    public static /* synthetic */ void zzu(zzaus zzausVar, long j7) {
        zzausVar.zzc |= ImageMetadata.LENS_APERTURE;
        zzausVar.zzC = j7;
    }

    public static /* synthetic */ void zzv(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 1048576;
        zzausVar.zzD = j7;
    }

    public static /* synthetic */ void zzw(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 2097152;
        zzausVar.zzE = j7;
    }

    public static /* synthetic */ void zzx(zzaus zzausVar, String str) {
        str.getClass();
        zzausVar.zzc |= 4194304;
        zzausVar.zzF = str;
    }

    public static /* synthetic */ void zzy(zzaus zzausVar, String str) {
        str.getClass();
        zzausVar.zzc |= 16777216;
        zzausVar.zzH = str;
    }

    public static /* synthetic */ void zzz(zzaus zzausVar, long j7) {
        zzausVar.zzc |= 33554432;
        zzausVar.zzI = j7;
    }

    public final boolean zzaq() {
        return this.zzaW;
    }

    public final boolean zzar() {
        return (this.zzc & 4194304) != 0;
    }

    public final boolean zzas() {
        return (this.zze & 134217728) != 0;
    }

    public final zzatx zzc() {
        zzatx zzb2 = zzatx.zzb(this.zzaV);
        if (zzb2 == null) {
            return zzatx.DEVICE_IDENTIFIER_GLOBAL_ID;
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzato zzatoVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                zzhbu zzhbuVar = zzatw.zza;
                zzhbu zzhbuVar2 = zzavb.zza;
                return zzhbo.zzbR(zza, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzaT", "zzD", "zzE", "zzaU", "zzaY", "zzaV", zzhbuVar, "zzF", "zzaW", "zzH", "zzaX", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzai", zzaup.class, "zzU", "zzV", "zzW", "zzX", "zzZ", zzhbuVar2, "zzaa", zzhbuVar2, "zzah", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", zzhbuVar2, "zzaj", "zzak", "zzal", "zzam", "zzan", "zzaq", "zzar", "zzat", "zzau", zzauy.zza, "zzav", zzave.zza, "zzas", "zzaw", zzatr.zza, "zzax", "zzay", "zzao", "zzap", "zzaz", zzhbuVar2, "zzY", "zzG", "zzaA", zzhbuVar2, "zzaB", "zzaC", zzaul.class, "zzaD", zzhbuVar2, "zzaE", zzatu.class, "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", zzaug.zza, "zzaZ", "zzba", "zzbb"});
            case NEW_MUTABLE_INSTANCE:
                return new zzaus();
            case NEW_BUILDER:
                return new zzatp(zzatoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzaus.class) {
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

    public final zzavh zzg() {
        zzavh zzavhVar = this.zzaZ;
        if (zzavhVar == null) {
            return zzavh.zzd();
        }
        return zzavhVar;
    }

    public final String zzh() {
        return this.zzaU;
    }

    public final String zzi() {
        return this.zzF;
    }
}
