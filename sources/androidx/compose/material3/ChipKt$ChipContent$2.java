package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ChipKt$ChipContent$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f8320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextStyle f8321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f8322c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f8323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f8324g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f8325h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8326i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f8327j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8328k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8329l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$ChipContent$2(p pVar, TextStyle textStyle, long j2, p pVar2, p pVar3, p pVar4, long j3, long j4, float f2, PaddingValues paddingValues, int i2) {
        super(2);
        this.f8320a = pVar;
        this.f8321b = textStyle;
        this.f8322c = j2;
        this.d = pVar2;
        this.f8323f = pVar3;
        this.f8324g = pVar4;
        this.f8325h = j3;
        this.f8326i = j4;
        this.f8327j = f2;
        this.f8328k = paddingValues;
        this.f8329l = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ChipKt.c(this.f8320a, this.f8321b, this.f8322c, this.d, this.f8323f, this.f8324g, this.f8325h, this.f8326i, this.f8327j, this.f8328k, (Composer) obj, RecomposeScopeImplKt.a(this.f8329l | 1));
        return b0.f30125a;
    }
}
