package com.glority.android.picturexx.view.recognize;

import android.util.Log;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.work.WorkRequest;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$showEditToast$1;
import com.glority.android.xx.constants.LogEvents;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.GlTextView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecognizeCmsDetailFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$showEditToast$1", f = "RecognizeCmsDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class RecognizeCmsDetailFragment$showEditToast$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $addCollectionFrom;
    final /* synthetic */ CmsName $cmsName;
    final /* synthetic */ CollectionItem $collectionItem;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecognizeCmsDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecognizeCmsDetailFragment$showEditToast$1(CollectionItem collectionItem, String str, RecognizeCmsDetailFragment recognizeCmsDetailFragment, CmsName cmsName, Continuation<? super RecognizeCmsDetailFragment$showEditToast$1> continuation) {
        super(2, continuation);
        this.$collectionItem = collectionItem;
        this.$addCollectionFrom = str;
        this.this$0 = recognizeCmsDetailFragment;
        this.$cmsName = cmsName;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecognizeCmsDetailFragment$showEditToast$1 recognizeCmsDetailFragment$showEditToast$1 = new RecognizeCmsDetailFragment$showEditToast$1(this.$collectionItem, this.$addCollectionFrom, this.this$0, this.$cmsName, continuation);
        recognizeCmsDetailFragment$showEditToast$1.L$0 = obj;
        return recognizeCmsDetailFragment$showEditToast$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecognizeCmsDetailFragment$showEditToast$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r10.label
            if (r0 != 0) goto Lc7
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.L$0
            r0 = r11
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            com.glority.android.database.entities.CollectionItem r11 = r10.$collectionItem
            java.lang.String r11 = r11.getSeriesIndexListUid()
            r1 = 0
            if (r11 == 0) goto L41
            java.lang.String r11 = r10.$addCollectionFrom
            java.lang.String r2 = "h5"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r2)
            if (r11 == 0) goto L41
            com.glority.android.database.DBManager r11 = com.glority.android.database.DBManager.INSTANCE
            com.glority.android.database.dao.SeriesItemDao r11 = r11.getSeriesItemDao()
            com.glority.android.database.entities.CollectionItem r2 = r10.$collectionItem
            java.lang.String r2 = r2.getSeriesIndexListUid()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            com.glority.android.database.entities.SeriesItem r11 = r11.getItemByIndexListUidSync(r2)
            java.lang.String r2 = "officialset"
            if (r11 == 0) goto L3d
            java.lang.String r1 = r11.getTitle()
        L3d:
            r7 = r1
        L3e:
            r6 = r2
            goto La7
        L41:
            com.glority.android.database.entities.CollectionItem r11 = r10.$collectionItem
            java.lang.Integer r11 = r11.getCustomSeriesId()
            if (r11 == 0) goto L76
            com.glority.android.database.DBManager r11 = com.glority.android.database.DBManager.INSTANCE
            com.glority.android.database.dao.UserCustomSeriesItemDao r11 = r11.getUserCustomSeriesItemDao()
            com.glority.android.database.entities.CollectionItem r2 = r10.$collectionItem
            java.lang.Integer r2 = r2.getCustomSeriesId()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r2 = r2.intValue()
            com.glority.android.database.entities.UserCustomSeriesItem r11 = r11.getItemSync(r2)
            com.glority.android.database.entities.CollectionItem r2 = r10.$collectionItem
            if (r11 == 0) goto L69
            java.lang.String r3 = r11.getTitle()
            goto L6a
        L69:
            r3 = r1
        L6a:
            r2.setCustomSeriesName(r3)
            java.lang.String r2 = "customset"
            if (r11 == 0) goto L8d
            java.lang.String r11 = r11.getTitle()
            goto L8e
        L76:
            com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment r11 = r10.this$0
            android.content.Context r11 = r11.getContext()
            java.lang.String r2 = "fullcollection"
            if (r11 == 0) goto L8d
            android.content.res.Resources r11 = r11.getResources()
            if (r11 == 0) goto L8d
            int r3 = com.glority.android.picturexx.business.R.string.customseries__full_collection
            java.lang.String r11 = r11.getString(r3)
            goto L8e
        L8d:
            r11 = r1
        L8e:
            if (r11 != 0) goto La5
            com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment r11 = r10.this$0
            android.content.Context r11 = r11.getContext()
            if (r11 == 0) goto L3d
            android.content.res.Resources r11 = r11.getResources()
            if (r11 == 0) goto L3d
            int r1 = com.glority.android.picturexx.business.R.string.customseries__full_collection
            java.lang.String r1 = r11.getString(r1)
            goto L3d
        La5:
            r7 = r11
            goto L3e
        La7:
            kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()
            r1 = r11
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$showEditToast$1$1 r11 = new com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$showEditToast$1$1
            com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment r4 = r10.this$0
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r5 = r10.$cmsName
            com.glority.android.database.entities.CollectionItem r8 = r10.$collectionItem
            r9 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = r11
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r4 = 2
            r5 = 0
            r2 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        Lc7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$showEditToast$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecognizeCmsDetailFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$showEditToast$1$1", f = "RecognizeCmsDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$showEditToast$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CmsName $cmsName;
        final /* synthetic */ CollectionItem $collectionItem;
        final /* synthetic */ String $name;
        final /* synthetic */ String $type;
        int label;
        final /* synthetic */ RecognizeCmsDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RecognizeCmsDetailFragment recognizeCmsDetailFragment, CmsName cmsName, String str, String str2, CollectionItem collectionItem, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = recognizeCmsDetailFragment;
            this.$cmsName = cmsName;
            this.$type = str;
            this.$name = str2;
            this.$collectionItem = collectionItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$cmsName, this.$type, this.$name, this.$collectionItem, continuation);
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
            final RecognizeCmsDetailFragment recognizeCmsDetailFragment = this.this$0;
            final CmsName cmsName = this.$cmsName;
            final String str = this.$type;
            String str2 = this.$name;
            final CollectionItem collectionItem = this.$collectionItem;
            try {
                recognizeCmsDetailFragment.logEvent(LogEvents.collectionsavedtoast_show, BundleKt.bundleOf(TuplesKt.to("from", recognizeCmsDetailFragment.getPageName()), TuplesKt.to(LogEventArguments.ARG_STRING_1, String.valueOf(recognizeCmsDetailFragment.getItemId())), TuplesKt.to(LogEventArguments.ARG_STRING_2, cmsName.getUid()), TuplesKt.to("type", str)));
                RecognizeCmsDetailFragment.access$getBinding(recognizeCmsDetailFragment).addCollectionNoticeLl.descTv.setText(recognizeCmsDetailFragment.getString(R.string.result_collection_addedtocustomsettoast, str2));
                View root = RecognizeCmsDetailFragment.access$getBinding(recognizeCmsDetailFragment).addCollectionNoticeLl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                root.setVisibility(0);
                RecognizeCmsDetailFragment.access$getBinding(recognizeCmsDetailFragment).addCollectionNoticeLl.getRoot().postDelayed(new Runnable() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$showEditToast$1$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RecognizeCmsDetailFragment$showEditToast$1.AnonymousClass1.invokeSuspend$lambda$2$lambda$1(RecognizeCmsDetailFragment.this);
                    }
                }, WorkRequest.MIN_BACKOFF_MILLIS);
                GlTextView editTv = RecognizeCmsDetailFragment.access$getBinding(recognizeCmsDetailFragment).addCollectionNoticeLl.editTv;
                Intrinsics.checkNotNullExpressionValue(editTv, "editTv");
                ViewExtensionsKt.setSingleClickListener$default(editTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$showEditToast$1$1$1$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(View view) {
                        invoke2(view);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        RecognizeCmsDetailFragment recognizeCmsDetailFragment2 = RecognizeCmsDetailFragment.this;
                        recognizeCmsDetailFragment2.logEvent(LogEvents.collectionsavedtoast_edit_click, BundleKt.bundleOf(TuplesKt.to("from", recognizeCmsDetailFragment2.getPageName()), TuplesKt.to(LogEventArguments.ARG_STRING_1, String.valueOf(RecognizeCmsDetailFragment.this.getItemId())), TuplesKt.to(LogEventArguments.ARG_STRING_2, cmsName.getUid()), TuplesKt.to("type", str)));
                        CollectionDetailEditDialogFragment.Companion.editOpen$default(CollectionDetailEditDialogFragment.INSTANCE, RecognizeCmsDetailFragment.this.getSupportFragmentManager(), collectionItem.toCollection(), 0, RecognizeCmsDetailFragment.this.getPageName(), cmsName, null, null, 96, null);
                    }
                }, 1, (Object) null);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2$lambda$1(RecognizeCmsDetailFragment recognizeCmsDetailFragment) {
            try {
                View root = RecognizeCmsDetailFragment.access$getBinding(recognizeCmsDetailFragment).addCollectionNoticeLl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                root.setVisibility(8);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
    }
}
