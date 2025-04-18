package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public final int C;
    public final int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;
    public int a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f28313a0;

    /* renamed from: b, reason: collision with root package name */
    public int f28314b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f28315b0;

    /* renamed from: c, reason: collision with root package name */
    public float f28316c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f28317c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28318d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f28319d0;

    /* renamed from: e, reason: collision with root package name */
    public int f28320e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f28321e0;

    /* renamed from: f, reason: collision with root package name */
    public int f28322f;

    /* renamed from: f0, reason: collision with root package name */
    public int f28323f0;

    /* renamed from: g, reason: collision with root package name */
    public int f28324g;

    /* renamed from: g0, reason: collision with root package name */
    public int f28325g0;

    /* renamed from: h, reason: collision with root package name */
    public int f28326h;

    /* renamed from: h0, reason: collision with root package name */
    public int f28327h0;

    /* renamed from: i, reason: collision with root package name */
    public int f28328i;

    /* renamed from: i0, reason: collision with root package name */
    public int f28329i0;

    /* renamed from: j, reason: collision with root package name */
    public int f28330j;

    /* renamed from: j0, reason: collision with root package name */
    public int f28331j0;

    /* renamed from: k, reason: collision with root package name */
    public int f28332k;

    /* renamed from: k0, reason: collision with root package name */
    public int f28333k0;

    /* renamed from: l, reason: collision with root package name */
    public int f28334l;

    /* renamed from: l0, reason: collision with root package name */
    public float f28335l0;

    /* renamed from: m, reason: collision with root package name */
    public int f28336m;

    /* renamed from: m0, reason: collision with root package name */
    public int f28337m0;

    /* renamed from: n, reason: collision with root package name */
    public int f28338n;

    /* renamed from: n0, reason: collision with root package name */
    public int f28339n0;

    /* renamed from: o, reason: collision with root package name */
    public int f28340o;

    /* renamed from: o0, reason: collision with root package name */
    public float f28341o0;

    /* renamed from: p, reason: collision with root package name */
    public int f28342p;

    /* renamed from: p0, reason: collision with root package name */
    public w.e f28343p0;

    /* renamed from: q, reason: collision with root package name */
    public int f28344q;

    /* renamed from: r, reason: collision with root package name */
    public float f28345r;

    /* renamed from: s, reason: collision with root package name */
    public int f28346s;

    /* renamed from: t, reason: collision with root package name */
    public int f28347t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public int f28348v;

    /* renamed from: w, reason: collision with root package name */
    public final int f28349w;

    /* renamed from: x, reason: collision with root package name */
    public int f28350x;

    /* renamed from: y, reason: collision with root package name */
    public final int f28351y;

    /* renamed from: z, reason: collision with root package name */
    public int f28352z;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.f28314b = -1;
        this.f28316c = -1.0f;
        this.f28318d = true;
        this.f28320e = -1;
        this.f28322f = -1;
        this.f28324g = -1;
        this.f28326h = -1;
        this.f28328i = -1;
        this.f28330j = -1;
        this.f28332k = -1;
        this.f28334l = -1;
        this.f28336m = -1;
        this.f28338n = -1;
        this.f28340o = -1;
        this.f28342p = -1;
        this.f28344q = 0;
        this.f28345r = 0.0f;
        this.f28346s = -1;
        this.f28347t = -1;
        this.u = -1;
        this.f28348v = -1;
        this.f28349w = Integer.MIN_VALUE;
        this.f28350x = Integer.MIN_VALUE;
        this.f28351y = Integer.MIN_VALUE;
        this.f28352z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.f28313a0 = true;
        this.f28315b0 = true;
        this.f28317c0 = false;
        this.f28319d0 = false;
        this.f28321e0 = false;
        this.f28323f0 = -1;
        this.f28325g0 = -1;
        this.f28327h0 = -1;
        this.f28329i0 = -1;
        this.f28331j0 = Integer.MIN_VALUE;
        this.f28333k0 = Integer.MIN_VALUE;
        this.f28335l0 = 0.5f;
        this.f28343p0 = new w.e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f28445b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            int i11 = d.a.get(index);
            switch (i11) {
                case 1:
                    this.V = obtainStyledAttributes.getInt(index, this.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f28342p);
                    this.f28342p = resourceId;
                    if (resourceId == -1) {
                        this.f28342p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.f28344q = obtainStyledAttributes.getDimensionPixelSize(index, this.f28344q);
                    break;
                case 4:
                    float f10 = obtainStyledAttributes.getFloat(index, this.f28345r) % 360.0f;
                    this.f28345r = f10;
                    if (f10 < 0.0f) {
                        this.f28345r = (360.0f - f10) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                    break;
                case 6:
                    this.f28314b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f28314b);
                    break;
                case 7:
                    this.f28316c = obtainStyledAttributes.getFloat(index, this.f28316c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f28320e);
                    this.f28320e = resourceId2;
                    if (resourceId2 == -1) {
                        this.f28320e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f28322f);
                    this.f28322f = resourceId3;
                    if (resourceId3 == -1) {
                        this.f28322f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f28324g);
                    this.f28324g = resourceId4;
                    if (resourceId4 == -1) {
                        this.f28324g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f28326h);
                    this.f28326h = resourceId5;
                    if (resourceId5 == -1) {
                        this.f28326h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f28328i);
                    this.f28328i = resourceId6;
                    if (resourceId6 == -1) {
                        this.f28328i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f28330j);
                    this.f28330j = resourceId7;
                    if (resourceId7 == -1) {
                        this.f28330j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f28332k);
                    this.f28332k = resourceId8;
                    if (resourceId8 == -1) {
                        this.f28332k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f28334l);
                    this.f28334l = resourceId9;
                    if (resourceId9 == -1) {
                        this.f28334l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f28336m);
                    this.f28336m = resourceId10;
                    if (resourceId10 == -1) {
                        this.f28336m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f28346s);
                    this.f28346s = resourceId11;
                    if (resourceId11 == -1) {
                        this.f28346s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f28347t);
                    this.f28347t = resourceId12;
                    if (resourceId12 == -1) {
                        this.f28347t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                    this.u = resourceId13;
                    if (resourceId13 == -1) {
                        this.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f28348v);
                    this.f28348v = resourceId14;
                    if (resourceId14 == -1) {
                        this.f28348v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    this.f28349w = obtainStyledAttributes.getDimensionPixelSize(index, this.f28349w);
                    break;
                case 22:
                    this.f28350x = obtainStyledAttributes.getDimensionPixelSize(index, this.f28350x);
                    break;
                case 23:
                    this.f28351y = obtainStyledAttributes.getDimensionPixelSize(index, this.f28351y);
                    break;
                case 24:
                    this.f28352z = obtainStyledAttributes.getDimensionPixelSize(index, this.f28352z);
                    break;
                case 25:
                    this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                    break;
                case 26:
                    this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                    break;
                case 27:
                    this.W = obtainStyledAttributes.getBoolean(index, this.W);
                    break;
                case 28:
                    this.X = obtainStyledAttributes.getBoolean(index, this.X);
                    break;
                case NOTIFICATION_REDIRECT_VALUE:
                    this.E = obtainStyledAttributes.getFloat(index, this.E);
                    break;
                case 30:
                    this.F = obtainStyledAttributes.getFloat(index, this.F);
                    break;
                case TEMPLATE_HTML_SIZE_VALUE:
                    int i12 = obtainStyledAttributes.getInt(index, 0);
                    this.L = i12;
                    if (i12 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i13 = obtainStyledAttributes.getInt(index, 0);
                    this.M = i13;
                    if (i13 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                            this.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    try {
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                            this.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                    this.L = 2;
                    break;
                case 36:
                    try {
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                            this.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    try {
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                            this.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                    this.M = 2;
                    break;
                default:
                    switch (i11) {
                        case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                            n.h(this, obtainStyledAttributes.getString(index));
                            break;
                        case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                            this.H = obtainStyledAttributes.getFloat(index, this.H);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            this.I = obtainStyledAttributes.getFloat(index, this.I);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            this.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                            break;
                        case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                            this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                            break;
                        case 51:
                            this.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f28338n);
                            this.f28338n = resourceId15;
                            if (resourceId15 == -1) {
                                this.f28338n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f28340o);
                            this.f28340o = resourceId16;
                            if (resourceId16 == -1) {
                                this.f28340o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 55:
                            this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                            break;
                        default:
                            switch (i11) {
                                case 64:
                                    n.g(this, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    n.g(this, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                    break;
                                case 67:
                                    this.f28318d = obtainStyledAttributes.getBoolean(index, this.f28318d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        this.f28319d0 = false;
        this.f28313a0 = true;
        this.f28315b0 = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.W) {
            this.f28313a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.X) {
            this.f28315b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f28313a0 = false;
            if (i10 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f28315b0 = false;
            if (i11 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f28316c != -1.0f || this.a != -1 || this.f28314b != -1) {
            this.f28319d0 = true;
            this.f28313a0 = true;
            this.f28315b0 = true;
            if (!(this.f28343p0 instanceof w.i)) {
                this.f28343p0 = new w.i();
            }
            ((w.i) this.f28343p0).S(this.V);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.e.resolveLayoutDirection(int):void");
    }

    public e() {
        super(-2, -2);
        this.a = -1;
        this.f28314b = -1;
        this.f28316c = -1.0f;
        this.f28318d = true;
        this.f28320e = -1;
        this.f28322f = -1;
        this.f28324g = -1;
        this.f28326h = -1;
        this.f28328i = -1;
        this.f28330j = -1;
        this.f28332k = -1;
        this.f28334l = -1;
        this.f28336m = -1;
        this.f28338n = -1;
        this.f28340o = -1;
        this.f28342p = -1;
        this.f28344q = 0;
        this.f28345r = 0.0f;
        this.f28346s = -1;
        this.f28347t = -1;
        this.u = -1;
        this.f28348v = -1;
        this.f28349w = Integer.MIN_VALUE;
        this.f28350x = Integer.MIN_VALUE;
        this.f28351y = Integer.MIN_VALUE;
        this.f28352z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.f28313a0 = true;
        this.f28315b0 = true;
        this.f28317c0 = false;
        this.f28319d0 = false;
        this.f28321e0 = false;
        this.f28323f0 = -1;
        this.f28325g0 = -1;
        this.f28327h0 = -1;
        this.f28329i0 = -1;
        this.f28331j0 = Integer.MIN_VALUE;
        this.f28333k0 = Integer.MIN_VALUE;
        this.f28335l0 = 0.5f;
        this.f28343p0 = new w.e();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = -1;
        this.f28314b = -1;
        this.f28316c = -1.0f;
        this.f28318d = true;
        this.f28320e = -1;
        this.f28322f = -1;
        this.f28324g = -1;
        this.f28326h = -1;
        this.f28328i = -1;
        this.f28330j = -1;
        this.f28332k = -1;
        this.f28334l = -1;
        this.f28336m = -1;
        this.f28338n = -1;
        this.f28340o = -1;
        this.f28342p = -1;
        this.f28344q = 0;
        this.f28345r = 0.0f;
        this.f28346s = -1;
        this.f28347t = -1;
        this.u = -1;
        this.f28348v = -1;
        this.f28349w = Integer.MIN_VALUE;
        this.f28350x = Integer.MIN_VALUE;
        this.f28351y = Integer.MIN_VALUE;
        this.f28352z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.f28313a0 = true;
        this.f28315b0 = true;
        this.f28317c0 = false;
        this.f28319d0 = false;
        this.f28321e0 = false;
        this.f28323f0 = -1;
        this.f28325g0 = -1;
        this.f28327h0 = -1;
        this.f28329i0 = -1;
        this.f28331j0 = Integer.MIN_VALUE;
        this.f28333k0 = Integer.MIN_VALUE;
        this.f28335l0 = 0.5f;
        this.f28343p0 = new w.e();
    }
}
