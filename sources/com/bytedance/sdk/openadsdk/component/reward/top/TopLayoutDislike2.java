package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.adexpress.jU;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.model.dQp;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowTextView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;

/* loaded from: classes.dex */
public class TopLayoutDislike2 extends PAGLinearLayout implements zp<TopLayoutDislike2> {
    private boolean Bj;
    private int COT;
    private int HWF;
    private ShadowImageView KS;
    private boolean QR;
    private lMd YW;
    private boolean dT;
    private TextView jU;
    private boolean ku;
    private ImageView lMd;
    private boolean tG;
    private CharSequence vDp;
    private View zp;

    public TopLayoutDislike2(@NonNull Context context) {
        this(context, null);
    }

    private void HWF() {
        this.KS = new ShadowImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(WNy.lMd(getContext(), 28.0f), WNy.lMd(getContext(), 28.0f));
        layoutParams.leftMargin = WNy.lMd(getContext(), 16.0f);
        layoutParams.topMargin = WNy.lMd(getContext(), 20.0f);
        this.KS.setLayoutParams(layoutParams);
        ShadowImageView shadowImageView = this.KS;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        shadowImageView.setScaleType(scaleType);
        ShadowImageView shadowImageView2 = new ShadowImageView(getContext());
        this.zp = shadowImageView2;
        shadowImageView2.setId(520093713);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(WNy.lMd(getContext(), 28.0f), WNy.lMd(getContext(), 28.0f));
        layoutParams2.topMargin = WNy.lMd(getContext(), 20.0f);
        layoutParams2.leftMargin = WNy.lMd(getContext(), 16.0f);
        this.zp.setLayoutParams(layoutParams2);
        ((ImageView) this.zp).setScaleType(scaleType);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        ShadowTextView shadowTextView = new ShadowTextView(getContext());
        this.jU = shadowTextView;
        shadowTextView.setId(520093714);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, WNy.lMd(getContext(), 28.0f));
        layoutParams4.topMargin = WNy.lMd(getContext(), 20.0f);
        int lMd = WNy.lMd(getContext(), 16.0f);
        layoutParams2.rightMargin = lMd;
        layoutParams4.rightMargin = lMd;
        this.jU.setLayoutParams(layoutParams4);
        this.jU.setGravity(17);
        this.jU.setTextColor(Color.parseColor("#ffffff"));
        this.jU.setTextSize(14.0f);
        this.jU.setVisibility(8);
        this.lMd = new ShadowImageView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(WNy.lMd(getContext(), 28.0f), WNy.lMd(getContext(), 28.0f));
        layoutParams5.topMargin = WNy.lMd(getContext(), 20.0f);
        layoutParams5.rightMargin = WNy.lMd(getContext(), 16.0f);
        this.lMd.setLayoutParams(layoutParams5);
        this.lMd.setPadding(WNy.lMd(getContext(), 4.0f), WNy.lMd(getContext(), 4.0f), WNy.lMd(getContext(), 4.0f), WNy.lMd(getContext(), 4.0f));
        this.lMd.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.KS);
        addView(this.zp);
        addView(view);
        addView(this.jU);
        addView(this.lMd);
    }

    private void QR() {
        View view = this.zp;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.YW != null) {
                        TopLayoutDislike2.this.YW.KS(view2);
                    }
                }
            });
        }
        ShadowImageView shadowImageView = this.KS;
        if (shadowImageView != null) {
            shadowImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Drawable zp;
                    TopLayoutDislike2.this.ku = !r0.ku;
                    if (TopLayoutDislike2.this.lMd != null) {
                        if (TopLayoutDislike2.this.ku) {
                            zp = cz.KS(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute");
                        } else {
                            zp = cz.KS(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                        }
                    } else if (TopLayoutDislike2.this.ku) {
                        zp = ku.zp(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper");
                    } else {
                        zp = ku.zp(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.KS.setImageDrawable(zp);
                    if (TopLayoutDislike2.this.KS.getDrawable() != null) {
                        TopLayoutDislike2.this.KS.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.YW != null) {
                        TopLayoutDislike2.this.YW.lMd(view2);
                    }
                }
            });
        }
        ImageView imageView = this.lMd;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.YW != null) {
                        TopLayoutDislike2.this.YW.zp(view2);
                    }
                }
            });
            return;
        }
        TextView textView = this.jU;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.YW != null) {
                        TopLayoutDislike2.this.YW.zp(view2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void COT() {
        ImageView imageView = this.lMd;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.jU.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setListener(lMd lmd) {
        this.YW = lmd;
    }

    public void setShouldShowSkipTime(boolean z8) {
        this.dT = z8;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setShowDislike(boolean z8) {
        int i9;
        View view = this.zp;
        if (view != null && !this.QR) {
            if (z8) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            view.setVisibility(i9);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setShowSkip(boolean z8) {
        int i9;
        TextView textView = this.jU;
        if (textView != null) {
            if (!z8) {
                textView.setText("");
            }
            if (this.lMd.getVisibility() == 4) {
                return;
            }
            this.Bj = !z8;
            ImageView imageView = this.lMd;
            int i10 = 8;
            if (z8 && this.tG) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            imageView.setVisibility(i9);
            TextView textView2 = this.jU;
            if (z8) {
                i10 = 0;
            }
            textView2.setVisibility(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setShowSound(boolean z8) {
        int i9;
        ShadowImageView shadowImageView = this.KS;
        if (shadowImageView != null) {
            if (z8) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            shadowImageView.setVisibility(i9);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setSkipEnable(boolean z8) {
        ImageView imageView = this.lMd;
        if (imageView != null) {
            imageView.setEnabled(z8);
            this.lMd.setClickable(z8);
            return;
        }
        TextView textView = this.jU;
        if (textView != null) {
            textView.setEnabled(z8);
            this.jU.setClickable(z8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.jU.setText(charSequence);
        ImageView imageView = this.lMd;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void setSoundMute(boolean z8) {
        Drawable zp;
        this.ku = z8;
        if (this.lMd != null) {
            if (z8) {
                zp = cz.KS(getContext(), "tt_reward_full_mute");
            } else {
                zp = cz.KS(getContext(), "tt_reward_full_unmute");
            }
        } else if (z8) {
            zp = ku.zp(getContext(), "tt_mute_wrapper");
        } else {
            zp = ku.zp(getContext(), "tt_unmute_wrapper");
        }
        this.KS.setImageDrawable(zp);
        if (this.KS.getDrawable() != null) {
            this.KS.getDrawable().setAutoMirrored(true);
        }
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void KS() {
        this.jU.setWidth(20);
        this.jU.setVisibility(4);
        this.lMd.setVisibility(4);
        this.Bj = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void jU() {
        this.jU.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void lMd() {
        ShadowImageView shadowImageView = this.KS;
        if (shadowImageView != null) {
            shadowImageView.performClick();
        }
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.vDp = "";
        setOrientation(0);
    }

    public TopLayoutDislike2 zp(boolean z8, @NonNull woN won) {
        boolean z9;
        zp(won);
        this.zp.setVisibility(0);
        ((ImageView) this.zp).setImageResource(cz.jU(KVG.zp(), "tt_reward_full_feedback"));
        this.lMd.setImageResource(cz.jU(KVG.zp(), "tt_skip_btn"));
        if (this.lMd.getDrawable() != null) {
            this.lMd.getDrawable().setAutoMirrored(true);
        }
        this.lMd.setVisibility(8);
        this.COT = won.eWG() == null ? 0 : won.eWG().ot() * ((int) won.eWG().HWF());
        if (dQp.KS(won) && won.ku() != null) {
            this.COT = (int) won.ku().lMd();
        } else if (dQp.jU(won) && won.ku() != null) {
            this.COT = (int) won.ku().jU();
        }
        if (this.COT <= 0) {
            this.COT = 10;
        }
        if (won.Dp() == 8 && won.QUv() != null) {
            this.HWF = KVG.jU().vwr(won.QUv().getCodeId());
            z9 = false;
        } else {
            this.HWF = KVG.jU().dT(won.QUv().getCodeId());
            z9 = true;
        }
        if (com.bytedance.sdk.openadsdk.core.model.cz.Bj(won)) {
            this.HWF = KVG.jU().zp(String.valueOf(won.FGx()), z9);
            this.COT = won.iOI();
        }
        int i9 = this.HWF;
        this.dT = i9 == -1 || i9 >= this.COT;
        if (won.Fm()) {
            this.zp.setVisibility(8);
            this.QR = true;
        }
        this.jU.setVisibility(0);
        this.jU.setText("");
        this.jU.setEnabled(false);
        this.jU.setClickable(false);
        QR();
        return this;
    }

    private void zp(woN won) {
        HWF();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    @SuppressLint({"SetTextI18n"})
    public void zp(CharSequence charSequence, CharSequence charSequence2) {
        int parseInt;
        if (!TextUtils.isEmpty(charSequence)) {
            this.vDp = charSequence;
        }
        if (this.lMd != null) {
            this.tG = true;
            if (this.dT) {
                this.jU.setText(((Object) this.vDp) + "s");
                zp(false);
                return;
            }
            String str = (String) this.vDp;
            try {
                int i9 = this.HWF;
                if (i9 == 0) {
                    parseInt = Integer.parseInt(str);
                } else {
                    parseInt = i9 - (this.COT - Integer.parseInt(str));
                }
                if (parseInt > 0) {
                    if (this.HWF == 0) {
                        zp(false);
                        return;
                    } else {
                        this.jU.setText(String.format(cz.zp(jU.zp(), "tt_reward_full_skip"), Integer.valueOf(parseInt)));
                        zp(true);
                        return;
                    }
                }
                this.jU.setText(((Object) this.vDp) + "s");
                zp(false);
            } catch (Exception unused) {
            }
        }
    }

    private void zp(boolean z8) {
        if (this.Bj) {
            return;
        }
        if (this.dT) {
            this.lMd.setVisibility(8);
            this.jU.setVisibility(0);
        } else if (z8) {
            this.jU.setVisibility(0);
            this.lMd.setVisibility(8);
        } else {
            this.lMd.setVisibility(0);
            this.jU.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.zp
    public void zp() {
        ImageView imageView = this.lMd;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.jU;
        if (textView != null) {
            textView.performClick();
        }
    }
}
