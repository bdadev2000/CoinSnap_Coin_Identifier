package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.widget.a;

/* loaded from: classes4.dex */
public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f15968m;

    /* renamed from: n, reason: collision with root package name */
    private View f15969n;

    /* renamed from: o, reason: collision with root package name */
    private View f15970o;

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f15898e) {
            this.f15969n.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeVastEndCardView.this.notifyListener.a(104, "");
                }
            });
            this.f15970o.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.2
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view) {
                    MBridgeVastEndCardView mBridgeVastEndCardView = MBridgeVastEndCardView.this;
                    mBridgeVastEndCardView.notifyListener.a(108, mBridgeVastEndCardView.d());
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_vast");
        if (findLayout >= 0) {
            this.f15896c.inflate(findLayout, this);
            this.f15968m = (ViewGroup) findViewById(findID("mbridge_rl_content"));
            this.f15969n = findViewById(findID("mbridge_iv_vastclose"));
            View findViewById = findViewById(findID("mbridge_iv_vastok"));
            this.f15970o = findViewById;
            this.f15898e = isNotNULL(this.f15968m, this.f15969n, findViewById);
            c();
            if (this.f15898e) {
                setMatchParent();
                setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.f15968m.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    public void notifyShowListener() {
        this.notifyListener.a(111, "");
    }

    public void preLoadData(b bVar) {
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
