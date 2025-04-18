package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbuj;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaf extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpg zzb;

    public zzaf(zzba zzbaVar, Context context, zzbpg zzbpgVar) {
        this.zza = context;
        this.zzb = zzbpgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbcn.zza(context);
        if (((Boolean) zzbe.zzc().zza(zzbcn.zziY)).booleanValue()) {
            return zzcpVar.zzi(wrap, this.zzb, 243799000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbcn.zza(context);
        if (!((Boolean) zzbe.zzc().zza(zzbcn.zziY)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdv) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzae
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    if (queryLocalInterface instanceof zzdv) {
                        return (zzdv) queryLocalInterface;
                    }
                    return new zzdv(iBinder);
                }
            })).zze(wrap, this.zzb, 243799000);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e2) {
            zzbuj.zza(this.zza).zzh(e2, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
