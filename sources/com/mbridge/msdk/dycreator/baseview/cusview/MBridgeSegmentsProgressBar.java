package com.mbridge.msdk.dycreator.baseview.cusview;

import Q7.n0;
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

/* loaded from: classes3.dex */
public class MBridgeSegmentsProgressBar extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f15128a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f15129c;

    /* renamed from: d, reason: collision with root package name */
    private int f15130d;

    /* renamed from: e, reason: collision with root package name */
    private int f15131e;

    /* renamed from: f, reason: collision with root package name */
    private int f15132f;

    /* renamed from: g, reason: collision with root package name */
    private int f15133g;

    /* renamed from: h, reason: collision with root package name */
    private int f15134h;

    /* renamed from: i, reason: collision with root package name */
    private List<ProgressBar> f15135i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f15136j;

    /* renamed from: k, reason: collision with root package name */
    private String f15137k;
    private boolean l;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f15128a = "MBridgeSegmentsProgressBar";
        this.f15129c = 1;
        this.f15130d = 20;
        this.f15131e = 10;
        this.f15132f = 1;
        this.f15133g = -1711276033;
        this.f15134h = -1;
        this.f15135i = new ArrayList();
        this.l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        try {
            if (this.f15129c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f15137k)) {
                    this.f15137k = this.l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f15129c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f15137k)) {
                    this.f15137k = this.l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f15135i.clear();
            removeAllViews();
            setBackground(c());
            TextView textView = new TextView(getContext());
            this.f15136j = textView;
            textView.setTextColor(-1);
            this.f15136j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f15136j.setLayoutParams(layoutParams);
            if (this.f15129c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f15136j;
                int i9 = this.f15130d;
                textView2.setPadding(i9 / 2, 15, i9 / 2, 5);
            }
            if (this.f15129c == 2) {
                this.f15136j.setGravity(16);
                TextView textView3 = this.f15136j;
                int i10 = this.f15130d;
                textView3.setPadding(i10 / 2, 0, i10 / 2, 0);
            }
            try {
                int a6 = v.a(getContext(), "mbridge_reward_video_icon", "drawable");
                if (a6 != 0 && (drawable = getContext().getResources().getDrawable(a6)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f15136j.setCompoundDrawables(drawable, null, null, null);
                    this.f15136j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th2) {
                ad.b("MBridgeSegmentsProgressBar", th2.getMessage());
            }
            this.f15136j.setText(a(this.f15132f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i11 = 0; i11 < this.b; i11++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(b());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i12 = this.f15130d;
                layoutParams3.leftMargin = i12 / 2;
                layoutParams3.rightMargin = i12 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f15135i.add(progressBar);
            }
            int i13 = this.f15129c;
            if (i13 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f15136j);
                addView(linearLayout);
            } else {
                if (i13 == 2) {
                    setPadding(15, 0, 15, 25);
                    layoutParams2.gravity = 16;
                    layoutParams2.weight = 1.0f;
                    addView(linearLayout);
                    addView(this.f15136j);
                    return;
                }
                addView(linearLayout);
            }
        } catch (Throwable th3) {
            ad.b("MBridgeSegmentsProgressBar", th3.getMessage());
        }
    }

    private LayerDrawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f15131e);
        gradientDrawable.setColor(this.f15133g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f15131e);
        gradientDrawable2.setColor(this.f15134h);
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

    public void init(int i9, int i10) {
        this.b = i9;
        this.f15129c = i10;
        a();
    }

    public void setIndicatorText(String str) {
        this.f15137k = str;
    }

    public void setProgress(int i9, int i10) {
        try {
            if (this.f15135i.size() == 0) {
                return;
            }
            if (i10 < this.f15135i.size()) {
                this.f15135i.get(i10).setProgress(i9);
            }
            int i11 = i10 + 1;
            if (i11 > this.f15132f) {
                this.f15132f = i11;
                TextView textView = this.f15136j;
                if (textView != null) {
                    textView.setText(a(i11));
                }
            }
        } catch (Throwable th) {
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
    }

    public void init(int i9, int i10, int i11, int i12) {
        this.b = i9;
        this.f15129c = i10;
        this.f15134h = i11;
        this.f15133g = i12;
        a();
    }

    public void init(int i9, int i10, int i11, int i12, int i13, int i14) {
        this.b = i9;
        this.f15129c = i10;
        this.f15134h = i11;
        this.f15133g = i12;
        this.f15130d = i13;
        this.f15131e = i14;
        a();
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15128a = "MBridgeSegmentsProgressBar";
        this.f15129c = 1;
        this.f15130d = 20;
        this.f15131e = 10;
        this.f15132f = 1;
        this.f15133g = -1711276033;
        this.f15134h = -1;
        this.f15135i = new ArrayList();
        this.l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15128a = "MBridgeSegmentsProgressBar";
        this.f15129c = 1;
        this.f15130d = 20;
        this.f15131e = 10;
        this.f15132f = 1;
        this.f15133g = -1711276033;
        this.f15134h = -1;
        this.f15135i = new ArrayList();
        this.l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f15128a = "MBridgeSegmentsProgressBar";
        this.f15129c = 1;
        this.f15130d = 20;
        this.f15131e = 10;
        this.f15132f = 1;
        this.f15133g = -1711276033;
        this.f15134h = -1;
        this.f15135i = new ArrayList();
        this.l = false;
    }

    private StringBuilder a(int i9) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.f15137k, Integer.valueOf(i9), Integer.valueOf(this.b)));
        } catch (Throwable th) {
            n0.t(sb, this.b, "videos, the", i9, " is playing.");
            ad.b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        return sb;
    }
}
