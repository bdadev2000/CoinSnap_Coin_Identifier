package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcoi implements zzaym {
    private zzcfk zza;
    private final Executor zzb;
    private final zzcnu zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcnx zzg = new zzcnx();

    public zzcoi(Executor executor, zzcnu zzcnuVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcnuVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcoh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcoi.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e2);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        boolean z10;
        if (this.zzf) {
            z10 = false;
        } else {
            z10 = zzaylVar.zzj;
        }
        zzcnx zzcnxVar = this.zzg;
        zzcnxVar.zza = z10;
        zzcnxVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzaylVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final void zzf(zzcfk zzcfkVar) {
        this.zza = zzcfkVar;
    }
}
