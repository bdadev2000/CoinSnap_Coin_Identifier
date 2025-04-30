package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.applovin.impl.L;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.dynamic.jU.Bj;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.adexpress.widget.AnimationText;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.utils.tG;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class DynamicTextView extends DynamicBaseWidgetImp {
    public DynamicTextView(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        this.ku += 6;
        if (this.vDp.Pxi()) {
            AnimationText animationText = new AnimationText(context, this.vDp.QR(), this.vDp.COT(), 1, this.vDp.ku());
            this.dQp = animationText;
            animationText.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.dQp = textView;
            textView.setIncludeFontPadding(false);
        }
        this.dQp.setTag(Integer.valueOf(getClickArea()));
        addView(this.dQp, getWidgetLayoutParams());
    }

    private void Bj() {
        if (!(this.dQp instanceof AnimationText)) {
            return;
        }
        String text = getText();
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(text);
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                arrayList.add(jSONArray.optString(i9));
            }
        } catch (JSONException unused) {
            arrayList.add(text);
        }
        ((AnimationText) this.dQp).setMaxLines(1);
        ((AnimationText) this.dQp).setTextColor(this.vDp.QR());
        ((AnimationText) this.dQp).setTextSize(this.vDp.COT());
        ((AnimationText) this.dQp).setAnimationText(arrayList);
        ((AnimationText) this.dQp).setAnimationType(this.vDp.BO());
        ((AnimationText) this.dQp).setAnimationDuration(this.vDp.oKZ() * 1000);
        ((AnimationText) this.dQp).zp();
    }

    private void dT() {
        int zp;
        if (L.x(this.tG, "source") || L.x(this.tG, CampaignEx.JSON_KEY_TITLE) || L.x(this.tG, "text_star")) {
            int[] lMd = Bj.lMd(this.vDp.HWF(), this.vDp.COT(), true);
            int zp2 = (int) QR.zp(getContext(), this.vDp.lMd());
            int zp3 = (int) QR.zp(getContext(), this.vDp.KS());
            int zp4 = (int) QR.zp(getContext(), this.vDp.jU());
            int zp5 = (int) QR.zp(getContext(), this.vDp.zp());
            int min = Math.min(zp2, zp5);
            if (L.x(this.tG, "source") && (zp = ((this.ku - ((int) QR.zp(getContext(), this.vDp.COT()))) - zp2) - zp5) > 1 && zp <= min * 2) {
                int i9 = zp / 2;
                this.dQp.setPadding(zp3, zp2 - i9, zp4, zp5 - (zp - i9));
                return;
            }
            int i10 = (((lMd[1] + zp2) + zp5) - this.ku) - 2;
            if (i10 <= 1) {
                return;
            }
            if (i10 <= min * 2) {
                int i11 = i10 / 2;
                this.dQp.setPadding(zp3, zp2 - i11, zp4, zp5 - (i10 - i11));
            } else if (i10 <= zp2 + zp5) {
                if (zp2 > zp5) {
                    this.dQp.setPadding(zp3, zp2 - (i10 - min), zp4, zp5 - min);
                } else {
                    this.dQp.setPadding(zp3, zp2 - min, zp4, zp5 - (i10 - min));
                }
            } else {
                final int i12 = (i10 - zp2) - zp5;
                this.dQp.setPadding(zp3, 0, zp4, 0);
                if (i12 <= ((int) QR.zp(getContext(), 1.0f)) + 1) {
                    ((TextView) this.dQp).setTextSize(this.vDp.COT() - 1.0f);
                } else if (i12 <= (((int) QR.zp(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.dQp).setTextSize(this.vDp.COT() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicTextView.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = DynamicTextView.this.dQp.getLayoutParams();
                                DynamicTextView dynamicTextView = DynamicTextView.this;
                                layoutParams.height = dynamicTextView.ku + i12;
                                dynamicTextView.dQp.setLayoutParams(layoutParams);
                                DynamicTextView.this.dQp.setTranslationY(-i12);
                                ((ViewGroup) DynamicTextView.this.dQp.getParent()).setClipChildren(false);
                                ((ViewGroup) DynamicTextView.this.dQp.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            }
        }
        if (L.x(this.tG, "fillButton")) {
            this.dQp.setTextAlignment(2);
            ((TextView) this.dQp).setGravity(17);
        }
    }

    private boolean zp() {
        DynamicRootView dynamicRootView = this.rV;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.rV.getRenderRequest().dT() == 4) ? false : true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        int i9;
        double d2;
        super.YW();
        if (TextUtils.isEmpty(getText())) {
            this.dQp.setVisibility(4);
            return true;
        }
        if (this.vDp.Pxi()) {
            Bj();
            return true;
        }
        ((TextView) this.dQp).setText(this.vDp.HWF());
        ((TextView) this.dQp).setTextDirection(5);
        this.dQp.setTextAlignment(this.vDp.ku());
        ((TextView) this.dQp).setTextColor(this.vDp.QR());
        ((TextView) this.dQp).setTextSize(this.vDp.COT());
        if (!this.vDp.ot()) {
            ((TextView) this.dQp).setMaxLines(1);
            ((TextView) this.dQp).setGravity(17);
            ((TextView) this.dQp).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int yRU = this.vDp.yRU();
            if (yRU > 0) {
                ((TextView) this.dQp).setLines(yRU);
                ((TextView) this.dQp).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        ku kuVar = this.tG;
        if (kuVar != null && kuVar.dT() != null) {
            if (com.bytedance.sdk.component.adexpress.jU.lMd() && zp() && (L.x(this.tG, "text_star") || L.x(this.tG, "score-count") || L.x(this.tG, "score-count-type-1") || L.x(this.tG, "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (!L.x(this.tG, "score-count") && !L.x(this.tG, "score-count-type-2")) {
                if (L.x(this.tG, "text_star")) {
                    try {
                        d2 = Double.parseDouble(getText());
                    } catch (Exception e4) {
                        tG.zp("DynamicStarView applyNativeStyle", e4.toString());
                        d2 = -1.0d;
                    }
                    if (d2 < 0.0d || d2 > 5.0d) {
                        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                            setVisibility(8);
                            return true;
                        }
                        this.dQp.setVisibility(0);
                    }
                    ((TextView) this.dQp).setIncludeFontPadding(false);
                    ((TextView) this.dQp).setText(String.format("%.1f", Double.valueOf(d2)));
                } else if (TextUtils.equals("privacy-detail", this.tG.dT().lMd())) {
                    ((TextView) this.dQp).setText("Permission list | Privacy policy");
                } else if (L.x(this.tG, "development-name")) {
                    ((TextView) this.dQp).setText(cz.zp(com.bytedance.sdk.component.adexpress.jU.zp(), "tt_text_privacy_development") + getText());
                } else if (L.x(this.tG, "app-version")) {
                    ((TextView) this.dQp).setText(cz.zp(com.bytedance.sdk.component.adexpress.jU.zp(), "tt_text_privacy_app_version") + getText());
                } else {
                    ((TextView) this.dQp).setText(getText());
                }
            } else {
                try {
                    try {
                        i9 = Integer.parseInt(getText());
                    } catch (Exception unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i9 = -1;
                }
                if (i9 < 0) {
                    if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                        setVisibility(8);
                        return true;
                    }
                    this.dQp.setVisibility(0);
                }
                if (TextUtils.equals(this.tG.dT().lMd(), "score-count-type-2")) {
                    ((TextView) this.dQp).setText(String.format(new DecimalFormat("(###,###,###)").format(i9), Integer.valueOf(i9)));
                    ((TextView) this.dQp).setGravity(17);
                    return true;
                }
                zp((TextView) this.dQp, i9, getContext(), "tt_comment_num");
            }
            this.dQp.setTextAlignment(this.vDp.ku());
            ((TextView) this.dQp).setGravity(this.vDp.YW());
            if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
                dT();
            }
        }
        return true;
    }

    public String getText() {
        String HWF = this.vDp.HWF();
        if (TextUtils.isEmpty(HWF)) {
            if (!com.bytedance.sdk.component.adexpress.jU.lMd() && L.x(this.tG, "text_star")) {
                HWF = CampaignEx.CLICKMODE_ON;
            }
            if (!com.bytedance.sdk.component.adexpress.jU.lMd() && L.x(this.tG, "score-count")) {
                HWF = "6870";
            }
        }
        if (L.x(this.tG, CampaignEx.JSON_KEY_TITLE) || L.x(this.tG, "subtitle")) {
            return HWF.replace("\n", "");
        }
        return HWF;
    }

    public void zp(TextView textView, int i9, Context context, String str) {
        textView.setText("(" + String.format(cz.zp(context, str), Integer.valueOf(i9)) + ")");
        if (i9 == -1) {
            textView.setVisibility(8);
        }
    }
}
