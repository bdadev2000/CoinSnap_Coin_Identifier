package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class KeyTimeCycle extends Key {

    /* renamed from: c, reason: collision with root package name */
    public int f17797c;
    public float d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f17798f;

    /* renamed from: g, reason: collision with root package name */
    public float f17799g;

    /* renamed from: h, reason: collision with root package name */
    public float f17800h;

    /* renamed from: i, reason: collision with root package name */
    public float f17801i;

    /* renamed from: j, reason: collision with root package name */
    public float f17802j;

    /* renamed from: k, reason: collision with root package name */
    public float f17803k;

    /* renamed from: l, reason: collision with root package name */
    public float f17804l;

    /* renamed from: m, reason: collision with root package name */
    public float f17805m;

    /* renamed from: n, reason: collision with root package name */
    public float f17806n;

    /* renamed from: o, reason: collision with root package name */
    public float f17807o;

    /* renamed from: p, reason: collision with root package name */
    public int f17808p;

    /* renamed from: q, reason: collision with root package name */
    public float f17809q;

    /* renamed from: r, reason: collision with root package name */
    public float f17810r;

    /* loaded from: classes2.dex */
    public static class Loader {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f17811a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f17811a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(19, 19);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f18331h);
        SparseIntArray sparseIntArray = Loader.f17811a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = Loader.f17811a;
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
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f17798f = obtainStyledAttributes.getFloat(index, this.f17798f);
                    break;
                case 5:
                    this.f17799g = obtainStyledAttributes.getFloat(index, this.f17799g);
                    break;
                case 6:
                    this.f17800h = obtainStyledAttributes.getFloat(index, this.f17800h);
                    break;
                case 7:
                    this.f17802j = obtainStyledAttributes.getFloat(index, this.f17802j);
                    break;
                case 8:
                    this.f17801i = obtainStyledAttributes.getFloat(index, this.f17801i);
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
                    this.f17797c = obtainStyledAttributes.getInteger(index, this.f17797c);
                    break;
                case 14:
                    this.f17803k = obtainStyledAttributes.getFloat(index, this.f17803k);
                    break;
                case 15:
                    this.f17804l = obtainStyledAttributes.getDimension(index, this.f17804l);
                    break;
                case 16:
                    this.f17805m = obtainStyledAttributes.getDimension(index, this.f17805m);
                    break;
                case 17:
                    this.f17806n = obtainStyledAttributes.getDimension(index, this.f17806n);
                    break;
                case 18:
                    this.f17807o = obtainStyledAttributes.getFloat(index, this.f17807o);
                    break;
                case 19:
                    this.f17808p = obtainStyledAttributes.getInt(index, this.f17808p);
                    break;
                case 20:
                    this.f17809q = obtainStyledAttributes.getFloat(index, this.f17809q);
                    break;
                case 21:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.f17810r = obtainStyledAttributes.getDimension(index, this.f17810r);
                        break;
                    } else {
                        this.f17810r = obtainStyledAttributes.getFloat(index, this.f17810r);
                        break;
                    }
            }
        }
    }
}
