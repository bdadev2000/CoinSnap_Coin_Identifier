package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class zzepf implements zzevy {
    private final com.google.android.gms.ads.internal.client.zzy zza;
    private final boolean zzb;

    public zzepf(com.google.android.gms.ads.internal.client.zzy zzyVar, boolean z10) {
        this.zza = zzyVar;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfo)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzy zzyVar = this.zza;
        if (zzyVar != null) {
            int i10 = zzyVar.zza;
            if (i10 == 1) {
                bundle.putString("avo", TtmlNode.TAG_P);
            } else if (i10 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
