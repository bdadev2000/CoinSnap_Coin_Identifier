package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class H7 extends AbstractC1225cp<EnumC01680e> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public H7(String str) {
        super(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1225cp
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C0Y A04(EnumC01680e enumC01680e) {
        return new C0Y(this, enumC01680e == null ? A00(0, 4, Opcodes.FREM) : enumC01680e.A03());
    }
}
