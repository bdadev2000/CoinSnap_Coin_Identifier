package com.glority.android.compose.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ResizableText.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\u001aÚ\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aÄ\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020 2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\r\u0010)\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010*\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0001X\u008a\u008e\u0002"}, d2 = {"MAX_AUTO_SIZE_STEPS", "", "ResizableText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", TtmlNode.TAG_STYLE, "Landroidx/compose/ui/text/TextStyle;", "maxResizeStep", "ResizableText-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Landroidx/compose/ui/text/TextStyle;ILandroidx/compose/runtime/Composer;III)V", "ResizableText--4IGK_g", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILandroidx/compose/ui/text/TextStyle;ILandroidx/compose/runtime/Composer;III)V", "textTest", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose_release", "multiplier", "", LogEventArguments.ARG_STEP}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ResizableTextKt {
    private static final int MAX_AUTO_SIZE_STEPS = 4;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void textTest(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(852930627);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852930627, i, -1, "com.glority.android.compose.ui.textTest (ResizableText.kt:33)");
            }
            m7716ResizableText4IGK_g("Hello World1 Hello World2 Hello World3 Hello World4 Hello World5 Hello World6", SizeKt.m1016height3ABfNKs(SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(200)), Dp.m6997constructorimpl(20)), 0L, TextUnitKt.getSp(32), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, 0, startRestartGroup, 3126, 0, 131060);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.ResizableTextKt$textTest$1
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

                public final void invoke(Composer composer2, int i2) {
                    ResizableTextKt.textTest(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ba  */
    /* renamed from: ResizableText--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m7716ResizableText4IGK_g(final java.lang.String r53, androidx.compose.ui.Modifier r54, long r55, long r57, androidx.compose.ui.text.font.FontStyle r59, androidx.compose.ui.text.font.FontWeight r60, androidx.compose.ui.text.font.FontFamily r61, long r62, androidx.compose.ui.text.style.TextDecoration r64, androidx.compose.ui.text.style.TextAlign r65, long r66, int r68, boolean r69, int r70, int r71, androidx.compose.ui.text.TextStyle r72, int r73, androidx.compose.runtime.Composer r74, final int r75, final int r76, final int r77) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.ResizableTextKt.m7716ResizableText4IGK_g(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, androidx.compose.ui.text.TextStyle, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03cb  */
    /* renamed from: ResizableText-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m7717ResizableTextIbK3jfQ(final androidx.compose.ui.text.AnnotatedString r51, androidx.compose.ui.Modifier r52, long r53, long r55, androidx.compose.ui.text.font.FontStyle r57, androidx.compose.ui.text.font.FontWeight r58, androidx.compose.ui.text.font.FontFamily r59, long r60, androidx.compose.ui.text.style.TextDecoration r62, androidx.compose.ui.text.style.TextAlign r63, long r64, int r66, boolean r67, int r68, int r69, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r70, androidx.compose.ui.text.TextStyle r71, int r72, androidx.compose.runtime.Composer r73, final int r74, final int r75, final int r76) {
        /*
            Method dump skipped, instructions count: 1295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.ResizableTextKt.m7717ResizableTextIbK3jfQ(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, androidx.compose.ui.text.TextStyle, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ResizableText_IbK3jfQ$lambda$2(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ResizableText_IbK3jfQ$lambda$3(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ResizableText_IbK3jfQ$lambda$5(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ResizableText_IbK3jfQ$lambda$6(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }
}
