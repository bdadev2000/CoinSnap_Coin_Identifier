package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1675a2 extends AnonymousClass36 {
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass36
    public final View.AccessibilityDelegate A00(final AnonymousClass37 anonymousClass37) {
        return new View.AccessibilityDelegate() { // from class: com.facebook.ads.redexgen.X.34
            public static String[] A02 = {"5TXwkxGOky4JO26BdMoLZorZ75Qh7TJ1", "TGpCIVKfg9q9VkptB3w2PfFUtUXuMPxH", "XWnogg3sW", "LoblWG2nky8IldTW7marNA4rqywTihhk", "", "za5KD6H2U", "Ka0OyPk3mlOgfUpq6xId3QQILfS23GTN", "DN7QTk2L5QCC7wBdOwuQ1Nom6iZb"};

            @Override // android.view.View.AccessibilityDelegate
            public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return anonymousClass37.A05(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                C08833u provider = anonymousClass37.A01(view);
                if (provider != null) {
                    Object A022 = provider.A02();
                    String[] strArr = A02;
                    if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                        throw new RuntimeException();
                    }
                    A02[1] = "uCvPJ7NUfrK1Xmg35VTgFJzpSrozRbu2";
                    return (AccessibilityNodeProvider) A022;
                }
                return null;
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                anonymousClass37.A07(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                anonymousClass37.A08(view, C08813s.A01(accessibilityNodeInfo));
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                anonymousClass37.A03(view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return anonymousClass37.A06(viewGroup, view, accessibilityEvent);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final boolean performAccessibilityAction(View view, int i9, Bundle bundle) {
                return anonymousClass37.A09(view, i9, bundle);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEvent(View view, int i9) {
                anonymousClass37.A02(view, i9);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                anonymousClass37.A04(view, accessibilityEvent);
            }
        };
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass36
    public final C08833u A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C08833u(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass36
    public final boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i9, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i9, bundle);
    }
}
