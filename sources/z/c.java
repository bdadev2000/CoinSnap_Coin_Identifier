package z;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: b, reason: collision with root package name */
    public int[] f28306b;

    /* renamed from: c, reason: collision with root package name */
    public int f28307c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f28308d;

    /* renamed from: f, reason: collision with root package name */
    public w.k f28309f;

    /* renamed from: g, reason: collision with root package name */
    public String f28310g;

    /* renamed from: h, reason: collision with root package name */
    public String f28311h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f28312i;

    public c(Context context) {
        super(context);
        this.f28306b = new int[32];
        this.f28312i = new HashMap();
        this.f28308d = context;
        g(null);
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
            android.content.Context r0 = r5.f28308d
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
            java.util.HashMap r3 = r1.f1141o
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f1141o
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
            int r3 = r5.f(r1, r6)
        L64:
            if (r3 != 0) goto L70
            java.lang.Class<z.q> r1 = z.q.class
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
            java.util.HashMap r0 = r5.f28312i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: z.c.a(java.lang.String):void");
    }

    public final void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f28307c + 1;
        int[] iArr = this.f28306b;
        if (i11 > iArr.length) {
            this.f28306b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f28306b;
        int i12 = this.f28307c;
        iArr2[i12] = i10;
        this.f28307c = i12 + 1;
    }

    public final void c(String str) {
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || this.f28308d == null) {
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
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof e) && trim.equals(((e) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f28307c; i10++) {
            View view = (View) constraintLayout.f1129b.get(this.f28306b[i10]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f28308d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
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

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f28445b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f28310g = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f28311h = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f28306b, this.f28307c);
    }

    public abstract void h(w.e eVar, boolean z10);

    public final void i() {
        if (this.f28309f == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).f28343p0 = this.f28309f;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f28310g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f28311h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f28310g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f28307c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f28311h = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f28307c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f28310g = null;
        this.f28307c = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f28310g == null) {
            b(i10);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28306b = new int[32];
        this.f28312i = new HashMap();
        this.f28308d = context;
        g(attributeSet);
    }
}
