package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import java.util.ArrayList;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class ZC implements AH {
    public static byte[] A04;
    public static String[] A05 = {"dOZBGOfLcl", "6uZ5xK6", "", "aWXZitIb3s7c1Spgern6jNUgdVKtVpLL", "irucub8L3DoxCd6BUALfs2", "TD", "6AS6vcfZrF", "uC"};
    public final int A00;
    public final long A01;
    public final Context A02;
    public final InterfaceC0439Bh<FrameworkMediaCrypto> A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{59, 26, 25, 30, 10, 19, 11, 45, 26, 17, 27, 26, 13, 26, 13, 12, 57, 30, 28, 11, 16, 13, 6, 44, 27, 27, 6, 27, 73, 0, 7, 26, 29, 8, 7, 29, 0, 8, 29, 0, 7, 14, 73, 47, 47, 4, 25, 12, 14, 73, 12, 17, 29, 12, 7, 26, 0, 6, 7, 103, 80, 80, 77, 80, 2, 75, 76, 81, 86, 67, 76, 86, 75, 67, 86, 75, 76, 69, 2, 100, 110, 99, 97, 2, 71, 90, 86, 71, 76, 81, 75, 77, 76, 46, 25, 25, 4, 25, 75, 2, 5, 24, 31, 10, 5, 31, 2, 10, 31, 2, 5, 12, 75, 36, 27, 30, 24, 75, 14, 19, 31, 14, 5, 24, 2, 4, 5, 51, 4, 4, 25, 4, 86, 31, 24, 5, 2, 23, 24, 2, 31, 23, 2, 31, 24, 17, 86, 32, 38, 79, 86, 19, 14, 2, 19, 24, 5, 31, 25, 24, 77, 110, 96, 101, 100, 101, 33, 71, 103, 108, 113, 100, 102, 64, 116, 101, 104, 110, 83, 100, 111, 101, 100, 115, 100, 115, 47, 27, 56, 54, 51, 50, 51, 119, 27, 62, 53, 49, 59, 54, 52, 22, 34, 51, 62, 56, 5, 50, 57, 51, 50, 37, 50, 37, 121, 41, 10, 4, 1, 0, 1, 69, 41, 12, 7, 10, 21, 16, 22, 36, 16, 1, 12, 10, 55, 0, 11, 1, 0, 23, 0, 23, 75, 85, 118, 120, 125, 124, 125, 57, 85, 112, 123, 111, 105, 97, 79, 112, 125, 124, 118, 75, 124, 119, 125, 124, 107, 124, 107, 55, 62, 50, 48, 115, 59, 60, 62, 56, Utf8.REPLACEMENT_BYTE, 50, 50, 54, 115, 60, 57, 46, 115, 52, 51, 41, 56, 47, 51, 60, 49, 115, 56, 37, 50, 45, 49, 60, 36, 56, 47, 111, 115, 56, 37, 41, 115, 59, 59, 48, 45, 56, 58, 115, 27, 59, 48, 45, 56, 58, 28, 40, 57, 52, 50, 15, 56, 51, 57, 56, 47, 56, 47, 94, 82, 80, 19, 91, 92, 94, 88, 95, 82, 82, 86, 19, 92, 89, 78, 19, 84, 83, 73, 88, 79, 83, 92, 81, 19, 88, 69, 82, 77, 81, 92, 68, 88, 79, 15, 19, 88, 69, 73, 19, 91, 81, 92, 94, 19, 113, 84, 95, 91, 81, 92, 94, 124, 72, 89, 84, 82, 111, 88, 83, 89, 88, 79, 88, 79, 96, 108, 110, 45, 101, 98, 96, 102, 97, 108, 108, 104, 45, 98, 103, 112, 45, 106, 109, 119, 102, 113, 109, 98, 111, 45, 102, 123, 108, 115, 111, 98, 122, 102, 113, 49, 45, 102, 123, 119, 45, 108, 115, 118, 112, 45, 79, 106, 97, 108, 115, 118, 112, 66, 118, 103, 106, 108, 81, 102, 109, 103, 102, 113, 102, 113, 21, 25, 27, 88, 16, 23, 21, 19, 20, 25, 25, 29, 88, 23, 18, 5, 88, 31, 24, 2, 19, 4, 24, 23, 26, 88, 19, 14, 25, 6, 26, 23, 15, 19, 4, 68, 88, 19, 14, 2, 88, 0, 6, 79, 88, 58, 31, 20, 0, 6, 14, 32, 31, 18, 19, 25, 36, 19, 24, 18, 19, 4, 19, 4};
    }

    static {
        A01();
    }

    public ZC(Context context) {
        this(context, 0);
    }

    public ZC(Context context, int i2) {
        this(context, null, i2, 5000L);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Deprecated
    public ZC(Context context, InterfaceC0439Bh<FrameworkMediaCrypto> interfaceC0439Bh, int i2, long j2) {
        this.A02 = context;
        this.A00 = i2;
        this.A01 = j2;
        this.A03 = interfaceC0439Bh;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A02(Context context, InterfaceC0439Bh<FrameworkMediaCrypto> interfaceC0439Bh, long j2, Handler handler, Ii ii, int extensionRendererIndex, ArrayList<ZA> arrayList) {
        Class<?> cls;
        Class<?> clazz;
        Class<?> clazz2;
        Class<?> clazz3;
        arrayList.add(new C3F(context, DR.A00, j2, interfaceC0439Bh, false, handler, ii, 50));
        if (extensionRendererIndex == 0) {
            return;
        }
        int extensionRendererIndex2 = arrayList.size();
        if (extensionRendererIndex == 2) {
            extensionRendererIndex2--;
            if (A05[3].charAt(6) != 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "tL";
            strArr[7] = "Fr";
        }
        try {
            try {
                cls = Class.forName(A00(469, 64, 50));
                clazz = Boolean.TYPE;
                clazz2 = Long.TYPE;
                clazz3 = Integer.TYPE;
            } catch (Exception e) {
                e = e;
            }
            try {
                arrayList.add(extensionRendererIndex2, (ZA) cls.getConstructor(clazz, clazz2, Handler.class, Ii.class, clazz3).newInstance(true, Long.valueOf(j2), handler, ii, 50));
                Log.i(A00(0, 23, 59), A00(243, 27, 93));
            } catch (Exception e2) {
                e = e2;
                throw new RuntimeException(A00(127, 33, 50), e);
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(1:7)|8|(2:9|10)|(2:11|12)|14|15|17|18|(3:19|20|(3:21|22|23))) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(1:7)|8|9|10|(2:11|12)|14|15|17|18|(3:19|20|(3:21|22|23))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        throw new java.lang.RuntimeException(A00(59, 34, 102), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A03(android.content.Context r15, com.instagram.common.viewpoint.core.InterfaceC0439Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> r16, com.instagram.common.viewpoint.core.InterfaceC0414Ag[] r17, android.os.Handler r18, com.instagram.common.viewpoint.core.InterfaceC0422Ao r19, int r20, java.util.ArrayList<com.instagram.common.viewpoint.core.ZA> r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.ZC.A03(android.content.Context, com.facebook.ads.redexgen.X.Bh, com.facebook.ads.redexgen.X.Ag[], android.os.Handler, com.facebook.ads.redexgen.X.Ao, int, java.util.ArrayList):void");
    }

    private final void A04(Context context, InterfaceC0487De interfaceC0487De, Looper looper, int i2, ArrayList<ZA> arrayList) {
        arrayList.add(new C6Z(interfaceC0487De, looper));
    }

    private final void A05(Context context, InterfaceC0543Fw interfaceC0543Fw, Looper looper, int i2, ArrayList<ZA> arrayList) {
        arrayList.add(new AnonymousClass66(interfaceC0543Fw, looper));
    }

    private final InterfaceC0414Ag[] A06() {
        return new InterfaceC0414Ag[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.instagram.common.viewpoint.core.AH
    public final ZA[] A57(Handler handler, Ii ii, InterfaceC0422Ao interfaceC0422Ao, InterfaceC0543Fw interfaceC0543Fw, InterfaceC0487De interfaceC0487De, InterfaceC0439Bh<FrameworkMediaCrypto> interfaceC0439Bh) {
        InterfaceC0439Bh<FrameworkMediaCrypto> interfaceC0439Bh2 = interfaceC0439Bh;
        if (interfaceC0439Bh2 == null) {
            interfaceC0439Bh2 = null;
        }
        ArrayList<ZA> arrayList = new ArrayList<>();
        A02(this.A02, interfaceC0439Bh2, this.A01, handler, ii, this.A00, arrayList);
        A03(this.A02, interfaceC0439Bh2, A06(), handler, interfaceC0422Ao, this.A00, arrayList);
        A05(this.A02, interfaceC0543Fw, handler.getLooper(), this.A00, arrayList);
        A04(this.A02, interfaceC0487De, handler.getLooper(), this.A00, arrayList);
        return (ZA[]) arrayList.toArray(new ZA[arrayList.size()]);
    }
}
