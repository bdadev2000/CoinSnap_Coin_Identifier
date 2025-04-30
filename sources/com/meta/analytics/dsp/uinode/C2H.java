package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.CacheFlag;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.2H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2H {
    public static byte[] A00;
    public static String[] A01 = {"clLZYsvE0tPy51tUZC4MogQduYykR52c", "lIEzMI1Fonr4PelfwTzyztQFsyVhf9Ip", "TKGJLfPNKEz49BEpN0NSVjcPCCgCyWSJ", "cZEnp34x0miDoRW1lF5qB", "MYtk66WDjwYbBfGksqsyV", "MltLsCEnY2PnyXwzhPgr0Wnj1nnS0bJG", "gkTktSSw1X1Dow6kMgw10RcVXUs", "ZuSWLm64POnoRfEkuKjWr8AtWtL"};
    public static final HashMap<String, CacheFlag> A02;
    public static final HashMap<CacheFlag, String> A03;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].charAt(22) != strArr[0].charAt(22)) {
                throw new RuntimeException();
            }
            A01[2] = "1oiMVSRbwOeIa0T6GP6G0j2MJvvTCWpD";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            byte b = copyOfRange[i12];
            if (A01[2].charAt(29) != 'W') {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "8xJh4rvE5fTdL3M0ChyhXfTHjjF";
            strArr2[7] = "i0rIhT0UpCtxGl53MOF2Fd5nLBk";
            copyOfRange[i12] = (byte) ((b ^ i11) ^ 96);
            i12++;
        }
    }

    public static void A03() {
        A00 = new byte[]{61, 54, 60, 48, 49, 116, 112, 124, 122, 120, 70, 71, 70, 77, 7, Ascii.FS, Ascii.EM, Ascii.FS, Ascii.GS, 5, Ascii.FS, 122, 101, 104, 105, 99};
    }

    static {
        A03();
        A03 = new HashMap<>();
        A02 = new HashMap<>();
        A04(CacheFlag.NONE, A00(10, 4, 72));
        A04(CacheFlag.ICON, A00(1, 4, 63));
        A04(CacheFlag.IMAGE, A00(5, 5, 125));
        A04(CacheFlag.VIDEO, A00(21, 5, 108));
    }

    public static String A01(EnumSet<CacheFlag> cacheFlags) {
        if (cacheFlags == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = cacheFlags.iterator();
        while (it.hasNext()) {
            String str = A03.get((CacheFlag) it.next());
            if (str == null) {
                str = A00(14, 7, 18);
            }
            sb.append(str).append(A00(0, 1, 113));
        }
        return sb.toString();
    }

    public static EnumSet<CacheFlag> A02(String str) {
        if (str == null) {
            return null;
        }
        EnumSet<CacheFlag> noneOf = EnumSet.noneOf(CacheFlag.class);
        for (String str2 : str.split(A00(0, 1, 113))) {
            noneOf.add(A02.get(str2));
        }
        return noneOf;
    }

    public static void A04(CacheFlag cacheFlag, String str) {
        A03.put(cacheFlag, str);
        A02.put(str, cacheFlag);
    }
}
