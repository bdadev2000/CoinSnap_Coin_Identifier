package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.GA;

/* loaded from: classes.dex */
public class tN extends View implements YFl<tN> {
    private YFl<tN> YFl;

    public tN(Context context) {
        this(context, null);
    }

    public tN YFl(@NonNull Wwa wwa) {
        if (this.YFl != null) {
            return this;
        }
        TopLayoutDislike2 load = new TopLayoutDislike2(getContext()).load(wwa);
        this.YFl = load;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            YFl(load, (ViewGroup) parent);
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void clickSkip() {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void clickSound() {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.clickSound();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public View getCloseButton() {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            return yFl.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Object obj = this.YFl;
        if (!(obj instanceof View)) {
            return null;
        }
        return (View) obj;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setListener(Sg sg2) {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.setListener(sg2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setShowDislike(boolean z10) {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.setShowDislike(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setShowSkip(boolean z10) {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.setShowSkip(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setShowSound(boolean z10) {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.setShowSound(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setSkipEnable(boolean z10) {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.setSkipEnable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setSkipInvisiable() {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setSkipText(CharSequence charSequence) {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setSoundMute(boolean z10) {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void showCloseButton() {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void showCountDownText() {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.YFl
    public void showSkipButton() {
        YFl<tN> yFl = this.YFl;
        if (yFl != null) {
            yFl.showSkipButton();
        }
    }

    public tN(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public tN(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void YFl(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
        if (view != null) {
            view.setId(GA.VRF);
        }
    }
}
