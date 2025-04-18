package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class zzbbq {

    @Nullable
    private zzbbf zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbbq(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbbq zzbbqVar) {
        synchronized (zzbbqVar.zzd) {
            try {
                zzbbf zzbbfVar = zzbbqVar.zza;
                if (zzbbfVar == null) {
                    return;
                }
                zzbbfVar.disconnect();
                zzbbqVar.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Future zzc(zzbbg zzbbgVar) {
        zzbbk zzbbkVar = new zzbbk(this);
        zzbbo zzbboVar = new zzbbo(this, zzbbgVar, zzbbkVar);
        zzbbp zzbbpVar = new zzbbp(this, zzbbkVar);
        synchronized (this.zzd) {
            zzbbf zzbbfVar = new zzbbf(this.zzc, com.google.android.gms.ads.internal.zzu.zzt().zzb(), zzbboVar, zzbbpVar);
            this.zza = zzbbfVar;
            zzbbfVar.checkAvailabilityAndConnect();
        }
        return zzbbkVar;
    }
}
