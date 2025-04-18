package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.widget.lG;
import com.bytedance.sdk.openadsdk.core.widget.rkt;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN extends com.bytedance.sdk.openadsdk.core.wN.wN {
    private TextView AlY;
    private TextView Sg;
    private rkt YFl;
    private lG tN;

    /* renamed from: vc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.reward.YFl.YFl f10612vc;
    private boolean wN;

    /* loaded from: classes.dex */
    public static class YFl implements com.bytedance.sdk.component.wN.rkt<Bitmap> {
        private final WeakReference<ImageView> AlY;
        private final String Sg;
        private final Wwa YFl;
        private final String tN;

        public YFl(ImageView imageView, Wwa wwa, String str, String str2) {
            this.AlY = new WeakReference<>(imageView);
            this.YFl = wwa;
            this.Sg = str;
            this.tN = str2;
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(com.bytedance.sdk.component.wN.eT<Bitmap> eTVar) {
            if (eTVar == null || eTVar.Sg() == null) {
                return;
            }
            ImageView imageView = this.AlY.get();
            if (imageView != null) {
                imageView.setImageBitmap(eTVar.Sg());
            }
            com.bytedance.sdk.openadsdk.AlY.tN.Sg(this.YFl, this.tN, "load_vast_icon_success", (JSONObject) null);
        }

        @Override // com.bytedance.sdk.component.wN.rkt
        public void YFl(int i10, String str, @Nullable Throwable th2) {
            YFl(i10, str, this.Sg);
        }

        private void YFl(final int i10, final String str, final String str2) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(new com.bytedance.sdk.component.qsH.qsH("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.tN.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i10);
                        jSONObject.put("description", i10 + ":" + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.AlY.tN.Sg(YFl.this.YFl, YFl.this.tN, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }

    public tN(@NonNull Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    private void AlY() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(GS.tN(context, 16.0f), GS.tN(context, 12.0f), GS.tN(context, 16.0f), GS.tN(context, 12.0f));
        lG lGVar = new lG(context);
        this.tN = lGVar;
        lGVar.setBackgroundColor(0);
        this.tN.setId(GA.Sg);
        addView(this.tN, new LinearLayout.LayoutParams(GS.tN(context, 48.0f), GS.tN(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = GS.tN(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(wNVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.AlY = qsh;
        qsh.setEllipsize(TextUtils.TruncateAt.END);
        this.AlY.setGravity(16);
        this.AlY.setSingleLine(true);
        this.AlY.setTextSize(2, 17.0f);
        this.AlY.setId(GA.tN);
        this.AlY.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        wNVar.addView(this.AlY, new LinearLayout.LayoutParams(-1, -2));
        rkt rktVar = new rkt(context);
        this.YFl = rktVar;
        rktVar.setId(GA.wN);
        wNVar.addView(this.YFl, new LinearLayout.LayoutParams(-2, GS.tN(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.Sg = qsh2;
        qsh2.setGravity(17);
        this.Sg.setEllipsize(TextUtils.TruncateAt.END);
        this.Sg.setSingleLine(true);
        this.Sg.setTextColor(-1);
        this.Sg.setTextSize(2, 16.0f);
        this.Sg.setId(520093705);
        this.Sg.setBackground(YFl(context));
        this.Sg.setText(this.f10612vc.Sg.lL());
        addView(this.Sg, new LinearLayout.LayoutParams(GS.tN(context, 164.0f), GS.tN(context, 36.0f)));
    }

    private String getCnOrEnBtnText() {
        return this.f10612vc.Sg.ko() != 4 ? "View" : "Install";
    }

    private void tN() {
        String lL;
        this.wN = true;
        if (this.f10612vc.Cqy == 1) {
            wN();
        } else {
            AlY();
        }
        if (this.Sg == null) {
            this.Sg = (TextView) this.f10612vc.mB.findViewById(520093705);
        }
        Wwa wwa = this.f10612vc.Sg;
        TextView textView = this.Sg;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.tN.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    int width = ((ViewGroup) tN.this.Sg.getParent()).getWidth();
                    if (width > 0) {
                        tN.this.Sg.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (wwa.yn()) {
                if (wwa.Af() != null && TextUtils.isEmpty(wwa.Af().vc())) {
                    GS.YFl((View) this.Sg, 8);
                }
            } else {
                TextView textView2 = this.Sg;
                if (wwa.Cfr() == 3) {
                    lL = getButtonTextForNewStyleBar();
                } else {
                    lL = wwa.lL();
                }
                textView2.setText(lL);
            }
        }
        if (this.tN != null && wwa.dGX() != null && !TextUtils.isEmpty(wwa.dGX().YFl())) {
            String YFl2 = wwa.dGX().YFl();
            if (wwa.yn()) {
                com.bytedance.sdk.openadsdk.NjR.AlY.YFl(wwa.dGX()).tN(2).YFl(new com.bytedance.sdk.openadsdk.NjR.Sg(wwa, wwa.dGX().YFl(), new YFl(this.tN, wwa, YFl2, this.f10612vc.wN)));
                if (wwa.Af() != null && wwa.Af().Sg() != null) {
                    wwa.Af().Sg().Sg(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(wwa.dGX(), this.tN, wwa);
            }
        }
        TextView textView3 = this.AlY;
        if (textView3 != null) {
            textView3.setText(wwa.Hjb());
        }
        rkt rktVar = this.YFl;
        if (rktVar != null) {
            GS.YFl((TextView) null, rktVar, wwa);
        }
        if (this.f10612vc.Cqy == 2 && wwa.Cfr() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.Sg.getLayoutParams();
            layoutParams.height = GS.tN(this.f10612vc.BPI, 55.0f);
            layoutParams.topMargin = GS.tN(this.f10612vc.BPI, 20.0f);
            this.Sg.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = GS.tN(this.f10612vc.BPI, 12.0f);
            setLayoutParams(layoutParams2);
        }
        Sg();
    }

    private void wN() {
        Context context = getContext();
        setPadding(GS.tN(context, 16.0f), GS.tN(context, 16.0f), GS.tN(context, 16.0f), GS.tN(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setOrientation(0);
        wNVar.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = GS.tN(context, 12.0f);
        addView(wNVar, layoutParams);
        lG lGVar = new lG(context);
        this.tN = lGVar;
        lGVar.setBackgroundColor(0);
        this.tN.setId(GA.Sg);
        wNVar.addView(this.tN, new LinearLayout.LayoutParams(GS.tN(context, 48.0f), GS.tN(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = GS.tN(context, 12.0f);
        wNVar.addView(wNVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.AlY = qsh;
        qsh.setEllipsize(TextUtils.TruncateAt.END);
        this.AlY.setGravity(16);
        this.AlY.setSingleLine(true);
        this.AlY.setTextSize(2, 17.0f);
        this.AlY.setId(GA.tN);
        this.AlY.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        wNVar2.addView(this.AlY, new LinearLayout.LayoutParams(-1, -2));
        rkt rktVar = new rkt(context);
        this.YFl = rktVar;
        rktVar.setId(GA.wN);
        wNVar2.addView(this.YFl, new LinearLayout.LayoutParams(-2, GS.tN(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.Sg = qsh2;
        qsh2.setGravity(17);
        this.Sg.setEllipsize(TextUtils.TruncateAt.END);
        this.Sg.setSingleLine(true);
        this.Sg.setTextColor(-1);
        this.Sg.setTextSize(2, 16.0f);
        this.Sg.setId(520093705);
        this.Sg.setBackground(YFl(context));
        this.Sg.setText(this.f10612vc.Sg.lL());
        addView(this.Sg, new LinearLayout.LayoutParams(-1, GS.tN(context, 36.0f)));
    }

    public String getButtonTextForNewStyleBar() {
        boolean z10;
        String lL;
        String DSW = Sco.DSW(this.f10612vc.BPI);
        if (DSW == null) {
            DSW = "";
        }
        try {
            z10 = DSW.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            z10 = false;
        }
        if (TextUtils.isEmpty(this.f10612vc.Sg.lL())) {
            lL = this.f10612vc.Sg.ko() != 4 ? "View" : "Install";
        } else {
            lL = this.f10612vc.Sg.lL();
            if (lL != null && Sco.vc(lL) && lL.length() > 2) {
                if (z10) {
                    lL = getCnOrEnBtnText();
                }
            } else if (lL != null && !Sco.vc(lL) && lL.length() > 7 && z10) {
                lL = getCnOrEnBtnText();
            }
        }
        if (z10 && !Sco.vc(lL)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.Sg.getLayoutParams();
            layoutParams.bottomMargin = GS.tN(this.f10612vc.BPI, 4.0f);
            this.Sg.setLayoutParams(layoutParams);
        }
        return lL;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0 && !this.wN) {
            tN();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Sg() {
        com.bytedance.sdk.openadsdk.core.Sg.wN wN = this.f10612vc.dXO.wN();
        final com.bytedance.sdk.openadsdk.core.Sg.Sg AlY = this.f10612vc.dXO.AlY();
        final Wwa wwa = this.f10612vc.Sg;
        if (wwa.hQ() == null) {
            return;
        }
        if (wwa.Cfr() != 5 && this.Sg != null) {
            if (wwa.hQ().wN) {
                this.Sg.setOnClickListener(wN);
                this.Sg.setOnTouchListener(wN);
            } else {
                this.Sg.setOnClickListener(AlY);
            }
        }
        if (wwa.Cfr() == 5) {
            String str = "VAST_ICON";
            if (wwa.hQ().wN) {
                com.bytedance.sdk.openadsdk.core.Sg.DSW dsw = new com.bytedance.sdk.openadsdk.core.Sg.DSW("VAST_ACTION_BUTTON", wwa.Af(), wN) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.tN.2
                };
                com.bytedance.sdk.openadsdk.core.Sg.DSW dsw2 = new com.bytedance.sdk.openadsdk.core.Sg.DSW(str, wwa.Af(), wN) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.tN.3
                };
                TextView textView = this.Sg;
                if (textView != null) {
                    textView.setOnClickListener(dsw);
                    this.Sg.setOnTouchListener(dsw);
                }
                lG lGVar = this.tN;
                if (lGVar != null) {
                    lGVar.setOnClickListener(dsw2);
                    this.tN.setOnTouchListener(dsw2);
                }
                TextView textView2 = this.AlY;
                if (textView2 == null || TextUtils.isEmpty(textView2.getText())) {
                    return;
                }
                this.AlY.setOnClickListener(dsw);
                this.AlY.setOnTouchListener(dsw);
                return;
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.tN.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = AlY;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view != null && "VAST_ICON".equals(view.getTag(570425345))) {
                        if (wwa.Af() != null && wwa.Af().Sg() != null) {
                            wwa.Af().Sg().YFl(tN.this.f10612vc.VOe.DSW());
                            return;
                        }
                        return;
                    }
                    if (wwa.Af() != null) {
                        wwa.Af().YFl().DSW(tN.this.f10612vc.VOe.DSW());
                    }
                }
            };
            TextView textView3 = this.Sg;
            if (textView3 != null) {
                textView3.setOnClickListener(onClickListener);
            }
            TextView textView4 = this.AlY;
            if (textView4 != null && !TextUtils.isEmpty(textView4.getText())) {
                this.AlY.setOnClickListener(onClickListener);
            }
            lG lGVar2 = this.tN;
            if (lGVar2 != null) {
                lGVar2.setTag(570425345, "VAST_ICON");
                this.tN.setOnClickListener(AlY);
                return;
            }
            return;
        }
        this.Sg.setOnClickListener(wN);
        this.AlY.setOnClickListener(wN);
        this.YFl.setOnClickListener(wN);
        this.tN.setOnClickListener(wN);
    }

    public void YFl() {
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe ofFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe ofFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe ofFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6), PropertyValuesHolder.ofKeyframe("scaleY", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6));
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.start();
    }

    public void YFl(com.bytedance.sdk.openadsdk.component.reward.YFl.YFl yFl) {
        this.f10612vc = yFl;
        if (yFl.Sg.Cfr() == 1) {
            tN();
        }
    }

    private static Drawable YFl(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(GS.tN(context, 18.0f));
        return gradientDrawable;
    }
}
