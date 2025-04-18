package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import org.objectweb.asm.Opcodes;
import q0.p;
import q0.r;

@e(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {Opcodes.V15, Opcodes.V17}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransformGestureDetectorKt$detectTransformGestures$2 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public float f3587a;

    /* renamed from: b, reason: collision with root package name */
    public float f3588b;

    /* renamed from: c, reason: collision with root package name */
    public float f3589c;
    public long d;

    /* renamed from: f, reason: collision with root package name */
    public int f3590f;

    /* renamed from: g, reason: collision with root package name */
    public int f3591g;

    /* renamed from: h, reason: collision with root package name */
    public int f3592h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3593i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f3594j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f3595k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformGestureDetectorKt$detectTransformGestures$2(boolean z2, r rVar, g gVar) {
        super(gVar);
        this.f3594j = z2;
        this.f3595k = rVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.f3594j, this.f3595k, gVar);
        transformGestureDetectorKt$detectTransformGestures$2.f3593i = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0159, code lost:
    
        if (androidx.compose.ui.geometry.Offset.d(r1, 0) == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0097 -> B:6:0x009a). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
