package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class zzbdi {

    @Nullable
    private zzbcx zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbdi(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbdi zzbdiVar) {
        synchronized (zzbdiVar.zzd) {
            try {
                zzbcx zzbcxVar = zzbdiVar.zza;
                if (zzbcxVar == null) {
                    return;
                }
                zzbcxVar.disconnect();
                zzbdiVar.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Future zzc(zzbcy zzbcyVar) {
        zzbdc zzbdcVar = new zzbdc(this);
        zzbdg zzbdgVar = new zzbdg(this, zzbcyVar, zzbdcVar);
        zzbdh zzbdhVar = new zzbdh(this, zzbdcVar);
        synchronized (this.zzd) {
            zzbcx zzbcxVar = new zzbcx(this.zzc, com.google.android.gms.ads.internal.zzu.zzt().zzb(), zzbdgVar, zzbdhVar);
            this.zza = zzbcxVar;
            zzbcxVar.checkAvailabilityAndConnect();
        }
        return zzbdcVar;
    }
}
