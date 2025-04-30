package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class SY {
    public static byte[] A03;
    public static String[] A04 = {"VT4fMDut957REDv81Zf67ZRXVgx5T5a8", CampaignEx.JSON_KEY_AD_R, "Z8Owoyb", "FnQ4OiwpcdZoDsiJ2m5WJ2Um26YCJsc9", "WRxJAxd2kL6ougEGyIG1Du6QramXeho", "YseYEaNGGUDDQ4eQqZOUPTvdjgKCIPcf", "c4hktFWkJWdy9he8EQ0DeAgF43U5wP0s", "DRA64HFd"};
    public BlockingDeque<SZ> A00;
    public final int A01;

    @Nullable
    public final String A02;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 104);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static String A05(List<Long> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            A09(sb, A00(it.next().longValue()));
        }
        return A03(sb.toString());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static String A07(Map<String, Object> map) {
        return new JSONObject(map).toString();
    }

    public static void A08() {
        A03 = new byte[]{92, 95, 94, 89, 88, 91, 90, 85, 84, 87, 86, 81, 80, 83, 82, 77, 76, 79, 78, 73, 72, 75, 74, 69, 68, 71, 124, Ascii.DEL, 126, 121, 120, 123, 122, 117, 116, 119, 118, 113, 112, 115, 114, 109, 108, 111, 110, 105, 104, 107, 106, 101, 100, 103, 45, 44, 47, 46, 41, 40, 43, 42, 37, 36, 54, 50, 48, 51, 33, 55, Ascii.SYN, 55, 62, 38, 51, 45, 123, 42, Ascii.CR, 57, 40, 37, 35, 57, 9, 54, 58, 40, 62, 61, 51, 58, 106, 111, 19, Ascii.ESC, Ascii.NAK, Ascii.SI, 47, 19, 9, Ascii.DC2, Ascii.CAN, 51, Ascii.DC2, Ascii.DEL, 101, 64, Ascii.DEL, 115, 97, 119, 116, 122, 115, 35, 38, 104, 123, 108, 109, 119, 113, 112, Ascii.SYN, 79, 8, Ascii.US, Ascii.US, 79, 87, 79, 62, 36, 55, 40, 50, 40, 53, 46, 40, 40, 41, 50, 32, 44, 53, 50, 46, 44, 61, 79, Ascii.DLE};
    }

    static {
        A08();
    }

    public SY(@Nullable String str) {
        this(str, 2000);
    }

    public SY(@Nullable String str, int i9) {
        this.A02 = str;
        this.A01 = i9;
        this.A00 = new LinkedBlockingDeque();
    }

    public static long A00(long j7) {
        return (j7 << 1) ^ (j7 >> 63);
    }

    public static long A01(List<SZ> list, int i9, int i10) {
        HashMap hashMap = new HashMap();
        for (int i11 = i9 + 1; i11 < i9 + i10; i11++) {
            long A032 = list.get(i11).A03();
            long A01 = list.get(i11).A01();
            if (hashMap.containsKey(Long.valueOf(A032))) {
                hashMap.put(Long.valueOf(A032), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A032))).intValue() + 1));
            } else {
                hashMap.put(Long.valueOf(A032), 1);
            }
            if (hashMap.containsKey(Long.valueOf(A01))) {
                hashMap.put(Long.valueOf(A01), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A01))).intValue() + 1));
            } else {
                Long valueOf = Long.valueOf(A01);
                int i12 = A04[2].length();
                if (i12 == 25) {
                    throw new RuntimeException();
                }
                String[] strArr = A04;
                strArr[6] = "1vNPfVBSY4dOMHCgW1yzfdLMrSn5bdwR";
                strArr[0] = "JWbjY4s0cXOj2VlFs0Pom5JqAlb5V7T0";
                hashMap.put(valueOf, 1);
            }
        }
        long j7 = 3333;
        int baseCountMax = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getValue()).intValue();
            if (baseCountMax < intValue) {
                baseCountMax = intValue;
                j7 = ((Long) entry.getKey()).longValue();
            }
        }
        for (int baseCountMax2 = i9 + 1; baseCountMax2 < i9 + i10; baseCountMax2++) {
            list.get(baseCountMax2).A09(list.get(baseCountMax2).A03() - j7);
            list.get(baseCountMax2).A07(list.get(baseCountMax2).A01() - j7);
            if (A04[7].length() == 7) {
                throw new RuntimeException();
            }
            A04[4] = "Qmxl";
        }
        return j7;
    }

    public static String A03(String str) {
        String A02 = A02(0, 64, 117);
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder p2 = new StringBuilder();
        int length = sb.length() % 3;
        if (length > 0) {
            while (length < 3) {
                String[] strArr = A04;
                if (strArr[6].charAt(27) != strArr[0].charAt(27)) {
                    throw new RuntimeException();
                }
                A04[2] = "LfiGB0y4";
                p2.append('=');
                sb.append((char) 0);
                length++;
            }
        }
        for (int n32 = 0; n32 < sb.length(); n32 += 3) {
            int charAt = (sb.charAt(n32) << 16) + (sb.charAt(n32 + 1) << '\b') + sb.charAt(n32 + 2);
            int n42 = (charAt >> 12) & 63;
            int n2 = (charAt >> 6) & 63;
            StringBuilder sb3 = sb2.append(A02.charAt((charAt >> 18) & 63));
            sb3.append(A02.charAt(n42)).append(A02.charAt(n2)).append(A02.charAt(charAt & 63));
        }
        StringBuilder r9 = new StringBuilder();
        String base64chars = sb2.substring(0, sb2.length() - p2.length());
        return r9.append(base64chars).append((Object) p2).toString();
    }

    @Nullable
    public static String A04(@Nullable List<SZ> list) {
        if (list == null) {
            return null;
        }
        return A06(list, 0, list.size(), false);
    }

    @Nullable
    public static String A06(@Nullable List<SZ> list, int i9, int i10, boolean z8) {
        if (list == null || list.isEmpty() || i9 < 0 || i9 >= list.size() || i10 <= 0 || i9 + i10 > list.size()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A02(73, 2, 35), list.get(i9).A05());
        hashMap.put(A02(115, 7, 118), 1);
        boolean z9 = false;
        boolean z10 = false;
        if (i10 > 1) {
            A0A(list, i9, i10);
            hashMap.put(A02(64, 9, 58), Long.valueOf(A01(list, i9, i10)));
            ArrayList arrayList = new ArrayList();
            List<Long> viewable50FrameTimestampList = new ArrayList<>();
            List<Long> audioFrameTimestampList = new ArrayList<>();
            for (int i11 = i9 + 1; i11 < i9 + i10; i11++) {
                arrayList.add(Long.valueOf(list.get(i11).A03()));
                arrayList.add(Long.valueOf(list.get(i11).A01()));
                arrayList.add(Long.valueOf(list.get(i11).A02()));
                viewable50FrameTimestampList.add(Long.valueOf(list.get(i11).A00()));
                if (list.get(i11).A00() != 0) {
                    z9 = true;
                }
                if (z8) {
                    audioFrameTimestampList.add(Long.valueOf(list.get(i11).A04()));
                    if (list.get(i11).A04() != 0) {
                        z10 = true;
                    }
                }
            }
            hashMap.put(A02(92, 2, 29), A05(arrayList));
            hashMap.put(A02(75, 6, 36), A05(viewable50FrameTimestampList));
            hashMap.put(A02(94, 9, 20), Boolean.valueOf(z9));
            if (z8) {
                hashMap.put(A02(81, 11, 55), A05(audioFrameTimestampList));
                hashMap.put(A02(103, 12, 126), Boolean.valueOf(z10));
            }
        }
        String A07 = A07(hashMap);
        if (A04[1].length() == 28) {
            throw new RuntimeException();
        }
        A04[2] = "";
        if (A07.length() > 900000) {
            return A02(122, 29, 5);
        }
        return A07;
    }

    public static void A09(StringBuilder sb, long j7) {
        while (j7 >= 128) {
            int b = 128 - 1;
            char c9 = (char) ((b & j7) | 128);
            j7 >>= 7;
            sb.append(c9);
        }
        int b8 = (int) j7;
        char c10 = (char) b8;
        String[] strArr = A04;
        String str = strArr[6];
        String str2 = strArr[0];
        int charAt = str.charAt(27);
        int b9 = str2.charAt(27);
        if (charAt != b9) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[6] = "TgLp8xzira9J3G7G7T0jqPUigov5tglm";
        strArr2[0] = "pcTwByMvDCDs4QWUJjAKPoIFXFV5AKB6";
        sb.append(c10);
    }

    public static void A0A(List<SZ> list, int i9, int i10) {
        long A00;
        for (int i11 = (i9 + i10) - 1; i11 > i9; i11--) {
            int i12 = i11 - 1;
            list.get(i11).A09(list.get(i11).A03() - list.get(i12).A03());
            int i13 = i11 - 1;
            list.get(i11).A07(list.get(i11).A01() - list.get(i13).A01());
            int i14 = i11 - 1;
            list.get(i11).A08(list.get(i11).A02() - list.get(i14).A02());
            SZ sz = list.get(i11);
            int i15 = i11 - 1;
            long j7 = 0;
            if (list.get(i15).A00() == -1) {
                A00 = 0;
            } else {
                int i16 = i11 - 1;
                A00 = list.get(i11).A00() - list.get(i16).A00();
            }
            sz.A06(A00);
            SZ sz2 = list.get(i11);
            int i17 = i11 - 1;
            if (list.get(i17).A04() != -1) {
                int i18 = i11 - 1;
                j7 = list.get(i11).A04() - list.get(i18).A04();
            }
            sz2.A0A(j7);
            list.get(i11).A08(list.get(i11).A02() - list.get(i11).A01());
        }
    }

    public final List<SZ> A0B() {
        ArrayList arrayList = new ArrayList();
        this.A00.drainTo(arrayList);
        return arrayList;
    }

    public final void A0C(SZ sz) {
        SZ peekLast = this.A00.peekLast();
        if (peekLast != null) {
            long A032 = peekLast.A03();
            if (A04[7].length() == 7) {
                throw new RuntimeException();
            }
            A04[1] = "fQhMIvl";
            if (A032 == sz.A03() && peekLast.A01() == sz.A01()) {
                return;
            }
        }
        this.A00.add(sz);
    }
}
