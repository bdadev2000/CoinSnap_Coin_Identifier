package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentTransaction;

/* renamed from: com.facebook.ads.redexgen.X.Zz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1672Zz extends AnonymousClass37 {
    public static String[] A01 = {"qdMAGnvFuVn0ea0M3RnyzUUMgxm0S2Dt", "2PeyHnmE0bX58Ffgk0gx7OXrgxltyZLW", "2int", "nVrienaBQfkWnV6qIsNJmuY2fGTgVaBy", "EIAfoPo9YRxYx4hqHxVbjlkHHJjThpFm", "", "SPMlRY4DBSEQqdOiv1Q7wDslDeTbAa0F", "kfFOHzhabps7JVIWzUifit9US33gkwJk"};
    public final /* synthetic */ C08703h A00;

    public C1672Zz(C08703h c08703h) {
        this.A00 = c08703h;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A01() > 1;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass37
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C08703h.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A01());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass37
    public final void A08(View view, C08813s c08813s) {
        super.A08(view, c08813s);
        c08813s.A0O(C08703h.class.getName());
        c08813s.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            c08813s.A0N(4096);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            c08813s.A0N(FragmentTransaction.TRANSIT_EXIT_MASK);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass37
    public final boolean A09(View view, int i9, Bundle bundle) {
        if (super.A09(view, i9, bundle)) {
            return true;
        }
        switch (i9) {
            case 4096:
                if (!this.A00.canScrollHorizontally(1)) {
                    return false;
                }
                C08703h c08703h = this.A00;
                int i10 = c08703h.A00;
                String[] strArr = A01;
                if (strArr[3].charAt(13) != strArr[7].charAt(13)) {
                    throw new RuntimeException();
                }
                A01[4] = "Vr8sNFSEZwclN9wLDYuYxTMloU2ohTqa";
                c08703h.setCurrentItem(i10 + 1);
                return true;
            case FragmentTransaction.TRANSIT_EXIT_MASK /* 8192 */:
                if (!this.A00.canScrollHorizontally(-1)) {
                    return false;
                }
                C08703h c08703h2 = this.A00;
                c08703h2.setCurrentItem(c08703h2.A00 - 1);
                return true;
            default:
                return false;
        }
    }
}
