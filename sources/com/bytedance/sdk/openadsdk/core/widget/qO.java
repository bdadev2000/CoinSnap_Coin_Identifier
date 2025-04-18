package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.utils.GS;
import p5.a;

/* loaded from: classes.dex */
public class qO {
    private com.bytedance.sdk.openadsdk.core.GA.Sg.YFl AlY;
    private a DSW;
    private TextView Sg;
    private View YFl;
    private ViewGroup qsH;
    private Context tN;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10769vc = false;
    private Sg wN;

    /* loaded from: classes.dex */
    public interface Sg {
        void eT();

        boolean nc();
    }

    /* loaded from: classes.dex */
    public enum YFl {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    private void AlY() {
        View view = this.YFl;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tN() {
        if (this.tN == null) {
            return;
        }
        AlY();
    }

    private void Sg() {
        this.DSW = null;
    }

    public void YFl(Context context, ViewGroup viewGroup) {
        if (context == null || !(viewGroup instanceof ViewGroup)) {
            return;
        }
        this.qsH = viewGroup;
        this.tN = com.bytedance.sdk.openadsdk.core.lG.YFl().getApplicationContext();
    }

    private void YFl(Context context, View view, boolean z10) {
        ViewGroup.LayoutParams YFl2;
        if (context == null || view == null || this.YFl != null || (YFl2 = YFl(this.qsH)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.GA.EH eh2 = new com.bytedance.sdk.openadsdk.GA.EH(context);
        this.YFl = eh2;
        eh2.setLayoutParams(YFl2);
        this.qsH.addView(this.YFl);
        this.Sg = (TextView) this.YFl.findViewById(com.bytedance.sdk.openadsdk.utils.GA.f10818hf);
        View findViewById = this.YFl.findViewById(com.bytedance.sdk.openadsdk.utils.GA.Xrd);
        if (z10) {
            findViewById.setClickable(true);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.qO.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    qO.this.tN();
                    if (qO.this.AlY != null) {
                        qO.this.AlY.YFl(YFl.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            findViewById.setOnClickListener(null);
            findViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams YFl(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.GA.Sg.YFl yFl, Sg sg2) {
        this.wN = sg2;
        this.AlY = yFl;
    }

    public boolean YFl(int i10, a aVar, boolean z10) {
        Context context = this.tN;
        if (context == null || aVar == null) {
            return true;
        }
        YFl(context, this.qsH, z10);
        this.DSW = aVar;
        if (i10 == 1 || i10 == 2) {
            return YFl(i10);
        }
        return true;
    }

    private boolean YFl(int i10) {
        Sg sg2;
        if (YFl() || this.f10769vc) {
            return true;
        }
        if (this.AlY != null && (sg2 = this.wN) != null) {
            if (sg2.nc()) {
                this.AlY.wN(null, null);
            }
            this.AlY.YFl(YFl.PAUSE_VIDEO, (String) null);
        }
        YFl(this.DSW, true);
        return false;
    }

    public void YFl(boolean z10) {
        if (z10) {
            Sg();
        }
        AlY();
    }

    public boolean YFl() {
        View view = this.YFl;
        return view != null && view.getVisibility() == 0;
    }

    private void YFl(a aVar, boolean z10) {
        View view;
        String str;
        View view2;
        if (aVar == null || (view = this.YFl) == null || this.tN == null || view.getVisibility() == 0) {
            return;
        }
        Sg sg2 = this.wN;
        if (sg2 != null) {
            sg2.eT();
        }
        double ceil = Math.ceil((aVar.f23458c * 1.0d) / 1048576.0d);
        if (z10) {
            str = String.format(com.bytedance.sdk.component.utils.qO.YFl(this.tN, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(ceil).floatValue()));
        } else {
            str = com.bytedance.sdk.component.utils.qO.YFl(this.tN, "tt_video_without_wifi_tips") + com.bytedance.sdk.component.utils.qO.YFl(this.tN, "tt_video_bytesize");
        }
        GS.YFl(this.YFl, 0);
        GS.YFl(this.Sg, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!GS.AlY(this.YFl) || (view2 = this.YFl) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
