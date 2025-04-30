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
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class TopProxyLayout extends View implements zp<TopProxyLayout> {
    private zp<TopProxyLayout> zp;

    public TopProxyLayout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void COT() {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.COT();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void KS() {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.KS();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public View getITopLayout() {
        Object obj = this.zp;
        if (!(obj instanceof View)) {
            return null;
        }
        return (View) obj;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void jU() {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.jU();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void lMd() {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.lMd();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setListener(lMd lmd) {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.setListener(lmd);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setShowDislike(boolean z8) {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.setShowDislike(z8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setShowSkip(boolean z8) {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.setShowSkip(z8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setShowSound(boolean z8) {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.setShowSound(z8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setSkipEnable(boolean z8) {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.setSkipEnable(z8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setSkipText(CharSequence charSequence) {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setSoundMute(boolean z8) {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.setSoundMute(z8);
        }
    }

    public TopProxyLayout zp(boolean z8, @NonNull woN won) {
        TopLayoutDislike2 zp = new TopLayoutDislike2(getContext()).zp(z8, won);
        this.zp = zp;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            zp(zp, (ViewGroup) parent);
        }
        return this;
    }

    public TopProxyLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopProxyLayout(Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void zp(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
        if (view != null) {
            view.setId(vDp.mfu);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void zp(CharSequence charSequence, CharSequence charSequence2) {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.zp(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void zp() {
        zp<TopProxyLayout> zpVar = this.zp;
        if (zpVar != null) {
            zpVar.zp();
        }
    }
}
