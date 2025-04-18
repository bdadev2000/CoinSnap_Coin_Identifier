package fa;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes3.dex */
public final class d implements OnBackAnimationCallback {
    public final /* synthetic */ b a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17759b;

    public d(e eVar, b bVar) {
        this.f17759b = eVar;
        this.a = bVar;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        boolean z10;
        if (this.f17759b.a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        this.a.a();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.d();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        boolean z10;
        if (this.f17759b.a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        this.a.c(new androidx.activity.b(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        boolean z10;
        if (this.f17759b.a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        this.a.b(new androidx.activity.b(backEvent));
    }
}
