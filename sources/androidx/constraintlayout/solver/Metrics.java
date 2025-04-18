package androidx.constraintlayout.solver;

import android.support.v4.media.d;

/* loaded from: classes4.dex */
public class Metrics {

    /* renamed from: a, reason: collision with root package name */
    public long f17931a;

    /* renamed from: b, reason: collision with root package name */
    public long f17932b;

    /* renamed from: c, reason: collision with root package name */
    public long f17933c;
    public long d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f17934f;

    /* renamed from: g, reason: collision with root package name */
    public long f17935g;

    /* renamed from: h, reason: collision with root package name */
    public long f17936h;

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n*** Metrics ***\nmeasures: ");
        sb.append(this.f17931a);
        sb.append("\nmeasuresWrap: 0\nmeasuresWrapInfeasible: 0\ndetermineGroups: 0\ninfeasibleDetermineGroups: 0\ngraphOptimizer: ");
        sb.append(this.f17933c);
        sb.append("\nwidgets: ");
        sb.append(this.f17936h);
        sb.append("\ngraphSolved: ");
        sb.append(this.d);
        sb.append("\nlinearSolved: ");
        return d.p(sb, this.e, "\n");
    }
}
