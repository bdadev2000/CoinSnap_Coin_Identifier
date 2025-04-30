package X3;

import J1.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class f extends Y3.a {
    public final r b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f3671c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f3672d;

    public f(g gVar, TaskCompletionSource taskCompletionSource) {
        r rVar = new r("OnRequestInstallCallback");
        this.f3672d = gVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.b = rVar;
        this.f3671c = taskCompletionSource;
    }
}
