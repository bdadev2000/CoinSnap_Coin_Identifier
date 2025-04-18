package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.android.kt", l = {638}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AndroidEdgeEffectOverscrollEffect$effectModifier$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2453a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect f2455c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.android.kt", l = {639, 643}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends h implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f2456a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f2457b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AndroidEdgeEffectOverscrollEffect f2458c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, g gVar) {
            super(gVar);
            this.f2458c = androidEdgeEffectOverscrollEffect;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2458c, gVar);
            anonymousClass1.f2457b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005f -> B:6:0x0062). Please report as a decompilation issue!!! */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 213
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$effectModifier$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, g gVar) {
        super(2, gVar);
        this.f2455c = androidEdgeEffectOverscrollEffect;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        AndroidEdgeEffectOverscrollEffect$effectModifier$1 androidEdgeEffectOverscrollEffect$effectModifier$1 = new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this.f2455c, gVar);
        androidEdgeEffectOverscrollEffect$effectModifier$1.f2454b = obj;
        return androidEdgeEffectOverscrollEffect$effectModifier$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidEdgeEffectOverscrollEffect$effectModifier$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2453a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f2454b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2455c, null);
            this.f2453a = 1;
            if (ForEachGestureKt.b(pointerInputScope, anonymousClass1, this) == aVar) {
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
