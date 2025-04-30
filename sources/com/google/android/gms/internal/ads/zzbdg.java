package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbdg implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbcy zza;
    final /* synthetic */ zzccn zzb;
    final /* synthetic */ zzbdi zzc;

    public zzbdg(zzbdi zzbdiVar, zzbcy zzbcyVar, zzccn zzccnVar) {
        this.zza = zzbcyVar;
        this.zzb = zzccnVar;
        this.zzc = zzbdiVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Object obj;
        boolean z8;
        final zzbcx zzbcxVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            try {
                zzbdi zzbdiVar = this.zzc;
                z8 = zzbdiVar.zzb;
                if (z8) {
                    return;
                }
                zzbdiVar.zzb = true;
                zzbcxVar = this.zzc.zza;
                if (zzbcxVar == null) {
                    return;
                }
                zzgge zzggeVar = zzcci.zza;
                final zzbcy zzbcyVar = this.zza;
                final zzccn zzccnVar = this.zzb;
                final f4.c zza = zzggeVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbcv zzf;
                        zzbdg zzbdgVar = zzbdg.this;
                        zzbcx zzbcxVar2 = zzbcxVar;
                        zzccn zzccnVar2 = zzccnVar;
                        try {
                            zzbda zzq = zzbcxVar2.zzq();
                            boolean zzp = zzbcxVar2.zzp();
                            zzbcy zzbcyVar2 = zzbcyVar;
                            if (zzp) {
                                zzf = zzq.zzg(zzbcyVar2);
                            } else {
                                zzf = zzq.zzf(zzbcyVar2);
                            }
                            if (!zzf.zze()) {
                                zzccnVar2.zzd(new RuntimeException("No entry contents."));
                                zzbdi.zze(zzbdgVar.zzc);
                                return;
                            }
                            zzbdf zzbdfVar = new zzbdf(zzbdgVar, zzf.zzc(), 1);
                            int read = zzbdfVar.read();
                            if (read != -1) {
                                zzbdfVar.unread(read);
                                zzccnVar2.zzc(zzbdk.zzb(zzbdfVar, zzf.zzd(), zzf.zzg(), zzf.zza(), zzf.zzf()));
                                return;
                            }
                            throw new IOException("Unable to read from cache.");
                        } catch (RemoteException e4) {
                            e = e4;
                            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e);
                            zzccnVar2.zzd(e);
                            zzbdi.zze(zzbdgVar.zzc);
                        } catch (IOException e9) {
                            e = e9;
                            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e);
                            zzccnVar2.zzd(e);
                            zzbdi.zze(zzbdgVar.zzc);
                        }
                    }
                });
                final zzccn zzccnVar2 = this.zzb;
                zzccnVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbde
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (zzccn.this.isCancelled()) {
                            zza.cancel(true);
                        }
                    }
                }, zzcci.zzf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i9) {
    }
}
