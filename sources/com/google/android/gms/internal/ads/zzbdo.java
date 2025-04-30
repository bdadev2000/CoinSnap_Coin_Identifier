package com.google.android.gms.internal.ads;

import com.google.android.gms.location.GeofenceStatusCodes;
import com.vungle.ads.internal.protos.g;
import com.vungle.ads.o1;

/* loaded from: classes2.dex */
public enum zzbdo implements zzhbs {
    UNKNOWN_EVENT_TYPE(0),
    AD_REQUEST(1),
    AD_LOADED(2),
    AD_IMPRESSION(5),
    AD_FIRST_CLICK(6),
    AD_SUBSEQUENT_CLICK(7),
    REQUEST_WILL_START(8),
    REQUEST_DID_END(9),
    REQUEST_WILL_UPDATE_SIGNALS(10),
    REQUEST_DID_UPDATE_SIGNALS(11),
    REQUEST_WILL_BUILD_URL(12),
    REQUEST_DID_BUILD_URL(13),
    REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
    REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
    REQUEST_WILL_PROCESS_RESPONSE(16),
    REQUEST_DID_PROCESS_RESPONSE(17),
    REQUEST_WILL_RENDER(18),
    REQUEST_DID_RENDER(19),
    AD_FAILED_TO_LOAD(3),
    AD_FAILED_TO_LOAD_NO_FILL(4),
    AD_FAILED_TO_LOAD_INVALID_REQUEST(100),
    AD_FAILED_TO_LOAD_NETWORK_ERROR(101),
    AD_FAILED_TO_LOAD_TIMEOUT(102),
    AD_FAILED_TO_LOAD_CANCELLED(103),
    AD_FAILED_TO_LOAD_NO_ERROR(104),
    AD_FAILED_TO_LOAD_NOT_FOUND(105),
    REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
    REQUEST_DID_UPDATE_GMS_SIGNALS(1001),
    REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(1002),
    REQUEST_FAILED_TO_BUILD_URL(1003),
    REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION),
    REQUEST_FAILED_TO_PROCESS_RESPONSE(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT),
    REQUEST_FAILED_TO_UPDATE_SIGNALS(1006),
    REQUEST_FAILED_TO_RENDER(1007),
    REQUEST_IS_PREFETCH(1100),
    REQUEST_SAVED_TO_CACHE(1101),
    REQUEST_LOADED_FROM_CACHE(1102),
    REQUEST_PREFETCH_INTERCEPTED(1103),
    REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED(1104),
    REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED(1105),
    NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED(1106),
    NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED(1107),
    REQUEST_FAILED_TO_LOAD_FROM_CACHE(1108),
    BANNER_SIZE_INVALID(10000),
    BANNER_SIZE_VALID(10001),
    ANDROID_WEBVIEW_CRASH(g.AD_LOAD_TOO_FREQUENTLY_VALUE),
    OFFLINE_UPLOAD(o1.CONFIGURATION_ERROR),
    DELAY_PAGE_LOAD_CANCELLED_AD(10004);

    private static final zzhbt zzW = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzbdn
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            zzbdo zzbdoVar = zzbdo.UNKNOWN_EVENT_TYPE;
            switch (i9) {
                case 0:
                    return zzbdo.UNKNOWN_EVENT_TYPE;
                case 1:
                    return zzbdo.AD_REQUEST;
                case 2:
                    return zzbdo.AD_LOADED;
                case 3:
                    return zzbdo.AD_FAILED_TO_LOAD;
                case 4:
                    return zzbdo.AD_FAILED_TO_LOAD_NO_FILL;
                case 5:
                    return zzbdo.AD_IMPRESSION;
                case 6:
                    return zzbdo.AD_FIRST_CLICK;
                case 7:
                    return zzbdo.AD_SUBSEQUENT_CLICK;
                case 8:
                    return zzbdo.REQUEST_WILL_START;
                case 9:
                    return zzbdo.REQUEST_DID_END;
                case 10:
                    return zzbdo.REQUEST_WILL_UPDATE_SIGNALS;
                case 11:
                    return zzbdo.REQUEST_DID_UPDATE_SIGNALS;
                case 12:
                    return zzbdo.REQUEST_WILL_BUILD_URL;
                case 13:
                    return zzbdo.REQUEST_DID_BUILD_URL;
                case 14:
                    return zzbdo.REQUEST_WILL_MAKE_NETWORK_REQUEST;
                case 15:
                    return zzbdo.REQUEST_DID_RECEIVE_NETWORK_RESPONSE;
                case 16:
                    return zzbdo.REQUEST_WILL_PROCESS_RESPONSE;
                case 17:
                    return zzbdo.REQUEST_DID_PROCESS_RESPONSE;
                case 18:
                    return zzbdo.REQUEST_WILL_RENDER;
                case 19:
                    return zzbdo.REQUEST_DID_RENDER;
                default:
                    switch (i9) {
                        case 100:
                            return zzbdo.AD_FAILED_TO_LOAD_INVALID_REQUEST;
                        case 101:
                            return zzbdo.AD_FAILED_TO_LOAD_NETWORK_ERROR;
                        case 102:
                            return zzbdo.AD_FAILED_TO_LOAD_TIMEOUT;
                        case 103:
                            return zzbdo.AD_FAILED_TO_LOAD_CANCELLED;
                        case 104:
                            return zzbdo.AD_FAILED_TO_LOAD_NO_ERROR;
                        case 105:
                            return zzbdo.AD_FAILED_TO_LOAD_NOT_FOUND;
                        default:
                            switch (i9) {
                                case 1000:
                                    return zzbdo.REQUEST_WILL_UPDATE_GMS_SIGNALS;
                                case 1001:
                                    return zzbdo.REQUEST_DID_UPDATE_GMS_SIGNALS;
                                case 1002:
                                    return zzbdo.REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS;
                                case 1003:
                                    return zzbdo.REQUEST_FAILED_TO_BUILD_URL;
                                case GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION /* 1004 */:
                                    return zzbdo.REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST;
                                case GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT /* 1005 */:
                                    return zzbdo.REQUEST_FAILED_TO_PROCESS_RESPONSE;
                                case 1006:
                                    return zzbdo.REQUEST_FAILED_TO_UPDATE_SIGNALS;
                                case 1007:
                                    return zzbdo.REQUEST_FAILED_TO_RENDER;
                                default:
                                    switch (i9) {
                                        case 1100:
                                            return zzbdo.REQUEST_IS_PREFETCH;
                                        case 1101:
                                            return zzbdo.REQUEST_SAVED_TO_CACHE;
                                        case 1102:
                                            return zzbdo.REQUEST_LOADED_FROM_CACHE;
                                        case 1103:
                                            return zzbdo.REQUEST_PREFETCH_INTERCEPTED;
                                        case 1104:
                                            return zzbdo.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED;
                                        case 1105:
                                            return zzbdo.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED;
                                        case 1106:
                                            return zzbdo.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED;
                                        case 1107:
                                            return zzbdo.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED;
                                        case 1108:
                                            return zzbdo.REQUEST_FAILED_TO_LOAD_FROM_CACHE;
                                        default:
                                            switch (i9) {
                                                case 10000:
                                                    return zzbdo.BANNER_SIZE_INVALID;
                                                case 10001:
                                                    return zzbdo.BANNER_SIZE_VALID;
                                                case AD_LOAD_TOO_FREQUENTLY_VALUE:
                                                    return zzbdo.ANDROID_WEBVIEW_CRASH;
                                                case o1.CONFIGURATION_ERROR /* 10003 */:
                                                    return zzbdo.OFFLINE_UPLOAD;
                                                case 10004:
                                                    return zzbdo.DELAY_PAGE_LOAD_CANCELLED_AD;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        }
    };
    private final int zzY;

    zzbdo(int i9) {
        this.zzY = i9;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzY);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzY;
    }
}
