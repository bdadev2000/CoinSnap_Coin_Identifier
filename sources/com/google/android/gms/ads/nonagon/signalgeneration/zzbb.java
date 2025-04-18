package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzdxq;
import com.google.android.gms.internal.ads.zzdyx;
import com.google.android.gms.internal.ads.zzgdp;
import com.google.android.gms.internal.ads.zzgei;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;
import ua.b;

/* loaded from: classes3.dex */
public final class zzbb implements zzgdp {
    private final Executor zza;
    private final zzdxq zzb;

    public zzbb(Executor executor, zzdxq zzdxqVar) {
        this.zza = executor;
        this.zzb = zzdxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdp
    public final /* bridge */ /* synthetic */ b zza(Object obj) throws Exception {
        final zzbvx zzbvxVar = (zzbvx) obj;
        return zzgei.zzn(this.zzb.zzc(zzbvxVar), new zzgdp() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzba
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final b zza(Object obj2) {
                zzdyx zzdyxVar = (zzdyx) obj2;
                zzbd zzbdVar = new zzbd(new JsonReader(new InputStreamReader(zzdyxVar.zzb())), zzdyxVar.zza());
                try {
                    zzbdVar.zzb = com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(zzbvx.this.zza).toString();
                } catch (JSONException unused) {
                    zzbdVar.zzb = JsonUtils.EMPTY_JSON;
                }
                return zzgei.zzh(zzbdVar);
            }
        }, this.zza);
    }
}
