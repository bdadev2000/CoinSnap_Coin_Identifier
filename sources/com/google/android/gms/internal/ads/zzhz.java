package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class zzhz implements zzlr, zzlu {
    private final int zzb;

    @Nullable
    private zzlv zzd;
    private int zze;
    private zzom zzf;
    private zzdj zzg;
    private int zzh;

    @Nullable
    private zzwn zzi;

    @Nullable
    private zzaf[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;

    @Nullable
    @GuardedBy
    private zzlt zzq;
    private final Object zza = new Object();
    private final zzkm zzc = new zzkm();
    private long zzm = Long.MIN_VALUE;
    private zzcc zzp = zzcc.zza;

    public zzhz(int i2) {
        this.zzb = i2;
    }

    private final void zzZ(long j2, boolean z2) throws zzij {
        this.zzn = false;
        this.zzl = j2;
        this.zzm = j2;
        zzz(j2, z2);
    }

    public void zzA() {
    }

    public final void zzB() {
        zzlt zzltVar;
        synchronized (this.zza) {
            zzltVar = this.zzq;
        }
        if (zzltVar != null) {
            zzltVar.zza(this);
        }
    }

    public void zzC() {
    }

    public void zzD() throws zzij {
    }

    public void zzE() {
    }

    public void zzF(zzaf[] zzafVarArr, long j2, long j3, zzuy zzuyVar) throws zzij {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzG() {
        zzdi.zzf(this.zzh == 0);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzH(zzaf[] zzafVarArr, zzwn zzwnVar, long j2, long j3, zzuy zzuyVar) throws zzij {
        zzdi.zzf(!this.zzn);
        this.zzi = zzwnVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j2;
        }
        this.zzj = zzafVarArr;
        this.zzk = j3;
        zzF(zzafVarArr, j2, j3, zzuyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzI() {
        zzdi.zzf(this.zzh == 0);
        zzkm zzkmVar = this.zzc;
        zzkmVar.zzb = null;
        zzkmVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzJ(long j2) throws zzij {
        zzZ(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzL(zzlt zzltVar) {
        synchronized (this.zza) {
            this.zzq = zzltVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public /* synthetic */ void zzM(float f2, float f3) {
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzN(zzcc zzccVar) {
        if (Objects.equals(this.zzp, zzccVar)) {
            return;
        }
        this.zzp = zzccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzO() throws zzij {
        zzdi.zzf(this.zzh == 1);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzP() {
        zzdi.zzf(this.zzh == 2);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final boolean zzR() {
        return this.zzn;
    }

    public final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzwn zzwnVar = this.zzi;
        zzwnVar.getClass();
        return zzwnVar.zze();
    }

    public final zzaf[] zzT() {
        zzaf[] zzafVarArr = this.zzj;
        zzafVarArr.getClass();
        return zzafVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzlr, com.google.android.gms.internal.ads.zzlu
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final int zzcV() {
        return this.zzh;
    }

    public final int zzcW(zzkm zzkmVar, zzhq zzhqVar, int i2) {
        zzwn zzwnVar = this.zzi;
        zzwnVar.getClass();
        int zza = zzwnVar.zza(zzkmVar, zzhqVar, i2);
        if (zza == -4) {
            if (zzhqVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j2 = zzhqVar.zze + this.zzk;
            zzhqVar.zze = j2;
            this.zzm = Math.max(this.zzm, j2);
        } else if (zza == -5) {
            zzaf zzafVar = zzkmVar.zza;
            zzafVar.getClass();
            long j3 = zzafVar.zzs;
            if (j3 != Long.MAX_VALUE) {
                zzad zzb = zzafVar.zzb();
                zzb.zzad(j3 + this.zzk);
                zzkmVar.zza = zzb.zzaf();
                return -5;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final long zzcX() {
        return this.zzm;
    }

    public final zzij zzcY(Throwable th, @Nullable zzaf zzafVar, boolean z2, int i2) {
        int i3 = 4;
        if (zzafVar != null && !this.zzo) {
            this.zzo = true;
            try {
                i3 = zzY(zzafVar) & 7;
            } catch (zzij unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzij.zzb(th, zzU(), this.zze, zzafVar, i3, z2, i2);
    }

    public final int zzd(long j2) {
        zzwn zzwnVar = this.zzi;
        zzwnVar.getClass();
        return zzwnVar.zzb(j2 - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public int zze() throws zzij {
        return 0;
    }

    public final long zzf() {
        return this.zzl;
    }

    public final zzcc zzh() {
        return this.zzp;
    }

    public final zzdj zzi() {
        zzdj zzdjVar = this.zzg;
        zzdjVar.getClass();
        return zzdjVar;
    }

    public final zzkm zzk() {
        zzkm zzkmVar = this.zzc;
        zzkmVar.zzb = null;
        zzkmVar.zza = null;
        return zzkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    @Nullable
    public zzkt zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final zzlu zzm() {
        return this;
    }

    public final zzlv zzn() {
        zzlv zzlvVar = this.zzd;
        zzlvVar.getClass();
        return zzlvVar;
    }

    public final zzom zzo() {
        zzom zzomVar = this.zzf;
        zzomVar.getClass();
        return zzomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    @Nullable
    public final zzwn zzp() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzq() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzr() {
        zzdi.zzf(this.zzh == 1);
        zzkm zzkmVar = this.zzc;
        zzkmVar.zzb = null;
        zzkmVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzs(zzlv zzlvVar, zzaf[] zzafVarArr, zzwn zzwnVar, long j2, boolean z2, boolean z3, long j3, long j4, zzuy zzuyVar) throws zzij {
        zzdi.zzf(this.zzh == 0);
        this.zzd = zzlvVar;
        this.zzh = 1;
        zzy(z2, z3);
        zzH(zzafVarArr, zzwnVar, j3, j4, zzuyVar);
        zzZ(j3, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public /* synthetic */ void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public void zzu(int i2, @Nullable Object obj) throws zzij {
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzv(int i2, zzom zzomVar, zzdj zzdjVar) {
        this.zze = i2;
        this.zzf = zzomVar;
        this.zzg = zzdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void zzw() throws IOException {
        zzwn zzwnVar = this.zzi;
        zzwnVar.getClass();
        zzwnVar.zzd();
    }

    public void zzx() {
        throw null;
    }

    public void zzy(boolean z2, boolean z3) throws zzij {
    }

    public void zzz(long j2, boolean z2) throws zzij {
        throw null;
    }
}
