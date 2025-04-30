package E;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class c extends View {
    public int[] b;

    /* renamed from: c, reason: collision with root package name */
    public int f766c;

    /* renamed from: d, reason: collision with root package name */
    public Context f767d;

    /* renamed from: f, reason: collision with root package name */
    public B.i f768f;

    /* renamed from: g, reason: collision with root package name */
    public String f769g;

    /* renamed from: h, reason: collision with root package name */
    public String f770h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f771i;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new int[32];
        this.f771i = new HashMap();
        this.f767d = context;
        h(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto La7
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La7
        La:
            android.content.Context r0 = r5.f767d
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L5b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f4336o
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f4336o
            java.lang.Object r3 = r3.get(r6)
            goto L50
        L4f:
            r3 = r2
        L50:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 != 0) goto L64
            if (r1 == 0) goto L64
            int r3 = r5.g(r1, r6)
        L64:
            if (r3 != 0) goto L70
            java.lang.Class<E.q> r1 = E.q.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L70
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L70
        L70:
            if (r3 != 0) goto L80
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L80:
            if (r3 == 0) goto L8f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f771i
            r1.put(r0, r6)
            r5.b(r3)
            goto La7
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E.c.a(java.lang.String):void");
    }

    public final void b(int i9) {
        if (i9 == getId()) {
            return;
        }
        int i10 = this.f766c + 1;
        int[] iArr = this.b;
        if (i10 > iArr.length) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i11 = this.f766c;
        iArr2[i11] = i9;
        this.f766c = i11 + 1;
    }

    public final void c(String str) {
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || this.f767d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = constraintLayout.getChildAt(i9);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof e) && trim.equals(((e) layoutParams).f796Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            e((ConstraintLayout) parent);
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i9 = 0; i9 < this.f766c; i9++) {
            View view = (View) constraintLayout.b.get(this.b[i9]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f767d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = constraintLayout.getChildAt(i9);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.b, this.f766c);
    }

    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = obtainStyledAttributes.getIndex(i9);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f769g = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f770h = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void k() {
        if (this.f768f == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).f825p0 = this.f768f;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f769g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f770h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f769g = str;
        if (str == null) {
            return;
        }
        int i9 = 0;
        this.f766c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i9);
            if (indexOf == -1) {
                a(str.substring(i9));
                return;
            } else {
                a(str.substring(i9, indexOf));
                i9 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f770h = str;
        if (str == null) {
            return;
        }
        int i9 = 0;
        this.f766c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i9);
            if (indexOf == -1) {
                c(str.substring(i9));
                return;
            } else {
                c(str.substring(i9, indexOf));
                i9 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f769g = null;
        this.f766c = 0;
        for (int i9 : iArr) {
            b(i9);
        }
    }

    @Override // android.view.View
    public final void setTag(int i9, Object obj) {
        super.setTag(i9, obj);
        if (obj == null && this.f769g == null) {
            b(i9);
        }
    }

    public void j() {
    }

    public void f(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void i(B.d dVar, boolean z8) {
    }
}
