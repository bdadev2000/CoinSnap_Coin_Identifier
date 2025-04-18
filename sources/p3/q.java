package p3;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class q extends h.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z3.b f23395h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h.c f23396i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r3.b f23397j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z3.b bVar, h.c cVar, r3.b bVar2) {
        super(12, 0);
        this.f23395h = bVar;
        this.f23396i = cVar;
        this.f23397j = bVar2;
    }

    @Override // h.c
    public final Object z(z3.b bVar) {
        Object obj;
        float f10 = bVar.a;
        float f11 = bVar.f28487b;
        String str = ((r3.b) bVar.f28488c).a;
        String str2 = ((r3.b) bVar.f28489d).a;
        float f12 = bVar.f28490e;
        float f13 = bVar.f28491f;
        float f14 = bVar.f28492g;
        z3.b bVar2 = this.f23395h;
        bVar2.a = f10;
        bVar2.f28487b = f11;
        bVar2.f28488c = str;
        bVar2.f28489d = str2;
        bVar2.f28490e = f12;
        bVar2.f28491f = f13;
        bVar2.f28492g = f14;
        String str3 = (String) this.f23396i.z(bVar2);
        if (bVar.f28491f == 1.0f) {
            obj = bVar.f28489d;
        } else {
            obj = bVar.f28488c;
        }
        r3.b bVar3 = (r3.b) obj;
        String str4 = bVar3.f23971b;
        float f15 = bVar3.f23972c;
        int i10 = bVar3.f23973d;
        int i11 = bVar3.f23974e;
        float f16 = bVar3.f23975f;
        float f17 = bVar3.f23976g;
        int i12 = bVar3.f23977h;
        int i13 = bVar3.f23978i;
        float f18 = bVar3.f23979j;
        boolean z10 = bVar3.f23980k;
        PointF pointF = bVar3.f23981l;
        PointF pointF2 = bVar3.f23982m;
        r3.b bVar4 = this.f23397j;
        bVar4.a = str3;
        bVar4.f23971b = str4;
        bVar4.f23972c = f15;
        bVar4.f23973d = i10;
        bVar4.f23974e = i11;
        bVar4.f23975f = f16;
        bVar4.f23976g = f17;
        bVar4.f23977h = i12;
        bVar4.f23978i = i13;
        bVar4.f23979j = f18;
        bVar4.f23980k = z10;
        bVar4.f23981l = pointF;
        bVar4.f23982m = pointF2;
        return bVar4;
    }
}
