package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.d;
import com.google.android.material.timepicker.j;
import com.plantcare.ai.identifier.plantid.R;
import fb.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import ka.l;
import o0.h;
import p6.a;
import t.f;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f11614o = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11615b;

    /* renamed from: c, reason: collision with root package name */
    public final c f11616c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f11617d;

    /* renamed from: f, reason: collision with root package name */
    public final f f11618f;

    /* renamed from: g, reason: collision with root package name */
    public Integer[] f11619g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11620h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11621i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11622j;

    /* renamed from: k, reason: collision with root package name */
    public ka.c f11623k;

    /* renamed from: l, reason: collision with root package name */
    public int f11624l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11625m;

    /* renamed from: n, reason: collision with root package name */
    public HashSet f11626n;

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.z(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f11615b = new ArrayList();
        this.f11616c = new c(this);
        this.f11617d = new LinkedHashSet();
        this.f11618f = new f(this, 3);
        this.f11620h = false;
        this.f11626n = new HashSet();
        TypedArray s5 = d.s(getContext(), attributeSet, r9.a.f24029k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(s5.getBoolean(5, false));
        this.f11625m = s5.getResourceId(2, -1);
        this.f11622j = s5.getBoolean(4, false);
        this.f11623k = l.c(s5, 3, new ka.a(0.0f));
        this.f11624l = s5.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(s5.getBoolean(0, true));
        s5.recycle();
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.generateViewId());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f11616c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int i10;
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i11 = firstVisibleChildIndex + 1; i11 < getChildCount(); i11++) {
            MaterialButton c10 = c(i11);
            MaterialButton c11 = c(i11 - 1);
            if (this.f11624l <= 0) {
                i10 = Math.min(c10.getStrokeWidth(), c11.getStrokeWidth());
            } else {
                i10 = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = c10.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                layoutParams.setMarginEnd(0);
                layoutParams.setMarginStart(this.f11624l - i10);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = this.f11624l - i10;
                layoutParams.setMarginStart(0);
            }
            c10.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
            } else {
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        l shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f11615b.add(new w9.d(shapeAppearanceModel.f20582e, shapeAppearanceModel.f20585h, shapeAppearanceModel.f20583f, shapeAppearanceModel.f20584g));
        materialButton.setEnabled(isEnabled());
        ViewCompat.setAccessibilityDelegate(materialButton, new v9.d(this, 1));
    }

    public final void b(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f11626n);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f11621i && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i10))) {
            if (!this.f11622j || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        if (getChildAt(i10).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f11618f);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f11619g = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set set) {
        HashSet hashSet = this.f11626n;
        this.f11626n = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f11620h = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f11620h = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.f11617d.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        boolean z10;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c10 = c(i10);
            if (c10.getVisibility() != 8) {
                l shapeAppearanceModel = c10.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                h7.l lVar = new h7.l(shapeAppearanceModel);
                w9.d dVar = (w9.d) this.f11615b.get(i10);
                ka.c cVar = this.f11623k;
                w9.d dVar2 = new w9.d(cVar, cVar, cVar, cVar);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z11 = true;
                    if (getOrientation() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == firstVisibleChildIndex) {
                        if (z10) {
                            if (getLayoutDirection() != 1) {
                                z11 = false;
                            }
                            if (z11) {
                                dVar2 = new w9.d(cVar, cVar, dVar.f26951b, dVar.f26952c);
                            } else {
                                dVar2 = new w9.d(dVar.a, dVar.f26953d, cVar, cVar);
                            }
                        } else {
                            dVar2 = new w9.d(dVar.a, cVar, dVar.f26951b, cVar);
                        }
                    } else if (i10 == lastVisibleChildIndex) {
                        if (z10) {
                            if (getLayoutDirection() != 1) {
                                z11 = false;
                            }
                            if (z11) {
                                dVar2 = new w9.d(dVar.a, dVar.f26953d, cVar, cVar);
                            } else {
                                dVar2 = new w9.d(cVar, cVar, dVar.f26951b, dVar.f26952c);
                            }
                        } else {
                            dVar2 = new w9.d(cVar, dVar.f26953d, cVar, dVar.f26952c);
                        }
                    }
                    dVar = dVar2;
                }
                if (dVar == null) {
                    lVar.f18829e = new ka.a(0.0f);
                    lVar.f18830f = new ka.a(0.0f);
                    lVar.f18831g = new ka.a(0.0f);
                    lVar.f18832h = new ka.a(0.0f);
                } else {
                    lVar.f18829e = dVar.a;
                    lVar.f18832h = dVar.f26953d;
                    lVar.f18830f = dVar.f26951b;
                    lVar.f18831g = dVar.f26952c;
                }
                c10.setShapeAppearanceModel(new l(lVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f11621i || this.f11626n.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f11626n.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            if (this.f11626n.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f11619g;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    @NonNull
    public ka.c getInnerCornerSize() {
        return this.f11623k;
    }

    public int getSpacing() {
        return this.f11624l;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f11625m;
        if (i10 != -1) {
            e(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        o0.j jVar = new o0.j(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f11621i) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        jVar.j(new h(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i10)));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f11615b.remove(indexOfChild);
        }
        f();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c(i10).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(@NonNull ka.c cVar) {
        this.f11623k = cVar;
        f();
        invalidate();
    }

    public void setSelectionRequired(boolean z10) {
        this.f11622j = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f11621i != z10) {
            this.f11621i = z10;
            e(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            c(i10).setA11yClassName((this.f11621i ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSpacing(int i10) {
        this.f11624l = i10;
        invalidate();
        requestLayout();
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
