package com.meta.analytics.dsp.uinode;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class C8 extends AbstractC1612Xp<C5, AbstractC1073Br, C1157Fp> implements WL {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{-68, -43, -52, -33, -41, -52, -54, -37, -52, -53, -121, -53, -52, -54, -42, -53, -52, -121, -52, -39, -39, -42, -39};
    }

    public abstract InterfaceC1156Fo A0b(byte[] bArr, int i9, boolean z8) throws C1157Fp;

    public C8(String str) {
        super(new C5[2], new AbstractC1073Br[2]);
        this.A00 = str;
        A0Y(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6Q] */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1612Xp
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final C6Q A0V() {
        return new AbstractC1073Br(this) { // from class: com.facebook.ads.redexgen.X.6Q
            public final C8 A00;

            {
                this.A00 = this;
            }

            @Override // com.meta.analytics.dsp.uinode.AbstractC1073Br
            public final void A08() {
                this.A00.A0c(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1612Xp
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final C1157Fp A0W(C5 c52, AbstractC1073Br abstractC1073Br, boolean z8) {
        try {
            ByteBuffer inputData = c52.A01;
            abstractC1073Br.A09(((C1614Xr) c52).A00, A0b(inputData.array(), inputData.limit(), z8), c52.A00);
            abstractC1073Br.A01(Integer.MIN_VALUE);
            return null;
        } catch (C1157Fp e4) {
            return e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1612Xp
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final C1157Fp A0X(Throwable th) {
        return new C1157Fp(A0I(0, 23, 36), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC1612Xp
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C5 A0T() {
        return new C5();
    }

    public final void A0c(AbstractC1073Br abstractC1073Br) {
        super.A0a(abstractC1073Br);
    }

    @Override // com.meta.analytics.dsp.uinode.WL
    public final void AGB(long j7) {
    }
}
