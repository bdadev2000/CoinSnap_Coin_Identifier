package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f928j;

    /* renamed from: a, reason: collision with root package name */
    public int f929a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f930c;

    /* renamed from: d, reason: collision with root package name */
    public float f931d;

    /* renamed from: e, reason: collision with root package name */
    public float f932e;

    /* renamed from: f, reason: collision with root package name */
    public float f933f;

    /* renamed from: g, reason: collision with root package name */
    public int f934g;

    /* renamed from: h, reason: collision with root package name */
    public String f935h;

    /* renamed from: i, reason: collision with root package name */
    public int f936i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f928j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f960f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            switch (f928j.get(index)) {
                case 1:
                    this.f932e = obtainStyledAttributes.getFloat(index, this.f932e);
                    break;
                case 2:
                    this.f930c = obtainStyledAttributes.getInt(index, this.f930c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = A.a.f0a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f929a = o.f(obtainStyledAttributes, index, this.f929a);
                    break;
                case 6:
                    this.b = obtainStyledAttributes.getInteger(index, this.b);
                    break;
                case 7:
                    this.f931d = obtainStyledAttributes.getFloat(index, this.f931d);
                    break;
                case 8:
                    this.f934g = obtainStyledAttributes.getInteger(index, this.f934g);
                    break;
                case 9:
                    this.f933f = obtainStyledAttributes.getFloat(index, this.f933f);
                    break;
                case 10:
                    int i10 = obtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        this.f936i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i10 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f935h = string;
                        if (string.indexOf("/") > 0) {
                            this.f936i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.f936i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
