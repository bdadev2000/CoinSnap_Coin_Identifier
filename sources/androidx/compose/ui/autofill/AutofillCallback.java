package androidx.compose.ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@RequiresApi
/* loaded from: classes3.dex */
public final class AutofillCallback extends AutofillManager.AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final AutofillCallback f14717a = new AutofillManager.AutofillCallback();

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void a(@NotNull AndroidAutofill androidAutofill) {
        androidAutofill.f14714c.registerCallback(this);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void b(@NotNull AndroidAutofill androidAutofill) {
        androidAutofill.f14714c.unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i2, int i3) {
        super.onAutofillEvent(view, i2, i3);
        Log.d("Autofill Status", i3 != 1 ? i3 != 2 ? i3 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
