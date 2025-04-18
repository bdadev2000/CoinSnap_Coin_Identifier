package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzbpg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzal extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpg zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    public zzal(zzba zzbaVar, Context context, zzbpg zzbpgVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbpgVar;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @NonNull
    public final /* synthetic */ Object zza() {
        return new zzbla();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzl(ObjectWrapper.wrap(this.zza), this.zzb, 243799000, new zzbkn(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbkw) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzak
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    return zzbkv.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 243799000, new zzbkn(this.zzc));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException unused) {
            return null;
        }
    }
}
