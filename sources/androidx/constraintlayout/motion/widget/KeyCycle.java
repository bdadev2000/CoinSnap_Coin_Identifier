package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class KeyCycle extends Key {

    /* renamed from: c, reason: collision with root package name */
    public int f17772c;
    public int d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public float f17773f;

    /* renamed from: g, reason: collision with root package name */
    public float f17774g;

    /* renamed from: h, reason: collision with root package name */
    public int f17775h;

    /* renamed from: i, reason: collision with root package name */
    public float f17776i;

    /* renamed from: j, reason: collision with root package name */
    public float f17777j;

    /* renamed from: k, reason: collision with root package name */
    public float f17778k;

    /* renamed from: l, reason: collision with root package name */
    public float f17779l;

    /* renamed from: m, reason: collision with root package name */
    public float f17780m;

    /* renamed from: n, reason: collision with root package name */
    public float f17781n;

    /* renamed from: o, reason: collision with root package name */
    public float f17782o;

    /* renamed from: p, reason: collision with root package name */
    public float f17783p;

    /* renamed from: q, reason: collision with root package name */
    public float f17784q;

    /* renamed from: r, reason: collision with root package name */
    public float f17785r;

    /* renamed from: s, reason: collision with root package name */
    public float f17786s;

    /* loaded from: classes2.dex */
    public static class Loader {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f17787a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f17787a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(18, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(19, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f18329f);
        SparseIntArray sparseIntArray = Loader.f17787a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = Loader.f17787a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    int i3 = MotionLayout.P;
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f17757b = obtainStyledAttributes.getResourceId(index, this.f17757b);
                        break;
                    }
                case 2:
                    this.f17756a = obtainStyledAttributes.getInt(index, this.f17756a);
                    break;
                case 3:
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f17772c = obtainStyledAttributes.getInteger(index, this.f17772c);
                    break;
                case 5:
                    this.d = obtainStyledAttributes.getInt(index, this.d);
                    break;
                case 6:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.f17773f = obtainStyledAttributes.getDimension(index, this.f17773f);
                        break;
                    } else {
                        this.f17773f = obtainStyledAttributes.getFloat(index, this.f17773f);
                        break;
                    }
                case 8:
                    this.f17775h = obtainStyledAttributes.getInt(index, this.f17775h);
                    break;
                case 9:
                    this.f17776i = obtainStyledAttributes.getFloat(index, this.f17776i);
                    break;
                case 10:
                    this.f17777j = obtainStyledAttributes.getDimension(index, this.f17777j);
                    break;
                case 11:
                    this.f17778k = obtainStyledAttributes.getFloat(index, this.f17778k);
                    break;
                case 12:
                    this.f17780m = obtainStyledAttributes.getFloat(index, this.f17780m);
                    break;
                case 13:
                    this.f17781n = obtainStyledAttributes.getFloat(index, this.f17781n);
                    break;
                case 14:
                    this.f17779l = obtainStyledAttributes.getFloat(index, this.f17779l);
                    break;
                case 15:
                    this.f17782o = obtainStyledAttributes.getFloat(index, this.f17782o);
                    break;
                case 16:
                    this.f17783p = obtainStyledAttributes.getFloat(index, this.f17783p);
                    break;
                case 17:
                    this.f17784q = obtainStyledAttributes.getDimension(index, this.f17784q);
                    break;
                case 18:
                    this.f17785r = obtainStyledAttributes.getDimension(index, this.f17785r);
                    break;
                case 19:
                    this.f17786s = obtainStyledAttributes.getDimension(index, this.f17786s);
                    break;
                case 20:
                    this.f17774g = obtainStyledAttributes.getFloat(index, this.f17774g);
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }
}
