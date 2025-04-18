package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.applovin.impl.b5;
import com.applovin.impl.x2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class a extends View implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f22533a;

    /* renamed from: b, reason: collision with root package name */
    private List f22534b;

    /* renamed from: c, reason: collision with root package name */
    private int f22535c;
    private float d;

    /* renamed from: f, reason: collision with root package name */
    private x2 f22536f;

    /* renamed from: g, reason: collision with root package name */
    private float f22537g;

    public a(Context context) {
        this(context, null);
    }

    private static b5 a(b5 b5Var) {
        b5.b b2 = b5Var.a().b(-3.4028235E38f).b(Integer.MIN_VALUE).b((Layout.Alignment) null);
        if (b5Var.f22994g == 0) {
            b2.a(1.0f - b5Var.f22993f, 0);
        } else {
            b2.a((-b5Var.f22993f) - 1.0f, 1);
        }
        int i2 = b5Var.f22995h;
        if (i2 == 0) {
            b2.a(2);
        } else if (i2 == 2) {
            b2.a(0);
        }
        return b2.a();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.f22534b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i2 = paddingBottom - paddingTop;
        float a2 = h.a(this.f22535c, this.d, height, i2);
        if (a2 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            b5 b5Var = (b5) list.get(i3);
            if (b5Var.f23004q != Integer.MIN_VALUE) {
                b5Var = a(b5Var);
            }
            b5 b5Var2 = b5Var;
            int i4 = paddingBottom;
            ((g) this.f22533a.get(i3)).a(b5Var2, this.f22536f, a2, h.a(b5Var2.f23002o, b5Var2.f23003p, height, i2), this.f22537g, canvas, paddingLeft, paddingTop, width, i4);
            i3++;
            size = size;
            i2 = i2;
            paddingBottom = i4;
            width = width;
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22533a = new ArrayList();
        this.f22534b = Collections.emptyList();
        this.f22535c = 0;
        this.d = 0.0533f;
        this.f22536f = x2.f27825g;
        this.f22537g = 0.08f;
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List list, x2 x2Var, float f2, int i2, float f3) {
        this.f22534b = list;
        this.f22536f = x2Var;
        this.d = f2;
        this.f22535c = i2;
        this.f22537g = f3;
        while (this.f22533a.size() < list.size()) {
            this.f22533a.add(new g(getContext()));
        }
        invalidate();
    }
}
