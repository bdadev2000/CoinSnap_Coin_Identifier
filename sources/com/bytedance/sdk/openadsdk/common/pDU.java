package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.tN.YoT;
import com.bytedance.sdk.openadsdk.tN.nc;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class pDU extends com.bytedance.sdk.openadsdk.core.wN.tN implements nc.Sg {
    private Context AlY;
    private final com.bytedance.sdk.openadsdk.tN.nc DSW;
    private Wwa Sg;
    private View YFl;
    private YFl tN;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10565vc;
    private String wN;

    /* loaded from: classes.dex */
    public interface YFl {
        void Sg(View view);

        void YFl(View view);

        void YFl(FilterWord filterWord);
    }

    public pDU(@NonNull Context context, @NonNull Wwa wwa) {
        this(context.getApplicationContext());
        this.Sg = wwa;
        this.AlY = context;
        AlY();
        wN();
    }

    private void AlY() {
        this.DSW.YFl(this.Sg.uGS());
        this.DSW.YFl(this);
    }

    private YoT.YFl vc() {
        return new YoT.YFl() { // from class: com.bytedance.sdk.openadsdk.common.pDU.2
            @Override // com.bytedance.sdk.openadsdk.tN.YoT.YFl
            public void Sg() {
                pDU.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.tN.YoT.YFl
            public void YFl() {
                pDU.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.tN.YoT.YFl
            public void tN() {
                pDU.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.tN.YoT.YFl
            public void YFl(int i10, FilterWord filterWord, String str) {
                pDU.this.DSW.tN(str);
                pDU.this.setVisibility(0);
            }
        };
    }

    private void wN() {
        com.bytedance.sdk.openadsdk.tN.nc ncVar;
        Wwa wwa = this.Sg;
        if (wwa != null && (ncVar = this.DSW) != null) {
            ncVar.YFl(wwa.UT());
        }
    }

    public void Sg() {
        setVisibility(8);
        this.f10565vc = false;
        YFl yFl = this.tN;
        if (yFl != null) {
            yFl.Sg(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.tN.nc ncVar = this.DSW;
        if (ncVar != null) {
            ncVar.YFl();
        }
    }

    public void setCallback(YFl yFl) {
        this.tN = yFl;
    }

    public void setDislikeSource(String str) {
        this.wN = str;
        this.DSW.Sg(str);
    }

    public void tN() {
        Context context = this.AlY;
        if (!(context instanceof Activity)) {
            return;
        }
        boolean z10 = !((Activity) context).isFinishing();
        com.bytedance.sdk.openadsdk.tN.YoT yoT = new com.bytedance.sdk.openadsdk.tN.YoT(this.AlY, this.DSW);
        yoT.YFl(vc());
        yoT.YFl(this.Sg.uGS(), this.Sg.ni().toString());
        yoT.YFl(this.wN);
        if (z10 && !yoT.isShowing()) {
            yoT.show();
        }
    }

    private void YFl(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.pDU.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (pDU.this.DSW != null) {
                    pDU.this.DSW.wN();
                } else {
                    pDU.this.Sg();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.YFl = new com.bytedance.sdk.openadsdk.tN.NjR(context, this.DSW);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = GS.tN(getContext(), 20.0f);
        layoutParams.rightMargin = GS.tN(getContext(), 20.0f);
        this.YFl.setLayoutParams(layoutParams);
        this.YFl.setClickable(true);
        wN();
    }

    public pDU(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public pDU(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public pDU(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10565vc = false;
        this.DSW = new com.bytedance.sdk.openadsdk.tN.nc();
        YFl(context, attributeSet);
    }

    public void YFl() {
        if (this.YFl.getParent() == null) {
            addView(this.YFl);
        }
        setVisibility(0);
        this.f10565vc = true;
        YFl yFl = this.tN;
        if (yFl != null) {
            yFl.YFl(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.tN.nc.Sg
    public void YFl(int i10) {
        if (com.bytedance.sdk.openadsdk.tN.nc.Sg == i10) {
            FilterWord Sg = this.DSW.Sg();
            if (Sg == null || com.bytedance.sdk.openadsdk.tN.nc.YFl.equals(Sg)) {
                return;
            }
            YFl yFl = this.tN;
            if (yFl != null) {
                try {
                    yFl.YFl(Sg);
                } catch (Throwable unused) {
                }
            }
            Sg();
            return;
        }
        if (com.bytedance.sdk.openadsdk.tN.nc.tN == i10) {
            Sg();
        } else if (com.bytedance.sdk.openadsdk.tN.nc.wN == i10) {
            tN();
        }
    }
}
