package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.applovin.impl.b5;
import com.applovin.impl.qh;
import com.applovin.impl.x2;
import com.applovin.impl.xp;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements qh.e {

    /* renamed from: a, reason: collision with root package name */
    private List f22524a;

    /* renamed from: b, reason: collision with root package name */
    private x2 f22525b;

    /* renamed from: c, reason: collision with root package name */
    private int f22526c;
    private float d;

    /* renamed from: f, reason: collision with root package name */
    private float f22527f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22528g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f22529h;

    /* renamed from: i, reason: collision with root package name */
    private int f22530i;

    /* renamed from: j, reason: collision with root package name */
    private a f22531j;

    /* renamed from: k, reason: collision with root package name */
    private View f22532k;

    /* loaded from: classes.dex */
    public interface a {
        void a(List list, x2 x2Var, float f2, int i2, float f3);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private b5 a(b5 b5Var) {
        b5.b a2 = b5Var.a();
        if (!this.f22528g) {
            h.a(a2);
        } else if (!this.f22529h) {
            h.b(a2);
        }
        return a2.a();
    }

    private void e() {
        this.f22531j.a(getCuesWithStylingPreferencesApplied(), this.f22525b, this.d, this.f22526c, this.f22527f);
    }

    private List<b5> getCuesWithStylingPreferencesApplied() {
        if (this.f22528g && this.f22529h) {
            return this.f22524a;
        }
        ArrayList arrayList = new ArrayList(this.f22524a.size());
        for (int i2 = 0; i2 < this.f22524a.size(); i2++) {
            arrayList.add(a((b5) this.f22524a.get(i2)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (xp.f27962a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private x2 getUserCaptionStyle() {
        if (xp.f27962a < 19 || isInEditMode()) {
            return x2.f27825g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? x2.f27825g : x2.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t2) {
        removeView(this.f22532k);
        View view = this.f22532k;
        if (view instanceof j) {
            ((j) view).a();
        }
        this.f22532k = t2;
        this.f22531j = t2;
        addView(t2);
    }

    public void c() {
        setStyle(getUserCaptionStyle());
    }

    public void d() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setApplyEmbeddedFontSizes(boolean z2) {
        this.f22529h = z2;
        e();
    }

    public void setApplyEmbeddedStyles(boolean z2) {
        this.f22528g = z2;
        e();
    }

    public void setBottomPaddingFraction(float f2) {
        this.f22527f = f2;
        e();
    }

    public void setCues(@Nullable List<b5> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f22524a = list;
        e();
    }

    public void setFractionalTextSize(float f2) {
        a(f2, false);
    }

    public void setStyle(x2 x2Var) {
        this.f22525b = x2Var;
        e();
    }

    public void setViewType(int i2) {
        if (this.f22530i == i2) {
            return;
        }
        if (i2 == 1) {
            setView(new com.applovin.exoplayer2.ui.a(getContext()));
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new j(getContext()));
        }
        this.f22530i = i2;
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22524a = Collections.emptyList();
        this.f22525b = x2.f27825g;
        this.f22526c = 0;
        this.d = 0.0533f;
        this.f22527f = 0.08f;
        this.f22528g = true;
        this.f22529h = true;
        com.applovin.exoplayer2.ui.a aVar = new com.applovin.exoplayer2.ui.a(context);
        this.f22531j = aVar;
        this.f22532k = aVar;
        addView(aVar);
        this.f22530i = 1;
    }

    @Override // com.applovin.impl.qh.e
    public void a(List list) {
        setCues(list);
    }

    public void a(float f2, boolean z2) {
        a(z2 ? 1 : 0, f2);
    }

    private void a(int i2, float f2) {
        this.f22526c = i2;
        this.d = f2;
        e();
    }
}
