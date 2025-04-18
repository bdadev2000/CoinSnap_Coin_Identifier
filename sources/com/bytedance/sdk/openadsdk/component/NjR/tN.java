package com.bytedance.sdk.openadsdk.component.NjR;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.lG;
import com.bytedance.sdk.openadsdk.core.widget.rkt;

/* loaded from: classes.dex */
public abstract class tN extends com.bytedance.sdk.openadsdk.core.wN.DSW {
    PAGLogoView AlY;
    com.bytedance.sdk.openadsdk.core.wN.qsH DSW;
    lG NjR;
    com.bytedance.sdk.openadsdk.core.wN.tN Sg;
    com.bytedance.sdk.openadsdk.core.wN.AlY YFl;
    com.bytedance.sdk.openadsdk.core.widget.tN YoT;
    com.bytedance.sdk.openadsdk.core.wN.qsH eT;

    /* renamed from: nc, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.wN.qsH f10573nc;
    final DSW qsH;
    com.bytedance.sdk.openadsdk.core.wN.AlY tN;

    /* renamed from: vc, reason: collision with root package name */
    lG f10574vc;
    com.bytedance.sdk.openadsdk.core.wN.qsH wN;

    public tN(Context context) {
        super(context);
        this.qsH = new DSW(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.wN.AlY getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.AlY;
    }

    public abstract com.bytedance.sdk.openadsdk.core.wN.qsH getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.wN.AlY getBackImage() {
        return this.YFl;
    }

    public com.bytedance.sdk.openadsdk.core.wN.qsH getClickButton() {
        return this.wN;
    }

    public com.bytedance.sdk.openadsdk.core.wN.qsH getContent() {
        return this.eT;
    }

    public com.bytedance.sdk.openadsdk.core.widget.tN getDspAdChoice() {
        return this.YoT;
    }

    public lG getHostAppIcon() {
        return this.f10574vc;
    }

    public com.bytedance.sdk.openadsdk.core.wN.qsH getHostAppName() {
        return this.DSW;
    }

    public lG getIconOnlyView() {
        return this.NjR;
    }

    public com.bytedance.sdk.openadsdk.core.wN.AlY getImageView() {
        return this.tN;
    }

    public com.bytedance.sdk.openadsdk.core.wN.wN getOverlayLayout() {
        return null;
    }

    public abstract rkt getScoreBar();

    public com.bytedance.sdk.openadsdk.core.wN.qsH getTitle() {
        return this.f10573nc;
    }

    public View getTopDisLike() {
        DSW dsw = this.qsH;
        if (dsw != null) {
            return dsw.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.wN.AlY getTopSkip() {
        DSW dsw = this.qsH;
        if (dsw != null) {
            return dsw.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.wN.tN getVideoContainer() {
        return this.Sg;
    }
}
