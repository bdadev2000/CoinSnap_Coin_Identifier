package com.glority.android.compose.ui;

import android.content.Context;
import androidx.compose.runtime.ProduceStateScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Image.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.compose.ui.ImageKt$GlImage$imagePath$1", f = "Image.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class ImageKt$GlImage$imagePath$1 extends SuspendLambda implements Function2<ProduceStateScope<Object>, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $blur;
    final /* synthetic */ Context $context;
    final /* synthetic */ Object $model;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageKt$GlImage$imagePath$1(Context context, Object obj, float f, Continuation<? super ImageKt$GlImage$imagePath$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$model = obj;
        this.$blur = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ImageKt$GlImage$imagePath$1 imageKt$GlImage$imagePath$1 = new ImageKt$GlImage$imagePath$1(this.$context, this.$model, this.$blur, continuation);
        imageKt$GlImage$imagePath$1.L$0 = obj;
        return imageKt$GlImage$imagePath$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProduceStateScope<Object> produceStateScope, Continuation<? super Unit> continuation) {
        return ((ImageKt$GlImage$imagePath$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Image.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.glority.android.compose.ui.ImageKt$GlImage$imagePath$1$1", f = "Image.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.compose.ui.ImageKt$GlImage$imagePath$1$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        final /* synthetic */ float $blur;
        final /* synthetic */ Context $context;
        final /* synthetic */ Object $model;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Object obj, float f, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$model = obj;
            this.$blur = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$context, this.$model, this.$blur, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object glideModel;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            glideModel = ImageKt.getGlideModel(this.$context, this.$model, this.$blur);
            return glideModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        ProduceStateScope produceStateScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
            async$default = BuildersKt__Builders_commonKt.async$default(produceStateScope2, Dispatchers.getIO(), null, new AnonymousClass1(this.$context, this.$model, this.$blur, null), 2, null);
            this.L$0 = produceStateScope2;
            this.label = 1;
            Object await = async$default.await(this);
            if (await == coroutine_suspended) {
                return coroutine_suspended;
            }
            produceStateScope = produceStateScope2;
            obj = await;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            produceStateScope = (ProduceStateScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        produceStateScope.setValue(obj);
        return Unit.INSTANCE;
    }
}
