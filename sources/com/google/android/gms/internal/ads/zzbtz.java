package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* loaded from: classes3.dex */
final class zzbtz extends zzbtu {
    final /* synthetic */ UpdateClickUrlCallback zza;

    public zzbtz(zzbud zzbudVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
