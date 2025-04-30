package com.google.android.material.timepicker;

import E.j;
import E.k;
import E.o;
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
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final Rect f14205A;

    /* renamed from: B, reason: collision with root package name */
    public final SparseArray f14206B;

    /* renamed from: C, reason: collision with root package name */
    public final c f14207C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f14208D;

    /* renamed from: E, reason: collision with root package name */
    public final float[] f14209E;

    /* renamed from: F, reason: collision with root package name */
    public final int f14210F;

    /* renamed from: G, reason: collision with root package name */
    public final int f14211G;

    /* renamed from: H, reason: collision with root package name */
    public final int f14212H;

    /* renamed from: I, reason: collision with root package name */
    public final int f14213I;

    /* renamed from: J, reason: collision with root package name */
    public final String[] f14214J;

    /* renamed from: K, reason: collision with root package name */
    public float f14215K;

    /* renamed from: L, reason: collision with root package name */
    public final ColorStateList f14216L;

    /* renamed from: x, reason: collision with root package name */
    public final ClockHandView f14217x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f14218y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f14219z;

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14218y = new Rect();
        this.f14219z = new RectF();
        this.f14205A = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f14206B = sparseArray;
        this.f14209E = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2861a.f23664d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList p2 = android.support.v4.media.session.a.p(context, obtainStyledAttributes, 1);
        this.f14216L = p2;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f14217x = clockHandView;
        this.f14210F = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = p2.getColorForState(new int[]{android.R.attr.state_selected}, p2.getDefaultColor());
        this.f14208D = new int[]{colorForState, colorForState, p2.getDefaultColor()};
        clockHandView.f14221d.add(this);
        int defaultColor = I.h.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList p7 = android.support.v4.media.session.a.p(context, obtainStyledAttributes, 0);
        setBackgroundColor(p7 != null ? p7.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f14207C = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f14214J = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z8 = false;
        for (int i9 = 0; i9 < Math.max(this.f14214J.length, size); i9++) {
            TextView textView = (TextView) sparseArray.get(i9);
            if (i9 >= this.f14214J.length) {
                removeView(textView);
                sparseArray.remove(i9);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i9, textView);
                    addView(textView);
                }
                textView.setText(this.f14214J[i9]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i9));
                int i10 = (i9 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                z8 = i10 > 1 ? true : z8;
                ViewCompat.setAccessibilityDelegate(textView, this.f14207C);
                textView.setTextColor(this.f14216L);
            }
        }
        ClockHandView clockHandView2 = this.f14217x;
        if (clockHandView2.f14220c && !z8) {
            clockHandView2.f14229o = 1;
        }
        clockHandView2.f14220c = z8;
        clockHandView2.invalidate();
        this.f14211G = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f14212H = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f14213I = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void m() {
        int i9;
        o oVar = new o();
        oVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, new ArrayList());
                }
                ((List) hashMap.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i9 = Math.round(this.f14234v * 0.66f);
            } else {
                i9 = this.f14234v;
            }
            Iterator it = list.iterator();
            float f9 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = oVar.f955c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new j());
                }
                k kVar = ((j) hashMap2.get(Integer.valueOf(id))).f862d;
                kVar.f927z = R.id.circle_center;
                kVar.f866A = i9;
                kVar.f867B = f9;
                f9 += 360.0f / list.size();
            }
        }
        oVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.f14206B;
            if (i12 < sparseArray.size()) {
                ((TextView) sparseArray.get(i12)).setVisibility(0);
                i12++;
            } else {
                return;
            }
        }
    }

    public final void n() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z8;
        RadialGradient radialGradient;
        RectF rectF2 = this.f14217x.f14225i;
        float f9 = Float.MAX_VALUE;
        TextView textView = null;
        int i9 = 0;
        while (true) {
            sparseArray = this.f14206B;
            int size = sparseArray.size();
            rectF = this.f14219z;
            rect = this.f14218y;
            if (i9 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i9);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f9) {
                    textView = textView2;
                    f9 = height;
                }
            }
            i9++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = (TextView) sparseArray.get(i10);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                textView3.setSelected(z8);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f14205A);
                rectF.inset(r8.left, r8.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f14208D, this.f14209E, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f14214J.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f14213I / Math.max(Math.max(this.f14211G / displayMetrics.heightPixels, this.f14212H / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
