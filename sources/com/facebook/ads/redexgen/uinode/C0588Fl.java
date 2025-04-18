package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0588Fl extends AbstractC1206bc<EnumC02240e> {
    public static byte[] A00;
    public static String[] A01 = {"nfOmdPRKy6dJXhDeozy3bec4eprLIoSQ", "SpNSu", "KnwtHm0RppTzgOMyhwsp1PpmZykcOlps", "rm2Q4", "VxhbZsLUCIIY3eK9iwu", "VDpaDUxovSHskE3K7Rzj9CiAPD6OjiUH", "VHZOT7bXdVoDaPP", "SrW2lLCi4fFkH4TY8LZz6iOiSZQwKo1F"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[5] = "VLAsB6FpgF6HHUeMgZV0uCFNDiYuOANh";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 46);
            i13++;
        }
    }

    public static void A01() {
        A00 = new byte[]{19, Ascii.SUB, 17, 17};
    }

    static {
        A01();
    }

    public C0588Fl(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1206bc
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C0Y A04(EnumC02240e enumC02240e) {
        String A02;
        if (enumC02240e != null) {
            A02 = enumC02240e.A02();
        } else {
            if (A01[0].charAt(24) == 'c') {
                throw new RuntimeException();
            }
            A01[2] = "FtIMifYPiEAUkOQozBm9Vw11LGuuRK56";
            A02 = A00(0, 4, 119);
        }
        return new C0Y(this, A02);
    }
}
