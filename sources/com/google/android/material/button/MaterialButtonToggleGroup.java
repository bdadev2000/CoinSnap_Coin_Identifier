package com.google.android.material.button;

import B3.n;
import C3.d;
import G6.i;
import L3.k;
import R3.j;
import W3.a;
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
import com.google.android.material.timepicker.f;
import com.tools.arruler.photomeasure.camera.ruler.R;
import j5.C2400c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import w3.AbstractC2861a;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int m = 0;
    public final ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public final C2400c f13980c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f13981d;

    /* renamed from: f, reason: collision with root package name */
    public final i f13982f;

    /* renamed from: g, reason: collision with root package name */
    public Integer[] f13983g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13984h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13985i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13986j;

    /* renamed from: k, reason: collision with root package name */
    public final int f13987k;
    public HashSet l;

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.b = new ArrayList();
        this.f13980c = new C2400c(this, 3);
        this.f13981d = new LinkedHashSet();
        this.f13982f = new i(this, 2);
        this.f13984h = false;
        this.l = new HashSet();
        TypedArray f9 = k.f(getContext(), attributeSet, AbstractC2861a.f23671k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(f9.getBoolean(3, false));
        this.f13987k = f9.getResourceId(1, -1);
        this.f13986j = f9.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f9.getBoolean(0, true));
        f9.recycle();
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            if (c(i9)) {
                return i9;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && c(i10)) {
                i9++;
            }
        }
        return i9;
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
        materialButton.setOnPressedChangeListenerInternal(this.f13980c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i9 = firstVisibleChildIndex + 1; i9 < getChildCount(); i9++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i9);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i9 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                layoutParams.setMarginEnd(0);
                layoutParams.setMarginStart(-min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                layoutParams.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
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
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i9, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f13977n);
        R3.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.b.add(new d(shapeAppearanceModel.f2695e, shapeAppearanceModel.f2698h, shapeAppearanceModel.f2696f, shapeAppearanceModel.f2697g));
        materialButton.setEnabled(isEnabled());
        ViewCompat.setAccessibilityDelegate(materialButton, new n(this, 1));
    }

    public final void b(int i9, boolean z8) {
        if (i9 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i9);
            return;
        }
        HashSet hashSet = new HashSet(this.l);
        if (z8 && !hashSet.contains(Integer.valueOf(i9))) {
            if (this.f13985i && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i9));
        } else if (!z8 && hashSet.contains(Integer.valueOf(i9))) {
            if (!this.f13986j || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i9));
            }
        } else {
            return;
        }
        d(hashSet);
    }

    public final boolean c(int i9) {
        if (getChildAt(i9).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d(Set set) {
        HashSet hashSet = this.l;
        this.l = new HashSet(set);
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            int id = ((MaterialButton) getChildAt(i9)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f13984h = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f13984h = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f13981d.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f13982f);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            treeMap.put((MaterialButton) getChildAt(i9), Integer.valueOf(i9));
        }
        this.f13983g = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        boolean z8;
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i9 = 0; i9 < childCount; i9++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i9);
            if (materialButton.getVisibility() != 8) {
                j e4 = materialButton.getShapeAppearanceModel().e();
                d dVar2 = (d) this.b.get(i9);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    R3.a aVar = d.f554e;
                    if (i9 == firstVisibleChildIndex) {
                        if (z8) {
                            if (k.e(this)) {
                                dVar = new d(aVar, aVar, dVar2.b, dVar2.f556c);
                            } else {
                                dVar = new d(dVar2.f555a, dVar2.f557d, aVar, aVar);
                            }
                        } else {
                            dVar = new d(dVar2.f555a, aVar, dVar2.b, aVar);
                        }
                    } else if (i9 == lastVisibleChildIndex) {
                        if (z8) {
                            if (k.e(this)) {
                                dVar = new d(dVar2.f555a, dVar2.f557d, aVar, aVar);
                            } else {
                                dVar = new d(aVar, aVar, dVar2.b, dVar2.f556c);
                            }
                        } else {
                            dVar = new d(aVar, dVar2.f557d, aVar, dVar2.f556c);
                        }
                    } else {
                        dVar2 = null;
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    e4.f2685e = new R3.a(0.0f);
                    e4.f2686f = new R3.a(0.0f);
                    e4.f2687g = new R3.a(0.0f);
                    e4.f2688h = new R3.a(0.0f);
                } else {
                    e4.f2685e = dVar2.f555a;
                    e4.f2688h = dVar2.f557d;
                    e4.f2686f = dVar2.b;
                    e4.f2687g = dVar2.f556c;
                }
                materialButton.setShapeAppearanceModel(e4.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (this.f13985i && !this.l.isEmpty()) {
            return ((Integer) this.l.iterator().next()).intValue();
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            int id = ((MaterialButton) getChildAt(i9)).getId();
            if (this.l.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i9, int i10) {
        Integer[] numArr = this.f13983g;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i10;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i9 = this.f13987k;
        if (i9 != -1) {
            d(Collections.singleton(Integer.valueOf(i9)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f13985i) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i9));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        e();
        a();
        super.onMeasure(i9, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.b.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            ((MaterialButton) getChildAt(i9)).setEnabled(z8);
        }
    }

    public void setSelectionRequired(boolean z8) {
        this.f13986j = z8;
    }

    public void setSingleSelection(boolean z8) {
        if (this.f13985i != z8) {
            this.f13985i = z8;
            d(new HashSet());
        }
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            ((MaterialButton) getChildAt(i9)).setA11yClassName((this.f13985i ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i9) {
        setSingleSelection(getResources().getBoolean(i9));
    }
}
