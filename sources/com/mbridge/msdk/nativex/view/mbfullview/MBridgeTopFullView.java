package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName().concat("WithResault");

    /* renamed from: j, reason: collision with root package name */
    protected ImageView f16847j;

    /* renamed from: k, reason: collision with root package name */
    protected TextView f16848k;
    protected TextView l;
    protected StarLevelLayoutView m;

    public MBridgeTopFullView(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(v.a(getContext(), "mbridge_nativex_fullscreen_top", TtmlNode.TAG_LAYOUT), this.f16844i);
        if (inflate != null) {
            this.f16847j = (ImageView) inflate.findViewById(v.a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f16848k = (TextView) inflate.findViewById(v.a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.l = (TextView) inflate.findViewById(v.a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.m = (StarLevelLayoutView) inflate.findViewById(v.a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.l.setTextColor(-7829368);
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f16847j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f16848k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.m;
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.f16837a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.b.setLayoutParams(layoutParams2);
    }
}
