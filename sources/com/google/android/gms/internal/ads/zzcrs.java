package com.google.android.gms.internal.ads;

import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;

/* loaded from: classes2.dex */
public final class zzcrs implements zzcyu {

    @Nullable
    private final zzcfo zza;
    private final zzdud zzb;
    private final zzfgh zzc;

    public zzcrs(@Nullable zzcfo zzcfoVar, zzdud zzdudVar, zzfgh zzfghVar) {
        this.zza = zzcfoVar;
        this.zzb = zzdudVar;
        this.zzc = zzfghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
        zzcfo zzcfoVar;
        boolean z2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmw)).booleanValue() || (zzcfoVar = this.zza) == null) {
            return;
        }
        ViewParent parent = zzcfoVar.zzF().getParent();
        while (true) {
            if (parent == null) {
                z2 = false;
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    z2 = true;
                    break;
                }
                parent = parent.getParent();
            }
        }
        zzduc zza = this.zzb.zza();
        zza.zzb("action", "hcp");
        zza.zzb("hcp", true != z2 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zza.zzc(this.zzc);
        zza.zzf();
    }
}
