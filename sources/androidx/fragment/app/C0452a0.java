package androidx.fragment.app;

import android.content.Context;

/* renamed from: androidx.fragment.app.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0452a0 extends P {
    public final /* synthetic */ FragmentManager b;

    public C0452a0(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    @Override // androidx.fragment.app.P
    public final Fragment a(String str) {
        FragmentManager fragmentManager = this.b;
        Q host = fragmentManager.getHost();
        Context context = fragmentManager.getHost().f4683c;
        host.getClass();
        return Fragment.instantiate(context, str, null);
    }
}
