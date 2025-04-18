package com.instagram.common.viewpoint.core;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Wk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0962Wk extends HT {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0962Wk A00(File file, HX hx) {
        String name = file.getName();
        if (!name.endsWith(A06(1, 7, 72))) {
            file = A05(file, hx);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A03.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        long length = file.length();
        String A0C = hx.A0C(Integer.parseInt(matcher.group(1)));
        if (A0C == null) {
            return null;
        }
        return new C0962Wk(A0C, Long.parseLong(matcher.group(2)), length, Long.parseLong(matcher.group(3)), file);
    }

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{60, 123, 35, 102, 123, 48, 45, 58, 69, 51, 53, 48, 50, 71, 53, 51, 71, Byte.MAX_VALUE, 48, 50, 71, 53, 51, 71, Byte.MAX_VALUE, 48, 50, 71, 53, 109, 42, 71, 53, 126, 99, 116, Utf8.REPLACEMENT_BYTE, 112, 6, 0, 5, 7, 114, 0, 6, 114, 74, 5, 7, 114, 0, 6, 114, 74, 5, 7, 114, 0, 88, 28, 114, 0, 75, 86, 65, 10, 99, 21, 97, 89, 22, 20, 97, 19, 21, 97, 89, 22, 20, 97, 19, 21, 97, 89, 22, 20, 97, 19, 75, 14, 97, 19, 88, 69, 82, 25};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(8, 29, 6), 32);
        A02 = Pattern.compile(A06(37, 29, 51), 32);
        A03 = Pattern.compile(A06(66, 30, 32), 32);
    }

    public C0962Wk(String str, long j2, long j3, long j4, File file) {
        super(str, j2, j3, j4, file);
    }

    public static C0962Wk A01(String str, long j2) {
        return new C0962Wk(str, j2, -1L, -9223372036854775807L, null);
    }

    public static C0962Wk A02(String str, long j2) {
        return new C0962Wk(str, j2, -1L, -9223372036854775807L, null);
    }

    public static C0962Wk A03(String str, long j2, long j3) {
        return new C0962Wk(str, j2, j3, -9223372036854775807L, null);
    }

    public static File A04(File file, int i2, long j2, long j3) {
        StringBuilder append = new StringBuilder().append(i2);
        String A06 = A06(0, 1, 15);
        return new File(file, append.append(A06).append(j2).append(A06).append(j3).append(A06(1, 7, 72)).toString());
    }

    public static File A05(File file, HX hx) {
        String filename;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            String filename2 = matcher.group(1);
            filename = IK.A0O(filename2);
            if (filename == null) {
                return null;
            }
        } else {
            matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            filename = matcher.group(1);
        }
        File parentFile = file.getParentFile();
        int A08 = hx.A08(filename);
        String filename3 = matcher.group(2);
        long parseLong = Long.parseLong(filename3);
        String filename4 = matcher.group(3);
        File A04 = A04(parentFile, A08, parseLong, Long.parseLong(filename4));
        if (file.renameTo(A04)) {
            return A04;
        }
        return null;
    }

    public final C0962Wk A08(int i2) {
        AbstractC0576Hf.A04(this.A05);
        long currentTimeMillis = System.currentTimeMillis();
        return new C0962Wk(this.A04, this.A02, this.A01, currentTimeMillis, A04(this.A03.getParentFile(), i2, this.A02, currentTimeMillis));
    }
}
