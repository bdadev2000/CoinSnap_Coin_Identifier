package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class VectorComposeKt$Group$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f15413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f15414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f15415c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f15416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f15417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f15418h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f15419i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f15420j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f15421k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f15422l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f15423m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorComposeKt$Group$4(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, p pVar, int i2, int i3) {
        super(2);
        this.f15413a = str;
        this.f15414b = f2;
        this.f15415c = f3;
        this.d = f4;
        this.f15416f = f5;
        this.f15417g = f6;
        this.f15418h = f7;
        this.f15419i = f8;
        this.f15420j = list;
        this.f15421k = pVar;
        this.f15422l = i2;
        this.f15423m = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        VectorComposeKt.a(this.f15413a, this.f15414b, this.f15415c, this.d, this.f15416f, this.f15417g, this.f15418h, this.f15419i, this.f15420j, this.f15421k, (Composer) obj, RecomposeScopeImplKt.a(this.f15422l | 1), this.f15423m);
        return b0.f30125a;
    }
}
