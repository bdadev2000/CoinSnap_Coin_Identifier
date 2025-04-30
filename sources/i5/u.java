package i5;

import com.google.protobuf.V2;

/* loaded from: classes2.dex */
public enum u implements V2 {
    NONE(-1),
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17);

    public final int b;

    u(int i9) {
        this.b = i9;
    }

    public static u a(int i9) {
        switch (i9) {
            case -1:
                return NONE;
            case 0:
                return MOBILE;
            case 1:
                return WIFI;
            case 2:
                return MOBILE_MMS;
            case 3:
                return MOBILE_SUPL;
            case 4:
                return MOBILE_DUN;
            case 5:
                return MOBILE_HIPRI;
            case 6:
                return WIMAX;
            case 7:
                return BLUETOOTH;
            case 8:
                return DUMMY;
            case 9:
                return ETHERNET;
            case 10:
                return MOBILE_FOTA;
            case 11:
                return MOBILE_IMS;
            case 12:
                return MOBILE_CBS;
            case 13:
                return WIFI_P2P;
            case 14:
                return MOBILE_IA;
            case 15:
                return MOBILE_EMERGENCY;
            case 16:
                return PROXY;
            case 17:
                return VPN;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        return this.b;
    }
}
