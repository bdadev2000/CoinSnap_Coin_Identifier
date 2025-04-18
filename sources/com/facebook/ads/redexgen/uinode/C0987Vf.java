package com.facebook.ads.redexgen.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0987Vf extends HO {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0987Vf A00(File file, HS hs) {
        String name = file.getName();
        if (!name.endsWith(A06(1, 7, 12))) {
            file = A05(file, hs);
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
        String A0C = hs.A0C(Integer.parseInt(matcher.group(1)));
        if (A0C == null) {
            return null;
        }
        return new C0987Vf(A0C, Long.parseLong(matcher.group(2)), length, Long.parseLong(matcher.group(3)), file);
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 9);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{64, 67, -117, 72, 67, 122, -115, -124, -96, 106, 112, 109, 107, -98, 112, 106, -98, -90, 109, 107, -98, 112, 106, -98, -90, 109, 107, -98, 112, -72, 115, -98, 112, -89, -70, -79, 102, -93, 109, 115, 112, 110, -95, 115, 109, -95, -87, 112, 110, -95, 115, 109, -95, -87, 112, 110, -95, 115, -69, 119, -95, 115, -86, -67, -76, 105, -107, 95, -109, -101, 98, 96, -109, 101, 95, -109, -101, 98, 96, -109, 101, 95, -109, -101, 98, 96, -109, 101, -83, 106, -109, 101, -100, -81, -90, 91};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(8, 29, 57), 32);
        A02 = Pattern.compile(A06(37, 29, 60), 32);
        A03 = Pattern.compile(A06(66, 30, 46), 32);
    }

    public C0987Vf(String str, long j3, long j10, long j11, File file) {
        super(str, j3, j10, j11, file);
    }

    public static C0987Vf A01(String str, long j3) {
        return new C0987Vf(str, j3, -1L, C.TIME_UNSET, null);
    }

    public static C0987Vf A02(String str, long j3) {
        return new C0987Vf(str, j3, -1L, C.TIME_UNSET, null);
    }

    public static C0987Vf A03(String str, long j3, long j10) {
        return new C0987Vf(str, j3, j10, C.TIME_UNSET, null);
    }

    public static File A04(File file, int i10, long j3, long j10) {
        StringBuilder append = new StringBuilder().append(i10);
        String A06 = A06(0, 1, 9);
        return new File(file, append.append(A06).append(j3).append(A06).append(j10).append(A06(1, 7, 12)).toString());
    }

    public static File A05(File file, HS hs) {
        String filename;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            String filename2 = matcher.group(1);
            filename = IF.A0O(filename2);
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
        int A08 = hs.A08(filename);
        String filename3 = matcher.group(2);
        long parseLong = Long.parseLong(filename3);
        String filename4 = matcher.group(3);
        File A04 = A04(parentFile, A08, parseLong, Long.parseLong(filename4));
        if (file.renameTo(A04)) {
            return A04;
        }
        return null;
    }

    public final C0987Vf A08(int i10) {
        AbstractC0626Ha.A04(this.A05);
        long currentTimeMillis = System.currentTimeMillis();
        return new C0987Vf(this.A04, this.A02, this.A01, currentTimeMillis, A04(this.A03.getParentFile(), i10, this.A02, currentTimeMillis));
    }
}
