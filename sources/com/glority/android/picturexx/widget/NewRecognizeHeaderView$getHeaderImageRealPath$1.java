package com.glority.android.picturexx.widget;

import android.content.Context;
import android.graphics.Bitmap;
import com.glority.network.util.Md5Utils;
import com.glority.utils.ui.ImageUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewRecognizeHeaderView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.widget.NewRecognizeHeaderView$getHeaderImageRealPath$1", f = "NewRecognizeHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class NewRecognizeHeaderView$getHeaderImageRealPath$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $callback;
    final /* synthetic */ String $denominationSideImage;
    final /* synthetic */ Context $newContext;
    final /* synthetic */ String $subjectSideImage;
    final /* synthetic */ List<String> $userImage;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NewRecognizeHeaderView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NewRecognizeHeaderView$getHeaderImageRealPath$1(Context context, List<String> list, String str, String str2, NewRecognizeHeaderView newRecognizeHeaderView, Function1<? super String, Unit> function1, Continuation<? super NewRecognizeHeaderView$getHeaderImageRealPath$1> continuation) {
        super(2, continuation);
        this.$newContext = context;
        this.$userImage = list;
        this.$denominationSideImage = str;
        this.$subjectSideImage = str2;
        this.this$0 = newRecognizeHeaderView;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewRecognizeHeaderView$getHeaderImageRealPath$1 newRecognizeHeaderView$getHeaderImageRealPath$1 = new NewRecognizeHeaderView$getHeaderImageRealPath$1(this.$newContext, this.$userImage, this.$denominationSideImage, this.$subjectSideImage, this.this$0, this.$callback, continuation);
        newRecognizeHeaderView$getHeaderImageRealPath$1.L$0 = obj;
        return newRecognizeHeaderView$getHeaderImageRealPath$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NewRecognizeHeaderView$getHeaderImageRealPath$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        T t;
        Bitmap createMergeImage;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (this.$newContext != null) {
            List<String> list = this.$userImage;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (StringsKt.contains$default((CharSequence) obj2, (CharSequence) "beautify", false, 2, (Object) null)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                String str = Md5Utils.md5(this.$denominationSideImage + this.$subjectSideImage) + "merged_2.webp";
                createMergeImage = this.this$0.createMergeImage(this.$denominationSideImage, this.$subjectSideImage, this.$newContext);
                File file = new File(this.$newContext.getCacheDir(), str);
                ImageUtils.save(createMergeImage, file, Bitmap.CompressFormat.WEBP);
                t = file.getAbsolutePath();
            } else {
                t = (String) CollectionsKt.firstOrNull((List) this.$userImage);
            }
            objectRef.element = t;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass2(this.$callback, objectRef, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewRecognizeHeaderView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.widget.NewRecognizeHeaderView$getHeaderImageRealPath$1$2", f = "NewRecognizeHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.widget.NewRecognizeHeaderView$getHeaderImageRealPath$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<String, Unit> $callback;
        final /* synthetic */ Ref.ObjectRef<String> $path;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super String, Unit> function1, Ref.ObjectRef<String> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = function1;
            this.$path = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$callback, this.$path, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$callback.invoke(this.$path.element);
            return Unit.INSTANCE;
        }
    }
}
