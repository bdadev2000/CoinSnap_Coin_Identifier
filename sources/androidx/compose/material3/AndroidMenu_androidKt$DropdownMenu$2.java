package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.PopupProperties;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AndroidMenu_androidKt$DropdownMenu$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f7610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f7611c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ScrollState f7612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ PopupProperties f7613g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Shape f7614h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7615i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f7616j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f7617k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f7618l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f7619m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f7620n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7621o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7622p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$2(boolean z2, q0.a aVar, Modifier modifier, long j2, ScrollState scrollState, PopupProperties popupProperties, Shape shape, long j3, float f2, float f3, BorderStroke borderStroke, q qVar, int i2, int i3, int i4) {
        super(2);
        this.f7609a = z2;
        this.f7610b = aVar;
        this.f7611c = modifier;
        this.d = j2;
        this.f7612f = scrollState;
        this.f7613g = popupProperties;
        this.f7614h = shape;
        this.f7615i = j3;
        this.f7616j = f2;
        this.f7617k = f3;
        this.f7618l = borderStroke;
        this.f7619m = qVar;
        this.f7620n = i2;
        this.f7621o = i3;
        this.f7622p = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AndroidMenu_androidKt.a(this.f7609a, this.f7610b, this.f7611c, this.d, this.f7612f, this.f7613g, this.f7614h, this.f7615i, this.f7616j, this.f7617k, this.f7618l, this.f7619m, (Composer) obj, RecomposeScopeImplKt.a(this.f7620n | 1), RecomposeScopeImplKt.a(this.f7621o), this.f7622p);
        return b0.f30125a;
    }
}
