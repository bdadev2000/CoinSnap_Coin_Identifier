package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzbbo implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbbg zza;
    final /* synthetic */ zzcas zzb;
    final /* synthetic */ zzbbq zzc;

    public zzbbo(zzbbq zzbbqVar, zzbbg zzbbgVar, zzcas zzcasVar) {
        this.zza = zzbbgVar;
        this.zzb = zzcasVar;
        this.zzc = zzbbqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Object obj;
        boolean z2;
        final zzbbf zzbbfVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            try {
                zzbbq zzbbqVar = this.zzc;
                z2 = zzbbqVar.zzb;
                if (z2) {
                    return;
                }
                zzbbqVar.zzb = true;
                zzbbfVar = this.zzc.zza;
                if (zzbbfVar == null) {
                    return;
                }
                final ListenableFuture zza = zzcan.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbbo zzbboVar = zzbbo.this;
                        zzbbf zzbbfVar2 = zzbbfVar;
                        try {
                            zzbbi zzq = zzbbfVar2.zzq();
                            zzbbd zzg = zzbbfVar2.zzp() ? zzq.zzg(zzbboVar.zza) : zzq.zzf(zzbboVar.zza);
                            if (!zzg.zze()) {
                                zzbboVar.zzb.zzd(new RuntimeException("No entry contents."));
                                zzbbq.zze(zzbboVar.zzc);
                                return;
                            }
                            zzbbn zzbbnVar = new zzbbn(zzbboVar, zzg.zzc(), 1);
                            int read = zzbbnVar.read();
                            if (read == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbbnVar.unread(read);
                            zzbboVar.zzb.zzc(zzbbs.zzb(zzbbnVar, zzg.zzd(), zzg.zzg(), zzg.zza(), zzg.zzf()));
                        } catch (RemoteException e) {
                            e = e;
                            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e);
                            zzbboVar.zzb.zzd(e);
                            zzbbq.zze(zzbboVar.zzc);
                        } catch (IOException e2) {
                            e = e2;
                            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e);
                            zzbboVar.zzb.zzd(e);
                            zzbbq.zze(zzbboVar.zzc);
                        }
                    }
                });
                this.zzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbm
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (zzbbo.this.zzb.isCancelled()) {
                            zza.cancel(true);
                        }
                    }
                }, zzcan.zzf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
    }
}
