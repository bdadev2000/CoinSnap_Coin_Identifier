package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class FO extends AbstractC1720am {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, Ascii.FF, 69, 95, Ascii.FF, 66, 67, 88, Ascii.FF, 94, 73, 77, 72, 85, Ascii.FF, 67, 94, Ascii.FF, 77, 64, 94, 73, 77, 72, 85, Ascii.FF, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, 61, 37};
    }

    static {
        A03();
    }

    public FO(C1636Yn c1636Yn, C08311u c08311u) {
        super(c1636Yn, c08311u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j7) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j7));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls == null || trackingUrls.isEmpty()) {
            return;
        }
        Iterator<String> it = trackingUrls.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[0] = "jDIZMq7wlAdnEmkEGDRuOyHBIh8qxobs";
            if (hasNext) {
                new AsyncTaskC1449Re(this.A0B, extraData).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1720am
    public final void A0M() {
        C1754bK c1754bK = (C1754bK) this.A01;
        if (c1754bK.A0R()) {
            if (this.A06 != null) {
                this.A06.A0B(c1754bK);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1720am
    public final void A0O(InterfaceC08000p interfaceC08000p, C8S c8s, C8Q c8q, C08321v c08321v) {
        C1754bK c1754bK = (C1754bK) interfaceC08000p;
        long currentTimeMillis = System.currentTimeMillis();
        C1717aj c1717aj = new C1717aj(this, c08321v, c1754bK, currentTimeMillis, c8q);
        A0F().postDelayed(c1717aj, c8s.A05().A05());
        c1754bK.A0L(this.A0B, new C1716ai(this, c1717aj, currentTimeMillis, c8q), this.A08, c08321v, V2.A0K());
    }
}
