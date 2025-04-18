package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
final class TimePickerKt$TimeInput$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f12414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f12415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TimePickerColors f12416c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12417f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInput$1(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i2, int i3) {
        super(2);
        this.f12414a = timePickerState;
        this.f12415b = modifier;
        this.f12416c = timePickerColors;
        this.d = i2;
        this.f12417f = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if ((r5 & 4) != 0) goto L49;
     */
    @Override // q0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            androidx.compose.runtime.Composer r9 = (androidx.compose.runtime.Composer) r9
            java.lang.Number r10 = (java.lang.Number) r10
            r10.intValue()
            androidx.compose.material3.TimePickerState r1 = r8.f12414a
            int r10 = r8.d
            r10 = r10 | 1
            int r4 = androidx.compose.runtime.RecomposeScopeImplKt.a(r10)
            int r5 = r8.f12417f
            float r10 = androidx.compose.material3.TimePickerKt.f12322a
            r10 = -760850373(0xffffffffd2a6583b, float:-3.5722242E11)
            androidx.compose.runtime.ComposerImpl r9 = r9.g(r10)
            r10 = r5 & 1
            if (r10 == 0) goto L23
            r10 = r4 | 6
            goto L3c
        L23:
            r10 = r4 & 6
            if (r10 != 0) goto L3b
            r10 = r4 & 8
            if (r10 != 0) goto L30
            boolean r10 = r9.I(r1)
            goto L34
        L30:
            boolean r10 = r9.w(r1)
        L34:
            if (r10 == 0) goto L38
            r10 = 4
            goto L39
        L38:
            r10 = 2
        L39:
            r10 = r10 | r4
            goto L3c
        L3b:
            r10 = r4
        L3c:
            r0 = r5 & 2
            androidx.compose.ui.Modifier r2 = r8.f12415b
            if (r0 == 0) goto L45
            r10 = r10 | 48
            goto L55
        L45:
            r3 = r4 & 48
            if (r3 != 0) goto L55
            boolean r3 = r9.I(r2)
            if (r3 == 0) goto L52
            r3 = 32
            goto L54
        L52:
            r3 = 16
        L54:
            r10 = r10 | r3
        L55:
            r3 = r4 & 384(0x180, float:5.38E-43)
            androidx.compose.material3.TimePickerColors r6 = r8.f12416c
            if (r3 != 0) goto L6b
            r3 = r5 & 4
            if (r3 != 0) goto L68
            boolean r3 = r9.I(r6)
            if (r3 == 0) goto L68
            r3 = 256(0x100, float:3.59E-43)
            goto L6a
        L68:
            r3 = 128(0x80, float:1.8E-43)
        L6a:
            r10 = r10 | r3
        L6b:
            r3 = r10 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r3 != r7) goto L7d
            boolean r3 = r9.i()
            if (r3 != 0) goto L78
            goto L7d
        L78:
            r9.A()
        L7b:
            r3 = r6
            goto Lb5
        L7d:
            r9.u0()
            r3 = r4 & 1
            if (r3 == 0) goto L95
            boolean r3 = r9.e0()
            if (r3 == 0) goto L8b
            goto L95
        L8b:
            r9.A()
            r0 = r5 & 4
            if (r0 == 0) goto La2
        L92:
            r10 = r10 & (-897(0xfffffffffffffc7f, float:NaN))
            goto La2
        L95:
            if (r0 == 0) goto L99
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion.f14687a
        L99:
            r0 = r5 & 4
            if (r0 == 0) goto La2
            androidx.compose.material3.TimePickerColors r6 = androidx.compose.material3.TimePickerDefaults.a(r9)
            goto L92
        La2:
            r9.W()
            int r0 = r10 >> 3
            r3 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r10 = r10 << 6
            r10 = r10 & 896(0x380, float:1.256E-42)
            r10 = r10 | r0
            androidx.compose.material3.TimePickerKt.g(r10, r6, r1, r9, r2)
            goto L7b
        Lb5:
            androidx.compose.runtime.RecomposeScopeImpl r9 = r9.Z()
            if (r9 == 0) goto Lc3
            androidx.compose.material3.TimePickerKt$TimeInput$1 r10 = new androidx.compose.material3.TimePickerKt$TimeInput$1
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r9.d = r10
        Lc3:
            d0.b0 r9 = d0.b0.f30125a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt$TimeInput$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
