package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.applovin.impl.v2;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class a extends View implements SubtitleView.a {
    private final List a;

    /* renamed from: b, reason: collision with root package name */
    private List f3440b;

    /* renamed from: c, reason: collision with root package name */
    private int f3441c;

    /* renamed from: d, reason: collision with root package name */
    private float f3442d;

    /* renamed from: f, reason: collision with root package name */
    private v2 f3443f;

    /* renamed from: g, reason: collision with root package name */
    private float f3444g;

    public a(Context context) {
        this(context, null);
    }

    private static z4 a(z4 z4Var) {
        z4.b b3 = z4Var.a().b(-3.4028235E38f).b(Integer.MIN_VALUE).b((Layout.Alignment) null);
        if (z4Var.f9325g == 0) {
            b3.a(1.0f - z4Var.f9324f, 0);
        } else {
            b3.a((-z4Var.f9324f) - 1.0f, 1);
        }
        int i10 = z4Var.f9326h;
        if (i10 == 0) {
            b3.a(2);
        } else if (i10 == 2) {
            b3.a(0);
        }
        return b3.a();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.f3440b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom > paddingTop && width > paddingLeft) {
            int i10 = paddingBottom - paddingTop;
            float a = h.a(this.f3441c, this.f3442d, height, i10);
            if (a <= 0.0f) {
                return;
            }
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                z4 z4Var = (z4) list.get(i11);
                if (z4Var.f9335q != Integer.MIN_VALUE) {
                    z4Var = a(z4Var);
                }
                z4 z4Var2 = z4Var;
                int i12 = paddingBottom;
                ((g) this.a.get(i11)).a(z4Var2, this.f3443f, a, h.a(z4Var2.f9333o, z4Var2.f9334p, height, i10), this.f3444g, canvas, paddingLeft, paddingTop, width, i12);
                i11++;
                size = size;
                i10 = i10;
                paddingBottom = i12;
                width = width;
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.f3440b = Collections.emptyList();
        this.f3441c = 0;
        this.f3442d = 0.0533f;
        this.f3443f = v2.f8452g;
        this.f3444g = 0.08f;
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List list, v2 v2Var, float f10, int i10, float f11) {
        this.f3440b = list;
        this.f3443f = v2Var;
        this.f3442d = f10;
        this.f3441c = i10;
        this.f3444g = f11;
        while (this.a.size() < list.size()) {
            this.a.add(new g(getContext()));
        }
        invalidate();
    }
}
