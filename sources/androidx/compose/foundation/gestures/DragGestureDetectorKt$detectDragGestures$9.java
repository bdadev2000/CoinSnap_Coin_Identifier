package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import kotlin.jvm.internal.e0;
import q0.a;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9", f = "DragGestureDetector.kt", l = {247, 253, 972, 1014, 1025}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DragGestureDetectorKt$detectDragGestures$9 extends h implements p {

    /* renamed from: a, reason: collision with root package name */
    public Object f3232a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3233b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3234c;
    public e0 d;

    /* renamed from: f, reason: collision with root package name */
    public Object f3235f;

    /* renamed from: g, reason: collision with root package name */
    public PointerInputChange f3236g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3237h;

    /* renamed from: i, reason: collision with root package name */
    public float f3238i;

    /* renamed from: j, reason: collision with root package name */
    public int f3239j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3240k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f3241l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f3242m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Orientation f3243n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f3244o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f3245p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a f3246q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f3247r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$9(a aVar, e0 e0Var, Orientation orientation, q qVar, p pVar, a aVar2, l lVar, g gVar) {
        super(gVar);
        this.f3241l = aVar;
        this.f3242m = e0Var;
        this.f3243n = orientation;
        this.f3244o = qVar;
        this.f3245p = pVar;
        this.f3246q = aVar2;
        this.f3247r = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        DragGestureDetectorKt$detectDragGestures$9 dragGestureDetectorKt$detectDragGestures$9 = new DragGestureDetectorKt$detectDragGestures$9(this.f3241l, this.f3242m, this.f3243n, this.f3244o, this.f3245p, this.f3246q, this.f3247r, gVar);
        dragGestureDetectorKt$detectDragGestures$9.f3240k = obj;
        return dragGestureDetectorKt$detectDragGestures$9;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$detectDragGestures$9) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:38:0x02c3, B:51:0x02ea], limit reached: 148 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0286 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0184  */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0201 -> B:67:0x0208). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0284 -> B:9:0x0287). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x017b -> B:70:0x0181). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
