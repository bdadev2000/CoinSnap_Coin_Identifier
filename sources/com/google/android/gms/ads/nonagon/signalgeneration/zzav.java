package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzeac;
import com.google.android.gms.internal.ads.zzebi;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import f4.c;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzav implements zzgfa {
    private final Executor zza;
    private final zzeac zzb;

    public zzav(Executor executor, zzeac zzeacVar) {
        this.zza = executor;
        this.zzb = zzeacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final /* bridge */ /* synthetic */ c zza(Object obj) throws Exception {
        final zzbxu zzbxuVar = (zzbxu) obj;
        return zzgft.zzn(this.zzb.zzc(zzbxuVar), new zzgfa() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzau
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final c zza(Object obj2) {
                zzebi zzebiVar = (zzebi) obj2;
                zzax zzaxVar = new zzax(new JsonReader(new InputStreamReader(zzebiVar.zzb())), zzebiVar.zza());
                try {
                    zzaxVar.zzb = com.google.android.gms.ads.internal.client.zzay.zzb().zzi(zzbxu.this.zza).toString();
                } catch (JSONException unused) {
                    zzaxVar.zzb = JsonUtils.EMPTY_JSON;
                }
                return zzgft.zzh(zzaxVar);
            }
        }, this.zza);
    }
}
