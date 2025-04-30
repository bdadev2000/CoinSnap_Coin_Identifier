package com.applovin.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.InterfaceC0725m2;
import com.facebook.ads.AdError;
import com.google.android.gms.location.GeofenceStatusCodes;

/* loaded from: classes.dex */
public class kh extends Exception implements InterfaceC0725m2 {

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC0725m2.a f8691c = new I(25);

    /* renamed from: a, reason: collision with root package name */
    public final int f8692a;
    public final long b;

    public kh(Bundle bundle) {
        this(bundle.getString(b(2)), a(bundle), bundle.getInt(b(0), 1000), bundle.getLong(b(1), SystemClock.elapsedRealtime()));
    }

    private static Throwable a(Class cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    public static String b(int i9) {
        return Integer.toString(i9, 36);
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(b(3));
        String string2 = bundle.getString(b(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, kh.class.getClassLoader());
            Throwable a6 = Throwable.class.isAssignableFrom(cls) ? a(cls, string2) : null;
            if (a6 != null) {
                return a6;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    public kh(String str, Throwable th, int i9, long j7) {
        super(str, th);
        this.f8692a = i9;
        this.b = j7;
    }

    public final String a() {
        return a(this.f8692a);
    }

    public static String a(int i9) {
        if (i9 == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i9 != 5002) {
            switch (i9) {
                case 1000:
                    return "ERROR_CODE_UNSPECIFIED";
                case 1001:
                    return "ERROR_CODE_REMOTE_ERROR";
                case 1002:
                    return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                case 1003:
                    return "ERROR_CODE_TIMEOUT";
                case GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION /* 1004 */:
                    return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                default:
                    switch (i9) {
                        case 2000:
                            return "ERROR_CODE_IO_UNSPECIFIED";
                        case 2001:
                            return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                        case 2002:
                            return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                        case 2003:
                            return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                        case 2004:
                            return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                        case 2005:
                            return "ERROR_CODE_IO_FILE_NOT_FOUND";
                        case 2006:
                            return "ERROR_CODE_IO_NO_PERMISSION";
                        case 2007:
                            return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                        case 2008:
                            return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                        default:
                            switch (i9) {
                                case 3001:
                                    return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                case 3002:
                                    return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                case 3003:
                                    return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                case 3004:
                                    return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                default:
                                    switch (i9) {
                                        case 4001:
                                            return "ERROR_CODE_DECODER_INIT_FAILED";
                                        case 4002:
                                            return "ERROR_CODE_DECODER_QUERY_FAILED";
                                        case 4003:
                                            return "ERROR_CODE_DECODING_FAILED";
                                        case 4004:
                                            return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                        case 4005:
                                            return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                        default:
                                            switch (i9) {
                                                case 6000:
                                                    return "ERROR_CODE_DRM_UNSPECIFIED";
                                                case AdError.MEDIAVIEW_MISSING_ERROR_CODE /* 6001 */:
                                                    return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                                    return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                case 6003:
                                                    return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                case 6004:
                                                    return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                case 6005:
                                                    return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                case 6006:
                                                    return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                case 6007:
                                                    return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                case 6008:
                                                    return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                default:
                                                    if (i9 >= 1000000) {
                                                        return "custom error code";
                                                    }
                                                    return "invalid error code";
                                            }
                                    }
                            }
                    }
            }
        }
        return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }
}
