package E;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f860a;
    public final m b;

    /* renamed from: c, reason: collision with root package name */
    public final l f861c;

    /* renamed from: d, reason: collision with root package name */
    public final k f862d;

    /* renamed from: e, reason: collision with root package name */
    public final n f863e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f864f;

    /* JADX WARN: Type inference failed for: r0v0, types: [E.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [E.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [E.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [E.n, java.lang.Object] */
    public j() {
        ?? obj = new Object();
        obj.f937a = 0;
        obj.b = 0;
        obj.f938c = 1.0f;
        obj.f939d = Float.NaN;
        this.b = obj;
        ?? obj2 = new Object();
        obj2.f929a = -1;
        obj2.b = 0;
        obj2.f930c = -1;
        obj2.f931d = Float.NaN;
        obj2.f932e = Float.NaN;
        obj2.f933f = Float.NaN;
        obj2.f934g = -1;
        obj2.f935h = null;
        obj2.f936i = -1;
        this.f861c = obj2;
        ?? obj3 = new Object();
        obj3.f891a = false;
        obj3.f896d = -1;
        obj3.f898e = -1;
        obj3.f900f = -1.0f;
        obj3.f901g = true;
        obj3.f903h = -1;
        obj3.f905i = -1;
        obj3.f907j = -1;
        obj3.f909k = -1;
        obj3.l = -1;
        obj3.m = -1;
        obj3.f913n = -1;
        obj3.f915o = -1;
        obj3.f917p = -1;
        obj3.f918q = -1;
        obj3.f919r = -1;
        obj3.f920s = -1;
        obj3.f921t = -1;
        obj3.f922u = -1;
        obj3.f923v = -1;
        obj3.f924w = 0.5f;
        obj3.f925x = 0.5f;
        obj3.f926y = null;
        obj3.f927z = -1;
        obj3.f866A = 0;
        obj3.f867B = 0.0f;
        obj3.f868C = -1;
        obj3.f869D = -1;
        obj3.f870E = -1;
        obj3.f871F = 0;
        obj3.f872G = 0;
        obj3.f873H = 0;
        obj3.f874I = 0;
        obj3.f875J = 0;
        obj3.f876K = 0;
        obj3.f877L = 0;
        obj3.f878M = Integer.MIN_VALUE;
        obj3.f879N = Integer.MIN_VALUE;
        obj3.O = Integer.MIN_VALUE;
        obj3.f880P = Integer.MIN_VALUE;
        obj3.f881Q = Integer.MIN_VALUE;
        obj3.f882R = Integer.MIN_VALUE;
        obj3.f883S = Integer.MIN_VALUE;
        obj3.f884T = -1.0f;
        obj3.f885U = -1.0f;
        obj3.f886V = 0;
        obj3.f887W = 0;
        obj3.f888X = 0;
        obj3.f889Y = 0;
        obj3.f890Z = 0;
        obj3.f892a0 = 0;
        obj3.f893b0 = 0;
        obj3.f895c0 = 0;
        obj3.f897d0 = 1.0f;
        obj3.f899e0 = 1.0f;
        obj3.f0 = -1;
        obj3.f902g0 = 0;
        obj3.f904h0 = -1;
        obj3.f911l0 = false;
        obj3.f912m0 = false;
        obj3.f914n0 = true;
        obj3.f916o0 = 0;
        this.f862d = obj3;
        ?? obj4 = new Object();
        obj4.f941a = 0.0f;
        obj4.b = 0.0f;
        obj4.f942c = 0.0f;
        obj4.f943d = 1.0f;
        obj4.f944e = 1.0f;
        obj4.f945f = Float.NaN;
        obj4.f946g = Float.NaN;
        obj4.f947h = -1;
        obj4.f948i = 0.0f;
        obj4.f949j = 0.0f;
        obj4.f950k = 0.0f;
        obj4.l = false;
        obj4.m = 0.0f;
        this.f863e = obj4;
        this.f864f = new HashMap();
    }

    public final void a(e eVar) {
        k kVar = this.f862d;
        eVar.f805e = kVar.f903h;
        eVar.f807f = kVar.f905i;
        eVar.f808g = kVar.f907j;
        eVar.f810h = kVar.f909k;
        eVar.f812i = kVar.l;
        eVar.f814j = kVar.m;
        eVar.f816k = kVar.f913n;
        eVar.l = kVar.f915o;
        eVar.m = kVar.f917p;
        eVar.f820n = kVar.f918q;
        eVar.f822o = kVar.f919r;
        eVar.f828s = kVar.f920s;
        eVar.f829t = kVar.f921t;
        eVar.f830u = kVar.f922u;
        eVar.f831v = kVar.f923v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = kVar.f871F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = kVar.f872G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = kVar.f873H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = kVar.f874I;
        eVar.f773A = kVar.f882R;
        eVar.f774B = kVar.f881Q;
        eVar.f833x = kVar.f879N;
        eVar.f835z = kVar.f880P;
        eVar.f777E = kVar.f924w;
        eVar.f778F = kVar.f925x;
        eVar.f824p = kVar.f927z;
        eVar.f826q = kVar.f866A;
        eVar.f827r = kVar.f867B;
        eVar.f779G = kVar.f926y;
        eVar.f791T = kVar.f868C;
        eVar.f792U = kVar.f869D;
        eVar.f781I = kVar.f884T;
        eVar.f780H = kVar.f885U;
        eVar.f783K = kVar.f887W;
        eVar.f782J = kVar.f886V;
        eVar.f794W = kVar.f911l0;
        eVar.f795X = kVar.f912m0;
        eVar.f784L = kVar.f888X;
        eVar.f785M = kVar.f889Y;
        eVar.f787P = kVar.f890Z;
        eVar.f788Q = kVar.f892a0;
        eVar.f786N = kVar.f893b0;
        eVar.O = kVar.f895c0;
        eVar.f789R = kVar.f897d0;
        eVar.f790S = kVar.f899e0;
        eVar.f793V = kVar.f870E;
        eVar.f801c = kVar.f900f;
        eVar.f798a = kVar.f896d;
        eVar.b = kVar.f898e;
        ((ViewGroup.MarginLayoutParams) eVar).width = kVar.b;
        ((ViewGroup.MarginLayoutParams) eVar).height = kVar.f894c;
        String str = kVar.f910k0;
        if (str != null) {
            eVar.f796Y = str;
        }
        eVar.f797Z = kVar.f916o0;
        eVar.setMarginStart(kVar.f876K);
        eVar.setMarginEnd(kVar.f875J);
        eVar.a();
    }

    public final Object clone() {
        j jVar = new j();
        k kVar = jVar.f862d;
        kVar.getClass();
        k kVar2 = this.f862d;
        kVar.f891a = kVar2.f891a;
        kVar.b = kVar2.b;
        kVar.f894c = kVar2.f894c;
        kVar.f896d = kVar2.f896d;
        kVar.f898e = kVar2.f898e;
        kVar.f900f = kVar2.f900f;
        kVar.f901g = kVar2.f901g;
        kVar.f903h = kVar2.f903h;
        kVar.f905i = kVar2.f905i;
        kVar.f907j = kVar2.f907j;
        kVar.f909k = kVar2.f909k;
        kVar.l = kVar2.l;
        kVar.m = kVar2.m;
        kVar.f913n = kVar2.f913n;
        kVar.f915o = kVar2.f915o;
        kVar.f917p = kVar2.f917p;
        kVar.f918q = kVar2.f918q;
        kVar.f919r = kVar2.f919r;
        kVar.f920s = kVar2.f920s;
        kVar.f921t = kVar2.f921t;
        kVar.f922u = kVar2.f922u;
        kVar.f923v = kVar2.f923v;
        kVar.f924w = kVar2.f924w;
        kVar.f925x = kVar2.f925x;
        kVar.f926y = kVar2.f926y;
        kVar.f927z = kVar2.f927z;
        kVar.f866A = kVar2.f866A;
        kVar.f867B = kVar2.f867B;
        kVar.f868C = kVar2.f868C;
        kVar.f869D = kVar2.f869D;
        kVar.f870E = kVar2.f870E;
        kVar.f871F = kVar2.f871F;
        kVar.f872G = kVar2.f872G;
        kVar.f873H = kVar2.f873H;
        kVar.f874I = kVar2.f874I;
        kVar.f875J = kVar2.f875J;
        kVar.f876K = kVar2.f876K;
        kVar.f877L = kVar2.f877L;
        kVar.f878M = kVar2.f878M;
        kVar.f879N = kVar2.f879N;
        kVar.O = kVar2.O;
        kVar.f880P = kVar2.f880P;
        kVar.f881Q = kVar2.f881Q;
        kVar.f882R = kVar2.f882R;
        kVar.f883S = kVar2.f883S;
        kVar.f884T = kVar2.f884T;
        kVar.f885U = kVar2.f885U;
        kVar.f886V = kVar2.f886V;
        kVar.f887W = kVar2.f887W;
        kVar.f888X = kVar2.f888X;
        kVar.f889Y = kVar2.f889Y;
        kVar.f890Z = kVar2.f890Z;
        kVar.f892a0 = kVar2.f892a0;
        kVar.f893b0 = kVar2.f893b0;
        kVar.f895c0 = kVar2.f895c0;
        kVar.f897d0 = kVar2.f897d0;
        kVar.f899e0 = kVar2.f899e0;
        kVar.f0 = kVar2.f0;
        kVar.f902g0 = kVar2.f902g0;
        kVar.f904h0 = kVar2.f904h0;
        kVar.f910k0 = kVar2.f910k0;
        int[] iArr = kVar2.f906i0;
        if (iArr != null && kVar2.f908j0 == null) {
            kVar.f906i0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            kVar.f906i0 = null;
        }
        kVar.f908j0 = kVar2.f908j0;
        kVar.f911l0 = kVar2.f911l0;
        kVar.f912m0 = kVar2.f912m0;
        kVar.f914n0 = kVar2.f914n0;
        kVar.f916o0 = kVar2.f916o0;
        l lVar = jVar.f861c;
        lVar.getClass();
        l lVar2 = this.f861c;
        lVar2.getClass();
        lVar.f929a = lVar2.f929a;
        lVar.f930c = lVar2.f930c;
        lVar.f932e = lVar2.f932e;
        lVar.f931d = lVar2.f931d;
        m mVar = jVar.b;
        mVar.getClass();
        m mVar2 = this.b;
        mVar2.getClass();
        mVar.f937a = mVar2.f937a;
        mVar.f938c = mVar2.f938c;
        mVar.f939d = mVar2.f939d;
        mVar.b = mVar2.b;
        n nVar = jVar.f863e;
        nVar.getClass();
        n nVar2 = this.f863e;
        nVar2.getClass();
        nVar.f941a = nVar2.f941a;
        nVar.b = nVar2.b;
        nVar.f942c = nVar2.f942c;
        nVar.f943d = nVar2.f943d;
        nVar.f944e = nVar2.f944e;
        nVar.f945f = nVar2.f945f;
        nVar.f946g = nVar2.f946g;
        nVar.f947h = nVar2.f947h;
        nVar.f948i = nVar2.f948i;
        nVar.f949j = nVar2.f949j;
        nVar.f950k = nVar2.f950k;
        nVar.l = nVar2.l;
        nVar.m = nVar2.m;
        jVar.f860a = this.f860a;
        return jVar;
    }
}
