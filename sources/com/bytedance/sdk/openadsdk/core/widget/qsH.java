package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class qsH extends com.bytedance.sdk.openadsdk.core.wN.DSW {
    private com.bytedance.sdk.openadsdk.core.wN.qsH AlY;
    private boolean DSW;
    private com.bytedance.sdk.openadsdk.core.wN.qsH Sg;
    private lG YFl;
    private NjR tN;

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10770vc;
    private com.bytedance.sdk.openadsdk.core.wN.AlY wN;

    public qsH(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (YFl()) {
            Sg();
        }
    }

    public void Sg() {
        if (this.f10770vc) {
            return;
        }
        this.f10770vc = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        lG lGVar = new lG(context);
        this.YFl = lGVar;
        lGVar.setId(520093745);
        int tN = GS.tN(context, 64.0f);
        this.YFl.setLayoutParams(new RelativeLayout.LayoutParams(tN, tN));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.Sg = qsh;
        qsh.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(GS.tN(context, 219.0f), -2);
        layoutParams2.topMargin = GS.tN(context, 16.0f);
        this.Sg.setLayoutParams(layoutParams2);
        this.Sg.setEllipsize(TextUtils.TruncateAt.END);
        this.Sg.setGravity(17);
        this.Sg.setMaxWidth(GS.tN(context, 150.0f));
        this.Sg.setMaxLines(2);
        this.Sg.setTextColor(-1);
        this.Sg.setTextSize(1, 16.0f);
        NjR njR = new NjR(context);
        this.tN = njR;
        njR.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(GS.tN(context, 219.0f), GS.tN(context, 6.0f));
        layoutParams3.topMargin = GS.tN(context, 24.0f);
        this.tN.setLayoutParams(layoutParams3);
        this.AlY = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(GS.tN(context, 138.0f), GS.tN(context, 42.0f));
        layoutParams4.topMargin = GS.tN(context, 48.0f);
        this.AlY.setLayoutParams(layoutParams4);
        this.AlY.setTextColor(-1);
        this.AlY.setTextSize(16.0f);
        this.AlY.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.AlY.setBackground(gradientDrawable);
        linearLayout.addView(this.YFl);
        linearLayout.addView(this.Sg);
        linearLayout.addView(this.tN);
        linearLayout.addView(this.AlY);
        YFl(context);
        addView(linearLayout);
        addView(this.wN);
    }

    public boolean YFl() {
        return true;
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.wN.qsH getDownloadButton() {
        return this.AlY;
    }

    @Nullable
    public NjR getLoadingProgressBar() {
        return this.tN;
    }

    public void setProgress(int i10) {
        NjR njR = this.tN;
        if (njR != null) {
            njR.setProgress(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void YFl(final com.bytedance.sdk.openadsdk.core.model.Wwa r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f10770vc
            if (r0 == 0) goto Le0
            if (r9 == 0) goto Le0
            boolean r0 = r8.DSW
            if (r0 == 0) goto Lc
            goto Le0
        Lc:
            r0 = 1
            r8.DSW = r0
            boolean r1 = r9.iY()
            r2 = 8
            if (r1 != 0) goto L4b
            com.bytedance.sdk.openadsdk.core.model.EH r3 = r9.dGX()
            if (r3 == 0) goto L4b
            com.bytedance.sdk.openadsdk.core.model.EH r3 = r9.dGX()
            java.lang.String r3 = r3.YFl()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L4b
            com.bytedance.sdk.openadsdk.core.model.EH r3 = r9.dGX()     // Catch: java.lang.Throwable -> L4b
            com.bytedance.sdk.component.wN.nc r3 = com.bytedance.sdk.openadsdk.NjR.AlY.YFl(r3)     // Catch: java.lang.Throwable -> L4b
            com.bytedance.sdk.openadsdk.NjR.Sg r4 = new com.bytedance.sdk.openadsdk.NjR.Sg     // Catch: java.lang.Throwable -> L4b
            com.bytedance.sdk.openadsdk.core.model.EH r5 = r9.dGX()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = r5.YFl()     // Catch: java.lang.Throwable -> L4b
            com.bytedance.sdk.openadsdk.utils.UZM r6 = new com.bytedance.sdk.openadsdk.utils.UZM     // Catch: java.lang.Throwable -> L4b
            com.bytedance.sdk.openadsdk.core.widget.lG r7 = r8.YFl     // Catch: java.lang.Throwable -> L4b
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4b
            r4.<init>(r9, r5, r6)     // Catch: java.lang.Throwable -> L4b
            r3.YFl(r4)     // Catch: java.lang.Throwable -> L4b
            goto L50
        L4b:
            com.bytedance.sdk.openadsdk.core.widget.lG r3 = r8.YFl
            r3.setVisibility(r2)
        L50:
            if (r1 == 0) goto L5a
            com.bytedance.sdk.openadsdk.core.wN.qsH r1 = r8.Sg
            java.lang.String r2 = "Loading"
            r1.setText(r2)
            goto L73
        L5a:
            java.lang.String r1 = r9.Hjb()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L6e
            com.bytedance.sdk.openadsdk.core.wN.qsH r1 = r8.Sg
            java.lang.String r2 = r9.Hjb()
            r1.setText(r2)
            goto L73
        L6e:
            com.bytedance.sdk.openadsdk.core.wN.qsH r1 = r8.Sg
            r1.setVisibility(r2)
        L73:
            com.bytedance.sdk.openadsdk.core.wN.qsH r1 = r8.AlY
            if (r1 == 0) goto L7e
            java.lang.String r2 = r9.lL()
            r1.setText(r2)
        L7e:
            com.bytedance.sdk.openadsdk.core.wN.AlY r1 = r8.wN
            if (r1 == 0) goto Le0
            com.bytedance.sdk.openadsdk.core.widget.qsH$1 r2 = new com.bytedance.sdk.openadsdk.core.widget.qsH$1
            r2.<init>()
            r1.setOnClickListener(r2)
            com.bytedance.sdk.openadsdk.core.wN.AlY r9 = r8.wN
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            r1 = 1103101952(0x41c00000, float:24.0)
            if (r10 != r0) goto Lb9
            android.content.Context r10 = r8.getContext()
            r0 = 1115684864(0x42800000, float:64.0)
            int r10 = com.bytedance.sdk.openadsdk.utils.GS.tN(r10, r0)
            r9.width = r10
            android.content.Context r10 = r8.getContext()
            int r10 = com.bytedance.sdk.openadsdk.utils.GS.tN(r10, r1)
            r9.height = r10
            android.content.Context r10 = r8.getContext()
            r0 = 1114636288(0x42700000, float:60.0)
            int r10 = com.bytedance.sdk.openadsdk.utils.GS.tN(r10, r0)
            r9.bottomMargin = r10
            goto Ldb
        Lb9:
            android.content.Context r10 = r8.getContext()
            r0 = 1109655552(0x42240000, float:41.0)
            int r10 = com.bytedance.sdk.openadsdk.utils.GS.tN(r10, r0)
            r9.width = r10
            android.content.Context r10 = r8.getContext()
            r0 = 1097859072(0x41700000, float:15.0)
            int r10 = com.bytedance.sdk.openadsdk.utils.GS.tN(r10, r0)
            r9.height = r10
            android.content.Context r10 = r8.getContext()
            int r10 = com.bytedance.sdk.openadsdk.utils.GS.tN(r10, r1)
            r9.bottomMargin = r10
        Ldb:
            com.bytedance.sdk.openadsdk.core.wN.AlY r10 = r8.wN
            r10.setLayoutParams(r9)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.qsH.YFl(com.bytedance.sdk.openadsdk.core.model.Wwa, int):void");
    }

    public void YFl(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        this.wN = alY;
        alY.setImageDrawable(com.bytedance.sdk.component.utils.qO.tN(context, "tt_ad_logo_big"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(GS.tN(context, 64.0f), GS.tN(context, 24.0f));
        layoutParams.bottomMargin = GS.tN(context, 60.0f);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.wN.setLayoutParams(layoutParams);
    }
}
