package wg;

import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashViewModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class d extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Object f26992b;

    /* renamed from: c, reason: collision with root package name */
    public Object f26993c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f26994d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SplashViewModel f26995f;

    /* renamed from: g, reason: collision with root package name */
    public int f26996g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SplashViewModel splashViewModel, Continuation continuation) {
        super(continuation);
        this.f26995f = splashViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26994d = obj;
        this.f26996g |= Integer.MIN_VALUE;
        return SplashViewModel.a(this.f26995f, null, this);
    }
}
