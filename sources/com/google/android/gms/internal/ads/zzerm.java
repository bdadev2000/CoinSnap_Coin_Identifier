package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public final class zzerm implements zzexv {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final VersionInfoParcel zzb;
    private final boolean zzc;

    public zzerm(com.google.android.gms.ads.internal.client.zzw zzwVar, VersionInfoParcel versionInfoParcel, boolean z8) {
        this.zza = zzwVar;
        this.zzb = versionInfoParcel;
        this.zzc = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zzb.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfp)).intValue()) {
            bundle.putString("app_open_version", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfq)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.zza;
        if (zzwVar != null) {
            int i9 = zzwVar.zza;
            if (i9 == 1) {
                bundle.putString("avo", TtmlNode.TAG_P);
            } else if (i9 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
