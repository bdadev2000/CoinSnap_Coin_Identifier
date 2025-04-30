package com.bytedance.sdk.openadsdk.component.view;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class zp {
    private static Drawable lMd;
    private static boolean zp;
    private TextView COT;
    private LinearLayout KS;
    private TTRoundRectImageView jU;

    public static Drawable KS() {
        return lMd;
    }

    public void lMd() {
        if (!zp) {
            try {
                int HWF = ku.lMd().HWF();
                if (HWF != 0) {
                    lMd = KVG.zp().getResources().getDrawable(HWF);
                }
                zp = true;
            } catch (Throwable unused) {
                zp = true;
            }
        }
    }

    public void zp(PAGAppOpenBaseLayout pAGAppOpenBaseLayout, woN won, float f9, float f10, boolean z8) {
        if (pAGAppOpenBaseLayout != null) {
            this.KS = pAGAppOpenBaseLayout.getUserInfo();
            this.jU = pAGAppOpenBaseLayout.getAppIcon();
            this.COT = pAGAppOpenBaseLayout.getAppName();
            this.KS.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.view.zp.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
        }
        zp(won, f9, f10, z8);
    }

    public void zp() {
        String COT = ku.lMd().COT();
        if (TextUtils.isEmpty(COT)) {
            this.COT.setVisibility(8);
        } else {
            this.COT.setText(COT);
        }
        lMd();
        try {
            Drawable drawable = lMd;
            if (drawable == null) {
                this.jU.setVisibility(8);
                return;
            }
            this.jU.setImageDrawable(drawable);
            if (this.COT.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.jU.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.jU.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.jU.setVisibility(8);
        }
    }

    private void zp(woN won, float f9, float f10, boolean z8) {
        int lMd2;
        int KS;
        int Bj = won.Bj();
        if (Bj == 1 || Bj == 3) {
            if (z8) {
                lMd2 = won.eWG().KS();
                KS = won.eWG().lMd();
            } else {
                lMd2 = won.Rg().get(0).lMd();
                KS = won.Rg().get(0).KS();
            }
            if (lMd2 <= 0 || KS <= 0) {
                return;
            }
            float f11 = KS;
            float min = f10 - (Math.min(f9 / lMd2, f10 / f11) * f11);
            try {
                float lMd3 = WNy.lMd(KVG.zp(), 60.0f);
                if (min < lMd3) {
                    min = lMd3;
                }
                ViewGroup.LayoutParams layoutParams = this.KS.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    layoutParams.height = (int) min;
                    this.KS.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
