package com.google.android.gms.internal.ads;

import androidx.fragment.app.FragmentTransaction;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzhjh extends zzhbo implements zzhdf {
    private static final zzhjh zza;
    private static volatile zzhdm zzb;
    private zzhjb zzC;
    private zzhgt zzE;
    private zzhgj zzG;
    private zzhhs zzI;
    private int zzJ;
    private long zzM;
    private zzhjg zzN;
    private zzhhz zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private zzhgp zzi;
    private zzhij zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private zzhit zzx;
    private boolean zzy;
    private byte zzP = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private zzhca zzj = zzhbo.zzbK();
    private zzhca zzk = zzhbo.zzbK();
    private String zzl = "";
    private zzhca zzo = zzhbo.zzbK();
    private String zzp = "";
    private zzhac zzw = zzhac.zzb;
    private String zzz = "";
    private zzhca zzA = zzhbo.zzbK();
    private zzhca zzB = zzhbo.zzbK();
    private zzhca zzD = zzhbo.zzbK();
    private String zzF = "";
    private zzhca zzH = zzhbo.zzbK();
    private zzhca zzK = zzhbo.zzbK();
    private zzhca zzL = zzhbo.zzbK();

    static {
        zzhjh zzhjhVar = new zzhjh();
        zza = zzhjhVar;
        zzhbo.zzca(zzhjh.class, zzhjhVar);
    }

    private zzhjh() {
    }

    public static zzhgn zzc() {
        return (zzhgn) zza.zzaZ();
    }

    public static /* synthetic */ void zzi(zzhjh zzhjhVar, zzhim zzhimVar) {
        zzhjhVar.zzd = zzhimVar.zza();
        zzhjhVar.zzc |= 1;
    }

    public static /* synthetic */ void zzj(zzhjh zzhjhVar, String str) {
        str.getClass();
        zzhjhVar.zzc |= 4;
        zzhjhVar.zzf = str;
    }

    public static /* synthetic */ void zzk(zzhjh zzhjhVar, String str) {
        str.getClass();
        zzhjhVar.zzc |= 8;
        zzhjhVar.zzg = str;
    }

    public static /* synthetic */ void zzl(zzhjh zzhjhVar, zzhgp zzhgpVar) {
        zzhgpVar.getClass();
        zzhjhVar.zzi = zzhgpVar;
        zzhjhVar.zzc |= 32;
    }

    public static /* synthetic */ void zzm(zzhjh zzhjhVar, zzhir zzhirVar) {
        zzhirVar.getClass();
        zzhca zzhcaVar = zzhjhVar.zzj;
        if (!zzhcaVar.zzc()) {
            zzhjhVar.zzj = zzhbo.zzbL(zzhcaVar);
        }
        zzhjhVar.zzj.add(zzhirVar);
    }

    public static /* synthetic */ void zzn(zzhjh zzhjhVar, String str) {
        zzhjhVar.zzc |= 64;
        zzhjhVar.zzl = str;
    }

    public static /* synthetic */ void zzo(zzhjh zzhjhVar) {
        zzhjhVar.zzc &= -65;
        zzhjhVar.zzl = zza.zzl;
    }

    public static /* synthetic */ void zzp(zzhjh zzhjhVar, zzhij zzhijVar) {
        zzhijVar.getClass();
        zzhjhVar.zzm = zzhijVar;
        zzhjhVar.zzc |= 128;
    }

    public static /* synthetic */ void zzq(zzhjh zzhjhVar, zzhit zzhitVar) {
        zzhitVar.getClass();
        zzhjhVar.zzx = zzhitVar;
        zzhjhVar.zzc |= FragmentTransaction.TRANSIT_EXIT_MASK;
    }

    public static /* synthetic */ void zzr(zzhjh zzhjhVar, Iterable iterable) {
        zzhca zzhcaVar = zzhjhVar.zzA;
        if (!zzhcaVar.zzc()) {
            zzhjhVar.zzA = zzhbo.zzbL(zzhcaVar);
        }
        zzgzi.zzaQ(iterable, zzhjhVar.zzA);
    }

    public static /* synthetic */ void zzs(zzhjh zzhjhVar, Iterable iterable) {
        zzhca zzhcaVar = zzhjhVar.zzB;
        if (!zzhcaVar.zzc()) {
            zzhjhVar.zzB = zzhbo.zzbL(zzhcaVar);
        }
        zzgzi.zzaQ(iterable, zzhjhVar.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    public final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        byte b;
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzP);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                } else {
                    b = 1;
                }
                this.zzP = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhbo.zzbR(zza, "\u0001\"\u0000\u0001\u0001\"\"\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhir.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhil.zza, "zze", zzhgl.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhjl.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhjv.class, "zzE", "zzF", "zzG", "zzH", zzhhb.class, "zzI", "zzJ", zzhiy.zza, "zzK", zzhhx.class, "zzL", zzhie.class, "zzM", "zzN", "zzO"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhjh();
            case NEW_BUILDER:
                return new zzhgn(null);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhdmVar = zzb;
                if (zzhdmVar == null) {
                    synchronized (zzhjh.class) {
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
