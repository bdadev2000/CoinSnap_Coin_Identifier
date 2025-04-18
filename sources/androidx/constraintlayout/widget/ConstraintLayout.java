package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import t.d;
import w.f;
import w.i;
import x.m;
import z.c;
import z.e;
import z.g;
import z.n;
import z.o;
import z.p;
import z.r;
import z.s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r, reason: collision with root package name */
    public static s f1128r;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f1129b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1130c;

    /* renamed from: d, reason: collision with root package name */
    public final f f1131d;

    /* renamed from: f, reason: collision with root package name */
    public int f1132f;

    /* renamed from: g, reason: collision with root package name */
    public int f1133g;

    /* renamed from: h, reason: collision with root package name */
    public int f1134h;

    /* renamed from: i, reason: collision with root package name */
    public int f1135i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1136j;

    /* renamed from: k, reason: collision with root package name */
    public int f1137k;

    /* renamed from: l, reason: collision with root package name */
    public n f1138l;

    /* renamed from: m, reason: collision with root package name */
    public g f1139m;

    /* renamed from: n, reason: collision with root package name */
    public int f1140n;

    /* renamed from: o, reason: collision with root package name */
    public HashMap f1141o;

    /* renamed from: p, reason: collision with root package name */
    public final SparseArray f1142p;

    /* renamed from: q, reason: collision with root package name */
    public final m f1143q;

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1129b = new SparseArray();
        this.f1130c = new ArrayList(4);
        this.f1131d = new f();
        this.f1132f = 0;
        this.f1133g = 0;
        this.f1134h = Integer.MAX_VALUE;
        this.f1135i = Integer.MAX_VALUE;
        this.f1136j = true;
        this.f1137k = 257;
        this.f1138l = null;
        this.f1139m = null;
        this.f1140n = -1;
        this.f1141o = new HashMap();
        this.f1142p = new SparseArray();
        this.f1143q = new m(this, this);
        h(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static s getSharedValues() {
        if (f1128r == null) {
            f1128r = new s();
        }
        return f1128r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1130c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((c) arrayList.get(i10)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1136j = true;
        super.forceLayout();
    }

    public final w.e g(View view) {
        if (view == this) {
            return this.f1131d;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof e) {
                return ((e) view.getLayoutParams()).f28343p0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof e) {
                return ((e) view.getLayoutParams()).f28343p0;
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f1135i;
    }

    public int getMaxWidth() {
        return this.f1134h;
    }

    public int getMinHeight() {
        return this.f1133g;
    }

    public int getMinWidth() {
        return this.f1132f;
    }

    public int getOptimizationLevel() {
        return this.f1131d.D0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        f fVar = this.f1131d;
        if (fVar.f26597j == null) {
            int id3 = getId();
            if (id3 != -1) {
                fVar.f26597j = getContext().getResources().getResourceEntryName(id3);
            } else {
                fVar.f26597j = "parent";
            }
        }
        if (fVar.f26594h0 == null) {
            fVar.f26594h0 = fVar.f26597j;
            Log.v("ConstraintLayout", " setDebugName " + fVar.f26594h0);
        }
        Iterator it = fVar.f26664q0.iterator();
        while (it.hasNext()) {
            w.e eVar = (w.e) it.next();
            View view = (View) eVar.f26590f0;
            if (view != null) {
                if (eVar.f26597j == null && (id2 = view.getId()) != -1) {
                    eVar.f26597j = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar.f26594h0 == null) {
                    eVar.f26594h0 = eVar.f26597j;
                    Log.v("ConstraintLayout", " setDebugName " + eVar.f26594h0);
                }
            }
        }
        fVar.o(sb2);
        return sb2.toString();
    }

    public final void h(AttributeSet attributeSet, int i10) {
        f fVar = this.f1131d;
        fVar.f26590f0 = this;
        m mVar = this.f1143q;
        fVar.f26623u0 = mVar;
        fVar.f26621s0.f27263h = mVar;
        this.f1129b.put(getId(), this);
        this.f1138l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f28445b, i10, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f1132f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1132f);
                } else if (index == 17) {
                    this.f1133g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1133g);
                } else if (index == 14) {
                    this.f1134h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1134h);
                } else if (index == 15) {
                    this.f1135i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1135i);
                } else if (index == 113) {
                    this.f1137k = obtainStyledAttributes.getInt(index, this.f1137k);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.f1139m = new g(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1139m = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        n nVar = new n();
                        this.f1138l = nVar;
                        nVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1138l = null;
                    }
                    this.f1140n = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        fVar.D0 = this.f1137k;
        d.f25102p = fVar.W(512);
    }

    public final boolean i() {
        boolean z10;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public final void j(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f1141o == null) {
                this.f1141o = new HashMap();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1141o.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final void k(w.e eVar, e eVar2, SparseArray sparseArray, int i10, w.c cVar) {
        View view = (View) this.f1129b.get(i10);
        w.e eVar3 = (w.e) sparseArray.get(i10);
        if (eVar3 != null && view != null && (view.getLayoutParams() instanceof e)) {
            eVar2.f28317c0 = true;
            w.c cVar2 = w.c.BASELINE;
            if (cVar == cVar2) {
                e eVar4 = (e) view.getLayoutParams();
                eVar4.f28317c0 = true;
                eVar4.f28343p0.E = true;
            }
            eVar.j(cVar2).b(eVar3.j(cVar), eVar2.D, eVar2.C, true);
            eVar.E = true;
            eVar.j(w.c.TOP).j();
            eVar.j(w.c.BOTTOM).j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.l():boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            e eVar = (e) childAt.getLayoutParams();
            w.e eVar2 = eVar.f28343p0;
            if (childAt.getVisibility() != 8 || eVar.f28319d0 || eVar.f28321e0 || isInEditMode) {
                int s5 = eVar2.s();
                int t5 = eVar2.t();
                childAt.layout(s5, t5, eVar2.r() + s5, eVar2.l() + t5);
            }
        }
        ArrayList arrayList = this.f1130c;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((c) arrayList.get(i15)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        w.e g10 = g(view);
        if ((view instanceof p) && !(g10 instanceof i)) {
            e eVar = (e) view.getLayoutParams();
            i iVar = new i();
            eVar.f28343p0 = iVar;
            eVar.f28319d0 = true;
            iVar.S(eVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((e) view.getLayoutParams()).f28321e0 = true;
            ArrayList arrayList = this.f1130c;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f1129b.put(view.getId(), view);
        this.f1136j = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1129b.remove(view.getId());
        w.e g10 = g(view);
        this.f1131d.f26664q0.remove(g10);
        g10.D();
        this.f1130c.remove(view);
        this.f1136j = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1136j = true;
        super.requestLayout();
    }

    public void setConstraintSet(n nVar) {
        this.f1138l = nVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id2 = getId();
        SparseArray sparseArray = this.f1129b;
        sparseArray.remove(id2);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f1135i) {
            return;
        }
        this.f1135i = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1134h) {
            return;
        }
        this.f1134h = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1133g) {
            return;
        }
        this.f1133g = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1132f) {
            return;
        }
        this.f1132f = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(o oVar) {
        g gVar = this.f1139m;
        if (gVar != null) {
            gVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1137k = i10;
        f fVar = this.f1131d;
        fVar.D0 = i10;
        d.f25102p = fVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1129b = new SparseArray();
        this.f1130c = new ArrayList(4);
        this.f1131d = new f();
        this.f1132f = 0;
        this.f1133g = 0;
        this.f1134h = Integer.MAX_VALUE;
        this.f1135i = Integer.MAX_VALUE;
        this.f1136j = true;
        this.f1137k = 257;
        this.f1138l = null;
        this.f1139m = null;
        this.f1140n = -1;
        this.f1141o = new HashMap();
        this.f1142p = new SparseArray();
        this.f1143q = new m(this, this);
        h(attributeSet, i10);
    }
}
