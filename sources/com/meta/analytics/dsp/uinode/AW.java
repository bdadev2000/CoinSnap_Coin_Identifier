package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class AW extends AbstractC1411Ps {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-78, -65, -65, -68, -65};
    }

    public AW(P3 p32) {
        this.A00 = p32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C1412Pt c1412Pt) {
        P2 p2;
        JSONObject A03;
        new Handler(Looper.getMainLooper()).post(new P1(this));
        p2 = this.A00.A0B;
        A03 = this.A00.A03();
        p2.ADY(A00(0, 5, 60), A03);
    }
}
