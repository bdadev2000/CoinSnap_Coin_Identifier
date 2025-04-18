package com.facebook.appevents.ml;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes3.dex */
public final class Operator {

    @NotNull
    public static final Operator INSTANCE = new Operator();

    private Operator() {
    }

    public static final void addmv(@NotNull MTensor mTensor, @NotNull MTensor mTensor2) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            a.s(mTensor, "x");
            a.s(mTensor2, "b");
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            int shape3 = mTensor.getShape(2);
            float[] data = mTensor.getData();
            float[] data2 = mTensor2.getData();
            if (shape <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (shape2 > 0) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i4 + 1;
                        if (shape3 > 0) {
                            int i6 = 0;
                            while (true) {
                                int i7 = i6 + 1;
                                int a2 = androidx.compose.foundation.text.input.a.a(i4, shape3, i2 * shape2 * shape3, i6);
                                data[a2] = data[a2] + data2[i6];
                                if (i7 >= shape3) {
                                    break;
                                } else {
                                    i6 = i7;
                                }
                            }
                        }
                        if (i5 >= shape2) {
                            break;
                        } else {
                            i4 = i5;
                        }
                    }
                }
                if (i3 >= shape) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    @NotNull
    public static final MTensor concatenate(@NotNull MTensor[] mTensorArr) {
        int i2;
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            a.s(mTensorArr, "tensors");
            int i3 = 0;
            int shape = mTensorArr[0].getShape(0);
            int length = mTensorArr.length - 1;
            if (length >= 0) {
                int i4 = 0;
                i2 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    i2 += mTensorArr[i4].getShape(1);
                    if (i5 > length) {
                        break;
                    }
                    i4 = i5;
                }
            } else {
                i2 = 0;
            }
            MTensor mTensor = new MTensor(new int[]{shape, i2});
            float[] data = mTensor.getData();
            if (shape > 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    int i8 = i6 * i2;
                    int length2 = mTensorArr.length - 1;
                    if (length2 >= 0) {
                        int i9 = i3;
                        while (true) {
                            int i10 = i9 + 1;
                            float[] data2 = mTensorArr[i9].getData();
                            int shape2 = mTensorArr[i9].getShape(1);
                            System.arraycopy(data2, i6 * shape2, data, i8, shape2);
                            i8 += shape2;
                            if (i10 > length2) {
                                break;
                            }
                            i9 = i10;
                        }
                    }
                    if (i7 >= shape) {
                        break;
                    }
                    i6 = i7;
                    i3 = 0;
                }
            }
            return mTensor;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    @NotNull
    public static final MTensor conv1D(@NotNull MTensor mTensor, @NotNull MTensor mTensor2) {
        Class<Operator> cls;
        MTensor mTensor3;
        int i2;
        int i3;
        Class<Operator> cls2 = Operator.class;
        if (CrashShieldHandler.isObjectCrashing(cls2)) {
            return null;
        }
        try {
            a.s(mTensor, "x");
            a.s(mTensor2, "w");
            int i4 = 0;
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            int shape3 = mTensor.getShape(2);
            int shape4 = mTensor2.getShape(0);
            int i5 = (shape2 - shape4) + 1;
            int shape5 = mTensor2.getShape(2);
            MTensor mTensor4 = new MTensor(new int[]{shape, i5, shape5});
            float[] data = mTensor.getData();
            float[] data2 = mTensor4.getData();
            float[] data3 = mTensor2.getData();
            if (shape <= 0) {
                return mTensor4;
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                if (shape5 > 0) {
                    int i8 = i4;
                    while (true) {
                        int i9 = i8 + 1;
                        if (i5 > 0) {
                            int i10 = 0;
                            while (true) {
                                cls = cls2;
                                int i11 = i10 + 1;
                                float f2 = 0.0f;
                                if (shape4 > 0) {
                                    int i12 = 0;
                                    while (true) {
                                        mTensor3 = mTensor4;
                                        int i13 = i12 + 1;
                                        if (shape3 > 0) {
                                            int i14 = 0;
                                            while (true) {
                                                i3 = shape;
                                                int i15 = i14 + 1;
                                                try {
                                                    f2 = (data[((i12 + i10) * shape3) + (shape2 * shape3 * i6) + i14] * data3[(((i12 * shape3) + i14) * shape5) + i8]) + f2;
                                                    if (i15 >= shape3) {
                                                        break;
                                                    }
                                                    i14 = i15;
                                                    shape = i3;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    CrashShieldHandler.handleThrowable(th, cls);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            i3 = shape;
                                        }
                                        if (i13 >= shape4) {
                                            break;
                                        }
                                        i12 = i13;
                                        mTensor4 = mTensor3;
                                        shape = i3;
                                    }
                                } else {
                                    i3 = shape;
                                    mTensor3 = mTensor4;
                                }
                                data2[androidx.compose.foundation.text.input.a.a(i10, shape5, i5 * shape5 * i6, i8)] = f2;
                                if (i11 >= i5) {
                                    break;
                                }
                                i10 = i11;
                                cls2 = cls;
                                mTensor4 = mTensor3;
                                shape = i3;
                            }
                        } else {
                            cls = cls2;
                            i3 = shape;
                            mTensor3 = mTensor4;
                        }
                        if (i9 >= shape5) {
                            break;
                        }
                        i8 = i9;
                        cls2 = cls;
                        mTensor4 = mTensor3;
                        shape = i3;
                    }
                    i2 = i3;
                } else {
                    cls = cls2;
                    mTensor3 = mTensor4;
                    i2 = shape;
                }
                if (i7 >= i2) {
                    return mTensor3;
                }
                shape = i2;
                i6 = i7;
                cls2 = cls;
                mTensor4 = mTensor3;
                i4 = 0;
            }
        } catch (Throwable th2) {
            th = th2;
            cls = cls2;
        }
    }

    @NotNull
    public static final MTensor dense(@NotNull MTensor mTensor, @NotNull MTensor mTensor2, @NotNull MTensor mTensor3) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            a.s(mTensor, "x");
            a.s(mTensor2, "w");
            a.s(mTensor3, "b");
            int shape = mTensor.getShape(0);
            int shape2 = mTensor3.getShape(0);
            MTensor mul = mul(mTensor, mTensor2);
            float[] data = mTensor3.getData();
            float[] data2 = mul.getData();
            if (shape > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (shape2 > 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            int i6 = (i2 * shape2) + i4;
                            data2[i6] = data2[i6] + data[i4];
                            if (i5 >= shape2) {
                                break;
                            }
                            i4 = i5;
                        }
                    }
                    if (i3 >= shape) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return mul;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    @NotNull
    public static final MTensor embedding(@NotNull String[] strArr, int i2, @NotNull MTensor mTensor) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            a.s(strArr, "texts");
            a.s(mTensor, "w");
            int length = strArr.length;
            int shape = mTensor.getShape(1);
            MTensor mTensor2 = new MTensor(new int[]{length, i2, shape});
            float[] data = mTensor2.getData();
            float[] data2 = mTensor.getData();
            if (length > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    int[] vectorize = Utils.INSTANCE.vectorize(strArr[i3], i2);
                    if (i2 > 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            System.arraycopy(data2, vectorize[i5] * shape, data, (i5 * shape) + (shape * i2 * i3), shape);
                            if (i6 >= i2) {
                                break;
                            }
                            i5 = i6;
                        }
                    }
                    if (i4 >= length) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return mTensor2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final void flatten(@NotNull MTensor mTensor, int i2) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            a.s(mTensor, "x");
            if (i2 >= mTensor.getShapeSize()) {
                return;
            }
            int shapeSize = mTensor.getShapeSize();
            int i3 = 1;
            if (i2 < shapeSize) {
                int i4 = i2;
                while (true) {
                    int i5 = i4 + 1;
                    i3 *= mTensor.getShape(i4);
                    if (i5 >= shapeSize) {
                        break;
                    } else {
                        i4 = i5;
                    }
                }
            }
            int[] iArr = new int[i2 + 1];
            if (i2 > 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    iArr[i6] = mTensor.getShape(i6);
                    if (i7 >= i2) {
                        break;
                    } else {
                        i6 = i7;
                    }
                }
            }
            iArr[i2] = i3;
            mTensor.reshape(iArr);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    @NotNull
    public static final MTensor maxPool1D(@NotNull MTensor mTensor, int i2) {
        int i3;
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            a.s(mTensor, "x");
            int i4 = 0;
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            int shape3 = mTensor.getShape(2);
            int i5 = (shape2 - i2) + 1;
            MTensor mTensor2 = new MTensor(new int[]{shape, i5, shape3});
            float[] data = mTensor.getData();
            float[] data2 = mTensor2.getData();
            if (shape > 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    if (shape3 > 0) {
                        int i8 = i4;
                        while (true) {
                            int i9 = i8 + 1;
                            if (i5 > 0) {
                                int i10 = i4;
                                while (true) {
                                    int i11 = i10 + 1;
                                    int i12 = i10 * shape3;
                                    int i13 = (i6 * i5 * shape3) + i12 + i8;
                                    int i14 = (i6 * shape2 * shape3) + i12 + i8;
                                    data2[i13] = Float.MIN_VALUE;
                                    if (i2 > 0) {
                                        int i15 = 0;
                                        while (true) {
                                            int i16 = i15 + 1;
                                            i3 = shape2;
                                            data2[i13] = Math.max(data2[i13], data[(i15 * shape3) + i14]);
                                            if (i16 >= i2) {
                                                break;
                                            }
                                            i15 = i16;
                                            shape2 = i3;
                                        }
                                    } else {
                                        i3 = shape2;
                                    }
                                    if (i11 >= i5) {
                                        break;
                                    }
                                    i10 = i11;
                                    shape2 = i3;
                                }
                            } else {
                                i3 = shape2;
                            }
                            if (i9 >= shape3) {
                                break;
                            }
                            i8 = i9;
                            shape2 = i3;
                            i4 = 0;
                        }
                    } else {
                        i3 = shape2;
                    }
                    if (i7 >= shape) {
                        break;
                    }
                    i6 = i7;
                    shape2 = i3;
                    i4 = 0;
                }
            }
            return mTensor2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    @NotNull
    public static final MTensor mul(@NotNull MTensor mTensor, @NotNull MTensor mTensor2) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            a.s(mTensor, "x");
            a.s(mTensor2, "w");
            int i2 = 0;
            int shape = mTensor.getShape(0);
            int shape2 = mTensor2.getShape(0);
            int shape3 = mTensor2.getShape(1);
            MTensor mTensor3 = new MTensor(new int[]{shape, shape3});
            float[] data = mTensor.getData();
            float[] data2 = mTensor2.getData();
            float[] data3 = mTensor3.getData();
            if (shape > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (shape3 > 0) {
                        int i5 = i2;
                        while (true) {
                            int i6 = i5 + 1;
                            int i7 = (i3 * shape3) + i5;
                            data3[i7] = 0.0f;
                            if (shape2 > 0) {
                                int i8 = i2;
                                while (true) {
                                    int i9 = i8 + 1;
                                    data3[i7] = (data[(i3 * shape2) + i8] * data2[(i8 * shape3) + i5]) + data3[i7];
                                    if (i9 >= shape2) {
                                        break;
                                    }
                                    i8 = i9;
                                }
                            }
                            if (i6 >= shape3) {
                                break;
                            }
                            i5 = i6;
                            i2 = 0;
                        }
                    }
                    if (i4 >= shape) {
                        break;
                    }
                    i3 = i4;
                    i2 = 0;
                }
            }
            return mTensor3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final void relu(@NotNull MTensor mTensor) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            a.s(mTensor, "x");
            float[] data = mTensor.getData();
            int length = data.length - 1;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (data[i2] < 0.0f) {
                    data[i2] = 0.0f;
                }
                if (i3 > length) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    public static final void softmax(@NotNull MTensor mTensor) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            a.s(mTensor, "x");
            int i2 = 0;
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            if (shape <= 0) {
                return;
            }
            while (true) {
                int i3 = i2 + 1;
                int i4 = i2 * shape2;
                int i5 = i4 + shape2;
                float f2 = Float.MIN_VALUE;
                if (i4 < i5) {
                    int i6 = i4;
                    while (true) {
                        int i7 = i6 + 1;
                        float f3 = data[i6];
                        if (f3 > f2) {
                            f2 = f3;
                        }
                        if (i7 >= i5) {
                            break;
                        } else {
                            i6 = i7;
                        }
                    }
                }
                float f4 = 0.0f;
                if (i4 < i5) {
                    int i8 = i4;
                    while (true) {
                        int i9 = i8 + 1;
                        float exp = (float) Math.exp(data[i8] - f2);
                        data[i8] = exp;
                        f4 += exp;
                        if (i9 >= i5) {
                            break;
                        } else {
                            i8 = i9;
                        }
                    }
                }
                if (i4 < i5) {
                    while (true) {
                        int i10 = i4 + 1;
                        data[i4] = data[i4] / f4;
                        if (i10 >= i5) {
                            break;
                        } else {
                            i4 = i10;
                        }
                    }
                }
                if (i3 >= shape) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    @NotNull
    public static final MTensor transpose2D(@NotNull MTensor mTensor) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            a.s(mTensor, "x");
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            MTensor mTensor2 = new MTensor(new int[]{shape2, shape});
            float[] data = mTensor.getData();
            float[] data2 = mTensor2.getData();
            if (shape > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (shape2 > 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            data2[(i4 * shape) + i2] = data[(i2 * shape2) + i4];
                            if (i5 >= shape2) {
                                break;
                            }
                            i4 = i5;
                        }
                    }
                    if (i3 >= shape) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return mTensor2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    @NotNull
    public static final MTensor transpose3D(@NotNull MTensor mTensor) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            a.s(mTensor, "x");
            int i2 = 0;
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            int shape3 = mTensor.getShape(2);
            MTensor mTensor2 = new MTensor(new int[]{shape3, shape2, shape});
            float[] data = mTensor.getData();
            float[] data2 = mTensor2.getData();
            if (shape > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (shape2 > 0) {
                        int i5 = i2;
                        while (true) {
                            int i6 = i5 + 1;
                            if (shape3 > 0) {
                                int i7 = i2;
                                while (true) {
                                    int i8 = i7 + 1;
                                    data2[androidx.compose.foundation.text.input.a.a(i5, shape, i7 * shape * shape2, i3)] = data[androidx.compose.foundation.text.input.a.a(i5, shape3, i3 * shape2 * shape3, i7)];
                                    if (i8 >= shape3) {
                                        break;
                                    }
                                    i7 = i8;
                                }
                            }
                            if (i6 >= shape2) {
                                break;
                            }
                            i5 = i6;
                            i2 = 0;
                        }
                    }
                    if (i4 >= shape) {
                        break;
                    }
                    i3 = i4;
                    i2 = 0;
                }
            }
            return mTensor2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }
}
