package com.glority.base.manager;

import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppInstallQueryManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.base.manager.AppInstallQueryManager$queryAppIsInstalled$1", f = "AppInstallQueryManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppInstallQueryManager$queryAppIsInstalled$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needReportLog;
    final /* synthetic */ Function1<Set<String>, Unit> $onResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppInstallQueryManager$queryAppIsInstalled$1(boolean z, Function1<? super Set<String>, Unit> function1, Continuation<? super AppInstallQueryManager$queryAppIsInstalled$1> continuation) {
        super(2, continuation);
        this.$needReportLog = z;
        this.$onResult = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppInstallQueryManager$queryAppIsInstalled$1 appInstallQueryManager$queryAppIsInstalled$1 = new AppInstallQueryManager$queryAppIsInstalled$1(this.$needReportLog, this.$onResult, continuation);
        appInstallQueryManager$queryAppIsInstalled$1.L$0 = obj;
        return appInstallQueryManager$queryAppIsInstalled$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppInstallQueryManager$queryAppIsInstalled$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set<String> queryRemoteNameList;
        boolean queryAppIsInstalled;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        HashSet hashSet = new HashSet();
        queryRemoteNameList = AppInstallQueryManager.INSTANCE.queryRemoteNameList();
        for (String str : queryRemoteNameList) {
            queryAppIsInstalled = AppInstallQueryManager.INSTANCE.queryAppIsInstalled(str);
            if (queryAppIsInstalled) {
                hashSet.add(str);
            }
        }
        if (this.$needReportLog) {
            HashSet hashSet2 = hashSet;
            HashSet hashSet3 = hashSet;
            AppInstallQueryManager.INSTANCE.cacheFirstInstallState(hashSet2, SetsKt.minus(queryRemoteNameList, (Iterable) hashSet3));
            AppInstallQueryManager.INSTANCE.diffReport(hashSet2, SetsKt.minus(queryRemoteNameList, (Iterable) hashSet3));
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new AnonymousClass2(this.$onResult, hashSet, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInstallQueryManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
    @DebugMetadata(c = "com.glority.base.manager.AppInstallQueryManager$queryAppIsInstalled$1$2", f = "AppInstallQueryManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.glority.base.manager.AppInstallQueryManager$queryAppIsInstalled$1$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Set<String>, Unit> $onResult;
        final /* synthetic */ HashSet<String> $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super Set<String>, Unit> function1, HashSet<String> hashSet, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onResult = function1;
            this.$result = hashSet;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$onResult, this.$result, continuation);
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
            Function1<Set<String>, Unit> function1 = this.$onResult;
            if (function1 != null) {
                function1.invoke(this.$result);
            }
            return Unit.INSTANCE;
        }
    }
}
