package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.UZM;
import i5.a;

/* loaded from: classes.dex */
public class eT extends com.bytedance.sdk.openadsdk.core.wN.tN {
    private Runnable AlY;
    private int DSW;
    private int Sg;
    protected nc YFl;
    private long tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.wN.AlY f10562vc;
    private Runnable wN;

    public eT(@NonNull Context context) {
        super(context);
        this.tN = 10L;
        this.DSW = 1;
        tN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Sg(int i10) {
        nc ncVar = this.YFl;
        if (ncVar != null) {
            ncVar.YFl(i10);
        }
        if (i10 == 100) {
            Sg();
        }
    }

    private void tN() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tN(configuration.orientation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.AlY;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.AlY = null;
        }
    }

    private void tN(int i10) {
        if (this.DSW != i10) {
            this.DSW = i10;
            com.bytedance.sdk.openadsdk.core.wN.AlY alY = this.f10562vc;
            if (alY != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) alY.getLayoutParams();
                if (this.DSW == 1) {
                    marginLayoutParams.width = GS.tN(getContext(), 64.0f);
                    marginLayoutParams.height = GS.tN(getContext(), 24.0f);
                    marginLayoutParams.bottomMargin = GS.tN(getContext(), 60.0f);
                } else {
                    marginLayoutParams.width = GS.tN(getContext(), 41.0f);
                    marginLayoutParams.height = GS.tN(getContext(), 15.0f);
                    marginLayoutParams.bottomMargin = GS.tN(getContext(), 24.0f);
                }
                this.f10562vc.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public void YFl(final Wwa wwa) {
        com.bytedance.sdk.openadsdk.core.model.lG NjR;
        if (wwa != null && (NjR = wwa.NjR()) != null) {
            this.tN = NjR.YFl();
        }
        nc ncVar = new nc(getContext());
        this.YFl = ncVar;
        View YFl = ncVar.YFl();
        if (YFl.getParent() instanceof ViewGroup) {
            ((ViewGroup) YFl.getParent()).removeView(YFl);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        YFl.setLayoutParams(layoutParams);
        if (wwa != null) {
            boolean iY = wwa.iY();
            com.bytedance.sdk.openadsdk.core.widget.lG Sg = this.YFl.Sg();
            if (Sg != null) {
                if (iY) {
                    Sg.setVisibility(8);
                } else {
                    com.bytedance.sdk.openadsdk.core.model.EH dGX = (wwa.dGX() == null || TextUtils.isEmpty(wwa.dGX().YFl())) ? null : wwa.dGX();
                    if (dGX != null && !TextUtils.isEmpty(dGX.YFl())) {
                        try {
                            com.bytedance.sdk.openadsdk.NjR.AlY.YFl(dGX).YFl(new com.bytedance.sdk.openadsdk.NjR.Sg(wwa, dGX.YFl(), new UZM(Sg)));
                        } catch (Throwable unused) {
                        }
                    }
                    Sg.setVisibility(8);
                }
            }
            com.bytedance.sdk.openadsdk.core.wN.qsH tN = this.YFl.tN();
            if (tN != null) {
                if (iY) {
                    tN.setText("Loading");
                } else if (!TextUtils.isEmpty(wwa.Hjb())) {
                    tN.setText(wwa.Hjb());
                } else {
                    tN.setVisibility(8);
                }
            }
        }
        addView(YFl);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(getContext());
        this.f10562vc = alY;
        alY.setImageDrawable(qO.tN(getContext(), "tt_ad_logo_big"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(GS.tN(getContext(), 64.0f), GS.tN(getContext(), 24.0f));
        layoutParams2.bottomMargin = GS.tN(getContext(), 60.0f);
        layoutParams2.gravity = 81;
        this.f10562vc.setLayoutParams(layoutParams2);
        addView(this.f10562vc);
        this.f10562vc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.eT.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = eT.this.getContext();
                Wwa wwa2 = wwa;
                TTWebsiteActivity.YFl(context, wwa2, Sco.YFl(wwa2));
            }
        });
        tN(getResources().getConfiguration().orientation);
    }

    public void Sg() {
        this.Sg = 0;
        nc ncVar = this.YFl;
        if (ncVar != null) {
            removeView(ncVar.YFl);
            this.YFl.AlY();
        }
        setVisibility(8);
        this.YFl = null;
        Runnable runnable = this.AlY;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.wN;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.wN = null;
        this.AlY = null;
    }

    public void YFl() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.eT.2
            @Override // java.lang.Runnable
            public void run() {
                eT eTVar = eT.this;
                if (eTVar.YFl != null) {
                    eTVar.setVisibility(0);
                }
            }
        });
        if (this.AlY == null) {
            this.AlY = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.eT.3
                @Override // java.lang.Runnable
                public void run() {
                    eT.this.Sg();
                }
            };
        }
        postDelayed(this.AlY, this.tN * 1000);
    }

    public void YFl(int i10) {
        if (i10 == 100 || Math.abs(i10 - this.Sg) >= 7) {
            this.Sg = i10;
            if (a.a()) {
                Sg(this.Sg);
                return;
            }
            if (this.wN == null) {
                this.wN = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.eT.4
                    @Override // java.lang.Runnable
                    public void run() {
                        eT eTVar = eT.this;
                        eTVar.Sg(eTVar.Sg);
                    }
                };
            }
            post(this.wN);
        }
    }
}
