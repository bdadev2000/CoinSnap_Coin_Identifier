package c9;

import java.util.List;
import n9.x;

/* loaded from: classes3.dex */
public final class a extends a9.g {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2739m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2740n;

    public a(List list) {
        this.f2739m = 0;
        x xVar = new x((byte[]) list.get(0));
        this.f2740n = new h(xVar.A(), xVar.A());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // a9.g
    public final a9.h b(byte[] r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.a.b(byte[], int, boolean):a9.h");
    }

    public a() {
        this.f2739m = 1;
        this.f2740n = new x();
    }
}
