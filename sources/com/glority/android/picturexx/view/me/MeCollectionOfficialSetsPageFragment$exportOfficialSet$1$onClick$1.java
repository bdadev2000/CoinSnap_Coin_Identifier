package com.glority.android.picturexx.view.me;

import android.content.Context;
import android.view.View;
import com.glority.android.picturexx.definition.SeriesItemWrapper;
import com.glority.android.picturexx.view.dialog.ExportWriteInfoDialog;
import com.glority.android.xx.constants.LogEvents;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MeCollectionOfficialSetsPageFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionOfficialSetsPageFragment$exportOfficialSet$1$onClick$1", f = "MeCollectionOfficialSetsPageFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class MeCollectionOfficialSetsPageFragment$exportOfficialSet$1$onClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $anchorView;
    final /* synthetic */ SeriesItemWrapper $seriesItem;
    int label;
    final /* synthetic */ MeCollectionOfficialSetsPageFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeCollectionOfficialSetsPageFragment$exportOfficialSet$1$onClick$1(View view, SeriesItemWrapper seriesItemWrapper, MeCollectionOfficialSetsPageFragment meCollectionOfficialSetsPageFragment, Continuation<? super MeCollectionOfficialSetsPageFragment$exportOfficialSet$1$onClick$1> continuation) {
        super(2, continuation);
        this.$anchorView = view;
        this.$seriesItem = seriesItemWrapper;
        this.this$0 = meCollectionOfficialSetsPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MeCollectionOfficialSetsPageFragment$exportOfficialSet$1$onClick$1(this.$anchorView, this.$seriesItem, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MeCollectionOfficialSetsPageFragment$exportOfficialSet$1$onClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ExportWriteInfoDialog exportWriteInfoDialog = ExportWriteInfoDialog.INSTANCE;
        Context context = this.$anchorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer currentCount = this.$seriesItem.getSeriesItem().getCurrentCount();
        int intValue = currentCount != null ? currentCount.intValue() : 0;
        Long seriesId = this.$seriesItem.getSeriesItem().getSeriesId();
        exportWriteInfoDialog.open(context, intValue, seriesId != null ? Boxing.boxInt((int) seriesId.longValue()) : null, this.this$0, LogEvents.exportall);
        return Unit.INSTANCE;
    }
}
