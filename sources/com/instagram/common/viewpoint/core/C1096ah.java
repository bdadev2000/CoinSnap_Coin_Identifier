package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ah, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1096ah extends AnonymousClass37 {
    public static String[] A01 = {"TEi6qE8rkCQGgGy4v7NzSxsVq0pzva7O", "YDOvw0rnr4UKw3Mnxoslotwc24p8", "a0zjiBNZeYiCSuvwyHtYeell8KyTQ5xY", "ogjV6WpDB35FLp8RKY", "WANqVRIVKxhPnPWopei7e1k0CZWy62T", "aZZWj5Yt51SqLR33GVZjsdPHZCc7cpWa", "7MlacYU9Pwo9bfliYZC3slRrct3tH7Ko", "0XE4m45s2Z74YdVCvJuFI2R02XTQtmXa"};
    public final C1095ag A00;

    public C1096ah(C1095ag c1095ag) {
        this.A00 = c1095ag;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass37
    public final void A08(View view, C02593s c02593s) {
        super.A08(view, c02593s);
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            AbstractC02804o layoutManager = this.A00.A01.getLayoutManager();
            if (A01[1].length() != 28) {
                throw new RuntimeException();
            }
            A01[4] = "lLG2rM4BR6TSMRI6WEis0bH1e3aTZeM";
            layoutManager.A1C(view, c02593s);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass37
    public final boolean A09(View view, int i2, Bundle bundle) {
        if (super.A09(view, i2, bundle)) {
            return true;
        }
        if (!this.A00.A0B() && this.A00.A01.getLayoutManager() != null) {
            return this.A00.A01.getLayoutManager().A1X(view, i2, bundle);
        }
        return false;
    }
}
