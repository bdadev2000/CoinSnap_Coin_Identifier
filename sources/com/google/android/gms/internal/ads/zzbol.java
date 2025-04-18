package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbol implements zzbkg {
    final /* synthetic */ zzbom zza;
    private final zzbno zzb;
    private final zzcao zzc;

    public zzbol(zzbom zzbomVar, zzbno zzbnoVar, zzcao zzcaoVar) {
        this.zza = zzbomVar;
        this.zzb = zzbnoVar;
        this.zzc = zzcaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zza(@Nullable String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbnx());
            } else {
                this.zzc.zzd(new zzbnx(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th2) {
            this.zzb.zzb();
            throw th2;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzb(JSONObject jSONObject) {
        zzboa zzboaVar;
        try {
            try {
                zzcao zzcaoVar = this.zzc;
                zzboaVar = this.zza.zza;
                zzcaoVar.zzc(zzboaVar.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e2) {
                this.zzc.zzd(e2);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
