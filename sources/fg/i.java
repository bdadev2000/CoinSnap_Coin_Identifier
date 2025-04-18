package fg;

import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponseLocationDto;
import com.plantcare.ai.identifier.plantid.data.network.repository.LocationRepository;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainViewModel;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f17870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f17871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f17872d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f17873f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(MainViewModel mainViewModel, double d10, double d11, Continuation continuation) {
        super(2, continuation);
        this.f17871c = mainViewModel;
        this.f17872d = d10;
        this.f17873f = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f17871c, this.f17872d, this.f17873f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f17870b;
        MainViewModel mainViewModel = this.f17871c;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            mainViewModel.f16655g.postValue(Boxing.boxBoolean(true));
            LocationRepository locationRepository = mainViewModel.f16653e;
            double d10 = this.f17872d;
            double d11 = this.f17873f;
            this.f17870b = 1;
            obj = locationRepository.fetchDataLocation(d10, d11, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ResultWrapper resultWrapper = (ResultWrapper) obj;
        if (resultWrapper instanceof ResultWrapper.Success) {
            mainViewModel.f16657i.postValue((ResponseLocationDto) ((ResultWrapper.Success) resultWrapper).getValue());
        } else {
            mainViewModel.f16657i.postValue(null);
        }
        mainViewModel.f16655g.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
