package z;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final l f28369b = new l();

    /* renamed from: c, reason: collision with root package name */
    public final k f28370c = new k();

    /* renamed from: d, reason: collision with root package name */
    public final j f28371d = new j();

    /* renamed from: e, reason: collision with root package name */
    public final m f28372e = new m();

    /* renamed from: f, reason: collision with root package name */
    public HashMap f28373f = new HashMap();

    public final void a(e eVar) {
        j jVar = this.f28371d;
        eVar.f28320e = jVar.f28388h;
        eVar.f28322f = jVar.f28390i;
        eVar.f28324g = jVar.f28392j;
        eVar.f28326h = jVar.f28394k;
        eVar.f28328i = jVar.f28396l;
        eVar.f28330j = jVar.f28398m;
        eVar.f28332k = jVar.f28400n;
        eVar.f28334l = jVar.f28402o;
        eVar.f28336m = jVar.f28404p;
        eVar.f28338n = jVar.f28405q;
        eVar.f28340o = jVar.f28406r;
        eVar.f28346s = jVar.f28407s;
        eVar.f28347t = jVar.f28408t;
        eVar.u = jVar.u;
        eVar.f28348v = jVar.f28409v;
        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVar.F;
        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVar.G;
        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVar.H;
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVar.I;
        eVar.A = jVar.R;
        eVar.B = jVar.Q;
        eVar.f28350x = jVar.N;
        eVar.f28352z = jVar.P;
        eVar.E = jVar.f28410w;
        eVar.F = jVar.f28411x;
        eVar.f28342p = jVar.f28413z;
        eVar.f28344q = jVar.A;
        eVar.f28345r = jVar.B;
        eVar.G = jVar.f28412y;
        eVar.T = jVar.C;
        eVar.U = jVar.D;
        eVar.I = jVar.T;
        eVar.H = jVar.U;
        eVar.K = jVar.W;
        eVar.J = jVar.V;
        eVar.W = jVar.f28397l0;
        eVar.X = jVar.f28399m0;
        eVar.L = jVar.X;
        eVar.M = jVar.Y;
        eVar.P = jVar.Z;
        eVar.Q = jVar.f28375a0;
        eVar.N = jVar.f28377b0;
        eVar.O = jVar.f28379c0;
        eVar.R = jVar.f28381d0;
        eVar.S = jVar.f28383e0;
        eVar.V = jVar.E;
        eVar.f28316c = jVar.f28384f;
        eVar.a = jVar.f28380d;
        eVar.f28314b = jVar.f28382e;
        ((ViewGroup.MarginLayoutParams) eVar).width = jVar.f28376b;
        ((ViewGroup.MarginLayoutParams) eVar).height = jVar.f28378c;
        String str = jVar.f28395k0;
        if (str != null) {
            eVar.Y = str;
        }
        eVar.Z = jVar.f28403o0;
        eVar.setMarginStart(jVar.K);
        eVar.setMarginEnd(jVar.J);
        eVar.a();
    }

    public final Object clone() {
        i iVar = new i();
        j jVar = iVar.f28371d;
        jVar.getClass();
        j jVar2 = this.f28371d;
        jVar.a = jVar2.a;
        jVar.f28376b = jVar2.f28376b;
        jVar.f28378c = jVar2.f28378c;
        jVar.f28380d = jVar2.f28380d;
        jVar.f28382e = jVar2.f28382e;
        jVar.f28384f = jVar2.f28384f;
        jVar.f28386g = jVar2.f28386g;
        jVar.f28388h = jVar2.f28388h;
        jVar.f28390i = jVar2.f28390i;
        jVar.f28392j = jVar2.f28392j;
        jVar.f28394k = jVar2.f28394k;
        jVar.f28396l = jVar2.f28396l;
        jVar.f28398m = jVar2.f28398m;
        jVar.f28400n = jVar2.f28400n;
        jVar.f28402o = jVar2.f28402o;
        jVar.f28404p = jVar2.f28404p;
        jVar.f28405q = jVar2.f28405q;
        jVar.f28406r = jVar2.f28406r;
        jVar.f28407s = jVar2.f28407s;
        jVar.f28408t = jVar2.f28408t;
        jVar.u = jVar2.u;
        jVar.f28409v = jVar2.f28409v;
        jVar.f28410w = jVar2.f28410w;
        jVar.f28411x = jVar2.f28411x;
        jVar.f28412y = jVar2.f28412y;
        jVar.f28413z = jVar2.f28413z;
        jVar.A = jVar2.A;
        jVar.B = jVar2.B;
        jVar.C = jVar2.C;
        jVar.D = jVar2.D;
        jVar.E = jVar2.E;
        jVar.F = jVar2.F;
        jVar.G = jVar2.G;
        jVar.H = jVar2.H;
        jVar.I = jVar2.I;
        jVar.J = jVar2.J;
        jVar.K = jVar2.K;
        jVar.L = jVar2.L;
        jVar.M = jVar2.M;
        jVar.N = jVar2.N;
        jVar.O = jVar2.O;
        jVar.P = jVar2.P;
        jVar.Q = jVar2.Q;
        jVar.R = jVar2.R;
        jVar.S = jVar2.S;
        jVar.T = jVar2.T;
        jVar.U = jVar2.U;
        jVar.V = jVar2.V;
        jVar.W = jVar2.W;
        jVar.X = jVar2.X;
        jVar.Y = jVar2.Y;
        jVar.Z = jVar2.Z;
        jVar.f28375a0 = jVar2.f28375a0;
        jVar.f28377b0 = jVar2.f28377b0;
        jVar.f28379c0 = jVar2.f28379c0;
        jVar.f28381d0 = jVar2.f28381d0;
        jVar.f28383e0 = jVar2.f28383e0;
        jVar.f28385f0 = jVar2.f28385f0;
        jVar.f28387g0 = jVar2.f28387g0;
        jVar.f28389h0 = jVar2.f28389h0;
        jVar.f28395k0 = jVar2.f28395k0;
        int[] iArr = jVar2.f28391i0;
        if (iArr != null && jVar2.f28393j0 == null) {
            jVar.f28391i0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            jVar.f28391i0 = null;
        }
        jVar.f28393j0 = jVar2.f28393j0;
        jVar.f28397l0 = jVar2.f28397l0;
        jVar.f28399m0 = jVar2.f28399m0;
        jVar.f28401n0 = jVar2.f28401n0;
        jVar.f28403o0 = jVar2.f28403o0;
        k kVar = iVar.f28370c;
        kVar.getClass();
        k kVar2 = this.f28370c;
        kVar2.getClass();
        kVar.a = kVar2.a;
        kVar.f28416c = kVar2.f28416c;
        kVar.f28418e = kVar2.f28418e;
        kVar.f28417d = kVar2.f28417d;
        l lVar = iVar.f28369b;
        lVar.getClass();
        l lVar2 = this.f28369b;
        lVar2.getClass();
        lVar.a = lVar2.a;
        lVar.f28424c = lVar2.f28424c;
        lVar.f28425d = lVar2.f28425d;
        lVar.f28423b = lVar2.f28423b;
        m mVar = iVar.f28372e;
        mVar.getClass();
        m mVar2 = this.f28372e;
        mVar2.getClass();
        mVar.a = mVar2.a;
        mVar.f28427b = mVar2.f28427b;
        mVar.f28428c = mVar2.f28428c;
        mVar.f28429d = mVar2.f28429d;
        mVar.f28430e = mVar2.f28430e;
        mVar.f28431f = mVar2.f28431f;
        mVar.f28432g = mVar2.f28432g;
        mVar.f28433h = mVar2.f28433h;
        mVar.f28434i = mVar2.f28434i;
        mVar.f28435j = mVar2.f28435j;
        mVar.f28436k = mVar2.f28436k;
        mVar.f28437l = mVar2.f28437l;
        mVar.f28438m = mVar2.f28438m;
        iVar.a = this.a;
        return iVar;
    }
}
