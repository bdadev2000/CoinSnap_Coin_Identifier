package com.glority.android.picturexx.view.recognize;

import androidx.core.os.BundleKt;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.picturexx.business.databinding.ActivitySuggestAddBinding;
import com.glority.android.xx.constants.LogEvents;
import com.glority.utils.ui.ToastUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SuggestToAddActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.recognize.SuggestToAddActivity$initView$5$1", f = "SuggestToAddActivity.kt", i = {0, 0}, l = {121}, m = "invokeSuspend", n = {"$this$launch", "fileList"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
public final class SuggestToAddActivity$initView$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivitySuggestAddBinding $binding;
    final /* synthetic */ List<String> $uploadImageUris;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SuggestToAddActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestToAddActivity$initView$5$1(SuggestToAddActivity suggestToAddActivity, ActivitySuggestAddBinding activitySuggestAddBinding, List<String> list, Continuation<? super SuggestToAddActivity$initView$5$1> continuation) {
        super(2, continuation);
        this.this$0 = suggestToAddActivity;
        this.$binding = activitySuggestAddBinding;
        this.$uploadImageUris = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SuggestToAddActivity$initView$5$1 suggestToAddActivity$initView$5$1 = new SuggestToAddActivity$initView$5$1(this.this$0, this.$binding, this.$uploadImageUris, continuation);
        suggestToAddActivity$initView$5$1.L$0 = obj;
        return suggestToAddActivity$initView$5$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SuggestToAddActivity$initView$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x00b9 -> B:5:0x00bc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.recognize.SuggestToAddActivity$initView$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuggestToAddActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.recognize.SuggestToAddActivity$initView$5$1$3", f = "SuggestToAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.recognize.SuggestToAddActivity$initView$5$1$3, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivitySuggestAddBinding $binding;
        final /* synthetic */ List<String> $uploadImageUris;
        int label;
        final /* synthetic */ SuggestToAddActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(SuggestToAddActivity suggestToAddActivity, ActivitySuggestAddBinding activitySuggestAddBinding, List<String> list, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = suggestToAddActivity;
            this.$binding = activitySuggestAddBinding;
            this.$uploadImageUris = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$binding, this.$uploadImageUris, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.hideProgress();
            ToastUtils.showSuccess("Successful", new Object[0]);
            SuggestToAddActivity suggestToAddActivity = this.this$0;
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to(LogEventArguments.ARG_STRING_1, this.$binding.botanicalNameInput.getText().toString());
            list = this.this$0.commonNameList;
            pairArr[1] = TuplesKt.to(LogEventArguments.ARG_STRING_2, CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
            List<String> list2 = this.$uploadImageUris;
            pairArr[2] = TuplesKt.to("content", list2 != null ? CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, null, 62, null) : null);
            suggestToAddActivity.logEvent(LogEvents.suggesttoadd_send_click, BundleKt.bundleOf(pairArr));
            this.this$0.finish();
            return Unit.INSTANCE;
        }
    }
}
