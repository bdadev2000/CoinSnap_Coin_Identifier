package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

@RequiresApi
/* loaded from: classes2.dex */
final class AndroidComposeViewAssistHelperMethodsO {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidComposeViewAssistHelperMethodsO f16317a = new Object();

    @DoNotInline
    @RequiresApi
    public final void a(@NotNull ViewStructure viewStructure, @NotNull View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
