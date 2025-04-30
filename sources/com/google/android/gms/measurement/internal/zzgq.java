package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes2.dex */
public final class zzgq {
    final zzhj zza;

    public zzgq(zznc zzncVar) {
        this.zza = zzncVar.zzk();
    }

    public final Bundle zza(String str, com.google.android.gms.internal.measurement.zzbz zzbzVar) {
        this.zza.zzl().zzt();
        if (zzbzVar == null) {
            this.zza.zzj().zzu().zza("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(CampaignEx.JSON_KEY_PACKAGE_NAME, str);
        try {
            Bundle zza = zzbzVar.zza(bundle);
            if (zza != null) {
                return zza;
            }
            this.zza.zzj().zzg().zza("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e4) {
            this.zza.zzj().zzg().zza("Exception occurred while retrieving the Install Referrer", e4.getMessage());
            return null;
        }
    }

    public final boolean zza() {
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.zza.zza());
            if (packageManager != null) {
                return packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.zza.zzj().zzp().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e4) {
            this.zza.zzj().zzp().zza("Failed to retrieve Play Store version for Install Referrer", e4);
            return false;
        }
    }
}
