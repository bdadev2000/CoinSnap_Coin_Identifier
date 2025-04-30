package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;

/* loaded from: assets/audience_network.dex */
public final class FH extends AbstractC1524Ub<C1714ag> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public FH(C1714ag c1714ag) {
        super(c1714ag);
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C1636Yn c1636Yn;
        Handler handler;
        Runnable runnable;
        C1714ag A07 = A07();
        if (A07 == null) {
            return;
        }
        c1636Yn = A07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (M5.A02(c1636Yn)) {
            A07.A07();
            return;
        }
        handler = A07.A05;
        runnable = A07.A0C;
        handler.postDelayed(runnable, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }
}
