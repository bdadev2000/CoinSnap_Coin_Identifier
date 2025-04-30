package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.applovin.impl.C0768v2;
import com.applovin.impl.nh;
import com.applovin.impl.yp;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements nh.e {

    /* renamed from: a, reason: collision with root package name */
    private List f6179a;
    private C0768v2 b;

    /* renamed from: c, reason: collision with root package name */
    private int f6180c;

    /* renamed from: d, reason: collision with root package name */
    private float f6181d;

    /* renamed from: f, reason: collision with root package name */
    private float f6182f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6183g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6184h;

    /* renamed from: i, reason: collision with root package name */
    private int f6185i;

    /* renamed from: j, reason: collision with root package name */
    private a f6186j;

    /* renamed from: k, reason: collision with root package name */
    private View f6187k;

    /* loaded from: classes.dex */
    public interface a {
        void a(List list, C0768v2 c0768v2, float f9, int i9, float f10);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private z4 a(z4 z4Var) {
        z4.b a6 = z4Var.a();
        if (!this.f6183g) {
            h.a(a6);
        } else if (!this.f6184h) {
            h.b(a6);
        }
        return a6.a();
    }

    private void e() {
        this.f6186j.a(getCuesWithStylingPreferencesApplied(), this.b, this.f6181d, this.f6180c, this.f6182f);
    }

    private List<z4> getCuesWithStylingPreferencesApplied() {
        if (this.f6183g && this.f6184h) {
            return this.f6179a;
        }
        ArrayList arrayList = new ArrayList(this.f6179a.size());
        for (int i9 = 0; i9 < this.f6179a.size(); i9++) {
            arrayList.add(a((z4) this.f6179a.get(i9)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (yp.f12451a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C0768v2 getUserCaptionStyle() {
        if (yp.f12451a >= 19 && !isInEditMode()) {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                return C0768v2.a(captioningManager.getUserStyle());
            }
            return C0768v2.f11659g;
        }
        return C0768v2.f11659g;
    }

    private <T extends View & a> void setView(T t9) {
        removeView(this.f6187k);
        View view = this.f6187k;
        if (view instanceof j) {
            ((j) view).a();
        }
        this.f6187k = t9;
        this.f6186j = t9;
        addView(t9);
    }

    public void c() {
        setStyle(getUserCaptionStyle());
    }

    public void d() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z8) {
        this.f6184h = z8;
        e();
    }

    public void setApplyEmbeddedStyles(boolean z8) {
        this.f6183g = z8;
        e();
    }

    public void setBottomPaddingFraction(float f9) {
        this.f6182f = f9;
        e();
    }

    public void setCues(@Nullable List<z4> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f6179a = list;
        e();
    }

    public void setFractionalTextSize(float f9) {
        a(f9, false);
    }

    public void setStyle(C0768v2 c0768v2) {
        this.b = c0768v2;
        e();
    }

    public void setViewType(int i9) {
        if (this.f6185i == i9) {
            return;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                setView(new j(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new com.applovin.exoplayer2.ui.a(getContext()));
        }
        this.f6185i = i9;
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6179a = Collections.emptyList();
        this.b = C0768v2.f11659g;
        this.f6180c = 0;
        this.f6181d = 0.0533f;
        this.f6182f = 0.08f;
        this.f6183g = true;
        this.f6184h = true;
        com.applovin.exoplayer2.ui.a aVar = new com.applovin.exoplayer2.ui.a(context);
        this.f6186j = aVar;
        this.f6187k = aVar;
        addView(aVar);
        this.f6185i = 1;
    }

    @Override // com.applovin.impl.nh.e
    public void a(List list) {
        setCues(list);
    }

    public void a(float f9, boolean z8) {
        a(z8 ? 1 : 0, f9);
    }

    private void a(int i9, float f9) {
        this.f6180c = i9;
        this.f6181d = f9;
        e();
    }
}
