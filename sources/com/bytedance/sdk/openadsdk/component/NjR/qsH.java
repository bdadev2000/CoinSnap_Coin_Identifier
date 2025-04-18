package com.bytedance.sdk.openadsdk.component.NjR;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.lG;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class qsH {
    private static Drawable Sg;
    private static boolean YFl;
    private TextView AlY;
    private lG tN;

    public static Drawable tN() {
        return Sg;
    }

    public void Sg() {
        if (!YFl) {
            try {
                int DSW = NjR.Sg().DSW();
                if (DSW != 0) {
                    Sg = com.bytedance.sdk.openadsdk.core.lG.YFl().getResources().getDrawable(DSW);
                }
                YFl = true;
            } catch (Throwable unused) {
                YFl = true;
            }
        }
    }

    public void YFl(tN tNVar, Wwa wwa, float f10, float f11, boolean z10) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (tNVar != null) {
            this.tN = tNVar.getHostAppIcon();
            this.AlY = tNVar.getHostAppName();
            View userInfo = tNVar.getUserInfo();
            if (tNVar instanceof AlY) {
                lG lGVar = this.tN;
                if (lGVar != null && (layoutParams2 = lGVar.getLayoutParams()) != null) {
                    if (wwa.SVa() == 1) {
                        int tN = GS.tN(this.tN.getContext(), 40.0f);
                        layoutParams2.width = tN;
                        layoutParams2.height = tN;
                    } else {
                        int tN2 = GS.tN(this.tN.getContext(), 30.0f);
                        layoutParams2.width = tN2;
                        layoutParams2.height = tN2;
                    }
                    this.tN.setLayoutParams(layoutParams2);
                }
                if (this.AlY != null) {
                    if (wwa.SVa() == 1) {
                        this.AlY.setTextSize(30.0f);
                    } else {
                        this.AlY.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (wwa.SVa() == 1) {
                        layoutParams.height = GS.tN(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = GS.tN(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.NjR.qsH.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
        }
    }

    public void YFl() {
        String vc2 = NjR.Sg().vc();
        if (TextUtils.isEmpty(vc2)) {
            this.AlY.setVisibility(8);
        } else {
            this.AlY.setText(vc2);
        }
        Sg();
        try {
            Drawable drawable = Sg;
            if (drawable == null) {
                this.tN.setVisibility(8);
                return;
            }
            this.tN.setImageDrawable(drawable);
            if (this.AlY.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.tN.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.tN.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.tN.setVisibility(8);
        }
    }
}
