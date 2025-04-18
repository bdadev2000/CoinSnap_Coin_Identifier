package androidx.constraintlayout.solver;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class SolverVariable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17945a;
    public float e;

    /* renamed from: i, reason: collision with root package name */
    public Type f17951i;

    /* renamed from: b, reason: collision with root package name */
    public int f17946b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f17947c = -1;
    public int d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17948f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f17949g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f17950h = new float[9];

    /* renamed from: j, reason: collision with root package name */
    public ArrayRow[] f17952j = new ArrayRow[16];

    /* renamed from: k, reason: collision with root package name */
    public int f17953k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f17954l = 0;

    /* renamed from: androidx.constraintlayout.solver.SolverVariable$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17955a;

        static {
            int[] iArr = new int[Type.values().length];
            f17955a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17955a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17955a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17955a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17955a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Type {

        /* renamed from: a, reason: collision with root package name */
        public static final Type f17956a;

        /* renamed from: b, reason: collision with root package name */
        public static final Type f17957b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f17958c;
        public static final Type d;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Type[] f17959f;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.constraintlayout.solver.SolverVariable$Type] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.constraintlayout.solver.SolverVariable$Type] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.constraintlayout.solver.SolverVariable$Type] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.constraintlayout.solver.SolverVariable$Type] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.constraintlayout.solver.SolverVariable$Type] */
        static {
            ?? r02 = new Enum("UNRESTRICTED", 0);
            f17956a = r02;
            ?? r1 = new Enum("CONSTANT", 1);
            ?? r2 = new Enum("SLACK", 2);
            f17957b = r2;
            ?? r3 = new Enum("ERROR", 3);
            f17958c = r3;
            ?? r4 = new Enum("UNKNOWN", 4);
            d = r4;
            f17959f = new Type[]{r02, r1, r2, r3, r4};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f17959f.clone();
        }
    }

    public SolverVariable(Type type) {
        this.f17951i = type;
    }

    public final void a(ArrayRow arrayRow) {
        int i2 = 0;
        while (true) {
            int i3 = this.f17953k;
            if (i2 >= i3) {
                ArrayRow[] arrayRowArr = this.f17952j;
                if (i3 >= arrayRowArr.length) {
                    this.f17952j = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.f17952j;
                int i4 = this.f17953k;
                arrayRowArr2[i4] = arrayRow;
                this.f17953k = i4 + 1;
                return;
            }
            if (this.f17952j[i2] == arrayRow) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void b(ArrayRow arrayRow) {
        int i2 = this.f17953k;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f17952j[i3] == arrayRow) {
                while (i3 < i2 - 1) {
                    ArrayRow[] arrayRowArr = this.f17952j;
                    int i4 = i3 + 1;
                    arrayRowArr[i3] = arrayRowArr[i4];
                    i3 = i4;
                }
                this.f17953k--;
                return;
            }
            i3++;
        }
    }

    public final void c() {
        this.f17951i = Type.d;
        this.d = 0;
        this.f17946b = -1;
        this.f17947c = -1;
        this.e = 0.0f;
        this.f17948f = false;
        int i2 = this.f17953k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f17952j[i3] = null;
        }
        this.f17953k = 0;
        this.f17954l = 0;
        this.f17945a = false;
        Arrays.fill(this.f17950h, 0.0f);
    }

    public final void d(ArrayRow arrayRow) {
        int i2 = this.f17953k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f17952j[i3].h(arrayRow, false);
        }
        this.f17953k = 0;
    }

    public final String toString() {
        return "" + this.f17946b;
    }
}
