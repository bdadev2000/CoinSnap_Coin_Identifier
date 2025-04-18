package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$Popup$9 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f17642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f17643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PopupProperties f17644c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$9(PopupPositionProvider popupPositionProvider, q0.a aVar, PopupProperties popupProperties, p pVar, int i2, int i3) {
        super(2);
        this.f17642a = popupPositionProvider;
        this.f17643b = aVar;
        this.f17644c = popupProperties;
        this.d = pVar;
        this.f17645f = i2;
        this.f17646g = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AndroidPopup_androidKt.a(this.f17642a, this.f17643b, this.f17644c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f17645f | 1), this.f17646g);
        return b0.f30125a;
    }
}
