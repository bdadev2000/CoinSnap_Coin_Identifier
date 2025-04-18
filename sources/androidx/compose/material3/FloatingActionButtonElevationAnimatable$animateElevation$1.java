package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import h0.g;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {650}, m = "animateElevation")
/* loaded from: classes4.dex */
public final class FloatingActionButtonElevationAnimatable$animateElevation$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f9443a;

    /* renamed from: b, reason: collision with root package name */
    public Interaction f9444b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9445c;
    public final /* synthetic */ FloatingActionButtonElevationAnimatable d;

    /* renamed from: f, reason: collision with root package name */
    public int f9446f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$animateElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, g gVar) {
        super(gVar);
        this.d = floatingActionButtonElevationAnimatable;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f9445c = obj;
        this.f9446f |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
