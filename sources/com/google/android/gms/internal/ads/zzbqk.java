package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbqk implements zzbme {
    final /* synthetic */ zzbql zza;
    private final zzbpn zzb;
    private final zzccn zzc;

    public zzbqk(zzbql zzbqlVar, zzbpn zzbpnVar, zzccn zzccnVar) {
        this.zza = zzbqlVar;
        this.zzb = zzbpnVar;
        this.zzc = zzccnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zza(@Nullable String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbpw());
            } else {
                this.zzc.zzd(new zzbpw(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzb(JSONObject jSONObject) {
        zzbpz zzbpzVar;
        try {
            try {
                zzccn zzccnVar = this.zzc;
                zzbpzVar = this.zza.zza;
                zzccnVar.zzc(zzbpzVar.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e4) {
                this.zzc.zzd(e4);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
