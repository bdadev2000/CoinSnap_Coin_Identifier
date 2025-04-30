package U0;

/* loaded from: classes.dex */
public final class k extends b {
    @Override // U0.c
    public final boolean b() {
        if (!super.b() || !com.facebook.appevents.g.r("MULTI_PROCESS")) {
            return false;
        }
        int i9 = T0.e.f2954a;
        if (l.b.b()) {
            return m.f3112a.getStatics().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
