package com.glority.android.picturexx.repository;

import com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CmsRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.repository.CmsRepository$getStaticUrlMessageByCacheOrNetwork$1", f = "CmsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CmsRepository$getStaticUrlMessageByCacheOrNetwork$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<CmsStaticUrl, Unit> $callback;
    final /* synthetic */ String $contentType;
    final /* synthetic */ String $uid;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CmsRepository$getStaticUrlMessageByCacheOrNetwork$1(String str, String str2, Function1<? super CmsStaticUrl, Unit> function1, Continuation<? super CmsRepository$getStaticUrlMessageByCacheOrNetwork$1> continuation) {
        super(2, continuation);
        this.$uid = str;
        this.$contentType = str2;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CmsRepository$getStaticUrlMessageByCacheOrNetwork$1 cmsRepository$getStaticUrlMessageByCacheOrNetwork$1 = new CmsRepository$getStaticUrlMessageByCacheOrNetwork$1(this.$uid, this.$contentType, this.$callback, continuation);
        cmsRepository$getStaticUrlMessageByCacheOrNetwork$1.L$0 = obj;
        return cmsRepository$getStaticUrlMessageByCacheOrNetwork$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CmsRepository$getStaticUrlMessageByCacheOrNetwork$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CmsRepository.INSTANCE.getStaticUrlMessageByCache(this.$uid, this.$contentType);
        if (objectRef.element == 0) {
            objectRef.element = CmsRepository.INSTANCE.getStaticUrlCmsMessageByNet(this.$uid, this.$contentType);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(this.$callback, objectRef, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CmsRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.repository.CmsRepository$getStaticUrlMessageByCacheOrNetwork$1$1", f = "CmsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.repository.CmsRepository$getStaticUrlMessageByCacheOrNetwork$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<CmsStaticUrl, Unit> $callback;
        final /* synthetic */ Ref.ObjectRef<CmsStaticUrl> $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super CmsStaticUrl, Unit> function1, Ref.ObjectRef<CmsStaticUrl> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = function1;
            this.$result = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, this.$result, continuation);
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
            this.$callback.invoke(this.$result.element);
            return Unit.INSTANCE;
        }
    }
}
