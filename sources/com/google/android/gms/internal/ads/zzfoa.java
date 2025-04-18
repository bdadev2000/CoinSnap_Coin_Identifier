package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class zzfoa {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzbpl zzd;
    protected final com.google.android.gms.ads.internal.client.zzfu zze;
    private final com.google.android.gms.ads.internal.client.zzcf zzg;
    private final zzfnm zzi;
    private final ScheduledExecutorService zzk;
    private final Clock zzm;
    private final ConcurrentLinkedQueue zzh = new ConcurrentLinkedQueue();
    protected final AtomicBoolean zzf = new AtomicBoolean(true);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    private final AtomicBoolean zzl = new AtomicBoolean(true);

    public zzfoa(ClientApi clientApi, Context context, int i2, zzbpl zzbplVar, @NonNull com.google.android.gms.ads.internal.client.zzfu zzfuVar, @NonNull com.google.android.gms.ads.internal.client.zzcf zzcfVar, @NonNull ScheduledExecutorService scheduledExecutorService, zzfnm zzfnmVar, Clock clock) {
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i2;
        this.zzd = zzbplVar;
        this.zze = zzfuVar;
        this.zzg = zzcfVar;
        this.zzk = scheduledExecutorService;
        this.zzi = zzfnmVar;
        this.zzm = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(Object obj) {
        zzfnu zzfnuVar = new zzfnu(obj, this.zzm);
        this.zzh.add(zzfnuVar);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnx
            @Override // java.lang.Runnable
            public final void run() {
                zzfoa.this.zzi();
            }
        });
        this.zzk.schedule(new zzfnv(this), zzfnuVar.zza(), TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzn() {
        Iterator it = this.zzh.iterator();
        while (it.hasNext()) {
            if (((zzfnu) it.next()).zzc()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzo(boolean z2) {
        try {
            if (this.zzi.zzd()) {
                return;
            }
            if (z2) {
                this.zzi.zzb();
            }
            this.zzk.schedule(new zzfnv(this), this.zzi.zza(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract ListenableFuture zza();

    public final synchronized zzfoa zzc() {
        this.zzk.submit(new zzfnv(this));
        return this;
    }

    @Nullable
    public final synchronized Object zzd() {
        zzn();
        this.zzi.zzc();
        zzfnu zzfnuVar = (zzfnu) this.zzh.poll();
        zzh(true);
        if (zzfnuVar == null) {
            return null;
        }
        return zzfnuVar.zzb();
    }

    public final synchronized void zzh(boolean z2) {
        if (!z2) {
            try {
                zzn();
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnw
            @Override // java.lang.Runnable
            public final void run() {
                zzfoa.this.zzj();
            }
        });
        if (!this.zzj.get()) {
            if (this.zzh.size() < this.zze.zzd && this.zzf.get()) {
                this.zzj.set(true);
                zzgfo.zzr(zza(), new zzfny(this), this.zzk);
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
        return !this.zzh.isEmpty();
    }
}
