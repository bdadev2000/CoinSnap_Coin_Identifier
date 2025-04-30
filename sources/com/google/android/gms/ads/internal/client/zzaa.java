package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbwl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaa extends zzax {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzaw zzb;

    public zzaa(zzaw zzawVar, Activity activity) {
        this.zza = activity;
        this.zzb = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzm(ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbwl zzbwlVar;
        zzbvd zzbvdVar;
        zzbep.zza(this.zza);
        if (((Boolean) zzba.zzc().zza(zzbep.zzkI)).booleanValue()) {
            try {
                return zzbvf.zzI(((zzbvj) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzz
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        return zzbvi.zzb(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e4) {
                this.zzb.zzh = zzbwj.zza(this.zza.getApplicationContext());
                zzbwlVar = this.zzb.zzh;
                zzbwlVar.zzh(e4, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        zzaw zzawVar = this.zzb;
        Activity activity = this.zza;
        zzbvdVar = zzawVar.zzf;
        return zzbvdVar.zza(activity);
    }
}
