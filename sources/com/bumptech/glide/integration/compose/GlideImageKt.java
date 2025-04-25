package com.bumptech.glide.integration.compose;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.compose.ComposeNavigator;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.integration.compose.Placeholder;
import com.bumptech.glide.integration.compose.RequestState;
import com.bumptech.glide.integration.compose.Transition;
import com.glority.base.utils.StatusBarUtils;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlideImage.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¥\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142*\b\u0002\u0010\u0015\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0018`\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001ak\u0010\u001b\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072*\b\u0002\u0010\u0015\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u001e¢\u0006\u0002\b\u001fH\u0007¢\u0006\u0002\u0010 \u001a'\u0010!\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\"\u001a\u0015\u0010#\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010$\u001a \u0010%\u001a\u00020\u00112\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00010'¢\u0006\u0002\b\u001eH\u0007¢\u0006\u0002\u0010(\u001a\u0012\u0010%\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0018H\u0007\u001a\u0012\u0010%\u001a\u00020\u00112\b\b\u0001\u0010*\u001a\u00020+H\u0007\u001aW\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010-\u001a\u00020.2(\u0010\u0015\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010/\u001a \u00100\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\n\u001a\u00020\u000bH\u0002*@\u00101\u001a\u0004\b\u0000\u00102\"\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H20\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u0002H20\u00170\u00162\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H20\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u0002H20\u00170\u0016¨\u00063"}, d2 = {"GlideImage", "", "model", "", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "loading", "Lcom/bumptech/glide/integration/compose/Placeholder;", "failure", "transition", "Lcom/bumptech/glide/integration/compose/Transition$Factory;", "requestBuilderTransform", "Lkotlin/Function1;", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/integration/compose/RequestBuilderTransform;", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Lcom/bumptech/glide/integration/compose/Placeholder;Lcom/bumptech/glide/integration/compose/Placeholder;Lcom/bumptech/glide/integration/compose/Transition$Factory;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "GlideSubcomposition", "content", "Lcom/bumptech/glide/integration/compose/GlideSubcompositionScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PreviewResourceOrDrawable", "(Lcom/bumptech/glide/integration/compose/Placeholder;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "SimpleLayout", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "placeholder", ComposeNavigator.NAME, "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function2;)Lcom/bumptech/glide/integration/compose/Placeholder;", "drawable", "resourceId", "", "rememberRequestBuilderWithDefaults", "requestManager", "Lcom/bumptech/glide/RequestManager;", "(Ljava/lang/Object;Lcom/bumptech/glide/RequestManager;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lcom/bumptech/glide/RequestBuilder;", "contentScaleTransform", "RequestBuilderTransform", ExifInterface.GPS_DIRECTION_TRUE, "compose_release"}, k = 2, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GlideImageKt {
    public static final void GlideImage(final Object obj, final String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Placeholder placeholder, Placeholder placeholder2, Transition.Factory factory, Function1<? super RequestBuilder<Drawable>, ? extends RequestBuilder<Drawable>> function1, Composer composer, final int i, final int i2, final int i3) {
        Modifier glideNode;
        RequestBuilder<Drawable> apply$compose_release;
        RequestBuilder<Drawable> apply$compose_release2;
        Composer startRestartGroup = composer.startRestartGroup(1955430130);
        ComposerKt.sourceInformation(startRestartGroup, "C(GlideImage)P(7,3,8!1,4!2,6!1,10)");
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final Alignment center = (i3 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        final ContentScale fit = (i3 & 16) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        final float f2 = (i3 & 32) != 0 ? 1.0f : f;
        final ColorFilter colorFilter2 = (i3 & 64) != 0 ? null : colorFilter;
        final Placeholder placeholder3 = (i3 & 128) != 0 ? null : placeholder;
        final Placeholder placeholder4 = (i3 & 256) != 0 ? null : placeholder2;
        final Transition.Factory factory2 = (i3 & 512) != 0 ? null : factory;
        final Function1<? super RequestBuilder<Drawable>, ? extends RequestBuilder<Drawable>> function12 = (i3 & 1024) != 0 ? new Function1<RequestBuilder<Drawable>, RequestBuilder<Drawable>>() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$GlideImage$1
            @Override // kotlin.jvm.functions.Function1
            public final RequestBuilder<Drawable> invoke(RequestBuilder<Drawable> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        } : function1;
        startRestartGroup.startReplaceableGroup(482162156);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context = (Context) consume;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(context);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = Glide.with(context);
            Intrinsics.checkNotNullExpressionValue(rememberedValue, "with(it)");
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        RequestManager requestManager = (RequestManager) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        Intrinsics.checkNotNullExpressionValue(requestManager, "LocalContext.current.let…(it) { Glide.with(it) } }");
        int i4 = i >> 3;
        final RequestBuilder<Drawable> rememberRequestBuilderWithDefaults = rememberRequestBuilderWithDefaults(obj, requestManager, function12, fit, startRestartGroup, ((i2 << 6) & 896) | 72 | (i4 & 7168));
        if (placeholder3 != null && (apply$compose_release2 = placeholder3.apply$compose_release(new GlideImageKt$GlideImage$requestBuilder$1$1(rememberRequestBuilderWithDefaults), new GlideImageKt$GlideImage$requestBuilder$1$2(rememberRequestBuilderWithDefaults))) != null) {
            rememberRequestBuilderWithDefaults = apply$compose_release2;
        }
        if (placeholder4 != null && (apply$compose_release = placeholder4.apply$compose_release(new GlideImageKt$GlideImage$requestBuilder$2$1(rememberRequestBuilderWithDefaults), new GlideImageKt$GlideImage$requestBuilder$2$2(rememberRequestBuilderWithDefaults))) != null) {
            rememberRequestBuilderWithDefaults = apply$compose_release;
        }
        startRestartGroup.startReplaceableGroup(482162656);
        ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localInspectionMode);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (((Boolean) consume2).booleanValue() && placeholder3 != null && placeholder3.isResourceOrDrawable$compose_release()) {
            PreviewResourceOrDrawable(placeholder3, str, modifier2, startRestartGroup, ((i >> 21) & 14) | (i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i & 896));
            startRestartGroup.endReplaceableGroup();
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$GlideImage$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    GlideImageKt.GlideImage(obj, str, modifier2, center, fit, f2, colorFilter2, placeholder3, placeholder4, factory2, function12, composer2, i | 1, i2, i3);
                }
            });
            return;
        }
        startRestartGroup.endReplaceableGroup();
        Function2<Composer, Integer, Unit> maybeComposable$compose_release = placeholder3 != null ? placeholder3.maybeComposable$compose_release() : null;
        Function2<Composer, Integer, Unit> maybeComposable$compose_release2 = placeholder4 != null ? placeholder4.maybeComposable$compose_release() : null;
        if (maybeComposable$compose_release == null && maybeComposable$compose_release2 == null) {
            startRestartGroup.startReplaceableGroup(482163560);
            glideNode = GlideModifierKt.glideNode(modifier2, rememberRequestBuilderWithDefaults, (r19 & 2) != 0 ? null : str, (r19 & 4) != 0 ? null : center, (r19 & 8) != 0 ? null : fit, (r19 & 16) != 0 ? null : Float.valueOf(f2), (r19 & 32) != 0 ? null : colorFilter2, (r19 & 64) != 0 ? null : factory2, (r19 & 128) != 0 ? null : null, (r19 & 256) == 0 ? null : null);
            SimpleLayout(glideNode, startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(482163071);
            final Function2<Composer, Integer, Unit> function2 = maybeComposable$compose_release;
            final Function2<Composer, Integer, Unit> function22 = maybeComposable$compose_release2;
            final Modifier modifier3 = modifier2;
            final Alignment alignment2 = center;
            final ContentScale contentScale2 = fit;
            final float f3 = f2;
            final ColorFilter colorFilter3 = colorFilter2;
            GlideSubcomposition(obj, modifier2, new Function1<RequestBuilder<Drawable>, RequestBuilder<Drawable>>() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$GlideImage$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final RequestBuilder<Drawable> invoke(RequestBuilder<Drawable> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return rememberRequestBuilderWithDefaults;
                }
            }, ComposableLambdaKt.composableLambda(startRestartGroup, -1823704622, true, new Function3<GlideSubcompositionScope, Composer, Integer, Unit>() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$GlideImage$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(GlideSubcompositionScope glideSubcompositionScope, Composer composer2, Integer num) {
                    invoke(glideSubcompositionScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GlideSubcompositionScope GlideSubcomposition, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(GlideSubcomposition, "$this$GlideSubcomposition");
                    if ((i5 & 14) == 0) {
                        i5 |= composer2.changed(GlideSubcomposition) ? 4 : 2;
                    }
                    if ((i5 & 91) != 18 || !composer2.getSkipping()) {
                        if (Intrinsics.areEqual(GlideSubcomposition.getState(), RequestState.Loading.INSTANCE) && function2 != null) {
                            composer2.startReplaceableGroup(-1111684313);
                            function2.invoke(composer2, 0);
                            composer2.endReplaceableGroup();
                            return;
                        }
                        if (Intrinsics.areEqual(GlideSubcomposition.getState(), RequestState.Failure.INSTANCE) && function22 != null) {
                            composer2.startReplaceableGroup(-1111684206);
                            function22.invoke(composer2, 0);
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.startReplaceableGroup(-1111684163);
                        Painter painter = GlideSubcomposition.getPainter();
                        String str2 = str;
                        Modifier modifier4 = modifier3;
                        Alignment alignment3 = alignment2;
                        ContentScale contentScale3 = contentScale2;
                        float f4 = f3;
                        ColorFilter colorFilter4 = colorFilter3;
                        int i6 = i;
                        ImageKt.Image(painter, str2, modifier4, alignment3, contentScale3, f4, colorFilter4, composer2, (i6 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 8 | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (i6 & 3670016), 0);
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i4 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 3080, 0);
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 == null) {
            return;
        }
        endRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$GlideImage$5
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                GlideImageKt.GlideImage(obj, str, modifier2, center, fit, f2, colorFilter2, placeholder3, placeholder4, factory2, function12, composer2, i | 1, i2, i3);
            }
        });
    }

    public static final void GlideSubcomposition(final Object obj, Modifier modifier, Function1<? super RequestBuilder<Drawable>, ? extends RequestBuilder<Drawable>> function1, final Function3<? super GlideSubcompositionScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier glideNode;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(289486858);
        ComposerKt.sourceInformation(startRestartGroup, "C(GlideSubcomposition)P(1,2,3)");
        final Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final GlideImageKt$GlideSubcomposition$1 glideImageKt$GlideSubcomposition$1 = (i2 & 4) != 0 ? new Function1<RequestBuilder<Drawable>, RequestBuilder<Drawable>>() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$GlideSubcomposition$1
            @Override // kotlin.jvm.functions.Function1
            public final RequestBuilder<Drawable> invoke(RequestBuilder<Drawable> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        } : function1;
        startRestartGroup.startReplaceableGroup(1096724336);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context = (Context) consume;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(context);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = Glide.with(context);
            Intrinsics.checkNotNullExpressionValue(rememberedValue, "with(it)");
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        RequestManager requestManager = (RequestManager) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        Intrinsics.checkNotNullExpressionValue(requestManager, "LocalContext.current.let…(it) { Glide.with(it) } }");
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed2 = startRestartGroup.changed(obj) | startRestartGroup.changed(requestManager) | startRestartGroup.changed(glideImageKt$GlideSubcomposition$1);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            RequestBuilder<Drawable> load = requestManager.load(obj);
            Intrinsics.checkNotNullExpressionValue(load, "requestManager.load(model)");
            rememberedValue2 = (RequestBuilder) glideImageKt$GlideSubcomposition$1.invoke(load);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        RequestBuilder requestBuilder = (RequestBuilder) rememberedValue2;
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed3 = startRestartGroup.changed(obj) | startRestartGroup.changed(requestManager) | startRestartGroup.changed(glideImageKt$GlideSubcomposition$1);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(RequestState.Loading.INSTANCE, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue3;
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed4 = startRestartGroup.changed(obj) | startRestartGroup.changed(requestManager) | startRestartGroup.changed(glideImageKt$GlideSubcomposition$1);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue4;
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed5 = startRestartGroup.changed(obj) | startRestartGroup.changed(requestManager) | startRestartGroup.changed(glideImageKt$GlideSubcomposition$1);
        Object rememberedValue5 = startRestartGroup.rememberedValue();
        if (changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new StateTrackingListener(mutableState, mutableState2);
            startRestartGroup.updateRememberedValue(rememberedValue5);
        }
        startRestartGroup.endReplaceableGroup();
        GlideSubcompositionScopeImpl glideSubcompositionScopeImpl = new GlideSubcompositionScopeImpl((Drawable) mutableState2.getValue(), (RequestState) mutableState.getValue());
        glideNode = GlideModifierKt.glideNode(companion, requestBuilder, (r19 & 2) != 0 ? null : null, (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : null, (r19 & 16) != 0 ? null : null, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? null : null, (r19 & 128) != 0 ? null : (StateTrackingListener) rememberedValue5, (r19 & 256) == 0 ? false : null);
        startRestartGroup.startReplaceableGroup(733328855);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(glideNode);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        content.invoke(glideSubcompositionScopeImpl, startRestartGroup, Integer.valueOf(((i >> 6) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 8));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$GlideSubcomposition$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                GlideImageKt.GlideSubcomposition(obj, companion, glideImageKt$GlideSubcomposition$1, content, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewResourceOrDrawable(final Placeholder placeholder, final String str, final Modifier modifier, Composer composer, final int i) {
        int i2;
        Drawable drawable;
        Composer startRestartGroup = composer.startRestartGroup(-1753501208);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(placeholder) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startReplaceableGroup(910160217);
            if (placeholder instanceof Placeholder.OfDrawable) {
                drawable = ((Placeholder.OfDrawable) placeholder).getDrawable();
            } else {
                if (!(placeholder instanceof Placeholder.OfResourceId)) {
                    if (!(placeholder instanceof Placeholder.OfComposable)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException("Composables should go through the production codepath");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                drawable = ((Context) consume).getDrawable(((Placeholder.OfResourceId) placeholder).getResourceId());
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(drawable);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = PainterKt.toPainter(drawable);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            ImageKt.Image((Painter) rememberedValue, str, modifier, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 8 | (i2 & 896), 120);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$PreviewResourceOrDrawable$2
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
                GlideImageKt.PreviewResourceOrDrawable(Placeholder.this, str, modifier, composer2, i | 1);
            }
        });
    }

    public static final Placeholder placeholder(Drawable drawable) {
        return new Placeholder.OfDrawable(drawable);
    }

    public static final Placeholder placeholder(int i) {
        return new Placeholder.OfResourceId(i);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Using this method forces recomposition when the image load state changes. If you require this behavior use GlideSubcomposition instead")
    public static final Placeholder placeholder(Function2<? super Composer, ? super Integer, Unit> composable) {
        Intrinsics.checkNotNullParameter(composable, "composable");
        return new Placeholder.OfComposable(composable);
    }

    private static final RequestBuilder<Drawable> rememberRequestBuilderWithDefaults(Object obj, RequestManager requestManager, Function1<? super RequestBuilder<Drawable>, ? extends RequestBuilder<Drawable>> function1, ContentScale contentScale, Composer composer, int i) {
        composer.startReplaceableGroup(1761561633);
        Object[] objArr = {obj, requestManager, function1, contentScale};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z |= composer.changed(objArr[i2]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            RequestBuilder<Drawable> load = requestManager.load(obj);
            Intrinsics.checkNotNullExpressionValue(load, "requestManager.load(model)");
            rememberedValue = (RequestBuilder) function1.invoke(contentScaleTransform(load, contentScale));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        RequestBuilder<Drawable> requestBuilder = (RequestBuilder) rememberedValue;
        composer.endReplaceableGroup();
        return requestBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestBuilder<Drawable> contentScaleTransform(RequestBuilder<Drawable> requestBuilder, ContentScale contentScale) {
        if (Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getCrop())) {
            Cloneable optionalCenterCrop = requestBuilder.optionalCenterCrop();
            Intrinsics.checkNotNullExpressionValue(optionalCenterCrop, "{\n      optionalCenterCrop()\n    }");
            return (RequestBuilder) optionalCenterCrop;
        }
        if (!Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getInside()) && !Intrinsics.areEqual(contentScale, ContentScale.INSTANCE.getFit())) {
            return requestBuilder;
        }
        Cloneable optionalCenterInside = requestBuilder.optionalCenterInside();
        Intrinsics.checkNotNullExpressionValue(optionalCenterInside, "{\n      // Outside compo…ionalCenterInside()\n    }");
        return (RequestBuilder) optionalCenterInside;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SimpleLayout(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1856253139);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            GlideImageKt$SimpleLayout$1 glideImageKt$SimpleLayout$1 = new MeasurePolicy() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$SimpleLayout$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo342measure3p2s80s(MeasureScope Layout, List<? extends Measurable> list, long j) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                    return MeasureScope.layout$default(Layout, Constraints.m6952getMinWidthimpl(j), Constraints.m6951getMinHeightimpl(j), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$SimpleLayout$1$measure$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(544976794);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(1)122@4734L23,125@4885L385:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            final Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            startRestartGroup.startReplaceableGroup(1405779621);
            ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new Function0<ComposeUiNode>() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$SimpleLayout$$inlined$Layout$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final ComposeUiNode invoke() {
                        return Function0.this.invoke();
                    }
                });
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl, glideImageKt$SimpleLayout$1, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.bumptech.glide.integration.compose.GlideImageKt$SimpleLayout$2
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
                GlideImageKt.SimpleLayout(Modifier.this, composer2, i | 1);
            }
        });
    }
}
