package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.widget.a;

/* loaded from: classes3.dex */
public class MBridgeVastEndCardView extends MBridgeBaseView {
    private ViewGroup m;

    /* renamed from: n, reason: collision with root package name */
    private View f18920n;

    /* renamed from: o, reason: collision with root package name */
    private View f18921o;

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f18771e) {
            this.f18920n.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeVastEndCardView.this.notifyListener.a(104, "");
                }
            });
            this.f18921o.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.2
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
            this.f18769c.inflate(findLayout, this);
            this.m = (ViewGroup) findViewById(findID("mbridge_rl_content"));
            this.f18920n = findViewById(findID("mbridge_iv_vastclose"));
            View findViewById = findViewById(findID("mbridge_iv_vastok"));
            this.f18921o = findViewById;
            this.f18771e = isNotNULL(this.m, this.f18920n, findViewById);
            c();
            if (this.f18771e) {
                setMatchParent();
                setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.m.getLayoutParams()).addRule(13, -1);
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
