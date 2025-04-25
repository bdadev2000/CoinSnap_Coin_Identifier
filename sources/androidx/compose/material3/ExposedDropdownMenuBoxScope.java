package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.cmsui2.common.CmsUILogEvents;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ExposedDropdownMenu.android.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002JU\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u0016J\u0098\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J¢\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\nH&J\f\u0010'\u001a\u00020\u000e*\u00020\u000eH\u0007J(\u0010'\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b*\u0010+R\u0018\u0010\u0003\u001a\u00020\u0004X \u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "()V", "anchorType", "Landroidx/compose/material3/MenuAnchorType;", "getAnchorType-Mg6Rgbw$material3_release", "()Ljava/lang/String;", "ExposedDropdownMenu", "", CmsUILogEvents.CMS_NAME_TYPE_EXPANDED, "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "matchTextFieldWidth", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "ExposedDropdownMenu-vNxi1II", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "focusable", "ExposedDropdownMenu-kbRbctU", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "exposedDropdownSize", "menuAnchor", "type", "enabled", "menuAnchor-fsE2BvY", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/ExposedDropdownMenuBoxScopeImpl;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    public /* synthetic */ ExposedDropdownMenuBoxScope(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Modifier exposedDropdownSize(Modifier modifier, boolean z);

    /* renamed from: getAnchorType-Mg6Rgbw$material3_release, reason: not valid java name */
    public abstract String mo2403getAnchorTypeMg6Rgbw$material3_release();

    /* renamed from: menuAnchor-fsE2BvY, reason: not valid java name */
    public abstract Modifier mo2404menuAnchorfsE2BvY(Modifier modifier, String str, boolean z);

    private ExposedDropdownMenuBoxScope() {
    }

    /* renamed from: menuAnchor-fsE2BvY$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2400menuAnchorfsE2BvY$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: menuAnchor-fsE2BvY");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.mo2404menuAnchorfsE2BvY(modifier, str, z);
    }

    public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030c  */
    /* renamed from: ExposedDropdownMenu-vNxi1II, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2402ExposedDropdownMenuvNxi1II(final boolean r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, androidx.compose.ui.Modifier r41, androidx.compose.foundation.ScrollState r42, boolean r43, androidx.compose.ui.graphics.Shape r44, long r45, float r47, float r48, androidx.compose.foundation.BorderStroke r49, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.m2402ExposedDropdownMenuvNxi1II(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, boolean, androidx.compose.ui.graphics.Shape, long, float, float, androidx.compose.foundation.BorderStroke, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use overload that takes MenuAnchorType and enabled parameters", replaceWith = @ReplaceWith(expression = "menuAnchor(type, enabled)", imports = {}))
    public final Modifier menuAnchor(Modifier modifier) {
        return m2400menuAnchorfsE2BvY$default(this, modifier, MenuAnchorType.INSTANCE.m2546getPrimaryNotEditableMg6Rgbw(), false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "The `focusable` parameter is unused. Pass the proper MenuAnchorType to Modifier.menuAnchor instead, which will handle focusability automatically.")
    /* renamed from: ExposedDropdownMenu-kbRbctU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2401ExposedDropdownMenukbRbctU(final boolean r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, androidx.compose.ui.Modifier r37, androidx.compose.foundation.ScrollState r38, boolean r39, boolean r40, androidx.compose.ui.graphics.Shape r41, long r42, float r44, float r45, androidx.compose.foundation.BorderStroke r46, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.m2401ExposedDropdownMenukbRbctU(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, boolean, boolean, androidx.compose.ui.graphics.Shape, long, float, float, androidx.compose.foundation.BorderStroke, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0051  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with customization options parameters.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void ExposedDropdownMenu(final boolean r26, final kotlin.jvm.functions.Function0 r27, androidx.compose.ui.Modifier r28, androidx.compose.foundation.ScrollState r29, final kotlin.jvm.functions.Function3 r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
