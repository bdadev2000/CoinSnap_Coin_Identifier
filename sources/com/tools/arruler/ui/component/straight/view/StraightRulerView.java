package com.tools.arruler.ui.component.straight.view;

import G7.j;
import I.h;
import Y6.a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes3.dex */
public final class StraightRulerView extends View {

    /* renamed from: A, reason: collision with root package name */
    public float f19713A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f19714B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f19715C;
    public final Paint b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f19716c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f19717d;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f19718f;

    /* renamed from: g, reason: collision with root package name */
    public final TextPaint f19719g;

    /* renamed from: h, reason: collision with root package name */
    public final TextPaint f19720h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f19721i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f19722j;

    /* renamed from: k, reason: collision with root package name */
    public float f19723k;
    public float l;
    public final RectF m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f19724n;

    /* renamed from: o, reason: collision with root package name */
    public float f19725o;

    /* renamed from: p, reason: collision with root package name */
    public float f19726p;

    /* renamed from: q, reason: collision with root package name */
    public final float f19727q;

    /* renamed from: r, reason: collision with root package name */
    public final float f19728r;

    /* renamed from: s, reason: collision with root package name */
    public final float f19729s;

    /* renamed from: t, reason: collision with root package name */
    public final float f19730t;

    /* renamed from: u, reason: collision with root package name */
    public float f19731u;

    /* renamed from: v, reason: collision with root package name */
    public float f19732v;

    /* renamed from: w, reason: collision with root package name */
    public float f19733w;

    /* renamed from: x, reason: collision with root package name */
    public float f19734x;

    /* renamed from: y, reason: collision with root package name */
    public float f19735y;

