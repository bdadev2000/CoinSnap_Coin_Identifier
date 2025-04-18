package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@RequiresApi
/* loaded from: classes2.dex */
public final class AutofillApi23Helper {

    /* renamed from: a, reason: collision with root package name */
    public static final AutofillApi23Helper f14715a = new Object();

    @DoNotInline
    @RequiresApi
    public final int a(@NotNull ViewStructure viewStructure, int i2) {
        return viewStructure.addChildCount(i2);
    }

    @DoNotInline
    @RequiresApi
    @Nullable
    public final ViewStructure b(@NotNull ViewStructure viewStructure, int i2) {
        return viewStructure.newChild(i2);
    }

    @DoNotInline
    @RequiresApi
    public final void c(@NotNull ViewStructure viewStructure, int i2, int i3, int i4, int i5, int i6, int i7) {
        viewStructure.setDimens(i2, i3, i4, i5, i6, i7);
    }

    @DoNotInline
    @RequiresApi
    public final void d(@NotNull ViewStructure viewStructure, int i2, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        viewStructure.setId(i2, str, str2, str3);
    }
}
