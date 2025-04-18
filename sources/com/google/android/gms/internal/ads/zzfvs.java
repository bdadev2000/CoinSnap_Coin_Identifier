package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfvs implements ServiceConnection {
    final /* synthetic */ zzfvu zza;

    public /* synthetic */ zzfvs(zzfvu zzfvuVar, zzfvt zzfvtVar) {
        this.zza = zzfvuVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzfvu.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzfvu.zzh(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvq
            @Override // java.lang.Runnable
            public final void run() {
                zzftu zzb = zzftt.zzb(iBinder);
                zzfvs zzfvsVar = zzfvs.this;
                zzfvu.zzg(zzfvsVar.zza, zzb);
                zzfvu.zzd(zzfvsVar.zza).zzc("linkToDeath", new Object[0]);
                try {
                    IInterface zzb2 = zzfvu.zzb(zzfvsVar.zza);
                    zzb2.getClass();
                    zzb2.asBinder().linkToDeath(zzfvu.zza(zzfvsVar.zza), 0);
                } catch (RemoteException e2) {
                    zzfvu.zzd(zzfvsVar.zza).zzb(e2, "linkToDeath failed", new Object[0]);
                }
                zzfvu.zzf(zzfvsVar.zza, false);
                synchronized (zzfvu.zze(zzfvsVar.zza)) {
                    Iterator it = zzfvu.zze(zzfvsVar.zza).iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zzfvu.zze(zzfvsVar.zza).clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfvu.zzd(this.zza).zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzfvu.zzh(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvr
            @Override // java.lang.Runnable
            public final void run() {
                zzfvs zzfvsVar = zzfvs.this;
                zzfvu.zzd(zzfvsVar.zza).zzc("unlinkToDeath", new Object[0]);
                IInterface zzb = zzfvu.zzb(zzfvsVar.zza);
                zzb.getClass();
                zzb.asBinder().unlinkToDeath(zzfvu.zza(zzfvsVar.zza), 0);
                zzfvu.zzg(zzfvsVar.zza, null);
                zzfvu.zzf(zzfvsVar.zza, false);
            }
        });
    }
}
