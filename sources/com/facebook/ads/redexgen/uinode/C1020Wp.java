package com.facebook.ads.redexgen.uinode;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1020Wp implements D6 {
    public static String[] A05 = {"ZoOhGYHP8SNfCMTpI8hB8esJvCxQNk4a", "iCY0vtQk2BMTn8YKksXnllwhxYcEMWPa", "FRJmrfeKqiG8dvU06WzW6", "wyGcQq4l", "", "l2", "ODNaIWitniiqKmZchEPotBtPtmPon6SS", "r1S7VBlY5d2QYAsiLWImTDUS2fBhu4wR"};
    public final int A00;
    public final /* synthetic */ C1019Wo A04;
    public final C0650Hy A03 = new C0650Hy(new byte[5]);
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
    @Override // com.facebook.ads.redexgen.uinode.D6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4R(com.facebook.ads.redexgen.uinode.C0651Hz r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1020Wp.A4R(com.facebook.ads.redexgen.X.Hz):void");
    }

    public C1020Wp(C1019Wo c1019Wo, int i10) {
        this.A04 = c1019Wo;
        this.A00 = i10;
    }

    private DA A00(C0651Hz c0651Hz, int i10) {
        long j3;
        long formatIdentifier;
        long j10;
        int A06 = c0651Hz.A06();
        int i11 = A06 + i10;
        int i12 = -1;
        String language = null;
        ArrayList arrayList = null;
        while (c0651Hz.A06() < i11) {
            int descriptorsStartPosition = c0651Hz.A0E();
            int positionOfNextDescriptor = c0651Hz.A06() + c0651Hz.A0E();
            if (descriptorsStartPosition == 5) {
                long A0M = c0651Hz.A0M();
                j3 = C1019Wo.A0F;
                if (A0M != j3) {
                    formatIdentifier = C1019Wo.A0G;
                    if (A05[0].charAt(13) == 108) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "OX";
                    strArr[4] = "";
                    if (A0M != formatIdentifier) {
                        j10 = C1019Wo.A0H;
                        if (A0M == j10) {
                            i12 = 36;
                        }
                    } else {
                        i12 = 135;
                    }
                } else {
                    i12 = 129;
                }
            } else if (descriptorsStartPosition == 106) {
                i12 = 129;
            } else if (descriptorsStartPosition == 122) {
                i12 = 135;
            } else if (descriptorsStartPosition == 123) {
                i12 = 138;
            } else if (descriptorsStartPosition == 10) {
                language = c0651Hz.A0S(3).trim();
            } else if (descriptorsStartPosition == 89) {
                i12 = 89;
                arrayList = new ArrayList();
                while (c0651Hz.A06() < positionOfNextDescriptor) {
                    String trim = c0651Hz.A0S(3).trim();
                    int A0E = c0651Hz.A0E();
                    byte[] bArr = new byte[4];
                    c0651Hz.A0c(bArr, 0, 4);
                    arrayList.add(new D9(trim, A0E, bArr));
                }
            }
            c0651Hz.A0Z(positionOfNextDescriptor - c0651Hz.A06());
        }
        c0651Hz.A0Y(i11);
        return new DA(i12, language, arrayList, Arrays.copyOfRange(c0651Hz.A00, A06, i11));
    }

    @Override // com.facebook.ads.redexgen.uinode.D6
    public final void A8q(IB ib2, InterfaceC0510Bu interfaceC0510Bu, DC dc2) {
    }
}
