package com.google.android.gms.internal.ads;

import com.google.common.primitives.Ints;
import okhttp3.internal.http2.Http2Connection;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class zzath extends zzhbe implements zzhcq {
    private static final zzath zza;
    private static volatile zzhcx zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzI;
    private long zzJ;
    private long zzK;
    private long zzM;
    private zzatj zzP;
    private zzatc zzaF;
    private long zzaL;
    private zzasu zzaO;
    private zzasw zzaP;
    private int zzaS;
    private long zzaT;
    private boolean zzaW;
    private long zzaY;
    private zzatq zzaZ;
    private zzate zzah;
    private zzatg zzaj;
    private int zzau;
    private int zzav;
    private int zzaw;
    private zzats zzax;
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
    private zzhbq zzai = zzhbe.zzbK();
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
    private zzhbq zzaC = zzhbe.zzbK();
    private int zzaD = 1000;
    private zzhbq zzaE = zzhbe.zzbK();
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
        zzath zzathVar = new zzath();
        zza = zzathVar;
        zzhbe.zzcb(zzath.class, zzathVar);
    }

    private zzath() {
    }

    public static /* synthetic */ void zzA(zzath zzathVar, long j2) {
        zzathVar.zzc |= 134217728;
        zzathVar.zzK = j2;
    }

    public static /* synthetic */ void zzB(zzath zzathVar, String str) {
        str.getClass();
        zzathVar.zzc |= 268435456;
        zzathVar.zzL = str;
    }

    public static /* synthetic */ void zzC(zzath zzathVar, long j2) {
        zzathVar.zzc |= 536870912;
        zzathVar.zzM = j2;
    }

    public static /* synthetic */ void zzD(zzath zzathVar, long j2) {
        zzathVar.zzc |= Ints.MAX_POWER_OF_TWO;
        zzathVar.zzN = j2;
    }

    public static /* synthetic */ void zzE(zzath zzathVar, long j2) {
        zzathVar.zzc |= Integer.MIN_VALUE;
        zzathVar.zzO = j2;
    }

    public static /* synthetic */ void zzF(zzath zzathVar, long j2) {
        zzathVar.zzd |= 2;
        zzathVar.zzQ = j2;
    }

    public static /* synthetic */ void zzG(zzath zzathVar, long j2) {
        zzathVar.zzd |= 4;
        zzathVar.zzR = j2;
    }

    public static /* synthetic */ void zzH(zzath zzathVar, long j2) {
        zzathVar.zzd |= 8;
        zzathVar.zzS = j2;
    }

    public static /* synthetic */ void zzI(zzath zzathVar, long j2) {
        zzathVar.zzd |= 16;
        zzathVar.zzT = j2;
    }

    public static /* synthetic */ void zzJ(zzath zzathVar, long j2) {
        zzathVar.zzd |= 32;
        zzathVar.zzU = j2;
    }

    public static /* synthetic */ void zzK(zzath zzathVar, long j2) {
        zzathVar.zzd |= 64;
        zzathVar.zzV = j2;
    }

    public static /* synthetic */ void zzL(zzath zzathVar, String str) {
        str.getClass();
        zzathVar.zzd |= 128;
        zzathVar.zzW = str;
    }

    public static /* synthetic */ void zzM(zzath zzathVar, String str) {
        str.getClass();
        zzathVar.zzd |= 256;
        zzathVar.zzX = str;
    }

    public static /* synthetic */ void zzN(zzath zzathVar, long j2) {
        zzathVar.zzd |= 4096;
        zzathVar.zzab = j2;
    }

    public static /* synthetic */ void zzO(zzath zzathVar, long j2) {
        zzathVar.zzd |= 8192;
        zzathVar.zzac = j2;
    }

    public static /* synthetic */ void zzP(zzath zzathVar, long j2) {
        zzathVar.zzd |= 16384;
        zzathVar.zzad = j2;
    }

    public static /* synthetic */ void zzQ(zzath zzathVar, zzate zzateVar) {
        zzateVar.getClass();
        zzathVar.zzah = zzateVar;
        zzathVar.zzd |= Opcodes.ASM4;
    }

    public static /* synthetic */ void zzR(zzath zzathVar, zzate zzateVar) {
        zzateVar.getClass();
        zzhbq zzhbqVar = zzathVar.zzai;
        if (!zzhbqVar.zzc()) {
            zzathVar.zzai = zzhbe.zzbL(zzhbqVar);
        }
        zzathVar.zzai.add(zzateVar);
    }

    public static /* synthetic */ void zzT(zzath zzathVar, zzatg zzatgVar) {
        zzatgVar.getClass();
        zzathVar.zzaj = zzatgVar;
        zzathVar.zzd |= Opcodes.ASM8;
    }

    public static /* synthetic */ void zzU(zzath zzathVar, long j2) {
        zzathVar.zzd |= 2097152;
        zzathVar.zzal = j2;
    }

    public static /* synthetic */ void zzV(zzath zzathVar, long j2) {
        zzathVar.zzd |= 4194304;
        zzathVar.zzam = j2;
    }

    public static /* synthetic */ void zzW(zzath zzathVar, long j2) {
        zzathVar.zzd |= 8388608;
        zzathVar.zzan = j2;
    }

    public static /* synthetic */ void zzX(zzath zzathVar, long j2) {
        zzathVar.zzd |= 67108864;
        zzathVar.zzaq = j2;
    }

    public static /* synthetic */ void zzY(zzath zzathVar, long j2) {
        zzathVar.zzd |= 134217728;
        zzathVar.zzar = j2;
    }

    public static /* synthetic */ void zzZ(zzath zzathVar, String str) {
        str.getClass();
        zzathVar.zzd |= 268435456;
        zzathVar.zzas = str;
    }

    public static zzasm zza() {
        return (zzasm) zza.zzaZ();
    }

    public static /* synthetic */ void zzaa(zzath zzathVar, long j2) {
        zzathVar.zze |= 512;
        zzathVar.zzaH = j2;
    }

    public static /* synthetic */ void zzab(zzath zzathVar, long j2) {
        zzathVar.zze |= 1024;
        zzathVar.zzaI = j2;
    }

    public static /* synthetic */ void zzac(zzath zzathVar, long j2) {
        zzathVar.zze |= Opcodes.ACC_STRICT;
        zzathVar.zzaJ = j2;
    }

    public static /* synthetic */ void zzad(zzath zzathVar, long j2) {
        zzathVar.zze |= 4096;
        zzathVar.zzaK = j2;
    }

    public static /* synthetic */ void zzae(zzath zzathVar, String str) {
        str.getClass();
        zzathVar.zze |= 32768;
        zzathVar.zzaN = str;
    }

    public static /* synthetic */ void zzaf(zzath zzathVar, String str) {
        str.getClass();
        zzathVar.zze |= 4194304;
        zzathVar.zzaU = str;
    }

    public static /* synthetic */ void zzag(zzath zzathVar, boolean z2) {
        zzathVar.zze |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzathVar.zzaW = z2;
    }

    public static /* synthetic */ void zzah(zzath zzathVar, long j2) {
        zzathVar.zze |= 67108864;
        zzathVar.zzaY = j2;
    }

    public static /* synthetic */ void zzam(zzath zzathVar, int i2) {
        zzathVar.zzZ = i2 - 1;
        zzathVar.zzd |= 1024;
    }

    public static /* synthetic */ void zzan(zzath zzathVar, int i2) {
        zzathVar.zzaa = i2 - 1;
        zzathVar.zzd |= Opcodes.ACC_STRICT;
    }

    public static /* synthetic */ void zzao(zzath zzathVar, int i2) {
        zzathVar.zzag = i2 - 1;
        zzathVar.zzd |= Opcodes.ACC_DEPRECATED;
    }

    public static /* synthetic */ void zzap(zzath zzathVar, int i2) {
        zzathVar.zzaz = i2 - 1;
        zzathVar.zze |= 8;
    }

    public static /* synthetic */ void zzaq(zzath zzathVar, int i2) {
        zzathVar.zzaA = i2 - 1;
        zzathVar.zze |= 16;
    }

    public static /* synthetic */ void zzar(zzath zzathVar, int i2) {
        zzathVar.zzaS = i2 - 1;
        zzathVar.zze |= 1048576;
    }

    public static /* synthetic */ void zzas(zzath zzathVar, int i2) {
        zzathVar.zzaV = 5;
        zzathVar.zze |= 8388608;
    }

    public static zzath zzd() {
        return zza;
    }

    public static zzath zze(byte[] bArr, zzhao zzhaoVar) throws zzhbt {
        return (zzath) zzhbe.zzbx(zza, bArr, zzhaoVar);
    }

    public static /* synthetic */ void zzi(zzath zzathVar, String str) {
        str.getClass();
        zzathVar.zzc |= 1;
        zzathVar.zzf = str;
    }

    public static /* synthetic */ void zzj(zzath zzathVar, String str) {
        str.getClass();
        zzathVar.zzc |= 2;
        zzathVar.zzg = str;
    }

    public static /* synthetic */ void zzk(zzath zzathVar, long j2) {
        zzathVar.zzc |= 4;
        zzathVar.zzh = j2;
    }

    public static /* synthetic */ void zzl(zzath zzathVar, long j2) {
        zzathVar.zzc |= 16;
        zzathVar.zzj = j2;
    }

    public static /* synthetic */ void zzm(zzath zzathVar, long j2) {
        zzathVar.zzc |= 32;
        zzathVar.zzk = j2;
    }

    public static /* synthetic */ void zzn(zzath zzathVar, long j2) {
        zzathVar.zzc |= 1024;
        zzathVar.zzp = j2;
    }

    public static /* synthetic */ void zzo(zzath zzathVar, long j2) {
        zzathVar.zzc |= Opcodes.ACC_STRICT;
        zzathVar.zzu = j2;
    }

    public static /* synthetic */ void zzp(zzath zzathVar, long j2) {
        zzathVar.zzc |= 8192;
        zzathVar.zzw = j2;
    }

    public static /* synthetic */ void zzq(zzath zzathVar, long j2) {
        zzathVar.zzc |= 16384;
        zzathVar.zzx = j2;
    }

    public static /* synthetic */ void zzr(zzath zzathVar, long j2) {
        zzathVar.zzc |= 32768;
        zzathVar.zzy = j2;
    }

    public static /* synthetic */ void zzs(zzath zzathVar, long j2) {
        zzathVar.zzc |= 65536;
        zzathVar.zzz = j2;
    }

    public static /* synthetic */ void zzt(zzath zzathVar, long j2) {
        zzathVar.zzc |= Opcodes.ASM8;
        zzathVar.zzC = j2;
    }

    public static /* synthetic */ void zzu(zzath zzathVar, long j2) {
        zzathVar.zzc |= 1048576;
        zzathVar.zzD = j2;
    }

    public static /* synthetic */ void zzv(zzath zzathVar, long j2) {
        zzathVar.zzc |= 2097152;
        zzathVar.zzE = j2;
    }

    public static /* synthetic */ void zzw(zzath zzathVar, String str) {
        str.getClass();
        zzathVar.zzc |= 4194304;
        zzathVar.zzF = str;
    }

    public static /* synthetic */ void zzx(zzath zzathVar, String str) {
        str.getClass();
        zzathVar.zzc |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        zzathVar.zzH = str;
    }

    public static /* synthetic */ void zzy(zzath zzathVar, long j2) {
        zzathVar.zzc |= 33554432;
        zzathVar.zzI = j2;
    }

    public static /* synthetic */ void zzz(zzath zzathVar, long j2) {
        zzathVar.zzc |= 67108864;
        zzathVar.zzJ = j2;
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
        int zza2 = zzasr.zza(this.zzaV);
        if (zza2 == 0) {
            return 3;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final Object zzde(zzhbd zzhbdVar, Object obj, Object obj2) {
        zzasl zzaslVar = null;
        switch (zzhbdVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                zzhbk zzhbkVar = zzasq.zza;
                zzhbk zzhbkVar2 = zzatn.zza;
                return zzhbe.zzbS(zza, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzaT", "zzD", "zzE", "zzaU", "zzaY", "zzaV", zzhbkVar, "zzF", "zzaW", "zzH", "zzaX", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzai", zzate.class, "zzU", "zzV", "zzW", "zzX", "zzZ", zzhbkVar2, "zzaa", zzhbkVar2, "zzah", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", zzhbkVar2, "zzaj", "zzak", "zzal", "zzam", "zzan", "zzaq", "zzar", "zzat", "zzau", zzatm.zza, "zzav", zzato.zza, "zzas", "zzaw", zzasn.zza, "zzax", "zzay", "zzao", "zzap", "zzaz", zzhbkVar2, "zzY", "zzG", "zzaA", zzhbkVar2, "zzaB", "zzaC", zzata.class, "zzaD", zzhbkVar2, "zzaE", zzasp.class, "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", zzasx.zza, "zzaZ", "zzba", "zzbb"});
            case NEW_MUTABLE_INSTANCE:
                return new zzath();
            case NEW_BUILDER:
                return new zzasm(zzaslVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhcx zzhcxVar = zzb;
                if (zzhcxVar == null) {
                    synchronized (zzath.class) {
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

    public final zzatq zzf() {
        zzatq zzatqVar = this.zzaZ;
        return zzatqVar == null ? zzatq.zzd() : zzatqVar;
    }

    public final String zzg() {
        return this.zzaU;
    }

    public final String zzh() {
        return this.zzF;
    }
}
