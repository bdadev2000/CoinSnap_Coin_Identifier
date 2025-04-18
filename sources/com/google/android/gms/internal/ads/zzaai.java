package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaai implements zzabv, zzaaa {
    final /* synthetic */ zzaak zza;
    private final Context zzb;
    private final int zzc;
    private final ArrayList zzd;
    private final zzaax zze;

    @Nullable
    private zzaf zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private long zzl;
    private boolean zzm;
    private long zzn;
    private zzabs zzo;
    private Executor zzp;

    public zzaai(zzaak zzaakVar, Context context) {
        Executor executor;
        this.zza = zzaakVar;
        this.zzb = context;
        this.zzc = true != zzeu.zzJ(context) ? 5 : 1;
        this.zzd = new ArrayList();
        this.zze = new zzaax();
        this.zzl = -9223372036854775807L;
        this.zzo = zzabs.zzb;
        executor = zzaak.zza;
        this.zzp = executor;
    }

    private final void zzA() {
        zzo zzw;
        if (this.zzf == null) {
            return;
        }
        new ArrayList(this.zzd);
        zzaf zzafVar = this.zzf;
        zzafVar.getClass();
        zzdi.zzb(null);
        zzo zzoVar = zzafVar.zzA;
        int i2 = zzafVar.zzt;
        int i3 = zzafVar.zzu;
        zzw = zzaak.zzw(zzoVar);
        zzag zzagVar = new zzag(zzw, i2, i3);
        zzagVar.zza(zzafVar.zzx);
        zzagVar.zzb();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final void zza(zzaak zzaakVar) {
        final zzabs zzabsVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaah
            @Override // java.lang.Runnable
            public final void run() {
                zzabsVar.zza(zzaai.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final void zzb(zzaak zzaakVar) {
        final zzabs zzabsVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaag
            @Override // java.lang.Runnable
            public final void run() {
                zzabsVar.zzb(zzaai.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final void zzc(zzaak zzaakVar, final zzcp zzcpVar) {
        final zzabs zzabsVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaf
            @Override // java.lang.Runnable
            public final void run() {
                zzabsVar.zzc(zzaai.this, zzcpVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final Surface zzd() {
        zzdi.zzf(false);
        zzdi.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zze() {
        this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzf() {
        zzaaz zzaazVar;
        zzaazVar = this.zza.zzd;
        zzaazVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzg(boolean z2) {
        zzaaz zzaazVar;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzaak.zzm(this.zza);
        if (z2) {
            zzaazVar = this.zza.zzd;
            zzaazVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzh(zzaf zzafVar) throws zzabu {
        zzaak.zzd(this.zza, zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzi(boolean z2) {
        zzaaz zzaazVar;
        zzaazVar = this.zza.zzd;
        zzaazVar.zzc(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzj(int i2, zzaf zzafVar) {
        zzaaz zzaazVar;
        zzdi.zzf(false);
        zzaazVar = this.zza.zzd;
        zzaazVar.zzl(zzafVar.zzv);
        this.zzf = zzafVar;
        if (this.zzm) {
            zzdi.zzf(this.zzl != -9223372036854775807L);
            this.zzn = this.zzl;
        } else {
            zzA();
            this.zzm = true;
            this.zzn = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzk() {
        zzaaz zzaazVar;
        zzaazVar = this.zza.zzd;
        zzaazVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzl(boolean z2) {
        zzaaz zzaazVar;
        zzaazVar = this.zza.zzd;
        zzaazVar.zze(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzm() {
        zzaaz zzaazVar;
        zzaazVar = this.zza.zzd;
        zzaazVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzn() {
        zzaaz zzaazVar;
        zzaazVar = this.zza.zzd;
        zzaazVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzo() {
        this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzp(long j2, long j3) throws zzabu {
        try {
            zzaak.zzo(this.zza, j2, j3);
        } catch (zzij e) {
            zzaf zzafVar = this.zzf;
            if (zzafVar == null) {
                zzafVar = new zzad().zzaf();
            }
            throw new zzabu(e, zzafVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzq(int i2) {
        zzaaz zzaazVar;
        zzaazVar = this.zza.zzd;
        zzaazVar.zzj(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzr(zzabs zzabsVar, Executor executor) {
        this.zzo = zzabsVar;
        this.zzp = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzs(Surface surface, zzel zzelVar) {
        this.zza.zzt(surface, zzelVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzt(@FloatRange float f2) {
        this.zza.zze.zzd(f2);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzu(long j2, long j3, long j4, long j5) {
        boolean z2 = this.zzk;
        boolean z3 = true;
        if (this.zzh == j3 && this.zzi == j4) {
            z3 = false;
        }
        this.zzk = z2 | z3;
        this.zzg = j2;
        this.zzh = j3;
        this.zzi = j4;
        this.zzj = j5;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzv(List list) {
        if (this.zzd.equals(list)) {
            return;
        }
        this.zzd.clear();
        this.zzd.addAll(list);
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzw(zzaaw zzaawVar) {
        this.zza.zzj = zzaawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzx(long j2, boolean z2, long j3, long j4, zzabt zzabtVar) throws zzabu {
        zzaaz zzaazVar;
        zzdi.zzf(false);
        long j5 = j2 - this.zzi;
        try {
            zzaazVar = this.zza.zzd;
            if (zzaazVar.zza(j5, j3, j4, this.zzg, z2, this.zze) != 4) {
                if (j5 < this.zzj && !z2) {
                    zzaap zzaapVar = (zzaap) zzabtVar;
                    zzaapVar.zzd.zzaQ(zzaapVar.zza, zzaapVar.zzb, zzaapVar.zzc);
                    return true;
                }
                zzp(j3, j4);
                long j6 = this.zzn;
                if (j6 != -9223372036854775807L) {
                    if (zzaak.zzu(this.zza, j6)) {
                        zzA();
                        this.zzn = -9223372036854775807L;
                    }
                }
                zzdi.zzb(null);
                throw null;
            }
            return false;
        } catch (zzij e) {
            zzaf zzafVar = this.zzf;
            zzdi.zzb(zzafVar);
            throw new zzabu(e, zzafVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzy() {
        return zzeu.zzJ(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzz(boolean z2) {
        boolean zzf;
        zzf = this.zza.zze.zzf(false);
        return zzf;
    }
}
