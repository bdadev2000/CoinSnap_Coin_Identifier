package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.ImpressionLog;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgay {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzgay(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("Multiple entries with same key: ", valueOf, ImpressionLog.R, valueOf2, " and ");
        t2.append(valueOf3);
        t2.append(ImpressionLog.R);
        t2.append(valueOf4);
        return new IllegalArgumentException(t2.toString());
    }
}
