package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class J2 extends Handler {
    public static byte[] A03;
    public static String[] A04 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final String A05;
    public final Context A00;
    public final AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final C0953Wb A02;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -13, -6, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, -31, -28, -1, -23, -28, -1, -21, -27, -7, 17, 18, 16, 29, 17, 3, 16, 20, 7, 1, 3, 29, 3, 22, 18, 16, -1, 17, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -48, -63, -56, -36, -45, -62, -49, -48, -58, -52, -53};
        if (A04[5].length() == 23) {
            throw new RuntimeException();
        }
        A04[5] = "AJ3";
        A03 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PackageManager packageManager;
        if (KQ.A02(this)) {
            return;
        }
        try {
            if (this.A01 == null || !this.A01.handleMessage(message)) {
                Messenger messenger = message.replyTo;
                if (message.what == 1) {
                    if (messenger != null) {
                        C0953Wb.A00().A07(2, null, A00(), messenger);
                        return;
                    }
                    return;
                }
                String string = message.getData().getString(A03(27, 13, 58));
                if (string == null) {
                    return;
                }
                C1045Zs A052 = C02925b.A05(this.A00, string);
                A052.A0E().AGR(message.getData().getBoolean(A03(6, 21, 22), false));
                String str = null;
                if (Build.VERSION.SDK_INT >= 21 && (packageManager = this.A00.getPackageManager()) != null) {
                    str = packageManager.getNameForUid(message.sendingUid);
                }
                if (str == null) {
                    if (messenger != null) {
                        C0953Wb.A00().A07(20, string, null, messenger);
                    }
                    A052.A0E().AFD();
                    return;
                }
                switch (message.what) {
                    case 1010:
                        if (messenger == null) {
                            return;
                        }
                        C0619Iz A042 = C0953Wb.A00().A04(string);
                        if (A042 == null) {
                            A042 = C0953Wb.A00().A05(string, messenger, str);
                        }
                        C1145bX A043 = C2J.A04(A052, message.getData(), str);
                        if (A042.A00 == null) {
                            A042.A00 = A01(A043, string);
                        } else if (A042.A00 instanceof C1149bb) {
                            ((C1149bb) A042.A00).A0G(A043.A0B(), A043.A07());
                        }
                        C0953Wb.A00().A07(1011, string, A00(), messenger);
                        return;
                    case 1012:
                    case AdError.CACHE_ERROR_CODE /* 2002 */:
                        C0953Wb.A00().A08(string);
                        return;
                    case AdError.SERVER_ERROR_CODE /* 2000 */:
                        if (messenger == null) {
                            return;
                        }
                        C0619Iz A044 = C0953Wb.A00().A04(string);
                        if (A044 == null) {
                            A044 = C0953Wb.A00().A05(string, messenger, str);
                        }
                        C1136bO A053 = C2J.A05(A052, message.getData(), str);
                        if (A044.A00 == null) {
                            A044.A00 = A02(A053, string);
                        } else if (A044.A00 instanceof C1146bY) {
                            ((C1146bY) A044.A00).A0J(A053.A05, A053.A02, A053.A08);
                        }
                        C0953Wb.A00().A07(AdError.INTERNAL_ERROR_CODE, string, A00(), messenger);
                        return;
                    case AdError.INTERNAL_ERROR_2003 /* 2003 */:
                        AnonymousClass22 A032 = C0953Wb.A00().A03(string);
                        if (A032 instanceof C1146bY) {
                            RewardData A01 = C2K.A01(message.getData());
                            C1146bY c1146bY = (C1146bY) A032;
                            if (A01 != null) {
                                c1146bY.A0I(A01);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }

    static {
        A04();
        A05 = J2.class.getSimpleName();
    }

    public J2(Context context, AudienceNetworkRemoteServiceApi.MessageHandler messageHandler) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A02 = C0953Wb.A00();
        this.A01 = messageHandler;
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(58, 23, 23), A03(0, 6, 92));
        bundle.putString(A03(40, 18, 88), new JSONObject().toString());
        return bundle;
    }

    private C1149bb A01(C1145bX c1145bX, String str) {
        C1149bb c1149bb = new C1149bb(c1145bX, this.A02, str);
        c1149bb.A0G(c1145bX.A0B(), c1145bX.A07());
        return c1149bb;
    }

    private C1146bY A02(C1136bO c1136bO, String str) {
        C1146bY c1146bY = new C1146bY(c1136bO, this.A02, str);
        c1146bY.A0J(c1136bO.A05, c1136bO.A02, c1136bO.A08);
        return c1146bY;
    }
}
