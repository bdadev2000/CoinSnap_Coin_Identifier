package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbul;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzax extends zzbb {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzba zzd;

    public zzax(zzba zzbaVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
        this.zzd = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zzc, "native_ad_view_delegate");
        return new zzfn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbul zzbulVar;
        zzbhx zzbhxVar;
        zzbcn.zza(this.zzc);
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzkp)).booleanValue()) {
            try {
                return zzbgb.zzdA(((zzbgf) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzaw
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        return zzbge.zzb((IBinder) obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 243799000));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e2) {
                this.zzd.zzg = zzbuj.zza(this.zzc);
                zzbulVar = this.zzd.zzg;
                zzbulVar.zzh(e2, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        zzba zzbaVar = this.zzd;
        Context context = this.zzc;
        FrameLayout frameLayout = this.zza;
        FrameLayout frameLayout2 = this.zzb;
        zzbhxVar = zzbaVar.zzd;
        return zzbhxVar.zza(context, frameLayout, frameLayout2);
    }
}
