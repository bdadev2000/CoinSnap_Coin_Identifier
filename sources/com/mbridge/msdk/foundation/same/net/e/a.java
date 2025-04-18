package com.mbridge.msdk.foundation.same.net.e;

/* loaded from: classes4.dex */
public final class a {
    public static String a(com.mbridge.msdk.foundation.same.net.a.a aVar) {
        int i10;
        if (aVar == null) {
            return "Network error,Load failed";
        }
        try {
            int i11 = aVar.a;
            com.mbridge.msdk.foundation.same.net.d.a aVar2 = aVar.f13365c;
            if (aVar2 != null) {
                i10 = aVar2.f13370d;
            } else {
                i10 = 0;
            }
            if (i11 != -2) {
                if (i11 != 15) {
                    if (i11 != 880023) {
                        if (i11 != 880041) {
                            switch (i11) {
                                case 1:
                                    return "Network error,Load failed";
                                case 2:
                                    return "Network error,I/O exception";
                                case 3:
                                    return "Network error,timeout exception";
                                case 4:
                                    return "Network unknown error";
                                case 5:
                                    return "Network error，https is not work,please check your phone time";
                                case 6:
                                    if (i10 != 0) {
                                        return "Network error,please check state code " + i10;
                                    }
                                    return "Network error,please check ";
                                case 7:
                                    if (i10 != 0) {
                                        return "The server returns an exception state code " + i10;
                                    }
                                    return "The server returns an exception ";
                                case 8:
                                    return "Cast exception, return data can not be casted correctly";
                                default:
                                    switch (i11) {
                                        case 10:
                                            return "Network error,socket timeout exception";
                                        case 11:
                                            return "Network error，sslp exception";
                                        case 12:
                                            return "Network error,ConnectException";
                                        case 13:
                                            if (aVar2 != null) {
                                                byte[] bArr = aVar2.a;
                                                if (bArr != null) {
                                                    return new String(bArr);
                                                }
                                                return "Socket exception message is NULL";
                                            }
                                            return "Unknown socket exception";
                                        default:
                                            return "Network error,unknown";
                                    }
                            }
                        }
                        return "Network error,UnknownHostException";
                    }
                    return "timeout";
                }
                return "Network error,I/O exception contents null";
            }
            return "Network is canceled";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "Network error,Load failed";
        }
    }
}
