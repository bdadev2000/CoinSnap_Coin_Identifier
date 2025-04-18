package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import d0.b0;
import e1.h;
import e1.i;
import h0.g;
import j0.c;
import j0.e;
import java.util.LinkedHashMap;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MappedInteractionSource implements InteractionSource {

    /* renamed from: a, reason: collision with root package name */
    public final long f13019a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13020b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final MappedInteractionSource$special$$inlined$map$1 f13021c;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1] */
    public MappedInteractionSource(InteractionSource interactionSource, long j2) {
        this.f13019a = j2;
        final h c2 = interactionSource.c();
        this.f13021c = new h() { // from class: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1

            /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public final class AnonymousClass2<T> implements i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f13024a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MappedInteractionSource f13025b;

                @e(c = "androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", l = {223}, m = "emit")
                /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public final class AnonymousClass1 extends c {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f13026a;

                    /* renamed from: b, reason: collision with root package name */
                    public int f13027b;

                    public AnonymousClass1(g gVar) {
                        super(gVar);
                    }

                    @Override // j0.a
                    public final Object invokeSuspend(Object obj) {
                        this.f13026a = obj;
                        this.f13027b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar, MappedInteractionSource mappedInteractionSource) {
                    this.f13024a = iVar;
                    this.f13025b = mappedInteractionSource;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // e1.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r10, h0.g r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = (androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f13027b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f13027b = r1
                        goto L18
                    L13:
                        androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = new androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.f13026a
                        i0.a r1 = i0.a.f30806a
                        int r2 = r0.f13027b
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.jvm.internal.q.m(r11)
                        goto L90
                    L27:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L2f:
                        kotlin.jvm.internal.q.m(r11)
                        androidx.compose.foundation.interaction.Interaction r10 = (androidx.compose.foundation.interaction.Interaction) r10
                        boolean r11 = r10 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                        androidx.compose.material3.internal.MappedInteractionSource r2 = r9.f13025b
                        if (r11 == 0) goto L54
                        r11 = r10
                        androidx.compose.foundation.interaction.PressInteraction$Press r11 = (androidx.compose.foundation.interaction.PressInteraction.Press) r11
                        r2.getClass()
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = new androidx.compose.foundation.interaction.PressInteraction$Press
                        long r5 = r11.f3741a
                        long r7 = r2.f13019a
                        long r5 = androidx.compose.ui.geometry.Offset.j(r5, r7)
                        r4.<init>(r5)
                        java.util.LinkedHashMap r11 = r2.f13020b
                        r11.put(r10, r4)
                        r10 = r4
                        goto L85
                    L54:
                        boolean r11 = r10 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                        if (r11 == 0) goto L6d
                        java.util.LinkedHashMap r11 = r2.f13020b
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r10 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) r10
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = r10.f3740a
                        java.lang.Object r11 = r11.remove(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Press r11 = (androidx.compose.foundation.interaction.PressInteraction.Press) r11
                        if (r11 != 0) goto L67
                        goto L85
                    L67:
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r10 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                        r10.<init>(r11)
                        goto L85
                    L6d:
                        boolean r11 = r10 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                        if (r11 == 0) goto L85
                        java.util.LinkedHashMap r11 = r2.f13020b
                        androidx.compose.foundation.interaction.PressInteraction$Release r10 = (androidx.compose.foundation.interaction.PressInteraction.Release) r10
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = r10.f3742a
                        java.lang.Object r11 = r11.remove(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Press r11 = (androidx.compose.foundation.interaction.PressInteraction.Press) r11
                        if (r11 != 0) goto L80
                        goto L85
                    L80:
                        androidx.compose.foundation.interaction.PressInteraction$Release r10 = new androidx.compose.foundation.interaction.PressInteraction$Release
                        r10.<init>(r11)
                    L85:
                        r0.f13027b = r3
                        e1.i r11 = r9.f13024a
                        java.lang.Object r10 = r11.emit(r10, r0)
                        if (r10 != r1) goto L90
                        return r1
                    L90:
                        d0.b0 r10 = d0.b0.f30125a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, h0.g):java.lang.Object");
                }
            }

            @Override // e1.h
            public final Object collect(i iVar, g gVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar, this), gVar);
                return collect == i0.a.f30806a ? collect : b0.f30125a;
            }
        };
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public final h c() {
        return this.f13021c;
    }
}
