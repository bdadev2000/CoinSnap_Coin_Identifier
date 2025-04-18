package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.DpKt;
import q0.p;

/* loaded from: classes3.dex */
public final class BasicTextFieldKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldDecorator f5458a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final long f5459b;

    static {
        float f2 = 40;
        f5459b = DpKt.b(f2, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e1, code lost:
    
        if (r2.I(r69) == false) goto L170;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0486 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x039c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.foundation.text.input.TextFieldState r54, androidx.compose.ui.Modifier r55, boolean r56, boolean r57, androidx.compose.foundation.text.input.InputTransformation r58, androidx.compose.ui.text.TextStyle r59, androidx.compose.foundation.text.KeyboardOptions r60, androidx.compose.foundation.text.input.KeyboardActionHandler r61, androidx.compose.foundation.text.input.TextFieldLineLimits r62, q0.p r63, androidx.compose.foundation.interaction.MutableInteractionSource r64, androidx.compose.ui.graphics.Brush r65, androidx.compose.foundation.text.input.internal.CodepointTransformation r66, androidx.compose.foundation.text.input.OutputTransformation r67, androidx.compose.foundation.text.input.TextFieldDecorator r68, androidx.compose.foundation.ScrollState r69, boolean r70, androidx.compose.runtime.Composer r71, int r72, int r73, int r74) {
        /*
            Method dump skipped, instructions count: 1509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.a(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, q0.p, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.internal.CodepointTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.text.input.TextFieldValue r37, q0.l r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, androidx.compose.ui.text.input.VisualTransformation r48, q0.l r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.ui.graphics.Brush r51, q0.q r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.b(androidx.compose.ui.text.input.TextFieldValue, q0.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, q0.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, q0.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x032b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x034a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0364  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(java.lang.String r40, q0.l r41, androidx.compose.ui.Modifier r42, boolean r43, boolean r44, androidx.compose.ui.text.TextStyle r45, androidx.compose.foundation.text.KeyboardOptions r46, androidx.compose.foundation.text.KeyboardActions r47, boolean r48, int r49, int r50, androidx.compose.ui.text.input.VisualTransformation r51, q0.l r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.ui.graphics.Brush r54, q0.q r55, androidx.compose.runtime.Composer r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.c(java.lang.String, q0.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, q0.l, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, q0.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void d(final TextFieldSelectionState textFieldSelectionState, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1991581797);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(textFieldSelectionState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.e(new BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1(textFieldSelectionState));
                g2.o(u2);
            }
            if (((TextFieldHandleState) ((State) u2).getValue()).f6687a) {
                g2.J(-317108348);
                boolean w = g2.w(textFieldSelectionState);
                Object u3 = g2.u();
                if (w || u3 == composer$Companion$Empty$1) {
                    u3 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        public final long a() {
                            return TextFieldSelectionState.this.m(true).f6688b;
                        }
                    };
                    g2.o(u3);
                }
                OffsetProvider offsetProvider = (OffsetProvider) u3;
                Modifier.Companion companion = Modifier.Companion.f14687a;
                boolean w2 = g2.w(textFieldSelectionState);
                Object u4 = g2.u();
                if (w2 || u4 == composer$Companion$Empty$1) {
                    u4 = new BasicTextFieldKt$TextFieldCursorHandle$2$1(textFieldSelectionState, null);
                    g2.o(u4);
                }
                AndroidCursorHandle_androidKt.a(offsetProvider, SuspendingPointerInputFilterKt.b(companion, textFieldSelectionState, (p) u4), f5459b, g2, 384, 0);
                g2.V(false);
            } else {
                g2.J(-316683586);
                g2.V(false);
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BasicTextFieldKt$TextFieldCursorHandle$3(textFieldSelectionState, i2);
        }
    }

    public static final void e(final TextFieldSelectionState textFieldSelectionState, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(2025287684);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(textFieldSelectionState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.e(new BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1(textFieldSelectionState));
                g2.o(u2);
            }
            State state = (State) u2;
            boolean z2 = ((TextFieldHandleState) state.getValue()).f6687a;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            if (z2) {
                g2.J(-1353986043);
                boolean w = g2.w(textFieldSelectionState);
                Object u3 = g2.u();
                if (w || u3 == composer$Companion$Empty$1) {
                    u3 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        public final long a() {
                            return TextFieldSelectionState.this.r(true, true).f6688b;
                        }
                    };
                    g2.o(u3);
                }
                OffsetProvider offsetProvider = (OffsetProvider) u3;
                ResolvedTextDirection resolvedTextDirection = ((TextFieldHandleState) state.getValue()).f6689c;
                boolean z3 = ((TextFieldHandleState) state.getValue()).d;
                boolean w2 = g2.w(textFieldSelectionState);
                Object u4 = g2.u();
                if (w2 || u4 == composer$Companion$Empty$1) {
                    u4 = new BasicTextFieldKt$TextFieldSelectionHandles$2$1(textFieldSelectionState, null);
                    g2.o(u4);
                }
                AndroidSelectionHandles_androidKt.b(offsetProvider, true, resolvedTextDirection, z3, f5459b, SuspendingPointerInputFilterKt.b(companion, textFieldSelectionState, (p) u4), g2, 24624, 0);
                g2.V(false);
            } else {
                g2.J(-1353409443);
                g2.V(false);
            }
            Object u5 = g2.u();
            if (u5 == composer$Companion$Empty$1) {
                u5 = SnapshotStateKt.e(new BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1(textFieldSelectionState));
                g2.o(u5);
            }
            State state2 = (State) u5;
            if (((TextFieldHandleState) state2.getValue()).f6687a) {
                g2.J(-1353116090);
                boolean w3 = g2.w(textFieldSelectionState);
                Object u6 = g2.u();
                if (w3 || u6 == composer$Companion$Empty$1) {
                    u6 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        public final long a() {
                            return TextFieldSelectionState.this.r(false, true).f6688b;
                        }
                    };
                    g2.o(u6);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) u6;
                ResolvedTextDirection resolvedTextDirection2 = ((TextFieldHandleState) state2.getValue()).f6689c;
                boolean z4 = ((TextFieldHandleState) state2.getValue()).d;
                boolean w4 = g2.w(textFieldSelectionState);
                Object u7 = g2.u();
                if (w4 || u7 == composer$Companion$Empty$1) {
                    u7 = new BasicTextFieldKt$TextFieldSelectionHandles$4$1(textFieldSelectionState, null);
                    g2.o(u7);
                }
                AndroidSelectionHandles_androidKt.b(offsetProvider2, false, resolvedTextDirection2, z4, f5459b, SuspendingPointerInputFilterKt.b(companion, textFieldSelectionState, (p) u7), g2, 24624, 0);
                g2.V(false);
            } else {
                g2.J(-1352540451);
                g2.V(false);
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BasicTextFieldKt$TextFieldSelectionHandles$5(textFieldSelectionState, i2);
        }
    }
}
