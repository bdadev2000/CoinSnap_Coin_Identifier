package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintSet {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18248a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public boolean f18249b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18250c = new HashMap();

    /* loaded from: classes.dex */
    public static class Constraint {

        /* renamed from: a, reason: collision with root package name */
        public int f18251a;

        /* renamed from: b, reason: collision with root package name */
        public final PropertySet f18252b;

        /* renamed from: c, reason: collision with root package name */
        public final Motion f18253c;
        public final Layout d;
        public final Transform e;

        /* renamed from: f, reason: collision with root package name */
        public HashMap f18254f;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.widget.ConstraintSet$PropertySet, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.constraintlayout.widget.ConstraintSet$Motion] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.constraintlayout.widget.ConstraintSet$Layout] */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.constraintlayout.widget.ConstraintSet$Transform, java.lang.Object] */
        public Constraint() {
            ?? obj = new Object();
            obj.f18294a = false;
            obj.f18295b = 0;
            obj.f18296c = 0;
            obj.d = 1.0f;
            obj.e = Float.NaN;
            this.f18252b = obj;
            ?? obj2 = new Object();
            obj2.f18289a = false;
            obj2.f18290b = -1;
            obj2.f18291c = null;
            obj2.d = -1;
            obj2.e = 0;
            obj2.f18292f = Float.NaN;
            obj2.f18293g = Float.NaN;
            this.f18253c = obj2;
            ?? obj3 = new Object();
            obj3.f18256a = false;
            obj3.f18258b = false;
            obj3.e = -1;
            obj3.f18264f = -1;
            obj3.f18266g = -1.0f;
            obj3.f18268h = -1;
            obj3.f18270i = -1;
            obj3.f18272j = -1;
            obj3.f18274k = -1;
            obj3.f18275l = -1;
            obj3.f18276m = -1;
            obj3.f18277n = -1;
            obj3.f18278o = -1;
            obj3.f18279p = -1;
            obj3.f18280q = -1;
            obj3.f18281r = -1;
            obj3.f18282s = -1;
            obj3.f18283t = -1;
            obj3.f18284u = 0.5f;
            obj3.f18285v = 0.5f;
            obj3.w = null;
            obj3.x = -1;
            obj3.f18286y = 0;
            obj3.f18287z = 0.0f;
            obj3.A = -1;
            obj3.B = -1;
            obj3.C = -1;
            obj3.D = -1;
            obj3.E = -1;
            obj3.F = -1;
            obj3.G = -1;
            obj3.H = -1;
            obj3.I = -1;
            obj3.J = -1;
            obj3.K = -1;
            obj3.L = -1;
            obj3.M = -1;
            obj3.N = -1;
            obj3.O = -1;
            obj3.P = -1.0f;
            obj3.Q = -1.0f;
            obj3.R = 0;
            obj3.S = 0;
            obj3.T = 0;
            obj3.U = 0;
            obj3.V = -1;
            obj3.W = -1;
            obj3.X = -1;
            obj3.Y = -1;
            obj3.Z = 1.0f;
            obj3.f18257a0 = 1.0f;
            obj3.f18259b0 = -1;
            obj3.f18261c0 = 0;
            obj3.f18262d0 = -1;
            obj3.f18269h0 = false;
            obj3.f18271i0 = false;
            obj3.f18273j0 = true;
            this.d = obj3;
            ?? obj4 = new Object();
            obj4.f18298a = false;
            obj4.f18299b = 0.0f;
            obj4.f18300c = 0.0f;
            obj4.d = 0.0f;
            obj4.e = 1.0f;
            obj4.f18301f = 1.0f;
            obj4.f18302g = Float.NaN;
            obj4.f18303h = Float.NaN;
            obj4.f18304i = 0.0f;
            obj4.f18305j = 0.0f;
            obj4.f18306k = 0.0f;
            obj4.f18307l = false;
            obj4.f18308m = 0.0f;
            this.e = obj4;
            this.f18254f = new HashMap();
        }

        public final void a(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.d;
            layoutParams.d = layout.f18268h;
            layoutParams.e = layout.f18270i;
            layoutParams.f18206f = layout.f18272j;
            layoutParams.f18208g = layout.f18274k;
            layoutParams.f18210h = layout.f18275l;
            layoutParams.f18212i = layout.f18276m;
            layoutParams.f18214j = layout.f18277n;
            layoutParams.f18216k = layout.f18278o;
            layoutParams.f18218l = layout.f18279p;
            layoutParams.f18223p = layout.f18280q;
            layoutParams.f18224q = layout.f18281r;
            layoutParams.f18225r = layout.f18282s;
            layoutParams.f18226s = layout.f18283t;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.D;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.E;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.F;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.G;
            layoutParams.x = layout.O;
            layoutParams.f18230y = layout.N;
            layoutParams.f18228u = layout.K;
            layoutParams.w = layout.M;
            layoutParams.f18231z = layout.f18284u;
            layoutParams.A = layout.f18285v;
            layoutParams.f18220m = layout.x;
            layoutParams.f18221n = layout.f18286y;
            layoutParams.f18222o = layout.f18287z;
            layoutParams.B = layout.w;
            layoutParams.P = layout.A;
            layoutParams.Q = layout.B;
            layoutParams.E = layout.P;
            layoutParams.D = layout.Q;
            layoutParams.G = layout.S;
            layoutParams.F = layout.R;
            layoutParams.S = layout.f18269h0;
            layoutParams.T = layout.f18271i0;
            layoutParams.H = layout.T;
            layoutParams.I = layout.U;
            layoutParams.L = layout.V;
            layoutParams.M = layout.W;
            layoutParams.J = layout.X;
            layoutParams.K = layout.Y;
            layoutParams.N = layout.Z;
            layoutParams.O = layout.f18257a0;
            layoutParams.R = layout.C;
            layoutParams.f18202c = layout.f18266g;
            layoutParams.f18198a = layout.e;
            layoutParams.f18200b = layout.f18264f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.f18260c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.d;
            String str = layout.f18267g0;
            if (str != null) {
                layoutParams.U = str;
            }
            layoutParams.setMarginStart(layout.I);
            layoutParams.setMarginEnd(layout.H);
            layoutParams.a();
        }

        public final void b(int i2, ConstraintLayout.LayoutParams layoutParams) {
            this.f18251a = i2;
            int i3 = layoutParams.d;
            Layout layout = this.d;
            layout.f18268h = i3;
            layout.f18270i = layoutParams.e;
            layout.f18272j = layoutParams.f18206f;
            layout.f18274k = layoutParams.f18208g;
            layout.f18275l = layoutParams.f18210h;
            layout.f18276m = layoutParams.f18212i;
            layout.f18277n = layoutParams.f18214j;
            layout.f18278o = layoutParams.f18216k;
            layout.f18279p = layoutParams.f18218l;
            layout.f18280q = layoutParams.f18223p;
            layout.f18281r = layoutParams.f18224q;
            layout.f18282s = layoutParams.f18225r;
            layout.f18283t = layoutParams.f18226s;
            layout.f18284u = layoutParams.f18231z;
            layout.f18285v = layoutParams.A;
            layout.w = layoutParams.B;
            layout.x = layoutParams.f18220m;
            layout.f18286y = layoutParams.f18221n;
            layout.f18287z = layoutParams.f18222o;
            layout.A = layoutParams.P;
            layout.B = layoutParams.Q;
            layout.C = layoutParams.R;
            layout.f18266g = layoutParams.f18202c;
            layout.e = layoutParams.f18198a;
            layout.f18264f = layoutParams.f18200b;
            layout.f18260c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.D = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.E = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.F = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.G = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.P = layoutParams.E;
            layout.Q = layoutParams.D;
            layout.S = layoutParams.G;
            layout.R = layoutParams.F;
            layout.f18269h0 = layoutParams.S;
            layout.f18271i0 = layoutParams.T;
            layout.T = layoutParams.H;
            layout.U = layoutParams.I;
            layout.V = layoutParams.L;
            layout.W = layoutParams.M;
            layout.X = layoutParams.J;
            layout.Y = layoutParams.K;
            layout.Z = layoutParams.N;
            layout.f18257a0 = layoutParams.O;
            layout.f18267g0 = layoutParams.U;
            layout.K = layoutParams.f18228u;
            layout.M = layoutParams.w;
            layout.J = layoutParams.f18227t;
            layout.L = layoutParams.f18229v;
            layout.O = layoutParams.x;
            layout.N = layoutParams.f18230y;
            layout.H = layoutParams.getMarginEnd();
            layout.I = layoutParams.getMarginStart();
        }

        public final void c(int i2, Constraints.LayoutParams layoutParams) {
            b(i2, layoutParams);
            this.f18252b.d = layoutParams.f18310m0;
            float f2 = layoutParams.f18313p0;
            Transform transform = this.e;
            transform.f18299b = f2;
            transform.f18300c = layoutParams.f18314q0;
            transform.d = layoutParams.f18315r0;
            transform.e = layoutParams.f18316s0;
            transform.f18301f = layoutParams.f18317t0;
            transform.f18302g = layoutParams.f18318u0;
            transform.f18303h = layoutParams.f18319v0;
            transform.f18304i = layoutParams.f18320w0;
            transform.f18305j = layoutParams.f18321x0;
            transform.f18306k = layoutParams.f18322y0;
            transform.f18308m = layoutParams.f18312o0;
            transform.f18307l = layoutParams.f18311n0;
        }

        public final Object clone() {
            Constraint constraint = new Constraint();
            constraint.d.a(this.d);
            constraint.f18253c.a(this.f18253c);
            PropertySet propertySet = constraint.f18252b;
            propertySet.getClass();
            PropertySet propertySet2 = this.f18252b;
            propertySet.f18294a = propertySet2.f18294a;
            propertySet.f18295b = propertySet2.f18295b;
            propertySet.d = propertySet2.d;
            propertySet.e = propertySet2.e;
            propertySet.f18296c = propertySet2.f18296c;
            constraint.e.a(this.e);
            constraint.f18251a = this.f18251a;
            return constraint;
        }
    }

    /* loaded from: classes.dex */
    public static class Layout {

        /* renamed from: k0, reason: collision with root package name */
        public static final SparseIntArray f18255k0;
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public float P;
        public float Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public int V;
        public int W;
        public int X;
        public int Y;
        public float Z;

        /* renamed from: a, reason: collision with root package name */
        public boolean f18256a;

        /* renamed from: a0, reason: collision with root package name */
        public float f18257a0;

        /* renamed from: b, reason: collision with root package name */
        public boolean f18258b;

        /* renamed from: b0, reason: collision with root package name */
        public int f18259b0;

        /* renamed from: c, reason: collision with root package name */
        public int f18260c;

        /* renamed from: c0, reason: collision with root package name */
        public int f18261c0;
        public int d;

        /* renamed from: d0, reason: collision with root package name */
        public int f18262d0;
        public int e;

        /* renamed from: e0, reason: collision with root package name */
        public int[] f18263e0;

        /* renamed from: f, reason: collision with root package name */
        public int f18264f;

        /* renamed from: f0, reason: collision with root package name */
        public String f18265f0;

        /* renamed from: g, reason: collision with root package name */
        public float f18266g;

        /* renamed from: g0, reason: collision with root package name */
        public String f18267g0;

        /* renamed from: h, reason: collision with root package name */
        public int f18268h;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f18269h0;

        /* renamed from: i, reason: collision with root package name */
        public int f18270i;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f18271i0;

        /* renamed from: j, reason: collision with root package name */
        public int f18272j;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f18273j0;

        /* renamed from: k, reason: collision with root package name */
        public int f18274k;

        /* renamed from: l, reason: collision with root package name */
        public int f18275l;

        /* renamed from: m, reason: collision with root package name */
        public int f18276m;

        /* renamed from: n, reason: collision with root package name */
        public int f18277n;

        /* renamed from: o, reason: collision with root package name */
        public int f18278o;

        /* renamed from: p, reason: collision with root package name */
        public int f18279p;

        /* renamed from: q, reason: collision with root package name */
        public int f18280q;

        /* renamed from: r, reason: collision with root package name */
        public int f18281r;

        /* renamed from: s, reason: collision with root package name */
        public int f18282s;

        /* renamed from: t, reason: collision with root package name */
        public int f18283t;

        /* renamed from: u, reason: collision with root package name */
        public float f18284u;

        /* renamed from: v, reason: collision with root package name */
        public float f18285v;
        public String w;
        public int x;

        /* renamed from: y, reason: collision with root package name */
        public int f18286y;

        /* renamed from: z, reason: collision with root package name */
        public float f18287z;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f18255k0 = sparseIntArray;
            sparseIntArray.append(38, 24);
            sparseIntArray.append(39, 25);
            sparseIntArray.append(41, 28);
            sparseIntArray.append(42, 29);
            sparseIntArray.append(47, 35);
            sparseIntArray.append(46, 34);
            sparseIntArray.append(20, 4);
            sparseIntArray.append(19, 3);
            sparseIntArray.append(17, 1);
            sparseIntArray.append(55, 6);
            sparseIntArray.append(56, 7);
            sparseIntArray.append(27, 17);
            sparseIntArray.append(28, 18);
            sparseIntArray.append(29, 19);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(43, 31);
            sparseIntArray.append(44, 32);
            sparseIntArray.append(26, 10);
            sparseIntArray.append(25, 9);
            sparseIntArray.append(59, 13);
            sparseIntArray.append(62, 16);
            sparseIntArray.append(60, 14);
            sparseIntArray.append(57, 11);
            sparseIntArray.append(61, 15);
            sparseIntArray.append(58, 12);
            sparseIntArray.append(50, 38);
            sparseIntArray.append(36, 37);
            sparseIntArray.append(35, 39);
            sparseIntArray.append(49, 40);
            sparseIntArray.append(34, 20);
            sparseIntArray.append(48, 36);
            sparseIntArray.append(24, 5);
            sparseIntArray.append(37, 76);
            sparseIntArray.append(45, 76);
            sparseIntArray.append(40, 76);
            sparseIntArray.append(18, 76);
            sparseIntArray.append(16, 76);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(21, 61);
            sparseIntArray.append(23, 62);
            sparseIntArray.append(22, 63);
            sparseIntArray.append(54, 69);
            sparseIntArray.append(33, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Layout layout) {
            this.f18256a = layout.f18256a;
            this.f18260c = layout.f18260c;
            this.f18258b = layout.f18258b;
            this.d = layout.d;
            this.e = layout.e;
            this.f18264f = layout.f18264f;
            this.f18266g = layout.f18266g;
            this.f18268h = layout.f18268h;
            this.f18270i = layout.f18270i;
            this.f18272j = layout.f18272j;
            this.f18274k = layout.f18274k;
            this.f18275l = layout.f18275l;
            this.f18276m = layout.f18276m;
            this.f18277n = layout.f18277n;
            this.f18278o = layout.f18278o;
            this.f18279p = layout.f18279p;
            this.f18280q = layout.f18280q;
            this.f18281r = layout.f18281r;
            this.f18282s = layout.f18282s;
            this.f18283t = layout.f18283t;
            this.f18284u = layout.f18284u;
            this.f18285v = layout.f18285v;
            this.w = layout.w;
            this.x = layout.x;
            this.f18286y = layout.f18286y;
            this.f18287z = layout.f18287z;
            this.A = layout.A;
            this.B = layout.B;
            this.C = layout.C;
            this.D = layout.D;
            this.E = layout.E;
            this.F = layout.F;
            this.G = layout.G;
            this.H = layout.H;
            this.I = layout.I;
            this.J = layout.J;
            this.K = layout.K;
            this.L = layout.L;
            this.M = layout.M;
            this.N = layout.N;
            this.O = layout.O;
            this.P = layout.P;
            this.Q = layout.Q;
            this.R = layout.R;
            this.S = layout.S;
            this.T = layout.T;
            this.U = layout.U;
            this.V = layout.V;
            this.W = layout.W;
            this.X = layout.X;
            this.Y = layout.Y;
            this.Z = layout.Z;
            this.f18257a0 = layout.f18257a0;
            this.f18259b0 = layout.f18259b0;
            this.f18261c0 = layout.f18261c0;
            this.f18262d0 = layout.f18262d0;
            this.f18267g0 = layout.f18267g0;
            int[] iArr = layout.f18263e0;
            if (iArr != null) {
                this.f18263e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f18263e0 = null;
            }
            this.f18265f0 = layout.f18265f0;
            this.f18269h0 = layout.f18269h0;
            this.f18271i0 = layout.f18271i0;
            this.f18273j0 = layout.f18273j0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f18333j);
            this.f18258b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                SparseIntArray sparseIntArray = f18255k0;
                int i3 = sparseIntArray.get(index);
                if (i3 == 80) {
                    this.f18269h0 = obtainStyledAttributes.getBoolean(index, this.f18269h0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.f18279p = ConstraintSet.j(obtainStyledAttributes, index, this.f18279p);
                            break;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.f18278o = ConstraintSet.j(obtainStyledAttributes, index, this.f18278o);
                            break;
                        case 4:
                            this.f18277n = ConstraintSet.j(obtainStyledAttributes, index, this.f18277n);
                            break;
                        case 5:
                            this.w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 8:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 9:
                            this.f18283t = ConstraintSet.j(obtainStyledAttributes, index, this.f18283t);
                            break;
                        case 10:
                            this.f18282s = ConstraintSet.j(obtainStyledAttributes, index, this.f18282s);
                            break;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 17:
                            this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                            break;
                        case 18:
                            this.f18264f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f18264f);
                            break;
                        case 19:
                            this.f18266g = obtainStyledAttributes.getFloat(index, this.f18266g);
                            break;
                        case 20:
                            this.f18284u = obtainStyledAttributes.getFloat(index, this.f18284u);
                            break;
                        case 21:
                            this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                            break;
                        case 22:
                            this.f18260c = obtainStyledAttributes.getLayoutDimension(index, this.f18260c);
                            break;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.f18268h = ConstraintSet.j(obtainStyledAttributes, index, this.f18268h);
                            break;
                        case 25:
                            this.f18270i = ConstraintSet.j(obtainStyledAttributes, index, this.f18270i);
                            break;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 28:
                            this.f18272j = ConstraintSet.j(obtainStyledAttributes, index, this.f18272j);
                            break;
                        case 29:
                            this.f18274k = ConstraintSet.j(obtainStyledAttributes, index, this.f18274k);
                            break;
                        case 30:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 31:
                            this.f18280q = ConstraintSet.j(obtainStyledAttributes, index, this.f18280q);
                            break;
                        case 32:
                            this.f18281r = ConstraintSet.j(obtainStyledAttributes, index, this.f18281r);
                            break;
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 34:
                            this.f18276m = ConstraintSet.j(obtainStyledAttributes, index, this.f18276m);
                            break;
                        case 35:
                            this.f18275l = ConstraintSet.j(obtainStyledAttributes, index, this.f18275l);
                            break;
                        case 36:
                            this.f18285v = obtainStyledAttributes.getFloat(index, this.f18285v);
                            break;
                        case 37:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 38:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            break;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i3) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case Opcodes.V15 /* 59 */:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i3) {
                                        case Opcodes.V17 /* 61 */:
                                            this.x = ConstraintSet.j(obtainStyledAttributes, index, this.x);
                                            break;
                                        case Opcodes.V18 /* 62 */:
                                            this.f18286y = obtainStyledAttributes.getDimensionPixelSize(index, this.f18286y);
                                            break;
                                        case 63:
                                            this.f18287z = obtainStyledAttributes.getFloat(index, this.f18287z);
                                            break;
                                        default:
                                            switch (i3) {
                                                case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case TypeReference.METHOD_REFERENCE /* 70 */:
                                                    this.f18257a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case TypeReference.CAST /* 71 */:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                                                    this.f18259b0 = obtainStyledAttributes.getInt(index, this.f18259b0);
                                                    break;
                                                case TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
                                                    this.f18261c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f18261c0);
                                                    break;
                                                case TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
                                                    this.f18265f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
                                                    this.f18273j0 = obtainStyledAttributes.getBoolean(index, this.f18273j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                    break;
                                                case 77:
                                                    this.f18267g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f18271i0 = obtainStyledAttributes.getBoolean(index, this.f18271i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class Motion {

        /* renamed from: h, reason: collision with root package name */
        public static final SparseIntArray f18288h;

        /* renamed from: a, reason: collision with root package name */
        public boolean f18289a;

        /* renamed from: b, reason: collision with root package name */
        public int f18290b;

        /* renamed from: c, reason: collision with root package name */
        public String f18291c;
        public int d;
        public int e;

        /* renamed from: f, reason: collision with root package name */
        public float f18292f;

        /* renamed from: g, reason: collision with root package name */
        public float f18293g;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f18288h = sparseIntArray;
            sparseIntArray.append(2, 1);
            sparseIntArray.append(4, 2);
            sparseIntArray.append(5, 3);
            sparseIntArray.append(1, 4);
            sparseIntArray.append(0, 5);
            sparseIntArray.append(3, 6);
        }

        public final void a(Motion motion) {
            this.f18289a = motion.f18289a;
            this.f18290b = motion.f18290b;
            this.f18291c = motion.f18291c;
            this.d = motion.d;
            this.e = motion.e;
            this.f18293g = motion.f18293g;
            this.f18292f = motion.f18292f;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f18334k);
            this.f18289a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (f18288h.get(index)) {
                    case 1:
                        this.f18293g = obtainStyledAttributes.getFloat(index, this.f18293g);
                        break;
                    case 2:
                        this.d = obtainStyledAttributes.getInt(index, this.d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f18291c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f18291c = Easing.f17751c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f18290b = ConstraintSet.j(obtainStyledAttributes, index, this.f18290b);
                        break;
                    case 6:
                        this.f18292f = obtainStyledAttributes.getFloat(index, this.f18292f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class PropertySet {

        /* renamed from: a, reason: collision with root package name */
        public boolean f18294a;

        /* renamed from: b, reason: collision with root package name */
        public int f18295b;

        /* renamed from: c, reason: collision with root package name */
        public int f18296c;
        public float d;
        public float e;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f18338o);
            this.f18294a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f18295b);
                    this.f18295b = i3;
                    this.f18295b = ConstraintSet.d[i3];
                } else if (index == 4) {
                    this.f18296c = obtainStyledAttributes.getInt(index, this.f18296c);
                } else if (index == 3) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class Transform {

        /* renamed from: n, reason: collision with root package name */
        public static final SparseIntArray f18297n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f18298a;

        /* renamed from: b, reason: collision with root package name */
        public float f18299b;

        /* renamed from: c, reason: collision with root package name */
        public float f18300c;
        public float d;
        public float e;

        /* renamed from: f, reason: collision with root package name */
        public float f18301f;

        /* renamed from: g, reason: collision with root package name */
        public float f18302g;

        /* renamed from: h, reason: collision with root package name */
        public float f18303h;

        /* renamed from: i, reason: collision with root package name */
        public float f18304i;

        /* renamed from: j, reason: collision with root package name */
        public float f18305j;

        /* renamed from: k, reason: collision with root package name */
        public float f18306k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f18307l;

        /* renamed from: m, reason: collision with root package name */
        public float f18308m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f18297n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
        }

        public final void a(Transform transform) {
            this.f18298a = transform.f18298a;
            this.f18299b = transform.f18299b;
            this.f18300c = transform.f18300c;
            this.d = transform.d;
            this.e = transform.e;
            this.f18301f = transform.f18301f;
            this.f18302g = transform.f18302g;
            this.f18303h = transform.f18303h;
            this.f18304i = transform.f18304i;
            this.f18305j = transform.f18305j;
            this.f18306k = transform.f18306k;
            this.f18307l = transform.f18307l;
            this.f18308m = transform.f18308m;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f18341r);
            this.f18298a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (f18297n.get(index)) {
                    case 1:
                        this.f18299b = obtainStyledAttributes.getFloat(index, this.f18299b);
                        break;
                    case 2:
                        this.f18300c = obtainStyledAttributes.getFloat(index, this.f18300c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f18301f = obtainStyledAttributes.getFloat(index, this.f18301f);
                        break;
                    case 6:
                        this.f18302g = obtainStyledAttributes.getDimension(index, this.f18302g);
                        break;
                    case 7:
                        this.f18303h = obtainStyledAttributes.getDimension(index, this.f18303h);
                        break;
                    case 8:
                        this.f18304i = obtainStyledAttributes.getDimension(index, this.f18304i);
                        break;
                    case 9:
                        this.f18305j = obtainStyledAttributes.getDimension(index, this.f18305j);
                        break;
                    case 10:
                        this.f18306k = obtainStyledAttributes.getDimension(index, this.f18306k);
                        break;
                    case 11:
                        this.f18307l = true;
                        this.f18308m = obtainStyledAttributes.getDimension(index, this.f18308m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] e(Barrier barrier, String str) {
        int i2;
        Object designInformation;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i2 = ((Integer) designInformation).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public static Constraint f(Context context, AttributeSet attributeSet) {
        Constraint constraint = new Constraint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f18326a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            PropertySet propertySet = constraint.f18252b;
            Motion motion = constraint.f18253c;
            Transform transform = constraint.e;
            Layout layout = constraint.d;
            if (index != 1 && 23 != index && 24 != index) {
                motion.f18289a = true;
                layout.f18258b = true;
                propertySet.f18294a = true;
                transform.f18298a = true;
            }
            SparseIntArray sparseIntArray = e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    layout.f18279p = j(obtainStyledAttributes, index, layout.f18279p);
                    break;
                case 2:
                    layout.G = obtainStyledAttributes.getDimensionPixelSize(index, layout.G);
                    break;
                case 3:
                    layout.f18278o = j(obtainStyledAttributes, index, layout.f18278o);
                    break;
                case 4:
                    layout.f18277n = j(obtainStyledAttributes, index, layout.f18277n);
                    break;
                case 5:
                    layout.w = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    layout.A = obtainStyledAttributes.getDimensionPixelOffset(index, layout.A);
                    break;
                case 7:
                    layout.B = obtainStyledAttributes.getDimensionPixelOffset(index, layout.B);
                    break;
                case 8:
                    layout.H = obtainStyledAttributes.getDimensionPixelSize(index, layout.H);
                    break;
                case 9:
                    layout.f18283t = j(obtainStyledAttributes, index, layout.f18283t);
                    break;
                case 10:
                    layout.f18282s = j(obtainStyledAttributes, index, layout.f18282s);
                    break;
                case 11:
                    layout.M = obtainStyledAttributes.getDimensionPixelSize(index, layout.M);
                    break;
                case 12:
                    layout.N = obtainStyledAttributes.getDimensionPixelSize(index, layout.N);
                    break;
                case 13:
                    layout.J = obtainStyledAttributes.getDimensionPixelSize(index, layout.J);
                    break;
                case 14:
                    layout.L = obtainStyledAttributes.getDimensionPixelSize(index, layout.L);
                    break;
                case 15:
                    layout.O = obtainStyledAttributes.getDimensionPixelSize(index, layout.O);
                    break;
                case 16:
                    layout.K = obtainStyledAttributes.getDimensionPixelSize(index, layout.K);
                    break;
                case 17:
                    layout.e = obtainStyledAttributes.getDimensionPixelOffset(index, layout.e);
                    break;
                case 18:
                    layout.f18264f = obtainStyledAttributes.getDimensionPixelOffset(index, layout.f18264f);
                    break;
                case 19:
                    layout.f18266g = obtainStyledAttributes.getFloat(index, layout.f18266g);
                    break;
                case 20:
                    layout.f18284u = obtainStyledAttributes.getFloat(index, layout.f18284u);
                    break;
                case 21:
                    layout.d = obtainStyledAttributes.getLayoutDimension(index, layout.d);
                    break;
                case 22:
                    propertySet.f18295b = d[obtainStyledAttributes.getInt(index, propertySet.f18295b)];
                    break;
                case 23:
                    layout.f18260c = obtainStyledAttributes.getLayoutDimension(index, layout.f18260c);
                    break;
                case 24:
                    layout.D = obtainStyledAttributes.getDimensionPixelSize(index, layout.D);
                    break;
                case 25:
                    layout.f18268h = j(obtainStyledAttributes, index, layout.f18268h);
                    break;
                case 26:
                    layout.f18270i = j(obtainStyledAttributes, index, layout.f18270i);
                    break;
                case 27:
                    layout.C = obtainStyledAttributes.getInt(index, layout.C);
                    break;
                case 28:
                    layout.E = obtainStyledAttributes.getDimensionPixelSize(index, layout.E);
                    break;
                case 29:
                    layout.f18272j = j(obtainStyledAttributes, index, layout.f18272j);
                    break;
                case 30:
                    layout.f18274k = j(obtainStyledAttributes, index, layout.f18274k);
                    break;
                case 31:
                    layout.I = obtainStyledAttributes.getDimensionPixelSize(index, layout.I);
                    break;
                case 32:
                    layout.f18280q = j(obtainStyledAttributes, index, layout.f18280q);
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    layout.f18281r = j(obtainStyledAttributes, index, layout.f18281r);
                    break;
                case 34:
                    layout.F = obtainStyledAttributes.getDimensionPixelSize(index, layout.F);
                    break;
                case 35:
                    layout.f18276m = j(obtainStyledAttributes, index, layout.f18276m);
                    break;
                case 36:
                    layout.f18275l = j(obtainStyledAttributes, index, layout.f18275l);
                    break;
                case 37:
                    layout.f18285v = obtainStyledAttributes.getFloat(index, layout.f18285v);
                    break;
                case 38:
                    constraint.f18251a = obtainStyledAttributes.getResourceId(index, constraint.f18251a);
                    break;
                case 39:
                    layout.Q = obtainStyledAttributes.getFloat(index, layout.Q);
                    break;
                case 40:
                    layout.P = obtainStyledAttributes.getFloat(index, layout.P);
                    break;
                case 41:
                    layout.R = obtainStyledAttributes.getInt(index, layout.R);
                    break;
                case 42:
                    layout.S = obtainStyledAttributes.getInt(index, layout.S);
                    break;
                case 43:
                    propertySet.d = obtainStyledAttributes.getFloat(index, propertySet.d);
                    break;
                case 44:
                    transform.f18307l = true;
                    transform.f18308m = obtainStyledAttributes.getDimension(index, transform.f18308m);
                    break;
                case 45:
                    transform.f18300c = obtainStyledAttributes.getFloat(index, transform.f18300c);
                    break;
                case 46:
                    transform.d = obtainStyledAttributes.getFloat(index, transform.d);
                    break;
                case 47:
                    transform.e = obtainStyledAttributes.getFloat(index, transform.e);
                    break;
                case 48:
                    transform.f18301f = obtainStyledAttributes.getFloat(index, transform.f18301f);
                    break;
                case 49:
                    transform.f18302g = obtainStyledAttributes.getDimension(index, transform.f18302g);
                    break;
                case 50:
                    transform.f18303h = obtainStyledAttributes.getDimension(index, transform.f18303h);
                    break;
                case 51:
                    transform.f18304i = obtainStyledAttributes.getDimension(index, transform.f18304i);
                    break;
                case 52:
                    transform.f18305j = obtainStyledAttributes.getDimension(index, transform.f18305j);
                    break;
                case 53:
                    transform.f18306k = obtainStyledAttributes.getDimension(index, transform.f18306k);
                    break;
                case 54:
                    layout.T = obtainStyledAttributes.getInt(index, layout.T);
                    break;
                case 55:
                    layout.U = obtainStyledAttributes.getInt(index, layout.U);
                    break;
                case 56:
                    layout.V = obtainStyledAttributes.getDimensionPixelSize(index, layout.V);
                    break;
                case 57:
                    layout.W = obtainStyledAttributes.getDimensionPixelSize(index, layout.W);
                    break;
                case 58:
                    layout.X = obtainStyledAttributes.getDimensionPixelSize(index, layout.X);
                    break;
                case Opcodes.V15 /* 59 */:
                    layout.Y = obtainStyledAttributes.getDimensionPixelSize(index, layout.Y);
                    break;
                case Opcodes.V16 /* 60 */:
                    transform.f18299b = obtainStyledAttributes.getFloat(index, transform.f18299b);
                    break;
                case Opcodes.V17 /* 61 */:
                    layout.x = j(obtainStyledAttributes, index, layout.x);
                    break;
                case Opcodes.V18 /* 62 */:
                    layout.f18286y = obtainStyledAttributes.getDimensionPixelSize(index, layout.f18286y);
                    break;
                case 63:
                    layout.f18287z = obtainStyledAttributes.getFloat(index, layout.f18287z);
                    break;
                case 64:
                    motion.f18290b = j(obtainStyledAttributes, index, motion.f18290b);
                    break;
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        motion.f18291c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        motion.f18291c = Easing.f17751c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    motion.e = obtainStyledAttributes.getInt(index, 0);
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    motion.f18293g = obtainStyledAttributes.getFloat(index, motion.f18293g);
                    break;
                case TypeReference.NEW /* 68 */:
                    propertySet.e = obtainStyledAttributes.getFloat(index, propertySet.e);
                    break;
                case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
                    layout.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case TypeReference.METHOD_REFERENCE /* 70 */:
                    layout.f18257a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case TypeReference.CAST /* 71 */:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                    layout.f18259b0 = obtainStyledAttributes.getInt(index, layout.f18259b0);
                    break;
                case TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
                    layout.f18261c0 = obtainStyledAttributes.getDimensionPixelSize(index, layout.f18261c0);
                    break;
                case TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
                    layout.f18265f0 = obtainStyledAttributes.getString(index);
                    break;
                case TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
                    layout.f18273j0 = obtainStyledAttributes.getBoolean(index, layout.f18273j0);
                    break;
                case 76:
                    motion.d = obtainStyledAttributes.getInt(index, motion.d);
                    break;
                case 77:
                    layout.f18267g0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    propertySet.f18296c = obtainStyledAttributes.getInt(index, propertySet.f18296c);
                    break;
                case Opcodes.IASTORE /* 79 */:
                    motion.f18292f = obtainStyledAttributes.getFloat(index, motion.f18292f);
                    break;
                case Opcodes.LASTORE /* 80 */:
                    layout.f18269h0 = obtainStyledAttributes.getBoolean(index, layout.f18269h0);
                    break;
                case Opcodes.FASTORE /* 81 */:
                    layout.f18271i0 = obtainStyledAttributes.getBoolean(index, layout.f18271i0);
                    break;
                case Opcodes.DASTORE /* 82 */:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return constraint;
    }

    public static int j(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            HashMap hashMap = this.f18250c;
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                Log.v("ConstraintSet", "id unknown " + Debug.b(childAt));
            } else {
                if (this.f18249b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (hashMap.containsKey(Integer.valueOf(id))) {
                    ConstraintAttribute.a(childAt, ((Constraint) hashMap.get(Integer.valueOf(id))).f18254f);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = this.f18250c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + Debug.b(childAt));
            } else {
                if (this.f18249b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        Constraint constraint = (Constraint) hashMap.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            constraint.d.f18262d0 = 1;
                        }
                        int i3 = constraint.d.f18262d0;
                        if (i3 != -1 && i3 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            Layout layout = constraint.d;
                            barrier.setType(layout.f18259b0);
                            barrier.setMargin(layout.f18261c0);
                            barrier.setAllowsGoneWidget(layout.f18273j0);
                            int[] iArr = layout.f18263e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = layout.f18265f0;
                                if (str != null) {
                                    int[] e2 = e(barrier, str);
                                    layout.f18263e0 = e2;
                                    barrier.setReferencedIds(e2);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.a();
                        constraint.a(layoutParams);
                        ConstraintAttribute.a(childAt, constraint.f18254f);
                        childAt.setLayoutParams(layoutParams);
                        PropertySet propertySet = constraint.f18252b;
                        if (propertySet.f18296c == 0) {
                            childAt.setVisibility(propertySet.f18295b);
                        }
                        childAt.setAlpha(propertySet.d);
                        Transform transform = constraint.e;
                        childAt.setRotation(transform.f18299b);
                        childAt.setRotationX(transform.f18300c);
                        childAt.setRotationY(transform.d);
                        childAt.setScaleX(transform.e);
                        childAt.setScaleY(transform.f18301f);
                        if (!Float.isNaN(transform.f18302g)) {
                            childAt.setPivotX(transform.f18302g);
                        }
                        if (!Float.isNaN(transform.f18303h)) {
                            childAt.setPivotY(transform.f18303h);
                        }
                        childAt.setTranslationX(transform.f18304i);
                        childAt.setTranslationY(transform.f18305j);
                        childAt.setTranslationZ(transform.f18306k);
                        if (transform.f18307l) {
                            childAt.setElevation(transform.f18308m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Constraint constraint2 = (Constraint) hashMap.get(num);
            Layout layout2 = constraint2.d;
            int i4 = layout2.f18262d0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = layout2.f18263e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = layout2.f18265f0;
                    if (str2 != null) {
                        int[] e3 = e(barrier2, str2);
                        layout2.f18263e0 = e3;
                        barrier2.setReferencedIds(e3);
                    }
                }
                barrier2.setType(layout2.f18259b0);
                barrier2.setMargin(layout2.f18261c0);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m();
                constraint2.a(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (layout2.f18256a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                constraint2.a(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int i2;
        ConstraintSet constraintSet = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = constraintSet.f18250c;
        hashMap.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (constraintSet.f18249b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = (Constraint) hashMap.get(Integer.valueOf(id));
            HashMap hashMap2 = constraintSet.f18248a;
            HashMap hashMap3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap2.keySet()) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) hashMap2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        i2 = childCount;
                    } else {
                        i2 = childCount;
                        try {
                            hashMap3.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            e.printStackTrace();
                            childCount = i2;
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            e.printStackTrace();
                            childCount = i2;
                        } catch (InvocationTargetException e4) {
                            e = e4;
                            e.printStackTrace();
                            childCount = i2;
                        }
                    }
                } catch (IllegalAccessException e5) {
                    e = e5;
                    i2 = childCount;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    i2 = childCount;
                } catch (InvocationTargetException e7) {
                    e = e7;
                    i2 = childCount;
                }
                childCount = i2;
            }
            int i4 = childCount;
            constraint.f18254f = hashMap3;
            constraint.b(id, layoutParams);
            int visibility = childAt.getVisibility();
            PropertySet propertySet = constraint.f18252b;
            propertySet.f18295b = visibility;
            propertySet.d = childAt.getAlpha();
            float rotation = childAt.getRotation();
            Transform transform = constraint.e;
            transform.f18299b = rotation;
            transform.f18300c = childAt.getRotationX();
            transform.d = childAt.getRotationY();
            transform.e = childAt.getScaleX();
            transform.f18301f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || pivotY != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                transform.f18302g = pivotX;
                transform.f18303h = pivotY;
            }
            transform.f18304i = childAt.getTranslationX();
            transform.f18305j = childAt.getTranslationY();
            transform.f18306k = childAt.getTranslationZ();
            if (transform.f18307l) {
                transform.f18308m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                boolean z2 = barrier.f18178k.f17980i0;
                Layout layout = constraint.d;
                layout.f18273j0 = z2;
                layout.f18263e0 = barrier.getReferencedIds();
                layout.f18259b0 = barrier.getType();
                layout.f18261c0 = barrier.getMargin();
            }
            i3++;
            constraintSet = this;
            childCount = i4;
        }
    }

    public final Constraint g(int i2) {
        HashMap hashMap = this.f18250c;
        if (!hashMap.containsKey(Integer.valueOf(i2))) {
            hashMap.put(Integer.valueOf(i2), new Constraint());
        }
        return (Constraint) hashMap.get(Integer.valueOf(i2));
    }

    public final void h(int i2, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    Constraint f2 = f(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        f2.d.f18256a = true;
                    }
                    this.f18250c.put(Integer.valueOf(f2.f18251a), f2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x00ae. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, androidx.constraintlayout.widget.ConstraintAttribute] */
    public final void i(Context context, XmlResourceParser xmlResourceParser) {
        char c2;
        Object obj;
        try {
            int eventType = xmlResourceParser.getEventType();
            Constraint constraint = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    int i2 = 2;
                    if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c2 = 6;
                                    break;
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c2 = 7;
                                    break;
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        c2 = 65535;
                        switch (c2) {
                            case 0:
                                constraint = f(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case 1:
                                constraint = f(context, Xml.asAttributeSet(xmlResourceParser));
                                Layout layout = constraint.d;
                                layout.f18256a = true;
                                layout.f18258b = true;
                                break;
                            case 2:
                                constraint = f(context, Xml.asAttributeSet(xmlResourceParser));
                                constraint.d.f18262d0 = 1;
                                break;
                            case 3:
                                if (constraint == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                constraint.f18252b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case 4:
                                if (constraint == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                constraint.e.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case 5:
                                if (constraint == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                constraint.d.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case 6:
                                if (constraint == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                constraint.f18253c.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case 7:
                                if (constraint == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                HashMap hashMap = constraint.f18254f;
                                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.d);
                                int indexCount = obtainStyledAttributes.getIndexCount();
                                int i3 = 0;
                                String str = null;
                                Object obj2 = null;
                                ConstraintAttribute.AttributeType attributeType = null;
                                while (i3 < indexCount) {
                                    int index = obtainStyledAttributes.getIndex(i3);
                                    if (index == 0) {
                                        String string = obtainStyledAttributes.getString(index);
                                        if (string == null || string.length() <= 0) {
                                            str = string;
                                        } else {
                                            str = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                                        }
                                    } else if (index == 1) {
                                        obj2 = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                                        attributeType = ConstraintAttribute.AttributeType.f18188g;
                                    } else if (index == 3) {
                                        attributeType = ConstraintAttribute.AttributeType.f18186c;
                                        obj2 = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                                    } else if (index == i2) {
                                        attributeType = ConstraintAttribute.AttributeType.d;
                                        obj2 = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                                    } else {
                                        ConstraintAttribute.AttributeType attributeType2 = ConstraintAttribute.AttributeType.f18189h;
                                        if (index == 7) {
                                            obj2 = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                                        } else if (index == 4) {
                                            obj2 = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                                        } else if (index == 5) {
                                            attributeType = ConstraintAttribute.AttributeType.f18185b;
                                            obj2 = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                            i3++;
                                            i2 = 2;
                                        } else {
                                            if (index == 6) {
                                                attributeType = ConstraintAttribute.AttributeType.f18184a;
                                                obj2 = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                            } else if (index == 8) {
                                                attributeType = ConstraintAttribute.AttributeType.f18187f;
                                                obj2 = obtainStyledAttributes.getString(index);
                                            }
                                            i3++;
                                            i2 = 2;
                                        }
                                        attributeType = attributeType2;
                                    }
                                    i3++;
                                    i2 = 2;
                                }
                                String str2 = str;
                                if (str2 != null && (obj = obj2) != null) {
                                    ?? obj3 = new Object();
                                    obj3.f18179a = attributeType;
                                    obj3.b(obj);
                                    hashMap.put(str2, obj3);
                                }
                                obtainStyledAttributes.recycle();
                                break;
                                break;
                        }
                    } else if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if ("ConstraintSet".equals(name2)) {
                            return;
                        }
                        if (name2.equalsIgnoreCase("Constraint")) {
                            try {
                                this.f18250c.put(Integer.valueOf(constraint.f18251a), constraint);
                                constraint = null;
                            } catch (IOException e2) {
                                e = e2;
                                e.printStackTrace();
                                return;
                            } catch (XmlPullParserException e3) {
                                e = e3;
                                e.printStackTrace();
                                return;
                            }
                        }
                    }
                } else {
                    xmlResourceParser.getName();
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e4) {
            e = e4;
        } catch (XmlPullParserException e5) {
            e = e5;
        }
    }
}
