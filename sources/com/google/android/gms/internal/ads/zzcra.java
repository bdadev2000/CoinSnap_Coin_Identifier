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

/* loaded from: classes2.dex */
public final class zzcra implements zzban, zzdag, com.google.android.gms.ads.internal.overlay.zzp, zzdaf {
    private final zzcqv zza;
    private final zzcqw zzb;
    private final zzbqt zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcqz zzh = new zzcqz();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcra(zzbqq zzbqqVar, zzcqw zzcqwVar, Executor executor, zzcqv zzcqvVar, Clock clock) {
        this.zza = zzcqvVar;
        zzbqb zzbqbVar = zzbqe.zza;
        this.zzd = zzbqqVar.zza("google.afma.activeView.handleUpdate", zzbqbVar, zzbqbVar);
        this.zzb = zzcqwVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzchd) it.next());
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdH() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final synchronized void zzdj(@Nullable Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdk() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final synchronized void zzdl(@Nullable Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final synchronized void zzdm(@Nullable Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final synchronized void zzdp(zzbam zzbamVar) {
        zzcqz zzcqzVar = this.zzh;
        zzcqzVar.zza = zzbamVar.zzj;
        zzcqzVar.zzf = zzbamVar;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i9) {
    }

    public final synchronized void zzg() {
        try {
            if (this.zzj.get() != null) {
                if (!this.zzi && this.zzg.get()) {
                    try {
                        this.zzh.zzd = this.zzf.elapsedRealtime();
                        final JSONObject zzb = this.zzb.zzb(this.zzh);
                        for (final zzchd zzchdVar : this.zzc) {
                            this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzchd.this.zzl("AFMA_updateActiveView", zzb);
                                }
                            });
                        }
                        zzccl.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
                        return;
                    } catch (Exception e4) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e4);
                        return;
                    }
                }
                return;
            }
            zzj();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzh(zzchd zzchdVar) {
        this.zzc.add(zzchdVar);
        this.zza.zzd(zzchdVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final synchronized void zzr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
