package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public class E8 implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ EG A00;
    public final /* synthetic */ DownloadAction[] A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Ascii.RS, 53, 45, 52, 54, 53, 59, 62, Ascii.ETB, 59, 52, 59, Base64.padSymbol, 63, 40, 105, 92, 75, 74, 80, 74, 77, 80, 87, 94, Ascii.EM, 88, 90, 77, 80, 86, 87, 74, Ascii.EM, 95, 88, 80, 85, 92, 93, Ascii.ETB};
    }

    public E8(EG eg2, DownloadAction[] downloadActionArr) {
        this.A00 = eg2;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0550Dw c0550Dw;
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                c0550Dw = this.A00.A09;
                c0550Dw.A02(this.A01);
            } catch (IOException e2) {
                Log.e(A00(0, 15, 36), A00(15, 26, 71), e2);
            }
        } catch (Throwable th2) {
            KL.A00(th2, this);
        }
    }
}
