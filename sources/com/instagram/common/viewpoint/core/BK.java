package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class BK extends AbstractC0852Sd {
    public static byte[] A01;
    public static String[] A02 = {"QUZtp6d2PVvxohxxHBY0lFVIZrOHPJmP", "NfxzKLWElZxETrhEeUBSDM4deWBqLSti", "M1wrkGT1p8fg9I16hadPO98y5LyXX3HA", "lshWtPbnAXBsXbgnJLDmxkjrZI", "6PixpSZW8UzyowqAm", "UIpIdTluG2bhvKFOHpQ9k0cfwSXrRmCx", "lSmcWeUXMp1pu4geeqYJMaSrMHF509BD", "gheUZ0KSYWPh4kTG81LfbEHF2a7TTHcT"};
    public final /* synthetic */ PT A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[6].charAt(28) != '0') {
                throw new RuntimeException();
            }
            A02[6] = "QE45n4HEQOiTUZDVXPk8ylx4JLny0ok5";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 111);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{59, 44, 64, 62, 48};
    }

    static {
        A01();
    }

    public BK(PT pt) {
        this.A00 = pt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C9P c9p) {
        PS ps;
        JSONObject A03;
        ps = this.A00.A0B;
        A03 = this.A00.A03();
        ps.AE1(A00(0, 5, 92), A03);
    }
}
