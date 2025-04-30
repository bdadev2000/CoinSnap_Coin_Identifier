package com.mbridge.msdk.e;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class a {
    public static int a(int i9, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return i9;
            }
            if (str.startsWith("errorCode: ") && str.length() > 16) {
                return Integer.parseInt(str.substring(11, 15));
            }
            if (str.equals("do not have sorceList")) {
                return i9 + 601;
            }
            if (str.equals("Network error,UnknownHostException")) {
                return i9 + 602;
            }
            if (str.equals("v3 is timeout")) {
                return i9 + 603;
            }
            if (!str.equals("Current unit is loading!") && !str.equals("current unit is loading")) {
                if (str.equals("Network error,I/O exception response null")) {
                    return i9 + 605;
                }
                if (str.equals("Network error,ConnectException")) {
                    return i9 + 606;
                }
                if (str.equals("Network error,socket timeout exception")) {
                    return i9 + 607;
                }
                if (str.equals("Network error,disconnected network exception")) {
                    return i9 + 608;
                }
                if (str.equals("Network error,timeout exception")) {
                    return i9 + 609;
                }
                if (str.startsWith("Network error,please check state code")) {
                    return i9 + 610;
                }
                if (str.equals("Network error,I/O exception contents null")) {
                    return i9 + 611;
                }
                if (str.equals("Network unknown error")) {
                    return i9 + 612;
                }
                if (str.equals("Network error,I/O exception")) {
                    return i9 + 613;
                }
                if (str.equals("web env is not support")) {
                    return i9 + 614;
                }
                if (str.equals("Network error,unknown")) {
                    return i9 + 615;
                }
                if (str.equals("Network error，sslp exception")) {
                    return i9 + 616;
                }
                if (str.startsWith("Cast exception, return data")) {
                    return i9 + 617;
                }
                if (str.equals("REQUEST_TIMEOUT")) {
                    return i9 + 701;
                }
                if (str.startsWith("The server returns an exception")) {
                    return i9 + 702;
                }
                if (!str.equals("APP ALREADY INSTALLED") && !str.equals("Need show campaign list is NULL!")) {
                    if (str.startsWith("load no ad")) {
                        return i9 + 704;
                    }
                    if (str.equals("EXCEPTION_UNIT_NOT_FOUND_IN_APP")) {
                        return i9 + 705;
                    }
                    if (str.equals("EXCEPTION_UNIT_BIDDING_TYPE_ERROR")) {
                        return i9 + 706;
                    }
                    if (str.equals("No video campaign")) {
                        return i9 + 707;
                    }
                    if (str.equals("EXCEPTION_RETURN_EMPTY")) {
                        return i9 + 708;
                    }
                    if (str.equals("EXCEPTION_APP_PLATFORM_ERROR")) {
                        return i9 + 709;
                    }
                    if (str.equals("EXCEPTION_SERVICE_REQUEST_OS_VERSION_REQUIRED")) {
                        return i9 + 710;
                    }
                    if (str.equals("banner res load failed")) {
                        return i9 + 801;
                    }
                    if (str.equals("resource load timeout is tpl: false")) {
                        return i9 + 802;
                    }
                    if (str.startsWith("resource download failed")) {
                        return i9 + 803;
                    }
                    if (str.equals("temp preload success but isReady false")) {
                        return i9 + 804;
                    }
                    if (str.equals("temp resource download failed")) {
                        return i9 + 805;
                    }
                    if (str.equals("tpl temp resource download failed")) {
                        return i9 + 806;
                    }
                    if (str.equals("resource load timeout is tpl: true")) {
                        return i9 + 807;
                    }
                    if (!str.startsWith("https://") && !str.startsWith("http://")) {
                        if (str.equals("mraid resource write fail")) {
                            return i9 + 809;
                        }
                        if (str.startsWith("data save failed:")) {
                            return i9 + 810;
                        }
                        if (str.equals("resource load timeout")) {
                            return i9 + 811;
                        }
                        if (str.startsWith("tpl temp preload failed")) {
                            return i9 + 812;
                        }
                        return i9;
                    }
                    return i9 + 808;
                }
                return i9 + 703;
            }
            return i9 + 604;
        } catch (Exception e4) {
            e4.printStackTrace();
            return i9;
        }
    }
}
