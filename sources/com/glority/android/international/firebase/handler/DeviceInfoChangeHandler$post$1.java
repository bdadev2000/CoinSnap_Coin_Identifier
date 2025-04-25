package com.glority.android.international.firebase.handler;

import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.adjust.GetAdjustIdRequest;
import com.glority.android.core.route.analysis.DeviceInfoChangeRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.analysis.UrlTracking;
import com.glority.android.core.route.guide.GetLanguageCodeRequest;
import com.glority.android.core.route.utils.PersistDataReadRequest;
import com.glority.android.core.route.utils.PersistDataWriteRequest;
import com.glority.android.international.firebase.modle.DeviceInfoEvent;
import com.glority.utils.device.DeviceUtils;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DeviceInfoChangeHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.international.firebase.handler.DeviceInfoChangeHandler$post$1", f = "DeviceInfoChangeHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DeviceInfoChangeHandler$post$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RouteRequest<Boolean> $request;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceInfoChangeHandler$post$1(RouteRequest<Boolean> routeRequest, Continuation<? super DeviceInfoChangeHandler$post$1> continuation) {
        super(2, continuation);
        this.$request = routeRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceInfoChangeHandler$post$1(this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceInfoChangeHandler$post$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ((DeviceInfoChangeRequest) this.$request).getEventType();
        RouteRequest<Boolean> routeRequest = this.$request;
        String osLanguage = DeviceInfoChangeHandler.INSTANCE.getOsLanguage();
        String result = new GetLanguageCodeRequest().toResult();
        String versionName = AppContext.INSTANCE.getVersionName();
        String osCountryCode = DeviceInfoChangeHandler.INSTANCE.getOsCountryCode();
        String model = DeviceUtils.getModel();
        Intrinsics.checkNotNullExpressionValue(model, "getModel()");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        String brand = DeviceUtils.getBrand();
        Intrinsics.checkNotNullExpressionValue(brand, "getBrand()");
        String result2 = new GetAdjustIdRequest().toResult();
        if (result2 == null) {
            result2 = "";
        }
        DeviceInfoEvent deviceInfoEvent = new DeviceInfoEvent(osLanguage, result, versionName, osCountryCode, model, RELEASE, brand, result2, DeviceInfoChangeHandler.INSTANCE.getCurrentTimeZone(), DeviceInfoChangeHandler.INSTANCE.getFontSize(), DeviceInfoChangeHandler.INSTANCE.getScreenSize(), null, 2048, null);
        String result3 = new PersistDataReadRequest(UrlTracking.INSTANCE.getURL_DEVICE_INFO()).toResult();
        String json = new Gson().toJson(deviceInfoEvent);
        if (!Intrinsics.areEqual(result3, json)) {
            new PersistDataWriteRequest(UrlTracking.INSTANCE.getURL_DEVICE_INFO(), json).post();
            new LogEventRequest(((DeviceInfoChangeRequest) routeRequest).getEventType(), BundleKt.bundleOf(TuplesKt.to("content", json))).post();
        }
        return Unit.INSTANCE;
    }
}
