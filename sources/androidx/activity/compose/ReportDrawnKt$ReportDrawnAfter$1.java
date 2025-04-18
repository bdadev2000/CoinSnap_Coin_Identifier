package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@e(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1", f = "ReportDrawn.kt", l = {Opcodes.INVOKEVIRTUAL}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ReportDrawnKt$ReportDrawnAfter$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public FullyDrawnReporter f254a;

    /* renamed from: b, reason: collision with root package name */
    public int f255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FullyDrawnReporter f256c;
    public final /* synthetic */ l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$1(FullyDrawnReporter fullyDrawnReporter, l lVar, g gVar) {
        super(2, gVar);
        this.f256c = fullyDrawnReporter;
        this.d = lVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ReportDrawnKt$ReportDrawnAfter$1(this.f256c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ReportDrawnKt$ReportDrawnAfter$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        FullyDrawnReporter fullyDrawnReporter;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f255b;
        if (i2 == 0) {
            q.m(obj);
            l lVar = this.d;
            FullyDrawnReporter fullyDrawnReporter2 = this.f256c;
            synchronized (fullyDrawnReporter2.f156c) {
                if (!fullyDrawnReporter2.f157f) {
                    fullyDrawnReporter2.d++;
                }
            }
            synchronized (fullyDrawnReporter2.f156c) {
                z2 = fullyDrawnReporter2.f157f;
            }
            if (!z2) {
                try {
                    this.f254a = fullyDrawnReporter2;
                    this.f255b = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                    fullyDrawnReporter = fullyDrawnReporter2;
                } catch (Throwable th) {
                    th = th;
                    fullyDrawnReporter = fullyDrawnReporter2;
                    fullyDrawnReporter.b();
                    throw th;
                }
            }
            return b0.f30125a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fullyDrawnReporter = this.f254a;
        try {
            q.m(obj);
        } catch (Throwable th2) {
            th = th2;
            fullyDrawnReporter.b();
            throw th;
        }
        fullyDrawnReporter.b();
        return b0.f30125a;
    }
}
