package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.applovin.impl.nh;
import com.applovin.impl.v2;
import com.applovin.impl.yp;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements nh.e {
    private List a;

    /* renamed from: b, reason: collision with root package name */
    private v2 f3431b;

    /* renamed from: c, reason: collision with root package name */
    private int f3432c;

    /* renamed from: d, reason: collision with root package name */
    private float f3433d;

    /* renamed from: f, reason: collision with root package name */
    private float f3434f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3435g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3436h;

    /* renamed from: i, reason: collision with root package name */
    private int f3437i;

    /* renamed from: j, reason: collision with root package name */
    private a f3438j;

    /* renamed from: k, reason: collision with root package name */
    private View f3439k;

    /* loaded from: classes.dex */
    public interface a {
        void a(List list, v2 v2Var, float f10, int i10, float f11);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private z4 a(z4 z4Var) {
        z4.b a10 = z4Var.a();
        if (!this.f3435g) {
            h.a(a10);
        } else if (!this.f3436h) {
            h.b(a10);
        }
        return a10.a();
    }

    private void e() {
        this.f3438j.a(getCuesWithStylingPreferencesApplied(), this.f3431b, this.f3433d, this.f3432c, this.f3434f);
    }

    private List<z4> getCuesWithStylingPreferencesApplied() {
        if (this.f3435g && this.f3436h) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i10 = 0; i10 < this.a.size(); i10++) {
            arrayList.add(a((z4) this.a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (yp.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private v2 getUserCaptionStyle() {
        if (yp.a >= 19 && !isInEditMode()) {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                return v2.a(captioningManager.getUserStyle());
            }
            return v2.f8452g;
        }
        return v2.f8452g;
    }

    private <T extends View & a> void setView(T t5) {
        removeView(this.f3439k);
        View view = this.f3439k;
        if (view instanceof j) {
            ((j) view).a();
        }
        this.f3439k = t5;
        this.f3438j = t5;
        addView(t5);
    }

    public void c() {
        setStyle(getUserCaptionStyle());
    }

    public void d() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f3436h = z10;
        e();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f3435g = z10;
        e();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f3434f = f10;
        e();
    }

    public void setCues(@Nullable List<z4> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        e();
    }

    public void setFractionalTextSize(float f10) {
        a(f10, false);
    }

    public void setStyle(v2 v2Var) {
        this.f3431b = v2Var;
        e();
    }

    public void setViewType(int i10) {
        if (this.f3437i == i10) {
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                setView(new j(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new com.applovin.exoplayer2.ui.a(getContext()));
        }
        this.f3437i = i10;
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.emptyList();
        this.f3431b = v2.f8452g;
        this.f3432c = 0;
        this.f3433d = 0.0533f;
        this.f3434f = 0.08f;
        this.f3435g = true;
        this.f3436h = true;
        com.applovin.exoplayer2.ui.a aVar = new com.applovin.exoplayer2.ui.a(context);
        this.f3438j = aVar;
        this.f3439k = aVar;
        addView(aVar);
        this.f3437i = 1;
    }

    @Override // com.applovin.impl.nh.e
    public void a(List list) {
        setCues(list);
    }

    public void a(float f10, boolean z10) {
        a(z10 ? 1 : 0, f10);
    }

    private void a(int i10, float f10) {
        this.f3432c = i10;
        this.f3433d = f10;
        e();
    }
}
