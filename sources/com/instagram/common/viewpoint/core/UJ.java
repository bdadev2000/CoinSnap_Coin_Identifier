package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class UJ implements PS {
    public static byte[] A01;
    public static String[] A02 = {"6Ak70sx20HAu1BK2okLsJl8UIfFL7Thw", "WSdr2bwsModx8vqlXsCh2pEoV44R6fWS", "6pV", "IuCwGgbRSGcwid05Jmd", "uJw8pmawU", "I8uJtZilJAfxYDsx8vrQS9VBJj4oHqwc", "yyzynLMQXuMe1chn921CH2O0saed", "KEJISc72f74GCBhZaRDCVEoQGHcnATpn"};
    public final /* synthetic */ BO A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "LF603a9wKS17yr1vDnM";
            strArr2[4] = "LZWmWJ2r4";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ Opcodes.LREM);
            i5++;
        }
    }

    public static void A01() {
        byte[] bArr = {92, 64, 77, 85};
        String[] strArr = A02;
        if (strArr[7].charAt(3) == strArr[1].charAt(3)) {
            throw new RuntimeException();
        }
        A02[5] = "ka1vQ6UiXKbqG0foqwxWJkzjeHAuiIwi";
        A01 = bArr;
    }

    static {
        A01();
    }

    public UJ(BO bo) {
        this.A00 = bo;
    }

    @Override // com.instagram.common.viewpoint.core.PS
    public final void AE1(String str, JSONObject jSONObject) {
        C0772Pb c0772Pb;
        C1045Zs c1045Zs;
        C1045Zs c1045Zs2;
        if (str.equals(A00(0, 4, 93))) {
            this.A00.AGz();
            c1045Zs = this.A00.A07;
            if (C0608Im.A1p(c1045Zs)) {
                c1045Zs2 = this.A00.A07;
                c1045Zs2.A0A().ABh();
            }
        }
        c0772Pb = this.A00.A0F;
        if (A02[5].charAt(30) != 'w') {
            throw new RuntimeException();
        }
        A02[5] = "i1qJJe2Rv2sTY7cj85c4P5DDFviddUwN";
        c0772Pb.A0h(str, jSONObject);
    }
}
