package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zziw implements zzmn, zzmp {
    private final int zzb;

    @Nullable
    private zzmq zzd;
    private int zze;
    private zzpj zzf;
    private zzer zzg;
    private int zzh;

    @Nullable
    private zzxf zzi;

    @Nullable
    private zzan[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;

    @Nullable
    private zzmo zzq;
    private final Object zza = new Object();
    private final zzlj zzc = new zzlj();
    private long zzm = Long.MIN_VALUE;
    private zzdc zzp = zzdc.zza;

    public zziw(int i9) {
        this.zzb = i9;
    }

    private final void zzZ(long j7, boolean z8) throws zzjh {
        this.zzn = false;
        this.zzl = j7;
        this.zzm = j7;
        zzz(j7, z8);
    }

    public void zzA() {
    }

    public final void zzB() {
        zzmo zzmoVar;
        synchronized (this.zza) {
            zzmoVar = this.zzq;
        }
        if (zzmoVar != null) {
            zzmoVar.zza(this);
        }
    }

    public void zzC() {
    }

    public void zzD() throws zzjh {
    }

    public void zzE() {
    }

    public void zzF(zzan[] zzanVarArr, long j7, long j9, zzvo zzvoVar) throws zzjh {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzG() {
        boolean z8;
        if (this.zzh == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzH(zzan[] zzanVarArr, zzxf zzxfVar, long j7, long j9, zzvo zzvoVar) throws zzjh {
        zzeq.zzf(!this.zzn);
        this.zzi = zzxfVar;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j7;
        }
        this.zzj = zzanVarArr;
        this.zzk = j9;
        zzF(zzanVarArr, j7, j9, zzvoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzI() {
        boolean z8;
        if (this.zzh == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        zzlj zzljVar = this.zzc;
        zzljVar.zzb = null;
        zzljVar.zza = null;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzJ(long j7) throws zzjh {
        zzZ(j7, false);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzK() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzL(zzmo zzmoVar) {
        synchronized (this.zza) {
            this.zzq = zzmoVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public /* synthetic */ void zzM(float f9, float f10) {
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzN(zzdc zzdcVar) {
        if (!zzgd.zzG(this.zzp, zzdcVar)) {
            this.zzp = zzdcVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzO() throws zzjh {
        boolean z8 = true;
        if (this.zzh != 1) {
            z8 = false;
        }
        zzeq.zzf(z8);
        this.zzh = 2;
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzP() {
        boolean z8;
        if (this.zzh == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        this.zzh = 1;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final boolean zzR() {
        return this.zzn;
    }

    public final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzxf zzxfVar = this.zzi;
        zzxfVar.getClass();
        return zzxfVar.zze();
    }

    public final zzan[] zzT() {
        zzan[] zzanVarArr = this.zzj;
        zzanVarArr.getClass();
        return zzanVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzmn, com.google.android.gms.internal.ads.zzmp
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final int zzcU() {
        return this.zzh;
    }

    public final int zzcV(zzlj zzljVar, zzin zzinVar, int i9) {
        zzxf zzxfVar = this.zzi;
        zzxfVar.getClass();
        int zza = zzxfVar.zza(zzljVar, zzinVar, i9);
        if (zza == -4) {
            if (zzinVar.zzf()) {
                this.zzm = Long.MIN_VALUE;
                if (this.zzn) {
                    return -4;
                }
                return -3;
            }
            long j7 = zzinVar.zze + this.zzk;
            zzinVar.zze = j7;
            this.zzm = Math.max(this.zzm, j7);
        } else if (zza == -5) {
            zzan zzanVar = zzljVar.zza;
            zzanVar.getClass();
            long j9 = zzanVar.zzr;
            if (j9 != Long.MAX_VALUE) {
                zzal zzb = zzanVar.zzb();
                zzb.zzab(j9 + this.zzk);
                zzljVar.zza = zzb.zzad();
                return -5;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final long zzcW() {
        return this.zzm;
    }

    public final zzlj zzcX() {
        zzlj zzljVar = this.zzc;
        zzljVar.zzb = null;
        zzljVar.zza = null;
        return zzljVar;
    }

    public final int zzd(long j7) {
        zzxf zzxfVar = this.zzi;
        zzxfVar.getClass();
        return zzxfVar.zzb(j7 - this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public int zze() throws zzjh {
        return 0;
    }

    public final long zzf() {
        return this.zzl;
    }

    public final zzer zzh() {
        zzer zzerVar = this.zzg;
        zzerVar.getClass();
        return zzerVar;
    }

    public final zzjh zzi(Throwable th, @Nullable zzan zzanVar, boolean z8, int i9) {
        int i10 = 4;
        if (zzanVar != null && !this.zzo) {
            this.zzo = true;
            try {
                i10 = zzY(zzanVar) & 7;
            } catch (zzjh unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzjh.zzb(th, zzU(), this.zze, zzanVar, i10, z8, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    @Nullable
    public zzlp zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final zzmp zzl() {
        return this;
    }

    public final zzmq zzm() {
        zzmq zzmqVar = this.zzd;
        zzmqVar.getClass();
        return zzmqVar;
    }

    public final zzpj zzn() {
        zzpj zzpjVar = this.zzf;
        zzpjVar.getClass();
        return zzpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    @Nullable
    public final zzxf zzo() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final void zzp() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzq() {
        boolean z8 = true;
        if (this.zzh != 1) {
            z8 = false;
        }
        zzeq.zzf(z8);
        zzlj zzljVar = this.zzc;
        zzljVar.zzb = null;
        zzljVar.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzr(zzmq zzmqVar, zzan[] zzanVarArr, zzxf zzxfVar, long j7, boolean z8, boolean z9, long j9, long j10, zzvo zzvoVar) throws zzjh {
        boolean z10;
        if (this.zzh == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzeq.zzf(z10);
        this.zzd = zzmqVar;
        this.zzh = 1;
        zzx(z8, z9);
        zzH(zzanVarArr, zzxfVar, j9, j10, zzvoVar);
        zzZ(j9, z8);
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public /* synthetic */ void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public void zzt(int i9, @Nullable Object obj) throws zzjh {
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzu(int i9, zzpj zzpjVar, zzer zzerVar) {
        this.zze = i9;
        this.zzf = zzpjVar;
        this.zzg = zzerVar;
        zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public final void zzv() throws IOException {
        zzxf zzxfVar = this.zzi;
        zzxfVar.getClass();
        zzxfVar.zzd();
    }

    public void zzw() {
        throw null;
    }

    public void zzx(boolean z8, boolean z9) throws zzjh {
    }

    public void zzy() {
    }

    public void zzz(long j7, boolean z8) throws zzjh {
        throw null;
    }
}
