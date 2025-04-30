package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbwj;
import com.google.android.gms.internal.ads.zzbwl;

/* loaded from: classes2.dex */
public final class zzk extends RemoteCreator {
    private zzbwl zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzbv) {
            return (zzbv) queryLocalInterface;
        }
        return new zzbv(iBinder);
    }

    @Nullable
    public final zzbu zza(Context context, zzq zzqVar, String str, zzbrf zzbrfVar, int i9) {
        zzbu zzbsVar;
        zzbu zzbsVar2;
        zzbep.zza(context);
        if (((Boolean) zzba.zzc().zza(zzbep.zzkI)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) com.google.android.gms.ads.internal.util.client.zzq.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzj
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        if (queryLocalInterface instanceof zzbv) {
                            return (zzbv) queryLocalInterface;
                        }
                        return new zzbv(obj);
                    }
                })).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbrfVar, 241806000, i9);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof zzbu) {
                    zzbsVar = (zzbu) queryLocalInterface;
                } else {
                    zzbsVar = new zzbs(zze);
                }
                return zzbsVar;
            } catch (RemoteException e4) {
                e = e4;
                zzbwl zza = zzbwj.zza(context);
                this.zza = zza;
                zza.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzp e9) {
                e = e9;
                zzbwl zza2 = zzbwj.zza(context);
                this.zza = zza2;
                zza2.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                zzbwl zza22 = zzbwj.zza(context);
                this.zza = zza22;
                zza22.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbrfVar, 241806000, i9);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof zzbu) {
                zzbsVar2 = (zzbu) queryLocalInterface2;
            } else {
                zzbsVar2 = new zzbs(zze2);
            }
            return zzbsVar2;
        } catch (RemoteException e11) {
            e = e11;
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Could not create remote AdManager.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e12) {
            e = e12;
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Could not create remote AdManager.", e);
            return null;
        }
    }
}
