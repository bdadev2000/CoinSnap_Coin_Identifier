package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import d0.b0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {244}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f16417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChainedPlatformTextInputInterceptor f16418b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlatformTextInputMethodRequest f16419c;
    public final /* synthetic */ PlatformTextInputSessionScope d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ChainedPlatformTextInputInterceptor f16420a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
            super(0);
            this.f16420a = chainedPlatformTextInputInterceptor;
        }

        @Override // q0.a
        public final Object invoke() {
            return (PlatformTextInputInterceptor) this.f16420a.f16403b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @j0.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {245}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 extends j0.i implements q0.p {

        /* renamed from: a, reason: collision with root package name */
        public int f16421a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f16422b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PlatformTextInputMethodRequest f16423c;
        public final /* synthetic */ PlatformTextInputSessionScope d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSessionScope platformTextInputSessionScope, h0.g gVar) {
            super(2, gVar);
            this.f16423c = platformTextInputMethodRequest;
            this.d = platformTextInputSessionScope;
        }

        @Override // j0.a
        public final h0.g create(Object obj, h0.g gVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f16423c, this.d, gVar);
            anonymousClass2.f16422b = obj;
            return anonymousClass2;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass2) create((PlatformTextInputInterceptor) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
            return i0.a.f30806a;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f16421a;
            if (i2 == 0) {
                q.m(obj);
                PlatformTextInputInterceptor platformTextInputInterceptor = (PlatformTextInputInterceptor) this.f16422b;
                this.f16421a = 1;
                if (platformTextInputInterceptor.a() == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, PlatformTextInputMethodRequest platformTextInputMethodRequest, PlatformTextInputSessionScope platformTextInputSessionScope, h0.g gVar) {
        super(2, gVar);
        this.f16418b = chainedPlatformTextInputInterceptor;
        this.f16419c = platformTextInputMethodRequest;
        this.d = platformTextInputSessionScope;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.f16418b, this.f16419c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3) create((b0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16417a;
        if (i2 == 0) {
            q.m(obj);
            e1.j l2 = SnapshotStateKt.l(new AnonymousClass1(this.f16418b));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f16419c, this.d, null);
            this.f16417a = 1;
            if (p0.a.D(l2, anonymousClass2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        throw new IllegalStateException("Interceptors flow should never terminate.".toString());
    }
}
