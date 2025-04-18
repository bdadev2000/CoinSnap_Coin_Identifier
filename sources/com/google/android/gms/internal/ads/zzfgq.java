package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.MobileAds;

/* loaded from: classes3.dex */
public final class zzfgq {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th2) {
        if (th2 instanceof zzeff) {
            zzeff zzeffVar = (zzeff) th2;
            return zzc(zzeffVar.zza(), zzeffVar.zzb());
        }
        if (th2 instanceof zzdwn) {
            if (th2.getMessage() == null) {
                return zzd(((zzdwn) th2).zza(), null, null);
            }
            return zzd(((zzdwn) th2).zza(), th2.getMessage(), null);
        }
        if (th2 instanceof com.google.android.gms.ads.internal.util.zzaz) {
            com.google.android.gms.ads.internal.util.zzaz zzazVar = (com.google.android.gms.ads.internal.util.zzaz) th2;
            return new com.google.android.gms.ads.internal.client.zze(zzazVar.zza(), zzfxf.zzc(zzazVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        }
        return zzd(1, null, null);
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th2, @Nullable zzefg zzefgVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zza = zza(th2);
        int i10 = zza.zza;
        if ((i10 == 3 || i10 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (zzefgVar != null) {
            zza.zze = zzefgVar.zzb();
        }
        return zza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i10, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i10 != 0) {
            if (i10 == 8) {
                if (((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhU)).intValue() <= 0) {
                    i10 = 8;
                } else {
                    return zzeVar;
                }
            }
            return zzd(i10, null, zzeVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x005b. Please report as an issue. */
    public static com.google.android.gms.ads.internal.client.zze zzd(int i10, @Nullable String str, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i11;
        String str2;
        int i12 = i10 - 1;
        if (str == null) {
            if (i10 != 0) {
                str = "No fill.";
                switch (i12) {
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
                        if (((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhX)).intValue() <= 0) {
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
        if (i10 != 0) {
            int i13 = 0;
            switch (i12) {
                case 0:
                case 11:
                case 15:
                    return new com.google.android.gms.ads.internal.client.zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 1:
                case 5:
                case 6:
                case 9:
                case 16:
                    i13 = 1;
                    return new com.google.android.gms.ads.internal.client.zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 2:
                case 10:
                case 18:
                    i13 = 3;
                    return new com.google.android.gms.ads.internal.client.zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 3:
                    i11 = 8;
                    i13 = i11;
                    return new com.google.android.gms.ads.internal.client.zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 4:
                case 8:
                case 17:
                    i13 = 2;
                    return new com.google.android.gms.ads.internal.client.zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 7:
                    i11 = 4;
                    i13 = i11;
                    return new com.google.android.gms.ads.internal.client.zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 12:
                    if (((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhX)).intValue() <= 0) {
                        i11 = 9;
                        i13 = i11;
                        return new com.google.android.gms.ads.internal.client.zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                    }
                    i13 = 3;
                    return new com.google.android.gms.ads.internal.client.zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 13:
                    i11 = 10;
                    i13 = i11;
                    return new com.google.android.gms.ads.internal.client.zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                case 14:
                    i11 = 11;
                    i13 = i11;
                    return new com.google.android.gms.ads.internal.client.zze(i13, str3, MobileAds.ERROR_DOMAIN, zzeVar, null);
                default:
                    switch (i10) {
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
