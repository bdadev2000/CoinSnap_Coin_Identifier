package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfvu {
    private final Context zzb;
    private final zzfvv zzc;
    private boolean zzf;
    private final Intent zzg;

    @Nullable
    private ServiceConnection zzi;

    @Nullable
    private IInterface zzj;
    private final List zze = new ArrayList();
    private final String zzd = "OverlayDisplayService";
    private final zzfxg zza = zzfxk.zza(new zzfxg("OverlayDisplayService") { // from class: com.google.android.gms.internal.ads.zzfvl
        public final /* synthetic */ String zza = "OverlayDisplayService";

        @Override // com.google.android.gms.internal.ads.zzfxg
        public final Object zza() {
            HandlerThread handlerThread = new HandlerThread(this.zza, 10);
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    });
    private final IBinder.DeathRecipient zzh = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfvm
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfvu.this.zzk();
        }
    };

    public zzfvu(Context context, zzfvv zzfvvVar, String str, Intent intent, zzfuz zzfuzVar) {
        this.zzb = context;
        this.zzc = zzfvvVar;
        this.zzg = intent;
    }

    public static /* bridge */ /* synthetic */ IBinder.DeathRecipient zza(zzfvu zzfvuVar) {
        return zzfvuVar.zzh;
    }

    public static /* bridge */ /* synthetic */ IInterface zzb(zzfvu zzfvuVar) {
        return zzfvuVar.zzj;
    }

    public static /* bridge */ /* synthetic */ zzfvv zzd(zzfvu zzfvuVar) {
        return zzfvuVar.zzc;
    }

    public static /* bridge */ /* synthetic */ List zze(zzfvu zzfvuVar) {
        return zzfvuVar.zze;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzfvu zzfvuVar, boolean z10) {
        zzfvuVar.zzf = false;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfvu zzfvuVar, IInterface iInterface) {
        zzfvuVar.zzj = iInterface;
    }

    public final void zzo(final Runnable runnable) {
        ((Handler) this.zza.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvn
            @Override // java.lang.Runnable
            public final void run() {
                zzfvu.this.zzl(runnable);
            }
        });
    }

    @Nullable
    public final IInterface zzc() {
        return this.zzj;
    }

    public final void zzi(final Runnable runnable) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvo
            @Override // java.lang.Runnable
            public final void run() {
                zzfvu.this.zzj(runnable);
            }
        });
    }

    public final /* synthetic */ void zzj(Runnable runnable) {
        if (this.zzj == null && !this.zzf) {
            this.zzc.zzc("Initiate binding to the service.", new Object[0]);
            synchronized (this.zze) {
                this.zze.add(runnable);
            }
            zzfvs zzfvsVar = new zzfvs(this, null);
            this.zzi = zzfvsVar;
            this.zzf = true;
            if (!this.zzb.bindService(this.zzg, zzfvsVar, 1)) {
                this.zzc.zzc("Failed to bind to the service.", new Object[0]);
                this.zzf = false;
                synchronized (this.zze) {
                    this.zze.clear();
                }
                return;
            }
            return;
        }
        if (this.zzf) {
            this.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            synchronized (this.zze) {
                this.zze.add(runnable);
            }
            return;
        }
        runnable.run();
    }

    public final /* synthetic */ void zzk() {
        this.zzc.zzc("%s : Binder has died.", this.zzd);
        synchronized (this.zze) {
            this.zze.clear();
        }
    }

    public final /* synthetic */ void zzl(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e2) {
            this.zzc.zza("error caused by ", e2);
        }
    }

    public final /* synthetic */ void zzm() {
        if (this.zzj != null) {
            this.zzc.zzc("Unbind from service.", new Object[0]);
            Context context = this.zzb;
            ServiceConnection serviceConnection = this.zzi;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.zzf = false;
            this.zzj = null;
            this.zzi = null;
            synchronized (this.zze) {
                this.zze.clear();
            }
        }
    }

    public final void zzn() {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvp
            @Override // java.lang.Runnable
            public final void run() {
                zzfvu.this.zzm();
            }
        });
    }
}
