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

/* loaded from: classes4.dex */
public class BaseView extends RelativeLayout {
    protected RelativeLayout a;

    /* renamed from: b, reason: collision with root package name */
    protected RelativeLayout f14250b;

    /* renamed from: c, reason: collision with root package name */
    protected RelativeLayout f14251c;

    /* renamed from: d, reason: collision with root package name */
    protected ImageView f14252d;

    /* renamed from: e, reason: collision with root package name */
    protected TextView f14253e;

    /* renamed from: f, reason: collision with root package name */
    protected ProgressBar f14254f;

    /* renamed from: g, reason: collision with root package name */
    protected FrameLayout f14255g;

    /* renamed from: h, reason: collision with root package name */
    protected LinearLayout f14256h;

    /* renamed from: i, reason: collision with root package name */
    protected RelativeLayout f14257i;
    public a style;

    /* loaded from: classes4.dex */
    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public BaseView(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(v.a(getContext(), "mbridge_nativex_fullbasescreen", TtmlNode.TAG_LAYOUT), this);
        this.f14257i = (RelativeLayout) inflate;
        if (inflate != null) {
            this.a = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f14250b = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f14251c = (RelativeLayout) inflate.findViewById(v.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f14252d = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f14253e = (TextView) inflate.findViewById(v.a(getContext(), "mbridge_full_tv_install", "id"));
            this.f14254f = (ProgressBar) inflate.findViewById(v.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f14255g = (FrameLayout) inflate.findViewById(v.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f14256h = (LinearLayout) inflate.findViewById(v.a(getContext(), "mbridge_full_animation_player", "id"));
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f14251c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f14252d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f14254f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f14250b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f14253e;
    }

    public a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f14255g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f14256h;
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }
}
