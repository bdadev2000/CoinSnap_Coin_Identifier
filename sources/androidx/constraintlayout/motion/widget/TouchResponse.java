package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class TouchResponse {

    /* renamed from: t, reason: collision with root package name */
    public static final float[][] f17883t = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: u, reason: collision with root package name */
    public static final float[][] f17884u = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: a, reason: collision with root package name */
    public final int f17885a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17886b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17887c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17888f;

    /* renamed from: g, reason: collision with root package name */
    public float f17889g;

    /* renamed from: h, reason: collision with root package name */
    public float f17890h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17891i = false;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f17892j = new float[2];

    /* renamed from: k, reason: collision with root package name */
    public float f17893k;

    /* renamed from: l, reason: collision with root package name */
    public float f17894l;

    /* renamed from: m, reason: collision with root package name */
    public final MotionLayout f17895m;

    /* renamed from: n, reason: collision with root package name */
    public final float f17896n;

    /* renamed from: o, reason: collision with root package name */
    public final float f17897o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f17898p;

    /* renamed from: q, reason: collision with root package name */
    public final float f17899q;

    /* renamed from: r, reason: collision with root package name */
    public final int f17900r;

    /* renamed from: s, reason: collision with root package name */
    public final float f17901s;

    /* renamed from: androidx.constraintlayout.motion.widget.TouchResponse$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.TouchResponse$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements NestedScrollView.OnScrollChangeListener {
        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public final void a(NestedScrollView nestedScrollView) {
        }
    }

    public TouchResponse(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f17885a = 0;
        this.f17886b = 0;
        this.f17887c = 0;
        this.d = -1;
        this.e = -1;
        this.f17888f = -1;
        this.f17889g = 0.0f;
        this.f17890h = 1.0f;
        this.f17896n = 4.0f;
        this.f17897o = 1.2f;
        this.f17898p = true;
        this.f17899q = 1.0f;
        this.f17900r = 0;
        this.f17901s = 10.0f;
        this.f17895m = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f18337n);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 9) {
                this.d = obtainStyledAttributes.getResourceId(index, this.d);
            } else if (index == 10) {
                int i3 = obtainStyledAttributes.getInt(index, this.f17885a);
                this.f17885a = i3;
                float[] fArr = f17883t[i3];
                float f2 = fArr[0];
                float f3 = fArr[1];
            } else if (index == 0) {
                int i4 = obtainStyledAttributes.getInt(index, this.f17886b);
                this.f17886b = i4;
                float[] fArr2 = f17884u[i4];
                this.f17889g = fArr2[0];
                this.f17890h = fArr2[1];
            } else if (index == 5) {
                this.f17896n = obtainStyledAttributes.getFloat(index, this.f17896n);
            } else if (index == 4) {
                this.f17897o = obtainStyledAttributes.getFloat(index, this.f17897o);
            } else if (index == 6) {
                this.f17898p = obtainStyledAttributes.getBoolean(index, this.f17898p);
            } else if (index == 1) {
                this.f17899q = obtainStyledAttributes.getFloat(index, this.f17899q);
            } else if (index == 2) {
                this.f17901s = obtainStyledAttributes.getFloat(index, this.f17901s);
            } else if (index == 11) {
                this.e = obtainStyledAttributes.getResourceId(index, this.e);
            } else if (index == 8) {
                this.f17887c = obtainStyledAttributes.getInt(index, this.f17887c);
            } else if (index == 7) {
                this.f17900r = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 3) {
                this.f17888f = obtainStyledAttributes.getResourceId(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i2 = this.e;
        if (i2 == -1 || (findViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final void b(boolean z2) {
        float[][] fArr = f17883t;
        float[][] fArr2 = f17884u;
        if (z2) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f17885a];
        float f2 = fArr3[0];
        float f3 = fArr3[1];
        float[] fArr4 = fArr2[this.f17886b];
        this.f17889g = fArr4[0];
        this.f17890h = fArr4[1];
    }

    public final String toString() {
        return this.f17889g + " , " + this.f17890h;
    }
}
