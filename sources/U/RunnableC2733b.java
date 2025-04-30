package u;

import android.os.Bundle;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2733b implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23032c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f23033d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BinderC2735d f23034f;

    public /* synthetic */ RunnableC2733b(BinderC2735d binderC2735d, String str, Bundle bundle, int i9) {
        this.b = i9;
        this.f23034f = binderC2735d;
        this.f23032c = str;
        this.f23033d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f23034f.f23039c.extraCallback(this.f23032c, this.f23033d);
                return;
            default:
                this.f23034f.f23039c.onPostMessage(this.f23032c, this.f23033d);
                return;
        }
    }
}
