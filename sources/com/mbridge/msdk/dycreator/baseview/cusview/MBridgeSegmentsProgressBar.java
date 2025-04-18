package com.mbridge.msdk.dycreator.baseview.cusview;

import a4.j;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MBridgeSegmentsProgressBar extends LinearLayout {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private int f12801b;

    /* renamed from: c, reason: collision with root package name */
    private int f12802c;

    /* renamed from: d, reason: collision with root package name */
    private int f12803d;

    /* renamed from: e, reason: collision with root package name */
    private int f12804e;

    /* renamed from: f, reason: collision with root package name */
    private int f12805f;

    /* renamed from: g, reason: collision with root package name */
    private int f12806g;

    /* renamed from: h, reason: collision with root package name */
    private int f12807h;

    /* renamed from: i, reason: collision with root package name */
    private List<ProgressBar> f12808i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f12809j;

    /* renamed from: k, reason: collision with root package name */
    private String f12810k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12811l;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.a = "MBridgeSegmentsProgressBar";
        this.f12802c = 1;
        this.f12803d = 20;
        this.f12804e = 10;
        this.f12805f = 1;
        this.f12806g = -1711276033;
        this.f12807h = -1;
        this.f12808i = new ArrayList();
        this.f12811l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.f12811l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            ad.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        try {
            if (this.f12802c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f12810k)) {
                    this.f12810k = this.f12811l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f12802c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f12810k)) {
                    this.f12810k = this.f12811l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f12808i.clear();
            removeAllViews();
            setBackground(c());
            TextView textView = new TextView(getContext());
            this.f12809j = textView;
            textView.setTextColor(-1);
            this.f12809j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f12809j.setLayoutParams(layoutParams);
            if (this.f12802c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f12809j;
                int i10 = this.f12803d;
                textView2.setPadding(i10 / 2, 15, i10 / 2, 5);
            }
            if (this.f12802c == 2) {
                this.f12809j.setGravity(16);
                TextView textView3 = this.f12809j;
                int i11 = this.f12803d;
                textView3.setPadding(i11 / 2, 0, i11 / 2, 0);
            }
            try {
                int a = v.a(getContext(), "mbridge_reward_video_icon", "drawable");
                if (a != 0 && (drawable = getContext().getResources().getDrawable(a)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f12809j.setCompoundDrawables(drawable, null, null, null);
                    this.f12809j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th3) {
                ad.b("MBridgeSegmentsProgressBar", th3.getMessage());
            }
            this.f12809j.setText(a(this.f12805f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i12 = 0; i12 < this.f12801b; i12++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(b());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i13 = this.f12803d;
                layoutParams3.leftMargin = i13 / 2;
                layoutParams3.rightMargin = i13 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f12808i.add(progressBar);
            }
            int i14 = this.f12802c;
            if (i14 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f12809j);
                addView(linearLayout);
            } else {
                if (i14 == 2) {
                    setPadding(15, 0, 15, 25);
                    layoutParams2.gravity = 16;
                    layoutParams2.weight = 1.0f;
                    addView(linearLayout);
                    addView(this.f12809j);
                    return;
                }
                addView(linearLayout);
            }
        } catch (Throwable th4) {
            ad.b("MBridgeSegmentsProgressBar", th4.getMessage());
        }
    }

    private LayerDrawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f12804e);
        gradientDrawable.setColor(this.f12806g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f12804e);
        gradientDrawable2.setColor(this.f12807h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    private GradientDrawable c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public void init(int i10, int i11) {
        this.f12801b = i10;
        this.f12802c = i11;
        a();
    }

    public void setIndicatorText(String str) {
        this.f12810k = str;
    }

    public void setProgress(int i10, int i11) {
        try {
            if (this.f12808i.size() == 0) {
                return;
            }
            if (i11 < this.f12808i.size()) {
                this.f12808i.get(i11).setProgress(i10);
            }
            int i12 = i11 + 1;
            if (i12 > this.f12805f) {
                this.f12805f = i12;
                TextView textView = this.f12809j;
                if (textView != null) {
                    textView.setText(a(i12));
                }
            }
        } catch (Throwable th2) {
            ad.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
    }

    public void init(int i10, int i11, int i12, int i13) {
        this.f12801b = i10;
        this.f12802c = i11;
        this.f12807h = i12;
        this.f12806g = i13;
        a();
    }

    public void init(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f12801b = i10;
        this.f12802c = i11;
        this.f12807h = i12;
        this.f12806g = i13;
        this.f12803d = i14;
        this.f12804e = i15;
        a();
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "MBridgeSegmentsProgressBar";
        this.f12802c = 1;
        this.f12803d = 20;
        this.f12804e = 10;
        this.f12805f = 1;
        this.f12806g = -1711276033;
        this.f12807h = -1;
        this.f12808i = new ArrayList();
        this.f12811l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = "MBridgeSegmentsProgressBar";
        this.f12802c = 1;
        this.f12803d = 20;
        this.f12804e = 10;
        this.f12805f = 1;
        this.f12806g = -1711276033;
        this.f12807h = -1;
        this.f12808i = new ArrayList();
        this.f12811l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.a = "MBridgeSegmentsProgressBar";
        this.f12802c = 1;
        this.f12803d = 20;
        this.f12804e = 10;
        this.f12805f = 1;
        this.f12806g = -1711276033;
        this.f12807h = -1;
        this.f12808i = new ArrayList();
        this.f12811l = false;
    }

    private StringBuilder a(int i10) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(String.format(this.f12810k, Integer.valueOf(i10), Integer.valueOf(this.f12801b)));
        } catch (Throwable th2) {
            j.y(sb2, this.f12801b, "videos, the", i10, " is playing.");
            ad.b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        return sb2;
    }
}
