package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.redexgen.X.bm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1216bm implements C0B {
    public static byte[] A01;
    public static String[] A02 = {"0PvfoUFANCVNmnYZfPoejD6ohCtuxysE", "CTVBuEwwodohpQOP7b4j4", "9BgxiAbaVpMmFPJgyPUrG0VpyjL4diCu", "0p8mXLPxFyBv4phdqx8YrWMD1W9nJbZf", "G0yvPsPNC2vYmeMn8hYLEKyQ1tXXfhoe", "IW3zcZDApc8b2NyXBv", "Oqr2oLquorC4BSN9LXFNL8a9XNzmbM1Z", "n"};
    public static final String A03;
    public final ExecutorService A00 = Executors.newSingleThreadExecutor();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private long A02(List<File> list) {
        long j3 = 0;
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            j3 += it.next().length();
        }
        return j3;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 54);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{-104, -34, -25, -22, -104, -20, -22, -31, -27, -27, -31, -26, -33, -104, -37, -39, -37, -32, -35, -50, Ascii.ETB, 33, -50, Ascii.DC2, 19, Ascii.SUB, 19, 34, 19, Ascii.DC2, -50, Ascii.DLE, 19, 17, Ascii.SI, 35, 33, 19, -50, Ascii.ETB, 34, -50, 19, 38, 17, 19, 19, Ascii.DC2, 33, -50, 17, Ascii.SI, 17, Ascii.SYN, 19, -50, Ascii.SUB, Ascii.ETB, Ascii.ESC, Ascii.ETB, 34, -125, -95, -93, -88, -91, 96, -90, -87, -84, -91, 96, -10, 35, 35, 32, 35, -47, Ascii.NAK, Ascii.SYN, Ascii.GS, Ascii.SYN, 37, Ascii.SUB, Ascii.US, Ascii.CAN, -47, Ascii.ETB, Ascii.SUB, Ascii.GS, Ascii.SYN, -47};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A07(List<File> list) {
        long A022 = A02(list);
        int size = list.size();
        for (File file : list) {
            String[] strArr = A02;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "0WEexOrIiLXDlCjHBxNry1dxuPi8TFF2";
            strArr2[3] = "0ARlW4XVdH4TDXa7R7a2wpH1vFPRrHRN";
            if (!A08(file, A022, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    A022 -= length;
                    Log.i(A03, A03(61, 11, 10) + file + A03(19, 42, 120));
                } else {
                    Log.e(A03, A03(72, 20, 123) + file + A03(0, 19, 66));
                }
            }
        }
    }

    public abstract boolean A08(File file, long j3, int i10);

    static {
        A04();
        A03 = AbstractC1216bm.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(File file) throws IOException {
        C0E.A03(file);
        List<File> files = C0E.A01(file.getParentFile());
        A07(files);
    }

    @Override // com.facebook.ads.redexgen.uinode.C0B
    public void AGh(final File file) throws IOException {
        this.A00.submit(new Callable<Void>(file) { // from class: com.facebook.ads.redexgen.X.0F
            public final File A00;

            {
                this.A00 = file;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Void call() throws Exception {
                AbstractC1216bm.this.A06(this.A00);
                return null;
            }
        });
    }
}
