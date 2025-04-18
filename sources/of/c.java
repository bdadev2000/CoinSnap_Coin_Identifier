package of;

import androidx.lifecycle.d1;
import com.facebook.internal.i;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lazy f23302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Lazy lazy, int i10) {
        super(0);
        this.f23301b = i10;
        this.f23302c = lazy;
    }

    public final d1 a() {
        int i10 = this.f23301b;
        Lazy lazy = this.f23302c;
        switch (i10) {
            case 0:
                return i.f(lazy).getViewModelStore();
            case 1:
                return i.f(lazy).getViewModelStore();
            case 2:
                return i.f(lazy).getViewModelStore();
            default:
                return i.f(lazy).getViewModelStore();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f23301b) {
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
