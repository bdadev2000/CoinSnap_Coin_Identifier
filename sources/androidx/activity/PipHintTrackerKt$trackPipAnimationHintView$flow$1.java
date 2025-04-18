package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import d0.b0;
import d1.q;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

@j0.e(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", l = {Opcodes.CASTORE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends j0.i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f187a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f189c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f190a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f191b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View.OnLayoutChangeListener f192c;
        public final /* synthetic */ PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(View view, i iVar, h hVar, PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1) {
            super(0);
            this.f190a = view;
            this.f191b = iVar;
            this.f192c = hVar;
            this.d = pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1;
        }

        @Override // q0.a
        public final Object invoke() {
            View view = this.f190a;
            view.getViewTreeObserver().removeOnScrollChangedListener(this.f191b);
            view.removeOnLayoutChangeListener(this.f192c);
            view.removeOnAttachStateChangeListener(this.d);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, h0.g gVar) {
        super(2, gVar);
        this.f189c = view;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.f189c, gVar);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.f188b = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create((q) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnLayoutChangeListener, androidx.activity.h] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.ViewTreeObserver$OnScrollChangedListener, androidx.activity.i] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1, android.view.View$OnAttachStateChangeListener] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f187a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            final q qVar = (q) this.f188b;
            final ?? r1 = new View.OnLayoutChangeListener() { // from class: androidx.activity.h
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    if (i3 == i7 && i5 == i9 && i4 == i8 && i6 == i10) {
                        return;
                    }
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    ((d1.p) q.this).b(rect);
                }
            };
            final View view = this.f189c;
            final ?? r3 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.i
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    ((d1.p) q.this).b(rect);
                }
            };
            ?? r5 = new View.OnAttachStateChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    Rect rect = new Rect();
                    View view3 = view;
                    view3.getGlobalVisibleRect(rect);
                    ((d1.p) q.this).b(rect);
                    view3.getViewTreeObserver().addOnScrollChangedListener(r3);
                    view3.addOnLayoutChangeListener(r1);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    view2.getViewTreeObserver().removeOnScrollChangedListener(r3);
                    view2.removeOnLayoutChangeListener(r1);
                }
            };
            if (view.isAttachedToWindow()) {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                ((d1.p) qVar).b(rect);
                view.getViewTreeObserver().addOnScrollChangedListener(r3);
                view.addOnLayoutChangeListener(r1);
            }
            view.addOnAttachStateChangeListener(r5);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(view, r3, r1, r5);
            this.f187a = 1;
            if (p0.a.j(qVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
