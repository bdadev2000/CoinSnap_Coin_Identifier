package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbju;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbwl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzas extends zzax {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzaw zzd;

    public zzas(zzaw zzawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
        this.zzd = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zzc, "native_ad_view_delegate");
        return new zzez();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzi(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbwl zzbwlVar;
        zzbju zzbjuVar;
        zzbep.zza(this.zzc);
        if (((Boolean) zzba.zzc().zza(zzbep.zzkI)).booleanValue()) {
            try {
                return zzbhy.zzdA(((zzbic) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzar
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        return zzbib.zzb(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 241806000));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e4) {
                this.zzd.zzh = zzbwj.zza(this.zzc);
                zzbwlVar = this.zzd.zzh;
                zzbwlVar.zzh(e4, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        zzaw zzawVar = this.zzd;
        Context context = this.zzc;
        FrameLayout frameLayout = this.zza;
        FrameLayout frameLayout2 = this.zzb;
        zzbjuVar = zzawVar.zzd;
        return zzbjuVar.zza(context, frameLayout, frameLayout2);
    }
}
