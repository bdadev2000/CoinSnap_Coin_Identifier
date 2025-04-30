package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class E7 implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"trtHxdWfI8aUUasJnLCFOWNhTEgT5SfR", "ildDLLQ3Py5XZqRSamTTI6YoT50zpskF", "dVw5UxmZMKob3SUb3uvB6OES0lFAFJfM", "IR8fXYoB6j0jxnrkbU78JZ5o5XE94BNQ", "b3RCFjVWO3b8eRQaxF9", "jCTIeE11ZTJ65IoFy1xYkV7ELZ3vCqIN", "TgSfnKfrSSedvNLmmcoIbwvrw3BnVtDY", "eNW8IuS2yi6nO7dU30TIFIzk8f1M77f"};
    public final /* synthetic */ EG A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            int i13 = (copyOfRange[i12] ^ i11) ^ 26;
            if (A02[0].charAt(19) == 't') {
                throw new RuntimeException();
            }
            A02[6] = "Wfj4XOUJd4uRzIFmDg2tyEJWBqTNOatQ";
            copyOfRange[i12] = (byte) i13;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{76, 110, 121, 100, 98, 99, 45, 107, 100, 97, 104, 45, 97, 98, 108, 105, 100, 99, 106, 45, 107, 108, 100, 97, 104, 105, 35, Ascii.FF, 39, 63, 38, 36, 39, 41, 44, 5, 41, 38, 41, 47, 45, 58};
    }

    static {
        A01();
    }

    public E7(EG eg) {
        this.A00 = eg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DownloadAction[] actions;
        Handler handler;
        C1116Dw c1116Dw;
        DownloadAction.Deserializer[] deserializerArr;
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                c1116Dw = this.A00.A09;
                deserializerArr = this.A00.A0E;
                actions = c1116Dw.A03(deserializerArr);
            } catch (Throwable th) {
                Log.e(A00(27, 15, 82), A00(0, 27, 23), th);
                actions = new DownloadAction[0];
            }
            handler = this.A00.A07;
            handler.post(new E6(this, actions));
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
