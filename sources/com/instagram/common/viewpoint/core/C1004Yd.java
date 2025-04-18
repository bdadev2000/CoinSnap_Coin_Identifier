package com.instagram.common.viewpoint.core;

import com.google.firebase.FirebaseError;
import java.io.IOException;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Yd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1004Yd implements CH {
    public static String[] A01 = {"fkpDs3QrEIUPB2JazraUrlgdIiJXkDMl", "", "3HlyBddE8XVn9YWwOLwH4VSFJFUcfjL0", "3K9dx3znN2rHUAZqPmMaGO8Kk3HVHL", "ARHsMRyctUah9fFmcWsHvoxDV4Rlay", "5EW0ieNDx7VK4pqGb6z6bT1osScjQsM9", "btk6csKYz9h0JxqDm", "WpS6SBH9FSKJVaJoG3rUFILpStpx8zmr"};
    public final /* synthetic */ C1003Yc A00;

    public C1004Yd(C1003Yc c1003Yc) {
        this.A00 = c1003Yc;
    }

    public /* synthetic */ C1004Yd(C1003Yc c1003Yc, C1005Ye c1005Ye) {
        this(c1003Yc);
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final void A4O(int i2, int i3, InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        this.A00.A0K(i2, i3, interfaceC0456By);
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final void A5t(int i2) throws A0 {
        this.A00.A0I(i2);
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final void A65(int i2, double d) throws A0 {
        this.A00.A0J(i2, d);
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final int A7G(int i2) {
        switch (i2) {
            case Opcodes.LXOR /* 131 */:
            case Opcodes.L2I /* 136 */:
            case 155:
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.PUTSTATIC /* 179 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                if (A01[2].charAt(31) != '0') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "hOx4RvbcQ4rmRQD7lsU8LCRsUvEPJOMI";
                strArr[5] = "NE0o9u3qbPEpEKxTGS4cMUcBICbCHbMr";
                return 2;
            case Opcodes.I2F /* 134 */:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 2274716:
                return 3;
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.FRETURN /* 174 */:
            case Opcodes.INVOKESPECIAL /* 183 */:
            case Opcodes.NEW /* 187 */:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case Opcodes.PUTFIELD /* 181 */:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final void A9I(int i2, long j2) throws A0 {
        this.A00.A0L(i2, j2);
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final boolean A9V(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final void AGv(int i2, long j2, long j3) throws A0 {
        this.A00.A0M(i2, j2, j3);
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final void AH4(int i2, String str) throws A0 {
        this.A00.A0N(i2, str);
    }
}
