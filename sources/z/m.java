package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f28426n;
    public float a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f28427b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f28428c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f28429d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f28430e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f28431f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f28432g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public int f28433h = -1;

    /* renamed from: i, reason: collision with root package name */
    public float f28434i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f28435j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f28436k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public boolean f28437l = false;

    /* renamed from: m, reason: collision with root package name */
    public float f28438m = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28426n = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f28452i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (f28426n.get(index)) {
                case 1:
                    this.a = obtainStyledAttributes.getFloat(index, this.a);
                    break;
                case 2:
                    this.f28427b = obtainStyledAttributes.getFloat(index, this.f28427b);
                    break;
                case 3:
                    this.f28428c = obtainStyledAttributes.getFloat(index, this.f28428c);
                    break;
                case 4:
                    this.f28429d = obtainStyledAttributes.getFloat(index, this.f28429d);
                    break;
                case 5:
                    this.f28430e = obtainStyledAttributes.getFloat(index, this.f28430e);
                    break;
                case 6:
                    this.f28431f = obtainStyledAttributes.getDimension(index, this.f28431f);
                    break;
                case 7:
                    this.f28432g = obtainStyledAttributes.getDimension(index, this.f28432g);
                    break;
                case 8:
                    this.f28434i = obtainStyledAttributes.getDimension(index, this.f28434i);
                    break;
                case 9:
                    this.f28435j = obtainStyledAttributes.getDimension(index, this.f28435j);
                    break;
                case 10:
                    this.f28436k = obtainStyledAttributes.getDimension(index, this.f28436k);
                    break;
                case 11:
                    this.f28437l = true;
                    this.f28438m = obtainStyledAttributes.getDimension(index, this.f28438m);
                    break;
                case 12:
                    this.f28433h = n.f(obtainStyledAttributes, index, this.f28433h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
