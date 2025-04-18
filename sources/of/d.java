package of;

import androidx.lifecycle.e1;
import androidx.lifecycle.j;
import com.facebook.internal.i;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lazy f23304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Lazy lazy, int i10) {
        super(0);
        this.f23303b = i10;
        this.f23304c = lazy;
    }

    public final k1.c a() {
        int i10 = this.f23303b;
        j jVar = null;
        Lazy lazy = this.f23304c;
        switch (i10) {
            case 0:
                e1 f10 = i.f(lazy);
                if (f10 instanceof j) {
                    jVar = (j) f10;
                }
                if (jVar != null) {
                    return jVar.getDefaultViewModelCreationExtras();
                }
                return k1.a.f20211b;
            case 1:
                e1 f11 = i.f(lazy);
                if (f11 instanceof j) {
                    jVar = (j) f11;
                }
                if (jVar != null) {
                    return jVar.getDefaultViewModelCreationExtras();
                }
                return k1.a.f20211b;
            case 2:
                e1 f12 = i.f(lazy);
                if (f12 instanceof j) {
                    jVar = (j) f12;
                }
                if (jVar != null) {
                    return jVar.getDefaultViewModelCreationExtras();
                }
                return k1.a.f20211b;
            default:
                e1 f13 = i.f(lazy);
                if (f13 instanceof j) {
                    jVar = (j) f13;
                }
                if (jVar != null) {
                    return jVar.getDefaultViewModelCreationExtras();
                }
                return k1.a.f20211b;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f23303b) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            default:
                return a();
        }
    }
}
