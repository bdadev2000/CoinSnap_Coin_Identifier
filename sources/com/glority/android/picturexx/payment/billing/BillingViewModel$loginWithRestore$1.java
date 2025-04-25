package com.glority.android.picturexx.payment.billing;

import androidx.lifecycle.MutableLiveData;
import com.glority.base.repository.UserRepository;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.LoginType;
import com.glority.component.generatedAPI.kotlinAPI.user.GetConfigMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginInfo;
import com.glority.component.generatedAPI.kotlinAPI.user.LoginOrCreateMessage;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.component.generatedAPI.kotlinAPI.vip.GetVipCardMessage;
import com.glority.component.generatedAPI.kotlinAPI.vip.RestoreResult;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: BillingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.payment.billing.BillingViewModel$loginWithRestore$1", f = "BillingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BillingViewModel$loginWithRestore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLiveData<Status> $liveData;
    final /* synthetic */ RestoreResult $restoreResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingViewModel$loginWithRestore$1(MutableLiveData<Status> mutableLiveData, RestoreResult restoreResult, Continuation<? super BillingViewModel$loginWithRestore$1> continuation) {
        super(2, continuation);
        this.$liveData = mutableLiveData;
        this.$restoreResult = restoreResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BillingViewModel$loginWithRestore$1 billingViewModel$loginWithRestore$1 = new BillingViewModel$loginWithRestore$1(this.$liveData, this.$restoreResult, continuation);
        billingViewModel$loginWithRestore$1.L$0 = obj;
        return billingViewModel$loginWithRestore$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingViewModel$loginWithRestore$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        LoginInfo loginInfo = new LoginInfo(0, 1, null);
        RestoreResult restoreResult = this.$restoreResult;
        loginInfo.setLoginKey(String.valueOf(restoreResult.getVipInfo().getUserId()));
        loginInfo.setLoginPassword(restoreResult.getLoginSecret());
        loginInfo.setLoginType(LoginType.RESTORE);
        Resource<LoginOrCreateMessage> loginWithRestoreMethodBlocking = UserRepository.INSTANCE.getInstance().loginWithRestoreMethodBlocking(loginInfo);
        if (loginWithRestoreMethodBlocking.getStatus() == Status.SUCCESS) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(loginInfo, loginWithRestoreMethodBlocking, null), 2, null);
            final MutableLiveData<Status> mutableLiveData = this.$liveData;
            launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: com.glority.android.picturexx.payment.billing.BillingViewModel$loginWithRestore$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: BillingViewModel.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.payment.billing.BillingViewModel$loginWithRestore$1$2$1", f = "BillingViewModel.kt", i = {0, 0, 1, 1}, l = {63, 64}, m = "invokeSuspend", n = {"$this$launch", "configRequestDeferred", "$this$launch", "vipCardRequest"}, s = {"L$0", "L$1", "L$0", "L$1"})
                /* renamed from: com.glority.android.picturexx.payment.billing.BillingViewModel$loginWithRestore$1$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ MutableLiveData<Status> $liveData;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(MutableLiveData<Status> mutableLiveData, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$liveData = mutableLiveData;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$liveData, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Deferred async$default;
                        Deferred async$default2;
                        CoroutineScope coroutineScope;
                        Deferred deferred;
                        Resource resource;
                        CoroutineScope coroutineScope2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new BillingViewModel$loginWithRestore$1$2$1$vipCardRequestDeferred$1(null), 3, null);
                            async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new BillingViewModel$loginWithRestore$1$2$1$configRequestDeferred$1(null), 3, null);
                            this.L$0 = coroutineScope3;
                            this.L$1 = async$default2;
                            this.label = 1;
                            Object await = async$default.await(this);
                            if (await == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope = coroutineScope3;
                            obj = await;
                            deferred = async$default2;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                resource = (Resource) this.L$1;
                                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                coroutineScope2 = coroutineScope4;
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, Dispatchers.getMain(), null, new C00971(resource, (Resource) obj, this.$liveData, null), 2, null);
                                return Unit.INSTANCE;
                            }
                            deferred = (Deferred) this.L$1;
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                        }
                        Resource resource2 = (Resource) obj;
                        this.L$0 = coroutineScope;
                        this.L$1 = resource2;
                        this.label = 2;
                        Object await2 = deferred.await(this);
                        if (await2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        resource = resource2;
                        obj = await2;
                        coroutineScope2 = coroutineScope;
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, Dispatchers.getMain(), null, new C00971(resource, (Resource) obj, this.$liveData, null), 2, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: BillingViewModel.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                    @DebugMetadata(c = "com.glority.android.picturexx.payment.billing.BillingViewModel$loginWithRestore$1$2$1$1", f = "BillingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.glority.android.picturexx.payment.billing.BillingViewModel$loginWithRestore$1$2$1$1, reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes2.dex */
                    public static final class C00971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Resource<GetConfigMessage> $configRequest;
                        final /* synthetic */ MutableLiveData<Status> $liveData;
                        final /* synthetic */ Resource<GetVipCardMessage> $vipCardRequest;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00971(Resource<GetVipCardMessage> resource, Resource<GetConfigMessage> resource2, MutableLiveData<Status> mutableLiveData, Continuation<? super C00971> continuation) {
                            super(2, continuation);
                            this.$vipCardRequest = resource;
                            this.$configRequest = resource2;
                            this.$liveData = mutableLiveData;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C00971(this.$vipCardRequest, this.$configRequest, this.$liveData, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C00971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            if (this.$vipCardRequest.getStatus() == Status.SUCCESS) {
                                AppViewModel companion = AppViewModel.INSTANCE.getInstance();
                                GetVipCardMessage data = this.$vipCardRequest.getData();
                                companion.updateUserVipInfo(data != null ? data.getVipInfo() : null);
                                if (this.$configRequest.getStatus() == Status.SUCCESS) {
                                    AppViewModel companion2 = AppViewModel.INSTANCE.getInstance();
                                    GetConfigMessage data2 = this.$configRequest.getData();
                                    companion2.setClientConfig(data2 != null ? data2.getConfig() : null);
                                    this.$liveData.postValue(Status.SUCCESS);
                                } else {
                                    this.$liveData.postValue(Status.ERROR);
                                }
                            } else {
                                this.$liveData.postValue(Status.ERROR);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, Dispatchers.getIO(), null, new AnonymousClass1(mutableLiveData, null), 2, null);
                }
            });
        } else {
            this.$liveData.postValue(Status.ERROR);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BillingViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.payment.billing.BillingViewModel$loginWithRestore$1$1", f = "BillingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.payment.billing.BillingViewModel$loginWithRestore$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LoginInfo $loginInfo;
        final /* synthetic */ Resource<LoginOrCreateMessage> $loginRequest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LoginInfo loginInfo, Resource<LoginOrCreateMessage> resource, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$loginInfo = loginInfo;
            this.$loginRequest = resource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$loginInfo, this.$loginRequest, continuation);
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
            AppViewModel.INSTANCE.getInstance().updateLoginInfo(this.$loginInfo);
            AppViewModel companion = AppViewModel.INSTANCE.getInstance();
            LoginOrCreateMessage data = this.$loginRequest.getData();
            User user = data != null ? data.getUser() : null;
            LoginOrCreateMessage data2 = this.$loginRequest.getData();
            String accessToken = data2 != null ? data2.getAccessToken() : null;
            LoginOrCreateMessage data3 = this.$loginRequest.getData();
            companion.updateUserAndToken(user, accessToken, data3 != null ? data3.getUserAdditionalData() : null);
            return Unit.INSTANCE;
        }
    }
}
