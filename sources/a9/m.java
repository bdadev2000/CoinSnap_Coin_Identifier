package a9;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class m extends w7.j implements h {

    /* renamed from: f, reason: collision with root package name */
    public h f404f;

    /* renamed from: g, reason: collision with root package name */
    public long f405g;

    public final void f(long j3, h hVar, long j10) {
        this.f26896d = j3;
        this.f404f = hVar;
        if (j10 != Long.MAX_VALUE) {
            j3 = j10;
        }
        this.f405g = j3;
    }

    @Override // a9.h
    public final List getCues(long j3) {
        h hVar = this.f404f;
        hVar.getClass();
        return hVar.getCues(j3 - this.f405g);
    }

    @Override // a9.h
    public final long getEventTime(int i10) {
        h hVar = this.f404f;
        hVar.getClass();
        return hVar.getEventTime(i10) + this.f405g;
    }

    @Override // a9.h
    public final int getEventTimeCount() {
        h hVar = this.f404f;
        hVar.getClass();
        return hVar.getEventTimeCount();
    }

    @Override // a9.h
    public final int getNextEventTimeIndex(long j3) {
        h hVar = this.f404f;
        hVar.getClass();
        return hVar.getNextEventTimeIndex(j3 - this.f405g);
    }
}
