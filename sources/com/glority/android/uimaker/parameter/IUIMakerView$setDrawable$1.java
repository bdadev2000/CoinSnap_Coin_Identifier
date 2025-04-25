package com.glority.android.uimaker.parameter;

import android.graphics.drawable.Drawable;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IUIMakerView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/uimaker/parameter/baseview/BaseUiMakerParameter;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "com.glority.android.uimaker.parameter.IUIMakerView$setDrawable$1", f = "IUIMakerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class IUIMakerView$setDrawable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1 $callback;
    final /* synthetic */ ImageFile $imageFile;
    final /* synthetic */ boolean $loadLocalResource;
    final /* synthetic */ ResourceConverter $resourceConverter;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IUIMakerView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IUIMakerView$setDrawable$1(IUIMakerView iUIMakerView, boolean z, ImageFile imageFile, ResourceConverter resourceConverter, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iUIMakerView;
        this.$loadLocalResource = z;
        this.$imageFile = imageFile;
        this.$resourceConverter = resourceConverter;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        IUIMakerView$setDrawable$1 iUIMakerView$setDrawable$1 = new IUIMakerView$setDrawable$1(this.this$0, this.$loadLocalResource, this.$imageFile, this.$resourceConverter, this.$callback, completion);
        iUIMakerView$setDrawable$1.L$0 = obj;
        return iUIMakerView$setDrawable$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IUIMakerView$setDrawable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Drawable drawable;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        try {
        } catch (Throwable unused) {
            drawable = null;
        }
        if (this.$loadLocalResource) {
            ImageFile imageFile = this.$imageFile;
            if ((imageFile != null ? imageFile.getLocalFilePath() : null) != null) {
                ResourceConverter resourceConverter = this.$resourceConverter;
                String localFilePath = this.$imageFile.getLocalFilePath();
                Intrinsics.checkNotNull(localFilePath);
                drawable = Glide.with(this.this$0.getViewContext()).asDrawable().load(Boxing.boxInt(resourceConverter.getDrawableRes(localFilePath))).submit().get();
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(drawable, null), 2, null);
                return Unit.INSTANCE;
            }
        }
        RequestBuilder<Drawable> asDrawable = Glide.with(this.this$0.getViewContext()).asDrawable();
        ImageFile imageFile2 = this.$imageFile;
        drawable = asDrawable.load(imageFile2 != null ? imageFile2.getRemoteUrl() : null).submit().get();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(drawable, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IUIMakerView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/uimaker/parameter/baseview/BaseUiMakerParameter;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "com.glority.android.uimaker.parameter.IUIMakerView$setDrawable$1$1", f = "IUIMakerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.uimaker.parameter.IUIMakerView$setDrawable$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Drawable $drawable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Drawable drawable, Continuation continuation) {
            super(2, continuation);
            this.$drawable = drawable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new AnonymousClass1(this.$drawable, completion);
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
            IUIMakerView$setDrawable$1.this.$callback.invoke(this.$drawable);
            return Unit.INSTANCE;
        }
    }
}
