package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzfgk {
    private static zzfgk zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcw zzc;
    private final AtomicReference zzd = new AtomicReference();

    public zzfgk(Context context, com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzb = context;
        this.zzc = zzcwVar;
    }

    public static com.google.android.gms.ads.internal.client.zzcw zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcv.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to retrieve lite SDK info.", e2);
            return null;
        }
    }

    public static zzfgk zzd(Context context) {
        synchronized (zzfgk.class) {
            zzfgk zzfgkVar = zza;
            if (zzfgkVar != null) {
                return zzfgkVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbeo.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcw zzcwVar = null;
            if (longValue > 0 && longValue <= 243799202) {
                zzcwVar = zza(applicationContext);
            }
            zzfgk zzfgkVar2 = new zzfgk(applicationContext, zzcwVar);
            zza = zzfgkVar2;
            return zzfgkVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzfb zzg() {
        com.google.android.gms.ads.internal.client.zzcw zzcwVar = this.zzc;
        if (zzcwVar != null) {
            try {
                return zzcwVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbpg zzb() {
        return (zzbpg) this.zzd.get();
    }

    public final VersionInfoParcel zzc(int i10, boolean z10, int i11) {
        com.google.android.gms.ads.internal.client.zzfb zzg;
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zzE = com.google.android.gms.ads.internal.util.zzs.zzE(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(243799000, i11, true, zzE);
        if (((Boolean) zzbeo.zzc.zze()).booleanValue() && (zzg = zzg()) != null) {
            return new VersionInfoParcel(243799000, zzg.zza(), true, zzE);
        }
        return versionInfoParcel;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzfb zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(com.google.android.gms.internal.ads.zzbpg r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.internal.ads.zzbeo.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.ads.internal.client.zzcw r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            com.google.android.gms.internal.ads.zzbpg r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L1e
            r4 = r0
        L1e:
            com.google.android.gms.internal.ads.zzfgj.zza(r2, r1, r4)
            return
        L22:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfgj.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfgk.zzf(com.google.android.gms.internal.ads.zzbpg):void");
    }
}
