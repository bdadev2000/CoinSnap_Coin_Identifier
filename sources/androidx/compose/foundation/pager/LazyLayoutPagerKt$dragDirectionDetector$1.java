package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1", f = "LazyLayoutPager.kt", l = {284}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LazyLayoutPagerKt$dragDirectionDetector$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5108a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PagerState f5110c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {285}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f5111a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f5112b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PagerState f5113c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {287, 291}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public final class C00191 extends h implements p {

            /* renamed from: a, reason: collision with root package name */
            public PointerInputChange f5114a;

            /* renamed from: b, reason: collision with root package name */
            public PointerInputChange f5115b;

            /* renamed from: c, reason: collision with root package name */
            public int f5116c;
            public /* synthetic */ Object d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ PagerState f5117f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00191(PagerState pagerState, g gVar) {
                super(gVar);
                this.f5117f = pagerState;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                C00191 c00191 = new C00191(this.f5117f, gVar);
                c00191.d = obj;
                return c00191;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00191) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x007e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:6:0x0073). Please report as a decompilation issue!!! */
            @Override // j0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 188
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1.C00191.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, PagerState pagerState, g gVar) {
            super(2, gVar);
            this.f5112b = pointerInputScope;
            this.f5113c = pagerState;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f5112b, this.f5113c, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f5111a;
            if (i2 == 0) {
                q.m(obj);
                C00191 c00191 = new C00191(this.f5113c, null);
                this.f5111a = 1;
                if (ForEachGestureKt.b(this.f5112b, c00191, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$dragDirectionDetector$1(PagerState pagerState, g gVar) {
        super(2, gVar);
        this.f5110c = pagerState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        LazyLayoutPagerKt$dragDirectionDetector$1 lazyLayoutPagerKt$dragDirectionDetector$1 = new LazyLayoutPagerKt$dragDirectionDetector$1(this.f5110c, gVar);
        lazyLayoutPagerKt$dragDirectionDetector$1.f5109b = obj;
        return lazyLayoutPagerKt$dragDirectionDetector$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutPagerKt$dragDirectionDetector$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f5108a;
        if (i2 == 0) {
            q.m(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.f5109b, this.f5110c, null);
            this.f5108a = 1;
            if (p0.a.J(anonymousClass1, this) == aVar) {
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
