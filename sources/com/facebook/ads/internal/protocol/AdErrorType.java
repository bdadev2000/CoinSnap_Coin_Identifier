package com.facebook.ads.internal.protocol;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public enum AdErrorType {
    UNKNOWN_ERROR(-1, A00(2564, 13, 63), false),
    NETWORK_ERROR(1000, A00(2090, 13, 82), true),
    NO_FILL(1001, A00(2103, 7, 102), true),
    LOAD_TOO_FREQUENTLY(1002, A00(261, 31, 74), true),
    DISABLED_APP(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, A00(368, 39, 20), true),
    SERVER_ERROR(2000, A00(2209, 12, 94), true),
    INTERNAL_ERROR(2001, A00(1620, 14, 50), true),
    CACHE_FAILURE_ERROR(2002, A00(2124, 19, 38), true),
    START_BEFORE_INIT(2005, A00(2528, 36, 24), true),
    REMOTE_ADS_SERVICE_ERROR(2008, A00(343, 25, 28), true),
    INTERSTITIAL_AD_TIMEOUT(2009, A00(2221, 31, 120), true),
    RV_AD_TIMEOUT(2010, A00(2252, 33, 114), true),
    AD_PRESENTATION_ERROR(AdError.AD_PRESENTATION_ERROR_CODE, A00(150, 25, 118), true),
    BROKEN_MEDIA_ERROR(AdError.BROKEN_MEDIA_ERROR_CODE, A00(1020, 34, 41), true),
    AD_REQUEST_FAILED(1111, A00(623, 39, 71), false),
    AD_REQUEST_TIMEOUT(1112, A00(662, 42, 56), false),
    PARSER_FAILURE(1201, A00(1054, 50, 14), false),
    UNKNOWN_RESPONSE(1202, A00(2343, 47, 51), false),
    ERROR_MESSAGE(1203, A00(575, 48, 14), true),
    NO_AD_PLACEMENT(1302, A00(704, 42, 45), false),
    MEDIATION_ERROR(3001, A00(1926, 15, 30), true),
    BID_IMPRESSION_MISMATCH(4001, A00(465, 36, 10), true),
    BID_PAYLOAD_ERROR(4002, A00(1673, 19, 67), false),
    NO_ADAPTER_ON_LOAD(5001, A00(292, 25, 116), false),
    NO_ADAPTER_ON_START(5002, A00(317, 26, 15), false),
    INTERSTITIAL_CONTROLLER_IS_NULL(5003, A00(1634, 39, 14), false),
    WEB_VIEW_FAILED_TO_LOAD(5004, A00(2443, 22, 33), false),
    WEB_VIEW_CACHE_FILE_WAS_DENIED(5005, A00(1104, 43, 24), false),
    NO_MEDIAVIEW_IN_NATIVEAD(AdError.MEDIAVIEW_MISSING_ERROR_CODE, A00(1894, 32, 11), true),
    NO_MEDIAVIEW_IN_NATIVEBANNERAD(AdError.ICONVIEW_MISSING_ERROR_CODE, A00(1847, 47, 107), true),
    UNSUPPORTED_AD_ASSET_NATIVEAD(AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE, A00(2577, 29, 64), true),
    AD_ALREADY_STARTED(AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE, A00(91, 18, 46), true),
    LOAD_CALLED_WHILE_SHOWING_AD(AdError.LOAD_CALLED_WHILE_SHOWING_AD, A00(109, 41, 86), true),
    CLEAR_TEXT_SUPPORT_NOT_ALLOWED(AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, A00(1277, 343, 25), true),
    INCORRECT_STATE_ERROR(AdError.INCORRECT_STATE_ERROR, A00(2492, 36, 116), true),
    MISSING_DEPENDENCIES_ERROR(AdError.MISSING_DEPENDENCIES_ERROR, A00(746, 178, 100), true),
    API_NOT_SUPPORTED(AdError.API_NOT_SUPPORTED, A00(924, 75, 25), true),
    NATIVE_AD_IS_NOT_LOADED(AdError.NATIVE_AD_IS_NOT_LOADED, A00(175, 86, 114), true),
    INCORRECT_API_CALL_ERROR(7008, A00(2465, 27, 86), true),
    IMAGE_CACHE_ERROR(8001, A00(999, 21, 85), false),
    LOAD_AD_CALLED_MORE_THAN_ONCE(8002, A00(1768, 38, 24), true);

    public static byte[] A03;
    public static String[] A04 = {"ovPjjuFE9om7OIefNXRfQwFL9PUdOP68", "Xxl4rLnj16XDfkQUiM3437m5W6qonc5R", "UVmnaLPTsQqsAUFvP4l9eFVdZ5Bnbi11", "1ZhKvMy3c0pCt", "Rh7YRMmCfK6BaL93vKCO6WgzdB7W", "p5EAmOIUOepdn0Id4WtjwtBc6P8vGfuC", "JnlGisJqZLjO7zfwdKKMw91nRUtIhmzE", "W9Yqfcw4l1PfnAsasbj5MfnOF9oeiem1"};
    public final int A00;
    public final String A01;
    public final boolean A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-94, -91, -64, -94, -83, -77, -90, -94, -91, -70, -64, -76, -75, -94, -77, -75, -90, -91, -20, -17, 10, -5, -3, -16, -2, -16, -7, -1, -20, -1, -12, -6, -7, 10, -16, -3, -3, -6, -3, -115, -112, -85, -98, -111, -99, -95, -111, -97, -96, -85, -110, -115, -107, -104, -111, -112, -109, -106, -79, -92, -105, -93, -89, -105, -91, -90, -79, -90, -101, -97, -105, -95, -89, -90, -75, -60, -67, -45, -62, -61, -56, -45, -57, -55, -60, -60, -61, -58, -56, -71, -72, -79, -44, -112, -47, -36, -30, -43, -47, -44, -23, -112, -29, -28, -47, -30, -28, -43, -44, -39, -4, -72, -5, -7, 6, 6, 7, Ascii.FF, -72, -6, -3, -72, 4, 7, -7, -4, -3, -4, -72, Ascii.SI, 0, 1, 4, -3, -72, -6, -3, 1, 6, -1, -72, -4, 1, Ascii.VT, 8, 4, -7, 17, -3, -4, -7, Ascii.FS, -40, Ascii.ESC, 39, 45, 36, Ascii.FS, -40, 38, 39, 44, -40, Ascii.SUB, Ascii.GS, -40, 40, 42, Ascii.GS, 43, Ascii.GS, 38, 44, Ascii.GS, Ascii.FS, -11, Ascii.CAN, -44, Ascii.GS, 39, -44, 34, 35, 40, -44, 32, 35, Ascii.NAK, Ascii.CAN, Ascii.EM, Ascii.CAN, -30, -44, 1, Ascii.NAK, Ascii.US, Ascii.EM, -44, 39, 41, 38, Ascii.EM, -44, 40, Ascii.FS, Ascii.NAK, 40, -44, 45, 35, 41, -44, Ascii.ETB, Ascii.NAK, 32, 32, -44, 32, 35, Ascii.NAK, Ascii.CAN, -11, Ascii.CAN, -36, -35, -44, Ascii.SYN, Ascii.EM, Ascii.SUB, 35, 38, Ascii.EM, -44, 38, Ascii.EM, Ascii.ESC, Ascii.GS, 39, 40, Ascii.EM, 38, 10, Ascii.GS, Ascii.EM, 43, -6, 35, 38, -3, 34, 40, Ascii.EM, 38, Ascii.NAK, Ascii.ETB, 40, Ascii.GS, 35, 34, -36, -35, -51, -16, -84, 3, -19, -1, -84, -2, -15, -71, -8, -5, -19, -16, -15, -16, -84, 0, -5, -5, -84, -14, -2, -15, -3, 1, -15, -6, 0, -8, 5, -9, Ascii.SUB, Ascii.ETB, 38, 42, Ascii.ESC, 40, -42, Ascii.US, 41, -42, 36, 43, 34, 34, -42, 37, 36, 2, 37, Ascii.ETB, Ascii.SUB, -42, -9, Ascii.SUB, -110, -75, -78, -63, -59, -74, -61, 113, -70, -60, 113, -65, -58, -67, -67, 113, -64, -65, -92, -59, -78, -61, -59, 113, -110, -75, -97, -62, -47, 126, -79, -61, -48, -44, -57, -63, -61, 126, -50, -48, -51, -63, -61, -47, -47, 126, -61, -48, -48, -51, -48, -105, -58, -58, 118, -65, -55, 118, -70, -65, -55, -73, -72, -62, -69, -70, 118, -68, -56, -59, -61, 118, -61, -73, -63, -65, -60, -67, 118, -73, -70, 118, -56, -69, -57, -53, -69, -55, -54, -55, -72, -65, -70, -43, -65, -61, -58, -56, -69, -55, -55, -65, -59, -60, -43, -61, -65, -55, -61, -73, -54, -71, -66, -22, -15, -20, 7, -8, -23, 1, -12, -9, -23, -20, 7, -19, -6, -6, -9, -6, -29, -13, -16, -20, -26, -17, 0, -18, -26, -27, -22, -30, 0, -26, -13, -13, -16, -13, -114, -75, -80, 108, -68, -83, -59, -72, -69, -83, -80, 108, -80, -69, -79, -65, 108, -70, -69, -64, 108, -71, -83, -64, -81, -76, 108, -68, -72, -83, -81, -79, -71, -79, -70, -64, -24, -26, -24, -19, -22, 4, -21, -26, -18, -15, -6, -9, -22, 4, -22, -9, -9, -12, -9, -12, -3, -10, -14, 3, Ascii.DLE, 5, -10, 9, 5, Ascii.DLE, 4, 6, 1, 1, 0, 3, 5, Ascii.DLE, -1, 0, 5, Ascii.DLE, -14, -3, -3, 0, 8, -10, -11, -66, -61, -51, -69, -68, -58, -65, -66, -39, -69, -54, -54, -32, -19, -19, -22, -19, -6, -24, -32, -18, -18, -36, -30, -32, -106, -79, -77, -75, -78, -65, -65, -69, 112, -111, -76, -61, 112, -93, -108, -101, 112, -76, -75, -68, -71, -58, -75, -62, -55, 112, -62, -75, -61, -64, -65, -66, -61, -75, 112, -107, -62, -62, -65, -62, 112, -67, -75, -61, -61, -79, -73, -75, -49, -22, -20, -18, -21, -8, -8, -12, -87, -54, -19, -4, -87, -36, -51, -44, -87, -5, -18, -6, -2, -18, -4, -3, -87, -17, -8, -5, -87, -22, -19, -4, -87, -17, -22, -14, -11, -18, -19, -64, -37, -35, -33, -36, -23, -23, -27, -102, -69, -34, -19, -102, -51, -66, -59, -102, -20, -33, -21, -17, -33, -19, -18, -102, -32, -23, -20, -102, -37, -34, -19, -102, -18, -29, -25, -33, -34, -102, -23, -17, -18, -75, -48, -46, -44, -47, -34, -34, -38, -113, -80, -45, -30, -113, -62, -77, -70, -113, -31, -44, -29, -28, -31, -35, -44, -45, -113, -35, -34, -113, -48, -45, -113, -33, -37, -48, -46, -44, -36, -44, -35, -29, -30, -20, 7, 9, Ascii.VT, 8, Ascii.NAK, Ascii.NAK, 17, -58, -25, Ascii.ESC, 10, Ascii.SI, Ascii.VT, Ascii.DC4, 9, Ascii.VT, -58, -12, Ascii.VT, Ascii.SUB, Ascii.GS, Ascii.NAK, Ascii.CAN, 17, -58, -7, -22, -15, -58, 10, Ascii.NAK, Ascii.VT, Ascii.EM, Ascii.DC4, -51, Ascii.SUB, -58, Ascii.SO, 7, Ascii.FS, Ascii.VT, -58, 7, Ascii.DC2, Ascii.DC2, -58, Ascii.CAN, Ascii.VT, Ascii.ETB, Ascii.ESC, Ascii.SI, Ascii.CAN, Ascii.VT, 10, -58, 9, Ascii.DC2, 7, Ascii.EM, Ascii.EM, Ascii.VT, Ascii.EM, -44, -58, -10, Ascii.DC2, Ascii.VT, 7, Ascii.EM, Ascii.VT, -46, -58, 9, Ascii.SO, Ascii.VT, 9, 17, -58, -14, Ascii.NAK, Ascii.CR, -23, 7, Ascii.SUB, -58, Ascii.NAK, Ascii.ESC, Ascii.SUB, Ascii.SYN, Ascii.ESC, Ascii.SUB, -58, Ascii.FF, Ascii.NAK, Ascii.CAN, -58, Ascii.SUB, 7, Ascii.CR, -58, -53, Ascii.EM, -44, -58, -7, Ascii.VT, Ascii.VT, -58, 19, Ascii.NAK, Ascii.CAN, Ascii.VT, -32, -58, Ascii.SO, Ascii.SUB, Ascii.SUB, Ascii.SYN, Ascii.EM, -32, -43, -43, 10, Ascii.VT, Ascii.FS, Ascii.VT, Ascii.DC2, Ascii.NAK, Ascii.SYN, Ascii.VT, Ascii.CAN, Ascii.EM, -44, Ascii.FF, 7, 9, Ascii.VT, 8, Ascii.NAK, Ascii.NAK, 17, -44, 9, Ascii.NAK, 19, -43, 10, Ascii.NAK, 9, Ascii.EM, -43, 7, Ascii.ESC, 10, Ascii.SI, Ascii.VT, Ascii.DC4, 9, Ascii.VT, -45, Ascii.DC4, Ascii.VT, Ascii.SUB, Ascii.GS, Ascii.NAK, Ascii.CAN, 17, -43, 7, Ascii.DC4, 10, Ascii.CAN, Ascii.NAK, Ascii.SI, 10, -43, -58, -95, -68, -66, -64, -67, -54, -54, -58, 123, -100, -48, -65, -60, -64, -55, -66, -64, 123, -87, -64, -49, -46, -54, -51, -58, 123, -82, -97, -90, 123, -65, -54, -64, -50, -55, -126, -49, 123, -50, -48, -53, -53, -54, -51, -49, 123, -100, -55, -65, -51, -54, -60, -65, 123, -86, -82, 123, -47, -64, -51, -50, -60, -54, -55, -50, 123, -67, -64, -57, -54, -46, 123, -113, -119, -115, -35, 
        -8, 0, 3, -4, -5, -73, Ascii.VT, 6, -73, -6, -8, -6, -1, -4, -73, 0, 4, -8, -2, -4, -79, -52, -44, -41, -48, -49, -117, -33, -38, -117, -41, -38, -52, -49, -117, -72, -48, -49, -44, -52, -117, -47, -38, -35, -117, -71, -52, -33, -44, -31, -48, -117, -84, -49, -106, -79, -71, -68, -75, -76, 112, -60, -65, 112, -64, -79, -62, -61, -75, 112, -106, -79, -77, -75, -78, -65, -65, -69, 112, -111, -76, -61, 112, -93, -108, -101, 112, -76, -75, -68, -71, -58, -75, -62, -55, 112, -62, -75, -61, -64, -65, -66, -61, -75, -96, -61, -58, -65, 122, -90, -55, -69, -66, 122, -64, -52, -55, -57, 122, -79, -65, -68, -80, -61, -65, -47, 122, -47, -69, -51, 122, -98, -65, -56, -61, -65, -66, 122, -64, -55, -52, 122, -99, -69, -67, -62, -65, -43, -39, -51, -45, -47, -21, -49, -51, -49, -44, -47, -21, -47, -34, -34, -37, -34, -73, -68, -79, -67, -64, -64, -77, -79, -62, -51, -81, -66, -73, -51, -79, -81, -70, -70, -51, -77, -64, -64, -67, -64, -98, -93, -104, -92, -89, -89, -102, -104, -87, -76, -88, -87, -106, -87, -102, -76, -102, -89, -89, -92, -89, -110, -105, -99, -114, -101, -105, -118, -107, -88, -114, -101, -101, -104, -101, 1, 6, Ascii.FF, -3, 10, Ascii.VT, Ascii.FF, 1, Ascii.FF, 1, -7, 4, Ascii.ETB, -7, -4, Ascii.ETB, Ascii.FF, 1, 5, -3, 7, Ascii.CR, Ascii.FF, -75, -70, -64, -79, -66, -65, -64, -75, -64, -75, -83, -72, -53, -81, -69, -70, -64, -66, -69, -72, -72, -79, -66, -53, -75, -65, -53, -70, -63, -72, -72, -92, -55, 123, -54, -51, -65, -64, -51, 123, -49, -54, 123, -48, -50, -64, 123, -66, -68, -66, -61, -64, 123, -60, -55, 123, -95, -68, -66, -64, -67, -54, -54, -58, 123, -100, -48, -65, -60, -64, -55, -66, -64, 123, -87, -64, -49, -46, -54, -51, -58, 123, -82, -97, -90, 123, -44, -54, -48, 123, -50, -61, -54, -48, -57, -65, 123, -46, -61, -60, -49, -64, -57, -60, -50, -49, 123, -116, -115, -110, -119, -117, -119, -117, -119, -116, 123, -60, -55, 123, -44, -54, -48, -51, 123, -87, -64, -49, -46, -54, -51, -58, 123, -82, -64, -66, -48, -51, -60, -49, -44, 123, -98, -54, -55, -63, -60, -62, -48, -51, -68, -49, -60, -54, -55, -107, 101, -105, -65, -54, -56, -68, -60, -55, -120, -66, -54, -55, -63, -60, -62, 123, -66, -57, -64, -68, -51, -49, -64, -45, -49, -81, -51, -68, -63, -63, -60, -66, -85, -64, -51, -56, -60, -49, -49, -64, -65, -104, 125, -49, -51, -48, -64, 125, -103, 101, 123, 123, 123, 123, -105, -65, -54, -56, -68, -60, -55, 123, -60, -55, -66, -57, -48, -65, -64, -82, -48, -67, -65, -54, -56, -68, -60, -55, -50, -104, 125, -49, -51, -48, -64, 125, -103, -116, -115, -110, -119, -117, -119, -117, -119, -116, -105, -118, -65, -54, -56, -68, -60, -55, -103, 101, -105, -118, -65, -54, -56, -68, -60, -55, -120, -66, -54, -55, -63, -60, -62, -103, 101, -82, -64, -64, 123, -56, -54, -51, -64, -107, 123, -61, -49, -49, -53, -50, -107, -118, -118, -65, -64, -47, -64, -57, -54, -53, -64, -51, -50, -119, -63, -68, -66, -64, -67, -54, -54, -58, -119, -66, -54, -56, -118, -65, -54, -66, -50, -118, -68, -48, -65, -60, -64, -55, -66, -64, -120, -55, -64, -49, -46, -54, -51, -58, -118, -68, -55, -65, -51, -54, -60, -65, -120, -55, -64, -49, -46, -54, -51, -58, -120, -50, -64, -66, -48, -51, -60, -49, -44, -120, -66, -54, -55, -63, -60, -62, -67, -30, -24, -39, -26, -30, -43, -32, -108, -71, -26, -26, -29, -26, -103, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, 112, -109, -65, -66, -60, -62, -65, -68, -68, -75, -62, 112, -71, -61, 112, -66, -59, -68, -68, 112, -61, -72, -65, -57, 112, -111, -76, -50, -13, -5, -26, -15, -18, -23, -91, -25, -18, -23, -91, -11, -26, -2, -15, -12, -26, -23, -27, -24, -38, -35, -8, -38, -35, -8, -36, -38, -27, -27, -34, -35, -8, -26, -24, -21, -34, -8, -19, -31, -38, -25, -8, -24, -25, -36, -34, Ascii.FF, Ascii.SI, 1, 4, Ascii.US, 3, 1, Ascii.FF, Ascii.FF, 5, 4, Ascii.US, Ascii.ETB, 8, 9, Ascii.FF, 5, Ascii.US, 19, 8, Ascii.SI, Ascii.ETB, 9, Ascii.SO, 7, Ascii.US, 1, 4, -33, -30, -44, -41, -14, -25, -30, -30, -14, -39, -27, -40, -28, -24, -40, -31, -25, -33, -20, -90, -55, -69, -66, -101, -66, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -67, -69, -58, -58, -65, -66, 122, -57, -55, -52, -65, 122, -50, -62, -69, -56, 122, -55, -56, -67, -65, -98, -106, -107, -102, -110, -91, -102, -96, -97, -80, -106, -93, -93, -96, -93, -46, -50, -40, -40, -50, -45, -52, -28, -55, -54, -43, -54, -45, -55, -54, -45, -56, -50, -54, -40, -28, -54, -41, -41, -44, -41, -6, Ascii.DC2, 17, Ascii.SYN, Ascii.SO, 3, Ascii.SYN, Ascii.DC2, 36, -51, 19, Ascii.FS, Ascii.US, -51, Ascii.SYN, Ascii.DLE, Ascii.FS, Ascii.ESC, -51, Ascii.SYN, 32, -51, Ascii.SUB, Ascii.SYN, 32, 32, Ascii.SYN, Ascii.ESC, Ascii.DC4, -51, Ascii.SYN, Ascii.ESC, -51, -5, Ascii.SO, 33, Ascii.SYN, 35, Ascii.DC2, -17, Ascii.SO, Ascii.ESC, Ascii.ESC, Ascii.DC2, Ascii.US, -18, 17, -102, -78, -79, -74, -82, -93, -74, -78, -60, 109, -74, -64, 109, -70, -74, -64, -64, -74, -69, -76, 109, -74, -69, 109, -101, -82, -63, -74, -61, -78, -114, -79, -83, -59, -60, -55, -63, -44, -55, -49, -50, ByteCompanionObject.MIN_VALUE, -91, -46, -46, -49, -46, -90, -103, -84, -95, -82, -99, -73, -103, -100, -73, -95, -85, -73, -90, -89, -84, -73, -92, -89, -103, -100, -99, -100, -12, -21, -6, -3, -11, -8, -15, 5, -21, -8, -8, -11, -8, -62, -61, -45, -75, -72, -75, -60, -56, -71, -58, -45, -61, -62, -45, -64, -61, -75, -72, -75, -74, -58, -88, -85, 
        -88, -73, -69, -84, -71, -58, -74, -75, -58, -70, -69, -88, -71, -69, -49, -48, -32, -62, -59, -32, -47, -51, -62, -60, -58, -50, -58, -49, -43, -61, -60, -44, -69, -66, -63, -63, -29, -28, -12, -30, -38, -39, -34, -42, -21, -34, -38, -20, -12, -34, -29, -12, -29, -42, -23, -34, -21, -38, -42, -39, -5, -4, Ascii.FF, -6, -14, -15, -10, -18, 3, -10, -14, 4, Ascii.FF, -10, -5, Ascii.FF, -5, -18, 1, -10, 3, -14, -17, -18, -5, -5, -14, -1, -18, -15, -30, -7, 8, Ascii.VT, 3, 6, -1, -76, -39, 6, 6, 3, 6, -10, Ascii.ETB, -56, -18, 17, Ascii.DC4, Ascii.DC4, -109, -124, -107, -106, -120, -107, -94, -119, -124, -116, -113, -104, -107, -120, -72, -38, -51, -120, -85, -55, -53, -48, -47, -42, -49, -120, -50, -55, -47, -44, -35, -38, -51, -27, -40, -32, -30, -25, -40, -14, -44, -41, -26, -14, -26, -40, -27, -23, -36, -42, -40, -14, -40, -27, -27, -30, -27, -99, -95, -86, -116, -113, -86, -97, -108, -104, -112, -102, -96, -97, -41, -55, -42, -38, -55, -42, -29, -55, -42, -42, -45, -42, 8, 9, -10, 7, 9, Ascii.DC4, -9, -6, -5, 4, 7, -6, Ascii.DC4, -2, 3, -2, 9, -13, 5, Ascii.DC2, Ascii.SYN, 5, Ascii.DC2, -64, -27, Ascii.DC2, Ascii.DC2, Ascii.SI, Ascii.DC2, Ascii.SO, 35, 39, Ascii.US, 41, 47, 46, -38, 38, 41, Ascii.ESC, Ascii.RS, 35, 40, 33, -38, 3, 40, 46, Ascii.US, 44, 45, 46, 35, 46, 35, Ascii.ESC, 38, -38, -5, Ascii.RS, 8, Ascii.GS, 33, Ascii.EM, 35, 41, 40, -44, 32, 35, Ascii.NAK, Ascii.CAN, Ascii.GS, 34, Ascii.ESC, -44, 6, Ascii.EM, 43, Ascii.NAK, 38, Ascii.CAN, Ascii.EM, Ascii.CAN, -44, 10, Ascii.GS, Ascii.CAN, Ascii.EM, 35, -44, -11, Ascii.CAN, -82, -89, -92, -89, -88, -80, -89, -72, -98, -85, -85, -88, -85, -26, -33, -36, -33, -32, -24, -33, -16, -29, -42, -28, -31, -32, -33, -28, -42, -93, -100, -95, -93, -98, -98, -99, -96, -94, -109, -110, -83, -113, -110, -83, -113, -95, -95, -109, -94, -83, -100, -113, -94, -105, -92, -109, -113, -110, -54, -29, -32, -29, -28, -20, -29, -107, -69, -42, -40, -38, -41, -28, -28, -32, -107, -74, -39, -24, -107, -56, -71, -64, -107, -39, -38, -31, -34, -21, -38, -25, -18, -107, -25, -38, -24, -27, -28, -29, -24, -38, -107, -23, -18, -27, -38, -85, -103, -106, -77, -86, -99, -103, -85, -77, -105, -107, -105, -100, -103, -77, -102, -99, -96, -103, -77, -85, -107, -89, -77, -104, -103, -94, -99, -103, -104, Ascii.SI, -3, -6, Ascii.ETB, Ascii.SO, 1, -3, Ascii.SI, Ascii.ETB, -2, -7, 1, 4, -3, -4, Ascii.ETB, Ascii.FF, 7, Ascii.ETB, 4, 7, -7, -4, -70, -56, -59, -71, -52, -56, -38, -125, -55, -60, -52, -49, -56, -57, -125, -41, -46, -125, -49, -46, -60, -57, -15, 7, Ascii.CR, -72, -5, -7, 6, -65, Ascii.FF, -72, -5, -7, 4, 4, -72, -67, Ascii.VT, -72, -2, 7, 10, -72, -7, -4, -72, -67, Ascii.VT, Ascii.SI, 37, 43, -42, Ascii.EM, Ascii.ETB, 36, -35, 42, -42, Ascii.EM, Ascii.ETB, 34, 34, -42, -37, 41, -42, Ascii.FS, 37, 40, -42, Ascii.ETB, Ascii.SUB, -42, Ascii.US, 36, -42, 41, 42, Ascii.ETB, 42, Ascii.ESC, -42, -37, 41, -61, -56, -61, -50, -101, -66, 122, -57, -49, -51, -50, 122, -68, -65, 122, -67, -69, -58, -58, -65, -66, 122, -68, -65, -64, -55, -52, -65, 122, -51, -50, -69, -52, -50, -101, -66, -10, -17, -20, -17, -16, -8, -17, -95, -26, -13, -13, -16, -13, -9, -16, -11, -9, -14, -14, -15, -12, -10, -25, -26, -94, -10, -5, -14, -25, -94, -15, -24, -94, -29, -26, -94, -29, -11, -11, -25, -10, -11};
    }

    static {
        A01();
    }

    AdErrorType(int i10, String str, boolean z10) {
        this.A00 = i10;
        this.A01 = str;
        this.A02 = z10;
    }

    public static AdErrorType adErrorTypeFromCode(int i10) {
        return adErrorTypeFromCode(i10, UNKNOWN_ERROR);
    }

    public static AdErrorType adErrorTypeFromCode(int i10, AdErrorType adErrorType) {
        for (AdErrorType adErrorType2 : valuesCustom()) {
            if (adErrorType2.getErrorCode() == i10) {
                return adErrorType2;
            }
        }
        return adErrorType;
    }

    public String getDefaultErrorMessage() {
        return this.A01;
    }

    public int getErrorCode() {
        return this.A00;
    }

    public boolean isPublicError() {
        return this.A02;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static AdErrorType[] valuesCustom() {
        AdErrorType[] adErrorTypeArr = (AdErrorType[]) values().clone();
        String[] strArr = A04;
        if (strArr[5].charAt(28) == strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[5] = "pBNFHLUpC4jWXgNLm8u027UOuLKmSmpd";
        strArr2[2] = "gG1ZcsHEHMfNZyb2FxMGGthk6GnsPN8K";
        return adErrorTypeArr;
    }
}
