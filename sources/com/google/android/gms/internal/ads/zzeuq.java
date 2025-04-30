package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* loaded from: classes2.dex */
public final class zzeuq implements zzexv {
    public final String zza;
    public final boolean zzb;

    public zzeuq(String str, boolean z8) {
        this.zza = str;
        this.zzb = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "1");
        }
    }
}
