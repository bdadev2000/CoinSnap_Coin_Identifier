package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.MobileAds;

/* loaded from: classes2.dex */
public final class zzfiq {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzehp) {
            zzehp zzehpVar = (zzehp) th;
            return zzc(zzehpVar.zza(), zzehpVar.zzb());
        }
        if (th instanceof zzdzd) {
            if (th.getMessage() == null) {
                return zzd(((zzdzd) th).zza(), null, null);
            }
            return zzd(((zzdzd) th).zza(), th.getMessage(), null);
        }
        if (th instanceof com.google.android.gms.ads.internal.util.zzba) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) th;
            return new com.google.android.gms.ads.internal.client.zze(zzbaVar.zza(), zzfyv.zzc(zzbaVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        }
        return zzd(1, null, null);
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, @Nullable zzehq zzehqVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zza = zza(th);
        int i9 = zza.zza;
        if ((i9 == 3 || i9 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (zzehqVar != null) {
            zza.zze = zzehqVar.zzb();
        }
        return zza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i9, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i9 != 0) {
            if (i9 == 8) {
                if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziq)).intValue() <= 0) {
                    i9 = 8;
                } else {
                    return zzeVar;
                }
            }
            return zzd(i9, null, zzeVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x005b. Please report as an issue. */
    public static com.google.android.gms.ads.internal.client.zze zzd(int i9, @Nullable String str, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i10;
        String str2;
        int i11 = i9 - 1;
        if (str == null) {
            if (i9 != 0) {
                str = "No fill.";
                switch (i11) {
                    case 1:
                        str = "Invalid request.";
                        break;
                    case 2:
                        break;
                    case 3:
                        str = "App ID missing.";
                        break;
                    case 4:
                        str = "Network error.";
                        break;
                    case 5:
                        str = "Invalid request: Invalid ad unit ID.";
                        break;
                    case 6:
                        str = "Invalid request: Invalid ad size.";
                        break;
                    case 7:
                        str = "A mediation adapter failed to show the ad.";
                        break;
                    case 8:
                        str = "The ad is not ready.";
                        break;
                    case 9:
                        str = "The ad has already been shown.";
                        break;
                    case 10:
                        str = "The ad can not be shown when app is not in foreground.";
                        break;
                    case 11:
                    default:
                        str = "Internal error.";
                        break;
                    case 12:
                        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzit)).intValue() <= 0) {
                            str = "The mediation adapter did not return an ad.";
                            break;
                        }
                        break;
                    case 13:
                        str = "Mismatch request IDs.";
                        break;
                    case 14:
                        str = "Invalid ad string.";
                        break;
                    case 15:
                        str = "Ad inspector had an internal error.";
                        break;
                    case 16:
                        str = "Ad inspector failed to load.";
                        break;
                    case 17:
                        str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                        break;
                    case 18:
                        str = "Ad inspector cannot be opened because it is already open.";
                        break;
                }
            } else {
                throw null;
            }
        }
        String str3 = str;
        if (i9 != 0) {
            int i12 = 2;
            switch (i11) {
                case 0:
                case 11:
                case 15:
                    i12 = 0;
                    return new com.google.android.gms.ads.internal.client.zze(i12, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 1:
                case 5:
                case 6:
                case 9:
                case 16:
                    i12 = 1;
                    return new com.google.android.gms.ads.internal.client.zze(i12, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 2:
                case 10:
                case 18:
                    i12 = 3;
                    return new com.google.android.gms.ads.internal.client.zze(i12, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 3:
                    i10 = 8;
                    i12 = i10;
                    return new com.google.android.gms.ads.internal.client.zze(i12, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 4:
                case 8:
                case 17:
                    return new com.google.android.gms.ads.internal.client.zze(i12, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 7:
                    i10 = 4;
                    i12 = i10;
                    return new com.google.android.gms.ads.internal.client.zze(i12, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 12:
                    if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzit)).intValue() <= 0) {
                        i10 = 9;
                        i12 = i10;
                        return new com.google.android.gms.ads.internal.client.zze(i12, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                    }
                    i12 = 3;
                    return new com.google.android.gms.ads.internal.client.zze(i12, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 13:
                    i10 = 10;
                    i12 = i10;
                    return new com.google.android.gms.ads.internal.client.zze(i12, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 14:
                    i10 = 11;
                    i12 = i10;
                    return new com.google.android.gms.ads.internal.client.zze(i12, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                default:
                    switch (i9) {
                        case 1:
                            str2 = "INTERNAL_ERROR";
                            break;
                        case 2:
                            str2 = "INVALID_REQUEST";
                            break;
                        case 3:
                            str2 = "NO_FILL";
                            break;
                        case 4:
                            str2 = "APP_ID_MISSING";
                            break;
                        case 5:
                            str2 = "NETWORK_ERROR";
                            break;
                        case 6:
                            str2 = "INVALID_AD_UNIT_ID";
                            break;
                        case 7:
                            str2 = "INVALID_AD_SIZE";
                            break;
                        case 8:
                            str2 = "MEDIATION_SHOW_ERROR";
                            break;
                        case 9:
                            str2 = "NOT_READY";
                            break;
                        case 10:
                            str2 = "AD_REUSED";
                            break;
                        case 11:
                            str2 = "APP_NOT_FOREGROUND";
                            break;
                        case 12:
                            str2 = "INTERNAL_SHOW_ERROR";
                            break;
                        case 13:
                            str2 = "MEDIATION_NO_FILL";
                            break;
                        case 14:
                            str2 = "REQUEST_ID_MISMATCH";
                            break;
                        case 15:
                            str2 = "INVALID_AD_STRING";
                            break;
                        case 16:
                            str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                            break;
                        case 17:
                            str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                            break;
                        case 18:
                            str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                            break;
                        default:
                            str2 = "AD_INSPECTOR_ALREADY_OPEN";
                            break;
                    }
                    throw new AssertionError("Unknown SdkError: ".concat(str2));
            }
        }
        throw null;
    }
}
