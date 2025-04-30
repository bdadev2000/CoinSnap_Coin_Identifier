package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0509t;
import androidx.lifecycle.InterfaceC0511v;
import java.util.Map;

/* renamed from: androidx.fragment.app.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454b0 implements InterfaceC0509t {
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f4707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0505o f4708d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f4709f;

    public C0454b0(FragmentManager fragmentManager, String str, t0 t0Var, AbstractC0505o abstractC0505o) {
        this.f4709f = fragmentManager;
        this.b = str;
        this.f4707c = t0Var;
        this.f4708d = abstractC0505o;
    }

    @Override // androidx.lifecycle.InterfaceC0509t
    public final void b(InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        Map map;
        Map map2;
        EnumC0503m enumC0503m2 = EnumC0503m.ON_START;
        FragmentManager fragmentManager = this.f4709f;
        String str = this.b;
        if (enumC0503m == enumC0503m2) {
            map2 = fragmentManager.mResults;
            Bundle bundle = (Bundle) map2.get(str);
            if (bundle != null) {
                ((C0468i0) this.f4707c).a(bundle, str);
                fragmentManager.clearFragmentResult(str);
            }
        }
        if (enumC0503m == EnumC0503m.ON_DESTROY) {
            this.f4708d.b(this);
            map = fragmentManager.mResultListeners;
            map.remove(str);
        }
    }
}
