package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.core.view.MotionEventCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: p0, reason: collision with root package name */
    public static final SparseIntArray f865p0;

    /* renamed from: A, reason: collision with root package name */
    public int f866A;

    /* renamed from: B, reason: collision with root package name */
    public float f867B;

    /* renamed from: C, reason: collision with root package name */
    public int f868C;

    /* renamed from: D, reason: collision with root package name */
    public int f869D;

    /* renamed from: E, reason: collision with root package name */
    public int f870E;

    /* renamed from: F, reason: collision with root package name */
    public int f871F;

    /* renamed from: G, reason: collision with root package name */
    public int f872G;

    /* renamed from: H, reason: collision with root package name */
    public int f873H;

    /* renamed from: I, reason: collision with root package name */
    public int f874I;

    /* renamed from: J, reason: collision with root package name */
    public int f875J;

    /* renamed from: K, reason: collision with root package name */
    public int f876K;

    /* renamed from: L, reason: collision with root package name */
    public int f877L;

    /* renamed from: M, reason: collision with root package name */
    public int f878M;

    /* renamed from: N, reason: collision with root package name */
    public int f879N;
    public int O;

    /* renamed from: P, reason: collision with root package name */
    public int f880P;

    /* renamed from: Q, reason: collision with root package name */
    public int f881Q;

    /* renamed from: R, reason: collision with root package name */
    public int f882R;

    /* renamed from: S, reason: collision with root package name */
    public int f883S;

    /* renamed from: T, reason: collision with root package name */
    public float f884T;

    /* renamed from: U, reason: collision with root package name */
    public float f885U;

    /* renamed from: V, reason: collision with root package name */
    public int f886V;

    /* renamed from: W, reason: collision with root package name */
    public int f887W;

    /* renamed from: X, reason: collision with root package name */
    public int f888X;

    /* renamed from: Y, reason: collision with root package name */
    public int f889Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f890Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f891a;

    /* renamed from: a0, reason: collision with root package name */
    public int f892a0;
    public int b;

    /* renamed from: b0, reason: collision with root package name */
    public int f893b0;

    /* renamed from: c, reason: collision with root package name */
    public int f894c;

    /* renamed from: c0, reason: collision with root package name */
    public int f895c0;

    /* renamed from: d, reason: collision with root package name */
    public int f896d;

    /* renamed from: d0, reason: collision with root package name */
    public float f897d0;

    /* renamed from: e, reason: collision with root package name */
    public int f898e;

    /* renamed from: e0, reason: collision with root package name */
    public float f899e0;

    /* renamed from: f, reason: collision with root package name */
    public float f900f;
    public int f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f901g;

    /* renamed from: g0, reason: collision with root package name */
    public int f902g0;

    /* renamed from: h, reason: collision with root package name */
    public int f903h;

    /* renamed from: h0, reason: collision with root package name */
    public int f904h0;

    /* renamed from: i, reason: collision with root package name */
    public int f905i;

    /* renamed from: i0, reason: collision with root package name */
    public int[] f906i0;

    /* renamed from: j, reason: collision with root package name */
    public int f907j;

    /* renamed from: j0, reason: collision with root package name */
    public String f908j0;

    /* renamed from: k, reason: collision with root package name */
    public int f909k;

    /* renamed from: k0, reason: collision with root package name */
    public String f910k0;
    public int l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f911l0;
    public int m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f912m0;

    /* renamed from: n, reason: collision with root package name */
    public int f913n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f914n0;

    /* renamed from: o, reason: collision with root package name */
    public int f915o;

    /* renamed from: o0, reason: collision with root package name */
    public int f916o0;

    /* renamed from: p, reason: collision with root package name */
    public int f917p;

    /* renamed from: q, reason: collision with root package name */
    public int f918q;

    /* renamed from: r, reason: collision with root package name */
    public int f919r;

    /* renamed from: s, reason: collision with root package name */
    public int f920s;

    /* renamed from: t, reason: collision with root package name */
    public int f921t;

    /* renamed from: u, reason: collision with root package name */
    public int f922u;

    /* renamed from: v, reason: collision with root package name */
    public int f923v;

    /* renamed from: w, reason: collision with root package name */
    public float f924w;

    /* renamed from: x, reason: collision with root package name */
    public float f925x;

    /* renamed from: y, reason: collision with root package name */
    public String f926y;

    /* renamed from: z, reason: collision with root package name */
    public int f927z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f865p0 = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 41);
        sparseIntArray.append(16, 42);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f959e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            SparseIntArray sparseIntArray = f865p0;
            int i10 = sparseIntArray.get(index);
            switch (i10) {
                case 1:
                    this.f917p = o.f(obtainStyledAttributes, index, this.f917p);
                    break;
                case 2:
                    this.f874I = obtainStyledAttributes.getDimensionPixelSize(index, this.f874I);
                    break;
                case 3:
                    this.f915o = o.f(obtainStyledAttributes, index, this.f915o);
                    break;
                case 4:
                    this.f913n = o.f(obtainStyledAttributes, index, this.f913n);
                    break;
                case 5:
                    this.f926y = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.f868C = obtainStyledAttributes.getDimensionPixelOffset(index, this.f868C);
                    break;
                case 7:
                    this.f869D = obtainStyledAttributes.getDimensionPixelOffset(index, this.f869D);
                    break;
                case 8:
                    this.f875J = obtainStyledAttributes.getDimensionPixelSize(index, this.f875J);
                    break;
                case 9:
                    this.f923v = o.f(obtainStyledAttributes, index, this.f923v);
                    break;
                case 10:
                    this.f922u = o.f(obtainStyledAttributes, index, this.f922u);
                    break;
                case 11:
                    this.f880P = obtainStyledAttributes.getDimensionPixelSize(index, this.f880P);
                    break;
                case 12:
                    this.f881Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f881Q);
                    break;
                case 13:
                    this.f878M = obtainStyledAttributes.getDimensionPixelSize(index, this.f878M);
                    break;
                case 14:
                    this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case 15:
                    this.f882R = obtainStyledAttributes.getDimensionPixelSize(index, this.f882R);
                    break;
                case 16:
                    this.f879N = obtainStyledAttributes.getDimensionPixelSize(index, this.f879N);
                    break;
                case 17:
                    this.f896d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f896d);
                    break;
                case 18:
                    this.f898e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f898e);
                    break;
                case 19:
                    this.f900f = obtainStyledAttributes.getFloat(index, this.f900f);
                    break;
                case 20:
                    this.f924w = obtainStyledAttributes.getFloat(index, this.f924w);
                    break;
                case 21:
                    this.f894c = obtainStyledAttributes.getLayoutDimension(index, this.f894c);
                    break;
                case 22:
                    this.b = obtainStyledAttributes.getLayoutDimension(index, this.b);
                    break;
                case 23:
                    this.f871F = obtainStyledAttributes.getDimensionPixelSize(index, this.f871F);
                    break;
                case 24:
                    this.f903h = o.f(obtainStyledAttributes, index, this.f903h);
                    break;
                case 25:
                    this.f905i = o.f(obtainStyledAttributes, index, this.f905i);
                    break;
                case 26:
                    this.f870E = obtainStyledAttributes.getInt(index, this.f870E);
                    break;
                case 27:
                    this.f872G = obtainStyledAttributes.getDimensionPixelSize(index, this.f872G);
                    break;
                case 28:
                    this.f907j = o.f(obtainStyledAttributes, index, this.f907j);
                    break;
                case 29:
                    this.f909k = o.f(obtainStyledAttributes, index, this.f909k);
                    break;
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    this.f876K = obtainStyledAttributes.getDimensionPixelSize(index, this.f876K);
                    break;
                case 31:
                    this.f920s = o.f(obtainStyledAttributes, index, this.f920s);
                    break;
                case 32:
                    this.f921t = o.f(obtainStyledAttributes, index, this.f921t);
                    break;
                case 33:
                    this.f873H = obtainStyledAttributes.getDimensionPixelSize(index, this.f873H);
                    break;
                case 34:
                    this.m = o.f(obtainStyledAttributes, index, this.m);
                    break;
                case 35:
                    this.l = o.f(obtainStyledAttributes, index, this.l);
                    break;
                case 36:
                    this.f925x = obtainStyledAttributes.getFloat(index, this.f925x);
                    break;
                case 37:
                    this.f885U = obtainStyledAttributes.getFloat(index, this.f885U);
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    this.f884T = obtainStyledAttributes.getFloat(index, this.f884T);
                    break;
                case 39:
                    this.f886V = obtainStyledAttributes.getInt(index, this.f886V);
                    break;
                case 40:
                    this.f887W = obtainStyledAttributes.getInt(index, this.f887W);
                    break;
                case 41:
                    o.g(this, obtainStyledAttributes, index, 0);
                    break;
                case 42:
                    o.g(this, obtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i10) {
                        case 61:
                            this.f927z = o.f(obtainStyledAttributes, index, this.f927z);
                            break;
                        case 62:
                            this.f866A = obtainStyledAttributes.getDimensionPixelSize(index, this.f866A);
                            break;
                        case 63:
                            this.f867B = obtainStyledAttributes.getFloat(index, this.f867B);
                            break;
                        default:
                            switch (i10) {
                                case 69:
                                    this.f897d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.f899e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.f0 = obtainStyledAttributes.getInt(index, this.f0);
                                    break;
                                case 73:
                                    this.f902g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f902g0);
                                    break;
                                case 74:
                                    this.f908j0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.f914n0 = obtainStyledAttributes.getBoolean(index, this.f914n0);
                                    break;
                                case 76:
                                    this.f916o0 = obtainStyledAttributes.getInt(index, this.f916o0);
                                    break;
                                case 77:
                                    this.f918q = o.f(obtainStyledAttributes, index, this.f918q);
                                    break;
                                case 78:
                                    this.f919r = o.f(obtainStyledAttributes, index, this.f919r);
                                    break;
                                case 79:
                                    this.f883S = obtainStyledAttributes.getDimensionPixelSize(index, this.f883S);
                                    break;
                                case 80:
                                    this.f877L = obtainStyledAttributes.getDimensionPixelSize(index, this.f877L);
                                    break;
                                case 81:
                                    this.f888X = obtainStyledAttributes.getInt(index, this.f888X);
                                    break;
                                case 82:
                                    this.f889Y = obtainStyledAttributes.getInt(index, this.f889Y);
                                    break;
                                case 83:
                                    this.f892a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f892a0);
                                    break;
                                case 84:
                                    this.f890Z = obtainStyledAttributes.getDimensionPixelSize(index, this.f890Z);
                                    break;
                                case 85:
                                    this.f895c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f895c0);
                                    break;
                                case 86:
                                    this.f893b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f893b0);
                                    break;
                                case 87:
                                    this.f911l0 = obtainStyledAttributes.getBoolean(index, this.f911l0);
                                    break;
                                case 88:
                                    this.f912m0 = obtainStyledAttributes.getBoolean(index, this.f912m0);
                                    break;
                                case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                    this.f910k0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.f901g = obtainStyledAttributes.getBoolean(index, this.f901g);
                                    break;
                                case 91:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
