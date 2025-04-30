package a1;

import android.os.Build;
import b1.AbstractC0551d;
import d1.C2168i;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327a extends AbstractC0329c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0327a(AbstractC0551d abstractC0551d, int i9) {
        super(abstractC0551d);
        this.f3911e = i9;
    }

    @Override // a1.AbstractC0329c
    public final boolean a(C2168i c2168i) {
        switch (this.f3911e) {
            case 0:
                return c2168i.f19809j.b;
            case 1:
                return c2168i.f19809j.f5205d;
            case 2:
                if (c2168i.f19809j.f5203a == 2) {
                    return true;
                }
                return false;
            case 3:
                int i9 = c2168i.f19809j.f5203a;
                if (i9 != 3 && (Build.VERSION.SDK_INT < 30 || i9 != 6)) {
                    return false;
                }
                return true;
            default:
                return c2168i.f19809j.f5206e;
        }
    }

    @Override // a1.AbstractC0329c
    public final boolean b(Object obj) {
        switch (this.f3911e) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                Z0.a aVar = (Z0.a) obj;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (!aVar.f3872a || !aVar.b) {
                        return true;
                    }
                    return false;
                }
                return true ^ aVar.f3872a;
            case 3:
                Z0.a aVar2 = (Z0.a) obj;
                if (aVar2.f3872a && !aVar2.f3873c) {
                    return false;
                }
                return true;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
