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
public final class zzfxc {
    private final Context zzb;
    private final zzfxd zzc;
    private boolean zzf;
    private final Intent zzg;

    @Nullable
    private ServiceConnection zzi;

    @Nullable
    private IInterface zzj;
    private final List zze = new ArrayList();
    private final String zzd = "OverlayDisplayService";
    private final zzfyp zza = zzfyt.zza(new zzfyp("OverlayDisplayService") { // from class: com.google.android.gms.internal.ads.zzfwt
        public final /* synthetic */ String zza = "OverlayDisplayService";

        @Override // com.google.android.gms.internal.ads.zzfyp
        public final Object zza() {
            HandlerThread handlerThread = new HandlerThread(this.zza, 10);
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    });
    private final IBinder.DeathRecipient zzh = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfwu
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfxc.this.zzk();
        }
    };

    public zzfxc(Context context, zzfxd zzfxdVar, String str, Intent intent, zzfwh zzfwhVar) {
        this.zzb = context;
        this.zzc = zzfxdVar;
        this.zzg = intent;
    }

    public static /* bridge */ /* synthetic */ IBinder.DeathRecipient zza(zzfxc zzfxcVar) {
        return zzfxcVar.zzh;
    }

    public static /* bridge */ /* synthetic */ IInterface zzb(zzfxc zzfxcVar) {
        return zzfxcVar.zzj;
    }

    public static /* bridge */ /* synthetic */ zzfxd zzd(zzfxc zzfxcVar) {
        return zzfxcVar.zzc;
    }

    public static /* bridge */ /* synthetic */ List zze(zzfxc zzfxcVar) {
        return zzfxcVar.zze;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzfxc zzfxcVar, boolean z2) {
        zzfxcVar.zzf = false;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfxc zzfxcVar, IInterface iInterface) {
        zzfxcVar.zzj = iInterface;
    }

    public final void zzo(final Runnable runnable) {
        ((Handler) this.zza.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwv
            @Override // java.lang.Runnable
            public final void run() {
                zzfxc.this.zzl(runnable);
            }
        });
    }

    @Nullable
    public final IInterface zzc() {
        return this.zzj;
    }

    public final void zzi(final Runnable runnable) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfww
            @Override // java.lang.Runnable
            public final void run() {
                zzfxc.this.zzj(runnable);
            }
        });
    }

    public final /* synthetic */ void zzj(Runnable runnable) {
        if (this.zzj != null || this.zzf) {
            if (!this.zzf) {
                runnable.run();
                return;
            }
            this.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            synchronized (this.zze) {
                this.zze.add(runnable);
            }
            return;
        }
        this.zzc.zzc("Initiate binding to the service.", new Object[0]);
        synchronized (this.zze) {
            this.zze.add(runnable);
        }
        zzfxb zzfxbVar = new zzfxb(this, null);
        this.zzi = zzfxbVar;
        this.zzf = true;
        if (this.zzb.bindService(this.zzg, zzfxbVar, 1)) {
            return;
        }
        this.zzc.zzc("Failed to bind to the service.", new Object[0]);
        this.zzf = false;
        synchronized (this.zze) {
            this.zze.clear();
        }
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
        } catch (RuntimeException e) {
            this.zzc.zza("error caused by ", e);
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
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwx
            @Override // java.lang.Runnable
            public final void run() {
                zzfxc.this.zzm();
            }
        });
    }
}
