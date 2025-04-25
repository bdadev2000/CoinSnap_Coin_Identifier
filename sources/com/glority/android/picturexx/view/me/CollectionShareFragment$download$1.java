package com.glority.android.picturexx.view.me;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.FutureTarget;
import com.glority.android.core.app.AppContext;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.utils.permission.Permission;
import com.glority.utils.permission.PermissionUtils;
import com.glority.utils.permission.callback.OnGetPermissionCallback;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.store.SandboxUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CollectionShareFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectionShareFragment$download$1", f = "CollectionShareFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CollectionShareFragment$download$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Dialog $processDialog;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CollectionShareFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionShareFragment$download$1(CollectionShareFragment collectionShareFragment, Dialog dialog, Continuation<? super CollectionShareFragment$download$1> continuation) {
        super(2, continuation);
        this.this$0 = collectionShareFragment;
        this.$processDialog = dialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CollectionShareFragment$download$1 collectionShareFragment$download$1 = new CollectionShareFragment$download$1(this.this$0, this.$processDialog, continuation);
        collectionShareFragment$download$1.L$0 = obj;
        return collectionShareFragment$download$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CollectionShareFragment$download$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        final Bitmap drawDownloadBitmap;
        final Bitmap drawDownloadBitmap2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CollectionShareFragment collectionShareFragment = this.this$0;
        final Dialog dialog = this.$processDialog;
        try {
            context = collectionShareFragment.getContext();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        if (context == null) {
            return Unit.INSTANCE;
        }
        FutureTarget<Bitmap> submit = Glide.with(context).asBitmap().load(collectionShareFragment.getSubjectSideUrl()).submit();
        Intrinsics.checkNotNullExpressionValue(submit, "submit(...)");
        FutureTarget<Bitmap> submit2 = Glide.with(context).asBitmap().load(collectionShareFragment.getDenominationSideUrl()).submit();
        Intrinsics.checkNotNullExpressionValue(submit2, "submit(...)");
        Bitmap bitmap = submit.get();
        Intrinsics.checkNotNullExpressionValue(bitmap, "get(...)");
        drawDownloadBitmap = collectionShareFragment.drawDownloadBitmap(bitmap);
        Bitmap bitmap2 = submit2.get();
        Intrinsics.checkNotNullExpressionValue(bitmap2, "get(...)");
        drawDownloadBitmap2 = collectionShareFragment.drawDownloadBitmap(bitmap2);
        if (Build.VERSION.SDK_INT >= 29) {
            SandboxUtils.saveImage(drawDownloadBitmap, "coinSnap");
            SandboxUtils.saveImage(drawDownloadBitmap2, "coinSnap");
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new CollectionShareFragment$download$1$1$1(dialog, null), 2, null);
        } else {
            FragmentActivity requireActivity = collectionShareFragment.requireActivity();
            Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
            PermissionUtils.checkPermission((RuntimePermissionActivity) requireActivity, Permission.STORAGE, new OnGetPermissionCallback() { // from class: com.glority.android.picturexx.view.me.CollectionShareFragment$download$1$$ExternalSyntheticLambda0
                @Override // com.glority.utils.permission.callback.OnGetPermissionCallback
                public final void onGetPermission() {
                    CollectionShareFragment$download$1.invokeSuspend$lambda$1$lambda$0(drawDownloadBitmap, drawDownloadBitmap2, coroutineScope, dialog);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$lambda$0(Bitmap bitmap, Bitmap bitmap2, CoroutineScope coroutineScope, Dialog dialog) {
        SandboxUtils.saveImage(bitmap, "coinSnap");
        SandboxUtils.saveImage(bitmap2, "coinSnap");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new CollectionShareFragment$download$1$1$2$1(dialog, null), 2, null);
    }
}
