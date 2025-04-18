package z8;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import s7.r0;

/* loaded from: classes3.dex */
public final class l extends m {

    /* renamed from: j, reason: collision with root package name */
    public final String f28632j;

    /* renamed from: k, reason: collision with root package name */
    public final j f28633k;

    /* renamed from: l, reason: collision with root package name */
    public final fb.c f28634l;

    public l(long j3, r0 r0Var, com.google.common.collect.r0 r0Var2, r rVar, ArrayList arrayList, List list, List list2) {
        super(r0Var, r0Var2, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) r0Var2.get(0)).a);
        long j10 = rVar.f28654e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(null, rVar.f28653d, j10);
        }
        this.f28633k = jVar;
        this.f28632j = null;
        this.f28634l = jVar == null ? new fb.c(new j(null, 0L, -1L), 26) : null;
    }

    @Override // z8.m
    public final String a() {
        return this.f28632j;
    }

    @Override // z8.m
    public final y8.i b() {
        return this.f28634l;
    }

    @Override // z8.m
    public final j c() {
        return this.f28633k;
    }
}
