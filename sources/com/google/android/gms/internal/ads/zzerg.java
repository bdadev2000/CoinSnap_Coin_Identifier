package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public final class zzerg implements zzexg {
    private final Integer zza;

    private zzerg(Integer num) {
        this.zza = num;
    }

    public static /* bridge */ /* synthetic */ zzerg zzb(VersionInfoParcel versionInfoParcel) {
        int i2;
        int extensionVersion;
        int extensionVersion2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjG)).booleanValue()) {
            return new zzerg(null);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        int i3 = 0;
        try {
            i2 = Build.VERSION.SDK_INT;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdUtil.getAdServicesExtensionVersion");
        }
        if (i2 >= 30) {
            extensionVersion2 = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion2 > 3) {
                i3 = SdkExtensions.getExtensionVersion(1000000);
                return new zzerg(Integer.valueOf(i3));
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjJ)).booleanValue()) {
            if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjI)).intValue() && i2 >= 31) {
                extensionVersion = SdkExtensions.getExtensionVersion(31);
                if (extensionVersion >= 9) {
                    i3 = SdkExtensions.getExtensionVersion(31);
                }
            }
        }
        return new zzerg(Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
