package com.glority.android.picturexx.composable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CorrectResultComposables.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.composable.CorrectResultComposablesKt$CorrectResultScreen$1", f = "CorrectResultComposables.kt", i = {}, l = {93, 95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class CorrectResultComposablesKt$CorrectResultScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateList<T> $dataList;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ Function2<String, Continuation<? super List<? extends T>>, Object> $onSearchResult;
    final /* synthetic */ MutableState<String> $searchText$delegate;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CorrectResultComposablesKt$CorrectResultScreen$1(SnapshotStateList<T> snapshotStateList, Function2<? super String, ? super Continuation<? super List<? extends T>>, ? extends Object> function2, MutableState<String> mutableState, MutableState<Boolean> mutableState2, Continuation<? super CorrectResultComposablesKt$CorrectResultScreen$1> continuation) {
        super(2, continuation);
        this.$dataList = snapshotStateList;
        this.$onSearchResult = function2;
        this.$searchText$delegate = mutableState;
        this.$isLoading$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CorrectResultComposablesKt$CorrectResultScreen$1(this.$dataList, this.$onSearchResult, this.$searchText$delegate, this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CorrectResultComposablesKt$CorrectResultScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String CorrectResultScreen$lambda$4;
        String CorrectResultScreen$lambda$42;
        SnapshotStateList snapshotStateList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CorrectResultScreen$lambda$4 = CorrectResultComposablesKt.CorrectResultScreen$lambda$4(this.$searchText$delegate);
            if (StringsKt.trim((CharSequence) CorrectResultScreen$lambda$4).toString().length() == 0) {
                this.$dataList.clear();
                CorrectResultComposablesKt.CorrectResultScreen$lambda$2(this.$isLoading$delegate, false);
                return Unit.INSTANCE;
            }
            this.$dataList.clear();
            CorrectResultComposablesKt.CorrectResultScreen$lambda$2(this.$isLoading$delegate, true);
            this.label = 1;
            if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                snapshotStateList = (SnapshotStateList) this.L$0;
                ResultKt.throwOnFailure(obj);
                snapshotStateList.addAll((Collection) obj);
                CorrectResultComposablesKt.CorrectResultScreen$lambda$2(this.$isLoading$delegate, false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        SnapshotStateList snapshotStateList2 = this.$dataList;
        Function2<String, Continuation<? super List<? extends T>>, Object> function2 = this.$onSearchResult;
        CorrectResultScreen$lambda$42 = CorrectResultComposablesKt.CorrectResultScreen$lambda$4(this.$searchText$delegate);
        this.L$0 = snapshotStateList2;
        this.label = 2;
        Object invoke = function2.invoke(CorrectResultScreen$lambda$42, this);
        if (invoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        snapshotStateList = snapshotStateList2;
        obj = invoke;
        snapshotStateList.addAll((Collection) obj);
        CorrectResultComposablesKt.CorrectResultScreen$lambda$2(this.$isLoading$delegate, false);
        return Unit.INSTANCE;
    }
}
