package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzepc implements AppEventListener, zzdcg, zzdaz, zzczo, zzdaf, com.google.android.gms.ads.internal.client.zza, zzczl, zzdbw, zzdab, zzdhi {

    @Nullable
    final zzdvc zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziR)).intValue());

    public zzepc(@Nullable zzdvc zzdvcVar) {
        this.zza = zzdvcVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            for (final Pair pair : this.zzb) {
                zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeon
                    @Override // com.google.android.gms.internal.ads.zzfdx
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zzb.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkM)).booleanValue()) {
            zzfdy.zza(this.zzc, new zzepa());
        }
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (this.zzh.get()) {
            if (!this.zzb.offer(new Pair(str, str2))) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("The queue for app events is full, dropping the new event.");
                zzdvc zzdvcVar = this.zza;
                if (zzdvcVar != null) {
                    zzdvb zza = zzdvcVar.zza();
                    zza.zzb("action", "dae_action");
                    zza.zzb("dae_name", str);
                    zza.zzb("dae_data", str2);
                    zza.zzf();
                    return;
                }
            }
            return;
        }
        zzfdy.zza(this.zzd, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeou
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcb) obj).zzc(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zza() {
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeok
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd();
            }
        });
        zzfdy.zza(this.zzg, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeol
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzb() {
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeov
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzc() {
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeox
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzj();
            }
        });
        zzfdy.zza(this.zzg, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeoy
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzf();
            }
        });
        zzfdy.zza(this.zzg, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeoz
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeoo
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzf(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeop
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zze(com.google.android.gms.ads.internal.client.zze.this.zza);
            }
        });
        zzfdy.zza(this.zzf, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeoq
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzb(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdG() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkM)).booleanValue()) {
            zzfdy.zza(this.zzc, new zzepa());
        }
        zzfdy.zza(this.zzg, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeom
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdf() {
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeow
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(zzfhf zzfhfVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzds(zzbyh zzbyhVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzf() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh zzg() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzh(@NonNull final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfdy.zza(this.zze, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzepb
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcb zzi() {
        return (com.google.android.gms.ads.internal.client.zzcb) this.zzd.get();
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzc.set(zzbhVar);
    }

    public final void zzk(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.set(zzbkVar);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zze.set(zzdgVar);
    }

    public final void zzm(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        this.zzd.set(zzcbVar);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzg.set(zzciVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdab
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfdy.zza(this.zzg, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeot
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzci) obj).zzd(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeoj
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final synchronized void zzs() {
        zzfdy.zza(this.zzc, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeor
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzi();
            }
        });
        zzfdy.zza(this.zzf, new zzfdx() { // from class: com.google.android.gms.internal.ads.zzeos
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }
}
