package a1;

import android.os.Build;
import androidx.work.o;
import d1.C2168i;

/* renamed from: a1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330d extends AbstractC0329c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3915e = o.g("NetworkMeteredCtrlr");

    @Override // a1.AbstractC0329c
    public final boolean a(C2168i c2168i) {
        if (c2168i.f19809j.f5203a == 5) {
            return true;
        }
        return false;
    }

    @Override // a1.AbstractC0329c
    public final boolean b(Object obj) {
        Z0.a aVar = (Z0.a) obj;
        boolean z8 = true;
        if (Build.VERSION.SDK_INT < 26) {
            o.e().b(f3915e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !aVar.f3872a;
        }
        if (aVar.f3872a && aVar.f3873c) {
            z8 = false;
        }
        return z8;
    }
}
