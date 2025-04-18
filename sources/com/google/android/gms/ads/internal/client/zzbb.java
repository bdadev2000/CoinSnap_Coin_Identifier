package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbei;
import com.google.android.gms.internal.ads.zzbew;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzbb {

    @Nullable
    private static final zzcp zza;

    static {
        zzcp zzcnVar;
        zzcp zzcpVar = null;
        try {
            Object newInstance = zzba.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof zzcp) {
                        zzcnVar = (zzcp) queryLocalInterface;
                    } else {
                        zzcnVar = new zzcn(iBinder);
                    }
                    zzcpVar = zzcnVar;
                }
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzcpVar;
    }

    @Nullable
    private final Object zze() {
        zzcp zzcpVar = zza;
        if (zzcpVar != null) {
            try {
                return zzb(zzcpVar);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke local loader using ClientApi class.", e2);
                return null;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ClientApi class cannot be loaded.");
        return null;
    }

    @Nullable
    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke remote loader.", e2);
            return null;
        }
    }

    @NonNull
    public abstract Object zza();

    @Nullable
    public abstract Object zzb(zzcp zzcpVar) throws RemoteException;

    @Nullable
    public abstract Object zzc() throws RemoteException;

    public final Object zzd(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        Object zze;
        if (!z10) {
            zzbc.zzb();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzt(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Google Play Services is not available.");
                z10 = true;
            }
        }
        boolean z13 = false;
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID)) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z14 = !z11;
        zzbcn.zza(context);
        if (((Boolean) zzbei.zza.zze()).booleanValue()) {
            z12 = false;
        } else if (((Boolean) zzbei.zzb.zze()).booleanValue()) {
            z12 = true;
            z13 = true;
        } else {
            z13 = z10 | z14;
            z12 = false;
        }
        if (z13) {
            zze = zze();
            if (zze == null && !z12) {
                zze = zzf();
            }
        } else {
            Object zzf = zzf();
            if (zzf == null) {
                if (zzbc.zze().nextInt(((Long) zzbew.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzbc.zzb().zzo(context, zzbc.zzc().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            zze = zzf == null ? zze() : zzf;
        }
        if (zze == null) {
            return zza();
        }
        return zze;
    }
}
