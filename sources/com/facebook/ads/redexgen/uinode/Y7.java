package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class Y7 implements AC {
    public static byte[] A04;
    public final int A00;
    public final long A01;
    public final Context A02;
    public final InterfaceC0492Bc<FrameworkMediaCrypto> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{113, 80, 83, 84, 64, 89, 65, 103, 80, 91, 81, 80, 71, 80, 71, 70, 115, 84, 86, 65, 90, 71, 76, Byte.MAX_VALUE, 72, 72, 85, 72, Ascii.SUB, 83, 84, 73, 78, 91, 84, 78, 83, 91, 78, 83, 84, 93, Ascii.SUB, 124, 124, 87, 74, 95, 93, Ascii.SUB, 95, 66, 78, 95, 84, 73, 83, 85, 84, 60, Ascii.VT, Ascii.VT, Ascii.SYN, Ascii.VT, 89, Ascii.DLE, Ascii.ETB, 10, Ascii.CR, Ascii.CAN, Ascii.ETB, Ascii.CR, Ascii.DLE, Ascii.CAN, Ascii.CR, Ascii.DLE, Ascii.ETB, Ascii.RS, 89, 63, 53, 56, 58, 89, Ascii.FS, 1, Ascii.CR, Ascii.FS, Ascii.ETB, 10, Ascii.DLE, Ascii.SYN, Ascii.ETB, 59, Ascii.FF, Ascii.FF, 17, Ascii.FF, 94, Ascii.ETB, Ascii.DLE, Ascii.CR, 10, Ascii.US, Ascii.DLE, 10, Ascii.ETB, Ascii.US, 10, Ascii.ETB, Ascii.DLE, Ascii.EM, 94, 49, Ascii.SO, Ascii.VT, Ascii.CR, 94, Ascii.ESC, 6, 10, Ascii.ESC, Ascii.DLE, Ascii.CR, Ascii.ETB, 17, Ascii.DLE, Ascii.CAN, 47, 47, 50, 47, 125, 52, 51, 46, 41, 60, 51, 41, 52, 60, 41, 52, 51, 58, 125, Ascii.VT, Ascii.CR, 100, 125, 56, 37, 41, 56, 51, 46, 52, 50, 51, 93, 126, 112, 117, 116, 117, 49, 87, 119, 124, 97, 116, 118, 80, 100, 117, 120, 126, 67, 116, Byte.MAX_VALUE, 117, 116, 99, 116, 99, 63, 81, 114, 124, 121, 120, 121, Base64.padSymbol, 81, 116, Byte.MAX_VALUE, 123, 113, 124, 126, 92, 104, 121, 116, 114, 79, 120, 115, 121, 120, 111, 120, 111, 51, 45, Ascii.SO, 0, 5, 4, 5, 65, 45, 8, 3, Ascii.SO, 17, Ascii.DC4, Ascii.DC2, 32, Ascii.DC4, 5, 8, Ascii.SO, 51, 4, Ascii.SI, 5, 4, 19, 4, 19, 79, 54, Ascii.NAK, Ascii.ESC, Ascii.RS, Ascii.US, Ascii.RS, 90, 54, 19, Ascii.CAN, Ascii.FF, 10, 2, 44, 19, Ascii.RS, Ascii.US, Ascii.NAK, 40, Ascii.US, Ascii.DC4, Ascii.RS, Ascii.US, 8, Ascii.US, 8, 84, 75, 71, 69, 6, 78, 73, 75, 77, 74, 71, 71, 67, 6, 73, 76, 91, 6, 65, 70, 92, 77, 90, 70, 73, 68, 6, 77, 80, 71, 88, 68, 73, 81, 77, 90, Ascii.SUB, 6, 77, 80, 92, 6, 78, 78, 69, 88, 77, 79, 6, 110, 78, 69, 88, 77, 79, 105, 93, 76, 65, 71, 122, 77, 70, 76, 77, 90, 77, 90, 84, 88, 90, Ascii.EM, 81, 86, 84, 82, 85, 88, 88, 92, Ascii.EM, 86, 83, 68, Ascii.EM, 94, 89, 67, 82, 69, 89, 86, 91, Ascii.EM, 82, 79, 88, 71, 91, 86, 78, 82, 69, 5, Ascii.EM, 82, 79, 67, Ascii.EM, 81, 91, 86, 84, Ascii.EM, 123, 94, 85, 81, 91, 86, 84, 118, 66, 83, 94, 88, 101, 82, 89, 83, 82, 69, 82, 69, 87, 91, 89, Ascii.SUB, 82, 85, 87, 81, 86, 91, 91, 95, Ascii.SUB, 85, 80, 71, Ascii.SUB, 93, 90, 64, 81, 70, 90, 85, 88, Ascii.SUB, 81, 76, 91, 68, 88, 85, 77, 81, 70, 6, Ascii.SUB, 81, 76, 64, Ascii.SUB, 91, 68, 65, 71, Ascii.SUB, 120, 93, 86, 91, 68, 65, 71, 117, 65, 80, 93, 91, 102, 81, 90, 80, 81, 70, 81, 70, 60, 48, 50, 113, 57, 62, 60, 58, Base64.padSymbol, 48, 48, 52, 113, 62, 59, 44, 113, 54, 49, 43, 58, 45, 49, 62, 51, 113, 58, 39, 48, 47, 51, 62, 38, 58, 45, 109, 113, 58, 39, 43, 113, 41, 47, 102, 113, 19, 54, Base64.padSymbol, 41, 47, 39, 9, 54, 59, 58, 48, Ascii.CR, 58, 49, 59, 58, 45, 58, 45};
    }

    public Y7(Context context) {
        this(context, 0);
    }

    public Y7(Context context, int i10) {
        this(context, null, i10, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Deprecated
    public Y7(Context context, InterfaceC0492Bc<FrameworkMediaCrypto> interfaceC0492Bc, int i10, long j3) {
        this.A02 = context;
        this.A00 = i10;
        this.A01 = j3;
        this.A03 = interfaceC0492Bc;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A02(Context context, InterfaceC0492Bc<FrameworkMediaCrypto> interfaceC0492Bc, long j3, Handler handler, InterfaceC0655Id interfaceC0655Id, int extensionRendererIndex, ArrayList<Y5> arrayList) {
        arrayList.add(new C3F(context, DM.A00, j3, interfaceC0492Bc, false, handler, interfaceC0655Id, 50));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                Class<?> cls = Class.forName(A00(469, 64, 11));
                Class<?> clazz = Boolean.TYPE;
                Class<?> clazz2 = Long.TYPE;
                Class<?> clazz3 = Integer.TYPE;
                try {
                    arrayList.add(size, (Y5) cls.getConstructor(clazz, clazz2, Handler.class, InterfaceC0655Id.class, clazz3).newInstance(true, Long.valueOf(j3), handler, interfaceC0655Id, 50));
                    Log.i(A00(0, 23, 97), A00(243, 27, 46));
                } catch (Exception e2) {
                    e = e2;
                    throw new RuntimeException(A00(127, 33, 9), e);
                }
            } catch (ClassNotFoundException unused) {
            }
        } catch (Exception e10) {
            e = e10;
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
    
        throw new java.lang.RuntimeException(A00(59, 34, 45), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A03(android.content.Context r15, com.facebook.ads.redexgen.uinode.InterfaceC0492Bc<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> r16, com.facebook.ads.redexgen.uinode.InterfaceC0465Ab[] r17, android.os.Handler r18, com.facebook.ads.redexgen.uinode.InterfaceC0473Aj r19, int r20, java.util.ArrayList<com.facebook.ads.redexgen.uinode.Y5> r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.Y7.A03(android.content.Context, com.facebook.ads.redexgen.X.Bc, com.facebook.ads.redexgen.X.Ab[], android.os.Handler, com.facebook.ads.redexgen.X.Aj, int, java.util.ArrayList):void");
    }

    private final void A04(Context context, DZ dz, Looper looper, int i10, ArrayList<Y5> arrayList) {
        arrayList.add(new C6W(dz, looper));
    }

    private final void A05(Context context, InterfaceC0593Fr interfaceC0593Fr, Looper looper, int i10, ArrayList<Y5> arrayList) {
        arrayList.add(new AnonymousClass63(interfaceC0593Fr, looper));
    }

    private final InterfaceC0465Ab[] A06() {
        return new InterfaceC0465Ab[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.uinode.AC
    public final Y5[] A4l(Handler handler, InterfaceC0655Id interfaceC0655Id, InterfaceC0473Aj interfaceC0473Aj, InterfaceC0593Fr interfaceC0593Fr, DZ dz, InterfaceC0492Bc<FrameworkMediaCrypto> interfaceC0492Bc) {
        InterfaceC0492Bc<FrameworkMediaCrypto> interfaceC0492Bc2 = interfaceC0492Bc;
        if (interfaceC0492Bc2 == null) {
            interfaceC0492Bc2 = null;
        }
        ArrayList<Y5> arrayList = new ArrayList<>();
        A02(this.A02, interfaceC0492Bc2, this.A01, handler, interfaceC0655Id, this.A00, arrayList);
        A03(this.A02, interfaceC0492Bc2, A06(), handler, interfaceC0473Aj, this.A00, arrayList);
        A05(this.A02, interfaceC0593Fr, handler.getLooper(), this.A00, arrayList);
        A04(this.A02, dz, handler.getLooper(), this.A00, arrayList);
        return (Y5[]) arrayList.toArray(new Y5[arrayList.size()]);
    }
}
