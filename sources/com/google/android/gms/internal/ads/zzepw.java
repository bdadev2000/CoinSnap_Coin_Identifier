package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import kotlin.time.DurationKt;

/* loaded from: classes3.dex */
public final class zzepw implements zzevy {
    private final Integer zza;

    private zzepw(Integer num) {
        this.zza = num;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:10:0x0069). Please report as a decompilation issue!!! */
    public static /* bridge */ /* synthetic */ zzepw zzb(VersionInfoParcel versionInfoParcel) {
        int i10;
        int i11;
        int extensionVersion;
        int extensionVersion2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjI)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            try {
                i11 = Build.VERSION.SDK_INT;
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AdUtil.getAdServicesExtensionVersion");
            }
            if (i11 >= 30) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion2 > 3) {
                    i10 = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
                    return new zzepw(Integer.valueOf(i10));
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjL)).booleanValue()) {
                if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjK)).intValue() && i11 >= 31) {
                    extensionVersion = SdkExtensions.getExtensionVersion(31);
                    if (extensionVersion >= 9) {
                        i10 = SdkExtensions.getExtensionVersion(31);
                        return new zzepw(Integer.valueOf(i10));
                    }
                }
            }
            i10 = 0;
            return new zzepw(Integer.valueOf(i10));
        }
        return new zzepw(null);
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
