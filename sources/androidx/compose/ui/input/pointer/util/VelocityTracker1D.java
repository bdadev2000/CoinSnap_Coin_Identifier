package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class VelocityTracker1D {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15676a;

    /* renamed from: b, reason: collision with root package name */
    public final Strategy f15677b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15678c;
    public final DataPointAtTime[] d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f15679f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f15680g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f15681h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class Strategy {

        /* renamed from: a, reason: collision with root package name */
        public static final Strategy f15682a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Strategy[] f15683b;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy] */
        static {
            ?? r02 = new Enum("Lsq2", 0);
            f15682a = r02;
            f15683b = new Strategy[]{r02, new Enum("Impulse", 1)};
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) f15683b.clone();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VelocityTracker1D() {
        int i2;
        Strategy strategy = Strategy.f15682a;
        this.f15676a = false;
        this.f15677b = strategy;
        int ordinal = strategy.ordinal();
        if (ordinal == 0) {
            i2 = 3;
        } else {
            if (ordinal != 1) {
                throw new RuntimeException();
            }
            i2 = 2;
        }
        this.f15678c = i2;
        this.d = new DataPointAtTime[20];
        this.f15679f = new float[20];
        this.f15680g = new float[20];
        this.f15681h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, androidx.compose.ui.input.pointer.util.DataPointAtTime] */
    public final void a(long j2, float f2) {
        int i2 = (this.e + 1) % 20;
        this.e = i2;
        DataPointAtTime[] dataPointAtTimeArr = this.d;
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i2];
        if (dataPointAtTime != 0) {
            dataPointAtTime.f15669a = j2;
            dataPointAtTime.f15670b = f2;
        } else {
            ?? obj = new Object();
            obj.f15669a = j2;
            obj.f15670b = f2;
            dataPointAtTimeArr[i2] = obj;
        }
    }

    public final float b(float f2) {
        Strategy strategy;
        float[] fArr;
        float[] fArr2;
        boolean z2;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f2 <= 0.0f) {
            InlineClassHelperKt.b("maximumVelocity should be a positive value. You specified=" + f2);
            throw null;
        }
        int i2 = this.e;
        DataPointAtTime[] dataPointAtTimeArr = this.d;
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i2];
        if (dataPointAtTime == null) {
            f3 = 0.0f;
        } else {
            int i3 = 0;
            DataPointAtTime dataPointAtTime2 = dataPointAtTime;
            while (true) {
                DataPointAtTime dataPointAtTime3 = dataPointAtTimeArr[i2];
                boolean z3 = this.f15676a;
                strategy = this.f15677b;
                fArr = this.f15679f;
                fArr2 = this.f15680g;
                if (dataPointAtTime3 != null) {
                    long j2 = dataPointAtTime.f15669a;
                    int i4 = i2;
                    long j3 = dataPointAtTime3.f15669a;
                    float f6 = (float) (j2 - j3);
                    z2 = z3;
                    float abs = (float) Math.abs(j3 - dataPointAtTime2.f15669a);
                    dataPointAtTime2 = (strategy == Strategy.f15682a || z2) ? dataPointAtTime3 : dataPointAtTime;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = dataPointAtTime3.f15670b;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                } else {
                    z2 = z3;
                    break;
                }
            }
            if (i3 >= this.f15678c) {
                int ordinal = strategy.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.f15681h;
                        VelocityTrackerKt.c(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = 0.0f;
                    }
                } else {
                    if (ordinal != 1) {
                        throw new RuntimeException();
                    }
                    int i5 = i3 - 1;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = 0.0f;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z2 ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2));
                }
                f5 = f4 * 1000;
            } else {
                f5 = 0.0f;
            }
            f3 = 0.0f;
        }
        return (f5 == f3 || Float.isNaN(f5)) ? f3 : f5 > f3 ? a.x(f5, f2) : a.v(f5, -f2);
    }
}
