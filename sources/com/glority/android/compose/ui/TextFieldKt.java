package com.glority.android.compose.ui;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001aÌ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001aÁ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020!2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010\"\u001aÊ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020!2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010#\u001aÁ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020!2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020!2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010$\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010&¨\u0006'²\u0006\n\u0010(\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"GlTextField", "", "modifier", "Landroidx/compose/ui/Modifier;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "hintText", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/runtime/Composer;III)V", "", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/runtime/Composer;III)V", "text", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose_release", "hintVisible"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class TextFieldKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GlTextField(androidx.compose.ui.Modifier r37, final androidx.compose.ui.text.input.TextFieldValue r38, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r39, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r40, boolean r41, boolean r42, androidx.compose.ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, int r48, androidx.compose.ui.text.input.VisualTransformation r49, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.ui.graphics.Brush r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.TextFieldKt.GlTextField(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final boolean GlTextField$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GlTextField$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GlTextField(androidx.compose.ui.Modifier r36, final java.lang.String r37, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r38, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, androidx.compose.ui.text.input.VisualTransformation r48, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.ui.graphics.Brush r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.TextFieldKt.GlTextField(androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GlTextField(androidx.compose.ui.Modifier r39, final java.lang.String r40, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r41, java.lang.String r42, boolean r43, boolean r44, androidx.compose.ui.text.TextStyle r45, androidx.compose.foundation.text.KeyboardOptions r46, androidx.compose.foundation.text.KeyboardActions r47, boolean r48, int r49, int r50, androidx.compose.ui.text.input.VisualTransformation r51, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.ui.graphics.Brush r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.TextFieldKt.GlTextField(androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GlTextField(androidx.compose.ui.Modifier r36, final androidx.compose.ui.text.input.TextFieldValue r37, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r38, java.lang.String r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, androidx.compose.ui.text.input.VisualTransformation r48, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.ui.graphics.Brush r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.TextFieldKt.GlTextField(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, java.lang.String, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void text(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(200826688);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(200826688, i, -1, "com.glority.android.compose.ui.text (TextField.kt:224)");
            }
            GlTextField((Modifier) null, "", (Function1<? super String, Unit>) new Function1<String, Unit>() { // from class: com.glority.android.compose.ui.TextFieldKt$text$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, "123", false, false, (TextStyle) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, startRestartGroup, 3504, 0, 65521);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.TextFieldKt$text$2
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
                    TextFieldKt.text(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
