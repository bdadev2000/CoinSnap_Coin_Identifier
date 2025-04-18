package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class zzfmo {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzbpg zzd;
    protected final com.google.android.gms.ads.internal.client.zzft zze;
    private final com.google.android.gms.ads.internal.client.zzcf zzg;
    private final zzflx zzi;
    private final ScheduledExecutorService zzk;
    private final Clock zzm;
    private final ConcurrentLinkedQueue zzh = new ConcurrentLinkedQueue();
    protected final AtomicBoolean zzf = new AtomicBoolean(true);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    private final AtomicBoolean zzl = new AtomicBoolean(true);

    public zzfmo(ClientApi clientApi, Context context, int i10, zzbpg zzbpgVar, @NonNull com.google.android.gms.ads.internal.client.zzft zzftVar, @NonNull com.google.android.gms.ads.internal.client.zzcf zzcfVar, @NonNull ScheduledExecutorService scheduledExecutorService, zzflx zzflxVar, Clock clock) {
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i10;
        this.zzd = zzbpgVar;
        this.zze = zzftVar;
        this.zzg = zzcfVar;
        this.zzk = scheduledExecutorService;
        this.zzi = zzflxVar;
        this.zzm = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(Object obj) {
        zzfmi zzfmiVar = new zzfmi(obj, this.zzm);
        this.zzh.add(zzfmiVar);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmk
            @Override // java.lang.Runnable
            public final void run() {
                zzfmo.this.zzi();
            }
        });
        this.zzk.schedule(new zzfmj(this), zzfmiVar.zza(), TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzn() {
        Iterator it = this.zzh.iterator();
        while (it.hasNext()) {
            if (((zzfmi) it.next()).zzc()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzo(boolean z10) {
        if (!this.zzi.zzd()) {
            if (z10) {
                this.zzi.zzb();
            }
            this.zzk.schedule(new zzfmj(this), this.zzi.zza(), TimeUnit.MILLISECONDS);
        }
    }

    public abstract ua.b zza();

    public final synchronized zzfmo zzc() {
        this.zzk.submit(new zzfmj(this));
        return this;
    }

    @Nullable
    public final synchronized Object zzd() {
        this.zzi.zzc();
        zzfmi zzfmiVar = (zzfmi) this.zzh.poll();
        zzh();
        if (zzfmiVar == null) {
            return null;
        }
        return zzfmiVar.zzb();
    }

    public final synchronized void zzh() {
        zzn();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfml
            @Override // java.lang.Runnable
            public final void run() {
                zzfmo.this.zzj();
            }
        });
        if (!this.zzj.get() && this.zzf.get()) {
            if (this.zzh.size() < this.zze.zzd) {
                this.zzj.set(true);
                zzgei.zzr(zza(), new zzfmm(this), this.zzk);
            }
        }
    }

    public final /* synthetic */ void zzi() {
        if (this.zzl.get()) {
            try {
                this.zzg.zze(this.zze);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to call onAdsAvailable");
            }
        }
    }

    public final /* synthetic */ void zzj() {
        if (this.zzl.get() && this.zzh.isEmpty()) {
            try {
                this.zzg.zzf(this.zze);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to call onAdsExhausted");
            }
        }
    }

    public final void zzk() {
        this.zzf.set(false);
        this.zzl.set(false);
    }

    public final synchronized boolean zzl() {
        zzn();
        if (!this.zzh.isEmpty()) {
            return true;
        }
        return false;
    }
}
