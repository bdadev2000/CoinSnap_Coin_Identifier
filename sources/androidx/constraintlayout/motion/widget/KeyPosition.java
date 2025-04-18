package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class KeyPosition extends KeyPositionBase {
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public float f17790f;

    /* renamed from: g, reason: collision with root package name */
    public float f17791g;

    /* renamed from: h, reason: collision with root package name */
    public float f17792h;

    /* renamed from: i, reason: collision with root package name */
    public float f17793i;

    /* renamed from: j, reason: collision with root package name */
    public int f17794j;

    /* loaded from: classes2.dex */
    public static class Loader {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f17795a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f17795a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f18330g);
        SparseIntArray sparseIntArray = Loader.f17795a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = Loader.f17795a;
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
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = Easing.f17751c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f17796c = obtainStyledAttributes.getInteger(index, this.f17796c);
                    break;
                case 5:
                    this.e = obtainStyledAttributes.getInt(index, this.e);
                    break;
                case 6:
                    this.f17792h = obtainStyledAttributes.getFloat(index, this.f17792h);
                    break;
                case 7:
                    this.f17793i = obtainStyledAttributes.getFloat(index, this.f17793i);
                    break;
                case 8:
                    float f2 = obtainStyledAttributes.getFloat(index, this.f17791g);
                    this.f17790f = f2;
                    this.f17791g = f2;
                    break;
                case 9:
                    this.f17794j = obtainStyledAttributes.getInt(index, this.f17794j);
                    break;
                case 10:
                    this.d = obtainStyledAttributes.getInt(index, this.d);
                    break;
                case 11:
                    this.f17790f = obtainStyledAttributes.getFloat(index, this.f17790f);
                    break;
                case 12:
                    this.f17791g = obtainStyledAttributes.getFloat(index, this.f17791g);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f17756a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }
}
