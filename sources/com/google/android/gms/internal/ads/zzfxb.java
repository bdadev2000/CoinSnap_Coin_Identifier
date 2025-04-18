package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfxb implements ServiceConnection {
    final /* synthetic */ zzfxc zza;

    public /* synthetic */ zzfxb(zzfxc zzfxcVar, zzfxa zzfxaVar) {
        this.zza = zzfxcVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzfxc.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzfxc.zzh(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwy
            @Override // java.lang.Runnable
            public final void run() {
                zzfvc zzb = zzfvb.zzb(iBinder);
                zzfxb zzfxbVar = zzfxb.this;
                zzfxc.zzg(zzfxbVar.zza, zzb);
                zzfxc.zzd(zzfxbVar.zza).zzc("linkToDeath", new Object[0]);
                try {
                    IInterface zzb2 = zzfxc.zzb(zzfxbVar.zza);
                    zzb2.getClass();
                    zzb2.asBinder().linkToDeath(zzfxc.zza(zzfxbVar.zza), 0);
                } catch (RemoteException e) {
                    zzfxc.zzd(zzfxbVar.zza).zzb(e, "linkToDeath failed", new Object[0]);
                }
                zzfxc.zzf(zzfxbVar.zza, false);
                synchronized (zzfxc.zze(zzfxbVar.zza)) {
                    try {
                        Iterator it = zzfxc.zze(zzfxbVar.zza).iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        zzfxc.zze(zzfxbVar.zza).clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfxc.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzfxc.zzh(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwz
            @Override // java.lang.Runnable
            public final void run() {
                zzfxb zzfxbVar = zzfxb.this;
                zzfxc.zzd(zzfxbVar.zza).zzc("unlinkToDeath", new Object[0]);
                IInterface zzb = zzfxc.zzb(zzfxbVar.zza);
                zzb.getClass();
                zzb.asBinder().unlinkToDeath(zzfxc.zza(zzfxbVar.zza), 0);
                zzfxc.zzg(zzfxbVar.zza, null);
                zzfxc.zzf(zzfxbVar.zza, false);
            }
        });
    }
}
