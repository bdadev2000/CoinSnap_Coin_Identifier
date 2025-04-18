package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbtj;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbto;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbur;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzad extends zzbb {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzba zzb;

    public zzad(zzba zzbaVar, Activity activity) {
        this.zza = activity;
        this.zzb = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzn(ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbur zzburVar;
        zzbtj zzbtjVar;
        zzbcv.zza(this.zza);
        if (!((Boolean) zzbe.zzc().zza(zzbcv.zzkn)).booleanValue()) {
            zzba zzbaVar = this.zzb;
            Activity activity = this.zza;
            zzbtjVar = zzbaVar.zze;
            return zzbtjVar.zza(activity);
        }
        try {
            return zzbtl.zzI(((zzbtp) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzac
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    return zzbto.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza)));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e) {
            this.zzb.zzg = zzbup.zza(this.zza.getApplicationContext());
            zzburVar = this.zzb.zzg;
            zzburVar.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
