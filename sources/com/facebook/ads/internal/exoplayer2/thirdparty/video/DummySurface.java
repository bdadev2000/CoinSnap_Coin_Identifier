package com.facebook.ads.internal.exoplayer2.thirdparty.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.redexgen.uinode.AbstractC0626Ha;
import com.facebook.ads.redexgen.uinode.IF;
import com.facebook.ads.redexgen.uinode.IL;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public boolean A00;
    public final boolean A01;
    public final IL A02;

    static {
        A04();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 73, 66, 81, 75, 86, 90, 81, 126, 124, 97, 122, 107, 109, 122, 107, 106, 81, 109, 97, 96, 122, 107, 96, 122, 9, Ascii.VT, 0, 19, 7, 4, Ascii.RS, 19, 63, 57, 62, 42, 45, 47, 41, 32, 41, 63, 63, 19, 47, 35, 34, 56, 41, 52, 56, 46, Ascii.NAK, 8, Ascii.SO, Ascii.VT, Ascii.VT, Ascii.DC4, 9, Ascii.SI, Ascii.RS, Ascii.US, 91, Ascii.VT, 9, Ascii.DC2, Ascii.DC4, 9, 91, Ascii.SI, Ascii.DC4, 91, 58, 43, 50, 91, Ascii.ETB, Ascii.RS, Ascii.CR, Ascii.RS, Ascii.ETB, 91, 74, 76, 51, 63, 90, 93, 94, 91, 19, Ascii.FS, Ascii.SYN, 0, Ascii.GS, Ascii.ESC, Ascii.SYN, 92, Ascii.SUB, 19, 0, Ascii.SYN, 5, 19, 0, Ascii.ETB, 92, 4, 0, 92, Ascii.SUB, Ascii.ESC, Ascii.NAK, Ascii.SUB, 45, 2, Ascii.ETB, 0, Ascii.DC4, Ascii.GS, 0, Ascii.US, 19, Ascii.FS, 17, Ascii.ETB, 117, 103, 107, 117, 115, 104, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static synchronized boolean A05(Context context) {
        boolean z10;
        synchronized (DummySurface.class) {
            z10 = true;
            if (!A04) {
                A03 = IF.A02 < 24 ? 0 : A00(context);
                A04 = true;
            }
            if (A03 == 0) {
                z10 = false;
            }
        }
        return z10;
    }

    public DummySurface(IL il, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.A02 = il;
        this.A01 = z10;
    }

    public static int A00(Context context) {
        String eglQueryString;
        if (IF.A02 < 26 && (A02(127, 7, 21).equals(IF.A05) || A02(85, 6, 120).equals(IF.A06))) {
            return 0;
        }
        if ((IF.A02 < 26 && !context.getPackageManager().hasSystemFeature(A02(91, 36, 97))) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains(A02(0, 25, 29))) {
            return 0;
        }
        if (eglQueryString.contains(A02(25, 27, 95))) {
            return 1;
        }
        return 2;
    }

    public static DummySurface A01(Context context, boolean z10) {
        A03();
        AbstractC0626Ha.A04(!z10 || A05(context));
        return new IL().A04(z10 ? A03 : 0);
    }

    public static void A03() {
        if (IF.A02 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(52, 33, 104));
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
