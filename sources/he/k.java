package he;

import android.util.Range;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class k implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19058b;

    public k(boolean z10) {
        this.f19058b = z10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Range range = (Range) obj;
        Range range2 = (Range) obj2;
        if (this.f19058b) {
            return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) - (((Integer) range2.getUpper()).intValue() - ((Integer) range2.getLower()).intValue());
        }
        return (((Integer) range2.getUpper()).intValue() - ((Integer) range2.getLower()).intValue()) - (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue());
    }
}
