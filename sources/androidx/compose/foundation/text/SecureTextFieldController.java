package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.n;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SecureTextFieldController {

    /* renamed from: a, reason: collision with root package name */
    public final State f6095a;

    /* renamed from: b, reason: collision with root package name */
    public final PasswordInputTransformation f6096b = new PasswordInputTransformation(new n(0, this, SecureTextFieldController.class, "scheduleHide", "scheduleHide()V", 0));

    /* renamed from: c, reason: collision with root package name */
    public final a f6097c = new a(this, 1);
    public final Modifier d = FocusChangedModifierKt.a(Modifier.Companion.f14687a, new SecureTextFieldController$focusChangeModifier$1(this));
    public final d1.b e = p0.a.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 6);

    /* JADX WARN: Type inference failed for: r7v0, types: [q0.a, kotlin.jvm.internal.n] */
    public SecureTextFieldController(MutableState mutableState) {
        this.f6095a = mutableState;
    }
}
