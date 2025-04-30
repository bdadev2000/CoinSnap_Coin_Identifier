package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;

/* loaded from: classes2.dex */
public enum zzfmu implements zzhbs {
    CUI_NAME_UNKNOWN(0),
    CUI_NAME_SDKINIT(1),
    CUI_NAME_SDKINIT_LOAD_FLAGS(25),
    CUI_NAME_SDKINIT_ACTIVITY_TRACKER(33),
    CUI_NAME_SDKINIT_CLD(2),
    CUI_NAME_SDKINIT_ADAPTERINIT(3),
    CUI_NAME_SDKINIT_SDKCORE(4),
    CUI_NAME_SDKINIT_INIT_CONSENT_STATE(28),
    CUI_NAME_SDKINIT_INIT_OMID(31),
    CUI_NAME_SDKINIT_INIT_SPAM(38),
    CUI_NAME_UPDATE_FLAGS_INIT_TASK(24),
    CUI_NAME_DEVICE_PROPERTIES_INIT_TASK(30),
    CUI_NAME_UPDATE_FLAGS(22),
    CUI_NAME_ADREQUEST(5),
    CUI_NAME_ADREQUEST_SIGNALS(6),
    CUI_NAME_ADREQUEST_BUILDURL(7),
    CUI_NAME_ADREQUEST_REQUEST(8),
    CUI_NAME_ADREQUEST_NORMALIZE_RESPONSE(26),
    CUI_NAME_ADREQUEST_PARSERESPONSE(9),
    CUI_NAME_ADREQUEST_MEDIATION(29),
    CUI_NAME_ADREQUEST_MEDIATION_ADAPTER(10),
    CUI_NAME_WEBVIEW_INITIALIZATION(36),
    CUI_NAME_WEBVIEW_LOAD(37),
    CUI_NAME_ADSHOW(11),
    CUI_NAME_NETWORK_CONNECTIVITY_MANAGER_STATE(32),
    CUI_NAME_IMPRESSION(34),
    CUI_NAME_VIEW_SIGNALS(39),
    CUI_NAME_CLICK(35),
    CUI_NAME_CLICK_SIGNALS(40),
    CUI_NAME_CONSENT_ALLOWLIST_UPDATE(42),
    CUI_NAME_CONSENT_STRING_READING(43),
    CUI_NAME_PING(12),
    CUI_NAME_PING_ATTESTATION(13),
    CUI_NAME_VIDEO_INIT(14),
    CUI_NAME_VIDEO_START(15),
    CUI_NAME_VIDEO_PLAY(16),
    CUI_NAME_VIDEO_PAUSE(17),
    CUI_NAME_VIDEO_RESUME(18),
    CUI_NAME_REWARD_GRANTED(19),
    CUI_NAME_SCAR_SIGNALS(20),
    CUI_NAME_SCAR_RENDERING(21),
    CUI_NAME_SCAR_CACHE_EVICTION(41),
    CUI_NAME_SIGNAL(23),
    CUI_NAME_GMSG(27),
    UNRECOGNIZED(-1);

    private static final zzhbt zzT = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzfmt
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            zzfmu zzfmuVar = zzfmu.CUI_NAME_UNKNOWN;
            switch (i9) {
                case 0:
                    return zzfmu.CUI_NAME_UNKNOWN;
                case 1:
                    return zzfmu.CUI_NAME_SDKINIT;
                case 2:
                    return zzfmu.CUI_NAME_SDKINIT_CLD;
                case 3:
                    return zzfmu.CUI_NAME_SDKINIT_ADAPTERINIT;
                case 4:
                    return zzfmu.CUI_NAME_SDKINIT_SDKCORE;
                case 5:
                    return zzfmu.CUI_NAME_ADREQUEST;
                case 6:
                    return zzfmu.CUI_NAME_ADREQUEST_SIGNALS;
                case 7:
                    return zzfmu.CUI_NAME_ADREQUEST_BUILDURL;
                case 8:
                    return zzfmu.CUI_NAME_ADREQUEST_REQUEST;
                case 9:
                    return zzfmu.CUI_NAME_ADREQUEST_PARSERESPONSE;
                case 10:
                    return zzfmu.CUI_NAME_ADREQUEST_MEDIATION_ADAPTER;
                case 11:
                    return zzfmu.CUI_NAME_ADSHOW;
                case 12:
                    return zzfmu.CUI_NAME_PING;
                case 13:
                    return zzfmu.CUI_NAME_PING_ATTESTATION;
                case 14:
                    return zzfmu.CUI_NAME_VIDEO_INIT;
                case 15:
                    return zzfmu.CUI_NAME_VIDEO_START;
                case 16:
                    return zzfmu.CUI_NAME_VIDEO_PLAY;
                case 17:
                    return zzfmu.CUI_NAME_VIDEO_PAUSE;
                case 18:
                    return zzfmu.CUI_NAME_VIDEO_RESUME;
                case 19:
                    return zzfmu.CUI_NAME_REWARD_GRANTED;
                case 20:
                    return zzfmu.CUI_NAME_SCAR_SIGNALS;
                case 21:
                    return zzfmu.CUI_NAME_SCAR_RENDERING;
                case 22:
                    return zzfmu.CUI_NAME_UPDATE_FLAGS;
                case 23:
                    return zzfmu.CUI_NAME_SIGNAL;
                case 24:
                    return zzfmu.CUI_NAME_UPDATE_FLAGS_INIT_TASK;
                case 25:
                    return zzfmu.CUI_NAME_SDKINIT_LOAD_FLAGS;
                case 26:
                    return zzfmu.CUI_NAME_ADREQUEST_NORMALIZE_RESPONSE;
                case 27:
                    return zzfmu.CUI_NAME_GMSG;
                case 28:
                    return zzfmu.CUI_NAME_SDKINIT_INIT_CONSENT_STATE;
                case 29:
                    return zzfmu.CUI_NAME_ADREQUEST_MEDIATION;
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    return zzfmu.CUI_NAME_DEVICE_PROPERTIES_INIT_TASK;
                case 31:
                    return zzfmu.CUI_NAME_SDKINIT_INIT_OMID;
                case 32:
                    return zzfmu.CUI_NAME_NETWORK_CONNECTIVITY_MANAGER_STATE;
                case 33:
                    return zzfmu.CUI_NAME_SDKINIT_ACTIVITY_TRACKER;
                case 34:
                    return zzfmu.CUI_NAME_IMPRESSION;
                case 35:
                    return zzfmu.CUI_NAME_CLICK;
                case 36:
                    return zzfmu.CUI_NAME_WEBVIEW_INITIALIZATION;
                case 37:
                    return zzfmu.CUI_NAME_WEBVIEW_LOAD;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    return zzfmu.CUI_NAME_SDKINIT_INIT_SPAM;
                case 39:
                    return zzfmu.CUI_NAME_VIEW_SIGNALS;
                case 40:
                    return zzfmu.CUI_NAME_CLICK_SIGNALS;
                case 41:
                    return zzfmu.CUI_NAME_SCAR_CACHE_EVICTION;
                case 42:
                    return zzfmu.CUI_NAME_CONSENT_ALLOWLIST_UPDATE;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    return zzfmu.CUI_NAME_CONSENT_STRING_READING;
                default:
                    return null;
            }
        }
    };
    private final int zzV;

    zzfmu(int i9) {
        this.zzV = i9;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzV;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
