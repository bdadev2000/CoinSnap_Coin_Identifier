package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes3.dex */
public final class zzata extends zzgyx implements zzhaj {
    private static final zzata zza;
    private static volatile zzhaq zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzI;
    private long zzJ;
    private long zzK;
    private long zzM;
    private zzatc zzP;
    private zzasv zzaF;
    private long zzaL;
    private zzasn zzaO;
    private zzasp zzaP;
    private int zzaS;
    private long zzaT;
    private boolean zzaW;
    private long zzaY;
    private zzatl zzaZ;
    private zzasx zzah;
    private zzasz zzaj;
    private int zzau;
    private int zzav;
    private int zzaw;
    private zzatn zzax;
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
    private zzgzj zzai = zzgyx.zzbK();
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
    private zzgzj zzaC = zzgyx.zzbK();
    private int zzaD = 1000;
    private zzgzj zzaE = zzgyx.zzbK();
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
        zzata zzataVar = new zzata();
        zza = zzataVar;
        zzgyx.zzcb(zzata.class, zzataVar);
    }

    private zzata() {
    }

    public static /* synthetic */ void zzA(zzata zzataVar, String str) {
        str.getClass();
        zzataVar.zze |= 4194304;
        zzataVar.zzaU = str;
    }

    public static /* synthetic */ void zzB(zzata zzataVar, long j3) {
        zzataVar.zze |= 67108864;
        zzataVar.zzaY = j3;
    }

    public static /* synthetic */ void zzC(zzata zzataVar, long j3) {
        zzataVar.zze |= 4096;
        zzataVar.zzaK = j3;
    }

    public static /* synthetic */ void zzD(zzata zzataVar, long j3) {
        zzataVar.zze |= 2048;
        zzataVar.zzaJ = j3;
    }

    public static /* synthetic */ void zzE(zzata zzataVar, String str) {
        str.getClass();
        zzataVar.zzd |= NotificationCompat.FLAG_LOCAL_ONLY;
        zzataVar.zzX = str;
    }

    public static /* synthetic */ void zzF(zzata zzataVar, String str) {
        str.getClass();
        zzataVar.zzc |= 4194304;
        zzataVar.zzF = str;
    }

    public static /* synthetic */ void zzG(zzata zzataVar, long j3) {
        zzataVar.zzc |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        zzataVar.zzD = j3;
    }

    public static /* synthetic */ void zzH(zzata zzataVar, long j3) {
        zzataVar.zzc |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        zzataVar.zzp = j3;
    }

    public static /* synthetic */ void zzI(zzata zzataVar, long j3) {
        zzataVar.zzc |= 2048;
        zzataVar.zzu = j3;
    }

    public static /* synthetic */ void zzJ(zzata zzataVar, String str) {
        str.getClass();
        zzataVar.zzc |= 1;
        zzataVar.zzf = str;
    }

    public static /* synthetic */ void zzK(zzata zzataVar, long j3) {
        zzataVar.zzd |= 4194304;
        zzataVar.zzam = j3;
    }

    public static /* synthetic */ void zzL(zzata zzataVar, long j3) {
        zzataVar.zzc |= 524288;
        zzataVar.zzC = j3;
    }

    public static /* synthetic */ void zzM(zzata zzataVar, long j3) {
        zzataVar.zzd |= 8388608;
        zzataVar.zzan = j3;
    }

    public static /* synthetic */ void zzN(zzata zzataVar, long j3) {
        zzataVar.zzd |= 64;
        zzataVar.zzV = j3;
    }

    public static /* synthetic */ void zzO(zzata zzataVar, long j3) {
        zzataVar.zzd |= 16;
        zzataVar.zzT = j3;
    }

    public static /* synthetic */ void zzP(zzata zzataVar, long j3) {
        zzataVar.zzc |= Integer.MIN_VALUE;
        zzataVar.zzO = j3;
    }

    public static /* synthetic */ void zzQ(zzata zzataVar, long j3) {
        zzataVar.zzd |= 8;
        zzataVar.zzS = j3;
    }

    public static /* synthetic */ void zzR(zzata zzataVar, long j3) {
        zzataVar.zzd |= 4;
        zzataVar.zzR = j3;
    }

    public static /* synthetic */ void zzS(zzata zzataVar, long j3) {
        zzataVar.zzc |= 1073741824;
        zzataVar.zzN = j3;
    }

    public static /* synthetic */ void zzT(zzata zzataVar, long j3) {
        zzataVar.zzc |= 32768;
        zzataVar.zzy = j3;
    }

    public static /* synthetic */ void zzU(zzata zzataVar, long j3) {
        zzataVar.zzd |= 2;
        zzataVar.zzQ = j3;
    }

    public static /* synthetic */ void zzV(zzata zzataVar, long j3) {
        zzataVar.zzc |= 8192;
        zzataVar.zzw = j3;
    }

    public static /* synthetic */ void zzW(zzata zzataVar, long j3) {
        zzataVar.zzc |= JsonLexerKt.BATCH_SIZE;
        zzataVar.zzx = j3;
    }

    public static /* synthetic */ void zzX(zzata zzataVar, long j3) {
        zzataVar.zzd |= JsonLexerKt.BATCH_SIZE;
        zzataVar.zzad = j3;
    }

    public static /* synthetic */ void zzY(zzata zzataVar, long j3) {
        zzataVar.zze |= 512;
        zzataVar.zzaH = j3;
    }

    public static /* synthetic */ void zzZ(zzata zzataVar, zzasx zzasxVar) {
        zzasxVar.getClass();
        zzataVar.zzah = zzasxVar;
        zzataVar.zzd |= 262144;
    }

    public static zzasf zza() {
        return (zzasf) zza.zzaZ();
    }

    public static /* synthetic */ void zzaa(zzata zzataVar, long j3) {
        zzataVar.zzc |= 67108864;
        zzataVar.zzJ = j3;
    }

    public static /* synthetic */ void zzab(zzata zzataVar, long j3) {
        zzataVar.zzc |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        zzataVar.zzz = j3;
    }

    public static /* synthetic */ void zzac(zzata zzataVar, long j3) {
        zzataVar.zzc |= 2097152;
        zzataVar.zzE = j3;
    }

    public static /* synthetic */ void zzad(zzata zzataVar, long j3) {
        zzataVar.zzc |= 134217728;
        zzataVar.zzK = j3;
    }

    public static /* synthetic */ void zzae(zzata zzataVar, long j3) {
        zzataVar.zzc |= 33554432;
        zzataVar.zzI = j3;
    }

    public static /* synthetic */ void zzaf(zzata zzataVar, long j3) {
        zzataVar.zzc |= 536870912;
        zzataVar.zzM = j3;
    }

    public static /* synthetic */ void zzag(zzata zzataVar, zzasz zzaszVar) {
        zzaszVar.getClass();
        zzataVar.zzaj = zzaszVar;
        zzataVar.zzd |= 524288;
    }

    public static /* synthetic */ void zzah(zzata zzataVar, String str) {
        str.getClass();
        zzataVar.zzc |= 268435456;
        zzataVar.zzL = str;
    }

    public static /* synthetic */ void zzam(zzata zzataVar, int i10) {
        zzataVar.zzaa = i10 - 1;
        zzataVar.zzd |= 2048;
    }

    public static /* synthetic */ void zzan(zzata zzataVar, int i10) {
        zzataVar.zzaV = 5;
        zzataVar.zze |= 8388608;
    }

    public static /* synthetic */ void zzao(zzata zzataVar, int i10) {
        zzataVar.zzag = i10 - 1;
        zzataVar.zzd |= 131072;
    }

    public static /* synthetic */ void zzap(zzata zzataVar, int i10) {
        zzataVar.zzaA = i10 - 1;
        zzataVar.zze |= 16;
    }

    public static /* synthetic */ void zzaq(zzata zzataVar, int i10) {
        zzataVar.zzaS = i10 - 1;
        zzataVar.zze |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
    }

    public static /* synthetic */ void zzar(zzata zzataVar, int i10) {
        zzataVar.zzaz = i10 - 1;
        zzataVar.zze |= 8;
    }

    public static /* synthetic */ void zzas(zzata zzataVar, int i10) {
        zzataVar.zzZ = i10 - 1;
        zzataVar.zzd |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
    }

    public static zzata zzc() {
        return zza;
    }

    public static zzata zzd(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
        return (zzata) zzgyx.zzbx(zza, bArr, zzgyhVar);
    }

    public static /* synthetic */ void zzi(zzata zzataVar, zzasx zzasxVar) {
        zzasxVar.getClass();
        zzgzj zzgzjVar = zzataVar.zzai;
        if (!zzgzjVar.zzc()) {
            zzataVar.zzai = zzgyx.zzbL(zzgzjVar);
        }
        zzataVar.zzai.add(zzasxVar);
    }

    public static /* synthetic */ void zzk(zzata zzataVar, long j3) {
        zzataVar.zzd |= 67108864;
        zzataVar.zzaq = j3;
    }

    public static /* synthetic */ void zzl(zzata zzataVar, String str) {
        str.getClass();
        zzataVar.zzd |= 268435456;
        zzataVar.zzas = str;
    }

    public static /* synthetic */ void zzm(zzata zzataVar, long j3) {
        zzataVar.zzd |= 134217728;
        zzataVar.zzar = j3;
    }

    public static /* synthetic */ void zzn(zzata zzataVar, long j3) {
        zzataVar.zze |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        zzataVar.zzaI = j3;
    }

    public static /* synthetic */ void zzo(zzata zzataVar, String str) {
        str.getClass();
        zzataVar.zze |= 32768;
        zzataVar.zzaN = str;
    }

    public static /* synthetic */ void zzp(zzata zzataVar, String str) {
        str.getClass();
        zzataVar.zzc |= 2;
        zzataVar.zzg = str;
    }

    public static /* synthetic */ void zzq(zzata zzataVar, String str) {
        str.getClass();
        zzataVar.zzd |= 128;
        zzataVar.zzW = str;
    }

    public static /* synthetic */ void zzr(zzata zzataVar, long j3) {
        zzataVar.zzc |= 4;
        zzataVar.zzh = j3;
    }

    public static /* synthetic */ void zzs(zzata zzataVar, long j3) {
        zzataVar.zzd |= 2097152;
        zzataVar.zzal = j3;
    }

    public static /* synthetic */ void zzt(zzata zzataVar, long j3) {
        zzataVar.zzc |= 32;
        zzataVar.zzk = j3;
    }

    public static /* synthetic */ void zzu(zzata zzataVar, long j3) {
        zzataVar.zzc |= 16;
        zzataVar.zzj = j3;
    }

    public static /* synthetic */ void zzv(zzata zzataVar, String str) {
        str.getClass();
        zzataVar.zzc |= 16777216;
        zzataVar.zzH = str;
    }

    public static /* synthetic */ void zzw(zzata zzataVar, long j3) {
        zzataVar.zzd |= 32;
        zzataVar.zzU = j3;
    }

    public static /* synthetic */ void zzx(zzata zzataVar, long j3) {
        zzataVar.zzd |= 4096;
        zzataVar.zzab = j3;
    }

    public static /* synthetic */ void zzy(zzata zzataVar, long j3) {
        zzataVar.zzd |= 8192;
        zzataVar.zzac = j3;
    }

    public static /* synthetic */ void zzz(zzata zzataVar, boolean z10) {
        zzataVar.zze |= 16777216;
        zzataVar.zzaW = z10;
    }

    public final boolean zzai() {
        return this.zzaW;
    }

    public final boolean zzaj() {
        return (this.zzc & 4194304) != 0;
    }

    public final boolean zzak() {
        return (this.zze & 134217728) != 0;
    }

    public final int zzal() {
        int zza2 = zzask.zza(this.zzaV);
        if (zza2 == 0) {
            return 3;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final Object zzde(zzgyw zzgywVar, Object obj, Object obj2) {
        zzatq zzatqVar = null;
        switch (zzgywVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                zzgzd zzgzdVar = zzatg.zza;
                return zzgyx.zzbS(zza, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzaT", "zzD", "zzE", "zzaU", "zzaY", "zzaV", zzasj.zza, "zzF", "zzaW", "zzH", "zzaX", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzai", zzasx.class, "zzU", "zzV", "zzW", "zzX", "zzZ", zzgzdVar, "zzaa", zzgzdVar, "zzah", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", zzgzdVar, "zzaj", "zzak", "zzal", "zzam", "zzan", "zzaq", "zzar", "zzat", "zzau", zzatf.zza, "zzav", zzatj.zza, "zzas", "zzaw", zzasg.zza, "zzax", "zzay", "zzao", "zzap", "zzaz", zzgzdVar, "zzY", "zzG", "zzaA", zzgzdVar, "zzaB", "zzaC", zzast.class, "zzaD", zzgzdVar, "zzaE", zzasi.class, "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", zzasq.zza, "zzaZ", "zzba", "zzbb"});
            case 3:
                return new zzata();
            case 4:
                return new zzasf(zzatqVar);
            case 5:
                return zza;
            case 6:
                zzhaq zzhaqVar = zzb;
                if (zzhaqVar == null) {
                    synchronized (zzata.class) {
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

    public final zzatl zzf() {
        zzatl zzatlVar = this.zzaZ;
        return zzatlVar == null ? zzatl.zzc() : zzatlVar;
    }

    public final String zzg() {
        return this.zzaU;
    }

    public final String zzh() {
        return this.zzF;
    }
}
