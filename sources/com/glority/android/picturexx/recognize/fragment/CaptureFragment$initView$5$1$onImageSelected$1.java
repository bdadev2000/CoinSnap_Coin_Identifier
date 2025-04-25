package com.glority.android.picturexx.recognize.fragment;

import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.recognize.vm.CoreViewModel;
import com.glority.utils.stability.LogUtils;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$5$1$onImageSelected$1", f = "CaptureFragment.kt", i = {}, l = {496}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CaptureFragment$initView$5$1$onImageSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Uri> $uris;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CaptureFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CaptureFragment$initView$5$1$onImageSelected$1(List<? extends Uri> list, CaptureFragment captureFragment, Continuation<? super CaptureFragment$initView$5$1$onImageSelected$1> continuation) {
        super(2, continuation);
        this.$uris = list;
        this.this$0 = captureFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptureFragment$initView$5$1$onImageSelected$1(this.$uris, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CaptureFragment$initView$5$1$onImageSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CaptureFragment captureFragment;
        Iterator it;
        CoreViewModel vm;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<Uri> list = this.$uris;
                captureFragment = this.this$0;
                it = list.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                captureFragment = (CaptureFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                File file = Glide.with(captureFragment).asFile().load((Uri) it.next()).submit().get();
                if (file != null) {
                    vm = captureFragment.getVm();
                    vm.addOriginalImageFile(file);
                }
                this.L$0 = captureFragment;
                this.L$1 = it;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        return Unit.INSTANCE;
    }
}
