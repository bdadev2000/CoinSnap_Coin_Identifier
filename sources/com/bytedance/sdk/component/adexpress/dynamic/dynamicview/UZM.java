package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class UZM extends vc {
    public UZM(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        this.qsH += 6;
        if (this.YoT.mB()) {
            com.bytedance.sdk.component.adexpress.vc.YFl yFl = new com.bytedance.sdk.component.adexpress.vc.YFl(context, this.YoT.DSW(), this.YoT.wN(), 1, this.YoT.qsH());
            this.EH = yFl;
            yFl.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.EH = textView;
            textView.setIncludeFontPadding(false);
        }
        this.EH.setTag(Integer.valueOf(getClickArea()));
        addView(this.EH, getWidgetLayoutParams());
    }

    private boolean YFl() {
        DynamicRootView dynamicRootView = this.pDU;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.pDU.getRenderRequest().nc() == 4) ? false : true;
    }

    private void eT() {
        if (!(this.EH instanceof com.bytedance.sdk.component.adexpress.vc.YFl)) {
            return;
        }
        String text = getText();
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(text);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.optString(i10));
            }
        } catch (JSONException unused) {
            arrayList.add(text);
        }
        ((com.bytedance.sdk.component.adexpress.vc.YFl) this.EH).setMaxLines(1);
        ((com.bytedance.sdk.component.adexpress.vc.YFl) this.EH).setTextColor(this.YoT.DSW());
        ((com.bytedance.sdk.component.adexpress.vc.YFl) this.EH).setTextSize(this.YoT.wN());
        ((com.bytedance.sdk.component.adexpress.vc.YFl) this.EH).setAnimationText(arrayList);
        ((com.bytedance.sdk.component.adexpress.vc.YFl) this.EH).setAnimationType(this.YoT.ZU());
        ((com.bytedance.sdk.component.adexpress.vc.YFl) this.EH).setAnimationDuration(this.YoT.UI() * 1000);
        ((com.bytedance.sdk.component.adexpress.vc.YFl) this.EH).YFl();
    }

    private void nc() {
        int YFl;
        if (e.w(this.GA, "source") || e.w(this.GA, CampaignEx.JSON_KEY_TITLE) || e.w(this.GA, "text_star")) {
            int[] Sg = com.bytedance.sdk.component.adexpress.dynamic.wN.eT.Sg(this.YoT.vc(), this.YoT.wN(), true);
            int YFl2 = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), this.YoT.Sg());
            int YFl3 = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), this.YoT.tN());
            int YFl4 = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), this.YoT.AlY());
            int YFl5 = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), this.YoT.YFl());
            int min = Math.min(YFl2, YFl5);
            if (e.w(this.GA, "source") && (YFl = ((this.qsH - ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), this.YoT.wN()))) - YFl2) - YFl5) > 1 && YFl <= min * 2) {
                int i10 = YFl / 2;
                this.EH.setPadding(YFl3, YFl2 - i10, YFl4, YFl5 - (YFl - i10));
                return;
            }
            int i11 = (((Sg[1] + YFl2) + YFl5) - this.qsH) - 2;
            if (i11 <= 1) {
                return;
            }
            if (i11 <= min * 2) {
                int i12 = i11 / 2;
                this.EH.setPadding(YFl3, YFl2 - i12, YFl4, YFl5 - (i11 - i12));
            } else if (i11 <= YFl2 + YFl5) {
                if (YFl2 > YFl5) {
                    this.EH.setPadding(YFl3, YFl2 - (i11 - min), YFl4, YFl5 - min);
                } else {
                    this.EH.setPadding(YFl3, YFl2 - min, YFl4, YFl5 - (i11 - min));
                }
            } else {
                final int i13 = (i11 - YFl2) - YFl5;
                this.EH.setPadding(YFl3, 0, YFl4, 0);
                if (i13 <= ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), 1.0f)) + 1) {
                    ((TextView) this.EH).setTextSize(this.YoT.wN() - 1.0f);
                } else if (i13 <= (((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.EH).setTextSize(this.YoT.wN() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.UZM.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = UZM.this.EH.getLayoutParams();
                                UZM uzm = UZM.this;
                                layoutParams.height = uzm.qsH + i13;
                                uzm.EH.setLayoutParams(layoutParams);
                                UZM.this.EH.setTranslationY(-i13);
                                ((ViewGroup) UZM.this.EH.getParent()).setClipChildren(false);
                                ((ViewGroup) UZM.this.EH.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            }
        }
        if (e.w(this.GA, "fillButton")) {
            this.EH.setTextAlignment(2);
            ((TextView) this.EH).setGravity(17);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        int i10;
        double d10;
        super.NjR();
        if (TextUtils.isEmpty(getText())) {
            this.EH.setVisibility(4);
            return true;
        }
        if (this.YoT.mB()) {
            eT();
            return true;
        }
        ((TextView) this.EH).setText(this.YoT.vc());
        ((TextView) this.EH).setTextDirection(5);
        this.EH.setTextAlignment(this.YoT.qsH());
        ((TextView) this.EH).setTextColor(this.YoT.DSW());
        ((TextView) this.EH).setTextSize(this.YoT.wN());
        if (!this.YoT.Ne()) {
            ((TextView) this.EH).setMaxLines(1);
            ((TextView) this.EH).setGravity(17);
            ((TextView) this.EH).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int VOe = this.YoT.VOe();
            if (VOe > 0) {
                ((TextView) this.EH).setLines(VOe);
                ((TextView) this.EH).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh = this.GA;
        if (qsh != null && qsh.nc() != null) {
            if (com.bytedance.sdk.component.adexpress.AlY.Sg() && YFl() && (e.w(this.GA, "text_star") || e.w(this.GA, "score-count") || e.w(this.GA, "score-count-type-1") || e.w(this.GA, "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (!e.w(this.GA, "score-count") && !e.w(this.GA, "score-count-type-2")) {
                if (e.w(this.GA, "text_star")) {
                    try {
                        d10 = Double.parseDouble(getText());
                    } catch (Exception e2) {
                        com.bytedance.sdk.component.utils.YoT.YFl("DynamicStarView applyNativeStyle", e2.toString());
                        d10 = -1.0d;
                    }
                    if (d10 < 0.0d || d10 > 5.0d) {
                        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                            setVisibility(8);
                            return true;
                        }
                        this.EH.setVisibility(0);
                    }
                    ((TextView) this.EH).setIncludeFontPadding(false);
                    ((TextView) this.EH).setText(String.format("%.1f", Double.valueOf(d10)));
                } else if (TextUtils.equals("privacy-detail", this.GA.nc().Sg())) {
                    ((TextView) this.EH).setText("Permission list | Privacy policy");
                } else if (e.w(this.GA, "development-name")) {
                    ((TextView) this.EH).setText(com.bytedance.sdk.component.utils.qO.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), "tt_text_privacy_development") + getText());
                } else if (e.w(this.GA, "app-version")) {
                    ((TextView) this.EH).setText(com.bytedance.sdk.component.utils.qO.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), "tt_text_privacy_app_version") + getText());
                } else {
                    ((TextView) this.EH).setText(getText());
                }
            } else {
                try {
                    try {
                        i10 = Integer.parseInt(getText());
                    } catch (Exception unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i10 = -1;
                }
                if (i10 < 0) {
                    if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                        setVisibility(8);
                        return true;
                    }
                    this.EH.setVisibility(0);
                }
                if (TextUtils.equals(this.GA.nc().Sg(), "score-count-type-2")) {
                    ((TextView) this.EH).setText(String.format(new DecimalFormat("(###,###,###)").format(i10), Integer.valueOf(i10)));
                    ((TextView) this.EH).setGravity(17);
                    return true;
                }
                YFl((TextView) this.EH, i10, getContext(), "tt_comment_num");
            }
            this.EH.setTextAlignment(this.YoT.qsH());
            ((TextView) this.EH).setGravity(this.YoT.NjR());
            if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
                nc();
            }
        }
        return true;
    }

    public String getText() {
        String vc2 = this.YoT.vc();
        if (TextUtils.isEmpty(vc2)) {
            if (!com.bytedance.sdk.component.adexpress.AlY.Sg() && e.w(this.GA, "text_star")) {
                vc2 = CampaignEx.CLICKMODE_ON;
            }
            if (!com.bytedance.sdk.component.adexpress.AlY.Sg() && e.w(this.GA, "score-count")) {
                vc2 = "6870";
            }
        }
        if (e.w(this.GA, CampaignEx.JSON_KEY_TITLE) || e.w(this.GA, "subtitle")) {
            return vc2.replace("\n", "");
        }
        return vc2;
    }

    public void YFl(TextView textView, int i10, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.qO.YFl(context, str), Integer.valueOf(i10)) + ")");
        if (i10 == -1) {
            textView.setVisibility(8);
        }
    }
}
