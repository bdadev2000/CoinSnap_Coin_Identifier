package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ComposeView extends AbstractComposeView {

    /* renamed from: j, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f16427j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16428k;

    public ComposeView(Context context) {
        super(context, null, 0);
        this.f16427j = SnapshotStateKt.g(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(420213850);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            q0.p pVar = (q0.p) this.f16427j.getValue();
            if (pVar == null) {
                g2.J(358373017);
            } else {
                g2.J(150107752);
                pVar.invoke(g2, 0);
            }
            g2.V(false);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ComposeView$Content$1(this, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f16428k;
    }

    @ComposableInferredTarget
    public final void setContent(@NotNull q0.p pVar) {
        this.f16428k = true;
        this.f16427j.setValue(pVar);
        if (isAttachedToWindow()) {
            c();
        }
    }
}
