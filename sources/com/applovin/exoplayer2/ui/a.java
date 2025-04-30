package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.applovin.impl.C0768v2;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class a extends View implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f6188a;
    private List b;

    /* renamed from: c, reason: collision with root package name */
    private int f6189c;

    /* renamed from: d, reason: collision with root package name */
    private float f6190d;

    /* renamed from: f, reason: collision with root package name */
    private C0768v2 f6191f;

    /* renamed from: g, reason: collision with root package name */
    private float f6192g;

    public a(Context context) {
        this(context, null);
    }

    private static z4 a(z4 z4Var) {
        z4.b b = z4Var.a().b(-3.4028235E38f).b(Integer.MIN_VALUE).b((Layout.Alignment) null);
        if (z4Var.f12509g == 0) {
            b.a(1.0f - z4Var.f12508f, 0);
        } else {
            b.a((-z4Var.f12508f) - 1.0f, 1);
        }
        int i9 = z4Var.f12510h;
        if (i9 == 0) {
            b.a(2);
        } else if (i9 == 2) {
            b.a(0);
        }
        return b.a();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom > paddingTop && width > paddingLeft) {
            int i9 = paddingBottom - paddingTop;
            float a6 = h.a(this.f6189c, this.f6190d, height, i9);
            if (a6 <= 0.0f) {
                return;
            }
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                z4 z4Var = (z4) list.get(i10);
                if (z4Var.f12517q != Integer.MIN_VALUE) {
                    z4Var = a(z4Var);
                }
                z4 z4Var2 = z4Var;
                int i11 = paddingBottom;
                ((g) this.f6188a.get(i10)).a(z4Var2, this.f6191f, a6, h.a(z4Var2.f12515o, z4Var2.f12516p, height, i9), this.f6192g, canvas, paddingLeft, paddingTop, width, i11);
                i10++;
                size = size;
                i9 = i9;
                paddingBottom = i11;
                width = width;
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6188a = new ArrayList();
        this.b = Collections.emptyList();
        this.f6189c = 0;
        this.f6190d = 0.0533f;
        this.f6191f = C0768v2.f11659g;
        this.f6192g = 0.08f;
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List list, C0768v2 c0768v2, float f9, int i9, float f10) {
        this.b = list;
        this.f6191f = c0768v2;
        this.f6190d = f9;
        this.f6189c = i9;
        this.f6192g = f10;
        while (this.f6188a.size() < list.size()) {
            this.f6188a.add(new g(getContext()));
        }
        invalidate();
    }
}
