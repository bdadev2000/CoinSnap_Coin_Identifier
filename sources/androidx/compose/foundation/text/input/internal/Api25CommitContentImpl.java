package androidx.compose.foundation.text.input.internal;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
/* loaded from: classes3.dex */
final class Api25CommitContentImpl {

    /* renamed from: a, reason: collision with root package name */
    public static final Api25CommitContentImpl f6365a = new Object();

    @DoNotInline
    public final boolean a(@NotNull InputConnection inputConnection, @NotNull InputContentInfo inputContentInfo, int i2, @Nullable Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i2, bundle);
    }
}
