package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class zzbbh {

    @Nullable
    private zzbaw zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbbh(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbbh zzbbhVar) {
        synchronized (zzbbhVar.zzd) {
            zzbaw zzbawVar = zzbbhVar.zza;
            if (zzbawVar == null) {
                return;
            }
            zzbawVar.disconnect();
            zzbbhVar.zza = null;
            Binder.flushPendingCommands();
        }
    }

    public final Future zzc(zzbax zzbaxVar) {
        zzbbb zzbbbVar = new zzbbb(this);
        zzbbf zzbbfVar = new zzbbf(this, zzbaxVar, zzbbbVar);
        zzbbg zzbbgVar = new zzbbg(this, zzbbbVar);
        synchronized (this.zzd) {
            zzbaw zzbawVar = new zzbaw(this.zzc, com.google.android.gms.ads.internal.zzv.zzu().zzb(), zzbbfVar, zzbbgVar);
            this.zza = zzbawVar;
            zzbawVar.checkAvailabilityAndConnect();
        }
        return zzbbbVar;
    }
}
