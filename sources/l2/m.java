package l2;

/* loaded from: classes.dex */
public final class m extends b {
    public m() {
        super("MULTI_PROFILE", "MULTI_PROFILE", 2);
    }

    @Override // l2.c
    public final boolean b() {
        if (!super.b() || !d6.g.s("MULTI_PROCESS")) {
            return false;
        }
        int i10 = k2.e.a;
        if (n.f21119c.b()) {
            return o.a.getStatics().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
