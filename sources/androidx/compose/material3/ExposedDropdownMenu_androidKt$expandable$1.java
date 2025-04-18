package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1", f = "ExposedDropdownMenu.android.kt", l = {1426}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ExposedDropdownMenu_androidKt$expandable$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9377a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9379c;
    public final /* synthetic */ q0.a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.android.kt", l = {1430, 1434}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends h implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f9380a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f9381b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9382c;
        public final /* synthetic */ q0.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, q0.a aVar, g gVar) {
            super(gVar);
            this.f9382c = str;
            this.d = aVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9382c, this.d, gVar);
            anonymousClass1.f9381b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0054  */
        @Override // j0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                i0.a r0 = i0.a.f30806a
                int r1 = r6.f9380a
                androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.f15572a
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r4) goto L12
                kotlin.jvm.internal.q.m(r7)
                goto L50
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f9381b
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.jvm.internal.q.m(r7)
                goto L35
            L22:
                kotlin.jvm.internal.q.m(r7)
                java.lang.Object r7 = r6.f9381b
                r1 = r7
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                r6.f9381b = r1
                r6.f9380a = r3
                java.lang.Object r7 = androidx.compose.foundation.gestures.TapGestureDetectorKt.c(r1, r2, r6, r3)
                if (r7 != r0) goto L35
                return r0
            L35:
                androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                java.lang.String r3 = r6.f9382c
                java.lang.String r5 = "SecondaryEditable"
                boolean r3 = p0.a.g(r3, r5)
                if (r3 == 0) goto L44
                r7.a()
            L44:
                r7 = 0
                r6.f9381b = r7
                r6.f9380a = r4
                java.lang.Object r7 = androidx.compose.foundation.gestures.TapGestureDetectorKt.g(r1, r2, r6)
                if (r7 != r0) goto L50
                return r0
            L50:
                androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                if (r7 == 0) goto L59
                q0.a r7 = r6.d
                r7.invoke()
            L59:
                d0.b0 r7 = d0.b0.f30125a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$expandable$1(String str, q0.a aVar, g gVar) {
        super(2, gVar);
        this.f9379c = str;
        this.d = aVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        ExposedDropdownMenu_androidKt$expandable$1 exposedDropdownMenu_androidKt$expandable$1 = new ExposedDropdownMenu_androidKt$expandable$1(this.f9379c, this.d, gVar);
        exposedDropdownMenu_androidKt$expandable$1.f9378b = obj;
        return exposedDropdownMenu_androidKt$expandable$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ExposedDropdownMenu_androidKt$expandable$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f9377a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f9378b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9379c, this.d, null);
            this.f9377a = 1;
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
