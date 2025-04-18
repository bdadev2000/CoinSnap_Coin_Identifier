package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class zzhw implements zzln, zzlq {
    private final int zzb;

    @Nullable
    private zzlr zzd;
    private int zze;
    private zzoj zzf;
    private zzdc zzg;
    private int zzh;

    @Nullable
    private zzwg zzi;

    @Nullable
    private zzad[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;

    @Nullable
    private zzlp zzq;
    private final Object zza = new Object();
    private final zzkj zzc = new zzkj();
    private long zzm = Long.MIN_VALUE;
    private zzbv zzp = zzbv.zza;

    public zzhw(int i10) {
        this.zzb = i10;
    }

    private final void zzZ(long j3, boolean z10) throws zzig {
        this.zzn = false;
        this.zzl = j3;
        this.zzm = j3;
        zzz(j3, z10);
    }

    public void zzA() {
    }

    public final void zzB() {
        zzlp zzlpVar;
        synchronized (this.zza) {
            zzlpVar = this.zzq;
        }
        if (zzlpVar != null) {
            zzlpVar.zza(this);
        }
    }

    public void zzC() {
    }

    public void zzD() throws zzig {
    }

    public void zzE() {
    }

    public void zzF(zzad[] zzadVarArr, long j3, long j10, zzur zzurVar) throws zzig {
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzG() {
        boolean z10;
        if (this.zzh == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzH(zzad[] zzadVarArr, zzwg zzwgVar, long j3, long j10, zzur zzurVar) throws zzig {
        zzdb.zzf(!this.zzn);
        this.zzi = zzwgVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j3;
        }
        this.zzj = zzadVarArr;
        this.zzk = j10;
        zzF(zzadVarArr, j3, j10, zzurVar);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzI() {
        boolean z10;
        if (this.zzh == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        zzkj zzkjVar = this.zzc;
        zzkjVar.zzb = null;
        zzkjVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzJ(long j3) throws zzig {
        zzZ(j3, false);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzL(zzlp zzlpVar) {
        synchronized (this.zza) {
            this.zzq = zzlpVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public /* synthetic */ void zzM(float f10, float f11) {
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzN(zzbv zzbvVar) {
        if (Objects.equals(this.zzp, zzbvVar)) {
            return;
        }
        this.zzp = zzbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzO() throws zzig {
        boolean z10 = true;
        if (this.zzh != 1) {
            z10 = false;
        }
        zzdb.zzf(z10);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzP() {
        boolean z10;
        if (this.zzh == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final boolean zzR() {
        return this.zzn;
    }

    public final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzwg zzwgVar = this.zzi;
        zzwgVar.getClass();
        return zzwgVar.zze();
    }

    public final zzad[] zzT() {
        zzad[] zzadVarArr = this.zzj;
        zzadVarArr.getClass();
        return zzadVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzln, com.google.android.gms.internal.ads.zzlq
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final int zzcV() {
        return this.zzh;
    }

    public final int zzcW(zzkj zzkjVar, zzhm zzhmVar, int i10) {
        zzwg zzwgVar = this.zzi;
        zzwgVar.getClass();
        int zza = zzwgVar.zza(zzkjVar, zzhmVar, i10);
        if (zza == -4) {
            if (zzhmVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                if (this.zzn) {
                    return -4;
                }
                return -3;
            }
            long j3 = zzhmVar.zze + this.zzk;
            zzhmVar.zze = j3;
            this.zzm = Math.max(this.zzm, j3);
        } else if (zza == -5) {
            zzad zzadVar = zzkjVar.zza;
            zzadVar.getClass();
            long j10 = zzadVar.zzt;
            if (j10 != Long.MAX_VALUE) {
                zzab zzb = zzadVar.zzb();
                zzb.zzad(j10 + this.zzk);
                zzkjVar.zza = zzb.zzaf();
                return -5;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final long zzcX() {
        return this.zzm;
    }

    public final zzig zzcY(Throwable th2, @Nullable zzad zzadVar, boolean z10, int i10) {
        int i11 = 4;
        if (zzadVar != null && !this.zzo) {
            this.zzo = true;
            try {
                i11 = zzY(zzadVar) & 7;
            } catch (zzig unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzig.zzb(th2, zzU(), this.zze, zzadVar, i11, z10, i10);
    }

    public final int zzd(long j3) {
        zzwg zzwgVar = this.zzi;
        zzwgVar.getClass();
        return zzwgVar.zzb(j3 - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public int zze() throws zzig {
        return 0;
    }

    public final long zzf() {
        return this.zzl;
    }

    public final zzbv zzh() {
        return this.zzp;
    }

    public final zzdc zzi() {
        zzdc zzdcVar = this.zzg;
        zzdcVar.getClass();
        return zzdcVar;
    }

    public final zzkj zzk() {
        zzkj zzkjVar = this.zzc;
        zzkjVar.zzb = null;
        zzkjVar.zza = null;
        return zzkjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    @Nullable
    public zzkp zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final zzlq zzm() {
        return this;
    }

    public final zzlr zzn() {
        zzlr zzlrVar = this.zzd;
        zzlrVar.getClass();
        return zzlrVar;
    }

    public final zzoj zzo() {
        zzoj zzojVar = this.zzf;
        zzojVar.getClass();
        return zzojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    @Nullable
    public final zzwg zzp() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlq
    public final void zzq() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzr() {
        boolean z10 = true;
        if (this.zzh != 1) {
            z10 = false;
        }
        zzdb.zzf(z10);
        zzkj zzkjVar = this.zzc;
        zzkjVar.zzb = null;
        zzkjVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzs(zzlr zzlrVar, zzad[] zzadVarArr, zzwg zzwgVar, long j3, boolean z10, boolean z11, long j10, long j11, zzur zzurVar) throws zzig {
        boolean z12;
        if (this.zzh == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        zzdb.zzf(z12);
        this.zzd = zzlrVar;
        this.zzh = 1;
        zzy(z10, z11);
        zzH(zzadVarArr, zzwgVar, j10, j11, zzurVar);
        zzZ(j10, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public /* synthetic */ void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public void zzu(int i10, @Nullable Object obj) throws zzig {
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzv(int i10, zzoj zzojVar, zzdc zzdcVar) {
        this.zze = i10;
        this.zzf = zzojVar;
        this.zzg = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzw() throws IOException {
        zzwg zzwgVar = this.zzi;
        zzwgVar.getClass();
        zzwgVar.zzd();
    }

    public void zzx() {
        throw null;
    }

    public void zzy(boolean z10, boolean z11) throws zzig {
    }

    public void zzz(long j3, boolean z10) throws zzig {
        throw null;
    }
}
