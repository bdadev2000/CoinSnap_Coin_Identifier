package com.bytedance.adsdk.Sg.tN.tN;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.Sg.aIu;
import com.bytedance.adsdk.Sg.nc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class tN extends AlY {
    private final LinearLayout.LayoutParams NjR;
    private String YoT;
    private final List<TextView> eT;

    /* renamed from: nc, reason: collision with root package name */
    private final List<String> f10209nc;
    private LinearLayout qsH;

    public tN(com.bytedance.adsdk.Sg.NjR njR, wN wNVar, Context context) {
        super(njR, wNVar);
        List<nc.YFl> tN;
        String str;
        this.NjR = new LinearLayout.LayoutParams(-2, -2);
        this.f10209nc = new ArrayList();
        this.eT = new ArrayList();
        nc ncVar = ((AlY) this).DSW;
        if (ncVar != null && (tN = ncVar.tN()) != null && tN.size() > 0) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.qsH = linearLayout;
            linearLayout.setOrientation(0);
            this.qsH.setGravity(17);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(80);
            this.qsH.addView(linearLayout2);
            List<String> YoT = YoT();
            for (int i10 = 0; i10 < tN.size(); i10++) {
                nc.YFl yFl = tN.get(i10);
                TextView textView = new TextView(context);
                if (YoT != null && i10 < YoT.size()) {
                    str = YoT.get(i10);
                } else {
                    str = "";
                }
                YFl(textView, yFl, str);
                int i11 = yFl.f10186vc;
                if (i11 != 0) {
                    this.NjR.bottomMargin = (int) (com.bytedance.adsdk.Sg.vc.vc.YFl() * i11);
                    linearLayout2.addView(textView, this.NjR);
                } else {
                    linearLayout2.addView(textView);
                }
            }
            float YFl = com.bytedance.adsdk.Sg.vc.vc.YFl();
            YFl(this.qsH, (int) (((AlY) this).DSW.YFl() * YFl), (int) (((AlY) this).DSW.Sg() * YFl));
        }
    }

    private void YFl(TextView textView, nc.YFl yFl, String str) {
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            textView.setText("");
        }
        if (!TextUtils.isEmpty(yFl.tN)) {
            textView.setTextColor(Color.parseColor(yFl.tN));
        }
        if (!TextUtils.isEmpty(yFl.AlY)) {
            textView.setBackgroundColor(Color.parseColor(yFl.AlY));
        }
        textView.setTextAlignment(4);
        textView.setTextSize(yFl.wN);
    }

    private List<String> YoT() {
        com.bytedance.adsdk.Sg.NjR njR;
        aIu Ne;
        List<nc.YFl> tN;
        int i10;
        if (((AlY) this).DSW == null || (njR = this.Sg) == null || (Ne = njR.Ne()) == null) {
            return null;
        }
        String AlY = ((AlY) this).DSW.AlY();
        if ((!TextUtils.isEmpty(AlY) || !TextUtils.isEmpty(this.YoT)) && (tN = ((AlY) this).DSW.tN()) != null) {
            String str = this.YoT;
            if (TextUtils.isEmpty(str)) {
                str = Ne.YFl(AlY);
            }
            if (!TextUtils.isEmpty(str)) {
                this.f10209nc.clear();
                for (int i11 = 0; i11 < tN.size(); i11++) {
                    nc.YFl yFl = tN.get(i11);
                    int i12 = yFl.YFl;
                    int i13 = yFl.Sg;
                    if (i13 == 0) {
                        this.f10209nc.add(str);
                    } else {
                        if (i12 < 0) {
                            i12 += str.length();
                        }
                        if (i13 < 0) {
                            i10 = str.length() + i13;
                        } else {
                            i10 = i12 + i13;
                        }
                        if (i10 > str.length()) {
                            i10 = str.length();
                        }
                        if (i12 >= 0 && i12 < str.length() && i10 > i12) {
                            this.f10209nc.add(str.substring(i12, i10));
                        } else {
                            this.f10209nc.add("");
                        }
                    }
                }
                return this.f10209nc;
            }
        }
        return null;
    }

    private void tN(float f10) {
        List<nc.YFl> tN;
        String str;
        nc ncVar = ((AlY) this).DSW;
        if (ncVar != null && (tN = ncVar.tN()) != null && tN.size() > 0) {
            this.qsH.setOrientation(0);
            this.qsH.setGravity(17);
            if (this.qsH.getChildCount() <= 0) {
                return;
            }
            LinearLayout linearLayout = (LinearLayout) this.qsH.getChildAt(0);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(80);
            this.qsH.removeAllViews();
            if (linearLayout.getChildCount() != tN.size()) {
                return;
            }
            List<String> YoT = YoT();
            this.eT.clear();
            for (int i10 = 0; i10 < tN.size(); i10++) {
                nc.YFl yFl = tN.get(i10);
                TextView textView = (TextView) linearLayout.getChildAt(i10);
                this.eT.add(textView);
                if (YoT != null && i10 < YoT.size()) {
                    str = YoT.get(i10);
                } else {
                    str = "";
                }
                YFl(textView, yFl, str);
            }
            linearLayout.removeAllViews();
            for (int i11 = 0; i11 < tN.size(); i11++) {
                nc.YFl yFl2 = tN.get(i11);
                TextView textView2 = this.eT.get(i11);
                textView2.setAlpha(f10);
                linearLayout.setAlpha(f10);
                int i12 = yFl2.f10186vc;
                if (i12 != 0) {
                    this.NjR.bottomMargin = (int) (com.bytedance.adsdk.Sg.vc.vc.YFl() * i12);
                    linearLayout.addView(textView2, this.NjR);
                } else {
                    linearLayout.addView(textView2);
                }
            }
            this.qsH.setAlpha(f10);
            this.qsH.addView(linearLayout);
            float YFl = com.bytedance.adsdk.Sg.vc.vc.YFl();
            YFl(this.qsH, (int) (((AlY) this).DSW.YFl() * YFl), (int) (((AlY) this).DSW.Sg() * YFl));
        }
    }

    @Override // com.bytedance.adsdk.Sg.tN.tN.AlY, com.bytedance.adsdk.Sg.tN.tN.YFl
    public void Sg(Canvas canvas, Matrix matrix, int i10) {
        if (this.qsH != null) {
            canvas.save();
            canvas.concat(matrix);
            YFl(i10);
            tN(vc());
            this.qsH.draw(canvas);
            canvas.restore();
            return;
        }
        super.Sg(canvas, matrix, i10);
    }

    private static void YFl(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void YFl(String str) {
        this.YoT = str;
    }
}
