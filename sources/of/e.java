package of;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.a1;
import androidx.lifecycle.e1;
import androidx.lifecycle.j;
import com.facebook.internal.i;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f23306c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Lazy f23307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Fragment fragment, Lazy lazy, int i10) {
        super(0);
        this.f23305b = i10;
        this.f23306c = fragment;
        this.f23307d = lazy;
    }

    public final a1 a() {
        a1 defaultViewModelProviderFactory;
        a1 defaultViewModelProviderFactory2;
        a1 defaultViewModelProviderFactory3;
        a1 defaultViewModelProviderFactory4;
        int i10 = this.f23305b;
        Fragment fragment = this.f23306c;
        j jVar = null;
        Lazy lazy = this.f23307d;
        switch (i10) {
            case 0:
                e1 f10 = i.f(lazy);
                if (f10 instanceof j) {
                    jVar = (j) f10;
                }
                if (jVar == null || (defaultViewModelProviderFactory2 = jVar.getDefaultViewModelProviderFactory()) == null) {
                    a1 defaultViewModelProviderFactory5 = fragment.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory5, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory5;
                }
                return defaultViewModelProviderFactory2;
            case 1:
                e1 f11 = i.f(lazy);
                if (f11 instanceof j) {
                    jVar = (j) f11;
                }
                if (jVar == null || (defaultViewModelProviderFactory3 = jVar.getDefaultViewModelProviderFactory()) == null) {
                    a1 defaultViewModelProviderFactory6 = fragment.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory6, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory6;
                }
                return defaultViewModelProviderFactory3;
            case 2:
                e1 f12 = i.f(lazy);
                if (f12 instanceof j) {
                    jVar = (j) f12;
                }
                if (jVar == null || (defaultViewModelProviderFactory4 = jVar.getDefaultViewModelProviderFactory()) == null) {
                    a1 defaultViewModelProviderFactory7 = fragment.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory7, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory7;
                }
                return defaultViewModelProviderFactory4;
            default:
                e1 f13 = i.f(lazy);
                if (f13 instanceof j) {
                    jVar = (j) f13;
                }
                if (jVar == null || (defaultViewModelProviderFactory = jVar.getDefaultViewModelProviderFactory()) == null) {
                    a1 defaultViewModelProviderFactory8 = fragment.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory8, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory8;
                }
                return defaultViewModelProviderFactory;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f23305b) {
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
