package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public class BaseView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected RelativeLayout f16837a;
    protected RelativeLayout b;

    /* renamed from: c, reason: collision with root package name */
    protected RelativeLayout f16838c;

    /* renamed from: d, reason: collision with root package name */
    protected ImageView f16839d;

    /* renamed from: e, reason: collision with root package name */
    protected TextView f16840e;

    /* renamed from: f, reason: collision with root package name */
    protected ProgressBar f16841f;

    /* renamed from: g, reason: collision with root package name */
    protected FrameLayout f16842g;

    /* renamed from: h, reason: collision with root package name */
    protected LinearLayout f16843h;

    /* renamed from: i, reason: collision with root package name */
    protected RelativeLayout f16844i;
    public a style;

    /* loaded from: classes3.dex */
    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public BaseView(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(v.a(getContext(), "mbridge_nativex_fullbasescreen", TtmlNode.TAG_LAYOUT), this);
        this.f16844i = (RelativeLayout) inflate;
        if (inflate != null) {
            this.f16837a = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.b = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f16838c = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f16839d = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f16840e = (TextView) inflate.findViewById(v.a(getContext(), "mbridge_full_tv_install", "id"));
            this.f16841f = (ProgressBar) inflate.findViewById(v.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f16842g = (FrameLayout) inflate.findViewById(v.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f16843h = (LinearLayout) inflate.findViewById(v.a(getContext(), "mbridge_full_animation_player", "id"));
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f16838c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f16839d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f16841f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f16837a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f16840e;
    }

    public a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f16842g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f16843h;
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }
}
