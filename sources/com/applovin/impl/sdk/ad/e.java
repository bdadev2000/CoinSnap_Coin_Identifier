package com.applovin.impl.sdk.ad;

import androidx.arch.core.util.Function;
import com.applovin.impl.qq;
import com.applovin.impl.tl;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f26575c;

    public /* synthetic */ e(b bVar, int i2) {
        this.f26574b = i2;
        this.f26575c = bVar;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        List b2;
        List r2;
        List a2;
        List l2;
        List f2;
        Map c2;
        List i2;
        List e;
        qq q2;
        List a3;
        List d;
        List j2;
        List g2;
        int i3 = this.f26574b;
        b bVar = this.f26575c;
        switch (i3) {
            case 0:
                b2 = bVar.b((tl) obj);
                return b2;
            case 1:
                r2 = bVar.r((tl) obj);
                return r2;
            case 2:
                a2 = bVar.a((JSONArray) obj);
                return a2;
            case 3:
                l2 = bVar.l((tl) obj);
                return l2;
            case 4:
                f2 = bVar.f((tl) obj);
                return f2;
            case 5:
                c2 = bVar.c((tl) obj);
                return c2;
            case 6:
                i2 = bVar.i((tl) obj);
                return i2;
            case 7:
                e = bVar.e((tl) obj);
                return e;
            case 8:
                q2 = bVar.q((tl) obj);
                return q2;
            case 9:
                a3 = bVar.a((tl) obj);
                return a3;
            case 10:
                d = bVar.d((tl) obj);
                return d;
            case 11:
                j2 = bVar.j((tl) obj);
                return j2;
            default:
                g2 = bVar.g((tl) obj);
                return g2;
        }
    }
}
