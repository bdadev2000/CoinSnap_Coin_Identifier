package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, r0.a {

    /* renamed from: b, reason: collision with root package name */
    public int f13990b;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f13992f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13993g;

    /* renamed from: h, reason: collision with root package name */
    public int f13994h;

    /* renamed from: j, reason: collision with root package name */
    public HashMap f13996j;

    /* renamed from: k, reason: collision with root package name */
    public MutableIntObjectMap f13997k;

    /* renamed from: a, reason: collision with root package name */
    public int[] f13989a = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public Object[] f13991c = new Object[0];

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f13995i = new ArrayList();

    public final int b(Anchor anchor) {
        if (!(!this.f13993g)) {
            ComposerKt.c("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (anchor.a()) {
            return anchor.f13675a;
        }
        PreconditionsKt.a("Anchor refers to a group that was removed");
        throw null;
    }

    public final void c() {
        this.f13996j = new HashMap();
    }

    public final SlotReader d() {
        if (this.f13993g) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f13992f++;
        return new SlotReader(this);
    }

    public final SlotWriter e() {
        if (!(!this.f13993g)) {
            ComposerKt.c("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (!(this.f13992f <= 0)) {
            ComposerKt.c("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f13993g = true;
        this.f13994h++;
        return new SlotWriter(this);
    }

    public final boolean f(Anchor anchor) {
        int n2;
        return anchor.a() && (n2 = SlotTableKt.n(this.f13995i, anchor.f13675a, this.f13990b)) >= 0 && p0.a.g(this.f13995i.get(n2), anchor);
    }

    @Override // java.lang.Iterable
    public final Iterator<CompositionGroup> iterator() {
        return new GroupIterator(0, this.f13990b, this);
    }
}
