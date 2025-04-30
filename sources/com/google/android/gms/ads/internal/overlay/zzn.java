package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzdhi;
import com.google.ar.core.ImageMetadata;

/* loaded from: classes2.dex */
public final class zzn {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z8) {
        zzy zzyVar;
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdhi zzdhiVar = adOverlayInfoParcel.zzu;
            if (zzdhiVar != null) {
                zzdhiVar.zzdG();
            }
            Activity zzi = adOverlayInfoParcel.zzd.zzi();
            zzc zzcVar = adOverlayInfoParcel.zza;
            if (zzcVar != null && zzcVar.zzj && zzi != null) {
                context = zzi;
            }
            com.google.android.gms.ads.internal.zzu.zzh();
            zzc zzcVar2 = adOverlayInfoParcel.zza;
            zzaa zzaaVar = adOverlayInfoParcel.zzi;
            if (zzcVar2 != null) {
                zzyVar = zzcVar2.zzi;
            } else {
                zzyVar = null;
            }
            zza.zzb(context, zzcVar2, zzaaVar, zzyVar);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.isClientJar);
        intent.putExtra("shouldCallOnOverlayOpened", z8);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!PlatformVersion.isAtLeastLollipop()) {
            intent.addFlags(ImageMetadata.LENS_APERTURE);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.util.zzt.zzT(context, intent);
    }
}
