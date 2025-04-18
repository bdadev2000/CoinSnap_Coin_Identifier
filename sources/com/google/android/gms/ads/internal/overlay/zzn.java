package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzdel;

/* loaded from: classes3.dex */
public final class zzn {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z10) {
        zzaa zzaaVar;
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdel zzdelVar = adOverlayInfoParcel.zzu;
            if (zzdelVar != null) {
                zzdelVar.zzdG();
            }
            Activity zzi = adOverlayInfoParcel.zzd.zzi();
            zzc zzcVar = adOverlayInfoParcel.zza;
            if (zzcVar != null && zzcVar.zzj && zzi != null) {
                context = zzi;
            }
            com.google.android.gms.ads.internal.zzv.zzi();
            zzc zzcVar2 = adOverlayInfoParcel.zza;
            zzac zzacVar = adOverlayInfoParcel.zzi;
            if (zzcVar2 != null) {
                zzaaVar = zzcVar2.zzi;
            } else {
                zzaaVar = null;
            }
            zza.zzb(context, zzcVar2, zzacVar, zzaaVar);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.isClientJar);
        intent.putExtra("shouldCallOnOverlayOpened", z10);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!PlatformVersion.isAtLeastLollipop()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.util.zzs.zzT(context, intent);
    }
}
