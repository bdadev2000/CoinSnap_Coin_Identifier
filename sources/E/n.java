package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f940n;

    /* renamed from: a, reason: collision with root package name */
    public float f941a;
    public float b;

    /* renamed from: c, reason: collision with root package name */
    public float f942c;

    /* renamed from: d, reason: collision with root package name */
    public float f943d;

    /* renamed from: e, reason: collision with root package name */
    public float f944e;

    /* renamed from: f, reason: collision with root package name */
    public float f945f;

    /* renamed from: g, reason: collision with root package name */
    public float f946g;

    /* renamed from: h, reason: collision with root package name */
    public int f947h;

    /* renamed from: i, reason: collision with root package name */
    public float f948i;

    /* renamed from: j, reason: collision with root package name */
    public float f949j;

    /* renamed from: k, reason: collision with root package name */
    public float f950k;
    public boolean l;
    public float m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f940n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f963i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            switch (f940n.get(index)) {
                case 1:
                    this.f941a = obtainStyledAttributes.getFloat(index, this.f941a);
                    break;
                case 2:
                    this.b = obtainStyledAttributes.getFloat(index, this.b);
                    break;
                case 3:
                    this.f942c = obtainStyledAttributes.getFloat(index, this.f942c);
                    break;
                case 4:
                    this.f943d = obtainStyledAttributes.getFloat(index, this.f943d);
                    break;
                case 5:
                    this.f944e = obtainStyledAttributes.getFloat(index, this.f944e);
                    break;
                case 6:
                    this.f945f = obtainStyledAttributes.getDimension(index, this.f945f);
                    break;
                case 7:
                    this.f946g = obtainStyledAttributes.getDimension(index, this.f946g);
                    break;
                case 8:
                    this.f948i = obtainStyledAttributes.getDimension(index, this.f948i);
                    break;
                case 9:
                    this.f949j = obtainStyledAttributes.getDimension(index, this.f949j);
                    break;
                case 10:
                    this.f950k = obtainStyledAttributes.getDimension(index, this.f950k);
                    break;
                case 11:
                    this.l = true;
                    this.m = obtainStyledAttributes.getDimension(index, this.m);
                    break;
                case 12:
                    this.f947h = o.f(obtainStyledAttributes, index, this.f947h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
