package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcrk implements zzban {
    private zzchd zza;
    private final Executor zzb;
    private final zzcqw zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcqz zzg = new zzcqz();

    public zzcrk(Executor executor, zzcqw zzcqwVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcqwVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcrk.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e4);
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

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzdp(zzbam zzbamVar) {
        boolean z8;
        if (this.zzf) {
            z8 = false;
        } else {
            z8 = zzbamVar.zzj;
        }
        zzcqz zzcqzVar = this.zzg;
        zzcqzVar.zza = z8;
        zzcqzVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzbamVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z8) {
        this.zzf = z8;
    }

    public final void zzf(zzchd zzchdVar) {
        this.zza = zzchdVar;
    }
}
