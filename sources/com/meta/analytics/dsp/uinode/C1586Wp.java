package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1586Wp implements D6 {
    public static String[] A05 = {"ZoOhGYHP8SNfCMTpI8hB8esJvCxQNk4a", "iCY0vtQk2BMTn8YKksXnllwhxYcEMWPa", "FRJmrfeKqiG8dvU06WzW6", "wyGcQq4l", "", "l2", "ODNaIWitniiqKmZchEPotBtPtmPon6SS", "r1S7VBlY5d2QYAsiLWImTDUS2fBhu4wR"};
    public final int A00;
    public final /* synthetic */ C1585Wo A04;
    public final C1216Hy A03 = new C1216Hy(new byte[5]);
    public final SparseArray<DD> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[SYNTHETIC] */
    @Override // com.meta.analytics.dsp.uinode.D6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4R(com.meta.analytics.dsp.uinode.C1217Hz r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1586Wp.A4R(com.facebook.ads.redexgen.X.Hz):void");
    }

    public C1586Wp(C1585Wo c1585Wo, int i9) {
        this.A04 = c1585Wo;
        this.A00 = i9;
    }

    private DA A00(C1217Hz c1217Hz, int i9) {
        long j7;
        long formatIdentifier;
        long j9;
        int A06 = c1217Hz.A06();
        int i10 = A06 + i9;
        int i11 = -1;
        String language = null;
        ArrayList arrayList = null;
        while (c1217Hz.A06() < i10) {
            int descriptorsStartPosition = c1217Hz.A0E();
            int positionOfNextDescriptor = c1217Hz.A06() + c1217Hz.A0E();
            if (descriptorsStartPosition == 5) {
                long A0M = c1217Hz.A0M();
                j7 = C1585Wo.A0F;
                if (A0M != j7) {
                    formatIdentifier = C1585Wo.A0G;
                    if (A05[0].charAt(13) == 108) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "OX";
                    strArr[4] = "";
                    if (A0M != formatIdentifier) {
                        j9 = C1585Wo.A0H;
                        if (A0M == j9) {
                            i11 = 36;
                        }
                    } else {
                        i11 = 135;
                    }
                } else {
                    i11 = 129;
                }
            } else if (descriptorsStartPosition == 106) {
                i11 = 129;
            } else if (descriptorsStartPosition == 122) {
                i11 = 135;
            } else if (descriptorsStartPosition == 123) {
                i11 = 138;
            } else if (descriptorsStartPosition == 10) {
                language = c1217Hz.A0S(3).trim();
            } else if (descriptorsStartPosition == 89) {
                i11 = 89;
                arrayList = new ArrayList();
                while (c1217Hz.A06() < positionOfNextDescriptor) {
                    String trim = c1217Hz.A0S(3).trim();
                    int A0E = c1217Hz.A0E();
                    byte[] bArr = new byte[4];
                    c1217Hz.A0c(bArr, 0, 4);
                    arrayList.add(new D9(trim, A0E, bArr));
                }
            }
            c1217Hz.A0Z(positionOfNextDescriptor - c1217Hz.A06());
        }
        c1217Hz.A0Y(i10);
        return new DA(i11, language, arrayList, Arrays.copyOfRange(c1217Hz.A00, A06, i10));
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A8q(IB ib, InterfaceC1076Bu interfaceC1076Bu, DC dc) {
    }
}
