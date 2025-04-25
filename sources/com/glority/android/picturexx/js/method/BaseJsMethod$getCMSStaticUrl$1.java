package com.glority.android.picturexx.js.method;

import android.app.Dialog;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsStaticUrl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseJsMethod.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.js.method.BaseJsMethod$getCMSStaticUrl$1", f = "BaseJsMethod.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class BaseJsMethod$getCMSStaticUrl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contentType;
    final /* synthetic */ Ref.ObjectRef<Dialog> $dialog;
    final /* synthetic */ String $uid;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseJsMethod this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseJsMethod$getCMSStaticUrl$1(String str, String str2, Ref.ObjectRef<Dialog> objectRef, BaseJsMethod baseJsMethod, Continuation<? super BaseJsMethod$getCMSStaticUrl$1> continuation) {
        super(2, continuation);
        this.$uid = str;
        this.$contentType = str2;
        this.$dialog = objectRef;
        this.this$0 = baseJsMethod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseJsMethod$getCMSStaticUrl$1 baseJsMethod$getCMSStaticUrl$1 = new BaseJsMethod$getCMSStaticUrl$1(this.$uid, this.$contentType, this.$dialog, this.this$0, continuation);
        baseJsMethod$getCMSStaticUrl$1.L$0 = obj;
        return baseJsMethod$getCMSStaticUrl$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseJsMethod$getCMSStaticUrl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, Dispatchers.getMain(), null, new AnonymousClass1(this.$dialog, CmsRepository.INSTANCE.getStaticUrlCmsMessageByNet(this.$uid, this.$contentType), this.this$0, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseJsMethod.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.js.method.BaseJsMethod$getCMSStaticUrl$1$1", f = "BaseJsMethod.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.js.method.BaseJsMethod$getCMSStaticUrl$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<Dialog> $dialog;
        final /* synthetic */ CmsStaticUrl $result;
        int label;
        final /* synthetic */ BaseJsMethod this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<Dialog> objectRef, CmsStaticUrl cmsStaticUrl, BaseJsMethod baseJsMethod, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$dialog = objectRef;
            this.$result = cmsStaticUrl;
            this.this$0 = baseJsMethod;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$dialog, this.$result, this.this$0, continuation);
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
            Dialog dialog = this.$dialog.element;
            if (dialog != null) {
                dialog.dismiss();
            }
            CmsStaticUrl cmsStaticUrl = this.$result;
            if (cmsStaticUrl != null) {
                this.this$0.callbackSuccess(MapsKt.mapOf(TuplesKt.to("lightUrl", cmsStaticUrl.getLightUrl()), TuplesKt.to("darkUrl", this.$result.getDarkUrl())));
            } else {
                this.this$0.callbackFailed("get cms static url failed");
            }
            return Unit.INSTANCE;
        }
    }
}
