package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.Nullable;
import okio.Utf8;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: assets/audience_network.dex */
public final class T4 {
    public static byte[] A03;
    public static String[] A04 = {"nvoCYT5lXV50ozFrdUrQJCA6z0GvB", "", "jdLKha1Na7nbzs0Nk4YLOHAcdwecuvvy", "x", "dSWVRlyTiHf7svvh2WPzEDVR9b7sv5FM", "fWYFOffN0cZPNc3vcPN7ReiBLy1A48b", "e5JjNsryHusTZGAVeTKu2QwvoQvLupoE", "SBHDzKPIpiPnF71bMjezo2z0"};
    public BlockingDeque<T5> A00;
    public final int A01;

    @Nullable
    public final String A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 86);
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
        A03 = new byte[]{56, 59, 58, 61, 60, Utf8.REPLACEMENT_BYTE, 62, 49, 48, 51, 50, 53, 52, 55, 54, 41, 40, 43, 42, 45, 44, 47, 46, 33, 32, 35, 24, 27, 26, 29, 28, 31, 30, 17, 16, 19, 18, 21, 20, 23, 22, 9, 8, 11, 10, 13, 12, 15, 14, 1, 0, 3, 73, 72, 75, 74, 77, 76, 79, 78, 65, 64, 82, 86, 33, 34, 48, 38, 7, 38, 47, 55, 34, 112, 38, 107, 76, 120, 105, 100, 98, 84, 100, 91, 87, 69, 83, 80, 94, 87, 7, 2, 69, 77, 6, 28, 60, 0, 26, 1, 11, 32, 1, 17, 11, 46, 17, 29, 15, 25, 26, 20, 29, 77, 72, 124, 111, 120, 121, 99, 101, 100, 48, 105, 46, 57, 57, 105, 113, 105, 24, 2, 17, 14, 20, 14, 19, 8, 14, 14, 15, 20, 6, 10, 19, 20, 8, 10, 27, 105, 54};
    }

    static {
        A08();
    }

    public T4(@Nullable String str) {
        this(str, AdError.SERVER_ERROR_CODE);
    }

    public T4(@Nullable String str, int i2) {
        this.A02 = str;
        this.A01 = i2;
        this.A00 = new LinkedBlockingDeque();
    }

    public static long A00(long j2) {
        return (j2 << 1) ^ (j2 >> 63);
    }

    public static long A01(List<T5> list, int i2, int i3) {
        HashMap hashMap = new HashMap();
        for (int i4 = i2 + 1; i4 < i2 + i3; i4++) {
            long A032 = list.get(i4).A03();
            long A01 = list.get(i4).A01();
            if (hashMap.containsKey(Long.valueOf(A032))) {
                hashMap.put(Long.valueOf(A032), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A032))).intValue() + 1));
            } else {
                hashMap.put(Long.valueOf(A032), 1);
            }
            if (hashMap.containsKey(Long.valueOf(A01))) {
                hashMap.put(Long.valueOf(A01), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A01))).intValue() + 1));
            } else {
                hashMap.put(Long.valueOf(A01), 1);
            }
        }
        long j2 = 3333;
        int baseCountMax = 0;
        String[] strArr = A04;
        if (strArr[2].charAt(28) != strArr[6].charAt(28)) {
            throw new RuntimeException();
        }
        A04[1] = "";
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getValue()).intValue();
            if (baseCountMax < intValue) {
                baseCountMax = intValue;
                j2 = ((Long) entry.getKey()).longValue();
            }
        }
        for (int baseCountMax2 = i2 + 1; baseCountMax2 < i2 + i3; baseCountMax2++) {
            list.get(baseCountMax2).A09(list.get(baseCountMax2).A03() - j2);
            list.get(baseCountMax2).A07(list.get(baseCountMax2).A01() - j2);
        }
        return j2;
    }

    public static String A03(String str) {
        String A02 = A02(0, 64, 47);
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder p2 = new StringBuilder();
        int length = sb.length() % 3;
        if (length > 0) {
            while (length < 3) {
                p2.append(SignatureVisitor.INSTANCEOF);
                String[] strArr = A04;
                String str2 = strArr[7];
                String base64chars = strArr[3];
                if (str2.length() == base64chars.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[7] = "XxQGiDHDCrtvnrkU3l3PFftc";
                strArr2[3] = "L";
                sb.append((char) 0);
                length++;
            }
        }
        for (int n3 = 0; n3 < sb.length(); n3 += 3) {
            int charAt = (sb.charAt(n3) << 16) + (sb.charAt(n3 + 1) << '\b') + sb.charAt(n3 + 2);
            int n4 = (charAt >> 12) & 63;
            int n2 = (charAt >> 6) & 63;
            StringBuilder sb3 = sb2.append(A02.charAt((charAt >> 18) & 63));
            sb3.append(A02.charAt(n4)).append(A02.charAt(n2)).append(A02.charAt(charAt & 63));
        }
        StringBuilder r2 = new StringBuilder();
        String base64chars2 = sb2.substring(0, sb2.length() - p2.length());
        return r2.append(base64chars2).append((Object) p2).toString();
    }

    @Nullable
    public static String A04(@Nullable List<T5> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        if (A04[4].charAt(10) != 'f') {
            throw new RuntimeException();
        }
        A04[5] = "agnihNLFoXZD0MCg0BlXig325JHBk82";
        return A06(list, 0, size, false);
    }

    @Nullable
    public static String A06(@Nullable List<T5> list, int i2, int i3, boolean z2) {
        if (list == null || list.isEmpty() || i2 < 0 || i2 >= list.size() || i3 <= 0 || i2 + i3 > list.size()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A02(73, 2, 64), list.get(i2).A05());
        hashMap.put(A02(Opcodes.DREM, 7, 92), 1);
        boolean z3 = false;
        boolean z4 = false;
        if (i3 > 1) {
            A0A(list, i2, i3);
            hashMap.put(A02(64, 9, 21), Long.valueOf(A01(list, i2, i3)));
            ArrayList arrayList = new ArrayList();
            List<Long> viewable50FrameTimestampList = new ArrayList<>();
            List<Long> audioFrameTimestampList = new ArrayList<>();
            for (int i4 = i2 + 1; i4 < i2 + i3; i4++) {
                arrayList.add(Long.valueOf(list.get(i4).A03()));
                arrayList.add(Long.valueOf(list.get(i4).A01()));
                arrayList.add(Long.valueOf(list.get(i4).A02()));
                viewable50FrameTimestampList.add(Long.valueOf(list.get(i4).A00()));
                if (list.get(i4).A00() != 0) {
                    z3 = true;
                }
                if (z2) {
                    audioFrameTimestampList.add(Long.valueOf(list.get(i4).A04()));
                    if (list.get(i4).A04() != 0) {
                        z4 = true;
                    }
                }
            }
            hashMap.put(A02(92, 2, Opcodes.LNEG), A05(arrayList));
            hashMap.put(A02(75, 6, 91), A05(viewable50FrameTimestampList));
            hashMap.put(A02(94, 9, 57), Boolean.valueOf(z3));
            if (z2) {
                hashMap.put(A02(81, 11, 100), A05(audioFrameTimestampList));
                hashMap.put(A02(103, 12, 46), Boolean.valueOf(z4));
            }
        }
        String encodedFrameData = A07(hashMap);
        if (encodedFrameData.length() > 900000) {
            return A02(122, 29, 29);
        }
        return encodedFrameData;
    }

    public static void A09(StringBuilder sb, long j2) {
        while (j2 >= 128) {
            int b2 = 128 - 1;
            char c2 = (char) ((b2 & j2) | 128);
            j2 >>= 7;
            sb.append(c2);
        }
        int b3 = (int) j2;
        sb.append((char) b3);
    }

    public static void A0A(List<T5> list, int i2, int i3) {
        long A00;
        for (int i4 = (i2 + i3) - 1; i4 > i2; i4--) {
            int i5 = i4 - 1;
            list.get(i4).A09(list.get(i4).A03() - list.get(i5).A03());
            int i6 = i4 - 1;
            list.get(i4).A07(list.get(i4).A01() - list.get(i6).A01());
            int i7 = i4 - 1;
            list.get(i4).A08(list.get(i4).A02() - list.get(i7).A02());
            T5 t5 = list.get(i4);
            int i8 = i4 - 1;
            long j2 = 0;
            if (list.get(i8).A00() == -1) {
                A00 = 0;
            } else {
                int i9 = i4 - 1;
                A00 = list.get(i4).A00() - list.get(i9).A00();
            }
            t5.A06(A00);
            T5 t52 = list.get(i4);
            int i10 = i4 - 1;
            if (list.get(i10).A04() != -1) {
                int i11 = i4 - 1;
                j2 = list.get(i4).A04() - list.get(i11).A04();
            }
            t52.A0A(j2);
            list.get(i4).A08(list.get(i4).A02() - list.get(i4).A01());
        }
    }

    public final List<T5> A0B() {
        ArrayList arrayList = new ArrayList();
        this.A00.drainTo(arrayList);
        return arrayList;
    }

    public final void A0C(T5 t5) {
        T5 peekLast = this.A00.peekLast();
        if (peekLast != null) {
            long A032 = peekLast.A03();
            long A033 = t5.A03();
            if (A04[4].charAt(10) == 'f') {
                A04[1] = "";
                if (A032 == A033 && peekLast.A01() == t5.A01()) {
                    return;
                }
            }
            throw new RuntimeException();
        }
        this.A00.add(t5);
        if (A04[4].charAt(10) == 'f') {
            A04[0] = "kleFc3GTYdmSeGzzaJMmIvt997RVj";
            return;
        }
        throw new RuntimeException();
    }
}
