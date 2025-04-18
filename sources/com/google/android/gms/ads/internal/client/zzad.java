package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbtj;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
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
        zzbul zzbulVar;
        zzbtd zzbtdVar;
        zzbcn.zza(this.zza);
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzkp)).booleanValue()) {
            try {
                return zzbtf.zzI(((zzbtj) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzac
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        return zzbti.zzb((IBinder) obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e2) {
                this.zzb.zzg = zzbuj.zza(this.zza.getApplicationContext());
                zzbulVar = this.zzb.zzg;
                zzbulVar.zzh(e2, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        zzba zzbaVar = this.zzb;
        Activity activity = this.zza;
        zzbtdVar = zzbaVar.zze;
        return zzbtdVar.zza(activity);
    }
}
