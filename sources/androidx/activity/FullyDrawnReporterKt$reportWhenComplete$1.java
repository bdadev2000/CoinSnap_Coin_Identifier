package androidx.activity;

import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;

@j0.e(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", l = {Opcodes.INVOKEINTERFACE}, m = "reportWhenComplete")
/* loaded from: classes3.dex */
final class FullyDrawnReporterKt$reportWhenComplete$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160a;

    /* renamed from: b, reason: collision with root package name */
    public int f161b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [j0.c] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        FullyDrawnReporterKt$reportWhenComplete$1 fullyDrawnReporterKt$reportWhenComplete$1;
        this.f160a = obj;
        int i2 = this.f161b | Integer.MIN_VALUE;
        this.f161b = i2;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f161b = i2 - Integer.MIN_VALUE;
            fullyDrawnReporterKt$reportWhenComplete$1 = this;
        } else {
            fullyDrawnReporterKt$reportWhenComplete$1 = new j0.c(this);
        }
        Object obj2 = fullyDrawnReporterKt$reportWhenComplete$1.f160a;
        i0.a aVar = i0.a.f30806a;
        int i3 = fullyDrawnReporterKt$reportWhenComplete$1.f161b;
        if (i3 == 0) {
            q.m(obj2);
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj2);
        throw null;
    }
}
