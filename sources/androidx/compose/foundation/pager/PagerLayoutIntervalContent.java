package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import q0.l;
import q0.r;

/* loaded from: classes2.dex */
final class PagerLayoutIntervalContent extends LazyLayoutIntervalContent<PagerIntervalContent> {

    /* renamed from: a, reason: collision with root package name */
    public final r f5194a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableIntervalList f5195b;

    public PagerLayoutIntervalContent(r rVar, l lVar, int i2) {
        this.f5194a = rVar;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.a(i2, new PagerIntervalContent(lVar, rVar));
        this.f5195b = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final MutableIntervalList h() {
        return this.f5195b;
    }
}
