package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class ChipKt$InputChip$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f8411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f8412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f8413c;
    public final /* synthetic */ Modifier d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f8414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f8415g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f8416h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f8417i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Shape f8418j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SelectableChipColors f8419k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectableChipElevation f8420l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f8421m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8422n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8423o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8424p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8425q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$InputChip$2(boolean z2, q0.a aVar, p pVar, Modifier modifier, boolean z3, p pVar2, p pVar3, p pVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4) {
        super(2);
        this.f8411a = z2;
        this.f8412b = aVar;
        this.f8413c = pVar;
        this.d = modifier;
        this.f8414f = z3;
        this.f8415g = pVar2;
        this.f8416h = pVar3;
        this.f8417i = pVar4;
        this.f8418j = shape;
        this.f8419k = selectableChipColors;
        this.f8420l = selectableChipElevation;
        this.f8421m = borderStroke;
        this.f8422n = mutableInteractionSource;
        this.f8423o = i2;
        this.f8424p = i3;
        this.f8425q = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f2, code lost:
    
        if (r2 != false) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x035e  */
    @Override // q0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r59, java.lang.Object r60) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt$InputChip$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
