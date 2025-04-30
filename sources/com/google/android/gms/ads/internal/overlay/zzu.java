package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzu extends zzm {
    public zzu(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzm, com.google.android.gms.internal.ads.zzbvg
    public final void zzl(@Nullable Bundle bundle) {
        com.google.android.gms.ads.internal.util.zze.zza("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzn = 4;
        this.zzb.finish();
    }
}
