package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;

/* loaded from: classes3.dex */
public class KeyTrigger extends Key {

    /* renamed from: c, reason: collision with root package name */
    public int f17812c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public float f17813f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17814g;

    /* loaded from: classes3.dex */
    public static class Loader {

        /* renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f17815a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f17815a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f18332i);
        SparseIntArray sparseIntArray = Loader.f17815a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = Loader.f17815a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    obtainStyledAttributes.getString(index);
                    continue;
                case 2:
                    obtainStyledAttributes.getString(index);
                    continue;
                case 4:
                    obtainStyledAttributes.getString(index);
                    continue;
                case 5:
                    this.f17813f = obtainStyledAttributes.getFloat(index, this.f17813f);
                    continue;
                case 6:
                    this.d = obtainStyledAttributes.getResourceId(index, this.d);
                    continue;
                case 7:
                    int i3 = MotionLayout.P;
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.f17757b = obtainStyledAttributes.getResourceId(index, this.f17757b);
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        continue;
                    }
                case 8:
                    this.f17756a = obtainStyledAttributes.getInteger(index, this.f17756a);
                    continue;
                case 9:
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    continue;
                case 10:
                    this.f17814g = obtainStyledAttributes.getBoolean(index, this.f17814g);
                    continue;
                case 11:
                    this.f17812c = obtainStyledAttributes.getResourceId(index, this.f17812c);
                    break;
            }
            Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
        }
    }
}
