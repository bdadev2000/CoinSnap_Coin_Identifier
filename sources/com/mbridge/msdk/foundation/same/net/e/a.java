package com.mbridge.msdk.foundation.same.net.e;

/* loaded from: classes3.dex */
public final class a {
    public static String a(com.mbridge.msdk.foundation.same.net.a.a aVar) {
        int i9;
        if (aVar == null) {
            return "Network error,Load failed";
        }
        try {
            int i10 = aVar.f15773a;
            com.mbridge.msdk.foundation.same.net.d.a aVar2 = aVar.f15774c;
            if (aVar2 != null) {
                i9 = aVar2.f15781d;
            } else {
                i9 = 0;
            }
            if (i10 != -2) {
                if (i10 != 15) {
                    if (i10 != 880023) {
                        if (i10 != 880041) {
                            switch (i10) {
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
                                    if (i9 != 0) {
                                        return "Network error,please check state code " + i9;
                                    }
                                    return "Network error,please check ";
                                case 7:
                                    if (i9 != 0) {
                                        return "The server returns an exception state code " + i9;
                                    }
                                    return "The server returns an exception ";
                                case 8:
                                    return "Cast exception, return data can not be casted correctly";
                                default:
                                    switch (i10) {
                                        case 10:
                                            return "Network error,socket timeout exception";
                                        case 11:
                                            return "Network error，sslp exception";
                                        case 12:
                                            return "Network error,ConnectException";
                                        case 13:
                                            if (aVar2 != null) {
                                                byte[] bArr = aVar2.f15779a;
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
        } catch (Exception e4) {
            e4.printStackTrace();
            return "Network error,Load failed";
        }
    }
}
