package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcny implements zzaym, zzcxh, com.google.android.gms.ads.internal.overlay.zzr, zzcxg {
    private final zzcnt zza;
    private final zzcnu zzb;
    private final zzbou zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcnx zzh = new zzcnx();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcny(zzbor zzborVar, zzcnu zzcnuVar, Executor executor, zzcnt zzcntVar, Clock clock) {
        this.zza = zzcntVar;
        zzboc zzbocVar = zzbof.zza;
        this.zzd = zzborVar.zza("google.afma.activeView.handleUpdate", zzbocVar, zzbocVar);
        this.zzb = zzcnuVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzcfk) it.next());
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdH() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzdj(@Nullable Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdk() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzdl(@Nullable Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzdm(@Nullable Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final synchronized void zzdp(zzayl zzaylVar) {
        zzcnx zzcnxVar = this.zzh;
        zzcnxVar.zza = zzaylVar.zzj;
        zzcnxVar.zzf = zzaylVar;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int i10) {
    }

    public final synchronized void zzg() {
        if (this.zzj.get() != null) {
            if (!this.zzi && this.zzg.get()) {
                try {
                    this.zzh.zzd = this.zzf.elapsedRealtime();
                    final JSONObject zzb = this.zzb.zzb(this.zzh);
                    for (final zzcfk zzcfkVar : this.zzc) {
                        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnw
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcfk.this.zzl("AFMA_updateActiveView", zzb);
                            }
                        });
                    }
                    zzcam.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
                    return;
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e2);
                    return;
                }
            }
            return;
        }
        zzj();
    }

    public final synchronized void zzh(zzcfk zzcfkVar) {
        this.zzc.add(zzcfkVar);
        this.zza.zzd(zzcfkVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
