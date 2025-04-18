package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
final class TextFieldKt$TextField$4 extends r implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f12147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f12148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f12149c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f12150f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextStyle f12151g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f12152h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f12153i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f12154j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f12155k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f12156l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f12157m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f12158n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f12159o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f12160p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f12161q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f12162r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f12163s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12164t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12165u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f12166v;
    public final /* synthetic */ Shape w;
    public final /* synthetic */ TextFieldColors x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f12167y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f12168z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$TextField$4(TextFieldValue textFieldValue, l lVar, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, int i7) {
        super(2);
        this.f12147a = textFieldValue;
        this.f12148b = lVar;
        this.f12149c = modifier;
        this.d = z2;
        this.f12150f = z3;
        this.f12151g = textStyle;
        this.f12152h = pVar;
        this.f12153i = pVar2;
        this.f12154j = pVar3;
        this.f12155k = pVar4;
        this.f12156l = pVar5;
        this.f12157m = pVar6;
        this.f12158n = pVar7;
        this.f12159o = z4;
        this.f12160p = visualTransformation;
        this.f12161q = keyboardOptions;
        this.f12162r = keyboardActions;
        this.f12163s = z5;
        this.f12164t = i2;
        this.f12165u = i3;
        this.f12166v = mutableInteractionSource;
        this.w = shape;
        this.x = textFieldColors;
        this.f12167y = i4;
        this.f12168z = i5;
        this.A = i6;
        this.B = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c9  */
    @Override // q0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r74, java.lang.Object r75) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt$TextField$4.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
