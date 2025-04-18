package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbur;

/* loaded from: classes2.dex */
public final class zzk extends RemoteCreator {
    private zzbur zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbz ? (zzbz) queryLocalInterface : new zzbz(iBinder);
    }

    @Nullable
    public final zzby zza(Context context, zzs zzsVar, String str, zzbpl zzbplVar, int i2) {
        zzbcv.zza(context);
        if (!((Boolean) zzbe.zzc().zza(zzbcv.zzkn)).booleanValue()) {
            try {
                IBinder zze = ((zzbz) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzsVar, str, zzbplVar, 243220000, i2);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzby ? (zzby) queryLocalInterface : new zzbw(zze);
            } catch (RemoteException e) {
                e = e;
                com.google.android.gms.ads.internal.util.client.zzm.zzf("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzm.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbz) com.google.android.gms.ads.internal.util.client.zzq.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzj
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return queryLocalInterface2 instanceof zzbz ? (zzbz) queryLocalInterface2 : new zzbz(iBinder);
                }
            })).zze(ObjectWrapper.wrap(context), zzsVar, str, zzbplVar, 243220000, i2);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof zzby ? (zzby) queryLocalInterface2 : new zzbw(zze2);
        } catch (RemoteException e3) {
            e = e3;
            zzbur zza = zzbup.zza(context);
            this.zza = zza;
            zza.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzp e4) {
            e = e4;
            zzbur zza2 = zzbup.zza(context);
            this.zza = zza2;
            zza2.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (NullPointerException e5) {
            e = e5;
            zzbur zza22 = zzbup.zza(context);
            this.zza = zza22;
            zza22.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
