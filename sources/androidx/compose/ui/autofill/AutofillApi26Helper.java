package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@RequiresApi
/* loaded from: classes3.dex */
public final class AutofillApi26Helper {

    /* renamed from: a, reason: collision with root package name */
    public static final AutofillApi26Helper f14716a = new Object();

    @DoNotInline
    @RequiresApi
    @Nullable
    public final AutofillId a(@NotNull ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    @DoNotInline
    @RequiresApi
    public final boolean b(@NotNull AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    @DoNotInline
    @RequiresApi
    public final boolean c(@NotNull AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    @DoNotInline
    @RequiresApi
    public final boolean d(@NotNull AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    @DoNotInline
    @RequiresApi
    public final boolean e(@NotNull AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    @DoNotInline
    @RequiresApi
    public final void f(@NotNull ViewStructure viewStructure, @NotNull String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    @DoNotInline
    @RequiresApi
    public final void g(@NotNull ViewStructure viewStructure, @NotNull AutofillId autofillId, int i2) {
        viewStructure.setAutofillId(autofillId, i2);
    }

    @DoNotInline
    @RequiresApi
    public final void h(@NotNull ViewStructure viewStructure, int i2) {
        viewStructure.setAutofillType(i2);
    }

    @DoNotInline
    @RequiresApi
    @NotNull
    public final CharSequence i(@NotNull AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
