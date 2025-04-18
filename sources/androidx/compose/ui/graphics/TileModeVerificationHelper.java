package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi
/* loaded from: classes3.dex */
public final class TileModeVerificationHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final TileModeVerificationHelper f15058a = new Object();

    @DoNotInline
    public final int a() {
        return 3;
    }

    @DoNotInline
    @NotNull
    public final Shader.TileMode b() {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        return tileMode;
    }
}
