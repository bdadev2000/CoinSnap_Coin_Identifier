package androidx.compose.ui.window;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {377}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$Popup$5$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f17634a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f17636c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f17637a = new r(1);

        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5$1(PopupLayout popupLayout, g gVar) {
        super(2, gVar);
        this.f17636c = popupLayout;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        AndroidPopup_androidKt$Popup$5$1 androidPopup_androidKt$Popup$5$1 = new AndroidPopup_androidKt$Popup$5$1(this.f17636c, gVar);
        androidPopup_androidKt$Popup$5$1.f17635b = obj;
        return androidPopup_androidKt$Popup$5$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidPopup_androidKt$Popup$5$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // j0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r9.f17634a
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r9.f17635b
            b1.d0 r1 = (b1.d0) r1
            kotlin.jvm.internal.q.m(r10)
            r10 = r9
            goto L36
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            kotlin.jvm.internal.q.m(r10)
            java.lang.Object r10 = r9.f17635b
            b1.d0 r10 = (b1.d0) r10
            r1 = r10
            r10 = r9
        L23:
            boolean r3 = p0.a.n0(r1)
            if (r3 == 0) goto L50
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r3 = androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.AnonymousClass1.f17637a
            r10.f17635b = r1
            r10.f17634a = r2
            java.lang.Object r3 = androidx.compose.ui.platform.InfiniteAnimationPolicyKt.a(r3, r10)
            if (r3 != r0) goto L36
            return r0
        L36:
            androidx.compose.ui.window.PopupLayout r3 = r10.f17636c
            int[] r4 = r3.B
            r5 = 0
            r6 = r4[r5]
            r7 = r4[r2]
            android.view.View r8 = r3.f17681m
            r8.getLocationOnScreen(r4)
            r5 = r4[r5]
            if (r6 != r5) goto L4c
            r4 = r4[r2]
            if (r7 == r4) goto L23
        L4c:
            r3.l()
            goto L23
        L50:
            d0.b0 r10 = d0.b0.f30125a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
