package com.mbridge.msdk.e;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class a {
    public static int a(int i10, String str) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        try {
            if (TextUtils.isEmpty(str)) {
                return i10;
            }
            if (str.startsWith("errorCode: ") && str.length() > 16) {
                return Integer.parseInt(str.substring(11, 15));
            }
            if (str.equals("do not have sorceList")) {
                i22 = i10 + 600;
            } else {
                if (str.equals("Network error,UnknownHostException")) {
                    i21 = i10 + 600;
                } else {
                    if (str.equals("v3 is timeout")) {
                        i12 = i10 + 600;
                    } else {
                        if (!str.equals("Current unit is loading!") && !str.equals("current unit is loading")) {
                            if (str.equals("Network error,I/O exception response null")) {
                                i20 = i10 + 600;
                            } else {
                                if (str.equals("Network error,ConnectException")) {
                                    i19 = i10 + 600;
                                } else {
                                    if (str.equals("Network error,socket timeout exception")) {
                                        i18 = i10 + 600;
                                    } else {
                                        if (str.equals("Network error,disconnected network exception")) {
                                            i13 = i10 + 600;
                                        } else {
                                            if (str.equals("Network error,timeout exception")) {
                                                i17 = i10 + 600;
                                            } else {
                                                if (str.startsWith("Network error,please check state code")) {
                                                    i16 = i10 + 600;
                                                } else {
                                                    if (str.equals("Network error,I/O exception contents null")) {
                                                        i15 = i10 + 600;
                                                    } else {
                                                        if (str.equals("Network unknown error")) {
                                                            i14 = i10 + 600;
                                                        } else {
                                                            if (str.equals("Network error,I/O exception")) {
                                                                return i10 + 600 + 13;
                                                            }
                                                            if (str.equals("web env is not support")) {
                                                                return i10 + 600 + 14;
                                                            }
                                                            if (str.equals("Network error,unknown")) {
                                                                return i10 + 600 + 15;
                                                            }
                                                            if (str.equals("Network error，sslp exception")) {
                                                                return i10 + 600 + 16;
                                                            }
                                                            if (str.startsWith("Cast exception, return data")) {
                                                                return i10 + 600 + 17;
                                                            }
                                                            if (str.equals("REQUEST_TIMEOUT")) {
                                                                i22 = i10 + 700;
                                                            } else if (str.startsWith("The server returns an exception")) {
                                                                i21 = i10 + 700;
                                                            } else {
                                                                if (!str.equals("APP ALREADY INSTALLED") && !str.equals("Need show campaign list is NULL!")) {
                                                                    if (str.startsWith("load no ad")) {
                                                                        i11 = i10 + 700;
                                                                    } else if (str.equals("EXCEPTION_UNIT_NOT_FOUND_IN_APP")) {
                                                                        i20 = i10 + 700;
                                                                    } else if (str.equals("EXCEPTION_UNIT_BIDDING_TYPE_ERROR")) {
                                                                        i19 = i10 + 700;
                                                                    } else if (str.equals("No video campaign")) {
                                                                        i18 = i10 + 700;
                                                                    } else if (str.equals("EXCEPTION_RETURN_EMPTY")) {
                                                                        i13 = i10 + 700;
                                                                    } else if (str.equals("EXCEPTION_APP_PLATFORM_ERROR")) {
                                                                        i17 = i10 + 700;
                                                                    } else if (str.equals("EXCEPTION_SERVICE_REQUEST_OS_VERSION_REQUIRED")) {
                                                                        i16 = i10 + 700;
                                                                    } else if (str.equals("banner res load failed")) {
                                                                        i22 = i10 + 800;
                                                                    } else if (str.equals("resource load timeout is tpl: false")) {
                                                                        i21 = i10 + 800;
                                                                    } else if (str.startsWith("resource download failed")) {
                                                                        i12 = i10 + 800;
                                                                    } else if (str.equals("temp preload success but isReady false")) {
                                                                        i11 = i10 + 800;
                                                                    } else if (str.equals("temp resource download failed")) {
                                                                        i20 = i10 + 800;
                                                                    } else if (str.equals("tpl temp resource download failed")) {
                                                                        i19 = i10 + 800;
                                                                    } else if (str.equals("resource load timeout is tpl: true")) {
                                                                        i18 = i10 + 800;
                                                                    } else {
                                                                        if (!str.startsWith("https://") && !str.startsWith("http://")) {
                                                                            if (str.equals("mraid resource write fail")) {
                                                                                i17 = i10 + 800;
                                                                            } else if (str.startsWith("data save failed:")) {
                                                                                i16 = i10 + 800;
                                                                            } else if (str.equals("resource load timeout")) {
                                                                                i15 = i10 + 800;
                                                                            } else if (str.startsWith("tpl temp preload failed")) {
                                                                                i14 = i10 + 800;
                                                                            } else {
                                                                                return i10;
                                                                            }
                                                                        }
                                                                        i13 = i10 + 800;
                                                                    }
                                                                    return i11 + 4;
                                                                }
                                                                i12 = i10 + 700;
                                                            }
                                                        }
                                                        return i14 + 12;
                                                    }
                                                    return i15 + 11;
                                                }
                                                return i16 + 10;
                                            }
                                            return i17 + 9;
                                        }
                                        return i13 + 8;
                                    }
                                    return i18 + 7;
                                }
                                return i19 + 6;
                            }
                            return i20 + 5;
                        }
                        i11 = i10 + 600;
                        return i11 + 4;
                    }
                    return i12 + 3;
                }
                return i21 + 2;
            }
            return i22 + 1;
        } catch (Exception e2) {
            e2.printStackTrace();
            return i10;
        }
    }
}
