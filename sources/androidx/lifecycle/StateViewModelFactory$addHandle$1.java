package androidx.lifecycle;

import kotlin.jvm.internal.r;
import org.koin.core.parameter.ParametersHolder;

/* loaded from: classes4.dex */
final class StateViewModelFactory$addHandle$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParametersHolder f20118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SavedStateHandle f20119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateViewModelFactory$addHandle$1(ParametersHolder parametersHolder, SavedStateHandle savedStateHandle) {
        super(0);
        this.f20118a = parametersHolder;
        this.f20119b = savedStateHandle;
    }

    @Override // q0.a
    public final Object invoke() {
        return this.f20118a.add(this.f20119b);
    }
}
