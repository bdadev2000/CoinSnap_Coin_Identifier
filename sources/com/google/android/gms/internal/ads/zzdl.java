package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class zzdl {
    private static final String zzF;
    private static final String zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzJ;
    private static final String zzK;
    private static final String zzL;
    private static final String zzM;
    private static final String zzN;
    private static final String zzO;
    private static final String zzP;
    private static final String zzQ;
    private static final String zzR;
    private static final String zzS;
    private static final String zzT;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    public static final zzdl zza;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;

    @Deprecated
    public static final zzdl zzb;

    @Deprecated
    public static final zzn zzc;
    public final boolean zzA;
    public final boolean zzB;
    public final boolean zzC;
    public final zzgbf zzD;
    public final zzgbh zzE;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = Integer.MAX_VALUE;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzgbc zzo;
    public final int zzp;
    public final zzgbc zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzgbc zzu;
    public final zzdj zzv;
    public final zzgbc zzw;
    public final int zzx;
    public final int zzy;
    public final boolean zzz;

    static {
        zzdl zzdlVar = new zzdl(new zzdk());
        zza = zzdlVar;
        zzb = zzdlVar;
        zzF = Integer.toString(1, 36);
        zzG = Integer.toString(2, 36);
        zzH = Integer.toString(3, 36);
        zzI = Integer.toString(4, 36);
        zzJ = Integer.toString(5, 36);
        zzK = Integer.toString(6, 36);
        zzL = Integer.toString(7, 36);
        zzM = Integer.toString(8, 36);
        zzN = Integer.toString(9, 36);
        zzO = Integer.toString(10, 36);
        zzP = Integer.toString(11, 36);
        zzQ = Integer.toString(12, 36);
        zzR = Integer.toString(13, 36);
        zzS = Integer.toString(14, 36);
        zzT = Integer.toString(15, 36);
        zzU = Integer.toString(16, 36);
        zzV = Integer.toString(17, 36);
        zzW = Integer.toString(18, 36);
        zzX = Integer.toString(19, 36);
        zzY = Integer.toString(20, 36);
        zzZ = Integer.toString(21, 36);
        zzaa = Integer.toString(22, 36);
        zzab = Integer.toString(23, 36);
        zzac = Integer.toString(24, 36);
        zzad = Integer.toString(25, 36);
        zzae = Integer.toString(26, 36);
        zzaf = Integer.toString(27, 36);
        zzag = Integer.toString(28, 36);
        zzah = Integer.toString(29, 36);
        zzai = Integer.toString(30, 36);
        zzaj = Integer.toString(31, 36);
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzdh
        };
    }

    public zzdl(zzdk zzdkVar) {
        int i9;
        int i10;
        boolean z8;
        zzgbc zzgbcVar;
        zzgbc zzgbcVar2;
        zzgbc zzgbcVar3;
        zzdj zzdjVar;
        zzgbc zzgbcVar4;
        int i11;
        HashMap hashMap;
        HashSet hashSet;
        i9 = zzdkVar.zze;
        this.zzl = i9;
        i10 = zzdkVar.zzf;
        this.zzm = i10;
        z8 = zzdkVar.zzg;
        this.zzn = z8;
        zzgbcVar = zzdkVar.zzh;
        this.zzo = zzgbcVar;
        this.zzp = 0;
        zzgbcVar2 = zzdkVar.zzi;
        this.zzq = zzgbcVar2;
        this.zzr = 0;
        this.zzs = Integer.MAX_VALUE;
        this.zzt = Integer.MAX_VALUE;
        zzgbcVar3 = zzdkVar.zzl;
        this.zzu = zzgbcVar3;
        zzdjVar = zzdkVar.zzm;
        this.zzv = zzdjVar;
        zzgbcVar4 = zzdkVar.zzn;
        this.zzw = zzgbcVar4;
        i11 = zzdkVar.zzo;
        this.zzx = i11;
        this.zzy = 0;
        this.zzz = false;
        this.zzA = false;
        this.zzB = false;
        this.zzC = false;
        hashMap = zzdkVar.zzp;
        this.zzD = zzgbf.zzc(hashMap);
        hashSet = zzdkVar.zzq;
        this.zzE = zzgbh.zzl(hashSet);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzdl zzdlVar = (zzdl) obj;
            if (this.zzn == zzdlVar.zzn && this.zzl == zzdlVar.zzl && this.zzm == zzdlVar.zzm && this.zzo.equals(zzdlVar.zzo) && this.zzq.equals(zzdlVar.zzq) && this.zzu.equals(zzdlVar.zzu) && this.zzv.equals(zzdlVar.zzv) && this.zzw.equals(zzdlVar.zzw) && this.zzx == zzdlVar.zzx && this.zzD.equals(zzdlVar.zzD) && this.zzE.equals(zzdlVar.zzE)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i9 = (this.zzn ? 1 : 0) - 1048002209;
        return this.zzE.hashCode() + ((this.zzD.hashCode() + ((((this.zzw.hashCode() + ((((this.zzu.hashCode() + ((((((this.zzq.hashCode() + ((this.zzo.hashCode() + (((((i9 * 31) + this.zzl) * 31) + this.zzm) * 31)) * 961)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 31) + 29791) * 31)) * 31) + this.zzx) * 887503681)) * 31);
    }
}
