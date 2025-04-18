package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import b1.d0;
import b1.h1;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {196}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ContentInViewNode$launchAnimation$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f3118a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentInViewNode f3120c;
    public final /* synthetic */ UpdatableAnimationState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BringIntoViewSpec f3121f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {201}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f3122a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3123b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UpdatableAnimationState f3124c;
        public final /* synthetic */ ContentInViewNode d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ BringIntoViewSpec f3125f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ h1 f3126g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C00111 extends r implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ContentInViewNode f3127a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h1 f3128b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ NestedScrollScope f3129c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00111(ContentInViewNode contentInViewNode, h1 h1Var, NestedScrollScope nestedScrollScope) {
                super(1);
                this.f3127a = contentInViewNode;
                this.f3128b = h1Var;
                this.f3129c = nestedScrollScope;
            }

            @Override // q0.l
            public final Object invoke(Object obj) {
                float floatValue = ((Number) obj).floatValue();
                ContentInViewNode contentInViewNode = this.f3127a;
                float f2 = contentInViewNode.f3110q ? 1.0f : -1.0f;
                ScrollingLogic scrollingLogic = contentInViewNode.f3109p;
                float f3 = scrollingLogic.f(scrollingLogic.d(this.f3129c.a(scrollingLogic.d(scrollingLogic.g(f2 * floatValue))))) * f2;
                if (Math.abs(f3) < Math.abs(floatValue)) {
                    this.f3128b.a(kotlin.jvm.internal.e.a("Scroll animation cancelled because scroll was not consumed (" + f3 + " < " + floatValue + ')', null));
                }
                return b0.f30125a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        public final class AnonymousClass2 extends r implements a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ContentInViewNode f3130a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpdatableAnimationState f3131b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BringIntoViewSpec f3132c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec) {
                super(0);
                this.f3130a = contentInViewNode;
                this.f3131b = updatableAnimationState;
                this.f3132c = bringIntoViewSpec;
            }

            @Override // q0.a
            public final Object invoke() {
                b0 b0Var;
                Rect f2;
                ContentInViewNode contentInViewNode = this.f3130a;
                BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode.f3112s;
                while (true) {
                    boolean m2 = bringIntoViewRequestPriorityQueue.f3097a.m();
                    b0Var = b0.f30125a;
                    if (!m2) {
                        break;
                    }
                    MutableVector mutableVector = bringIntoViewRequestPriorityQueue.f3097a;
                    if (mutableVector.l()) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    Rect rect = (Rect) ((ContentInViewNode.Request) mutableVector.f14142a[mutableVector.f14144c - 1]).f3116a.invoke();
                    if (rect != null && !contentInViewNode.g2(contentInViewNode.w, rect)) {
                        break;
                    }
                    ((ContentInViewNode.Request) mutableVector.o(mutableVector.f14144c - 1)).f3117b.resumeWith(b0Var);
                }
                if (contentInViewNode.f3115v && (f2 = contentInViewNode.f2()) != null && contentInViewNode.g2(contentInViewNode.w, f2)) {
                    contentInViewNode.f3115v = false;
                }
                this.f3131b.e = ContentInViewNode.e2(contentInViewNode, this.f3132c);
                return b0Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, h1 h1Var, g gVar) {
            super(2, gVar);
            this.f3124c = updatableAnimationState;
            this.d = contentInViewNode;
            this.f3125f = bringIntoViewSpec;
            this.f3126g = h1Var;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f3124c, this.d, this.f3125f, this.f3126g, gVar);
            anonymousClass1.f3123b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((NestedScrollScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f3122a;
            if (i2 == 0) {
                q.m(obj);
                NestedScrollScope nestedScrollScope = (NestedScrollScope) this.f3123b;
                ContentInViewNode contentInViewNode = this.d;
                BringIntoViewSpec bringIntoViewSpec = this.f3125f;
                float e2 = ContentInViewNode.e2(contentInViewNode, bringIntoViewSpec);
                UpdatableAnimationState updatableAnimationState = this.f3124c;
                updatableAnimationState.e = e2;
                C00111 c00111 = new C00111(contentInViewNode, this.f3126g, nestedScrollScope);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(contentInViewNode, updatableAnimationState, bringIntoViewSpec);
                this.f3122a = 1;
                if (updatableAnimationState.a(c00111, anonymousClass2, this) == aVar) {
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
    public ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, g gVar) {
        super(2, gVar);
        this.f3120c = contentInViewNode;
        this.d = updatableAnimationState;
        this.f3121f = bringIntoViewSpec;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.f3120c, this.d, this.f3121f, gVar);
        contentInViewNode$launchAnimation$2.f3119b = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ContentInViewNode$launchAnimation$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f3118a;
        ContentInViewNode contentInViewNode = this.f3120c;
        try {
            try {
                if (i2 == 0) {
                    q.m(obj);
                    h1 m2 = kotlin.jvm.internal.e.m(((d0) this.f3119b).getCoroutineContext());
                    contentInViewNode.x = true;
                    ScrollingLogic scrollingLogic = contentInViewNode.f3109p;
                    MutatePriority mutatePriority = MutatePriority.f2811a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, contentInViewNode, this.f3121f, m2, null);
                    this.f3118a = 1;
                    if (scrollingLogic.e(mutatePriority, anonymousClass1, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                }
                contentInViewNode.f3112s.b();
                contentInViewNode.x = false;
                contentInViewNode.f3112s.a(null);
                contentInViewNode.f3115v = false;
                return b0.f30125a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            contentInViewNode.x = false;
            contentInViewNode.f3112s.a(null);
            contentInViewNode.f3115v = false;
            throw th;
        }
    }
}
