package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* loaded from: classes4.dex */
final class zzbuf extends zzbua {
    final /* synthetic */ UpdateClickUrlCallback zza;

    public zzbuf(zzbuj zzbujVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
