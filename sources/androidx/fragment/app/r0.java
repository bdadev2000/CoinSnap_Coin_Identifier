package androidx.fragment.app;

import android.content.Context;

/* loaded from: classes.dex */
public final class r0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f1712b;

    public r0(FragmentManager fragmentManager) {
        this.f1712b = fragmentManager;
    }

    @Override // androidx.fragment.app.h0
    public final Fragment a(String str) {
        FragmentManager fragmentManager = this.f1712b;
        i0 host = fragmentManager.getHost();
        Context context = fragmentManager.getHost().f1648c;
        host.getClass();
        return Fragment.instantiate(context, str, null);
    }
}
