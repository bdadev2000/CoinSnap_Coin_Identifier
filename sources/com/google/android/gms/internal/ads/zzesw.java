package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* loaded from: classes3.dex */
public final class zzesw implements zzevy {
    public final String zza;
    public final boolean zzb;

    public zzesw(String str, boolean z10) {
        this.zza = str;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "1");
        }
    }
}
