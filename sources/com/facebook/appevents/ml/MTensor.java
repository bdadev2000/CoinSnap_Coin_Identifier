package com.facebook.appevents.ml;

import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public final class MTensor {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private int capacity;

    @NotNull
    private float[] data;

    @NotNull
    private int[] shape;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getCapacity(int[] iArr) {
            if (iArr.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i2 = iArr[0];
            int i3 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    i2 *= iArr[i3];
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            return i2;
        }
    }

    public MTensor(@NotNull int[] iArr) {
        a.s(iArr, "shape");
        this.shape = iArr;
        int capacity = Companion.getCapacity(iArr);
        this.capacity = capacity;
        this.data = new float[capacity];
    }

    @NotNull
    public final float[] getData() {
        return this.data;
    }

    public final int getShape(int i2) {
        return this.shape[i2];
    }

    public final int getShapeSize() {
        return this.shape.length;
    }

    public final void reshape(@NotNull int[] iArr) {
        a.s(iArr, "shape");
        this.shape = iArr;
        int capacity = Companion.getCapacity(iArr);
        float[] fArr = new float[capacity];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.capacity, capacity));
        this.data = fArr;
        this.capacity = capacity;
    }
}
