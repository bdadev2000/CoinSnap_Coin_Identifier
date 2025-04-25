package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aæ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aÜ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aÆ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aÒ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0006\u0018\u00010-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00106\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", TtmlNode.TAG_STYLE, "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextStyle invoke() {
            return TypographyKt.getDefaultTextStyle();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:100:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03cc  */
    /* renamed from: Text--4IGK_g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2038Text4IGK_g(final java.lang.String r64, androidx.compose.ui.Modifier r65, long r66, long r68, androidx.compose.ui.text.font.FontStyle r70, androidx.compose.ui.text.font.FontWeight r71, androidx.compose.ui.text.font.FontFamily r72, long r73, androidx.compose.ui.text.style.TextDecoration r75, androidx.compose.ui.text.style.TextAlign r76, long r77, int r79, boolean r80, int r81, int r82, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r83, androidx.compose.ui.text.TextStyle r84, androidx.compose.runtime.Composer r85, final int r86, final int r87, final int r88) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m2038Text4IGK_g(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a0  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text-fLXpl1I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m2040TextfLXpl1I(final java.lang.String r54, androidx.compose.ui.Modifier r55, long r56, long r58, androidx.compose.ui.text.font.FontStyle r60, androidx.compose.ui.text.font.FontWeight r61, androidx.compose.ui.text.font.FontFamily r62, long r63, androidx.compose.ui.text.style.TextDecoration r65, androidx.compose.ui.text.style.TextAlign r66, long r67, int r69, boolean r70, int r71, kotlin.jvm.functions.Function1 r72, androidx.compose.ui.text.TextStyle r73, androidx.compose.runtime.Composer r74, final int r75, final int r76, final int r77) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m2040TextfLXpl1I(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03e5  */
    /* renamed from: Text-IbK3jfQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2039TextIbK3jfQ(final androidx.compose.ui.text.AnnotatedString r69, androidx.compose.ui.Modifier r70, long r71, long r73, androidx.compose.ui.text.font.FontStyle r75, androidx.compose.ui.text.font.FontWeight r76, androidx.compose.ui.text.font.FontFamily r77, long r78, androidx.compose.ui.text.style.TextDecoration r80, androidx.compose.ui.text.style.TextAlign r81, long r82, int r84, boolean r85, int r86, int r87, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r88, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r89, androidx.compose.ui.text.TextStyle r90, androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94) {
        /*
            Method dump skipped, instructions count: 1243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m2039TextIbK3jfQ(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029c  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text--4IGK_g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m2037Text4IGK_g(final androidx.compose.ui.text.AnnotatedString r52, androidx.compose.ui.Modifier r53, long r54, long r56, androidx.compose.ui.text.font.FontStyle r58, androidx.compose.ui.text.font.FontWeight r59, androidx.compose.ui.text.font.FontFamily r60, long r61, androidx.compose.ui.text.style.TextDecoration r63, androidx.compose.ui.text.style.TextAlign r64, long r65, int r67, boolean r68, int r69, java.util.Map r70, kotlin.jvm.functions.Function1 r71, androidx.compose.ui.text.TextStyle r72, androidx.compose.runtime.Composer r73, final int r74, final int r75, final int r76) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m2037Text4IGK_g(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1772272796);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyle)P(1)394@17636L7,395@17661L80:Text.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1772272796, i2, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:393)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) consume).merge(textStyle)), function2, startRestartGroup, (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
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
                    TextKt.ProvideTextStyle(TextStyle.this, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
