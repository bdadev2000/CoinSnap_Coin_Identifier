package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class FS extends AbstractC1739b5 implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"lNfLNH12lo092G91EOzeY1GmrD7sd3LT", "IfriMLumcJB6cDz8CdV53z8mw", "VqAXCxmiQObdbt99qEtF0Khtp", "Er74lg0w9IOdrBN2LYFe3VajafM65LKV", "PApxnlfYZYjRi2lMOUBi6X3WbwZz37rL", "HRTNeezFOCXWn2GXnxOdBfrunSk2O2aN", "VET24gqvkOE8n1LMNVzexbAvR8qySpIp", "2OknKa0ZFArae7oBhfBaswv35Z02O68Z"};
    public static final long serialVersionUID = 2751287062553772011L;

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{123, 108, 126, 104, 123, 109, 108, 109, 86, Ascii.DEL, 96, 109, 108, 102};
    }

    static {
        A04();
    }

    public FS(List<C1G> list) {
        super(list);
    }

    public static FS A02(JSONObject jSONObject, C1636Yn c1636Yn) {
        FS fs = new FS(AbstractC1739b5.A08(jSONObject, c1636Yn, new C1734b0()));
        fs.A16(jSONObject);
        fs.A0b(A03(0, 14, 8));
        return fs;
    }

    @Override // com.meta.analytics.dsp.uinode.C1F
    public final int A0F() {
        if (!A0i()) {
            if (A0x().A0D().A06() != null) {
                return 1;
            }
            return 0;
        }
        String[] strArr = A01;
        if (strArr[2].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A01[3] = "Avc54I4RohpfVXuEjhFSHVQISVBIYsCd";
        return 3;
    }

    @Override // com.meta.analytics.dsp.uinode.C1F
    public final int A0G() {
        return A0x().A0D().A04();
    }
}
