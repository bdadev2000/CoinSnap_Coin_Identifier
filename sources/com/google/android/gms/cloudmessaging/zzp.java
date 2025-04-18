package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzp implements ServiceConnection {
    zzq zzc;
    final /* synthetic */ zzv zzf;
    int zza = 0;
    final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i10);
            }
            zzp zzpVar = zzp.this;
            synchronized (zzpVar) {
                zzs zzsVar = (zzs) zzpVar.zze.get(i10);
                if (zzsVar == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                    return true;
                }
                zzpVar.zze.remove(i10);
                zzpVar.zzf();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    zzsVar.zzc(new zzt(4, "Not supported by GmsCore", null));
                    return true;
                }
                zzsVar.zza(data);
                return true;
            }
        }
    }));
    final Queue zzd = new ArrayDeque();
    final SparseArray zze = new SparseArray();

    public /* synthetic */ zzp(zzv zzvVar, zzo zzoVar) {
        this.zzf = zzvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzp zzpVar = zzp.this;
                IBinder iBinder2 = iBinder;
                synchronized (zzpVar) {
                    try {
                        if (iBinder2 == null) {
                            zzpVar.zza(0, "Null service connection");
                            return;
                        }
                        try {
                            zzpVar.zzc = new zzq(iBinder2);
                            zzpVar.zza = 2;
                            zzpVar.zzc();
                        } catch (RemoteException e2) {
                            zzpVar.zza(0, e2.getMessage());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            @Override // java.lang.Runnable
            public final void run() {
                zzp.this.zza(2, "Service disconnected");
            }
        });
    }

    public final synchronized void zza(int i10, @Nullable String str) {
        zzb(i10, str, null);
    }

    public final synchronized void zzb(int i10, @Nullable String str, @Nullable Throwable th2) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i11 = this.zza;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.zza = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.zza = 4;
            zzv zzvVar = this.zzf;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = zzvVar.zzb;
            connectionTracker.unbindService(context, this);
            zzt zztVar = new zzt(i10, str, th2);
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((zzs) it.next()).zzc(zztVar);
            }
            this.zzd.clear();
            for (int i12 = 0; i12 < this.zze.size(); i12++) {
                ((zzs) this.zze.valueAt(i12)).zzc(zztVar);
            }
            this.zze.clear();
            return;
        }
        throw new IllegalStateException();
    }

    public final void zzc() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                final zzs zzsVar;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                while (true) {
                    final zzp zzpVar = zzp.this;
                    synchronized (zzpVar) {
                        if (zzpVar.zza != 2) {
                            return;
                        }
                        if (zzpVar.zzd.isEmpty()) {
                            zzpVar.zzf();
                            return;
                        }
                        zzsVar = (zzs) zzpVar.zzd.poll();
                        zzpVar.zze.put(zzsVar.zza, zzsVar);
                        scheduledExecutorService2 = zzpVar.zzf.zzc;
                        scheduledExecutorService2.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzn
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzp.this.zze(zzsVar.zza);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(zzsVar)));
                    }
                    zzv zzvVar = zzpVar.zzf;
                    Messenger messenger = zzpVar.zzb;
                    int i10 = zzsVar.zzc;
                    context = zzvVar.zzb;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = zzsVar.zza;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zzsVar.zzb());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle(DataSchemeDataSource.SCHEME_DATA, zzsVar.zzd);
                    obtain.setData(bundle);
                    try {
                        zzpVar.zzc.zza(obtain);
                    } catch (RemoteException e2) {
                        zzpVar.zza(2, e2.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final synchronized void zze(int i10) {
        zzs zzsVar = (zzs) this.zze.get(i10);
        if (zzsVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.zze.remove(i10);
            zzsVar.zzc(new zzt(3, "Timed out waiting for response", null));
            zzf();
        }
    }

    public final synchronized void zzf() {
        Context context;
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.zza = 3;
            zzv zzvVar = this.zzf;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = zzvVar.zzb;
            connectionTracker.unbindService(context, this);
        }
    }

    public final synchronized boolean zzg(zzs zzsVar) {
        boolean z10;
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i10 = this.zza;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                this.zzd.add(zzsVar);
                zzc();
                return true;
            }
            this.zzd.add(zzsVar);
            return true;
        }
        this.zzd.add(zzsVar);
        if (this.zza == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.zza = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzf.zzb;
            if (!connectionTracker.bindService(context, intent, this, 1)) {
                zza(0, "Unable to bind to service");
            } else {
                scheduledExecutorService = this.zzf.zzc;
                scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzp.this.zzd();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e2) {
            zzb(0, "Unable to bind to service", e2);
        }
        return true;
    }
}
