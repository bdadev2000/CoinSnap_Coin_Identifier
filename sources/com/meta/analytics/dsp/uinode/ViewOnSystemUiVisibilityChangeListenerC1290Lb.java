package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* renamed from: com.facebook.ads.redexgen.X.Lb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewOnSystemUiVisibilityChangeListenerC1290Lb implements View.OnSystemUiVisibilityChangeListener {
    public int A00;
    public Window A01;
    public final View A03;
    public EnumC1289La A02 = EnumC1289La.A03;
    public final Runnable A04 = new C1526Ud(this);

    public ViewOnSystemUiVisibilityChangeListenerC1290Lb(View view) {
        this.A03 = view;
        view.setOnSystemUiVisibilityChangeListener(this);
    }

    private void A00(int i9, boolean z8) {
        Window window = this.A01;
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z8) {
            attributes.flags |= i9;
        } else {
            attributes.flags &= i9 ^ (-1);
        }
        this.A01.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(boolean z8) {
        if (EnumC1289La.A03.equals(this.A02)) {
            return;
        }
        int i9 = 3840;
        if (!z8) {
            i9 = 3840 | 7;
        }
        Handler handler = this.A03.getHandler();
        if (handler != null && z8) {
            handler.removeCallbacks(this.A04);
            handler.postDelayed(this.A04, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
        this.A03.setSystemUiVisibility(i9);
    }

    public final void A03() {
        this.A01 = null;
    }

    public final void A04(Window window) {
        this.A01 = window;
    }

    public final void A05(EnumC1289La enumC1289La) {
        this.A02 = enumC1289La;
        switch (LZ.A00[this.A02.ordinal()]) {
            case 1:
                A00(67108864, true);
                A00(134217728, true);
                A02(false);
                return;
            default:
                A00(67108864, false);
                A00(134217728, false);
                this.A03.setSystemUiVisibility(0);
                return;
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i9) {
        int diff = this.A00 ^ i9;
        this.A00 = i9;
        if ((diff & 2) != 0) {
            int diff2 = i9 & 2;
            if (diff2 == 0) {
                A02(true);
            }
        }
    }
}
