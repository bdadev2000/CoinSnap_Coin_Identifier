package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes4.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName().concat("WithResault");

    /* renamed from: j, reason: collision with root package name */
    protected ImageView f14260j;

    /* renamed from: k, reason: collision with root package name */
    protected TextView f14261k;

    /* renamed from: l, reason: collision with root package name */
    protected TextView f14262l;

    /* renamed from: m, reason: collision with root package name */
    protected StarLevelLayoutView f14263m;

    public MBridgeTopFullView(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(v.a(getContext(), "mbridge_nativex_fullscreen_top", TtmlNode.TAG_LAYOUT), this.f14257i);
        if (inflate != null) {
            this.f14260j = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f14261k = (TextView) inflate.findViewById(v.a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.f14262l = (TextView) inflate.findViewById(v.a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f14263m = (StarLevelLayoutView) inflate.findViewById(v.a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.f14262l.setTextColor(-7829368);
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.f14262l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f14260j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f14261k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f14263m;
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.f14250b.setLayoutParams(layoutParams2);
    }
}
