package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1174Gh {
    public int A00;
    public final int A01;
    public final InterfaceC1173Gg[] A02;

    public C1174Gh(InterfaceC1173Gg... interfaceC1173GgArr) {
        this.A02 = interfaceC1173GgArr;
        this.A01 = interfaceC1173GgArr.length;
    }

    public final InterfaceC1173Gg A00(int i9) {
        return this.A02[i9];
    }

    public final InterfaceC1173Gg[] A01() {
        return (InterfaceC1173Gg[]) this.A02.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((C1174Gh) obj).A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }
}
