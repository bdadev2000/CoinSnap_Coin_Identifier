package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import b1.d0;
import d0.b0;
import e0.u;
import e1.h;
import h0.g;
import j0.e;
import j0.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", l = {548}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FloatingActionButtonElevation$animateElevation$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9429a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f9431c;
    public final /* synthetic */ FloatingActionButtonElevationAnimatable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$2$1(InteractionSource interactionSource, FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, g gVar) {
        super(2, gVar);
        this.f9431c = interactionSource;
        this.d = floatingActionButtonElevationAnimatable;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        FloatingActionButtonElevation$animateElevation$2$1 floatingActionButtonElevation$animateElevation$2$1 = new FloatingActionButtonElevation$animateElevation$2$1(this.f9431c, this.d, gVar);
        floatingActionButtonElevation$animateElevation$2$1.f9430b = obj;
        return floatingActionButtonElevation$animateElevation$2$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((FloatingActionButtonElevation$animateElevation$2$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f9429a;
        if (i2 == 0) {
            q.m(obj);
            final d0 d0Var = (d0) this.f9430b;
            final ArrayList arrayList = new ArrayList();
            h c2 = this.f9431c.c();
            final FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.d;
            e1.i iVar = new e1.i() { // from class: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.1

                @e(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1", f = "FloatingActionButton.kt", l = {573}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes2.dex */
                final class C00381 extends i implements p {

                    /* renamed from: a, reason: collision with root package name */
                    public int f9435a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ FloatingActionButtonElevationAnimatable f9436b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Interaction f9437c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00381(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Interaction interaction, g gVar) {
                        super(2, gVar);
                        this.f9436b = floatingActionButtonElevationAnimatable;
                        this.f9437c = interaction;
                    }

                    @Override // j0.a
                    public final g create(Object obj, g gVar) {
                        return new C00381(this.f9436b, this.f9437c, gVar);
                    }

                    @Override // q0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C00381) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
                    }

                    @Override // j0.a
                    public final Object invokeSuspend(Object obj) {
                        i0.a aVar = i0.a.f30806a;
                        int i2 = this.f9435a;
                        if (i2 == 0) {
                            q.m(obj);
                            this.f9435a = 1;
                            if (this.f9436b.a(this.f9437c, this) == aVar) {
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

                @Override // e1.i
                public final Object emit(Object obj2, g gVar) {
                    Interaction interaction = (Interaction) obj2;
                    boolean z2 = interaction instanceof HoverInteraction.Enter;
                    List list = arrayList;
                    if (z2) {
                        list.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        list.remove(((HoverInteraction.Exit) interaction).f3733a);
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        list.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        list.remove(((FocusInteraction.Unfocus) interaction).f3727a);
                    } else if (interaction instanceof PressInteraction.Press) {
                        list.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        list.remove(((PressInteraction.Release) interaction).f3742a);
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        list.remove(((PressInteraction.Cancel) interaction).f3740a);
                    }
                    kotlin.jvm.internal.e.v(d0Var, null, 0, new C00381(floatingActionButtonElevationAnimatable, (Interaction) u.M0(list), null), 3);
                    return b0.f30125a;
                }
            };
            this.f9429a = 1;
            if (c2.collect(iVar, this) == aVar) {
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
