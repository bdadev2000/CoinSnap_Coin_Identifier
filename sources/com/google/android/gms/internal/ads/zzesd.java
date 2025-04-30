package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzesd implements zzexv {
    private final Integer zza;

    private zzesd(Integer num) {
        this.zza = num;
    }

    public static /* bridge */ /* synthetic */ zzesd zzb(VersionInfoParcel versionInfoParcel) {
        int i9;
        int extensionVersion;
        int extensionVersion2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzka)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            int i10 = 0;
            try {
                i9 = Build.VERSION.SDK_INT;
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "AdUtil.getAdServicesExtensionVersion");
            }
            if (i9 >= 30) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion2 > 3) {
                    i10 = SdkExtensions.getExtensionVersion(1000000);
                    return new zzesd(Integer.valueOf(i10));
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkd)).booleanValue()) {
                if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkc)).intValue() && i9 >= 31) {
                    extensionVersion = SdkExtensions.getExtensionVersion(31);
                    if (extensionVersion >= 9) {
                        i10 = SdkExtensions.getExtensionVersion(31);
                    }
                }
            }
            return new zzesd(Integer.valueOf(i10));
        }
        return new zzesd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
