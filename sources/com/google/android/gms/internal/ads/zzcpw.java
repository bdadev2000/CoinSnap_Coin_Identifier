package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcpw implements zzayv {
    private zzcfo zza;
    private final Executor zzb;
    private final zzcpi zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcpl zzg = new zzcpl();

    public zzcpw(Executor executor, zzcpi zzcpiVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcpiVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcpw.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
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

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(zzayu zzayuVar) {
        boolean z2 = this.zzf ? false : zzayuVar.zzj;
        zzcpl zzcplVar = this.zzg;
        zzcplVar.zza = z2;
        zzcplVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzayuVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z2) {
        this.zzf = z2;
    }

    public final void zzf(zzcfo zzcfoVar) {
        this.zza = zzcfoVar;
    }
}
