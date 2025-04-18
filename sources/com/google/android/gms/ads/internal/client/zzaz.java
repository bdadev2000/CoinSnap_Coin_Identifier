package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbgh;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgl;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaz extends zzbb {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzba zzd;

    public zzaz(zzba zzbaVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
        this.zzd = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        HashMap hashMap = this.zzc;
        return zzcpVar.zzk(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(hashMap));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbul zzbulVar;
        zzbhy zzbhyVar;
        zzbcn.zza(this.zza.getContext());
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzkp)).booleanValue()) {
            try {
                return zzbgh.zze(((zzbgl) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzay
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        return zzbgk.zzb((IBinder) obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e2) {
                this.zzd.zzg = zzbuj.zza(this.zza.getContext());
                zzbulVar = this.zzd.zzg;
                zzbulVar.zzh(e2, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        zzba zzbaVar = this.zzd;
        View view = this.zza;
        HashMap hashMap = this.zzb;
        HashMap hashMap2 = this.zzc;
        zzbhyVar = zzbaVar.zzf;
        return zzbhyVar.zza(view, hashMap, hashMap2);
    }
}
