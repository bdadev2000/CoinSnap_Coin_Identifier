package com.glority.android.compose.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BlurKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.integration.compose.GlideImageKt;
import com.bumptech.glide.integration.compose.Placeholder;
import com.glority.android.compose.R;
import com.glority.android.compose.extensions.UnitExtensionsKt;
import com.glority.android.core.app.AppContext;
import com.glority.base.utils.StatusBarUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ImageUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: Image.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a{\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0014\u001a&\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¨\u0006\u0018"}, d2 = {"GlImage", "", "model", "", "modifier", "Landroidx/compose/ui/Modifier;", "blur", "", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "alignment", "Landroidx/compose/ui/Alignment;", "contentDescription", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "loading", "Landroid/graphics/drawable/Drawable;", "failure", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/Alignment;Ljava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroidx/compose/runtime/Composer;II)V", "getGlideModel", "context", "Landroid/content/Context;", "lib-compose_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ImageKt {
    public static final void GlImage(final Object obj, Modifier modifier, float f, ContentScale contentScale, float f2, Alignment alignment, String str, ColorFilter colorFilter, Drawable drawable, Drawable drawable2, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(1902478708);
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        float f3 = (i2 & 4) != 0 ? 0.0f : f;
        ContentScale contentScale2 = (i2 & 8) != 0 ? null : contentScale;
        float f4 = (i2 & 16) != 0 ? 1.0f : f2;
        Alignment topStart = (i2 & 32) != 0 ? Alignment.INSTANCE.getTopStart() : alignment;
        String str2 = (i2 & 64) != 0 ? null : str;
        ColorFilter colorFilter2 = (i2 & 128) != 0 ? null : colorFilter;
        Drawable drawable3 = (i2 & 256) != 0 ? null : drawable;
        Drawable drawable4 = (i2 & 512) != 0 ? null : drawable2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1902478708, i, -1, "com.glority.android.compose.ui.GlImage (Image.kt:52)");
        }
        ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localInspectionMode);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        boolean booleanValue = ((Boolean) consume).booleanValue();
        if (obj instanceof Integer) {
            startRestartGroup.startReplaceableGroup(-1149745320);
            androidx.compose.foundation.ImageKt.Image(UnitExtensionsKt.getPr(((Number) obj).intValue(), startRestartGroup, 0), str2, BlurKt.m4152blurF8QBwvs$default(companion, Dp.m6997constructorimpl(f3), null, 2, null), topStart, contentScale2 == null ? ContentScale.INSTANCE.getFit() : contentScale2, f4, colorFilter2, startRestartGroup, ((i >> 15) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 8 | ((i >> 6) & 7168) | ((i << 3) & 458752) | ((i >> 3) & 3670016), 0);
            startRestartGroup.endReplaceableGroup();
        } else if (obj instanceof Painter) {
            startRestartGroup.startReplaceableGroup(-1149744967);
            androidx.compose.foundation.ImageKt.Image((Painter) obj, str2, BlurKt.m4152blurF8QBwvs$default(companion, Dp.m6997constructorimpl(f3), null, 2, null), topStart, contentScale2 == null ? ContentScale.INSTANCE.getFit() : contentScale2, f4, colorFilter2, startRestartGroup, ((i >> 15) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 8 | ((i >> 6) & 7168) | ((i << 3) & 458752) | ((i >> 3) & 3670016), 0);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-1149744639);
            if (booleanValue) {
                startRestartGroup.startReplaceableGroup(-1149744615);
                androidx.compose.foundation.ImageKt.Image(UnitExtensionsKt.getPr(R.drawable.img_basecompose_image_holder, startRestartGroup, 0), str2, BlurKt.m4152blurF8QBwvs$default(companion, Dp.m6997constructorimpl(f3), null, 2, null), topStart, contentScale2 == null ? ContentScale.INSTANCE.getCrop() : contentScale2, f4, colorFilter2, startRestartGroup, ((i >> 15) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 8 | ((i >> 6) & 7168) | ((i << 3) & 458752) | ((i >> 3) & 3670016), 0);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-1149744211);
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                GlideImageKt.GlideImage(SnapshotStateKt.produceState((Object) null, obj, new ImageKt$GlImage$imagePath$1((Context) consume2, obj, f3, null), startRestartGroup, 582).getValue(), str2, BlurKt.m4152blurF8QBwvs$default(companion, Dp.m6997constructorimpl(f3), null, 2, null), topStart, contentScale2 == null ? ContentScale.INSTANCE.getCrop() : contentScale2, f4, colorFilter2, GlideImageKt.placeholder(drawable3), GlideImageKt.placeholder(drawable4), null, null, startRestartGroup, ((i >> 15) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 8 | ((i >> 6) & 7168) | ((i << 3) & 458752) | ((i >> 3) & 3670016) | (Placeholder.$stable << 21) | (Placeholder.$stable << 24), 0, 1536);
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier2 = companion;
            final float f5 = f3;
            final ContentScale contentScale3 = contentScale2;
            final float f6 = f4;
            final Alignment alignment2 = topStart;
            final String str3 = str2;
            final ColorFilter colorFilter3 = colorFilter2;
            final Drawable drawable5 = drawable3;
            final Drawable drawable6 = drawable4;
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.ImageKt$GlImage$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ImageKt.GlImage(obj, modifier2, f5, contentScale3, f6, alignment2, str3, colorFilter3, drawable5, drawable6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    static /* synthetic */ Object getGlideModel$default(Context context, Object obj, float f, int i, Object obj2) {
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        return getGlideModel(context, obj, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getGlideModel(Context context, Object obj, float f) {
        boolean z = obj instanceof String;
        if (z) {
            String str = z ? (String) obj : null;
            if (str != null && StringsKt.startsWith$default(str, RemoteSettings.FORWARD_SLASH_STRING, false, 2, (Object) null) && !new File((String) obj).exists()) {
                return null;
            }
        }
        if (f == 0.0f || Build.VERSION.SDK_INT >= 31) {
            return obj;
        }
        try {
            obj = ImageUtils.fastBlur(Glide.with(context).asBitmap().load(obj).submit().get(), 0.5f, f);
            Unit unit = Unit.INSTANCE;
            return obj;
        } catch (Exception e) {
            if (!AppContext.INSTANCE.isDebugMode()) {
                return obj;
            }
            LogUtils.e(Log.getStackTraceString(e));
            return obj;
        }
    }
}
