package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.core.view.MotionEventCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.io.encoding.Base64;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: p0, reason: collision with root package name */
    public static final SparseIntArray f28374p0;

    /* renamed from: b, reason: collision with root package name */
    public int f28376b;

    /* renamed from: c, reason: collision with root package name */
    public int f28378c;

    /* renamed from: i0, reason: collision with root package name */
    public int[] f28391i0;

    /* renamed from: j0, reason: collision with root package name */
    public String f28393j0;

    /* renamed from: k0, reason: collision with root package name */
    public String f28395k0;
    public boolean a = false;

    /* renamed from: d, reason: collision with root package name */
    public int f28380d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f28382e = -1;

    /* renamed from: f, reason: collision with root package name */
    public float f28384f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28386g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f28388h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f28390i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f28392j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f28394k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f28396l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f28398m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f28400n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f28402o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f28404p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f28405q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f28406r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f28407s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f28408t = -1;
    public int u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f28409v = -1;

    /* renamed from: w, reason: collision with root package name */
    public float f28410w = 0.5f;

    /* renamed from: x, reason: collision with root package name */
    public float f28411x = 0.5f;

    /* renamed from: y, reason: collision with root package name */
    public String f28412y = null;

    /* renamed from: z, reason: collision with root package name */
    public int f28413z = -1;
    public int A = 0;
    public float B = 0.0f;
    public int C = -1;
    public int D = -1;
    public int E = -1;
    public int F = 0;
    public int G = 0;
    public int H = 0;
    public int I = 0;
    public int J = 0;
    public int K = 0;
    public int L = 0;
    public int M = Integer.MIN_VALUE;
    public int N = Integer.MIN_VALUE;
    public int O = Integer.MIN_VALUE;
    public int P = Integer.MIN_VALUE;
    public int Q = Integer.MIN_VALUE;
    public int R = Integer.MIN_VALUE;
    public int S = Integer.MIN_VALUE;
    public float T = -1.0f;
    public float U = -1.0f;
    public int V = 0;
    public int W = 0;
    public int X = 0;
    public int Y = 0;
    public int Z = 0;

    /* renamed from: a0, reason: collision with root package name */
    public int f28375a0 = 0;

    /* renamed from: b0, reason: collision with root package name */
    public int f28377b0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public int f28379c0 = 0;

    /* renamed from: d0, reason: collision with root package name */
    public float f28381d0 = 1.0f;

    /* renamed from: e0, reason: collision with root package name */
    public float f28383e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public int f28385f0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    public int f28387g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    public int f28389h0 = -1;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f28397l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f28399m0 = false;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f28401n0 = true;

    /* renamed from: o0, reason: collision with root package name */
    public int f28403o0 = 0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28374p0 = sparseIntArray;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f28448e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray = f28374p0;
            int i11 = sparseIntArray.get(index);
            switch (i11) {
                case 1:
                    this.f28404p = n.f(obtainStyledAttributes, index, this.f28404p);
                    break;
                case 2:
                    this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case 3:
                    this.f28402o = n.f(obtainStyledAttributes, index, this.f28402o);
                    break;
                case 4:
                    this.f28400n = n.f(obtainStyledAttributes, index, this.f28400n);
                    break;
                case 5:
                    this.f28412y = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                    break;
                case 7:
                    this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                case 8:
                    this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 9:
                    this.f28409v = n.f(obtainStyledAttributes, index, this.f28409v);
                    break;
                case 10:
                    this.u = n.f(obtainStyledAttributes, index, this.u);
                    break;
                case 11:
                    this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case 12:
                    this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                case 13:
                    this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                    break;
                case 14:
                    this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case 15:
                    this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                case 16:
                    this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                case 17:
                    this.f28380d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f28380d);
                    break;
                case 18:
                    this.f28382e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f28382e);
                    break;
                case 19:
                    this.f28384f = obtainStyledAttributes.getFloat(index, this.f28384f);
                    break;
                case 20:
                    this.f28410w = obtainStyledAttributes.getFloat(index, this.f28410w);
                    break;
                case 21:
                    this.f28378c = obtainStyledAttributes.getLayoutDimension(index, this.f28378c);
                    break;
                case 22:
                    this.f28376b = obtainStyledAttributes.getLayoutDimension(index, this.f28376b);
                    break;
                case 23:
                    this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                    break;
                case 24:
                    this.f28388h = n.f(obtainStyledAttributes, index, this.f28388h);
                    break;
                case 25:
                    this.f28390i = n.f(obtainStyledAttributes, index, this.f28390i);
                    break;
                case 26:
                    this.E = obtainStyledAttributes.getInt(index, this.E);
                    break;
                case 27:
                    this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                case 28:
                    this.f28392j = n.f(obtainStyledAttributes, index, this.f28392j);
                    break;
                case NOTIFICATION_REDIRECT_VALUE:
                    this.f28394k = n.f(obtainStyledAttributes, index, this.f28394k);
                    break;
                case 30:
                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case TEMPLATE_HTML_SIZE_VALUE:
                    this.f28407s = n.f(obtainStyledAttributes, index, this.f28407s);
                    break;
                case 32:
                    this.f28408t = n.f(obtainStyledAttributes, index, this.f28408t);
                    break;
                case 33:
                    this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    this.f28398m = n.f(obtainStyledAttributes, index, this.f28398m);
                    break;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    this.f28396l = n.f(obtainStyledAttributes, index, this.f28396l);
                    break;
                case 36:
                    this.f28411x = obtainStyledAttributes.getFloat(index, this.f28411x);
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    this.U = obtainStyledAttributes.getFloat(index, this.U);
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    this.T = obtainStyledAttributes.getFloat(index, this.T);
                    break;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    this.V = obtainStyledAttributes.getInt(index, this.V);
                    break;
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                    this.W = obtainStyledAttributes.getInt(index, this.W);
                    break;
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    n.g(this, obtainStyledAttributes, index, 0);
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    n.g(this, obtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i11) {
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            this.f28413z = n.f(obtainStyledAttributes, index, this.f28413z);
                            break;
                        case 62:
                            this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                            break;
                        case 63:
                            this.B = obtainStyledAttributes.getFloat(index, this.B);
                            break;
                        default:
                            switch (i11) {
                                case 69:
                                    this.f28381d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.f28383e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.f28385f0 = obtainStyledAttributes.getInt(index, this.f28385f0);
                                    break;
                                case 73:
                                    this.f28387g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f28387g0);
                                    break;
                                case 74:
                                    this.f28393j0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.f28401n0 = obtainStyledAttributes.getBoolean(index, this.f28401n0);
                                    break;
                                case Base64.mimeLineLength /* 76 */:
                                    this.f28403o0 = obtainStyledAttributes.getInt(index, this.f28403o0);
                                    break;
                                case 77:
                                    this.f28405q = n.f(obtainStyledAttributes, index, this.f28405q);
                                    break;
                                case 78:
                                    this.f28406r = n.f(obtainStyledAttributes, index, this.f28406r);
                                    break;
                                case 79:
                                    this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                    break;
                                case 80:
                                    this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                    break;
                                case 81:
                                    this.X = obtainStyledAttributes.getInt(index, this.X);
                                    break;
                                case 82:
                                    this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 83:
                                    this.f28375a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f28375a0);
                                    break;
                                case 84:
                                    this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    break;
                                case 85:
                                    this.f28379c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f28379c0);
                                    break;
                                case 86:
                                    this.f28377b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f28377b0);
                                    break;
                                case 87:
                                    this.f28397l0 = obtainStyledAttributes.getBoolean(index, this.f28397l0);
                                    break;
                                case 88:
                                    this.f28399m0 = obtainStyledAttributes.getBoolean(index, this.f28399m0);
                                    break;
                                case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                    this.f28395k0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.f28386g = obtainStyledAttributes.getBoolean(index, this.f28386g);
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
