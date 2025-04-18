package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class FO extends AbstractC1154am {
    public static byte[] A00;
    public static String[] A01 = {"d7tLiGkqyLa7cKOkED7RtvmpIXZH8d0b", "LmA4T64r6T9e", "1EBtOKlPck0twYp3ElEJQmg3d", "uhXcdOUibAChEZNBNQuPqKRIQ2", "Z", "LV0o53GlcsqgEYK9Pr4EwymnJShooL9b", "NLZosIPt4DzrQXhRsvqwWEHVFOTX5bDJ", "MQasnwh7q"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, 72, Ascii.FF, 69, 95, Ascii.FF, 66, 67, 88, Ascii.FF, 94, 73, 77, 72, 85, Ascii.FF, 67, 94, Ascii.FF, 77, 64, 94, 73, 77, 72, 85, Ascii.FF, 72, 69, 95, 92, 64, 77, 85, 73, 72, 56, 57, 48, Base64.padSymbol, 37};
    }

    static {
        A03();
    }

    public FO(C1070Yn c1070Yn, C02651u c02651u) {
        super(c1070Yn, c02651u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put(A00(36, 5, 104), String.valueOf(System.currentTimeMillis() - j3));
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
                new AsyncTaskC0883Re(this.A0B, extraData).execute(it.next());
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1154am
    public final void A0M() {
        C1188bK c1188bK = (C1188bK) this.A01;
        if (c1188bK.A0R()) {
            if (this.A06 != null) {
                this.A06.A0B(c1188bK);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 24));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1154am
    public final void A0O(InterfaceC02340p interfaceC02340p, C8S c8s, C8Q c8q, C02661v c02661v) {
        C1188bK c1188bK = (C1188bK) interfaceC02340p;
        long currentTimeMillis = System.currentTimeMillis();
        C1151aj c1151aj = new C1151aj(this, c02661v, c1188bK, currentTimeMillis, c8q);
        A0F().postDelayed(c1151aj, c8s.A05().A05());
        c1188bK.A0L(this.A0B, new C1150ai(this, c1151aj, currentTimeMillis, c8q), this.A08, c02661v, V2.A0K());
    }
}
