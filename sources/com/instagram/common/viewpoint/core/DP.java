package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class DP extends AbstractC1021Yu<DO, DM, C0541Fu> implements XQ {
    public static byte[] A01;
    public static String[] A02 = {"Y6iEYcT7zry5i7Oc3Z", "04pEmQzwcYeUfpdk9PqlLIcwm62m4", "Bed18TpTKJb5sLpTCdiGUSxVMjXfmE9e", "4Xs", "", "zUuia8YnRm0GUNbZhXhhg7iUMyzv7XkB", "vFzU3JWXjm0ZZYoWpiZ", "DhOBPQIIWrNpSVq3fDHAHYKNMWYv2IOx"};
    public final String A00;

    public static String A0I(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 73);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{60, 7, 12, 17, 25, 12, 10, 29, 12, 13, 73, 13, 12, 10, 6, 13, 12, 73, 12, 27, 27, 6, 27};
        String[] strArr = A02;
        if (strArr[3].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "1AT";
        strArr2[1] = "mPu6QXTRp9h4XliHh3A308dhTdRxx";
    }

    public abstract InterfaceC0540Ft A0b(byte[] bArr, int i2, boolean z2) throws C0541Fu;

    static {
        A0J();
    }

    public DP(String str) {
        super(new DO[2], new DM[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6T] */
    @Override // com.instagram.common.viewpoint.core.AbstractC1021Yu
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final C6T A0V() {
        return new DM(this) { // from class: com.facebook.ads.redexgen.X.6T
            public final DP A00;

            {
                this.A00 = this;
            }

            @Override // com.instagram.common.viewpoint.core.DM
            public final void A08() {
                this.A00.A0c(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1021Yu
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final C0541Fu A0W(DO r8, DM dm, boolean z2) {
        try {
            ByteBuffer inputData = r8.A01;
            dm.A09(((C1023Yw) r8).A00, A0b(inputData.array(), inputData.limit(), z2), r8.A00);
            dm.A01(Integer.MIN_VALUE);
            return null;
        } catch (C0541Fu e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1021Yu
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final C0541Fu A0X(Throwable th) {
        return new C0541Fu(A0I(0, 23, 32), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1021Yu
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final DO A0T() {
        return new DO();
    }

    public final void A0c(DM dm) {
        super.A0a(dm);
    }

    @Override // com.instagram.common.viewpoint.core.XQ
    public final void AGb(long j2) {
    }
}
