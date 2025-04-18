package androidx.compose.foundation;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {380, 384}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MagnifierNode$onAttach$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MagnifierNode f2782b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.MagnifierNode$onAttach$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f2783a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$onAttach$1(MagnifierNode magnifierNode, g gVar) {
        super(2, gVar);
        this.f2782b = magnifierNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new MagnifierNode$onAttach$1(this.f2782b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((MagnifierNode$onAttach$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:8:0x0022). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004c -> B:6:0x004f). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r6.f2781a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.jvm.internal.q.m(r7)
            r7 = r6
            goto L4f
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.jvm.internal.q.m(r7)
            r7 = r6
            goto L31
        L1e:
            kotlin.jvm.internal.q.m(r7)
            r7 = r6
        L22:
            androidx.compose.foundation.MagnifierNode r1 = r7.f2782b
            d1.b r1 = r1.F
            if (r1 == 0) goto L31
            r7.f2781a = r3
            java.lang.Object r1 = r1.g(r7)
            if (r1 != r0) goto L31
            return r0
        L31:
            androidx.compose.foundation.MagnifierNode r1 = r7.f2782b
            androidx.compose.foundation.PlatformMagnifier r1 = r1.A
            if (r1 == 0) goto L22
            androidx.compose.foundation.MagnifierNode$onAttach$1$1 r1 = androidx.compose.foundation.MagnifierNode$onAttach$1.AnonymousClass1.f2783a
            r7.f2781a = r2
            h0.l r4 = r7.getContext()
            androidx.compose.runtime.MonotonicFrameClock r4 = androidx.compose.runtime.MonotonicFrameClockKt.a(r4)
            androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2 r5 = new androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2
            r5.<init>(r1)
            java.lang.Object r1 = r4.b0(r5, r7)
            if (r1 != r0) goto L4f
            return r0
        L4f:
            androidx.compose.foundation.MagnifierNode r1 = r7.f2782b
            androidx.compose.foundation.PlatformMagnifier r1 = r1.A
            if (r1 == 0) goto L22
            r1.c()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
