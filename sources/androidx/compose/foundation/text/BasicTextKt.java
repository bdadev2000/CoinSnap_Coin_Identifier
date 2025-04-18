package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import d0.k;
import java.util.ArrayList;
import java.util.List;
import q0.l;

/* loaded from: classes4.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0350 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.text.AnnotatedString r44, androidx.compose.ui.Modifier r45, androidx.compose.ui.text.TextStyle r46, q0.l r47, int r48, boolean r49, int r50, int r51, java.util.Map r52, androidx.compose.ui.graphics.ColorProducer r53, androidx.compose.runtime.Composer r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.a(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, q0.l, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r31, androidx.compose.ui.Modifier r32, androidx.compose.ui.text.TextStyle r33, q0.l r34, int r35, boolean r36, int r37, int r38, androidx.compose.ui.graphics.ColorProducer r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.b(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, q0.l, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.ComposerImpl] */
    /* JADX WARN: Type inference failed for: r11v11, types: [e0.w] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [androidx.compose.foundation.text.TextLinkScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.Modifier r36, androidx.compose.ui.text.AnnotatedString r37, q0.l r38, boolean r39, java.util.Map r40, androidx.compose.ui.text.TextStyle r41, int r42, boolean r43, int r44, int r45, androidx.compose.ui.text.font.FontFamily.Resolver r46, androidx.compose.foundation.text.modifiers.SelectionController r47, androidx.compose.ui.graphics.ColorProducer r48, q0.l r49, androidx.compose.runtime.Composer r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.c(androidx.compose.ui.Modifier, androidx.compose.ui.text.AnnotatedString, q0.l, boolean, java.util.Map, androidx.compose.ui.text.TextStyle, int, boolean, int, int, androidx.compose.ui.text.font.FontFamily$Resolver, androidx.compose.foundation.text.modifiers.SelectionController, androidx.compose.ui.graphics.ColorProducer, q0.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.foundation.text.TextRangeLayoutMeasureScope, java.lang.Object] */
    public static final ArrayList d(List list, q0.a aVar) {
        if (!((Boolean) aVar.invoke()).booleanValue()) {
            return null;
        }
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = (Measurable) list.get(i2);
            Object m2 = measurable.m();
            p0.a.q(m2, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            TextRangeLayoutMeasureResult a2 = ((TextRangeLayoutModifier) m2).f6244a.a(obj);
            int i3 = a2.f6241a;
            int i4 = a2.f6242b;
            arrayList.add(new k(measurable.V(Constraints.Companion.b(i3, i3, i4, i4)), a2.f6243c));
        }
        return arrayList;
    }

    public static final Modifier e(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, l lVar, int i2, boolean z2, int i3, int i4, FontFamily.Resolver resolver, List list, l lVar2, SelectionController selectionController, ColorProducer colorProducer, l lVar3) {
        if (selectionController == null) {
            return modifier.T0(Modifier.Companion.f14687a).T0(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, lVar, i2, z2, i3, i4, list, lVar2, colorProducer, lVar3));
        }
        return modifier.T0(selectionController.f6944g).T0(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, lVar, i2, z2, i3, i4, list, lVar2, selectionController, colorProducer));
    }
}
