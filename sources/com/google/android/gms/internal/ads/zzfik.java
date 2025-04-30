package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzfik {
    private static zzfik zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    public zzfik(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    public static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to retrieve lite SDK info.", e4);
            return null;
        }
    }

    public static zzfik zzd(Context context) {
        synchronized (zzfik.class) {
            try {
                zzfik zzfikVar = zza;
                if (zzfikVar != null) {
                    return zzfikVar;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) zzbgl.zzb.zze()).longValue();
                com.google.android.gms.ads.internal.client.zzcl zzclVar = null;
                if (longValue > 0 && longValue <= 241806202) {
                    zzclVar = zza(applicationContext);
                }
                zzfik zzfikVar2 = new zzfik(applicationContext, zzclVar);
                zza = zzfikVar2;
                return zzfikVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final com.google.android.gms.ads.internal.client.zzen zzg() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar != null) {
            try {
                return zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbrf zzb() {
        return (zzbrf) this.zzd.get();
    }

    public final VersionInfoParcel zzc(int i9, boolean z8, int i10) {
        com.google.android.gms.ads.internal.client.zzen zzg;
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean zzE = com.google.android.gms.ads.internal.util.zzt.zzE(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(241806000, i10, true, zzE);
        if (((Boolean) zzbgl.zzc.zze()).booleanValue() && (zzg = zzg()) != null) {
            return new VersionInfoParcel(241806000, zzg.zza(), true, zzE);
        }
        return versionInfoParcel;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzen zzg = zzg();
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
    public final void zzf(com.google.android.gms.internal.ads.zzbrf r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbfv r0 = com.google.android.gms.internal.ads.zzbgl.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.ads.internal.client.zzcl r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            com.google.android.gms.internal.ads.zzbrf r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L1e
            r4 = r0
        L1e:
            com.google.android.gms.internal.ads.zzfij.zza(r2, r1, r4)
            return
        L22:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfij.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfik.zzf(com.google.android.gms.internal.ads.zzbrf):void");
    }
}
