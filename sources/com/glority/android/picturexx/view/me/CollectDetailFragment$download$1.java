package com.glority.android.picturexx.view.me;

import android.app.Dialog;
import android.graphics.Bitmap;
import com.glority.utils.store.SandboxUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectDetailFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.view.me.CollectDetailFragment$download$1", f = "CollectDetailFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CollectDetailFragment$download$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Dialog $processDialog;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CollectDetailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectDetailFragment$download$1(CollectDetailFragment collectDetailFragment, Dialog dialog, Continuation<? super CollectDetailFragment$download$1> continuation) {
        super(2, continuation);
        this.this$0 = collectDetailFragment;
        this.$processDialog = dialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CollectDetailFragment$download$1 collectDetailFragment$download$1 = new CollectDetailFragment$download$1(this.this$0, this.$processDialog, continuation);
        collectDetailFragment$download$1.L$0 = obj;
        return collectDetailFragment$download$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CollectDetailFragment$download$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0112 A[Catch: Exception -> 0x015b, TryCatch #0 {Exception -> 0x015b, blocks: (B:5:0x0013, B:7:0x0019, B:10:0x001c, B:12:0x002e, B:13:0x0034, B:16:0x003c, B:19:0x0044, B:21:0x004e, B:22:0x0054, B:24:0x0058, B:27:0x0060, B:29:0x0072, B:30:0x0078, B:32:0x0095, B:33:0x009b, B:35:0x00c2, B:37:0x00cb, B:38:0x010c, B:40:0x0112, B:41:0x0118, B:43:0x011e, B:45:0x012a, B:48:0x0140, B:52:0x00d3, B:54:0x00e5, B:56:0x00eb, B:57:0x00f3), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140 A[Catch: Exception -> 0x015b, TRY_LEAVE, TryCatch #0 {Exception -> 0x015b, blocks: (B:5:0x0013, B:7:0x0019, B:10:0x001c, B:12:0x002e, B:13:0x0034, B:16:0x003c, B:19:0x0044, B:21:0x004e, B:22:0x0054, B:24:0x0058, B:27:0x0060, B:29:0x0072, B:30:0x0078, B:32:0x0095, B:33:0x009b, B:35:0x00c2, B:37:0x00cb, B:38:0x010c, B:40:0x0112, B:41:0x0118, B:43:0x011e, B:45:0x012a, B:48:0x0140, B:52:0x00d3, B:54:0x00e5, B:56:0x00eb, B:57:0x00f3), top: B:4:0x0013 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.me.CollectDetailFragment$download$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$5$lambda$4(List list, CoroutineScope coroutineScope, Dialog dialog) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SandboxUtils.saveImage((Bitmap) it.next(), "coinSnap");
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new CollectDetailFragment$download$1$1$5$2(dialog, null), 2, null);
    }
}
