package com.google.android.exoplayer2.ui;

import a9.a;
import a9.b;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l9.c;
import l9.d;
import l9.s;
import l9.t;
import l9.y;
import n9.h0;
import v8.u0;

@Deprecated
/* loaded from: classes3.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public List f11522b;

    /* renamed from: c, reason: collision with root package name */
    public d f11523c;

    /* renamed from: d, reason: collision with root package name */
    public int f11524d;

    /* renamed from: f, reason: collision with root package name */
    public float f11525f;

    /* renamed from: g, reason: collision with root package name */
    public float f11526g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11527h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11528i;

    /* renamed from: j, reason: collision with root package name */
    public int f11529j;

    /* renamed from: k, reason: collision with root package name */
    public s f11530k;

    /* renamed from: l, reason: collision with root package name */
    public View f11531l;

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11522b = Collections.emptyList();
        this.f11523c = d.f21180g;
        this.f11524d = 0;
        this.f11525f = 0.0533f;
        this.f11526g = 0.08f;
        this.f11527h = true;
        this.f11528i = true;
        c cVar = new c(context);
        this.f11530k = cVar;
        this.f11531l = cVar;
        addView(cVar);
        this.f11529j = 1;
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.f11527h && this.f11528i) {
            return this.f11522b;
        }
        ArrayList arrayList = new ArrayList(this.f11522b.size());
        for (int i10 = 0; i10 < this.f11522b.size(); i10++) {
            b bVar = (b) this.f11522b.get(i10);
            bVar.getClass();
            a aVar = new a(bVar);
            if (!this.f11527h) {
                aVar.f355n = false;
                CharSequence charSequence = aVar.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        aVar.a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = aVar.a;
                    charSequence2.getClass();
                    u0.d0((Spannable) charSequence2, new t(1));
                }
                u0.c0(aVar);
            } else if (!this.f11528i) {
                u0.c0(aVar);
            }
            arrayList.add(aVar.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (h0.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private d getUserCaptionStyle() {
        CaptioningManager captioningManager;
        d dVar;
        int i10;
        int i11;
        int i12;
        int i13 = h0.a;
        d dVar2 = d.f21180g;
        if (i13 >= 19 && !isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            if (i13 >= 21) {
                int i14 = -1;
                if (userStyle.hasForegroundColor()) {
                    i10 = userStyle.foregroundColor;
                } else {
                    i10 = -1;
                }
                if (userStyle.hasBackgroundColor()) {
                    i11 = userStyle.backgroundColor;
                } else {
                    i11 = ViewCompat.MEASURED_STATE_MASK;
                }
                int i15 = i11;
                int i16 = 0;
                if (userStyle.hasWindowColor()) {
                    i12 = userStyle.windowColor;
                } else {
                    i12 = 0;
                }
                if (userStyle.hasEdgeType()) {
                    i16 = userStyle.edgeType;
                }
                int i17 = i16;
                if (userStyle.hasEdgeColor()) {
                    i14 = userStyle.edgeColor;
                }
                dVar = new d(i10, i15, i12, i17, i14, userStyle.getTypeface());
            } else {
                dVar = new d(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
            }
            return dVar;
        }
        return dVar2;
    }

    private <T extends View & s> void setView(T t5) {
        removeView(this.f11531l);
        View view = this.f11531l;
        if (view instanceof y) {
            ((y) view).f21280c.destroy();
        }
        this.f11531l = t5;
        this.f11530k = t5;
        addView(t5);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f11530k.a(getCuesWithStylingPreferencesApplied(), this.f11523c, this.f11525f, this.f11524d, this.f11526g);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f11528i = z10;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f11527h = z10;
        c();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f11526g = f10;
        c();
    }

    public void setCues(@Nullable List<b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f11522b = list;
        c();
    }

    public void setFractionalTextSize(float f10) {
        this.f11524d = 0;
        this.f11525f = f10;
        c();
    }

    public void setStyle(d dVar) {
        this.f11523c = dVar;
        c();
    }

    public void setViewType(int i10) {
        if (this.f11529j == i10) {
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                setView(new y(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new c(getContext()));
        }
        this.f11529j = i10;
    }
}
