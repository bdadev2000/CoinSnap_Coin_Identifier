package n0;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class k1 implements Sequence {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f22306b;

    public /* synthetic */ k1(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.f22306b = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i10 = this.a;
        ViewGroup viewGroup = this.f22306b;
        switch (i10) {
            case 0:
                return new m1(viewGroup);
            default:
                return new h0(new k1(viewGroup, 0).iterator(), l1.f22308c);
        }
    }
}
