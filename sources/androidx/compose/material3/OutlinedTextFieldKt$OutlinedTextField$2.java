package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
final class OutlinedTextFieldKt$OutlinedTextField$2 extends r implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f10484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f10485c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextStyle f10487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f10488h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f10489i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f10490j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f10491k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f10492l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f10493m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f10494n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f10495o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f10496p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f10497q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f10498r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f10499s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10500t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10501u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f10502v;
    public final /* synthetic */ Shape w;
    public final /* synthetic */ TextFieldColors x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f10503y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f10504z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$OutlinedTextField$2(String str, l lVar, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, int i7) {
        super(2);
        this.f10483a = str;
        this.f10484b = lVar;
        this.f10485c = modifier;
        this.d = z2;
        this.f10486f = z3;
        this.f10487g = textStyle;
        this.f10488h = pVar;
        this.f10489i = pVar2;
        this.f10490j = pVar3;
        this.f10491k = pVar4;
        this.f10492l = pVar5;
        this.f10493m = pVar6;
        this.f10494n = pVar7;
        this.f10495o = z4;
        this.f10496p = visualTransformation;
        this.f10497q = keyboardOptions;
        this.f10498r = keyboardActions;
        this.f10499s = z5;
        this.f10500t = i2;
        this.f10501u = i3;
        this.f10502v = mutableInteractionSource;
        this.w = shape;
        this.x = textFieldColors;
        this.f10503y = i4;
        this.f10504z = i5;
        this.A = i6;
        this.B = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x036c  */
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
            Method dump skipped, instructions count: 1273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
