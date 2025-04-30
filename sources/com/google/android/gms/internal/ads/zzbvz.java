package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* loaded from: classes2.dex */
final class zzbvz extends zzbvu {
    final /* synthetic */ UpdateClickUrlCallback zza;

    public zzbvz(zzbwd zzbwdVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