    /* renamed from: z, reason: collision with root package name */
    public a f19736z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StraightRulerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.e(context, "context");
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.f19716c = paint2;
        Paint paint3 = new Paint(1);
        this.f19717d = paint3;
        Paint paint4 = new Paint(1);
        this.f19718f = paint4;
        TextPaint textPaint = new TextPaint(1);
        this.f19719g = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f19720h = textPaint2;
        Paint paint5 = new Paint(1);
        this.f19721i = paint5;
        Paint paint6 = new Paint(1);
        this.f19722j = paint6;
        this.m = new RectF();
        this.f19724n = new RectF();
        this.f19727q = a(10.0f);
        this.f19728r = a(20.0f);
        this.f19731u = a(20.0f);
        this.f19732v = a(15.0f);
        this.f19733w = a(10.0f);
        this.f19736z = a.CM;
        this.f19713A = 1.0f;
        paint.setColor(0);
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint2.setStrokeWidth(5.0f);
        textPaint.setTextSize(a(14.0f));
        textPaint.setColor(h.getColor(getContext(), R.color.color_white));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint2.setTextSize(a(14.0f));
        textPaint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        textPaint2.setTextAlign(align);
        paint3.setColor(h.getColor(getContext(), R.color.color_7F7200));
        paint3.setStrokeWidth(a(3.0f));
        paint4.setColor(h.getColor(getContext(), R.color.color_7F7200));
        paint5.setColor(h.getColor(getContext(), R.color.color_7F7200));
        paint6.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint6.setStrokeWidth(15.0f);
        paint6.setStyle(Paint.Style.FILL);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f19729s = displayMetrics.widthPixels;
        this.f19730t = displayMetrics.heightPixels;
        float f9 = this.f19713A;
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        j.d(displayMetrics2, "getDisplayMetrics(...)");
        a.f3817d.getClass();
        float applyDimension = TypedValue.applyDimension(5, f9, displayMetrics2) * 1.0f;
        this.f19726p = 40 * applyDimension;
        this.f19725o = applyDimension * 80;
    }

    private final void setCoefficient(float f9) {
        this.f19713A = f9;
        invalidate();
    }

    private final void setMarkCmWidth(float f9) {
        this.f19731u = f9;
        invalidate();
    }

    private final void setMarkHalfCmWidth(float f9) {
        this.f19732v = f9;
        invalidate();
    }

    private final void setMarkMmWidth(float f9) {
        this.f19733w = f9;
        invalidate();
    }

    public final float a(float f9) {
        return f9 * getContext().getResources().getDisplayMetrics().density;
    }

    public final float getDistance() {
        a aVar = this.f19736z;
        float f9 = this.f19725o;
        float f10 = this.f19713A;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        j.d(displayMetrics, "getDisplayMetrics(...)");
        a.f3817d.getClass();
        return (f9 / TypedValue.applyDimension(4, f10, displayMetrics)) * aVar.b;
    }

    public final a getUnit() {
        return this.f19736z;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0360 A[LOOP:1: B:28:0x028c->B:42:0x0360, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x037a A[EDGE_INSN: B:43:0x037a->B:44:0x037a BREAK  A[LOOP:1: B:28:0x028c->B:42:0x0360], SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r41) {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tools.arruler.ui.component.straight.view.StraightRulerView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        j.c(parcelable, "null cannot be cast to non-null type android.os.Bundle");
        Bundle bundle = (Bundle) parcelable;
        this.f19726p = bundle.getFloat("rulerX");
        this.f19725o = bundle.getFloat("rulerY");
        setCoefficient(bundle.getFloat("coefficient"));
        super.onRestoreInstanceState(bundle.getParcelable("superState"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putFloat("rulerX", this.f19726p);
        bundle.putFloat("rulerY", this.f19725o);
        bundle.putFloat("coefficient", this.f19713A);
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r1 != 3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r0 != 3) goto L50;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r0 = 1101004800(0x41a00000, float:20.0)
            float r1 = r9.a(r0)
            float r2 = r9.f19726p
            float r3 = r2 - r1
            float r2 = r2 + r1
            G7.j.b(r10)
            float r1 = r10.getX()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r3 > 0) goto L67
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L67
            boolean r1 = r9.f19715C
            if (r1 != 0) goto L67
            int r1 = r10.getActionMasked()
            if (r1 == 0) goto L5e
            if (r1 == r8) goto L5b
            if (r1 == r6) goto L30
            if (r1 == r5) goto L5b
            goto L67
        L30:
            r9.f19714B = r8
            float r0 = r10.getX()
            float r1 = r9.f19735y
            float r0 = r0 - r1
            float r1 = r9.f19726p
            float r1 = r1 + r0
            r9.f19726p = r1
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r1 = r9.f19726p
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L4a
            r0 = r1
        L4a:
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L4f
            r4 = r0
        L4f:
            r9.f19726p = r4
            float r10 = r10.getX()
            r9.f19735y = r10
            r9.invalidate()
            return r8
        L5b:
            r9.f19714B = r7
            return r7
        L5e:
            r9.f19714B = r8
            float r10 = r10.getX()
            r9.f19735y = r10
            return r8
        L67:
            float r0 = r9.a(r0)
            float r1 = r9.f19725o
            float r2 = r1 - r0
            float r1 = r1 + r0
            float r0 = r10.getY()
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto Lc4
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc4
            boolean r0 = r9.f19714B
            if (r0 != 0) goto Lc4
            int r0 = r10.getActionMasked()
            if (r0 == 0) goto Lbb
            if (r0 == r8) goto Lb8
            if (r0 == r6) goto L8d
            if (r0 == r5) goto Lb8
            goto Lc4
        L8d:
            r9.f19715C = r8
            float r0 = r10.getY()
            float r1 = r9.f19734x
            float r0 = r0 - r1
            float r1 = r9.f19725o
            float r1 = r1 + r0
            r9.f19725o = r1
            int r0 = r9.getHeight()
            float r0 = (float) r0
            float r1 = r9.f19725o
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto La7
            r0 = r1
        La7:
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lac
            r4 = r0
        Lac:
            r9.f19725o = r4
            float r10 = r10.getY()
            r9.f19734x = r10
            r9.invalidate()
            return r8
        Lb8:
            r9.f19715C = r7
            return r7
        Lbb:
            r9.f19715C = r8
            float r10 = r10.getY()
            r9.f19734x = r10
            return r8
        Lc4:
            int r10 = r10.getAction()
            if (r10 != r8) goto Lce
            r9.f19715C = r7
            r9.f19714B = r7
        Lce:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tools.arruler.ui.component.straight.view.StraightRulerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setUnit(a aVar) {
        j.e(aVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f19736z = aVar;
        invalidate();
    }
}
