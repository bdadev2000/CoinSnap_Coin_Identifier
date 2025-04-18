package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import b1.d0;
import d0.b0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;

@j0.e(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WindowInfoKt$WindowFocusObserver$1$1 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f16647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WindowInfo f16648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f16649c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WindowInfo f16650a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WindowInfo windowInfo) {
            super(0);
            this.f16650a = windowInfo;
        }

        @Override // q0.a
        public final Object invoke() {
            return Boolean.valueOf(this.f16650a.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoKt$WindowFocusObserver$1$1(WindowInfo windowInfo, State state, h0.g gVar) {
        super(2, gVar);
        this.f16648b = windowInfo;
        this.f16649c = state;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.f16648b, this.f16649c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16647a;
        if (i2 == 0) {
            q.m(obj);
            e1.j l2 = SnapshotStateKt.l(new AnonymousClass1(this.f16648b));
            final State state = this.f16649c;
            e1.i iVar = new e1.i() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.2
                @Override // e1.i
                public final Object emit(Object obj2, h0.g gVar) {
                    ((q0.l) State.this.getValue()).invoke(Boolean.valueOf(((Boolean) obj2).booleanValue()));
                    return b0.f30125a;
                }
            };
            this.f16647a = 1;
            if (l2.collect(iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
