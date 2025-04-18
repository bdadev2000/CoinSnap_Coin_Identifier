package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.R;
import d0.b0;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {235}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f16657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Recomposer f16658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f16659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(Recomposer recomposer, View view, h0.g gVar) {
        super(2, gVar);
        this.f16658b = recomposer;
        this.f16659c = view;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.f16658b, this.f16659c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16657a;
        Recomposer recomposer = this.f16658b;
        View view = this.f16659c;
        try {
            if (i2 == 0) {
                q.m(obj);
                this.f16657a = 1;
                if (recomposer.G(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            if (WindowRecomposer_androidKt.b(view) == recomposer) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return b0.f30125a;
        } finally {
            if (WindowRecomposer_androidKt.b(view) == recomposer) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
