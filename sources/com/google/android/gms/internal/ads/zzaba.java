package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaba implements zzacm, zzaas {
    final /* synthetic */ zzabc zza;
    private final Context zzb;
    private final int zzc;
    private final ArrayList zzd;
    private zzds zze;

    @Nullable
    private zzan zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private boolean zzj;
    private long zzk;
    private zzack zzl;
    private Executor zzm;

    public zzaba(zzabc zzabcVar, Context context) {
        Executor executor;
        this.zza = zzabcVar;
        this.zzb = context;
        this.zzc = true != zzgd.zzL(context) ? 5 : 1;
        this.zzd = new ArrayList();
        this.zzi = C.TIME_UNSET;
        this.zzl = zzack.zzb;
        executor = zzabc.zza;
        this.zzm = executor;
    }

    private final void zzm() {
        zzt zzu;
        if (this.zzf == null) {
            return;
        }
        new ArrayList().addAll(this.zzd);
        zzan zzanVar = this.zzf;
        zzanVar.getClass();
        zzeq.zzb(null);
        int i9 = zzanVar.zzt;
        int i10 = zzanVar.zzs;
        zzu = zzabc.zzu(zzanVar.zzz);
        zzao zzaoVar = new zzao(zzu, i10, i9);
        zzaoVar.zza(zzanVar.zzw);
        zzaoVar.zzb();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final void zza(zzabc zzabcVar) {
        final zzack zzackVar = this.zzl;
        this.zzm.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaz
            @Override // java.lang.Runnable
            public final void run() {
                zzackVar.zza(zzaba.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final void zzb(zzabc zzabcVar) {
        final zzack zzackVar = this.zzl;
        this.zzm.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaay
            @Override // java.lang.Runnable
            public final void run() {
                zzackVar.zzb(zzaba.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final void zzc(zzabc zzabcVar, final zzdv zzdvVar) {
        final zzack zzackVar = this.zzl;
        this.zzm.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaax
            @Override // java.lang.Runnable
            public final void run() {
                zzackVar.zzc(zzaba.this, zzdvVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final long zzd(long j7, boolean z8) {
        zzeq.zzf(false);
        long j9 = this.zzk;
        if (j9 != C.TIME_UNSET) {
            if (!zzabc.zzt(this.zza, j9)) {
                return C.TIME_UNSET;
            }
            zzm();
            this.zzk = C.TIME_UNSET;
        }
        zzeq.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zze() {
        this.zzj = false;
        this.zzi = C.TIME_UNSET;
        zzabc.zzg(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzf(zzan zzanVar, zzer zzerVar) throws zzacl {
        this.zze = zzabc.zzb(this.zza, zzanVar, zzerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzg(int i9, zzan zzanVar) {
        boolean z8 = false;
        zzeq.zzf(false);
        int i10 = zzgd.zza;
        this.zzf = zzanVar;
        if (!this.zzj) {
            zzm();
            this.zzj = true;
            this.zzk = C.TIME_UNSET;
        } else {
            if (this.zzi != C.TIME_UNSET) {
                z8 = true;
            }
            zzeq.zzf(z8);
            this.zzk = this.zzi;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzh(long j7, long j9) throws zzacl {
        zzeq.zzf(false);
        try {
            this.zza.zzo(j7, j9);
        } catch (zzjh e4) {
            zzan zzanVar = this.zzf;
            if (zzanVar == null) {
                zzanVar = new zzal().zzad();
            }
            throw new zzacl(e4, zzanVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzi(zzack zzackVar, Executor executor) {
        this.zzl = zzackVar;
        this.zzm = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzj(long j7) {
        this.zzh = this.zzg != j7;
        this.zzg = j7;
    }

    public final void zzk(List list) {
        this.zzd.clear();
        this.zzd.addAll(list);
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final boolean zzl() {
        return zzgd.zzL(this.zzb);
    }
}
