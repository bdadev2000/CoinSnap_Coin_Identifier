package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;

@StabilityInferred
@RequiresApi
@ExperimentalComposeUiApi
/* loaded from: classes4.dex */
public final class AndroidAutofill implements Autofill {

    /* renamed from: a, reason: collision with root package name */
    public final View f14712a;

    /* renamed from: b, reason: collision with root package name */
    public final AutofillTree f14713b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f14714c;

    public AndroidAutofill(View view, AutofillTree autofillTree) {
        this.f14712a = view;
        this.f14713b = autofillTree;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.f14714c = autofillManager;
        view.setImportantForAutofill(1);
    }
}
