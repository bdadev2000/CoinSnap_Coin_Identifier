package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.cmsui2.common.CmsUILogEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: ExposedDropdownMenu.android.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JU\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0017¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "ExposedDropdownMenu", "", CmsUILogEvents.CMS_NAME_TYPE_EXPANDED, "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "material_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface ExposedDropdownMenuBoxScope {
    Modifier exposedDropdownSize(Modifier modifier, boolean z);

    /* compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void ExposedDropdownMenu(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, Function0<Unit> function0, Modifier modifier, ScrollState scrollState, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2) {
            ExposedDropdownMenuBoxScope.super.ExposedDropdownMenu(z, function0, modifier, scrollState, function3, composer, i, i2);
        }
    }

    static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    default void ExposedDropdownMenu(final boolean r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.ScrollState r30, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
