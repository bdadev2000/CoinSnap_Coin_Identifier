package com.glority.android.picturexx.view.recognize;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.FlowLiveDataConversions;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.UserSeriesListItem;
import com.glority.android.picturexx.extensions.CmsNameExtKt;
import com.glority.android.picturexx.view.BaseCmsDetailFragment;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecognizeCmsDetailFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1", f = "RecognizeCmsDetailFragment.kt", i = {}, l = {256}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class RecognizeCmsDetailFragment$initData$1$onChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CmsName $value;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecognizeCmsDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecognizeCmsDetailFragment$initData$1$onChanged$1(RecognizeCmsDetailFragment recognizeCmsDetailFragment, CmsName cmsName, Continuation<? super RecognizeCmsDetailFragment$initData$1$onChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = recognizeCmsDetailFragment;
        this.$value = cmsName;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecognizeCmsDetailFragment$initData$1$onChanged$1 recognizeCmsDetailFragment$initData$1$onChanged$1 = new RecognizeCmsDetailFragment$initData$1$onChanged$1(this.this$0, this.$value, continuation);
        recognizeCmsDetailFragment$initData$1$onChanged$1.L$0 = obj;
        return recognizeCmsDetailFragment$initData$1$onChanged$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecognizeCmsDetailFragment$initData$1$onChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Long itemId = this.this$0.getItemId();
            if (itemId == null) {
                return Unit.INSTANCE;
            }
            long longValue = itemId.longValue();
            final String preferredSeries = CmsNameExtKt.getPreferredSeries(this.$value);
            String str = preferredSeries;
            if (str == null || str.length() == 0) {
                RecognizeCmsDetailFragment recognizeCmsDetailFragment = this.this$0;
                BaseCmsDetailFragment.updateCmsUi$default(recognizeCmsDetailFragment, this.$value, null, null, recognizeCmsDetailFragment.getVm().getSubjectSideUrl(), this.this$0.getVm().getDenominationSideUrl(), this.this$0.getVm().getDisplayImage(), 6, null);
                return Unit.INSTANCE;
            }
            long userId = AppViewModel.INSTANCE.getUserId();
            final Flow asFlow = FlowLiveDataConversions.asFlow(DBManager.INSTANCE.getCollectionItemDao().getAll());
            Flow<Integer> flow = new Flow<Integer>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 50)
                /* renamed from: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ String $seriesId$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 50)
                    @DebugMetadata(c = "com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$1$2", f = "RecognizeCmsDetailFragment.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    /* renamed from: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* loaded from: classes5.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, String str) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$seriesId$inlined = str;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                        /*
                            r7 = this;
                            boolean r0 = r9 instanceof com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L14
                            r0 = r9
                            com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r1 = r1 & r2
                            if (r1 == 0) goto L14
                            int r9 = r0.label
                            int r9 = r9 - r2
                            r0.label = r9
                            goto L19
                        L14:
                            com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r9)
                        L19:
                            java.lang.Object r9 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L33
                            if (r2 != r3) goto L2b
                            kotlin.ResultKt.throwOnFailure(r9)
                            goto La7
                        L2b:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L33:
                            kotlin.ResultKt.throwOnFailure(r9)
                            kotlinx.coroutines.flow.FlowCollector r9 = r7.$this_unsafeFlow
                            r2 = r0
                            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                            java.util.List r8 = (java.util.List) r8
                            java.lang.Iterable r8 = (java.lang.Iterable) r8
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            java.util.Collection r2 = (java.util.Collection) r2
                            java.util.Iterator r8 = r8.iterator()
                        L4a:
                            boolean r4 = r8.hasNext()
                            if (r4 == 0) goto L67
                            java.lang.Object r4 = r8.next()
                            r5 = r4
                            com.glority.android.database.entities.CollectionItem r5 = (com.glority.android.database.entities.CollectionItem) r5
                            java.lang.String r5 = r5.getSeriesIndexListUid()
                            java.lang.String r6 = r7.$seriesId$inlined
                            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                            if (r5 == 0) goto L4a
                            r2.add(r4)
                            goto L4a
                        L67:
                            java.util.List r2 = (java.util.List) r2
                            java.lang.Iterable r2 = (java.lang.Iterable) r2
                            java.util.HashSet r8 = new java.util.HashSet
                            r8.<init>()
                            java.util.ArrayList r4 = new java.util.ArrayList
                            r4.<init>()
                            java.util.Iterator r2 = r2.iterator()
                        L79:
                            boolean r5 = r2.hasNext()
                            if (r5 == 0) goto L94
                            java.lang.Object r5 = r2.next()
                            r6 = r5
                            com.glority.android.database.entities.CollectionItem r6 = (com.glority.android.database.entities.CollectionItem) r6
                            java.lang.String r6 = r6.getUid()
                            boolean r6 = r8.add(r6)
                            if (r6 == 0) goto L79
                            r4.add(r5)
                            goto L79
                        L94:
                            java.util.List r4 = (java.util.List) r4
                            int r8 = r4.size()
                            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
                            r0.label = r3
                            java.lang.Object r8 = r9.emit(r8, r0)
                            if (r8 != r1) goto La7
                            return r1
                        La7:
                            kotlin.Unit r8 = kotlin.Unit.INSTANCE
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, preferredSeries), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            };
            Flow asFlow2 = FlowLiveDataConversions.asFlow(DBManager.INSTANCE.getUserSeriesListItemDao().getItemByIndexListUid(preferredSeries));
            final Flow asFlow3 = FlowLiveDataConversions.asFlow(DBManager.INSTANCE.getCollectionItemDao().queryByItemId(userId, longValue));
            this.label = 1;
            if (FlowKt.collect(FlowKt.combine(asFlow2, flow, new Flow<Boolean>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$2

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 50)
                /* renamed from: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                /* loaded from: classes5.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 50)
                    @DebugMetadata(c = "com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$2$2", f = "RecognizeCmsDetailFragment.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    /* renamed from: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
                    /* loaded from: classes5.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L14
                            r0 = r6
                            com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$2$2$1 r0 = (com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r1 = r1 & r2
                            if (r1 == 0) goto L14
                            int r6 = r0.label
                            int r6 = r6 - r2
                            r0.label = r6
                            goto L19
                        L14:
                            com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$2$2$1 r0 = new com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$2$2$1
                            r0.<init>(r6)
                        L19:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L32
                            if (r2 != r3) goto L2a
                            kotlin.ResultKt.throwOnFailure(r6)
                            goto L4e
                        L2a:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L32:
                            kotlin.ResultKt.throwOnFailure(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                            r2 = r0
                            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                            com.glority.android.database.entities.CollectionItem r5 = (com.glority.android.database.entities.CollectionItem) r5
                            if (r5 == 0) goto L40
                            r5 = r3
                            goto L41
                        L40:
                            r5 = 0
                        L41:
                            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4e
                            return r1
                        L4e:
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$invokeSuspend$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            }, new AnonymousClass1(this.this$0, coroutineScope, this.$value, null)), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecognizeCmsDetailFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "userSeriesListItem", "Lcom/glority/android/database/entities/UserSeriesListItem;", "currentCount", "", "isCollected", ""}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$1", f = "RecognizeCmsDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1$onChanged$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function4<UserSeriesListItem, Integer, Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $$this$launch;
        final /* synthetic */ CmsName $value;
        /* synthetic */ int I$0;
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ RecognizeCmsDetailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RecognizeCmsDetailFragment recognizeCmsDetailFragment, CoroutineScope coroutineScope, CmsName cmsName, Continuation<? super AnonymousClass1> continuation) {
            super(4, continuation);
            this.this$0 = recognizeCmsDetailFragment;
            this.$$this$launch = coroutineScope;
            this.$value = cmsName;
        }

        public final Object invoke(UserSeriesListItem userSeriesListItem, int i, boolean z, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, this.$value, continuation);
            anonymousClass1.L$0 = userSeriesListItem;
            anonymousClass1.I$0 = i;
            anonymousClass1.Z$0 = z;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(UserSeriesListItem userSeriesListItem, Integer num, Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(userSeriesListItem, num.intValue(), bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z;
            UserSeriesListItem userSeriesListItem;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UserSeriesListItem userSeriesListItem2 = (UserSeriesListItem) this.L$0;
            int i = this.I$0;
            boolean z2 = this.Z$0;
            RecognizeCmsDetailFragment recognizeCmsDetailFragment = this.this$0;
            if (userSeriesListItem2 != null) {
                userSeriesListItem2.setCurrentCount(i);
            } else {
                userSeriesListItem2 = null;
            }
            recognizeCmsDetailFragment.userSeriesListItem = userSeriesListItem2;
            this.this$0.isCollected = z2;
            CoroutineScopeKt.ensureActive(this.$$this$launch);
            z = this.this$0.h5Initialized;
            if (!z) {
                this.this$0.h5Initialized = true;
                RecognizeCmsDetailFragment recognizeCmsDetailFragment2 = this.this$0;
                BaseCmsDetailFragment.updateCmsUi$default(recognizeCmsDetailFragment2, this.$value, null, null, recognizeCmsDetailFragment2.getVm().getSubjectSideUrl(), this.this$0.getVm().getDenominationSideUrl(), this.this$0.getVm().getDisplayImage(), 6, null);
            } else {
                userSeriesListItem = this.this$0.userSeriesListItem;
                if (userSeriesListItem != null) {
                    this.this$0.updateCollectedState();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
