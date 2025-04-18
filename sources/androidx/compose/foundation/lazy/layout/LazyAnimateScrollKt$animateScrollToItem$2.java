package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", l = {Opcodes.FRETURN, 272}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LazyAnimateScrollKt$animateScrollToItem$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public b0 f4665a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f4666b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f4667c;
    public float d;

    /* renamed from: f, reason: collision with root package name */
    public float f4668f;

    /* renamed from: g, reason: collision with root package name */
    public float f4669g;

    /* renamed from: h, reason: collision with root package name */
    public int f4670h;

    /* renamed from: i, reason: collision with root package name */
    public int f4671i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4672j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4673k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Density f4674l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutAnimateScrollScope f4675m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4676n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4677o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass3 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutAnimateScrollScope f4678a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4679b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f4680c;
        public final /* synthetic */ c0 d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f4681f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b0 f4682g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f4683h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ float f4684i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d0 f4685j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f4686k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f4687l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f0 f4688m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, float f2, c0 c0Var, ScrollScope scrollScope, b0 b0Var, boolean z2, float f3, d0 d0Var, int i3, int i4, f0 f0Var) {
            super(1);
            this.f4678a = lazyLayoutAnimateScrollScope;
            this.f4679b = i2;
            this.f4680c = f2;
            this.d = c0Var;
            this.f4681f = scrollScope;
            this.f4682g = b0Var;
            this.f4683h = z2;
            this.f4684i = f3;
            this.f4685j = d0Var;
            this.f4686k = i3;
            this.f4687l = i4;
            this.f4688m = f0Var;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            AnimationScope animationScope = (AnimationScope) obj;
            LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope = this.f4678a;
            int i2 = this.f4679b;
            boolean b2 = LazyAnimateScrollKt.b(lazyLayoutAnimateScrollScope, i2);
            b0 b0Var = this.f4682g;
            int i3 = this.f4687l;
            boolean z2 = this.f4683h;
            if (!b2) {
                float f2 = this.f4680c;
                float x = f2 > 0.0f ? a.x(((Number) animationScope.e.getValue()).floatValue(), f2) : a.v(((Number) animationScope.e.getValue()).floatValue(), f2);
                c0 c0Var = this.d;
                float f3 = x - c0Var.f30922a;
                float a2 = this.f4681f.a(f3);
                if (!LazyAnimateScrollKt.b(lazyLayoutAnimateScrollScope, i2) && !LazyAnimateScrollKt$animateScrollToItem$2.c(z2, lazyLayoutAnimateScrollScope, i2, i3)) {
                    if (f3 != a2) {
                        animationScope.a();
                        b0Var.f30919a = false;
                        return d0.b0.f30125a;
                    }
                    c0Var.f30922a += f3;
                    float f4 = this.f4684i;
                    if (z2) {
                        if (((Number) animationScope.e.getValue()).floatValue() > f4) {
                            animationScope.a();
                        }
                    } else if (((Number) animationScope.e.getValue()).floatValue() < (-f4)) {
                        animationScope.a();
                    }
                    int i4 = this.f4686k;
                    d0 d0Var = this.f4685j;
                    if (z2) {
                        if (d0Var.f30925a >= 2 && i2 - lazyLayoutAnimateScrollScope.a() > i4) {
                            lazyLayoutAnimateScrollScope.b(i2 - i4, 0);
                        }
                    } else if (d0Var.f30925a >= 2 && lazyLayoutAnimateScrollScope.e() - i2 > i4) {
                        lazyLayoutAnimateScrollScope.b(i4 + i2, 0);
                    }
                }
            }
            if (LazyAnimateScrollKt$animateScrollToItem$2.c(z2, lazyLayoutAnimateScrollScope, i2, i3)) {
                lazyLayoutAnimateScrollScope.b(i2, i3);
                b0Var.f30919a = false;
                animationScope.a();
            } else if (LazyAnimateScrollKt.b(lazyLayoutAnimateScrollScope, i2)) {
                throw new ItemFoundInScroll(a.t0(lazyLayoutAnimateScrollScope.c(i2)), (AnimationState) this.f4688m.f30930a);
            }
            return d0.b0.f30125a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass5 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f4689a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f4690b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ScrollScope f4691c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(float f2, c0 c0Var, ScrollScope scrollScope) {
            super(1);
            this.f4689a = f2;
            this.f4690b = c0Var;
            this.f4691c = scrollScope;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            AnimationScope animationScope = (AnimationScope) obj;
            float f2 = this.f4689a;
            float f3 = 0.0f;
            if (f2 > 0.0f) {
                f3 = a.x(((Number) animationScope.e.getValue()).floatValue(), f2);
            } else if (f2 < 0.0f) {
                f3 = a.v(((Number) animationScope.e.getValue()).floatValue(), f2);
            }
            c0 c0Var = this.f4690b;
            float f4 = f3 - c0Var.f30922a;
            if (f4 != this.f4691c.a(f4) || f3 != ((Number) animationScope.e.getValue()).floatValue()) {
                animationScope.a();
            }
            c0Var.f30922a += f4;
            return d0.b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyAnimateScrollKt$animateScrollToItem$2(int i2, int i3, int i4, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, Density density, g gVar) {
        super(2, gVar);
        this.f4673k = i2;
        this.f4674l = density;
        this.f4675m = lazyLayoutAnimateScrollScope;
        this.f4676n = i3;
        this.f4677o = i4;
    }

    public static final boolean c(boolean z2, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, int i3) {
        if (z2) {
            if (lazyLayoutAnimateScrollScope.e() <= i2 && (lazyLayoutAnimateScrollScope.e() != i2 || lazyLayoutAnimateScrollScope.d() <= i3)) {
                return false;
            }
        } else if (lazyLayoutAnimateScrollScope.e() >= i2 && (lazyLayoutAnimateScrollScope.e() != i2 || lazyLayoutAnimateScrollScope.d() >= i3)) {
            return false;
        }
        return true;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        int i2 = this.f4673k;
        Density density = this.f4674l;
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(i2, this.f4676n, this.f4677o, this.f4675m, density, gVar);
        lazyAnimateScrollKt$animateScrollToItem$2.f4672j = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) create((ScrollScope) obj, (g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4  */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.jvm.internal.c0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0161 -> B:16:0x0168). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
