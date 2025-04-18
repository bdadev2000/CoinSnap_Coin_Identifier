package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;

/* loaded from: classes.dex */
public class KeyAttributes extends Key {

    /* renamed from: c, reason: collision with root package name */
    public int f17758c;
    public float d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f17759f;

    /* renamed from: g, reason: collision with root package name */
    public float f17760g;

    /* renamed from: h, reason: collision with root package name */
    public float f17761h;

    /* renamed from: i, reason: collision with root package name */
    public float f17762i;

    /* renamed from: j, reason: collision with root package name */
    public float f17763j;

    /* renamed from: k, reason: collision with root package name */
    public float f17764k;

    /* renamed from: l, reason: collision with root package name */
    public float f17765l;

    /* renamed from: m, reason: collision with root package name */
    public float f17766m;

    /* renamed from: n, reason: collision with root package name */
    public float f17767n;

    /* renamed from: o, reason: collision with root package name */
    public float f17768o;

    /* renamed from: p, reason: collision with root package name */
    public float f17769p;

    /* renamed from: q, reason: collision with root package name */
    public float f17770q;

    /* loaded from: classes.dex */
    public static class Loader {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f17771a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f17771a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(17, 8);
            sparseIntArray.append(16, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.e);
        SparseIntArray sparseIntArray = Loader.f17771a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = Loader.f17771a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 2:
                    this.e = obtainStyledAttributes.getDimension(index, this.e);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f17759f = obtainStyledAttributes.getFloat(index, this.f17759f);
                    break;
                case 5:
                    this.f17760g = obtainStyledAttributes.getFloat(index, this.f17760g);
                    break;
                case 6:
                    this.f17761h = obtainStyledAttributes.getFloat(index, this.f17761h);
                    break;
                case 7:
                    this.f17765l = obtainStyledAttributes.getFloat(index, this.f17765l);
                    break;
                case 8:
                    this.f17764k = obtainStyledAttributes.getFloat(index, this.f17764k);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
                    int i3 = MotionLayout.P;
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f17757b = obtainStyledAttributes.getResourceId(index, this.f17757b);
                        break;
                    }
                case 12:
                    this.f17756a = obtainStyledAttributes.getInt(index, this.f17756a);
                    break;
                case 13:
                    this.f17758c = obtainStyledAttributes.getInteger(index, this.f17758c);
                    break;
                case 14:
                    this.f17766m = obtainStyledAttributes.getFloat(index, this.f17766m);
                    break;
                case 15:
                    this.f17767n = obtainStyledAttributes.getDimension(index, this.f17767n);
                    break;
                case 16:
                    this.f17768o = obtainStyledAttributes.getDimension(index, this.f17768o);
                    break;
                case 17:
                    this.f17769p = obtainStyledAttributes.getDimension(index, this.f17769p);
                    break;
                case 18:
                    this.f17770q = obtainStyledAttributes.getFloat(index, this.f17770q);
                    break;
                case 19:
                    this.f17762i = obtainStyledAttributes.getDimension(index, this.f17762i);
                    break;
                case 20:
                    this.f17763j = obtainStyledAttributes.getDimension(index, this.f17763j);
                    break;
            }
        }
    }
}
