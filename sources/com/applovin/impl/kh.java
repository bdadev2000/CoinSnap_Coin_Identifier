package com.applovin.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.m2;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public class kh extends Exception implements m2 {

    /* renamed from: c, reason: collision with root package name */
    public static final m2.a f5709c = new ss(24);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5710b;

    public kh(Bundle bundle) {
        this(bundle.getString(b(2)), a(bundle), bundle.getInt(b(0), 1000), bundle.getLong(b(1), SystemClock.elapsedRealtime()));
    }

    public static String a(int i10) {
        if (i10 == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i10 == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        switch (i10) {
            case 1000:
                return "ERROR_CODE_UNSPECIFIED";
            case 1001:
                return "ERROR_CODE_REMOTE_ERROR";
            case 1002:
                return "ERROR_CODE_BEHIND_LIVE_WINDOW";
            case 1003:
                return "ERROR_CODE_TIMEOUT";
            case 1004:
                return "ERROR_CODE_FAILED_RUNTIME_CHECK";
            default:
                switch (i10) {
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
                        switch (i10) {
                            case 3001:
                                return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                            case 3002:
                                return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                            case 3003:
                                return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                            case 3004:
                                return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                            default:
                                switch (i10) {
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
                                        switch (i10) {
                                            case 6000:
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            case AdError.MEDIAVIEW_MISSING_ERROR_CODE /* 6001 */:
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
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
                                                return i10 >= 1000000 ? "custom error code" : "invalid error code";
                                        }
                                }
                        }
                }
        }
    }

    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    private static Throwable a(Class cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(b(3));
        String string2 = bundle.getString(b(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, kh.class.getClassLoader());
            Throwable a = Throwable.class.isAssignableFrom(cls) ? a(cls, string2) : null;
            if (a != null) {
                return a;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    public kh(String str, Throwable th2, int i10, long j3) {
        super(str, th2);
        this.a = i10;
        this.f5710b = j3;
    }

    public final String a() {
        return a(this.a);
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }
}
