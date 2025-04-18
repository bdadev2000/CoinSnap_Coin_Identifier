package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzems implements AppEventListener, zzczj, zzcya, zzcwp, zzcxg, com.google.android.gms.ads.internal.client.zza, zzcwm, zzcyx, zzcxc, zzdel {

    @Nullable
    final zzdsm zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziw)).intValue());

    public zzems(@Nullable zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            for (final Pair pair : this.zzb) {
                zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemd
                    @Override // com.google.android.gms.internal.ads.zzfbx
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcm) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zzb.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkt)).booleanValue()) {
            zzfby.zza(this.zzc, new zzemq());
        }
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (this.zzh.get()) {
            if (!this.zzb.offer(new Pair(str, str2))) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("The queue for app events is full, dropping the new event.");
                zzdsm zzdsmVar = this.zza;
                if (zzdsmVar != null) {
                    zzdsl zza = zzdsmVar.zza();
                    zza.zzb("action", "dae_action");
                    zza.zzb("dae_name", str);
                    zza.zzb("dae_data", str2);
                    zza.zzf();
                    return;
                }
            }
            return;
        }
        zzfby.zza(this.zzd, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemk
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcm) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zza() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzd();
            }
        });
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemb
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzb() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzeml
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzc() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemn
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzj();
            }
        });
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemo
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzf();
            }
        });
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemp
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemf
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zze(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
        zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemg
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbo) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkt)).booleanValue()) {
            zzfby.zza(this.zzc, new zzemq());
        }
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemc
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemm
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzds(zzbwj zzbwjVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzf() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbl zzg() {
        return (com.google.android.gms.ads.internal.client.zzbl) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcyx
    public final void zzh(@NonNull final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        zzfby.zza(this.zze, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemr
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(com.google.android.gms.ads.internal.client.zzu.this);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcm zzi() {
        return (com.google.android.gms.ads.internal.client.zzcm) this.zzd.get();
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        this.zzc.set(zzblVar);
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzbo zzboVar) {
        this.zzf.set(zzboVar);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zze.set(zzdrVar);
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzcm zzcmVar) {
        this.zzd.set(zzcmVar);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzct zzctVar) {
        this.zzg.set(zzctVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfby.zza(this.zzg, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemj
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzct) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final synchronized void zzs() {
        zzfby.zza(this.zzc, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemh
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbl) obj).zzi();
            }
        });
        zzfby.zza(this.zzf, new zzfbx() { // from class: com.google.android.gms.internal.ads.zzemi
            @Override // com.google.android.gms.internal.ads.zzfbx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbo) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }
}
