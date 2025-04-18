package v8;

import java.util.List;

/* loaded from: classes3.dex */
public final class e0 implements k9.q {
    public final k9.q a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f26102b;

    public e0(k9.q qVar, i1 i1Var) {
        this.a = qVar;
        this.f26102b = i1Var;
    }

    @Override // k9.q
    public final boolean a(int i10, long j3) {
        return this.a.a(i10, j3);
    }

    @Override // k9.q
    public final int b(s7.r0 r0Var) {
        return this.a.b(r0Var);
    }

    @Override // k9.q
    public final boolean c(int i10, long j3) {
        return this.a.c(i10, j3);
    }

    @Override // k9.q
    public final void d() {
        this.a.d();
    }

    @Override // k9.q
    public final void disable() {
        this.a.disable();
    }

    @Override // k9.q
    public final void e(boolean z10) {
        this.a.e(z10);
    }

    @Override // k9.q
    public final void enable() {
        this.a.enable();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.a.equals(e0Var.a) && this.f26102b.equals(e0Var.f26102b)) {
            return true;
        }
        return false;
    }

    @Override // k9.q
    public final int evaluateQueueSize(long j3, List list) {
        return this.a.evaluateQueueSize(j3, list);
    }

    @Override // k9.q
    public final void f(long j3, long j10, long j11, List list, x8.m[] mVarArr) {
        this.a.f(j3, j10, j11, list, mVarArr);
    }

    @Override // k9.q
    public final boolean g(long j3, x8.e eVar, List list) {
        return this.a.g(j3, eVar, list);
    }

    @Override // k9.q
    public final s7.r0 getFormat(int i10) {
        return this.a.getFormat(i10);
    }

    @Override // k9.q
    public final int getIndexInTrackGroup(int i10) {
        return this.a.getIndexInTrackGroup(i10);
    }

    @Override // k9.q
    public final s7.r0 getSelectedFormat() {
        return this.a.getSelectedFormat();
    }

    @Override // k9.q
    public final int getSelectedIndex() {
        return this.a.getSelectedIndex();
    }

    @Override // k9.q
    public final Object getSelectionData() {
        return this.a.getSelectionData();
    }

    @Override // k9.q
    public final int getSelectionReason() {
        return this.a.getSelectionReason();
    }

    @Override // k9.q
    public final i1 getTrackGroup() {
        return this.f26102b;
    }

    @Override // k9.q
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.f26102b.hashCode() + 527) * 31);
    }

    @Override // k9.q
    public final int indexOf(int i10) {
        return this.a.indexOf(i10);
    }

    @Override // k9.q
    public final int length() {
        return this.a.length();
    }

    @Override // k9.q
    public final void onPlaybackSpeed(float f10) {
        this.a.onPlaybackSpeed(f10);
    }
}
