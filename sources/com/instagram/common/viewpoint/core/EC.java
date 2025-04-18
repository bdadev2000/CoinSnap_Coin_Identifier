package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class EC implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ EL A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-54, -20, -3, -14, -8, -9, -87, -17, -14, -11, -18, -87, -11, -8, -22, -19, -14, -9, -16, -87, -17, -22, -14, -11, -18, -19, -73, -53, -10, -2, -11, -13, -10, -24, -21, -44, -24, -11, -24, -18, -20, -7};
    }

    public EC(EL el) {
        this.A00 = el;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DownloadAction[] actions;
        Handler handler;
        E1 e12;
        DownloadAction.Deserializer[] deserializerArr;
        if (KQ.A02(this)) {
            return;
        }
        try {
            try {
                e12 = this.A00.A09;
                deserializerArr = this.A00.A0E;
                actions = e12.A03(deserializerArr);
            } catch (Throwable th) {
                Log.e(A00(27, 15, 45), A00(0, 27, 47), th);
                actions = new DownloadAction[0];
            }
            handler = this.A00.A07;
            handler.post(new EB(this, actions));
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
