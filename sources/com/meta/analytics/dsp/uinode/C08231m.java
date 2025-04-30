package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.1m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C08231m extends C08382b {
    @Override // com.meta.analytics.dsp.uinode.C3S
    public final C08733k A08(View view, C08733k c08733k) {
        WindowInsets result = (WindowInsets) C08733k.A01(c08733k);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C08733k.A00(result);
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final C08733k A09(View view, C08733k c08733k) {
        WindowInsets result = (WindowInsets) C08733k.A01(c08733k);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C08733k.A00(result);
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final void A0F(View view, final C3D c3d) {
        if (c3d == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3R
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C08733k compatInsets = c3d.AAk(view2, C08733k.A00(windowInsets));
                    return (WindowInsets) C08733k.A01(compatInsets);
                }
            });
        }
    }
}
