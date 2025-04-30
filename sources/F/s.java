package f;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F7.l f20231a;
    public final /* synthetic */ F7.l b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F7.a f20232c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F7.a f20233d;

    public s(F7.l lVar, F7.l lVar2, F7.a aVar, F7.a aVar2) {
        this.f20231a = lVar;
        this.b = lVar2;
        this.f20232c = aVar;
        this.f20233d = aVar2;
    }

    public final void onBackCancelled() {
        this.f20233d.invoke();
    }

    public final void onBackInvoked() {
        this.f20232c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        G7.j.e(backEvent, "backEvent");
        this.b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        G7.j.e(backEvent, "backEvent");
        this.f20231a.invoke(new b(backEvent));
    }
}
