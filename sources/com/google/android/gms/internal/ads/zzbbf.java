package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbbf implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbax zza;
    final /* synthetic */ zzcao zzb;
    final /* synthetic */ zzbbh zzc;

    public zzbbf(zzbbh zzbbhVar, zzbax zzbaxVar, zzcao zzcaoVar) {
        this.zza = zzbaxVar;
        this.zzb = zzcaoVar;
        this.zzc = zzbbhVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Object obj;
        boolean z10;
        final zzbaw zzbawVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzbbh zzbbhVar = this.zzc;
            z10 = zzbbhVar.zzb;
            if (z10) {
                return;
            }
            zzbbhVar.zzb = true;
            zzbawVar = this.zzc.zza;
            if (zzbawVar == null) {
                return;
            }
            final ua.b zza = zzcaj.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbc
                @Override // java.lang.Runnable
                public final void run() {
                    zzbau zzf;
                    zzbbf zzbbfVar = zzbbf.this;
                    zzbaw zzbawVar2 = zzbawVar;
                    try {
                        zzbaz zzq = zzbawVar2.zzq();
                        if (zzbawVar2.zzp()) {
                            zzf = zzq.zzg(zzbbfVar.zza);
                        } else {
                            zzf = zzq.zzf(zzbbfVar.zza);
                        }
                        if (!zzf.zze()) {
                            zzbbfVar.zzb.zzd(new RuntimeException("No entry contents."));
                            zzbbh.zze(zzbbfVar.zzc);
                            return;
                        }
                        zzbbe zzbbeVar = new zzbbe(zzbbfVar, zzf.zzc(), 1);
                        int read = zzbbeVar.read();
                        if (read != -1) {
                            zzbbeVar.unread(read);
                            zzbbfVar.zzb.zzc(zzbbj.zzb(zzbbeVar, zzf.zzd(), zzf.zzg(), zzf.zza(), zzf.zzf()));
                            return;
                        }
                        throw new IOException("Unable to read from cache.");
                    } catch (RemoteException | IOException e2) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e2);
                        zzbbfVar.zzb.zzd(e2);
                        zzbbh.zze(zzbbfVar.zzc);
                    }
                }
            });
            this.zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbd
                @Override // java.lang.Runnable
                public final void run() {
                    if (zzbbf.this.zzb.isCancelled()) {
                        zza.cancel(true);
                    }
                }
            }, zzcaj.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}
