package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public abstract class MB extends LinearLayout {
    public static int A00 = (int) (LD.A02 * 56.0f);

    public abstract void A04();

    public abstract void A05();

    public abstract void A06(C1P c1p, boolean z8);

    public abstract boolean A07();

    public abstract View getDetailsContainer();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract MA getToolbarListener();

    public abstract void setAdReportingVisible(boolean z8);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC1508Tl viewOnClickListenerC1508Tl);

    public abstract void setFullscreen(boolean z8);

    public abstract void setPageDetails(C08111a c08111a, String str, int i9, C08171g c08171g);

    public abstract void setPageDetailsVisible(boolean z8);

    public abstract void setProgress(float f9);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(EnumC1311Lw enumC1311Lw);

    public abstract void setProgressImmediate(float f9);

    public abstract void setProgressSpinnerInvisible(boolean z8);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i9);

    public abstract void setToolbarListener(MA ma);

    public MB(Context context) {
        super(context);
    }
}
