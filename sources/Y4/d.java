package Y4;

/* loaded from: classes2.dex */
public final class d extends com.facebook.appevents.n {

    /* renamed from: j, reason: collision with root package name */
    public static d f3794j;

    /* JADX WARN: Type inference failed for: r1v3, types: [Y4.d, java.lang.Object] */
    public static synchronized d x() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f3794j == null) {
                    f3794j = new Object();
                }
                dVar = f3794j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // com.facebook.appevents.n
    public final String f() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // com.facebook.appevents.n
    public final String i() {
        return "experiment_app_start_ttid";
    }
}
