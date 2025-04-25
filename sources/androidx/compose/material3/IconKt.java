package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: Icon.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0011\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"DefaultIconSizeModifier", "Landroidx/compose/ui/Modifier;", "Icon", "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "contentDescription", "", "modifier", "tint", "Landroidx/compose/ui/graphics/Color;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/ColorProducer;", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/ColorProducer;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "defaultSizeFor", "defaultSizeForColorProducer", "isInfinite", "", "Landroidx/compose/ui/geometry/Size;", "isInfinite-uvyYCjk", "(J)Z", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, IconButtonTokens.INSTANCE.m3611getIconSizeD9Ej5fM());

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004c  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2471Iconww6aTOc(final androidx.compose.ui.graphics.vector.ImageVector r17, final java.lang.String r18, androidx.compose.ui.Modifier r19, long r20, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.m2471Iconww6aTOc(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2469Iconww6aTOc(final androidx.compose.ui.graphics.ImageBitmap r21, final java.lang.String r22, androidx.compose.ui.Modifier r23, long r24, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.m2469Iconww6aTOc(androidx.compose.ui.graphics.ImageBitmap, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0077  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2470Iconww6aTOc(final androidx.compose.ui.graphics.painter.Painter r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, long r23, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.m2470Iconww6aTOc(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void Icon(final Painter painter, final ColorProducer colorProducer, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(1755070997);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)P(2,3)206@9303L163,202@9171L330:Icon.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(colorProducer) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1755070997, i3, -1, "androidx.compose.material3.Icon (Icon.kt:191)");
            }
            startRestartGroup.startReplaceGroup(-2144829472);
            ComposerKt.sourceInformation(startRestartGroup, "194@9002L115");
            if (str != null) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2144827505, "CC(remember):Icon.kt#9igjgp");
                boolean z = (i3 & 896) == 256;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconKt$Icon$semantics$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                            SemanticsPropertiesKt.m6289setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6273getImageo7Vup1c());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                companion = SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue, 1, null);
            } else {
                companion = Modifier.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
            Modifier defaultSizeForColorProducer = defaultSizeForColorProducer(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier), painter);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2144817825, "CC(remember):Icon.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(painter) | startRestartGroup.changedInstance(colorProducer);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.IconKt$Icon$4$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        ColorFilter colorFilter;
                        Painter painter2 = Painter.this;
                        ColorProducer colorProducer2 = colorProducer;
                        long mo5071getSizeNHjbRc = drawScope.mo5071getSizeNHjbRc();
                        if (colorProducer2 != null) {
                            colorFilter = ColorFilter.Companion.m4556tintxETnrds$default(ColorFilter.INSTANCE, colorProducer2.mo2041invoke0d7_KjU(), 0, 2, null);
                        } else {
                            colorFilter = null;
                        }
                        Painter.m5197drawx_KDEd0$default(painter2, drawScope, mo5071getSizeNHjbRc, 0.0f, colorFilter, 2, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            BoxKt.Box(DrawModifierKt.drawBehind(defaultSizeForColorProducer, (Function1) rememberedValue2).then(companion), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconKt$Icon$5
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

                public final void invoke(Composer composer2, int i5) {
                    IconKt.Icon(Painter.this, colorProducer, str, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    private static final Modifier defaultSizeForColorProducer(Modifier modifier, Painter painter) {
        Modifier modifier2;
        if (Size.m4339equalsimpl0(painter.getDrawableIntrinsicSize(), Size.INSTANCE.m4351getUnspecifiedNHjbRc()) || m2472isInfiniteuvyYCjk(painter.getDrawableIntrinsicSize())) {
            modifier2 = DefaultIconSizeModifier;
        } else {
            long drawableIntrinsicSize = painter.getDrawableIntrinsicSize();
            final float m4343getWidthimpl = Size.m4343getWidthimpl(drawableIntrinsicSize);
            final float m4340getHeightimpl = Size.m4340getHeightimpl(drawableIntrinsicSize);
            modifier2 = LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.IconKt$defaultSizeForColorProducer$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                    return m2473invoke3p2s80s(measureScope, measurable, constraints.getValue());
                }

                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                public final MeasureResult m2473invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                    final Placeable mo5851measureBRTryo0 = measurable.mo5851measureBRTryo0(Constraints.INSTANCE.m6960fixedJhjzzOo((int) m4343getWidthimpl, (int) m4340getHeightimpl));
                    return MeasureScope.layout$default(measureScope, mo5851measureBRTryo0.getWidth(), mo5851measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.IconKt$defaultSizeForColorProducer$1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            });
        }
        return modifier.then(modifier2);
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        Modifier.Companion companion;
        if (Size.m4339equalsimpl0(painter.getDrawableIntrinsicSize(), Size.INSTANCE.m4351getUnspecifiedNHjbRc()) || m2472isInfiniteuvyYCjk(painter.getDrawableIntrinsicSize())) {
            companion = DefaultIconSizeModifier;
        } else {
            companion = Modifier.INSTANCE;
        }
        return modifier.then(companion);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m2472isInfiniteuvyYCjk(long j) {
        return Float.isInfinite(Size.m4343getWidthimpl(j)) && Float.isInfinite(Size.m4340getHeightimpl(j));
    }
}
