package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public abstract class MQ extends LinearLayout {
    public static int A00 = (int) (LP.A02 * 56.0f);

    public abstract void A05();

    public abstract void A06();

    public abstract void A07();

    public abstract void A08(float f2, int i2);

    public abstract void A09(C1O c1o, boolean z2);

    public abstract boolean A0A();

    public abstract View getDetailsContainer();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract MP getToolbarListener();

    public abstract void setAdReportingVisible(boolean z2);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC0909Ui viewOnClickListenerC0909Ui);

    public abstract void setFullscreen(boolean z2);

    public abstract void setPageDetails(C1Z c1z, String str, int i2, C01941f c01941f);

    public abstract void setPageDetailsVisible(boolean z2);

    public abstract void setProgress(float f2);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(MB mb);

    public abstract void setProgressImmediate(float f2);

    public abstract void setProgressSpinnerInvisible(boolean z2);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i2);

    public abstract void setToolbarListener(MP mp);

    public MQ(Context context) {
        super(context);
    }
}
