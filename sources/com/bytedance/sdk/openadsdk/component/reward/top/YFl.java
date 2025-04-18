package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;

/* loaded from: classes.dex */
public interface YFl<T extends View> {
    void clickSkip();

    void clickSound();

    View getCloseButton();

    void setListener(Sg sg2);

    void setShowDislike(boolean z10);

    void setShowSkip(boolean z10);

    void setShowSound(boolean z10);

    void setSkipEnable(boolean z10);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z10);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
