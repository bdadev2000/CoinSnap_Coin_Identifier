package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.layout.TTVideoTrafficTipsLayout;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class COT {
    private lMd COT;
    private boolean HWF = false;
    private Context KS;
    private com.bykv.vk.openvk.component.video.api.KS.lMd QR;
    private com.bytedance.sdk.openadsdk.core.video.nativevideo.zp jU;
    private ViewGroup ku;
    private TextView lMd;
    private View zp;

    /* loaded from: classes.dex */
    public interface lMd {
        void Bj();

        boolean dT();
    }

    /* loaded from: classes.dex */
    public enum zp {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KS() {
        if (this.KS == null) {
            return;
        }
        jU();
    }

    private void jU() {
        View view = this.zp;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void lMd() {
        this.QR = null;
    }

    public void zp(Context context, ViewGroup viewGroup) {
        if (context == null || !(viewGroup instanceof ViewGroup)) {
            return;
        }
        this.ku = viewGroup;
        this.KS = KVG.zp().getApplicationContext();
    }

    private void zp(Context context, View view, boolean z8) {
        ViewGroup.LayoutParams zp2;
        if (context == null || view == null || this.zp != null || (zp2 = zp(this.ku)) == null) {
            return;
        }
        TTVideoTrafficTipsLayout tTVideoTrafficTipsLayout = new TTVideoTrafficTipsLayout(context);
        this.zp = tTVideoTrafficTipsLayout;
        tTVideoTrafficTipsLayout.setLayoutParams(zp2);
        this.ku.addView(this.zp);
        this.lMd = (TextView) this.zp.findViewById(vDp.dm);
        View findViewById = this.zp.findViewById(vDp.Gor);
        if (z8) {
            findViewById.setClickable(true);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.COT.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    COT.this.KS();
                    if (COT.this.jU != null) {
                        COT.this.jU.zp(zp.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            findViewById.setOnClickListener(null);
            findViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams zp(ViewGroup viewGroup) {
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

    public void zp(com.bytedance.sdk.openadsdk.core.video.nativevideo.zp zpVar, lMd lmd) {
        this.COT = lmd;
        this.jU = zpVar;
    }

    public boolean zp(int i9, com.bykv.vk.openvk.component.video.api.KS.lMd lmd, boolean z8) {
        Context context = this.KS;
        if (context == null || lmd == null) {
            return true;
        }
        zp(context, this.ku, z8);
        this.QR = lmd;
        if (i9 == 1 || i9 == 2) {
            return zp(i9);
        }
        return true;
    }

    private boolean zp(int i9) {
        lMd lmd;
        if (zp() || this.HWF) {
            return true;
        }
        if (this.jU != null && (lmd = this.COT) != null) {
            if (lmd.dT()) {
                this.jU.COT(null, null);
            }
            this.jU.zp(zp.PAUSE_VIDEO, (String) null);
        }
        zp(this.QR, true);
        return false;
    }

    public void zp(boolean z8) {
        if (z8) {
            lMd();
        }
        jU();
    }

    public boolean zp() {
        View view = this.zp;
        return view != null && view.getVisibility() == 0;
    }

    private void zp(com.bykv.vk.openvk.component.video.api.KS.lMd lmd, boolean z8) {
        View view;
        String str;
        View view2;
        if (lmd == null || (view = this.zp) == null || this.KS == null || view.getVisibility() == 0) {
            return;
        }
        lMd lmd2 = this.COT;
        if (lmd2 != null) {
            lmd2.Bj();
        }
        double ceil = Math.ceil((lmd.COT() * 1.0d) / 1048576.0d);
        if (z8) {
            str = String.format(cz.zp(this.KS, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(ceil).floatValue()));
        } else {
            str = cz.zp(this.KS, "tt_video_without_wifi_tips") + cz.zp(this.KS, "tt_video_bytesize");
        }
        WNy.zp(this.zp, 0);
        WNy.zp(this.lMd, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!WNy.jU(this.zp) || (view2 = this.zp) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
