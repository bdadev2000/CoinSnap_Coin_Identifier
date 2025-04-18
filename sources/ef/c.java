package ef;

import a6.k;
import android.graphics.RectF;
import com.bumptech.glide.e;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;
import wh.a0;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public float[] f17351e;

    /* renamed from: f, reason: collision with root package name */
    public final b f17352f;

    /* renamed from: g, reason: collision with root package name */
    public FloatBuffer f17353g;

    /* renamed from: h, reason: collision with root package name */
    public final b f17354h;

    /* renamed from: i, reason: collision with root package name */
    public final b f17355i;

    /* renamed from: j, reason: collision with root package name */
    public final b f17356j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f17357k;

    /* renamed from: l, reason: collision with root package name */
    public int f17358l;

    /* renamed from: m, reason: collision with root package name */
    public cf.a f17359m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, String name, String name2, String name3, String name4) {
        super(i10, new a0[0]);
        b bVar;
        Intrinsics.checkNotNullParameter(name, "vertexPositionName");
        Intrinsics.checkNotNullParameter(name2, "vertexMvpMatrixName");
        Intrinsics.checkNotNullParameter(name, "vertexPositionName");
        Intrinsics.checkNotNullParameter(name2, "vertexMvpMatrixName");
        this.f17351e = e.G(bf.c.a);
        b bVar2 = null;
        if (name4 == null) {
            bVar = null;
        } else {
            Intrinsics.checkNotNullParameter(name4, "name");
            Intrinsics.checkNotNullParameter(name4, "name");
            bVar = new b(this.a, 2, name4);
        }
        this.f17352f = bVar;
        this.f17353g = k.t(8);
        if (name3 != null) {
            Intrinsics.checkNotNullParameter(name3, "name");
            Intrinsics.checkNotNullParameter(name3, "name");
            bVar2 = new b(this.a, 1, name3);
        }
        this.f17354h = bVar2;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f17355i = new b(this.a, 1, name);
        Intrinsics.checkNotNullParameter(name2, "name");
        Intrinsics.checkNotNullParameter(name2, "name");
        this.f17356j = new b(this.a, 2, name2);
        this.f17357k = new RectF();
        this.f17358l = -1;
    }
}
