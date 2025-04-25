package com.glority.android.base.aws.router;

import android.graphics.BitmapFactory;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.base.aws.ImageUtils;
import com.glority.android.base.aws.repository.AwsRepository;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.Router;
import com.glority.android.core.route.aws.UpdateItemHighQualityRequest;
import com.glority.network.exception.APIException;
import com.glority.network.exception.NetworkException;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: UpdateItemHighQualityHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.base.aws.router.UpdateItemHighQualityHandler$post$1", f = "UpdateItemHighQualityHandler.kt", i = {}, l = {32, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class UpdateItemHighQualityHandler$post$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RouteRequest<Boolean> $request;
    Object L$0;
    int label;

    /* compiled from: UpdateItemHighQualityHandler.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes14.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateItemHighQualityHandler$post$1(RouteRequest<Boolean> routeRequest, Continuation<? super UpdateItemHighQualityHandler$post$1> continuation) {
        super(2, continuation);
        this.$request = routeRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateItemHighQualityHandler$post$1(this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UpdateItemHighQualityHandler$post$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long itemId;
        Long itemId2;
        Resource updateItemOriginalImageUrl;
        Boolean boxBoolean;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (((UpdateItemHighQualityRequest) this.$request).getItemId() == null || (((itemId = ((UpdateItemHighQualityRequest) this.$request).getItemId()) != null && itemId.longValue() == 0) || ((UpdateItemHighQualityRequest) this.$request).getStrUrl() == null || ((UpdateItemHighQualityRequest) this.$request).getIsHighQuality() == null || Intrinsics.areEqual(((UpdateItemHighQualityRequest) this.$request).getIsHighQuality(), Boxing.boxBoolean(false)))) {
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$request, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((UpdateItemHighQualityRequest) this.$request).getItemId() == null || ((itemId2 = ((UpdateItemHighQualityRequest) this.$request).getItemId()) != null && itemId2.longValue() == 0)) {
            return Unit.INSTANCE;
        }
        AwsRepository awsRepository = AwsRepository.INSTANCE;
        Long itemId3 = ((UpdateItemHighQualityRequest) this.$request).getItemId();
        Intrinsics.checkNotNull(itemId3);
        long longValue = itemId3.longValue();
        String strUrl = ((UpdateItemHighQualityRequest) this.$request).getStrUrl();
        Intrinsics.checkNotNull(strUrl);
        String sha1 = ImageUtils.INSTANCE.getSha1(((UpdateItemHighQualityRequest) this.$request).getFilePath());
        if (sha1 == null) {
            sha1 = "";
        }
        String str = sha1;
        BitmapFactory.Options options = ImageUtils.INSTANCE.getOptions(((UpdateItemHighQualityRequest) this.$request).getFilePath());
        int i2 = options == null ? 0 : options.outHeight;
        BitmapFactory.Options options2 = ImageUtils.INSTANCE.getOptions(((UpdateItemHighQualityRequest) this.$request).getFilePath());
        int i3 = options2 == null ? 0 : options2.outWidth;
        Long imageSize = ImageUtils.INSTANCE.getImageSize(((UpdateItemHighQualityRequest) this.$request).getFilePath());
        updateItemOriginalImageUrl = awsRepository.updateItemOriginalImageUrl(longValue, strUrl, str, i2, i3, imageSize == null ? 0L : imageSize.longValue(), (r21 & 64) != 0 ? "jpg" : null);
        RouteRequest<Boolean> routeRequest = this.$request;
        int i4 = WhenMappings.$EnumSwitchMapping$0[updateItemOriginalImageUrl.getStatus().ordinal()];
        if (i4 == 1) {
            boxBoolean = Boxing.boxBoolean(true);
        } else if (i4 != 2) {
            boxBoolean = null;
        } else {
            NetworkException exception = updateItemOriginalImageUrl.getException();
            APIException aPIException = exception instanceof APIException ? (APIException) exception : null;
            if (aPIException != null && aPIException.getCode() == 1025) {
                z = true;
            }
            boxBoolean = Boxing.boxBoolean(z);
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        UpdateItemHighQualityHandler$post$1$2$1 updateItemHighQualityHandler$post$1$2$1 = new UpdateItemHighQualityHandler$post$1$2$1(boxBoolean, routeRequest, null);
        this.L$0 = updateItemOriginalImageUrl;
        this.label = 2;
        if (BuildersKt.withContext(main, updateItemHighQualityHandler$post$1$2$1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UpdateItemHighQualityHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.glority.android.base.aws.router.UpdateItemHighQualityHandler$post$1$1", f = "UpdateItemHighQualityHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.base.aws.router.UpdateItemHighQualityHandler$post$1$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RouteRequest<Boolean> $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RouteRequest<Boolean> routeRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$request = routeRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Router.onResponse(this.$request.getId(), Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }
}
