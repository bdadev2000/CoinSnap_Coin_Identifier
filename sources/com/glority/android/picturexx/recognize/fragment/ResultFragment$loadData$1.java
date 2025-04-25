package com.glority.android.picturexx.recognize.fragment;

import android.net.Uri;
import android.util.Log;
import androidx.core.os.BundleKt;
import com.glority.android.picturexx.recognize.analyzer.RecognizeProcess;
import com.glority.android.picturexx.recognize.vm.CoreViewModel;
import com.glority.android.xx.constants.LogEvents;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResultFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.ResultFragment$loadData$1", f = "ResultFragment.kt", i = {0, 0, 0, 0}, l = {78}, m = "invokeSuspend", n = {"$this$launch", "first", "destination$iv$iv", "time1"}, s = {"L$0", "L$1", "L$3", "J$0"})
/* loaded from: classes5.dex */
public final class ResultFragment$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ ResultFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultFragment$loadData$1(ResultFragment resultFragment, Continuation<? super ResultFragment$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = resultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResultFragment$loadData$1 resultFragment$loadData$1 = new ResultFragment$loadData$1(this.this$0, continuation);
        resultFragment$loadData$1.L$0 = obj;
        return resultFragment$loadData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResultFragment$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ed A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #1 {Exception -> 0x0039, blocks: (B:6:0x002c, B:11:0x00e7, B:13:0x00ed, B:18:0x0121, B:113:0x00c0, B:115:0x00c6, B:116:0x00ca), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0121 A[Catch: Exception -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0039, blocks: (B:6:0x002c, B:11:0x00e7, B:13:0x00ed, B:18:0x0121, B:113:0x00c0, B:115:0x00c6, B:116:0x00ca), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0184  */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [T, java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x010a -> B:8:0x0110). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.recognize.fragment.ResultFragment$loadData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResultFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.ResultFragment$loadData$1$2", f = "ResultFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.recognize.fragment.ResultFragment$loadData$1$2, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RecognizeProcess.RecognizeResult $result;
        int label;
        final /* synthetic */ ResultFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ResultFragment resultFragment, RecognizeProcess.RecognizeResult recognizeResult, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = resultFragment;
            this.$result = recognizeResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$result, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoreViewModel coreViewModel;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.uploadItemDetImage(this.$result.getItemIds());
                coreViewModel = this.this$0.vm;
                if (coreViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    coreViewModel = null;
                }
                coreViewModel.uploadOriginalImage(this.$result.getItemIds());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResultFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.ResultFragment$loadData$1$3", f = "ResultFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.recognize.fragment.ResultFragment$loadData$1$3, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RecognizeProcess.RecognizeResult $result;
        final /* synthetic */ long $time1;
        final /* synthetic */ long $time3;
        int label;
        final /* synthetic */ ResultFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(long j, ResultFragment resultFragment, long j2, RecognizeProcess.RecognizeResult recognizeResult, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$time3 = j;
            this.this$0 = resultFragment;
            this.$time1 = j2;
            this.$result = recognizeResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$time3, this.this$0, this.$time1, this.$result, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoreViewModel coreViewModel;
            CoreViewModel coreViewModel2;
            CoreViewModel coreViewModel3;
            String str;
            CoreViewModel coreViewModel4;
            CoreViewModel coreViewModel5;
            CoreViewModel coreViewModel6;
            CoreViewModel coreViewModel7;
            CoreViewModel coreViewModel8;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Log.e("ResultFragment", "show: " + (System.currentTimeMillis() - this.$time3));
            ResultFragment resultFragment = this.this$0;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("time", Boxing.boxLong(this.$time3 - this.$time1));
            coreViewModel = this.this$0.vm;
            CoreViewModel coreViewModel9 = null;
            if (coreViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                coreViewModel = null;
            }
            RecognizeProcess recognizeProcess = coreViewModel.getRecognizeProcess();
            pairArr[1] = TuplesKt.to("name", recognizeProcess != null ? recognizeProcess.typeName() : null);
            resultFragment.logEvent(LogEvents.time_recoginzetotal, BundleKt.bundleOf(pairArr));
            this.this$0.saveRecognizeTime(this.$time3 - this.$time1);
            List<CmsName> cmsNames = this.$result.getCmsNames();
            if (cmsNames == null || cmsNames.isEmpty()) {
                coreViewModel2 = this.this$0.vm;
                if (coreViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    coreViewModel2 = null;
                }
                RecognizeProcess recognizeProcess2 = coreViewModel2.getRecognizeProcess();
                if (recognizeProcess2 != null) {
                    ResultFragment resultFragment2 = this.this$0;
                    ResultFragment resultFragment3 = resultFragment2;
                    coreViewModel3 = resultFragment2.vm;
                    if (coreViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        coreViewModel3 = null;
                    }
                    Uri displayImageUri = coreViewModel3.getDisplayImageUri();
                    if (displayImageUri == null || (str = displayImageUri.toString()) == null) {
                        str = "";
                    }
                    String str2 = str;
                    coreViewModel4 = this.this$0.vm;
                    if (coreViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                    } else {
                        coreViewModel9 = coreViewModel4;
                    }
                    recognizeProcess2.showError(resultFragment3, false, true, null, str2, coreViewModel9.getCaptureFrom());
                }
            } else {
                coreViewModel5 = this.this$0.vm;
                if (coreViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    coreViewModel5 = null;
                }
                RecognizeProcess recognizeProcess3 = coreViewModel5.getRecognizeProcess();
                if (recognizeProcess3 != null) {
                    ResultFragment resultFragment4 = this.this$0;
                    List<CmsName> cmsNames2 = this.$result.getCmsNames();
                    coreViewModel6 = this.this$0.vm;
                    if (coreViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        coreViewModel6 = null;
                    }
                    List<File> compressFiles = coreViewModel6.getCompressFiles();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(compressFiles, 10));
                    Iterator<T> it = compressFiles.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((File) it.next()).getAbsolutePath());
                    }
                    ArrayList arrayList2 = arrayList;
                    coreViewModel7 = this.this$0.vm;
                    if (coreViewModel7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        coreViewModel7 = null;
                    }
                    List<File> originalImageFileList = coreViewModel7.getOriginalImageFileList();
                    List<Long> itemIds = this.$result.getItemIds();
                    Map<String, Object> otherData = this.$result.getOtherData();
                    coreViewModel8 = this.this$0.vm;
                    if (coreViewModel8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                    } else {
                        coreViewModel9 = coreViewModel8;
                    }
                    recognizeProcess3.toNext(resultFragment4, cmsNames2, arrayList2, originalImageFileList, itemIds, otherData, coreViewModel9.getCaptureFrom());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResultFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.ResultFragment$loadData$1$4", f = "ResultFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.android.picturexx.recognize.fragment.ResultFragment$loadData$1$4, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ResultFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ResultFragment resultFragment, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = resultFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoreViewModel coreViewModel;
            CoreViewModel coreViewModel2;
            String str;
            CoreViewModel coreViewModel3;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                coreViewModel = this.this$0.vm;
                CoreViewModel coreViewModel4 = null;
                if (coreViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    coreViewModel = null;
                }
                RecognizeProcess recognizeProcess = coreViewModel.getRecognizeProcess();
                if (recognizeProcess != null) {
                    ResultFragment resultFragment = this.this$0;
                    ResultFragment resultFragment2 = resultFragment;
                    coreViewModel2 = resultFragment.vm;
                    if (coreViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        coreViewModel2 = null;
                    }
                    Uri displayImageUri = coreViewModel2.getDisplayImageUri();
                    if (displayImageUri == null || (str = displayImageUri.toString()) == null) {
                        str = "";
                    }
                    String str2 = str;
                    coreViewModel3 = this.this$0.vm;
                    if (coreViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                    } else {
                        coreViewModel4 = coreViewModel3;
                    }
                    recognizeProcess.showError(resultFragment2, true, true, null, str2, coreViewModel4.getCaptureFrom());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
