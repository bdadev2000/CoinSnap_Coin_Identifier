package y1;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class p extends E1.d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I1.b f24318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E1.d f24319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A1.b f24320h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(I1.b bVar, E1.d dVar, A1.b bVar2) {
        super(4);
        this.f24318f = bVar;
        this.f24319g = dVar;
        this.f24320h = bVar2;
    }

    @Override // E1.d
    public final Object s(I1.b bVar) {
        Object obj;
        float f9 = bVar.f1421a;
        float f10 = bVar.b;
        String str = ((A1.b) bVar.f1422c).f4a;
        String str2 = ((A1.b) bVar.f1423d).f4a;
        float f11 = bVar.f1424e;
        float f12 = bVar.f1425f;
        float f13 = bVar.f1426g;
        I1.b bVar2 = this.f24318f;
        bVar2.f1421a = f9;
        bVar2.b = f10;
        bVar2.f1422c = str;
        bVar2.f1423d = str2;
        bVar2.f1424e = f11;
        bVar2.f1425f = f12;
        bVar2.f1426g = f13;
        String str3 = (String) this.f24319g.s(bVar2);
        if (bVar.f1425f == 1.0f) {
            obj = bVar.f1423d;
        } else {
            obj = bVar.f1422c;
        }
        A1.b bVar3 = (A1.b) obj;
        String str4 = bVar3.b;
        float f14 = bVar3.f5c;
        int i9 = bVar3.f6d;
        int i10 = bVar3.f7e;
        float f15 = bVar3.f8f;
        float f16 = bVar3.f9g;
        int i11 = bVar3.f10h;
        int i12 = bVar3.f11i;
        float f17 = bVar3.f12j;
        boolean z8 = bVar3.f13k;
        PointF pointF = bVar3.l;
        PointF pointF2 = bVar3.m;
        A1.b bVar4 = this.f24320h;
        bVar4.f4a = str3;
        bVar4.b = str4;
        bVar4.f5c = f14;
        bVar4.f6d = i9;
        bVar4.f7e = i10;
        bVar4.f8f = f15;
        bVar4.f9g = f16;
        bVar4.f10h = i11;
        bVar4.f11i = i12;
        bVar4.f12j = f17;
        bVar4.f13k = z8;
        bVar4.l = pointF;
        bVar4.m = pointF2;
        return bVar4;
    }
}
