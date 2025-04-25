package androidx.palette.graphics;

import androidx.palette.graphics.Palette;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Palette.kt */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\n¨\u0006\u0005"}, d2 = {LogEvents.exportemptyalert_close_click_type_get, "Landroidx/palette/graphics/Palette$Swatch;", "Landroidx/palette/graphics/Palette;", "target", "Landroidx/palette/graphics/Target;", "palette-ktx_release"}, k = 2, mv = {1, 1, 10})
/* loaded from: classes7.dex */
public final class PaletteKt {
    public static final Palette.Swatch get(Palette receiver, Target target) {
        Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(target, "target");
        return receiver.getSwatchForTarget(target);
    }
}
