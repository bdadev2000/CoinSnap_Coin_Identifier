package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MonotonicFrameClockKt$withFrameMillis$2;
import androidx.compose.ui.platform.PlatformTextInputSession;
import b1.d0;
import d0.b0;
import e1.l0;
import e1.s0;
import h0.g;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@j0.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {Opcodes.LSHR}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6322a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f6324c;
    public final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode f6325f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @j0.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {Opcodes.I2C}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f6326a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6327b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PlatformTextInputSession f6328c;
        public final /* synthetic */ l d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter f6329f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode f6330g;

        /* JADX INFO: Access modifiers changed from: package-private */
        @j0.e(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {Opcodes.L2F, Opcodes.L2D}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C00261 extends i implements p {

            /* renamed from: a, reason: collision with root package name */
            public int f6331a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter f6332b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InputMethodManager f6333c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public final class C00271 extends r implements l {

                /* renamed from: a, reason: collision with root package name */
                public static final C00271 f6334a = new r(1);

                @Override // q0.l
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    ((Number) obj).longValue();
                    return b0.f30125a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00261(AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, InputMethodManager inputMethodManager, g gVar) {
                super(2, gVar);
                this.f6332b = androidLegacyPlatformTextInputServiceAdapter;
                this.f6333c = inputMethodManager;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                return new C00261(this.f6332b, this.f6333c, gVar);
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00261) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            public final Object invokeSuspend(Object obj) {
                i0.a aVar = i0.a.f30806a;
                int i2 = this.f6331a;
                if (i2 == 0) {
                    q.m(obj);
                    C00271 c00271 = C00271.f6334a;
                    this.f6331a = 1;
                    if (MonotonicFrameClockKt.a(getContext()).b0(new MonotonicFrameClockKt$withFrameMillis$2(c00271), this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q.m(obj);
                        throw new RuntimeException();
                    }
                    q.m(obj);
                }
                l0 k2 = this.f6332b.k();
                if (k2 == null) {
                    return b0.f30125a;
                }
                final InputMethodManager inputMethodManager = this.f6333c;
                e1.i iVar = new e1.i() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.startInput.2.1.1.2
                    @Override // e1.i
                    public final Object emit(Object obj2, g gVar) {
                        InputMethodManager.this.e();
                        return b0.f30125a;
                    }
                };
                this.f6331a = 2;
                if (s0.i((s0) k2, iVar, this) == aVar) {
                    return aVar;
                }
                throw new RuntimeException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlatformTextInputSession platformTextInputSession, l lVar, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, g gVar) {
            super(2, gVar);
            this.f6328c = platformTextInputSession;
            this.d = lVar;
            this.f6329f = androidLegacyPlatformTextInputServiceAdapter;
            this.f6330g = legacyPlatformTextInputNode;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6328c, this.d, this.f6329f, this.f6330g, gVar);
            anonymousClass1.f6327b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            return i0.a.f30806a;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f6326a;
            AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter = this.f6329f;
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                    throw new RuntimeException();
                }
                q.m(obj);
                d0 d0Var = (d0) this.f6327b;
                l lVar = LegacyPlatformTextInputServiceAdapter_androidKt.f6447a;
                PlatformTextInputSession platformTextInputSession = this.f6328c;
                InputMethodManager inputMethodManager = (InputMethodManager) ((LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1) lVar).invoke(platformTextInputSession.getView());
                LegacyTextInputMethodRequest legacyTextInputMethodRequest = new LegacyTextInputMethodRequest(platformTextInputSession.getView(), new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.f6330g), inputMethodManager);
                if (StylusHandwriting_androidKt.f6290a) {
                    kotlin.jvm.internal.e.v(d0Var, null, 0, new C00261(androidLegacyPlatformTextInputServiceAdapter, inputMethodManager, null), 3);
                }
                l lVar2 = this.d;
                if (lVar2 != null) {
                    lVar2.invoke(legacyTextInputMethodRequest);
                }
                androidLegacyPlatformTextInputServiceAdapter.f6317c = legacyTextInputMethodRequest;
                this.f6326a = 1;
                platformTextInputSession.a(legacyTextInputMethodRequest, this);
                return aVar;
            } catch (Throwable th) {
                androidLegacyPlatformTextInputServiceAdapter.f6317c = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(l lVar, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, g gVar) {
        super(2, gVar);
        this.f6324c = lVar;
        this.d = androidLegacyPlatformTextInputServiceAdapter;
        this.f6325f = legacyPlatformTextInputNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.f6324c, this.d, this.f6325f, gVar);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.f6323b = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((AndroidLegacyPlatformTextInputServiceAdapter$startInput$2) create((PlatformTextInputSession) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6322a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PlatformTextInputSession) this.f6323b, this.f6324c, this.d, this.f6325f, null);
            this.f6322a = 1;
            if (p0.a.J(anonymousClass1, this) == aVar) {
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
