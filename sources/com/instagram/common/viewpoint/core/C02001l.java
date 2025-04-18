package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.1l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02001l extends C02152a {
    @Override // com.instagram.common.viewpoint.core.C3S
    public final C02513k A08(View view, C02513k c02513k) {
        WindowInsets result = (WindowInsets) C02513k.A01(c02513k);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C02513k.A00(result);
    }

    @Override // com.instagram.common.viewpoint.core.C3S
    public final C02513k A09(View view, C02513k c02513k) {
        WindowInsets result = (WindowInsets) C02513k.A01(c02513k);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C02513k.A00(result);
    }

    @Override // com.instagram.common.viewpoint.core.C3S
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.instagram.common.viewpoint.core.C3S
    public final void A0F(View view, final C3D c3d) {
        if (c3d == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3R
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C02513k compatInsets = c3d.ABA(view2, C02513k.A00(windowInsets));
                    return (WindowInsets) C02513k.A01(compatInsets);
                }
            });
        }
    }
}
