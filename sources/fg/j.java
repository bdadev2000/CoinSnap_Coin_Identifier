package fg;

import android.util.Log;
import com.plantcare.ai.identifier.plantid.data.network.dto.res.ResponseWeatherDto;
import com.plantcare.ai.identifier.plantid.data.network.repository.WeatherRepository;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainViewModel;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f17874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainViewModel f17875c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17876d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f17877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f17878g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MainViewModel mainViewModel, String str, double d10, double d11, Continuation continuation) {
        super(2, continuation);
        this.f17875c = mainViewModel;
        this.f17876d = str;
        this.f17877f = d10;
        this.f17878g = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f17875c, this.f17876d, this.f17877f, this.f17878g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f17874b;
        MainViewModel mainViewModel = this.f17875c;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            WeatherRepository weatherRepository = mainViewModel.f16652d;
            String str = this.f17876d;
            double d10 = this.f17877f;
            double d11 = this.f17878g;
            this.f17874b = 1;
            obj = weatherRepository.fetchDataWeather(str, d10, d11, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ResultWrapper resultWrapper = (ResultWrapper) obj;
        if (resultWrapper instanceof ResultWrapper.Success) {
            ResponseWeatherDto responseWeatherDto = (ResponseWeatherDto) ((ResultWrapper.Success) resultWrapper).getValue();
            mainViewModel.f16659k.postValue(responseWeatherDto);
            Log.d("duylt", "Response Weather " + responseWeatherDto.getData());
        } else {
            mainViewModel.f16659k.postValue(null);
            Log.d("duylt", "Response Weather Wrong: " + resultWrapper);
        }
        return Unit.INSTANCE;
    }
}
