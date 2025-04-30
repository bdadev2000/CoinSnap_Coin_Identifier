package C1;

import java.util.ArrayList;
import java.util.List;
import v1.v;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f433a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.a f434c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.a f435d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.a f436e;

    /* renamed from: f, reason: collision with root package name */
    public final B1.a f437f;

    /* renamed from: g, reason: collision with root package name */
    public final B1.b f438g;

    /* renamed from: h, reason: collision with root package name */
    public final int f439h;

    /* renamed from: i, reason: collision with root package name */
    public final int f440i;

    /* renamed from: j, reason: collision with root package name */
    public final float f441j;

    /* renamed from: k, reason: collision with root package name */
    public final List f442k;
    public final B1.b l;
    public final boolean m;

    public e(String str, int i9, B1.a aVar, B1.a aVar2, B1.a aVar3, B1.a aVar4, B1.b bVar, int i10, int i11, float f9, ArrayList arrayList, B1.b bVar2, boolean z8) {
        this.f433a = str;
        this.b = i9;
        this.f434c = aVar;
        this.f435d = aVar2;
        this.f436e = aVar3;
        this.f437f = aVar4;
        this.f438g = bVar;
        this.f439h = i10;
        this.f440i = i11;
        this.f441j = f9;
        this.f442k = arrayList;
        this.l = bVar2;
        this.m = z8;
    }

    @Override // C1.b
    public final x1.c a(v vVar, v1.i iVar, D1.b bVar) {
        return new x1.i(vVar, bVar, this);
    }
}
