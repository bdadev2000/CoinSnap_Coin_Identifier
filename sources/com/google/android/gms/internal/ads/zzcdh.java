package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class zzcdh implements zzbjw {
    private final Consumer zza;

    public zzcdh(Consumer consumer) {
        this.zza = consumer;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Action missing from video GMSG.");
            return;
        }
        if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("src missing from video GMSG.");
            } else {
                this.zza.accept(str2);
            }
        }
    }
}
