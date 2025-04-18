package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import mb.y1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f28414j;
    public int a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f28415b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f28416c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f28417d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f28418e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public float f28419f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public int f28420g = -1;

    /* renamed from: h, reason: collision with root package name */
    public String f28421h = null;

    /* renamed from: i, reason: collision with root package name */
    public int f28422i = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28414j = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f28449f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (f28414j.get(index)) {
                case 1:
                    this.f28418e = obtainStyledAttributes.getFloat(index, this.f28418e);
                    break;
                case 2:
                    this.f28416c = obtainStyledAttributes.getInt(index, this.f28416c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = y1.f22138e[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.a = n.f(obtainStyledAttributes, index, this.a);
                    break;
                case 6:
                    this.f28415b = obtainStyledAttributes.getInteger(index, this.f28415b);
                    break;
                case 7:
                    this.f28417d = obtainStyledAttributes.getFloat(index, this.f28417d);
                    break;
                case 8:
                    this.f28420g = obtainStyledAttributes.getInteger(index, this.f28420g);
                    break;
                case 9:
                    this.f28419f = obtainStyledAttributes.getFloat(index, this.f28419f);
                    break;
                case 10:
                    int i11 = obtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        this.f28422i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i11 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f28421h = string;
                        if (string.indexOf("/") > 0) {
                            this.f28422i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.f28422i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
