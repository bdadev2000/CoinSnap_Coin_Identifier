package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.image.thirdparty.JavaBlurProcess;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Ua, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1523Ua {
    public static String[] A00 = {"hdmHMjdsCvnnIiAm68nbzST5FT4P5mLb", "EH3LUmZxwOvThvXMHcswnn58jDASieiK", "ljU4lnctUqCxo644HWpRzVkau739AG18", "cf0wMMVzQ5eDMzw1G9WbfLTL5VaSUv", "l50byEuqIAJWTFcEqiPP3cq5SFvrKOhf", "BkuhnFfUhQO532vAuKLRONmm63PuLWNO", "lueSUxwI7577CW", "p49ZYnIXKwO4jtZLxoBrhqW2OVcn4ZYc"};
    public static final short[] A02 = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};
    public static final byte[] A01 = {9, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.CR, Ascii.SO, Ascii.SO, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.DLE, 17, 17, 17, 17, 17, 17, 17, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.DC4, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.NAK, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN};

    /* JADX WARN: Incorrect condition in loop: B:48:0x01bb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(int[] r42, int r43, int r44, int r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1523Ua.A00(int[], int, int, int, int, int, int):void");
    }

    public final Bitmap A02(Bitmap bitmap, float f9) {
        int w2 = bitmap.getWidth();
        int h6 = bitmap.getHeight();
        try {
            int[] iArr = new int[w2 * h6];
            bitmap.getPixels(iArr, 0, w2, 0, 0, w2, h6);
            int i9 = AbstractC1314Lz.A00;
            ArrayList arrayList = new ArrayList(i9);
            ArrayList<JavaBlurProcess.BlurTask> vertical = new ArrayList<>(i9);
            for (int i10 = 0; i10 < i9; i10++) {
                int h9 = h6;
                int cores = i10;
                arrayList.add(new CallableC1313Ly(iArr, w2, h9, (int) f9, i9, cores, 1));
                h6 = h9;
                int cores2 = i10;
                vertical.add(new CallableC1313Ly(iArr, w2, h6, (int) f9, i9, cores2, 2));
            }
            try {
                AbstractC1314Lz.A01.invokeAll(arrayList);
                try {
                    AbstractC1314Lz.A01.invokeAll(vertical);
                    try {
                        return Bitmap.createBitmap(iArr, w2, h6, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError unused) {
                        return null;
                    }
                } catch (InterruptedException unused2) {
                    return null;
                }
            } catch (InterruptedException unused3) {
                return null;
            }
        } catch (OutOfMemoryError unused4) {
            return null;
        }
    }
}
