package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbii;
import com.google.android.gms.internal.ads.zzbjv;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbwl;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzau extends zzax {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaw zzd;

    public zzau(zzaw zzawVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
        this.zzd = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfa();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        HashMap hashMap = this.zzc;
        return zzceVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(hashMap));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbwl zzbwlVar;
        zzbjv zzbjvVar;
        zzbep.zza(this.zza.getContext());
        if (((Boolean) zzba.zzc().zza(zzbep.zzkI)).booleanValue()) {
            try {
                return zzbie.zze(((zzbii) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzat
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        return zzbih.zzb(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e4) {
                this.zzd.zzh = zzbwj.zza(this.zza.getContext());
                zzbwlVar = this.zzd.zzh;
                zzbwlVar.zzh(e4, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        zzaw zzawVar = this.zzd;
        View view = this.zza;
        HashMap hashMap = this.zzb;
        HashMap hashMap2 = this.zzc;
        zzbjvVar = zzawVar.zzg;
        return zzbjvVar.zza(view, hashMap, hashMap2);
    }
}
