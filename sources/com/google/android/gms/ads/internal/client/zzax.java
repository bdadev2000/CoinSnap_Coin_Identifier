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
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzax {

    @Nullable
    private static final zzce zza;

    static {
        zzce zzccVar;
        zzce zzceVar = null;
        try {
            Object newInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (!(newInstance instanceof IBinder)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    if (queryLocalInterface instanceof zzce) {
                        zzccVar = (zzce) queryLocalInterface;
                    } else {
                        zzccVar = new zzcc(iBinder);
                    }
                    zzceVar = zzccVar;
                }
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzceVar;
    }

    @Nullable
    private final Object zze() {
        zzce zzceVar = zza;
        if (zzceVar != null) {
            try {
                return zzb(zzceVar);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke local loader using ClientApi class.", e4);
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
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke remote loader.", e4);
            return null;
        }
    }

    @NonNull
    public abstract Object zza();

    @Nullable
    public abstract Object zzb(zzce zzceVar) throws RemoteException;

    @Nullable
    public abstract Object zzc() throws RemoteException;

    public final Object zzd(Context context, boolean z8) {
        boolean z9;
        boolean z10;
        Object zze;
        if (!z8) {
            zzay.zzb();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzt(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Google Play Services is not available.");
                z8 = true;
            }
        }
        boolean z11 = false;
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID)) {
            z9 = false;
        } else {
            z9 = true;
        }
        boolean z12 = !z9;
        zzbep.zza(context);
        if (((Boolean) zzbgf.zza.zze()).booleanValue()) {
            z10 = false;
        } else if (((Boolean) zzbgf.zzb.zze()).booleanValue()) {
            z10 = true;
            z11 = true;
        } else {
            z11 = z8 | z12;
            z10 = false;
        }
        if (z11) {
            zze = zze();
            if (zze == null && !z10) {
                zze = zzf();
            }
        } else {
            Object zzf = zzf();
            if (zzf == null) {
                if (zzay.zze().nextInt(((Long) zzbgt.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzay.zzb().zzo(context, zzay.zzc().afmaVersion, "gmob-apps", bundle, true);
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
