package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;

/* loaded from: assets/audience_network.dex */
public final class FH extends AbstractC0958Ub<C1148ag> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public FH(C1148ag c1148ag) {
        super(c1148ag);
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C1070Yn c1070Yn;
        Handler handler;
        Runnable runnable;
        C1148ag A07 = A07();
        if (A07 == null) {
            return;
        }
        c1070Yn = A07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (M5.A02(c1070Yn)) {
            A07.A07();
            return;
        }
        handler = A07.A05;
        runnable = A07.A0C;
        handler.postDelayed(runnable, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }
}
