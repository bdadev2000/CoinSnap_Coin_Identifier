package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FloatingActionButtonElevationAnimatable {

    /* renamed from: a, reason: collision with root package name */
    public float f9438a;

    /* renamed from: b, reason: collision with root package name */
    public float f9439b;

    /* renamed from: c, reason: collision with root package name */
    public float f9440c;
    public float d;
    public final Animatable e;

    /* renamed from: f, reason: collision with root package name */
    public Interaction f9441f;

    /* renamed from: g, reason: collision with root package name */
    public Interaction f9442g;

    public FloatingActionButtonElevationAnimatable(float f2, float f3, float f4, float f5) {
        this.f9438a = f2;
        this.f9439b = f3;
        this.f9440c = f4;
        this.d = f5;
        this.e = new Animatable(new Dp(f2), VectorConvertersKt.f2342c, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.foundation.interaction.Interaction r6, h0.g r7) {
        /*
            r5 = this;
            androidx.compose.animation.core.Animatable r0 = r5.e
            boolean r1 = r7 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1
            if (r1 == 0) goto L15
            r1 = r7
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r1 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1) r1
            int r2 = r1.f9446f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f9446f = r2
            goto L1a
        L15:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r1 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.f9445c
            i0.a r2 = i0.a.f30806a
            int r3 = r1.f9446f
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            androidx.compose.foundation.interaction.Interaction r6 = r1.f9444b
            java.lang.Object r0 = r1.f9443a
            androidx.compose.material3.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable) r0
            kotlin.jvm.internal.q.m(r7)     // Catch: java.lang.Throwable -> L2f
            goto L78
        L2f:
            r7 = move-exception
            goto L7d
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.jvm.internal.q.m(r7)
            boolean r7 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r7 == 0) goto L43
            float r7 = r5.f9439b
            goto L53
        L43:
            boolean r7 = r6 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r7 == 0) goto L4a
            float r7 = r5.f9440c
            goto L53
        L4a:
            boolean r7 = r6 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r7 == 0) goto L51
            float r7 = r5.d
            goto L53
        L51:
            float r7 = r5.f9438a
        L53:
            r5.f9442g = r6
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = r0.e     // Catch: java.lang.Throwable -> L74
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L74
            androidx.compose.ui.unit.Dp r3 = (androidx.compose.ui.unit.Dp) r3     // Catch: java.lang.Throwable -> L74
            float r3 = r3.f17486a     // Catch: java.lang.Throwable -> L74
            boolean r3 = androidx.compose.ui.unit.Dp.a(r3, r7)     // Catch: java.lang.Throwable -> L74
            if (r3 != 0) goto L77
            androidx.compose.foundation.interaction.Interaction r3 = r5.f9441f     // Catch: java.lang.Throwable -> L74
            r1.f9443a = r5     // Catch: java.lang.Throwable -> L74
            r1.f9444b = r6     // Catch: java.lang.Throwable -> L74
            r1.f9446f = r4     // Catch: java.lang.Throwable -> L74
            java.lang.Object r7 = androidx.compose.material3.internal.ElevationKt.a(r0, r7, r3, r6, r1)     // Catch: java.lang.Throwable -> L74
            if (r7 != r2) goto L77
            return r2
        L74:
            r7 = move-exception
            r0 = r5
            goto L7d
        L77:
            r0 = r5
        L78:
            r0.f9441f = r6
            d0.b0 r6 = d0.b0.f30125a
            return r6
        L7d:
            r0.f9441f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.a(androidx.compose.foundation.interaction.Interaction, h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(h0.g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f9448b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f9447a
            androidx.compose.material3.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable) r0
            kotlin.jvm.internal.q.m(r6)     // Catch: java.lang.Throwable -> L2b
            goto L74
        L2b:
            r6 = move-exception
            goto L7b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.jvm.internal.q.m(r6)
            androidx.compose.foundation.interaction.Interaction r6 = r5.f9442g
            boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            if (r2 == 0) goto L41
            float r6 = r5.f9439b
            goto L51
        L41:
            boolean r2 = r6 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r2 == 0) goto L48
            float r6 = r5.f9440c
            goto L51
        L48:
            boolean r6 = r6 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r6 == 0) goto L4f
            float r6 = r5.d
            goto L51
        L4f:
            float r6 = r5.f9438a
        L51:
            androidx.compose.animation.core.Animatable r2 = r5.e
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = r2.e
            java.lang.Object r4 = r4.getValue()
            androidx.compose.ui.unit.Dp r4 = (androidx.compose.ui.unit.Dp) r4
            float r4 = r4.f17486a
            boolean r4 = androidx.compose.ui.unit.Dp.a(r4, r6)
            if (r4 != 0) goto L80
            androidx.compose.ui.unit.Dp r4 = new androidx.compose.ui.unit.Dp     // Catch: java.lang.Throwable -> L79
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L79
            r0.f9447a = r5     // Catch: java.lang.Throwable -> L79
            r0.d = r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r6 = r2.e(r4, r0)     // Catch: java.lang.Throwable -> L79
            if (r6 != r1) goto L73
            return r1
        L73:
            r0 = r5
        L74:
            androidx.compose.foundation.interaction.Interaction r6 = r0.f9442g
            r0.f9441f = r6
            goto L80
        L79:
            r6 = move-exception
            r0 = r5
        L7b:
            androidx.compose.foundation.interaction.Interaction r1 = r0.f9442g
            r0.f9441f = r1
            throw r6
        L80:
            d0.b0 r6 = d0.b0.f30125a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.b(h0.g):java.lang.Object");
    }
}
