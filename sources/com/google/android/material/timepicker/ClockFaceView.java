package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v8.u0;
import z.n;

/* loaded from: classes3.dex */
class ClockFaceView extends h implements f {
    public final c A;
    public final int[] B;
    public final float[] C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public String[] H;
    public float I;
    public final ColorStateList J;

    /* renamed from: v, reason: collision with root package name */
    public final ClockHandView f11851v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f11852w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f11853x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f11854y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseArray f11855z;

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11852w = new Rect();
        this.f11853x = new RectF();
        this.f11854y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f11855z = sparseArray;
        this.C = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9.a.f24022d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList z10 = u0.z(context, obtainStyledAttributes, 1);
        this.J = z10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f11851v = clockHandView;
        this.D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = z10.getColorForState(new int[]{android.R.attr.state_selected}, z10.getDefaultColor());
        this.B = new int[]{colorForState, colorForState, z10.getDefaultColor()};
        clockHandView.f11859d.add(this);
        int defaultColor = d0.h.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList z11 = u0.z(context, obtainStyledAttributes, 0);
        setBackgroundColor(z11 != null ? z11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.A = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.H = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z12 = false;
        for (int i10 = 0; i10 < Math.max(this.H.length, size); i10++) {
            TextView textView = (TextView) sparseArray.get(i10);
            if (i10 >= this.H.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.H[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z12 = i11 > 1 ? true : z12;
                ViewCompat.setAccessibilityDelegate(textView, this.A);
                textView.setTextColor(this.J);
            }
        }
        ClockHandView clockHandView2 = this.f11851v;
        if (clockHandView2.f11858c && !z12) {
            clockHandView2.f11869o = 1;
        }
        clockHandView2.f11858c = z12;
        clockHandView2.invalidate();
        this.E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void m() {
        int i10;
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i12 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, new ArrayList());
                }
                ((List) hashMap.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i10 = Math.round(this.f11877t * 0.66f);
            } else {
                i10 = this.f11877t;
            }
            Iterator it = list.iterator();
            float f10 = 0.0f;
            while (it.hasNext()) {
                int id2 = ((View) it.next()).getId();
                HashMap hashMap2 = nVar.f28443c;
                if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                    hashMap2.put(Integer.valueOf(id2), new z.i());
                }
                z.j jVar = ((z.i) hashMap2.get(Integer.valueOf(id2))).f28371d;
                jVar.f28413z = R.id.circle_center;
                jVar.A = i10;
                jVar.B = f10;
                f10 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f11855z;
            if (i13 < sparseArray.size()) {
                ((TextView) sparseArray.get(i13)).setVisibility(0);
                i13++;
            } else {
                return;
            }
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z10;
        RadialGradient radialGradient;
        RectF rectF2 = this.f11851v.f11863i;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.f11855z;
            int size = sparseArray.size();
            rectF = this.f11853x;
            rect = this.f11852w;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f10) {
                    textView = textView2;
                    f10 = height;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView3.setSelected(z10);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f11854y);
                rectF.inset(r8.left, r8.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.B, this.C, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new o0.j(accessibilityNodeInfo).j(new o0.h(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.H.length, false, 1)));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.G / Math.max(Math.max(this.E / displayMetrics.heightPixels, this.F / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
