package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbwj;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzac extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbrf zzb;

    public zzac(zzaw zzawVar, Context context, zzbrf zzbrfVar) {
        this.zza = context;
        this.zzb = zzbrfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzt(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbep.zza(context);
        if (((Boolean) zzba.zzc().zza(zzbep.zzjt)).booleanValue()) {
            return zzceVar.zzh(wrap, this.zzb, 241806000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbep.zza(context);
        if (!((Boolean) zzba.zzc().zza(zzbep.zzjt)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdk) com.google.android.gms.ads.internal.util.client.zzq.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzab
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    if (queryLocalInterface instanceof zzdk) {
                        return (zzdk) queryLocalInterface;
                    }
                    return new zzdk(obj);
                }
            })).zze(wrap, this.zzb, 241806000);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e4) {
            zzbwj.zza(this.zza).zzh(e4, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
