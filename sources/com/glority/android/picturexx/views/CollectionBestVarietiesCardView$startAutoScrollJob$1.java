package com.glority.android.picturexx.views;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionBestVarietiesCardView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.views.CollectionBestVarietiesCardView$startAutoScrollJob$1", f = "CollectionBestVarietiesCardView.kt", i = {0}, l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes5.dex */
public final class CollectionBestVarietiesCardView$startAutoScrollJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CollectionBestVarietiesCardView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionBestVarietiesCardView$startAutoScrollJob$1(CollectionBestVarietiesCardView collectionBestVarietiesCardView, Continuation<? super CollectionBestVarietiesCardView$startAutoScrollJob$1> continuation) {
        super(2, continuation);
        this.this$0 = collectionBestVarietiesCardView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CollectionBestVarietiesCardView$startAutoScrollJob$1 collectionBestVarietiesCardView$startAutoScrollJob$1 = new CollectionBestVarietiesCardView$startAutoScrollJob$1(this.this$0, continuation);
        collectionBestVarietiesCardView$startAutoScrollJob$1.L$0 = obj;
        return collectionBestVarietiesCardView$startAutoScrollJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CollectionBestVarietiesCardView$startAutoScrollJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L36
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.L$0
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            r1 = r6
        L23:
            kotlinx.coroutines.CoroutineScopeKt.ensureActive(r1)
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.L$0 = r1
            r5.label = r2
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r6 != r0) goto L36
            return r0
        L36:
            com.glority.android.picturexx.views.CollectionBestVarietiesCardView r6 = r5.this$0
            com.glority.android.picturexx.views.CollectionBestVarietiesCardView$CollectionPagerAdapter r6 = com.glority.android.picturexx.views.CollectionBestVarietiesCardView.access$getAdapter$p(r6)
            int r6 = r6.getItemCount()
            if (r6 > r2) goto L45
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L45:
            com.glority.android.picturexx.views.CollectionBestVarietiesCardView r3 = r5.this$0
            com.glority.android.picturexx.business.databinding.ViewMeCollectionSummaryBestVarietiesBinding r3 = com.glority.android.picturexx.views.CollectionBestVarietiesCardView.access$getBinding$p(r3)
            androidx.viewpager2.widget.ViewPager2 r3 = r3.pager2
            com.glority.android.picturexx.views.CollectionBestVarietiesCardView r4 = r5.this$0
            com.glority.android.picturexx.business.databinding.ViewMeCollectionSummaryBestVarietiesBinding r4 = com.glority.android.picturexx.views.CollectionBestVarietiesCardView.access$getBinding$p(r4)
            androidx.viewpager2.widget.ViewPager2 r4 = r4.pager2
            int r4 = r4.getCurrentItem()
            int r4 = r4 + r2
            int r4 = r4 % r6
            r3.setCurrentItem(r4, r2)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.views.CollectionBestVarietiesCardView$startAutoScrollJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
