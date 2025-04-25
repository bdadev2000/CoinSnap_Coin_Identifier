package com.glority.android.picturexx.recognize.fragment;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
@DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$analyse$1", f = "CaptureFragment.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, l = {691, 720, 726, 734, 741, 749}, m = "invokeSuspend", n = {"textId", "debugText", "areaProcessStatus", "isReadyToCaptureBefore", "start", "isOk", "textId", "debugText", "areaProcessStatus", "isReadyToCaptureBefore", "start", "isOk", "textId", "debugText", "areaProcessStatus", "isReadyToCaptureBefore", "start", "isOk", "textId", "debugText", "areaProcessStatus", "isReadyToCaptureBefore", "start", "isOk", "textId", "debugText", "areaProcessStatus", "isReadyToCaptureBefore", "start", "isOk"}, s = {"L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1"})
/* loaded from: classes5.dex */
public final class CaptureFragment$analyse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ CaptureFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureFragment$analyse$1(CaptureFragment captureFragment, Bitmap bitmap, Continuation<? super CaptureFragment$analyse$1> continuation) {
        super(2, continuation);
        this.this$0 = captureFragment;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptureFragment$analyse$1(this.this$0, this.$bitmap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CaptureFragment$analyse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f0, code lost:
    
        r0 = r12.getZoomFactorChannel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0333, code lost:
    
        r2 = r12.getZoomFactorChannel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0389, code lost:
    
        r0 = r12.getZoomFactorChannel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019e, code lost:
    
        r0 = r12.getZoomFactorChannel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x029b, code lost:
    
        r2 = r12.getZoomFactorChannel();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0130 A[Catch: Exception -> 0x040d, TryCatch #0 {Exception -> 0x040d, blocks: (B:7:0x0017, B:8:0x040a, B:13:0x0032, B:17:0x03d8, B:22:0x03ee, B:28:0x0050, B:33:0x009b, B:38:0x00a7, B:40:0x00b1, B:43:0x00c3, B:45:0x0106, B:47:0x010c, B:49:0x0114, B:50:0x011a, B:52:0x0122, B:53:0x013d, B:56:0x0160, B:58:0x018e, B:60:0x0198, B:62:0x019e, B:64:0x01a4, B:71:0x01e6, B:75:0x01ee, B:78:0x022c, B:80:0x0262, B:82:0x028f, B:84:0x0295, B:86:0x029b, B:88:0x02a1, B:93:0x0267, B:95:0x026f, B:96:0x0274, B:98:0x0280, B:100:0x0288, B:101:0x02d1, B:103:0x02d5, B:105:0x02dd, B:106:0x02e2, B:108:0x02ea, B:110:0x02f0, B:112:0x02f6, B:115:0x02e0, B:116:0x0315, B:118:0x0319, B:120:0x0321, B:122:0x032d, B:124:0x0333, B:126:0x0339, B:131:0x0374, B:133:0x0379, B:135:0x0383, B:137:0x0389, B:139:0x038f, B:146:0x03c2, B:148:0x03c7, B:150:0x0130), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0409 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122 A[Catch: Exception -> 0x040d, TryCatch #0 {Exception -> 0x040d, blocks: (B:7:0x0017, B:8:0x040a, B:13:0x0032, B:17:0x03d8, B:22:0x03ee, B:28:0x0050, B:33:0x009b, B:38:0x00a7, B:40:0x00b1, B:43:0x00c3, B:45:0x0106, B:47:0x010c, B:49:0x0114, B:50:0x011a, B:52:0x0122, B:53:0x013d, B:56:0x0160, B:58:0x018e, B:60:0x0198, B:62:0x019e, B:64:0x01a4, B:71:0x01e6, B:75:0x01ee, B:78:0x022c, B:80:0x0262, B:82:0x028f, B:84:0x0295, B:86:0x029b, B:88:0x02a1, B:93:0x0267, B:95:0x026f, B:96:0x0274, B:98:0x0280, B:100:0x0288, B:101:0x02d1, B:103:0x02d5, B:105:0x02dd, B:106:0x02e2, B:108:0x02ea, B:110:0x02f0, B:112:0x02f6, B:115:0x02e0, B:116:0x0315, B:118:0x0319, B:120:0x0321, B:122:0x032d, B:124:0x0333, B:126:0x0339, B:131:0x0374, B:133:0x0379, B:135:0x0383, B:137:0x0389, B:139:0x038f, B:146:0x03c2, B:148:0x03c7, B:150:0x0130), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018e A[Catch: Exception -> 0x040d, TryCatch #0 {Exception -> 0x040d, blocks: (B:7:0x0017, B:8:0x040a, B:13:0x0032, B:17:0x03d8, B:22:0x03ee, B:28:0x0050, B:33:0x009b, B:38:0x00a7, B:40:0x00b1, B:43:0x00c3, B:45:0x0106, B:47:0x010c, B:49:0x0114, B:50:0x011a, B:52:0x0122, B:53:0x013d, B:56:0x0160, B:58:0x018e, B:60:0x0198, B:62:0x019e, B:64:0x01a4, B:71:0x01e6, B:75:0x01ee, B:78:0x022c, B:80:0x0262, B:82:0x028f, B:84:0x0295, B:86:0x029b, B:88:0x02a1, B:93:0x0267, B:95:0x026f, B:96:0x0274, B:98:0x0280, B:100:0x0288, B:101:0x02d1, B:103:0x02d5, B:105:0x02dd, B:106:0x02e2, B:108:0x02ea, B:110:0x02f0, B:112:0x02f6, B:115:0x02e0, B:116:0x0315, B:118:0x0319, B:120:0x0321, B:122:0x032d, B:124:0x0333, B:126:0x0339, B:131:0x0374, B:133:0x0379, B:135:0x0383, B:137:0x0389, B:139:0x038f, B:146:0x03c2, B:148:0x03c7, B:150:0x0130), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e6 A[Catch: Exception -> 0x040d, TryCatch #0 {Exception -> 0x040d, blocks: (B:7:0x0017, B:8:0x040a, B:13:0x0032, B:17:0x03d8, B:22:0x03ee, B:28:0x0050, B:33:0x009b, B:38:0x00a7, B:40:0x00b1, B:43:0x00c3, B:45:0x0106, B:47:0x010c, B:49:0x0114, B:50:0x011a, B:52:0x0122, B:53:0x013d, B:56:0x0160, B:58:0x018e, B:60:0x0198, B:62:0x019e, B:64:0x01a4, B:71:0x01e6, B:75:0x01ee, B:78:0x022c, B:80:0x0262, B:82:0x028f, B:84:0x0295, B:86:0x029b, B:88:0x02a1, B:93:0x0267, B:95:0x026f, B:96:0x0274, B:98:0x0280, B:100:0x0288, B:101:0x02d1, B:103:0x02d5, B:105:0x02dd, B:106:0x02e2, B:108:0x02ea, B:110:0x02f0, B:112:0x02f6, B:115:0x02e0, B:116:0x0315, B:118:0x0319, B:120:0x0321, B:122:0x032d, B:124:0x0333, B:126:0x0339, B:131:0x0374, B:133:0x0379, B:135:0x0383, B:137:0x0389, B:139:0x038f, B:146:0x03c2, B:148:0x03c7, B:150:0x0130), top: B:2:0x000c }] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.recognize.fragment.CaptureFragment$analyse$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
