package androidx.compose.foundation.text.input.internal;

/* loaded from: classes4.dex */
public final class AndroidTextInputSession_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f6337a = {"*/*", "image/*", "video/*"};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.foundation.content.internal.ReceiveContentConfiguration r16, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r17, androidx.compose.foundation.text.input.internal.TextLayoutState r18, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r19, androidx.compose.ui.platform.PlatformTextInputSessionScope r20, androidx.compose.ui.platform.ViewConfiguration r21, androidx.compose.ui.text.input.ImeOptions r22, h0.g r23, q0.l r24, e1.l0 r25) {
        /*
            r0 = r23
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            if (r1 == 0) goto L15
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) r1
            int r2 = r1.f6341b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f6341b = r2
            goto L1a
        L15:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f6340a
            i0.a r2 = i0.a.f30806a
            int r3 = r1.f6341b
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 == r4) goto L2d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            kotlin.jvm.internal.q.m(r0)
            goto L56
        L31:
            kotlin.jvm.internal.q.m(r0)
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 r0 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3
            r13 = 0
            r5 = r0
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = r22
            r14 = r24
            r15 = r25
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f6341b = r4
            java.lang.Object r0 = p0.a.J(r0, r1)
            if (r0 != r2) goto L56
            return
        L56:
            d0.e r0 = new d0.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.a(androidx.compose.foundation.content.internal.ReceiveContentConfiguration, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.ui.platform.PlatformTextInputSessionScope, androidx.compose.ui.platform.ViewConfiguration, androidx.compose.ui.text.input.ImeOptions, h0.g, q0.l, e1.l0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.platform.PlatformTextInputSessionScope r12, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r13, androidx.compose.foundation.text.input.internal.TextLayoutState r14, androidx.compose.ui.text.input.ImeOptions r15, androidx.compose.foundation.content.internal.ReceiveContentConfiguration r16, q0.l r17, e1.l0 r18, androidx.compose.ui.platform.ViewConfiguration r19, h0.g r20) {
        /*
            r0 = r20
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1
            if (r1 == 0) goto L16
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) r1
            int r2 = r1.f6339b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f6339b = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.f6338a
            i0.a r1 = i0.a.f30806a
            int r1 = r9.f6339b
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 == r2) goto L2f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            kotlin.jvm.internal.q.m(r0)
            d0.e r0 = new d0.e
            r0.<init>()
            throw r0
        L38:
            kotlin.jvm.internal.q.m(r0)
            android.view.View r0 = r12.getView()
            androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r3 = androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt.a(r0)
            r9.f6339b = r2
            r2 = r16
            r4 = r14
            r5 = r13
            r6 = r12
            r7 = r19
            r8 = r15
            r10 = r17
            r11 = r18
            a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.b(androidx.compose.ui.platform.PlatformTextInputSessionScope, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, q0.l, e1.l0, androidx.compose.ui.platform.ViewConfiguration, h0.g):void");
    }
}
